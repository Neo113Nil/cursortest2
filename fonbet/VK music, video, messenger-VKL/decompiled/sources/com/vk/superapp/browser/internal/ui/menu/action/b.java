package com.vk.superapp.browser.internal.ui.menu.action;

import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.l1a0;
import xsna.ms9;
import xsna.urd0;
import xsna.vp;
import xsna.zif0;

/* compiled from: ActionMenuItem.kt */
/* loaded from: classes6.dex */
public abstract class b extends zif0 {
    public final int a;

    /* compiled from: ActionMenuItem.kt */
    public static final class a extends b {
        public final l1a0 b;

        public a(l1a0 l1a0Var) {
            super(4);
            this.b = l1a0Var;
        }

        @Override // xsna.zif0
        public final long a() {
            return 4L;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Banner(personalBanner=" + this.b + ')';
        }
    }

    /* compiled from: ActionMenuItem.kt */
    /* renamed from: com.vk.superapp.browser.internal.ui.menu.action.b$b, reason: collision with other inner class name */
    public static final class C1871b extends b {
        public final String b;
        public final String c;
        public final boolean d;

        public C1871b(String str, String str2, boolean z) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        @Override // xsna.zif0
        public final long a() {
            return 1L;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1871b)) {
                return false;
            }
            C1871b c1871b = (C1871b) obj;
            return epx.f(this.b, c1871b.b) && epx.f(this.c, c1871b.c) && this.d == c1871b.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(title=");
            sb.append(this.b);
            sb.append(", iconUrl=");
            sb.append(this.c);
            sb.append(", canShowMore=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ActionMenuItem.kt */
    public static final class c extends b {
        public final List<HorizontalAction> b;

        public c() {
            throw null;
        }

        public c(List list) {
            super(2);
            this.b = list;
        }

        @Override // xsna.zif0
        public final long a() {
            return 3L;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return vp.b(", hideSeparator=false)", new StringBuilder("HorizontalActions(actions="), this.b);
        }
    }

    /* compiled from: ActionMenuItem.kt */
    public static final class d extends b {
        public final OtherAction b;
        public final boolean c;

        public d(OtherAction otherAction, boolean z) {
            super(3);
            this.b = otherAction;
            this.c = z;
        }

        @Override // xsna.zif0
        public final long a() {
            return this.b.getId();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OtherActions(action=");
            sb.append(this.b);
            sb.append(", showHint=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ActionMenuItem.kt */
    public static final class e extends b {
        public final String b;
        public final List<i> c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, List<? extends i> list) {
            super(1);
            this.b = str;
            this.c = list;
        }

        @Override // xsna.zif0
        public final long a() {
            return 2L;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            String str = this.b;
            return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Recommendations(title=");
            sb.append(this.b);
            sb.append(", data=");
            return ms9.a(')', sb, this.c);
        }
    }

    public b(int i) {
        this.a = i;
    }

    @Override // xsna.zif0
    public final int b() {
        return this.a;
    }
}
