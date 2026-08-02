package hf;

import androidx.core.view.n0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends n0 implements Iterator, KMutableIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10606e;

    public g(i map, int i5) {
        this.f10606e = i5;
        Intrinsics.checkNotNullParameter(map, "map");
        this.f1362d = map;
        this.f1360b = -1;
        this.f1361c = map.f10619h;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10606e) {
            case 0:
                c();
                int i5 = this.f1359a;
                i iVar = (i) this.f1362d;
                if (i5 >= iVar.f10617f) {
                    throw new NoSuchElementException();
                }
                this.f1359a = i5 + 1;
                this.f1360b = i5;
                h hVar = new h(iVar, i5);
                f();
                return hVar;
            case 1:
                c();
                int i10 = this.f1359a;
                i iVar2 = (i) this.f1362d;
                if (i10 >= iVar2.f10617f) {
                    throw new NoSuchElementException();
                }
                this.f1359a = i10 + 1;
                this.f1360b = i10;
                Object obj = iVar2.f10612a[i10];
                f();
                return obj;
            default:
                c();
                int i11 = this.f1359a;
                i iVar3 = (i) this.f1362d;
                if (i11 >= iVar3.f10617f) {
                    throw new NoSuchElementException();
                }
                this.f1359a = i11 + 1;
                this.f1360b = i11;
                Object[] objArr = iVar3.f10613b;
                Intrinsics.checkNotNull(objArr);
                Object obj2 = objArr[this.f1360b];
                f();
                return obj2;
        }
    }
}
