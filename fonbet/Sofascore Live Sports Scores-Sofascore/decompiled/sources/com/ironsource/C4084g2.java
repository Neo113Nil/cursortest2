package com.ironsource;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4084g2 {

    @NotNull
    private final AbstractC4386x0 a;

    @NotNull
    private final Map<String, Object> b;

    @NotNull
    private final List<String> c;

    @NotNull
    private final StringBuilder d;

    @Nullable
    private B e;

    public C4084g2(@NotNull AbstractC4386x0 abstractC4386x0) {
        abstractC4386x0.getClass();
        this.a = abstractC4386x0;
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = new StringBuilder();
    }

    public final void a(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        List<String> list = this.c;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        providerInstanceName.getClass();
        list.add(providerInstanceName);
        StringBuilder sb = this.d;
        sb.append(networkSettings.getInstanceType(this.a.b().a()));
        sb.append(networkSettings.getProviderInstanceName());
        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
    }

    @NotNull
    public final List<String> b() {
        return this.c;
    }

    @Nullable
    public final B c() {
        return this.e;
    }

    @NotNull
    public final StringBuilder d() {
        return this.d;
    }

    public final boolean e() {
        return (this.e == null && this.b.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public final void a(@Nullable B b) {
        this.e = b;
        if (b != null) {
            StringBuilder sb = this.d;
            sb.append(b.r());
            sb.append(b.p());
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        }
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.b;
    }

    public final void a(@NotNull NetworkSettings networkSettings, @NotNull Map<String, ? extends Object> map) {
        networkSettings.getClass();
        map.getClass();
        String providerInstanceName = networkSettings.getProviderInstanceName();
        providerInstanceName.getClass();
        a(providerInstanceName, networkSettings.getInstanceType(this.a.b().a()), map);
    }

    public final void a(@NotNull C4281r3 c4281r3) {
        c4281r3.getClass();
        String c = c4281r3.c();
        c.getClass();
        int d = c4281r3.d();
        Map<String, Object> a = c4281r3.a();
        a.getClass();
        a(c, d, a);
    }

    private final void a(String str, int i, Map<String, ? extends Object> map) {
        this.b.put(str, map);
        StringBuilder sb = this.d;
        sb.append(i);
        sb.append(str);
        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
    }
}
