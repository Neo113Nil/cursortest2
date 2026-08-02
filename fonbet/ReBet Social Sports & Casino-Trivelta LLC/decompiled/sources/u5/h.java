package u5;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u5.h;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f66166c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f66167a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final b f66168b = new b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final ArrayList c(h hVar, ArrayList mViews) {
            Intrinsics.checkNotNullParameter(mViews, "mViews");
            b bVar = hVar.f66168b;
            bVar.addAll(mViews);
            return bVar;
        }

        public final h b() {
            final h hVar = new h();
            l.f66170a.h(new Function1() { // from class: u5.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ArrayList c10;
                    c10 = h.a.c(h.this, (ArrayList) obj);
                    return c10;
                }
            });
            return hVar;
        }

        public a() {
        }
    }

    public static final class b extends ArrayList {
        public b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            Intrinsics.checkNotNullParameter(element, "element");
            boolean add = super.add(element);
            if (add) {
                Iterator it = h.this.c().iterator();
                while (it.hasNext()) {
                    ((b5.d) it.next()).a(CollectionsKt.toList(this));
                }
            }
            return add;
        }

        public /* bridge */ boolean b(View view) {
            return super.contains(view);
        }

        public /* bridge */ int c() {
            return super.size();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return b((View) obj);
            }
            return false;
        }

        public /* bridge */ int e(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int f(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i10) {
            return i(i10);
        }

        public /* bridge */ boolean h(View view) {
            return super.remove(view);
        }

        public View i(int i10) {
            Object remove = super.remove(i10);
            Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
            View view = (View) remove;
            Iterator it = h.this.c().iterator();
            while (it.hasNext()) {
                ((b5.d) it.next()).a(CollectionsKt.toList(this));
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return e((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return f((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return h((View) obj);
            }
            return false;
        }
    }

    public final List b() {
        return CollectionsKt.toList(this.f66168b);
    }

    public final CopyOnWriteArrayList c() {
        return this.f66167a;
    }
}
