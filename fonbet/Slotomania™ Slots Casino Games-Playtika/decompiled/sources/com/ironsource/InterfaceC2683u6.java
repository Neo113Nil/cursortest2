package com.ironsource;

import android.app.Activity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.u6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2683u6 {

    /* renamed from: com.ironsource.u6$a */
    public static final class a {
        private final c a;

        public a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.a = strategyType;
        }

        public final c a() {
            return this.a;
        }

        public final c b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.a + ")";
        }

        public final a a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.a;
            }
            return aVar.a(cVar);
        }
    }

    /* renamed from: com.ironsource.u6$b */
    public static final class b {

        /* renamed from: com.ironsource.u6$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public final InterfaceC2683u6 a(C2588p0 adTools, a config, InterfaceC2612q6 fullscreenAdUnitFactory, InterfaceC2647s6 fullscreenAdUnitListener, InterfaceC2665t6 listener) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i = a.a[config.b().ordinal()];
            if (i == 1) {
                return new I6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 2) {
                return new B6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 3) {
                return new C2701v6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.ironsource.u6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");

        private final String a;

        c(String str) {
            this.a = str;
        }

        public final String b() {
            return this.a;
        }
    }

    void a(Activity activity);

    void loadAd();
}
