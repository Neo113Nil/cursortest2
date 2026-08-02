package com.google.common.primitives;

import Bl0.k0;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final a f59159c = new a(new int[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f59160d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f59161a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59162b;

    private a(int[] iArr) {
        int length = iArr.length;
        this.f59161a = iArr;
        this.f59162b = length;
    }

    public static void a(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        new a(Arrays.copyOf(iArr, iArr.length));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i11 = aVar.f59162b;
            int i12 = this.f59162b;
            if (i12 == i11) {
                for (int i13 = 0; i13 < i12; i13++) {
                    k0.f(i13, i12);
                    int i14 = this.f59161a[i13];
                    k0.f(i13, aVar.f59162b);
                    if (i14 == aVar.f59161a[i13]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f59162b; i12++) {
            i11 = (i11 * 31) + this.f59161a[i12];
        }
        return i11;
    }

    Object readResolve() {
        return this.f59162b == 0 ? f59159c : this;
    }

    public final String toString() {
        int i11 = this.f59162b;
        if (i11 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i11 * 5);
        sb2.append('[');
        int[] iArr = this.f59161a;
        sb2.append(iArr[0]);
        for (int i12 = 1; i12 < i11; i12++) {
            sb2.append(", ");
            sb2.append(iArr[i12]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    Object writeReplace() {
        int[] iArr = this.f59161a;
        int length = iArr.length;
        int i11 = this.f59162b;
        return i11 < length ? new a(Arrays.copyOfRange(iArr, 0, i11)) : this;
    }
}
