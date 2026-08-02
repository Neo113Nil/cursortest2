package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481se implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0552va f14642a;

    public C0481se() {
        this(new C0552va(20480, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull Map<String, String> map) {
        Mn a7 = this.f14642a.a(map);
        C0301l8 c0301l8 = new C0301l8();
        c0301l8.f14189b = ((C0347n4) a7.f12616b).f14295b;
        Map map2 = (Map) a7.f12615a;
        if (map2 != null) {
            c0301l8.f14188a = new C0276k8[map2.size()];
            int i5 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0301l8.f14188a[i5] = new C0276k8();
                c0301l8.f14188a[i5].f14104a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0301l8.f14188a[i5].f14105b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i5++;
            }
        }
        InterfaceC0039b3 interfaceC0039b3 = a7.f12616b;
        int i10 = ((C0347n4) interfaceC0039b3).f13333a;
        return new Di(c0301l8, interfaceC0039b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0481se(@NonNull C0552va c0552va) {
        this.f14642a = c0552va;
    }

    @NonNull
    public final Map<String, String> a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
