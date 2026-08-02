package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import com.vkontakte.android.R;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: VmojiBadge.kt */
/* loaded from: classes7.dex */
public abstract class VmojiBadge extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final int c;

    /* compiled from: VmojiBadge.kt */
    public static final class Discount extends VmojiBadge {
        public static final Serializer.c<Discount> CREATOR = new a();
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Discount> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Discount a(Serializer serializer) {
                return new Discount(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discount[i];
            }
        }

        public Discount(String str) {
            super(str, R.color.vk_red_nice, null);
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Discount) && epx.f(this.d, ((Discount) obj).d);
        }

        @Override // com.vk.vmoji.character.model.VmojiBadge
        public final String getText() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Discount(text="), this.d, ')');
        }
    }

    /* compiled from: VmojiBadge.kt */
    public static final class New extends VmojiBadge {
        public static final Serializer.c<New> CREATOR = new a();
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<New> {
            @Override // com.vk.core.serialize.Serializer.c
            public final New a(Serializer serializer) {
                return new New(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new New[i];
            }
        }

        public New(String str) {
            super(str, R.color.vk_blue_200, null);
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof New) && epx.f(this.d, ((New) obj).d);
        }

        @Override // com.vk.vmoji.character.model.VmojiBadge
        public final String getText() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("New(text="), this.d, ')');
        }
    }

    /* compiled from: VmojiBadge.kt */
    public static final class Unknown extends VmojiBadge {
        public static final Serializer.c<Unknown> CREATOR = new a();
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Unknown> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Unknown a(Serializer serializer) {
                return new Unknown(serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown(String str) {
            super(str, R.color.vk_red_nice, null);
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && epx.f(this.d, ((Unknown) obj).d);
        }

        @Override // com.vk.vmoji.character.model.VmojiBadge
        public final String getText() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Unknown(text="), this.d, ')');
        }
    }

    public VmojiBadge(String str, int i, zcl zclVar) {
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(getText());
    }

    public String getText() {
        return this.b;
    }
}
