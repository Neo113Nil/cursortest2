package io.sentry.android.replay;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends ArrayList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f16069a;

    public r(s sVar) {
        this.f16069a = sVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        View element = (View) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        Iterator it = this.f16069a.f16072c.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(element, true);
        }
        return super.add(element);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = this.f16069a.f16072c.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            Iterator it2 = elements.iterator();
            while (it2.hasNext()) {
                gVar.c((View) it2.next(), true);
            }
        }
        return super.addAll(elements);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof View) {
            return super.contains((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof View) {
            return super.indexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof View) {
            return super.lastIndexOf((View) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof View) {
            return super.remove((View) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        Object remove = super.remove(i5);
        Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
        View view = (View) remove;
        Iterator it = this.f16069a.f16072c.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(view, false);
        }
        return view;
    }
}
