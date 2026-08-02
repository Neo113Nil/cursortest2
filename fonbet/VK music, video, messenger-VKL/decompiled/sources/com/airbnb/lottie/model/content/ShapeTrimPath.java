package com.airbnb.lottie.model.content;

import xsna.arp0;
import xsna.eij;
import xsna.gfj;
import xsna.i700;
import xsna.k800;
import xsna.nf2;

/* loaded from: classes12.dex */
public final class ShapeTrimPath implements eij {
    public final Type a;
    public final nf2 b;
    public final nf2 c;
    public final nf2 d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type INDIVIDUALLY;
        public static final Type SIMULTANEOUSLY;

        static {
            Type type = new Type("SIMULTANEOUSLY", 0);
            SIMULTANEOUSLY = type;
            Type type2 = new Type("INDIVIDUALLY", 1);
            INDIVIDUALLY = type2;
            $VALUES = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ShapeTrimPath(String str, Type type, nf2 nf2Var, nf2 nf2Var2, nf2 nf2Var3, boolean z) {
        this.a = type;
        this.b = nf2Var;
        this.c = nf2Var2;
        this.d = nf2Var3;
        this.e = z;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new arp0(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
