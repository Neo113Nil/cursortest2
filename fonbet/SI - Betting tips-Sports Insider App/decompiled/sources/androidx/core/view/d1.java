package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f1300a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f1301b;

    public d1(ViewGroup viewGroup) {
        this.f1301b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1300a < this.f1301b.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.f1301b;
        int i5 = this.f1300a;
        this.f1300a = i5 + 1;
        View childAt = viewGroup.getChildAt(i5);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.f1301b;
        int i5 = this.f1300a - 1;
        this.f1300a = i5;
        viewGroup.removeViewAt(i5);
    }
}
