package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.dmi;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Sg {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    private final C4243p0 a;

    @NotNull
    private final Uc b;

    public Sg(@NotNull C4243p0 c4243p0, @NotNull Uc uc) {
        c4243p0.getClass();
        uc.getClass();
        this.a = c4243p0;
        this.b = uc;
    }

    private final void b(B b, List<? extends B> list) {
        for (B b2 : list) {
            if (b2 == b) {
                b.a(true);
                return;
            } else {
                b2.a(false);
                IronLog.INTERNAL.verbose(C4243p0.a(this.a, dmi.y(b2.q(), " - not ready to show"), (String) null, 2, (Object) null));
            }
        }
    }

    public abstract void a();

    public abstract void a(@NotNull B b);

    public final void a(@NotNull B b, @NotNull List<? extends B> list) {
        b.getClass();
        list.getClass();
        b(b, list);
        c(b);
    }

    public abstract void b(@NotNull B b);

    public abstract void c(@NotNull B b);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Sg a(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0, @NotNull Uc uc, @NotNull Mg mg, @NotNull H h) {
            t0.getClass();
            abstractC4386x0.getClass();
            uc.getClass();
            mg.getClass();
            h.getClass();
            return abstractC4386x0.q() ? new C4383wf(t0, uc, mg, h) : new G4(t0, uc, mg);
        }

        private a() {
        }
    }

    public final void a(@NotNull B b, @Nullable String str, @NotNull C4181la c4181la) {
        b.getClass();
        c4181la.getClass();
        this.b.a(b, str, c4181la);
    }
}
