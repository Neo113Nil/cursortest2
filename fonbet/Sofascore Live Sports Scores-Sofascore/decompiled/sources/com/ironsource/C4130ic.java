package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4130ic {

    @NotNull
    public static final a e = new a(null);

    @Nullable
    private static volatile C4130ic f;

    @Nullable
    private Kd a;

    @NotNull
    private final AtomicBoolean b;

    @NotNull
    private String c;

    @Nullable
    private K3 d;

    private C4130ic() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    @NotNull
    public static final C4130ic d() {
        return e.a();
    }

    public final void a(@NotNull String str) {
        str.getClass();
        this.c = str;
    }

    @Nullable
    public final K3 b() {
        return this.d;
    }

    @NotNull
    public final AtomicBoolean c() {
        return this.b;
    }

    @Nullable
    public final Kd e() {
        return this.a;
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.ic$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC4047e1 a(@NotNull IronSource.a aVar) {
            aVar.getClass();
            C4130ic c4130ic = C4130ic.f;
            K3 b = c4130ic != null ? c4130ic.b() : null;
            C4130ic c4130ic2 = C4130ic.f;
            Kd e = c4130ic2 != null ? c4130ic2.e() : null;
            return (b == null || e == null) ? new C4087g5() : new C4103h3(b, e, aVar);
        }

        private a() {
        }

        @NotNull
        public final C4130ic a() {
            C4130ic c4130ic;
            C4130ic c4130ic2 = C4130ic.f;
            if (c4130ic2 != null) {
                return c4130ic2;
            }
            synchronized (this) {
                c4130ic = C4130ic.f;
                if (c4130ic == null) {
                    c4130ic = new C4130ic(null);
                    C4130ic.f = c4130ic;
                }
            }
            return c4130ic;
        }
    }

    public final void a(@Nullable Kd kd) {
        this.a = kd;
    }

    public final void a(@Nullable K3 k3) {
        this.d = k3;
    }

    public /* synthetic */ C4130ic(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
