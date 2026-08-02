package org.chromium.net.httpflags;

import B0.A0;
import com.google.protobuf.ByteString;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.httpflags.BaseFeatureOverrides;
import org.chromium.net.httpflags.c;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: org.chromium.net.httpflags.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    static /* synthetic */ class C1336a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78704a;

        static {
            int[] iArr = new int[c.b.a.values().length];
            f78704a = iArr;
            try {
                iArr[c.b.a.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78704a[c.b.a.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78704a[c.b.a.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78704a[c.b.a.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78704a[c.b.a.BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes10.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f78705a;

        /* renamed from: b, reason: collision with root package name */
        public String f78706b;

        b() {
        }
    }

    private static void a(String str, c.b bVar, HashMap hashMap) {
        b bVar2;
        ByteString copyFrom;
        if (str.startsWith("ChromiumBaseFeature_")) {
            String substring = str.substring(20);
            b bVar3 = new b();
            int indexOf = substring.indexOf("_PARAM_");
            if (indexOf < 0) {
                bVar3.f78705a = substring;
            } else {
                bVar3.f78705a = substring.substring(0, indexOf);
                bVar3.f78706b = substring.substring(indexOf + 7);
            }
            bVar2 = bVar3;
        } else {
            bVar2 = null;
        }
        if (bVar2 == null) {
            return;
        }
        BaseFeatureOverrides.FeatureState.Builder builder = (BaseFeatureOverrides.FeatureState.Builder) hashMap.get(bVar2.f78705a);
        if (builder == null) {
            builder = BaseFeatureOverrides.FeatureState.newBuilder();
            hashMap.put(bVar2.f78705a, builder);
        }
        String str2 = bVar2.f78706b;
        if (str2 == null) {
            c.b.a h11 = bVar.h();
            if (h11 != c.b.a.BOOL) {
                throw new IllegalArgumentException(A0.b("HTTP flag has type ", String.valueOf(h11), ", but only boolean flags are supported as base::Feature overrides"));
            }
            builder.setEnabled(bVar.c());
            return;
        }
        c.b.a h12 = bVar.h();
        int i11 = C1336a.f78704a[h12.ordinal()];
        if (i11 == 1) {
            copyFrom = ByteString.copyFrom(bVar.c() ? "true" : "false", StandardCharsets.UTF_8);
        } else if (i11 == 2) {
            copyFrom = ByteString.copyFrom(Long.toString(bVar.f(), 10), StandardCharsets.UTF_8);
        } else if (i11 == 3) {
            copyFrom = ByteString.copyFrom(Float.toString(bVar.e()), StandardCharsets.UTF_8);
        } else if (i11 == 4) {
            copyFrom = ByteString.copyFrom(bVar.g(), StandardCharsets.UTF_8);
        } else {
            if (i11 != 5) {
                throw new UnsupportedOperationException(Sh.b.c("Unsupported HTTP flag value type for base::Feature param `", str2, "`: ", String.valueOf(h12)));
            }
            copyFrom = bVar.d();
        }
        builder.putParams(str2, copyFrom);
    }

    public static BaseFeatureOverrides b(c cVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, c.b> entry : cVar.b().entrySet()) {
            try {
                a(entry.getKey(), entry.getValue(), hashMap);
            } catch (RuntimeException e11) {
                throw new IllegalArgumentException(A0.b("Could not parse HTTP flag `", entry.getKey(), "` as a base::Feature override"), e11);
            }
        }
        BaseFeatureOverrides.Builder newBuilder = BaseFeatureOverrides.newBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            newBuilder.putFeatureStates((String) entry2.getKey(), ((BaseFeatureOverrides.FeatureState.Builder) entry2.getValue()).build());
        }
        return newBuilder.build();
    }
}
