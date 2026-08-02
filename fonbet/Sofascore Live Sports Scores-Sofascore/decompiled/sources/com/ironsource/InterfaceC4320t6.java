package com.ironsource;

import android.app.Activity;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.t6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4320t6 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.t6$b */
    public static final class b {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.t6$b$a */
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

        @NotNull
        public final InterfaceC4320t6 a(@NotNull C4243p0 c4243p0, @NotNull a aVar, @NotNull InterfaceC4249p6 interfaceC4249p6, @NotNull InterfaceC4284r6 interfaceC4284r6, @NotNull InterfaceC4302s6 interfaceC4302s6) {
            c4243p0.getClass();
            aVar.getClass();
            interfaceC4249p6.getClass();
            interfaceC4284r6.getClass();
            interfaceC4302s6.getClass();
            int i = a.a[aVar.b().ordinal()];
            if (i == 1) {
                return new H6(c4243p0, aVar, interfaceC4249p6, interfaceC4284r6, interfaceC4302s6);
            }
            if (i == 2) {
                return new A6(c4243p0, interfaceC4249p6, interfaceC4284r6, interfaceC4302s6);
            }
            if (i == 3) {
                return new C4338u6(c4243p0, interfaceC4249p6, interfaceC4284r6, interfaceC4302s6);
            }
            zzl.b();
            return null;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.t6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        @NotNull
        private final String a;

        c(String str) {
            this.a = str;
        }

        @NotNull
        public final String b() {
            return this.a;
        }
    }

    void a(@NotNull Activity activity);

    void loadAd();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.t6$a */
    public static final class a {

        @NotNull
        private final c a;

        public a(@NotNull c cVar) {
            cVar.getClass();
            this.a = cVar;
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.a;
            }
            return aVar.a(cVar);
        }

        @NotNull
        public final c b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Config(strategyType=" + this.a + ")";
        }

        @NotNull
        public final a a(@NotNull c cVar) {
            cVar.getClass();
            return new a(cVar);
        }

        @NotNull
        public final c a() {
            return this.a;
        }
    }
}
