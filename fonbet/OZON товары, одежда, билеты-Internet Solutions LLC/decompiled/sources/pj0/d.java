package pj0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import fj0.g;
import ij0.InterfaceC7086a;
import ij0.f;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mj0.InterfaceC8344a;
import nj0.InterfaceC8600a;
import oj0.InterfaceC8746a;
import org.jetbrains.annotations.NotNull;
import pi0.h;
import rj0.InterfaceC9287a;
import sj0.InterfaceC9701a;
import xe.B0;
import xe.C10727i;

/* loaded from: classes3.dex */
public abstract class d<MenuItem extends InterfaceC9287a> extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC8600a f81248a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7086a f81249b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f81250c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<MenuItem> f81251d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<InterfaceC8746a<MenuItem>> f81252e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<InterfaceC8746a<MenuItem>> f81253f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private LinkedHashMap f81254g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f81255h;

    public d(@NotNull kj0.b configurationsLoader, @NotNull InterfaceC9701a menuBuilder, @NotNull h externalConfiguration, @NotNull InterfaceC8600a configurationMapper, @NotNull InterfaceC7086a changeConfiguration, @NotNull f resetConfiguration) {
        Intrinsics.checkNotNullParameter(configurationsLoader, "configurationsLoader");
        Intrinsics.checkNotNullParameter(menuBuilder, "menuBuilder");
        Intrinsics.checkNotNullParameter(externalConfiguration, "externalConfiguration");
        Intrinsics.checkNotNullParameter(configurationMapper, "configurationMapper");
        Intrinsics.checkNotNullParameter(changeConfiguration, "changeConfiguration");
        Intrinsics.checkNotNullParameter(resetConfiguration, "resetConfiguration");
        this.f81248a = configurationMapper;
        this.f81249b = changeConfiguration;
        this.f81250c = resetConfiguration;
        List<MenuItem> build = menuBuilder.build();
        this.f81251d = build;
        x0<InterfaceC8746a<MenuItem>> a11 = O0.a(new InterfaceC8746a.b(build));
        this.f81252e = a11;
        this.f81253f = C2399j.b(a11);
        C2399j.C(new C2408n0(configurationsLoader.load(), new C8939a(this, externalConfiguration, null)), androidx.lifecycle.x0.a(this));
        this.f81254g = new LinkedHashMap();
        this.f81255h = new LinkedHashMap();
    }

    @NotNull
    public final M0<InterfaceC8746a<MenuItem>> getUiState() {
        return this.f81253f;
    }

    public final void i0(@NotNull InterfaceC8344a intent) {
        fj0.d<?> a11;
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean z11 = intent instanceof InterfaceC8344a.C1279a;
        InterfaceC8600a interfaceC8600a = this.f81248a;
        if (z11) {
            g<?> b11 = interfaceC8600a.b(((InterfaceC8344a.C1279a) intent).a());
            if (b11 == null) {
                return;
            }
            LinkedHashMap linkedHashMap = this.f81254g;
            String key = b11.getKey();
            b bVar = new b(this, b11, null);
            B0 b02 = (B0) linkedHashMap.get(key);
            if (b02 != null) {
                b02.j(null);
            }
            linkedHashMap.put(key, C10727i.c(androidx.lifecycle.x0.a(this), null, null, bVar, 3));
            return;
        }
        if (!(intent instanceof InterfaceC8344a.b) || (a11 = interfaceC8600a.a(((InterfaceC8344a.b) intent).a())) == null) {
            return;
        }
        LinkedHashMap linkedHashMap2 = this.f81255h;
        String key2 = a11.getKey();
        c cVar = new c(this, a11, null);
        B0 b03 = (B0) linkedHashMap2.get(key2);
        if (b03 != null) {
            b03.j(null);
        }
        linkedHashMap2.put(key2, C10727i.c(androidx.lifecycle.x0.a(this), null, null, cVar, 3));
    }
}
