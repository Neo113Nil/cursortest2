package com.vk.core.compose.component.defaults;

import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.CounterAppearance;
import xsna.epx;
import xsna.lg90;

/* compiled from: VkIconButtonDefault.kt */
/* loaded from: classes17.dex */
public interface b {

    /* compiled from: VkIconButtonDefault.kt */
    public static final class a implements b {
        public final BadgeAppearance a;

        public a() {
            this(0);
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
            return "Badge(appearance=" + this.a + ')';
        }

        public a(int i) {
            this.a = BadgeAppearance.Design.AccentRed;
        }
    }

    /* compiled from: VkIconButtonDefault.kt */
    /* renamed from: com.vk.core.compose.component.defaults.b$b, reason: collision with other inner class name */
    public static final class C0741b implements b {
        public final ContentBadgeSize a;
        public final ContentBadgeMode b;
        public final ContentBadgeAppearance c;
        public final lg90 d;

        public C0741b(lg90 lg90Var) {
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Small;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Negative;
            this.a = contentBadgeSize;
            this.b = contentBadgeMode;
            this.c = design;
            this.d = lg90Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0741b)) {
                return false;
            }
            C0741b c0741b = (C0741b) obj;
            return this.a == c0741b.a && this.b == c0741b.b && epx.f(this.c, c0741b.c) && epx.f(this.d, c0741b.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            lg90 lg90Var = this.d;
            return Boolean.hashCode(false) + ((hashCode + (lg90Var == null ? 0 : lg90Var.hashCode())) * 28629151);
        }

        public final String toString() {
            return "ContentBadge(size=" + this.a + ", mode=" + this.b + ", appearance=" + this.c + ", icon=" + this.d + ", iconTint=null, text=null, trailingIcon=null, trailingIconTint=null, capsule=false)";
        }
    }

    /* compiled from: VkIconButtonDefault.kt */
    public static final class c implements b {
        public final int a;
        public final CounterSize b;
        public final CounterAppearance c;
        public final CounterMode d;

        public c() {
            CounterSize counterSize = CounterSize.Small;
            CounterAppearance.Design design = CounterAppearance.Design.AccentRed;
            CounterMode counterMode = CounterMode.Primary;
            this.a = 1;
            this.b = counterSize;
            this.c = design;
            this.d = counterMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c) && this.d == cVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Counter(count=" + this.a + ", size=" + this.b + ", appearance=" + this.c + ", mode=" + this.d + ')';
        }
    }

    /* compiled from: VkIconButtonDefault.kt */
    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1703161778;
        }

        public final String toString() {
            return "None";
        }
    }
}
