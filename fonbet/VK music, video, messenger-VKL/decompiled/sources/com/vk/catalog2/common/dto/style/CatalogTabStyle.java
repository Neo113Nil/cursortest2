package com.vk.catalog2.common.dto.style;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: CatalogTabStyle.kt */
/* loaded from: classes16.dex */
public abstract class CatalogTabStyle extends Serializer.StreamParcelableAdapter {

    /* compiled from: CatalogTabStyle.kt */
    public static final class Gradient extends CatalogTabStyle {
        public static final Serializer.c<Gradient> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final int e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Gradient> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Gradient a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                String H3 = serializer.H();
                return new Gradient(H, H2, H3 != null ? H3 : "", serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gradient[i];
            }
        }

        public Gradient(String str, String str2, String str3, int i) {
            super(null);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = i;
        }

        @Override // com.vk.catalog2.common.dto.style.CatalogTabStyle, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.S(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) obj;
            return epx.f(this.b, gradient.b) && epx.f(this.c, gradient.c) && epx.f(this.d, gradient.d) && this.e == gradient.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gradient(startColor=");
            sb.append(this.b);
            sb.append(", centerColor=");
            sb.append(this.c);
            sb.append(", endColor=");
            sb.append(this.d);
            sb.append(", angle=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // com.vk.catalog2.common.dto.style.CatalogTabStyle
        public final CatalogTabStyle zb() {
            return new Gradient(this.b, this.c, this.d, this.e);
        }
    }

    /* compiled from: CatalogTabStyle.kt */
    public static final class Icon extends CatalogTabStyle {
        public static final Serializer.c<Icon> CREATOR = new a();
        public final String b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Icon> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Icon a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new Icon(H);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Icon[i];
            }
        }

        public Icon(String str) {
            super(null);
            this.b = str;
        }

        @Override // com.vk.catalog2.common.dto.style.CatalogTabStyle, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Icon) && epx.f(this.b, ((Icon) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Icon(url="), this.b, ')');
        }

        @Override // com.vk.catalog2.common.dto.style.CatalogTabStyle
        public final CatalogTabStyle zb() {
            return new Icon(this.b);
        }
    }

    public /* synthetic */ CatalogTabStyle(zcl zclVar) {
        this();
    }

    public abstract CatalogTabStyle zb();

    public CatalogTabStyle() {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
    }
}
