package com.vk.api.friends;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.kci;
import xsna.rsg0;

/* loaded from: classes14.dex */
public final class FriendsGetRecommendations extends rsg0<Result> {
    public final String s;

    public static class Result extends VKFromList<RecommendedProfile> {

        @Nullable
        public ProfilesRecommendations.InfoCard infoCard;
        public String title;

        @Nullable
        public String trackCode;
    }

    public FriendsGetRecommendations(String str, String str2, int i) {
        super("friends.getRecommendations");
        this.s = str;
        K("block_type", str);
        if (!TextUtils.isEmpty(str2)) {
            K("start_from", str2);
        }
        C(i, "count");
        K("fields", "photo_base,crop_photo,verified,trending,has_unseen_stories,is_verified,social_button_type,friend_status");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(@NonNull JSONObject jSONObject) throws Exception, VKApiExecutionException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        Result result = new Result(jSONObject2.optString("next_from"));
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        for (int i = 0; i < jSONArray.length(); i++) {
            result.add(kci.d(this.s, jSONArray.getJSONObject(i)));
        }
        result.title = jSONObject2.optString("title");
        if (jSONObject2.has("track_code")) {
            result.trackCode = jSONObject2.optString("track_code");
        }
        if (jSONObject2.has("info_card")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("info_card");
            Serializer.c<ProfilesRecommendations.InfoCard> cVar = ProfilesRecommendations.InfoCard.CREATOR;
            result.infoCard = ProfilesRecommendations.InfoCard.a.a(jSONObject3);
        }
        return result;
    }
}
