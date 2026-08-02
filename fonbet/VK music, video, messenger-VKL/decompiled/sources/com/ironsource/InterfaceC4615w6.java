package com.ironsource;

import android.app.Activity;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4615w6 {

    /* renamed from: com.ironsource.w6$a */
    public static final class a {
        private final c a;

        public a(c cVar) {
            this.a = cVar;
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

        public final a a(c cVar) {
            return new a(cVar);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.a;
            }
            return aVar.a(cVar);
        }
    }

    /* renamed from: com.ironsource.w6$b */
    public static final class b {

        /* renamed from: com.ironsource.w6$b$a */
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

        public final InterfaceC4615w6 a(C4484p0 c4484p0, a aVar, InterfaceC4543s6 interfaceC4543s6, InterfaceC4579u6 interfaceC4579u6, InterfaceC4597v6 interfaceC4597v6) {
            int i = a.a[aVar.b().ordinal()];
            if (i == 1) {
                return new K6(c4484p0, aVar, interfaceC4543s6, interfaceC4579u6, interfaceC4597v6);
            }
            if (i == 2) {
                return new D6(c4484p0, interfaceC4543s6, interfaceC4579u6, interfaceC4597v6);
            }
            if (i == 3) {
                return new C4633x6(c4484p0, interfaceC4543s6, interfaceC4579u6, interfaceC4597v6);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.ironsource.w6$c */
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
