package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class F implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final String f11838a = "request_state";

    /* renamed from: b, reason: collision with root package name */
    public final String f11839b = "type";

    /* renamed from: c, reason: collision with root package name */
    public final String f11840c = "last_attempt";

    /* renamed from: d, reason: collision with root package name */
    public final String f11841d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.e0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(@Nullable List<E> list) {
        ?? r22;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f11838a;
        if (list != null) {
            r22 = new ArrayList(kotlin.collections.v.k(list, 10));
            for (E e7 : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f11839b, e7.f11835a);
                    jSONObject.put(this.f11840c, e7.f11836b);
                    jSONObject.put(this.f11841d, z.a(e7.f11837c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r22.add(jSONObject);
            }
        } else {
            r22 = e0.f19204a;
        }
        jSONObject2.put(str, new JSONArray((Collection) r22));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<E> toModel(@Nullable String str) {
        JSONArray optJSONArray;
        E e7;
        int i5;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.f11838a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    try {
                        String string = optJSONObject.getString(this.f11839b);
                        long j = optJSONObject.getLong(this.f11840c);
                        String string2 = optJSONObject.getString(this.f11841d);
                        int[] b10 = A.b(4);
                        int length2 = b10.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length2) {
                                i5 = 0;
                                break;
                            }
                            i5 = b10[i11];
                            if (Intrinsics.areEqual(z.a(i5), string2)) {
                                break;
                            }
                            i11++;
                        }
                        if (i5 == 0) {
                            i5 = 1;
                        }
                        e7 = new E(string, j, i5);
                    } catch (Throwable unused) {
                        e7 = null;
                    }
                    if (e7 != null) {
                        arrayList.add(e7);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return e0.f19204a;
        }
    }
}
