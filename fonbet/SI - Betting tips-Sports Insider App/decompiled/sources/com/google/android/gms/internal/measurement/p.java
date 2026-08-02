package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5172a;

    /* renamed from: b, reason: collision with root package name */
    public int f5173b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5174c;

    public /* synthetic */ p(int i5, Object obj) {
        this.f5172a = i5;
        this.f5174c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5172a) {
            case 0:
                if (this.f5173b < ((q) this.f5174c).f5186a.length()) {
                }
                break;
            case 1:
                if (this.f5173b < ((q) this.f5174c).f5186a.length()) {
                }
                break;
            default:
                if (this.f5173b < ((d) this.f5174c).m()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f5172a) {
            case 0:
                String str = ((q) this.f5174c).f5186a;
                int i5 = this.f5173b;
                if (i5 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f5173b = i5 + 1;
                return new q(String.valueOf(i5));
            case 1:
                q qVar = (q) this.f5174c;
                String str2 = qVar.f5186a;
                int i10 = this.f5173b;
                if (i10 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f5173b = i10 + 1;
                return new q(String.valueOf(qVar.f5186a.charAt(i10)));
            default:
                d dVar = (d) this.f5174c;
                if (this.f5173b >= dVar.m()) {
                    int i11 = this.f5173b;
                    throw new NoSuchElementException(r4.k.o(new StringBuilder(String.valueOf(i11).length() + 21), "Out of bounds index: ", i11));
                }
                int i12 = this.f5173b;
                this.f5173b = i12 + 1;
                return dVar.o(i12);
        }
    }
}
