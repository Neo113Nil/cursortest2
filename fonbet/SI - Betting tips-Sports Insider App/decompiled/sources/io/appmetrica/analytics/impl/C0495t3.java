package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495t3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0595x3 fromModel(@NotNull C0470s3 c0470s3) {
        C0595x3 c0595x3 = new C0595x3();
        c0595x3.f14892a = a(c0470s3.f14613a);
        int size = c0470s3.f14614b.size();
        C0520u3[] c0520u3Arr = new C0520u3[size];
        for (int i5 = 0; i5 < size; i5++) {
            c0520u3Arr[i5] = a((C0445r3) c0470s3.f14614b.get(i5));
        }
        c0595x3.f14893b = c0520u3Arr;
        return c0595x3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0470s3 toModel(@NotNull C0595x3 c0595x3) {
        C0520u3 c0520u3 = c0595x3.f14892a;
        if (c0520u3 == null) {
            c0520u3 = new C0520u3();
        }
        C0445r3 a7 = a(c0520u3);
        C0520u3[] c0520u3Arr = c0595x3.f14893b;
        ArrayList arrayList = new ArrayList(c0520u3Arr.length);
        for (C0520u3 c0520u32 : c0520u3Arr) {
            arrayList.add(a(c0520u32));
        }
        return new C0470s3(a7, arrayList);
    }

    public static C0520u3 a(C0445r3 c0445r3) {
        C0570w3 c0570w3;
        C0520u3 c0520u3 = new C0520u3();
        Map map = c0445r3.f14541a;
        int i5 = 0;
        if (map != null) {
            c0570w3 = new C0570w3();
            int size = map.size();
            C0545v3[] c0545v3Arr = new C0545v3[size];
            for (int i10 = 0; i10 < size; i10++) {
                c0545v3Arr[i10] = new C0545v3();
            }
            c0570w3.f14818a = c0545v3Arr;
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C0545v3 c0545v3 = c0570w3.f14818a[i11];
                c0545v3.f14767a = str;
                c0545v3.f14768b = str2;
                i11++;
            }
        } else {
            c0570w3 = null;
        }
        c0520u3.f14696a = c0570w3;
        int ordinal = c0445r3.f14542b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i5 = 2;
                if (ordinal != 2) {
                    i5 = 3;
                    if (ordinal != 3) {
                        throw new gf.m();
                    }
                }
            } else {
                i5 = 1;
            }
        }
        c0520u3.f14697b = i5;
        return c0520u3;
    }

    public static C0445r3 a(C0520u3 c0520u3) {
        LinkedHashMap linkedHashMap;
        S7 s72;
        C0570w3 c0570w3 = c0520u3.f14696a;
        if (c0570w3 != null) {
            C0545v3[] c0545v3Arr = c0570w3.f14818a;
            int a7 = kotlin.collections.m0.a(c0545v3Arr.length);
            if (a7 < 16) {
                a7 = 16;
            }
            linkedHashMap = new LinkedHashMap(a7);
            for (C0545v3 c0545v3 : c0545v3Arr) {
                linkedHashMap.put(c0545v3.f14767a, c0545v3.f14768b);
            }
        } else {
            linkedHashMap = null;
        }
        int i5 = c0520u3.f14697b;
        if (i5 == 0) {
            s72 = S7.f12861b;
        } else if (i5 == 1) {
            s72 = S7.f12862c;
        } else if (i5 == 2) {
            s72 = S7.f12863d;
        } else if (i5 != 3) {
            s72 = S7.f12861b;
        } else {
            s72 = S7.f12864e;
        }
        return new C0445r3(linkedHashMap, s72);
    }
}
