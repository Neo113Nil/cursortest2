package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface Yg {
    void a();

    void a(@NotNull B b);

    @NotNull
    Md b();

    @Nullable
    default B c() {
        return null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final C0194a a = new C0194a(null);

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.Yg$a$a, reason: collision with other inner class name */
        public static final class C0194a {
            public /* synthetic */ C0194a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Yg a(boolean z, @NotNull Rg rg) {
                rg.getClass();
                return z ? new Wg(rg) : new Vg(rg);
            }

            private C0194a() {
            }
        }
    }
}
