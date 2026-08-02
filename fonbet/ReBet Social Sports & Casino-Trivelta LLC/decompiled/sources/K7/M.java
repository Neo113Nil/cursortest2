package K7;

import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public final int f6294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6295b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f6296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6297d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6298e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6299f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6300g;

    public M(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public M(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        D6.k.i(i10 >= 0 && i11 >= i10);
        this.f6295b = i10;
        this.f6294a = i11;
        this.f6296c = sparseIntArray;
        this.f6297d = i12;
        this.f6298e = i13;
        this.f6300g = i14;
    }
}
