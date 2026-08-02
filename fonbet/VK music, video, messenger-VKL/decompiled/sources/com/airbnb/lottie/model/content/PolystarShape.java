package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import xsna.eij;
import xsna.fg2;
import xsna.gfj;
import xsna.i700;
import xsna.k800;
import xsna.nf2;
import xsna.vub0;

/* loaded from: classes12.dex */
public final class PolystarShape implements eij {
    public final String a;
    public final Type b;
    public final nf2 c;
    public final fg2<PointF, PointF> d;
    public final nf2 e;
    public final nf2 f;
    public final nf2 g;
    public final nf2 h;
    public final nf2 i;
    public final boolean j;
    public final boolean k;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type a(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, nf2 nf2Var, fg2<PointF, PointF> fg2Var, nf2 nf2Var2, nf2 nf2Var3, nf2 nf2Var4, nf2 nf2Var5, nf2 nf2Var6, boolean z, boolean z2) {
        this.a = str;
        this.b = type;
        this.c = nf2Var;
        this.d = fg2Var;
        this.e = nf2Var2;
        this.f = nf2Var3;
        this.g = nf2Var4;
        this.h = nf2Var5;
        this.i = nf2Var6;
        this.j = z;
        this.k = z2;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new vub0(k800Var, aVar, this);
    }
}
