package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeStroke;
import java.util.ArrayList;
import xsna.eij;
import xsna.gfj;
import xsna.i700;
import xsna.jbu;
import xsna.k800;
import xsna.nf2;
import xsna.of2;
import xsna.pf2;
import xsna.uf2;

/* compiled from: GradientStroke.java */
/* loaded from: classes12.dex */
public final class a implements eij {
    public final String a;
    public final GradientType b;
    public final of2 c;
    public final pf2 d;
    public final uf2 e;
    public final uf2 f;
    public final nf2 g;
    public final ShapeStroke.LineCapType h;
    public final ShapeStroke.LineJoinType i;
    public final float j;
    public final ArrayList k;

    @Nullable
    public final nf2 l;
    public final boolean m;

    public a(String str, GradientType gradientType, of2 of2Var, pf2 pf2Var, uf2 uf2Var, uf2 uf2Var2, nf2 nf2Var, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, ArrayList arrayList, @Nullable nf2 nf2Var2, boolean z) {
        this.a = str;
        this.b = gradientType;
        this.c = of2Var;
        this.d = pf2Var;
        this.e = uf2Var;
        this.f = uf2Var2;
        this.g = nf2Var;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f;
        this.k = arrayList;
        this.l = nf2Var2;
        this.m = z;
    }

    @Override // xsna.eij
    public final gfj a(k800 k800Var, i700 i700Var, com.airbnb.lottie.model.layer.a aVar) {
        return new jbu(k800Var, aVar, this);
    }
}
