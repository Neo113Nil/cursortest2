package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.internal.play_billing.y2;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1588a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1589b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f1590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1591d;

    public d(w4 w4Var) {
        this.f1591d = w4Var;
        this.f1590c = w4Var.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1588a) {
            case 0:
                if (this.f1589b < this.f1590c) {
                }
                break;
            case 1:
                if (this.f1589b < this.f1590c) {
                }
                break;
            case 2:
                if (this.f1589b < this.f1590c) {
                }
                break;
            case 3:
                if (this.f1589b < this.f1590c) {
                }
                break;
            default:
                if (this.f1589b < this.f1590c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1588a) {
            case 0:
                int i5 = this.f1589b;
                if (i5 >= this.f1590c) {
                    throw new NoSuchElementException();
                }
                this.f1589b = i5 + 1;
                return Byte.valueOf(((g) this.f1591d).e(i5));
            case 1:
                int i10 = this.f1589b;
                if (i10 >= this.f1590c) {
                    throw new NoSuchElementException();
                }
                this.f1589b = i10 + 1;
                return Byte.valueOf(((w4) this.f1591d).b(i10));
            case 2:
                int i11 = this.f1589b;
                if (i11 >= this.f1590c) {
                    throw new NoSuchElementException();
                }
                this.f1589b = i11 + 1;
                return Byte.valueOf(((y2) this.f1591d).b(i11));
            case 3:
                int i12 = this.f1589b;
                if (i12 >= this.f1590c) {
                    throw new NoSuchElementException();
                }
                this.f1589b = i12 + 1;
                return Byte.valueOf(((k7.r0) this.f1591d).b(i12));
            default:
                int i13 = this.f1589b;
                if (i13 >= this.f1590c) {
                    throw new NoSuchElementException();
                }
                this.f1589b = i13 + 1;
                return Byte.valueOf(((s9.f) this.f1591d).d(i13));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1588a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public d(y2 y2Var) {
        this.f1591d = y2Var;
        this.f1590c = y2Var.c();
    }

    public d(k7.r0 r0Var) {
        this.f1591d = r0Var;
        this.f1590c = r0Var.d();
    }

    public d(g gVar) {
        this.f1591d = gVar;
        this.f1590c = gVar.size();
    }

    public d(s9.f fVar) {
        this.f1591d = fVar;
        this.f1590c = fVar.size();
    }
}
