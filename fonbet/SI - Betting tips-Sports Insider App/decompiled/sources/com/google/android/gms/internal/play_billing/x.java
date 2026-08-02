package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5627a;

    /* renamed from: b, reason: collision with root package name */
    public int f5628b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5629c;

    public x() {
        d3.i(4, "initialCapacity");
        this.f5627a = new Object[4];
        this.f5628b = 0;
    }

    public static int b(int i5, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i10 <= i5) {
            return i5;
        }
        int i11 = i5 + (i5 >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public final void a(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f5627a;
        int i5 = this.f5628b;
        this.f5628b = i5 + 1;
        objArr[i5] = obj;
    }

    public final void c(int i5) {
        int length = this.f5627a.length;
        int b10 = b(length, this.f5628b + i5);
        if (b10 > length || this.f5629c) {
            this.f5627a = Arrays.copyOf(this.f5627a, b10);
            this.f5629c = false;
        }
    }
}
