package com.vk.core.view.components.topbar;

import xsna.epx;
import xsna.itj0;
import xsna.zhf0;

/* compiled from: ToolbarEvent.kt */
/* loaded from: classes17.dex */
public abstract class a {

    /* compiled from: ToolbarEvent.kt */
    /* renamed from: com.vk.core.view.components.topbar.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0881a extends a {

        /* compiled from: ToolbarEvent.kt */
        /* renamed from: com.vk.core.view.components.topbar.a$a$a, reason: collision with other inner class name */
        public static final class C0882a extends AbstractC0881a {
            public static final C0882a a = new C0882a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0882a);
            }

            public final int hashCode() {
                return 1537715169;
            }

            public final String toString() {
                return "EmptyRight";
            }
        }
    }

    /* compiled from: ToolbarEvent.kt */
    public static abstract class b extends a {

        /* compiled from: ToolbarEvent.kt */
        /* renamed from: com.vk.core.view.components.topbar.a$b$a, reason: collision with other inner class name */
        public static final class C0883a extends b {
            public final zhf0 a;

            public C0883a(zhf0 zhf0Var) {
                this.a = zhf0Var;
            }

            @Override // com.vk.core.view.components.topbar.a
            public final zhf0 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0883a) && epx.f(this.a, ((C0883a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return itj0.c(new StringBuilder("Before(rect="), this.a, ')');
            }
        }
    }

    /* compiled from: ToolbarEvent.kt */
    public static abstract class c extends a {

        /* compiled from: ToolbarEvent.kt */
        /* renamed from: com.vk.core.view.components.topbar.a$c$a, reason: collision with other inner class name */
        public static final class C0884a extends c {
            public final zhf0 a;

            public C0884a(zhf0 zhf0Var) {
                this.a = zhf0Var;
            }

            @Override // com.vk.core.view.components.topbar.a
            public final zhf0 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0884a) && epx.f(this.a, ((C0884a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return itj0.c(new StringBuilder("Extra(rect="), this.a, ')');
            }
        }

        /* compiled from: ToolbarEvent.kt */
        public static final class b extends c {
            public final zhf0 a;

            public b(zhf0 zhf0Var) {
                this.a = zhf0Var;
            }

            @Override // com.vk.core.view.components.topbar.a
            public final zhf0 a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return itj0.c(new StringBuilder("Main(rect="), this.a, ')');
            }
        }
    }

    public zhf0 a() {
        return zhf0.e;
    }
}
