package gf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class x implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10044a;

    /* renamed from: b, reason: collision with root package name */
    public int f10045b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10046c;

    public /* synthetic */ x(int i5, Object obj) {
        this.f10044a = i5;
        this.f10046c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10044a) {
            case 0:
                if (this.f10045b < ((byte[]) this.f10046c).length) {
                }
                break;
            case 1:
                if (this.f10045b < ((int[]) this.f10046c).length) {
                }
                break;
            case 2:
                if (this.f10045b < ((long[]) this.f10046c).length) {
                }
                break;
            case 3:
                if (this.f10045b < ((short[]) this.f10046c).length) {
                }
                break;
            case 4:
                if (this.f10045b < ((kotlin.collections.f) this.f10046c).size()) {
                }
                break;
            case 5:
                if (this.f10045b > 0) {
                }
                break;
            default:
                if (this.f10045b < ((s.o) this.f10046c).g()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10044a) {
            case 0:
                int i5 = this.f10045b;
                byte[] bArr = (byte[]) this.f10046c;
                if (i5 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10045b));
                }
                this.f10045b = i5 + 1;
                return new w(bArr[i5]);
            case 1:
                int i10 = this.f10045b;
                int[] iArr = (int[]) this.f10046c;
                if (i10 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10045b));
                }
                this.f10045b = i10 + 1;
                return new a0(iArr[i10]);
            case 2:
                int i11 = this.f10045b;
                long[] jArr = (long[]) this.f10046c;
                if (i11 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10045b));
                }
                this.f10045b = i11 + 1;
                return new d0(jArr[i11]);
            case 3:
                int i12 = this.f10045b;
                short[] sArr = (short[]) this.f10046c;
                if (i12 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f10045b));
                }
                this.f10045b = i12 + 1;
                return new h0(sArr[i12]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                kotlin.collections.f fVar = (kotlin.collections.f) this.f10046c;
                int i13 = this.f10045b;
                this.f10045b = i13 + 1;
                return fVar.get(i13);
            case 5:
                sg.u uVar = (sg.u) this.f10046c;
                int i14 = uVar.f23702c;
                int i15 = this.f10045b;
                this.f10045b = i15 - 1;
                return uVar.f23704e[i14 - i15];
            default:
                s.o oVar = (s.o) this.f10046c;
                int i16 = this.f10045b;
                this.f10045b = i16 + 1;
                return oVar.h(i16);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10044a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(byte[] array) {
        this.f10044a = 0;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f10046c = array;
    }

    public x(int[] array) {
        this.f10044a = 1;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f10046c = array;
    }

    public x(long[] array) {
        this.f10044a = 2;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f10046c = array;
    }

    public x(short[] array) {
        this.f10044a = 3;
        Intrinsics.checkNotNullParameter(array, "array");
        this.f10046c = array;
    }

    public x(sg.u uVar) {
        this.f10044a = 5;
        this.f10046c = uVar;
        this.f10045b = uVar.f23702c;
    }
}
