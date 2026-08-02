package com.vk.dto.shortvideo;

import com.vk.core.serialize.Serializer;
import java.util.Arrays;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ChallengeColor.kt */
/* loaded from: classes18.dex */
public abstract class ChallengeColor extends Serializer.StreamParcelableAdapter {

    /* compiled from: ChallengeColor.kt */
    public static final class Gradient extends ChallengeColor {
        public static final Serializer.c<Gradient> CREATOR = new a();
        public final int[] b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Gradient> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Gradient a(Serializer serializer) {
                int[] c = serializer.c();
                if (c == null) {
                    c = new int[]{0};
                }
                return new Gradient(c);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gradient[i];
            }
        }

        public Gradient(int[] iArr) {
            super(null);
            this.b = iArr;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.T(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (Gradient.class.equals(obj != null ? obj.getClass() : null)) {
                return Arrays.equals(this.b, ((Gradient) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public final String toString() {
            return "Gradient(colors=" + Arrays.toString(this.b) + ')';
        }
    }

    /* compiled from: ChallengeColor.kt */
    public static final class Solid extends ChallengeColor {
        public static final Serializer.c<Solid> CREATOR = new a();
        public final int b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Solid> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Solid a(Serializer serializer) {
                return new Solid(serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Solid[i];
            }
        }

        public Solid(int i) {
            super(null);
            this.b = i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Solid) && this.b == ((Solid) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Solid(color="), this.b, ')');
        }
    }

    public /* synthetic */ ChallengeColor(zcl zclVar) {
        this();
    }

    public ChallengeColor() {
    }
}
