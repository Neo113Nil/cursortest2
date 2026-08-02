package defpackage;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@x8d("dialog")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lu15;", "Ly8d;", "Ls15;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u15 extends y8d {
    public final Context c;
    public final s d;
    public final LinkedHashSet e;
    public final nqf f;
    public final LinkedHashMap g;

    public u15(Context context, s sVar) {
        context.getClass();
        sVar.getClass();
        this.c = context;
        this.d = sVar;
        this.e = new LinkedHashSet();
        this.f = new nqf(this, 3);
        this.g = new LinkedHashMap();
    }

    @Override // defpackage.y8d
    public final s6d a() {
        return new s15(this);
    }

    @Override // defpackage.y8d
    public final void d(List list, u7d u7dVar) {
        list.getClass();
        s sVar = this.d;
        if (sVar.S()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d6d d6dVar = (d6d) it.next();
            k(d6dVar).p(sVar, d6dVar.f);
            d6d d6dVar2 = (d6d) CollectionsKt.j0((List) b().e.a.getValue());
            boolean R = CollectionsKt.R((Iterable) b().f.a.getValue(), d6dVar2);
            b().i(d6dVar);
            if (d6dVar2 != null && !R) {
                b().c(d6dVar2);
            }
        }
    }

    @Override // defpackage.y8d
    public final void e(h6d h6dVar) {
        g6b lifecycle;
        this.a = h6dVar;
        this.b = true;
        Iterator it = ((List) h6dVar.e.a.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s sVar = this.d;
            if (!hasNext) {
                sVar.q.add(new lp8() { // from class: r15
                    @Override // defpackage.lp8
                    public final void a(s sVar2, Fragment fragment) {
                        sVar2.getClass();
                        u15 u15Var = u15.this;
                        LinkedHashSet linkedHashSet = u15Var.e;
                        if (i5k.a(linkedHashSet).remove(fragment.getTag())) {
                            fragment.getLifecycle().a(u15Var.f);
                        }
                        LinkedHashMap linkedHashMap = u15Var.g;
                        i5k.c(linkedHashMap).remove(fragment.getTag());
                    }
                });
                return;
            }
            d6d d6dVar = (d6d) it.next();
            DialogFragment dialogFragment = (DialogFragment) sVar.F(d6dVar.f);
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.e.add(d6dVar.f);
            } else {
                lifecycle.a(this.f);
            }
        }
    }

    @Override // defpackage.y8d
    public final void f(d6d d6dVar) {
        s sVar = this.d;
        if (sVar.S()) {
            return;
        }
        String str = d6dVar.f;
        DialogFragment dialogFragment = (DialogFragment) this.g.get(str);
        if (dialogFragment == null) {
            Fragment F = sVar.F(str);
            dialogFragment = F instanceof DialogFragment ? (DialogFragment) F : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().d(this.f);
            dialogFragment.j();
        }
        k(d6dVar).p(sVar, str);
        h6d b = b();
        List list = (List) b.e.a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            d6d d6dVar2 = (d6d) listIterator.previous();
            if (d6dVar2.f.equals(str)) {
                fdi fdiVar = b.c;
                fdiVar.m(null, y9h.g(y9h.g((Set) fdiVar.getValue(), d6dVar2), d6dVar));
                b.d(d6dVar);
                return;
            }
        }
        ogj.m("List contains no element matching the predicate.");
    }

    @Override // defpackage.y8d
    public final void i(d6d d6dVar, boolean z) {
        s sVar = this.d;
        if (sVar.S()) {
            return;
        }
        List list = (List) b().e.a.getValue();
        int indexOf = list.indexOf(d6dVar);
        Iterator it = CollectionsKt.B0(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment F = sVar.F(((d6d) it.next()).f);
            if (F != null) {
                ((DialogFragment) F).j();
            }
        }
        l(indexOf, d6dVar, z);
    }

    public final DialogFragment k(d6d d6dVar) {
        s6d s6dVar = d6dVar.b;
        s6dVar.getClass();
        s15 s15Var = (s15) s6dVar;
        String str = s15Var.g;
        if (str == null) {
            a70.r("DialogFragment class was not set");
            return null;
        }
        char charAt = str.charAt(0);
        Context context = this.c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        xo8 M = this.d.M();
        context.getClassLoader();
        Fragment a = M.a(str);
        a.getClass();
        if (DialogFragment.class.isAssignableFrom(a.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) a;
            dialogFragment.setArguments(d6dVar.h.a());
            dialogFragment.getLifecycle().a(this.f);
            this.g.put(d6dVar.f, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = s15Var.g;
        if (str2 != null) {
            ogj.h(mz1.o(sb, str2, " is not an instance of DialogFragment"));
            return null;
        }
        a70.r("DialogFragment class was not set");
        return null;
    }

    public final void l(int i, d6d d6dVar, boolean z) {
        d6d d6dVar2 = (d6d) CollectionsKt.a0(i - 1, (List) b().e.a.getValue());
        boolean R = CollectionsKt.R((Iterable) b().f.a.getValue(), d6dVar2);
        b().f(d6dVar, z);
        if (d6dVar2 == null || R) {
            return;
        }
        b().c(d6dVar2);
    }
}
