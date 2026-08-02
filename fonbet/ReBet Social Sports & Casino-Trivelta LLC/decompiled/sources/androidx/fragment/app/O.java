package androidx.fragment.app;

import L2.C1380e;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z.C6900a;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static final O f20074a;

    /* renamed from: b, reason: collision with root package name */
    public static final Q f20075b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q f20076c;

    static {
        O o10 = new O();
        f20074a = o10;
        f20075b = new P();
        f20076c = o10.b();
    }

    public static final void a(Fragment inFragment, Fragment outFragment, boolean z10, C6900a sharedElements, boolean z11) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if (z10) {
            outFragment.getEnterTransitionCallback();
        } else {
            inFragment.getEnterTransitionCallback();
        }
    }

    public static final void c(C6900a c6900a, C6900a namedViews) {
        Intrinsics.checkNotNullParameter(c6900a, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = c6900a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) c6900a.j(size))) {
                c6900a.h(size);
            }
        }
    }

    public static final void d(List views, int i10) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }

    public final Q b() {
        try {
            Intrinsics.checkNotNull(C1380e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (Q) C1380e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
