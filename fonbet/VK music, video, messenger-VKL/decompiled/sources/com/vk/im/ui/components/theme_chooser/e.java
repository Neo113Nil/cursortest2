package com.vk.im.ui.components.theme_chooser;

import xsna.epx;
import xsna.jpo0;
import xsna.mw5;
import xsna.q6g;

/* compiled from: ThemeChooserViewEvent.kt */
/* loaded from: classes2.dex */
public abstract class e {

    /* compiled from: ThemeChooserViewEvent.kt */
    public static final class a extends e {
        public final mw5 a;

        public a(mw5 mw5Var) {
            this.a = mw5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnBackgroundItemClick(item=" + this.a + ')';
        }
    }

    /* compiled from: ThemeChooserViewEvent.kt */
    public static final class b extends e {
        public static final b a = new b();
    }

    /* compiled from: ThemeChooserViewEvent.kt */
    public static final class c extends e {
        public final q6g a;

        public c(q6g q6gVar) {
            this.a = q6gVar;
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
            return "OnColorItemClick(item=" + this.a + ')';
        }
    }

    /* compiled from: ThemeChooserViewEvent.kt */
    public static final class d extends e {
        public static final d a = new d();
    }

    /* compiled from: ThemeChooserViewEvent.kt */
    /* renamed from: com.vk.im.ui.components.theme_chooser.e$e, reason: collision with other inner class name */
    public static final class C1161e extends e {
        public final jpo0 a;

        public C1161e(jpo0 jpo0Var) {
            this.a = jpo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1161e) && epx.f(this.a, ((C1161e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnThemeItemClick(item=" + this.a + ')';
        }
    }
}
