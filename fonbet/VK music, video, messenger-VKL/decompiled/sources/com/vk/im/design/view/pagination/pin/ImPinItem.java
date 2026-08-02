package com.vk.im.design.view.pagination.pin;

import android.view.View;
import xsna.asp;
import xsna.epx;
import xsna.hfz;
import xsna.ho8;
import xsna.izs;
import xsna.jq;
import xsna.qoy;
import xsna.rlw;
import xsna.s3q0;
import xsna.tlo0;
import xsna.u11;
import xsna.up;
import xsna.zrp;

/* compiled from: ImPinItem.kt */
/* loaded from: classes2.dex */
public interface ImPinItem extends hfz {

    /* compiled from: ImPinItem.kt */
    public static final class WithAttach implements ImPinItem {
        public final int b;
        public final a c;
        public final tlo0.h d;
        public final tlo0.h e;
        public final boolean f;
        public final b g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImPinItem.kt */
        public static final class Style {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final Style Circle;
            public static final Style Rounded;
            public static final Style Stencil;

            static {
                Style style = new Style("Circle", 0);
                Circle = style;
                Style style2 = new Style("Rounded", 1);
                Rounded = style2;
                Style style3 = new Style("Stencil", 2);
                Stencil = style3;
                Style[] styleArr = {style, style2, style3};
                $VALUES = styleArr;
                $ENTRIES = new asp(styleArr);
            }

            public Style() {
                throw null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        /* compiled from: ImPinItem.kt */
        public static final class a {
            public final rlw a;
            public final Style b;
            public final boolean c;
            public final String d;

            public /* synthetic */ a(rlw rlwVar, Style style, int i) {
                this(rlwVar, style, (i & 4) == 0, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
                String str = this.d;
                return b + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ImAttachIcon(source=");
                sb.append(this.a);
                sb.append(", style=");
                sb.append(this.b);
                sb.append(", isPlayable=");
                sb.append(this.c);
                sb.append(", stencilPath=");
                return ho8.a(sb, this.d, ')');
            }

            public a(rlw rlwVar, Style style, boolean z, String str) {
                this.a = rlwVar;
                this.b = style;
                this.c = z;
                this.d = str;
            }
        }

        /* compiled from: ImPinItem.kt */
        public static final class b {
            public final izs<View, s3q0> a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(izs<? super View, s3q0> izsVar) {
                this.a = izsVar;
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
                return up.c(new StringBuilder("Restriction(callback="), this.a, ')');
            }
        }

        public WithAttach(int i, a aVar, tlo0.h hVar, tlo0.h hVar2, boolean z, b bVar) {
            this.b = i;
            this.c = aVar;
            this.d = hVar;
            this.e = hVar2;
            this.f = z;
            this.g = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithAttach)) {
                return false;
            }
            WithAttach withAttach = (WithAttach) obj;
            return this.b == withAttach.b && this.c.equals(withAttach.c) && this.d.equals(withAttach.d) && this.e.equals(withAttach.e) && this.f == withAttach.f && epx.f(this.g, withAttach.g);
        }

        @Override // com.vk.im.design.view.pagination.pin.ImPinItem
        public final int getId() {
            return this.b;
        }

        @Override // com.vk.im.design.view.pagination.pin.ImPinItem, xsna.hfz
        public final Number getItemId() {
            return super.getItemId();
        }

        public final int hashCode() {
            int b2 = qoy.b(u11.c(u11.c((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31, 31, this.d.a), 31, this.e.a), 31, this.f);
            b bVar = this.g;
            return b2 + (bVar == null ? 0 : bVar.a.hashCode());
        }

        public final String toString() {
            return "WithAttach(id=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", isMultiple=" + this.f + ", restriction=" + this.g + ')';
        }
    }

    /* compiled from: ImPinItem.kt */
    public static final class a implements ImPinItem {
        public final int b;
        public final tlo0.h c;
        public final tlo0.h d;

        public a(int i, tlo0.h hVar, tlo0.h hVar2) {
            this.b = i;
            this.c = hVar;
            this.d = hVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        @Override // com.vk.im.design.view.pagination.pin.ImPinItem
        public final int getId() {
            return this.b;
        }

        @Override // com.vk.im.design.view.pagination.pin.ImPinItem, xsna.hfz
        public final Number getItemId() {
            return super.getItemId();
        }

        public final int hashCode() {
            return this.d.a.hashCode() + u11.c(Integer.hashCode(this.b) * 31, 31, this.c.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextOnly(id=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", subtitle=");
            return jq.c(sb, this.d, ')');
        }
    }

    int getId();

    @Override // xsna.hfz
    default Integer getItemId() {
        return Integer.valueOf(getId());
    }
}
