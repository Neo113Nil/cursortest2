package com.vk.dto.stories.model;

import android.util.ArrayMap;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.stories.entities.PromoData;
import com.vk.dto.stories.model.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.j5g;
import xsna.jgp;

/* compiled from: StoriesContainerFactory.kt */
/* loaded from: classes18.dex */
public final class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final StoriesContainer a(JSONObject jSONObject, HashMap hashMap, HashMap hashMap2, ArrayMap arrayMap) {
        PromoData promoData;
        Iterable iterable;
        Iterator it;
        String optString = jSONObject.optString("type");
        PromoData promoData2 = null;
        ?? r1 = 0;
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1884266413:
                    if (optString.equals("stories")) {
                        Serializer.c<StoriesContainer> cVar = SimpleStoriesContainer.CREATOR;
                        b.a a = b.a(jSONObject, hashMap, hashMap2, arrayMap);
                        return new SimpleStoriesContainer(a.a, a.b, a.c, a.d);
                    }
                    break;
                case -1566824007:
                    if (optString.equals("live_active")) {
                        Serializer.c<LiveActiveStoriesContainer> cVar2 = LiveActiveStoriesContainer.CREATOR;
                        b.a a2 = b.a(jSONObject, hashMap, hashMap2, arrayMap);
                        return new LiveActiveStoriesContainer(a2.a, a2.b, a2.c, a2.d);
                    }
                    break;
                case -1497003419:
                    if (optString.equals("live_finished")) {
                        Serializer.c<LiveFinishedStoriesContainer> cVar3 = LiveFinishedStoriesContainer.CREATOR;
                        b.a a3 = b.a(jSONObject, hashMap, hashMap2, arrayMap);
                        return new LiveFinishedStoriesContainer(a3.a, a3.b, a3.c, a3.d);
                    }
                    break;
                case -1094102749:
                    if (optString.equals("promo_stories")) {
                        Serializer.c<PromoStoriesContainer> cVar4 = PromoStoriesContainer.CREATOR;
                        b.a a4 = b.a(jSONObject, hashMap, hashMap2, arrayMap);
                        ?? r6 = a4.b;
                        Serializer.c<PromoData> cVar5 = PromoData.CREATOR;
                        JSONObject optJSONObject = jSONObject.optJSONObject("promo_data");
                        if (optJSONObject != null) {
                            String optString2 = optJSONObject.optString("name");
                            Serializer.c<Image> cVar6 = Image.CREATOR;
                            Image b = Image.b.b(optJSONObject);
                            boolean optBoolean = optJSONObject.optBoolean("not_animated");
                            if (optString2 != null && b != null) {
                                promoData = new PromoData(optString2, b, optBoolean);
                                PromoStoriesContainer promoStoriesContainer = new PromoStoriesContainer(a4.a, r6, a4.c, a4.d, promoData, a4.e);
                                iterable = (Iterable) r6;
                                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                    it = iterable.iterator();
                                    while (it.hasNext()) {
                                        if (!((StoryEntry) it.next()).N) {
                                            promoStoriesContainer.p = promoData2;
                                            return promoStoriesContainer;
                                        }
                                    }
                                }
                                promoData2 = promoData;
                                promoStoriesContainer.p = promoData2;
                                return promoStoriesContainer;
                            }
                        }
                        promoData = null;
                        PromoStoriesContainer promoStoriesContainer2 = new PromoStoriesContainer(a4.a, r6, a4.c, a4.d, promoData, a4.e);
                        iterable = (Iterable) r6;
                        if (iterable instanceof Collection) {
                        }
                        it = iterable.iterator();
                        while (it.hasNext()) {
                        }
                        promoData2 = promoData;
                        promoStoriesContainer2.p = promoData2;
                        return promoStoriesContainer2;
                    }
                    break;
                case 273184745:
                    if (optString.equals("discover")) {
                        Serializer.c<DiscoverStoriesContainer> cVar7 = DiscoverStoriesContainer.CREATOR;
                        String string = jSONObject.getString("track_code");
                        String string2 = jSONObject.getString("name");
                        jgp jgpVar = jgp.b;
                        b.a a5 = b.a(jSONObject, jgpVar, jgpVar, jgpVar);
                        return new DiscoverStoriesContainer(string, string2, a5.d, a5.c);
                    }
                    break;
                case 602117716:
                    if (optString.equals("app_grouped_stories")) {
                        Serializer.c<AppGroupedStoriesContainer> cVar8 = AppGroupedStoriesContainer.CREATOR;
                        b.a a6 = b.a(jSONObject, hashMap, hashMap2, arrayMap);
                        JSONArray optJSONArray = jSONObject.optJSONArray("grouped");
                        if (optJSONArray != null) {
                            r1 = new ArrayList(optJSONArray.length());
                            int length = optJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                r1.add(a(optJSONArray.getJSONObject(i), hashMap, hashMap2, arrayMap));
                            }
                        }
                        if (r1 == 0) {
                            r1 = EmptyList.b;
                        }
                        return new AppGroupedStoriesContainer(a6.a, a6.b, a6.c, a6.d, j5g.V((Iterable) r1), new ApiApplication(jSONObject.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP)));
                    }
                    break;
            }
        }
        return null;
    }
}
