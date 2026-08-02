package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;

/* renamed from: androidx.core.view.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2094j0 {

    /* renamed from: androidx.core.view.j0$a */
    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f19236a;

        public a(ViewGroup viewGroup) {
            this.f19236a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return AbstractC2094j0.c(this.f19236a);
        }
    }

    /* renamed from: androidx.core.view.j0$b */
    public static final class b implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19237a = new b();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            Sequence a10;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (a10 = AbstractC2094j0.a(viewGroup)) == null) {
                return null;
            }
            return a10.iterator();
        }
    }

    /* renamed from: androidx.core.view.j0$c */
    public static final class c implements Iterator, KMutableIterator {

        /* renamed from: a, reason: collision with root package name */
        public int f19238a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f19239b;

        public c(ViewGroup viewGroup) {
            this.f19239b = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f19239b;
            int i10 = this.f19238a;
            this.f19238a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19238a < this.f19239b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f19239b;
            int i10 = this.f19238a - 1;
            this.f19238a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    /* renamed from: androidx.core.view.j0$d */
    public static final class d implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f19240a;

        public d(ViewGroup viewGroup) {
            this.f19240a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return new Z(AbstractC2094j0.a(this.f19240a).iterator(), b.f19237a);
        }
    }

    public static final Sequence a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Sequence b(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
