package defpackage;

import com.blaze.blazesdk.ads.models.dto.AdInfoDto;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.closed_captions.models.dto.ClosedCaptionsDto;
import com.blaze.blazesdk.database.BlazeDatabase;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.features.videos.models.dto.VideoDto;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class asl {
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0159, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(List list, AdInfoDto adInfoDto) {
        Date date;
        Date date2;
        boolean z;
        Iterator it;
        VideoDto videoDto;
        int i;
        Map map;
        BlazeAdInfoModel blazeAdInfoModel;
        BlazeAdInfoModel k;
        uul uulVar;
        List<ClosedCaptionsDto> closedCaptions;
        AdInfoDto adInfo;
        Map<String, String> extraInfo;
        VideoDto videoDto2;
        Pair pair;
        bsl videosLikedDao;
        String id;
        Integer likes;
        Double duration;
        String description;
        String subtitle;
        String title;
        String id2;
        if (list == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            VideoDto videoDto3 = (VideoDto) it2.next();
            String str = "";
            String str2 = (videoDto3 == null || (id2 = videoDto3.getId()) == null) ? "" : id2;
            String str3 = (videoDto3 == null || (title = videoDto3.getTitle()) == null) ? "" : title;
            String str4 = (videoDto3 == null || (subtitle = videoDto3.getSubtitle()) == null) ? "" : subtitle;
            String str5 = (videoDto3 == null || (description = videoDto3.getDescription()) == null) ? "" : description;
            double doubleValue = (videoDto3 == null || (duration = videoDto3.getDuration()) == null) ? 0.0d : duration.doubleValue();
            trm q = jaa.q(videoDto3 != null ? videoDto3.getPoster() : null);
            List a = ohm.a(videoDto3 != null ? videoDto3.getThumbnails() : null);
            i a2 = szl.a(videoDto3 != null ? videoDto3.getCta() : null);
            rvl s = x2a.s(videoDto3 != null ? videoDto3.getBaseLayer() : null, n3m.HLS);
            if (videoDto3 == null || (date = videoDto3.getUpdateTime()) == null) {
                date = new Date();
            }
            Date date3 = date;
            if (videoDto3 == null || (date2 = videoDto3.getCreateTime()) == null) {
                date2 = new Date();
            }
            Date date4 = date2;
            int intValue = (videoDto3 == null || (likes = videoDto3.getLikes()) == null) ? 0 : likes.intValue();
            BlazeDatabase instance = BlazeDatabase.INSTANCE.instance();
            if (instance == null || (videosLikedDao = instance.getVideosLikedDao()) == null) {
                z = false;
            } else {
                if (videoDto3 != null && (id = videoDto3.getId()) != null) {
                    str = id;
                }
                z = videosLikedDao.d(str);
            }
            InteractionModel a3 = msl.a(videoDto3 != null ? videoDto3.getInteraction() : null);
            List<String> geoRestriction = videoDto3 != null ? videoDto3.getGeoRestriction() : null;
            if (videoDto3 == null || (extraInfo = videoDto3.getExtraInfo()) == null) {
                it = it2;
                videoDto = videoDto3;
                i = 0;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry<String, String> entry : extraInfo.entrySet()) {
                    String key = entry.getKey();
                    Iterator it3 = it2;
                    String value = entry.getValue();
                    if (key == null || value == null) {
                        videoDto2 = videoDto3;
                        pair = null;
                    } else {
                        videoDto2 = videoDto3;
                        pair = new Pair(key, value);
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                    videoDto3 = videoDto2;
                    it2 = it3;
                }
                it = it2;
                videoDto = videoDto3;
                i = 0;
                map = tub.o(arrayList2);
            }
            map = lm5.a;
            map.getClass();
            Map map2 = map;
            BlazeAdInfoModel k2 = adInfoDto != null ? t6a.k(adInfoDto) : null;
            if (videoDto == null || (adInfo = videoDto.getAdInfo()) == null || (k = t6a.k(adInfo)) == null) {
                if (adInfoDto != null) {
                    k = t6a.k(adInfoDto);
                } else {
                    blazeAdInfoModel = null;
                    ArrayList j = (videoDto != null || (closedCaptions = videoDto.getClosedCaptions()) == null) ? null : d2a.j(closedCaptions);
                    tul tulVar = jdm.d;
                    arrayList.add(new VideoModel(str2, str3, str4, str5, doubleValue, q, a2, s, date3, null, a, date4, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(i), a3, geoRestriction, map2, k2, blazeAdInfoModel, null, null, videoDto == null ? videoDto.getRetrievedLanguages() : null, z, intValue, j, (tulVar != null || (uulVar = tulVar.a) == null) ? i : uulVar.n));
                    it2 = it;
                }
            }
            blazeAdInfoModel = k;
            if (videoDto != null) {
            }
            tul tulVar2 = jdm.d;
            if (tulVar2 != null) {
            }
            arrayList.add(new VideoModel(str2, str3, str4, str5, doubleValue, q, a2, s, date3, null, a, date4, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.valueOf(i), a3, geoRestriction, map2, k2, blazeAdInfoModel, null, null, videoDto == null ? videoDto.getRetrievedLanguages() : null, z, intValue, j, (tulVar2 != null || (uulVar = tulVar2.a) == null) ? i : uulVar.n));
            it2 = it;
        }
        return arrayList;
    }
}
