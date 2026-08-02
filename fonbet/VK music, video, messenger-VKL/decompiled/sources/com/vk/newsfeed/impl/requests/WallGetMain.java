package com.vk.newsfeed.impl.requests;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.parsers.BadgesParsers;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.bis;
import xsna.ce60;
import xsna.ck90;
import xsna.hd60;
import xsna.rsg0;
import xsna.tci;
import xsna.vj90;
import xsna.zeq0;

/* compiled from: WallGetMain.kt */
/* loaded from: classes4.dex */
public final class WallGetMain extends rsg0<Result> {

    /* compiled from: WallGetMain.kt */
    public static final class Result extends VKFromList<NewsEntry> {
        public static final Result b = new Result("");
        private final String nextFrom;

        public Result(String str) {
            super(str);
            this.nextFrom = str;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof NewsEntry) {
                return super.contains((NewsEntry) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof NewsEntry) {
                return super.indexOf((NewsEntry) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof NewsEntry) {
                return super.lastIndexOf((NewsEntry) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof NewsEntry) {
                return super.remove((NewsEntry) obj);
            }
            return false;
        }

        @Override // com.vk.dto.common.data.VKFromList
        public final String s1() {
            return this.nextFrom;
        }
    }

    public WallGetMain(UserId userId, int i, String str, String str2, String str3, boolean z) {
        super("owners.getMainTab");
        F(userId, "owner_id");
        C(i, "count");
        K("fields", "photo_base,sex,first_name_dat,last_name_dat,video_files,verified,trending,friend_status,first_name_gen,first_name_acc,emoji_status,image_status,can_write_private_message,can_message,has_unseen_stories,is_government_organization,is_verified,last_name_gen,deactivated,url,trust_mark,followers_count,members_count");
        K("ref", str);
        K("start_from", str2);
        K("device_info", zeq0.a());
        K("connection_type", com.vk.core.utils.newtork.b.c().b());
        K("connection_subtype", com.vk.core.utils.newtork.b.c().a());
        K("user_options", zeq0.e());
        K("track_code", str3);
        ArrayList arrayList = new ArrayList();
        if (!ce60.b.c() ? false : !TextUtils.isEmpty(hd60.a().a().m())) {
            arrayList.add("ads_applovin");
        }
        if (z) {
            arrayList.add("ads_yandex");
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        K("filters", zeq0.d(hd60.a().a1(), (String[]) Arrays.copyOf(strArr, strArr.length)));
    }

    @Override // xsna.oer0, xsna.k7r0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final Result a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            if (optJSONObject == null) {
                JSONObject jSONObject2 = jSONObject.getJSONArray("execute_errors").getJSONObject(0);
                throw new VKApiExecutionException(jSONObject2.getInt("error_code"), this.b, false, jSONObject2.getString(SharedKt.PARAM_ERROR_MSG), null, null, null, null, 0, null, null, null, 4080);
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("items");
            Result result = new Result(optJSONObject.optString("next_from"));
            Map<UserId, Owner> e = vj90.e(optJSONObject);
            ArrayMap<String, ReactionSet> r = tci.r(optJSONObject);
            SparseArray<BadgeItem> b = BadgesParsers.b(optJSONObject);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("fixed");
            SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
            smbAdFeatures.getClass();
            boolean a = com.vk.toggle.b.A.a(smbAdFeatures);
            if (optJSONObject2 != null) {
                com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
                try {
                    NewsEntry a2 = aVar.a(optJSONObject2.optString("type"), optJSONObject2, r, b, e, a, new ck90());
                    if (a2 != null) {
                        result.add(a2);
                    }
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            }
            bis.j(optJSONArray, e, r, b, result);
            return result;
        } catch (Exception e3) {
            L.C("vk", e3);
            if (e3 instanceof VKApiExecutionException) {
                throw e3;
            }
            return Result.b;
        }
    }
}
