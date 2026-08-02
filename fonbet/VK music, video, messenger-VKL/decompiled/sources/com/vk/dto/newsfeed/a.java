package com.vk.dto.newsfeed;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.parsers.BadgesParsers;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.parse.NewsfeedParseException;
import com.vk.toggle.b;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.f370;
import xsna.izs;
import xsna.qus;
import xsna.tci;
import xsna.vj90;
import xsna.yj90;
import xsna.zj90;

/* compiled from: NewsfeedParsers.kt */
/* loaded from: classes18.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(JSONObject jSONObject, ArrayList arrayList, yj90 yj90Var, ArrayMap arrayMap) {
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return;
        }
        final Map e = vj90.e(jSONObject);
        if (arrayMap == null) {
            arrayMap = tci.r(jSONObject);
        }
        final ArrayMap arrayMap2 = arrayMap;
        final SparseArray<BadgeItem> b = BadgesParsers.b(jSONObject);
        final com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
        smbAdFeatures.getClass();
        final boolean a = b.A.a(smbAdFeatures);
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            final JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            try {
                NewsEntry a2 = yj90Var.a(f370.A("type", jSONObject2), new izs() { // from class: xsna.hv60
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        JSONObject jSONObject3 = jSONObject2;
                        String optString = jSONObject3.optString("type");
                        return com.vk.dto.newsfeed.entries.a.this.a(optString, jSONObject3, arrayMap2, b, e, a, (ak90) obj);
                    }
                });
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(new NewsfeedParseException(th));
            }
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        com.vk.dto.newsfeed.entries.a.d(ref$ObjectRef, ref$IntRef, arrayList, 0);
        int size = arrayList.size();
        Post post = null;
        for (int i2 = 0; i2 < size; i2++) {
            NewsEntry newsEntry = (NewsEntry) arrayList.get(i2);
            if (newsEntry instanceof Post) {
                post = (Post) newsEntry;
                if (i2 == ref$IntRef.element) {
                    com.vk.dto.newsfeed.entries.a.d(ref$ObjectRef, ref$IntRef, arrayList, i2 + 1);
                }
            } else if ((newsEntry instanceof OptionalNativeAdEntry) && (post != null || ref$ObjectRef.element != 0)) {
                ArrayList arrayList2 = new ArrayList();
                if (post != null) {
                    arrayList2.add(aVar.e(post));
                }
                Post post2 = (Post) ref$ObjectRef.element;
                if (post2 != null) {
                    arrayList2.add(aVar.e(post2));
                }
                OptionalNativeAdEntry Eb = OptionalNativeAdEntry.Eb((OptionalNativeAdEntry) newsEntry, null, arrayList2, null, 55);
                Eb.e = newsEntry.e;
                Eb.c = newsEntry.c;
                Eb.g = newsEntry.g;
                Eb.h = newsEntry.h;
                arrayList.set(i2, Eb);
            }
        }
    }

    public static void b(JSONObject jSONObject, String str, List list, qus qusVar, int i) {
        final String optString;
        if ((i & 2) != 0) {
            str = null;
        }
        yj90 yj90Var = qusVar;
        if ((i & 8) != 0) {
            yj90Var = new zj90();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return;
        }
        final Map e = vj90.e(jSONObject);
        final ArrayMap r = tci.r(jSONObject);
        final SparseArray<BadgeItem> b = BadgesParsers.b(jSONObject);
        final com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
        smbAdFeatures.getClass();
        final boolean a = b.A.a(smbAdFeatures);
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            final JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            if (str == null) {
                try {
                    optString = jSONObject2.optString("type", jSONObject2.optString("post_type"));
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(new NewsfeedParseException(th));
                }
            } else {
                optString = str;
            }
            NewsEntry a2 = yj90Var.a(optString, new izs() { // from class: xsna.iv60
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    return com.vk.dto.newsfeed.entries.a.this.a(optString, jSONObject2, r, b, e, a, (ak90) obj);
                }
            });
            if (a2 != null) {
                list.add(a2);
            }
        }
    }
}
