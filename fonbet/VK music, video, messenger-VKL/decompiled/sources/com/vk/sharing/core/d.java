package com.vk.sharing.core;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.a;
import com.vk.sharing.core.target.Targets;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import xsna.cvk;
import xsna.ecj0;
import xsna.mk5;
import xsna.o0r0;
import xsna.xwk;
import xsna.ylu;
import xsna.zmp0;

/* compiled from: GroupPostPresenter.java */
/* loaded from: classes5.dex */
public final class d extends a {
    public boolean l;

    public static void i(Context context, @NonNull Target target) {
        xwk.e().m(context, target.c, new o0r0.a(false, "", null, null, null, null, null, false, false, false, false, null, null, null, 3072));
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void D2() {
        this.i.se();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void E2(boolean z) {
        Targets targets = this.g;
        int size = targets.b.size();
        a.InterfaceC1778a interfaceC1778a = this.f;
        if (size == 0) {
            cvk.w(interfaceC1778a.getString(R.string.sharing_toast_choose_community, new Object[0]), false);
            return;
        }
        l lVar = this.i;
        interfaceC1778a.c3(lVar.getCommentText(), Collections.unmodifiableList(targets.b));
        lVar.hide();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final boolean I2() {
        return a.j || a.k;
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void K2(@NonNull Target target, int i) {
        l lVar = this.i;
        lVar.D0(lVar.S1(target));
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void O2(boolean z) {
        this.f.f3(new e(this));
    }

    @Override // com.vk.sharing.core.a, xsna.l4o0.b
    public final void Z(@NonNull ArrayList<Target> arrayList) {
        super.Z(arrayList);
        this.i.Mh(this.g.g(), false);
        g();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void b() {
        if (this.h.j) {
            return;
        }
        this.h.c(2, true);
        this.i.e0();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void e(@NonNull Target target, int i) {
        i(this.i.getView().getContext(), target);
    }

    public final void f() {
        this.i.tm();
        this.i.showTitle();
        this.i.Gf();
        this.i.u0(this.f.getString(R.string.sharing_title3, new Object[0]), false);
        this.i.setEmptyText(this.f.getString(R.string.sharing_empty_groups, new Object[0]));
        this.i.setErrorMessage(this.f.getString(R.string.sharing_error_loading_groups, new Object[0]));
        this.i.setSearchHint(this.f.getString(R.string.sharing_hint_search_by_groups, new Object[0]));
        this.i.mh(false);
        this.i.setCommentHint(false);
        this.i.Mh(this.g.g(), false);
        if (this.g.i()) {
            g();
        } else {
            this.i.e0();
            this.i.Pg();
            if (!this.h.j) {
                this.h.c(2, true);
            }
        }
        this.i.Sb();
    }

    public final void g() {
        Targets targets = this.g;
        long count = targets.g().stream().filter(new ylu(0)).count();
        l lVar = this.i;
        if (count > 0) {
            if (a.j) {
                lVar.ug(true);
            } else {
                lVar.mh(true);
            }
        }
        if (targets.g().isEmpty()) {
            lVar.ee();
            lVar.Pg();
        } else {
            lVar.uk();
            lVar.V5();
        }
        lVar.f0();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void h2() {
        this.i.tg();
        a.InterfaceC1778a interfaceC1778a = this.f;
        b bVar = new b(interfaceC1778a, null);
        bVar.n = false;
        bVar.o = null;
        new io.reactivex.rxjava3.disposables.b();
        ViewGroup viewGroup = (ViewGroup) bVar.i;
        mk5 mk5Var = new mk5();
        mk5Var.e(100L);
        mk5Var.excludeTarget(R.id.content_animator, true);
        zmp0.a(viewGroup, mk5Var.excludeTarget(R.id.targets_recycler, true));
        bVar.i();
        bVar.i.uk();
        bVar.i.Pk();
        bVar.g.d();
        ecj0 ecj0Var = ((BaseSharingActivity) bVar.f).v;
        if (ecj0Var != null) {
            ecj0Var.d.clear();
            ecj0Var.e.clear();
        }
        Targets targets = bVar.g;
        if (targets.c != null) {
            bVar.i.Mh(targets.f(), true);
            bVar.i.f0();
        } else {
            if (!bVar.h.i) {
                bVar.h.b(Collections.EMPTY_LIST, null, null);
            }
            bVar.i.Mh(Collections.EMPTY_LIST, true);
            bVar.i.xa();
        }
        bVar.i.Sb();
        bVar.j(true);
        bVar.g();
        interfaceC1778a.f3(bVar);
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void l2(@NonNull Target target, int i, boolean z) {
        Targets targets = this.g;
        ArrayList<Target> arrayList = targets.c;
        LinkedList<Target> linkedList = targets.b;
        Targets.j(arrayList, target);
        targets.k(target);
        boolean z2 = a.j;
        l lVar = this.i;
        if (z2 || a.k) {
            lVar.ug(linkedList.size() > 0);
        }
        if (linkedList.size() == 0) {
            lVar.d0();
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void m2(boolean z) {
        this.e = z;
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void u2(@NonNull Target target, int i, @Nullable String str) {
        Targets targets = this.g;
        Targets.j(targets.c, target);
        targets.k(target);
        if (str == null) {
            str = this.i.getCommentText();
        }
        this.f.c3(str, Collections.singletonList(target));
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void x2(boolean z) {
        l lVar = this.i;
        if (z) {
            if (lVar.getFullScreen()) {
                return;
            }
            this.l = true;
            lVar.setFullScreen(true);
            return;
        }
        if (this.l) {
            lVar.setFullScreen(false);
            this.l = false;
        }
    }
}
