package com.vk.stickers.views.sticker;

import com.vk.core.serialize.Serializer;
import com.vkontakte.android.R;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: StickerPackBadge.kt */
/* loaded from: classes6.dex */
public abstract class StickerPackBadge extends Serializer.StreamParcelableAdapter {
    public final String b;

    /* compiled from: StickerPackBadge.kt */
    public static final class Discount extends StickerPackBadge {
        public static final Serializer.c<Discount> CREATOR = new a();
        public final String c;
        public final int d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Discount> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Discount a(Serializer serializer) {
                return new Discount(serializer.H(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discount[i];
            }
        }

        public /* synthetic */ Discount(String str, int i, int i2, zcl zclVar) {
            this(str, (i2 & 2) != 0 ? R.color.vk_red_nice : i);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.S(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj;
            return epx.f(this.c, discount.c) && this.d == discount.d;
        }

        @Override // com.vk.stickers.views.sticker.StickerPackBadge
        public final String getText() {
            return this.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Discount(text=");
            sb.append(this.c);
            sb.append(", color=");
            return vu5.b(sb, this.d, ')');
        }

        public Discount(String str, int i) {
            super(str, i, null);
            this.c = str;
            this.d = i;
        }
    }

    /* compiled from: StickerPackBadge.kt */
    public static final class New extends StickerPackBadge {
        public static final Serializer.c<New> CREATOR = new a();
        public final String c;
        public final int d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<New> {
            @Override // com.vk.core.serialize.Serializer.c
            public final New a(Serializer serializer) {
                return new New(serializer.H(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new New[i];
            }
        }

        public /* synthetic */ New(String str, int i, int i2, zcl zclVar) {
            this(str, (i2 & 2) != 0 ? R.color.vk_blue_200 : i);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.S(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof New)) {
                return false;
            }
            New r5 = (New) obj;
            return epx.f(this.c, r5.c) && this.d == r5.d;
        }

        @Override // com.vk.stickers.views.sticker.StickerPackBadge
        public final String getText() {
            return this.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("New(text=");
            sb.append(this.c);
            sb.append(", color=");
            return vu5.b(sb, this.d, ')');
        }

        public New(String str, int i) {
            super(str, i, null);
            this.c = str;
            this.d = i;
        }
    }

    /* compiled from: StickerPackBadge.kt */
    public static final class Unknown extends StickerPackBadge {
        public static final Serializer.c<Unknown> CREATOR = new a();
        public final String c;
        public final int d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Unknown> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Unknown a(Serializer serializer) {
                return new Unknown(serializer.H(), serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public /* synthetic */ Unknown(String str, int i, int i2, zcl zclVar) {
            this(str, (i2 & 2) != 0 ? R.color.vk_red_nice : i);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.c);
            serializer.S(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) obj;
            return epx.f(this.c, unknown.c) && this.d == unknown.d;
        }

        @Override // com.vk.stickers.views.sticker.StickerPackBadge
        public final String getText() {
            return this.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Unknown(text=");
            sb.append(this.c);
            sb.append(", color=");
            return vu5.b(sb, this.d, ')');
        }

        public Unknown(String str, int i) {
            super(str, i, null);
            this.c = str;
            this.d = i;
        }
    }

    public StickerPackBadge(String str, int i, zcl zclVar) {
        this.b = str;
    }

    public String getText() {
        return this.b;
    }
}
