package defpackage;

import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.closed_captions.models.dto.ClosedCaptionsDto;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.features.moments.models.dto.MomentsDto;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.shared.models.shared_models.FollowEntityDto;
import com.blaze.blazesdk.features.shared.models.shared_models.FollowEntityTypeDto;
import com.blaze.blazesdk.features.shared.models.shared_models.StorageFileDto;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class erl {
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        if (r3 == null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(List list, AdInfoDto adInfoDto, String str) {
        Iterator it;
        MomentModel momentModel;
        boolean z;
        int i;
        ArrayList arrayList;
        Map map;
        ArrayList arrayList2;
        umm ummVar;
        uul uulVar;
        frl momentsLikedDao;
        if (list == null) {
            return km5.a;
        }
        int i2 = 10;
        ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            MomentsDto momentsDto = (MomentsDto) next;
            if (momentsDto != null) {
                String id = momentsDto.getId();
                String str2 = id == null ? "" : id;
                String title = momentsDto.getTitle();
                String str3 = title == null ? "" : title;
                String subtitle = momentsDto.getSubtitle();
                String str4 = subtitle == null ? "" : subtitle;
                String description = momentsDto.getDescription();
                String str5 = description == null ? "" : description;
                Double duration = momentsDto.getDuration();
                double doubleValue = duration != null ? duration.doubleValue() : 0.0d;
                trm q = jaa.q(momentsDto.getPoster());
                List a = ohm.a(momentsDto.getThumbnails());
                i a2 = szl.a(momentsDto.getCta());
                rvl s = x2a.s(momentsDto.getBaseLayer(), n3m.MP4);
                Date updateTime = momentsDto.getUpdateTime();
                if (updateTime == null) {
                    updateTime = new Date();
                }
                Date date = updateTime;
                Date createTime = momentsDto.getCreateTime();
                if (createTime == null) {
                    createTime = new Date();
                }
                Date date2 = createTime;
                Integer likes = momentsDto.getLikes();
                int intValue = likes != null ? likes.intValue() : 0;
                BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
                if (instance == null || (momentsLikedDao = instance.getMomentsLikedDao()) == null) {
                    z = false;
                } else {
                    String id2 = momentsDto.getId();
                    z = momentsLikedDao.d(id2 != null ? id2 : "");
                }
                InteractionModel a3 = msl.a(momentsDto.getInteraction());
                List<ClosedCaptionsDto> closedCaptions = momentsDto.getClosedCaptions();
                ArrayList j = closedCaptions != null ? d2a.j(closedCaptions) : null;
                List<String> geoRestriction = momentsDto.getGeoRestriction();
                Map<String, String> extraInfo = momentsDto.getExtraInfo();
                if (extraInfo != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry<String, String> entry : extraInfo.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        Pair pair = (key == null || value == null) ? null : new Pair(key, value);
                        if (pair != null) {
                            arrayList4.add(pair);
                        }
                    }
                    i = 0;
                    arrayList = null;
                    map = tub.o(arrayList4);
                } else {
                    i = 0;
                    arrayList = null;
                }
                map = lm5.a;
                map.getClass();
                Map map2 = map;
                BlazeAdInfoModel k = adInfoDto != null ? t6a.k(adInfoDto) : arrayList;
                tul tulVar = jdm.d;
                int i5 = (tulVar == null || (uulVar = tulVar.a) == null) ? i : uulVar.l;
                List<FollowEntityDto> followEntities = momentsDto.getFollowEntities();
                if (followEntities != null) {
                    ArrayList arrayList5 = new ArrayList(k13.r(followEntities, i2));
                    for (FollowEntityDto followEntityDto : followEntities) {
                        followEntityDto.getClass();
                        StorageFileDto storageFile = followEntityDto.getStorageFile();
                        storageFile.getClass();
                        bvm bvmVar = new bvm(storageFile.getImageUrl());
                        FollowEntityTypeDto entityType = followEntityDto.getEntityType();
                        entityType.getClass();
                        int i6 = m3m.a[entityType.ordinal()];
                        Iterator it3 = it2;
                        if (i6 == 1) {
                            ummVar = umm.TEAM;
                        } else if (i6 == 2) {
                            ummVar = umm.PLAYER;
                        } else {
                            if (i6 != 3) {
                                zzl.b();
                                return arrayList;
                            }
                            ummVar = umm.PROPERTY;
                        }
                        arrayList5.add(new glm(bvmVar, ummVar, followEntityDto.getEntityId(), followEntityDto.getDescription()));
                        it2 = it3;
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = arrayList;
                }
                it = it2;
                MomentModel momentModel2 = new MomentModel(str2, str3, str4, str5, doubleValue, q, a2, s, date, null, a, date2, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(i), a3, geoRestriction, map2, k, arrayList2, str, momentsDto.getRetrievedLanguages(), z, intValue, j, i5);
                momentModel2.m = Integer.valueOf(i3);
                momentModel = momentModel2;
            } else {
                it = it2;
                momentModel = null;
            }
            arrayList3.add(momentModel);
            i3 = i4;
            it2 = it;
            i2 = 10;
        }
        return CollectionsKt.W(arrayList3);
    }
}
