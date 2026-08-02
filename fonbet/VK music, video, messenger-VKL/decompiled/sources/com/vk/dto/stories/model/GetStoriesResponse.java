package com.vk.dto.stories.model;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoriesAds;
import com.vk.dto.stories.model.ideas.StoryIdeasBlock;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.tci;

/* loaded from: classes18.dex */
public class GetStoriesResponse extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GetStoriesResponse> CREATOR = new a();
    public final int b;
    public final ArrayList<StoriesContainer> c;
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final StoriesAds f;

    @Nullable
    public final StoryIdeasBlock g;
    public boolean h;

    public class a extends Serializer.c<GetStoriesResponse> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GetStoriesResponse a(@NonNull Serializer serializer) {
            return new GetStoriesResponse(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GetStoriesResponse[i];
        }
    }

    public GetStoriesResponse() {
        this.c = new ArrayList<>();
        this.h = false;
        this.b = 0;
        this.f = null;
        this.d = null;
        this.e = null;
        this.g = null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.S(this.b);
        serializer.W(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.g);
    }

    public GetStoriesResponse(List<StoriesContainer> list, int i) {
        ArrayList<StoriesContainer> arrayList = new ArrayList<>();
        this.c = arrayList;
        this.h = false;
        arrayList.addAll(list);
        this.b = i;
        this.d = null;
        this.f = null;
        this.e = null;
        this.g = null;
    }

    public GetStoriesResponse(GetStoriesResponse getStoriesResponse) {
        ArrayList<StoriesContainer> arrayList = new ArrayList<>();
        this.c = arrayList;
        this.h = false;
        this.b = getStoriesResponse.b;
        arrayList.addAll(getStoriesResponse.c);
        this.f = getStoriesResponse.f;
        this.d = getStoriesResponse.d;
        this.e = null;
        this.h = getStoriesResponse.h;
        this.g = getStoriesResponse.g;
    }

    public GetStoriesResponse(int i, String str, List<StoriesContainer> list, StoriesAds storiesAds, @Nullable String str2, @Nullable StoryIdeasBlock storyIdeasBlock) {
        ArrayList<StoriesContainer> arrayList = new ArrayList<>();
        this.c = arrayList;
        this.h = false;
        this.b = i;
        this.d = str;
        arrayList.addAll(list);
        this.f = storiesAds;
        this.e = str2;
        this.g = storyIdeasBlock;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0115 A[LOOP:3: B:63:0x0115->B:69:0x0128, LOOP_START, PHI: r3
      0x0115: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:62:0x0112, B:69:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetStoriesResponse(JSONObject jSONObject) {
        StoriesAds.Settings settings;
        JSONArray optJSONArray;
        String optString;
        this.c = new ArrayList<>();
        this.h = false;
        if (jSONObject == null) {
            this.b = 0;
            this.f = null;
            this.d = null;
            this.e = null;
            this.g = null;
            return;
        }
        this.g = null;
        this.e = jSONObject.optString("track_code");
        this.b = jSONObject.optInt("count");
        this.d = jSONObject.optString("next_from");
        HashMap hashMap = new HashMap();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("profiles");
        if (optJSONArray2 != null) {
            for (int i = 0; i < optJSONArray2.length(); i++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    try {
                        UserProfile userProfile = new UserProfile(optJSONObject);
                        hashMap.put(userProfile.c, userProfile);
                    } catch (JSONException e) {
                        com.vk.metrics.eventtracking.b.a.a(e);
                    }
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("groups");
        if (optJSONArray3 != null) {
            for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    try {
                        Group group = new Group(optJSONObject2);
                        hashMap2.put(group.c, group);
                    } catch (Exception e2) {
                        com.vk.metrics.eventtracking.b.a.a(e2);
                    }
                }
            }
        }
        ArrayMap r = tci.r(jSONObject);
        JSONArray optJSONArray4 = jSONObject.optJSONArray("items");
        ArrayList<StoriesContainer> arrayList = this.c;
        if (optJSONArray4 != null) {
            for (int i3 = 0; i3 < optJSONArray4.length(); i3++) {
                StoriesContainer a2 = com.vk.dto.stories.model.a.a(optJSONArray4.optJSONObject(i3), hashMap, hashMap2, r);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        if (optJSONObject3 != null) {
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("settings");
            if (optJSONObject4 != null && (optString = optJSONObject4.optString("interval_type")) != null) {
                try {
                    settings = new StoriesAds.Settings(StoriesAds.Settings.IntervalType.valueOf(optString.toUpperCase(Locale.ROOT)), optJSONObject4.optInt("time_interval"), optJSONObject4.optInt("stories_interval"), optJSONObject4.optInt("authors_interval"), optJSONObject4.optInt("time_init"), optJSONObject4.optInt("stories_init"), optJSONObject4.optInt("authors_init"));
                } catch (IllegalArgumentException unused) {
                }
                ArrayList arrayList2 = new ArrayList();
                optJSONArray = optJSONObject3.optJSONArray("items");
                if (optJSONArray != null) {
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        StoriesContainer a3 = com.vk.dto.stories.model.a.a(optJSONArray.optJSONObject(i4), hashMap, hashMap2, r);
                        if (a3 != null) {
                            arrayList2.add(a3);
                        }
                    }
                }
                this.f = settings != null ? new StoriesAds(settings, arrayList2) : null;
                return;
            }
            settings = null;
            ArrayList arrayList22 = new ArrayList();
            optJSONArray = optJSONObject3.optJSONArray("items");
            if (optJSONArray != null) {
            }
            this.f = settings != null ? new StoriesAds(settings, arrayList22) : null;
            return;
        }
        this.f = null;
    }

    public GetStoriesResponse(Serializer serializer) {
        ArrayList<StoriesContainer> arrayList = new ArrayList<>();
        this.c = arrayList;
        this.h = false;
        this.f = null;
        this.b = serializer.u();
        ArrayList l = serializer.l(StoriesContainer.class.getClassLoader());
        if (l != null && !l.isEmpty()) {
            arrayList.addAll(l);
        }
        this.d = serializer.H();
        this.e = serializer.H();
        this.g = (StoryIdeasBlock) serializer.A(StoryIdeasBlock.class.getClassLoader());
    }
}
