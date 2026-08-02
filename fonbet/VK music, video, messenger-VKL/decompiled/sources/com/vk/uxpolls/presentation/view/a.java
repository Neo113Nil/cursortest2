package com.vk.uxpolls.presentation.view;

import xsna.dub0;
import xsna.epx;
import xsna.ho8;
import xsna.lix0;
import xsna.o2y;
import xsna.utk0;
import xsna.vu5;
import xsna.wtb0;

/* compiled from: UxPollsManager.kt */
/* loaded from: classes6.dex */
public interface a extends wtb0, lix0, o2y {

    /* compiled from: UxPollsManager.kt */
    /* renamed from: com.vk.uxpolls.presentation.view.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1943a {

        /* compiled from: UxPollsManager.kt */
        /* renamed from: com.vk.uxpolls.presentation.view.a$a$a, reason: collision with other inner class name */
        public static final class C1944a extends AbstractC1943a {
            public static final C1944a a = new C1944a();
        }

        /* compiled from: UxPollsManager.kt */
        /* renamed from: com.vk.uxpolls.presentation.view.a$a$b */
        public static abstract class b extends AbstractC1943a {

            /* compiled from: UxPollsManager.kt */
            /* renamed from: com.vk.uxpolls.presentation.view.a$a$b$a, reason: collision with other inner class name */
            public static final class C1945a extends b {
                public final int a;

                public C1945a(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1945a) && this.a == ((C1945a) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("WebAppInitialized(id="), this.a, ')');
                }
            }

            /* compiled from: UxPollsManager.kt */
            /* renamed from: com.vk.uxpolls.presentation.view.a$a$b$b, reason: collision with other inner class name */
            public static final class C1946b extends b {
                public static final C1946b a = new C1946b();
            }
        }

        /* compiled from: UxPollsManager.kt */
        /* renamed from: com.vk.uxpolls.presentation.view.a$a$c */
        public static final class c extends AbstractC1943a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Loading(url="), this.a, ')');
            }
        }

        /* compiled from: UxPollsManager.kt */
        /* renamed from: com.vk.uxpolls.presentation.view.a$a$d */
        public static final class d extends AbstractC1943a {
            public static final d a = new d();
        }
    }

    void b(dub0 dub0Var);

    void d(com.vk.uxpolls.presentation.js.model.a aVar);

    utk0 e();

    utk0 f();

    void load();

    void onError(Throwable th);
}
