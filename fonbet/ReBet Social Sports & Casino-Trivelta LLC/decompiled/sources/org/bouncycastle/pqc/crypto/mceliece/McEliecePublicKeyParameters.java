package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes5.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g, reason: collision with root package name */
    private GF2Matrix f62104g;

    /* renamed from: n, reason: collision with root package name */
    private int f62105n;

    /* renamed from: t, reason: collision with root package name */
    private int f62106t;

    public McEliecePublicKeyParameters(int i10, int i11, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f62105n = i10;
        this.f62106t = i11;
        this.f62104g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f62104g;
    }

    public int getK() {
        return this.f62104g.getNumRows();
    }

    public int getN() {
        return this.f62105n;
    }

    public int getT() {
        return this.f62106t;
    }
}
