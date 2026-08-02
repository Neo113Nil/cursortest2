package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1319a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f1320b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1321c;

    public g0(d1 d1Var) {
        this.f1319a = 0;
        this.f1321c = new ArrayList();
        this.f1320b = d1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1319a) {
        }
        return this.f1320b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1319a) {
            case 0:
                Object next = this.f1320b.next();
                ArrayList arrayList = (ArrayList) this.f1321c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                d1 d1Var = viewGroup != null ? new d1(viewGroup) : null;
                if (d1Var == null || !d1Var.hasNext()) {
                    while (!this.f1320b.hasNext() && !arrayList.isEmpty()) {
                        this.f1320b = (Iterator) CollectionsKt.K(arrayList);
                        kotlin.collections.z.s(arrayList);
                    }
                } else {
                    arrayList.add(this.f1320b);
                    this.f1320b = d1Var;
                }
                return next;
            default:
                return ((bg.r) this.f1321c).f3225c.invoke(this.f1320b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1319a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g0(bg.r rVar) {
        this.f1319a = 1;
        this.f1321c = rVar;
        this.f1320b = ((Sequence) rVar.f3224b).iterator();
    }
}
