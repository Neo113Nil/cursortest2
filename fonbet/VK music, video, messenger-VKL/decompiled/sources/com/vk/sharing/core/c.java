package com.vk.sharing.core;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.a;
import com.vk.sharing.core.target.Targets;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.cvk;
import xsna.g5g;
import xsna.ire;
import xsna.l4o0;
import xsna.pu5;
import xsna.qfq;

/* compiled from: DialogSearchPresenter.java */
/* loaded from: classes5.dex */
public final class c extends a {
    public final Runnable l;
    public final boolean m;

    public c(@NonNull BaseSharingActivity baseSharingActivity) {
        super(baseSharingActivity, null);
        this.l = new pu5(this, 5);
        f();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void E2(boolean z) {
        Targets targets = this.g;
        int size = targets.b.size();
        a.InterfaceC1778a interfaceC1778a = this.f;
        if (size == 0) {
            cvk.w(interfaceC1778a.getString(R.string.sharing_toast_choose_target, new Object[0]), false);
            return;
        }
        l lVar = this.i;
        interfaceC1778a.b3(lVar.getCommentText(), Collections.unmodifiableList(targets.b), true);
        lVar.hide();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void H2(int i) {
        b bVar = new b(this);
        this.f.f3(bVar);
        bVar.H2(i);
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final boolean I2() {
        return a.j && this.g.b.size() > 0;
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void K2(@NonNull Target target, int i) {
        l lVar = this.i;
        lVar.D0(lVar.S1(target));
    }

    @Override // com.vk.sharing.core.a, xsna.l4o0.b
    public final void P(@NonNull ArrayList<Target> arrayList) {
        super.P(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Targets targets = this.g;
        if (TextUtils.isGraphic(targets.g)) {
            arrayList2.addAll(arrayList);
            l lVar = this.i;
            lVar.Mh(arrayList2, false);
            lVar.f0();
            lVar.ta();
            return;
        }
        List unmodifiableList = Collections.unmodifiableList(targets.b);
        Collection collection = targets.e;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        ArrayList arrayList3 = new ArrayList(collection);
        Objects.requireNonNull(unmodifiableList);
        g5g.D(arrayList3, true, new ire(unmodifiableList, 11));
        arrayList2.addAll(unmodifiableList);
        arrayList2.addAll(arrayList3);
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void b() {
        if (this.h.i) {
            return;
        }
        this.h.b(this.g.f(), null, null);
        this.i.e0();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void e(@NonNull Target target, int i) {
        this.f.x3(target);
    }

    public final void f() {
        l lVar = this.i;
        lVar.setFullScreen(true);
        lVar.E9();
        lVar.hideTitle();
        a.InterfaceC1778a interfaceC1778a = this.f;
        lVar.setEmptyText(interfaceC1778a.getString(R.string.nothing_found, new Object[0]));
        lVar.setErrorMessage(interfaceC1778a.getString(R.string.sharing_error_loading_dialogs, new Object[0]));
        lVar.Gf();
        lVar.setSearchHint(interfaceC1778a.getString(R.string.sharing_hint_search_by_dialogs, new Object[0]));
        lVar.I1();
        boolean z = a.j;
        Targets targets = this.g;
        if (z) {
            lVar.ug(targets.b.size() > 0);
        }
        l4o0 l4o0Var = this.h;
        l4o0Var.a();
        if (!TextUtils.isGraphic(targets.g)) {
            if (!targets.f().isEmpty()) {
                lVar.Mh(targets.f(), true);
                return;
            } else {
                l4o0Var.e("");
                lVar.e0();
                return;
            }
        }
        lVar.setSearchQuery(targets.g);
        List<Target> list = targets.e;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        lVar.Mh(list, false);
        lVar.f0();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void h2() {
        this.i.d0();
        this.f.f3(new b(this));
        this.h.a();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void k2(@NonNull qfq qfqVar) {
        b bVar = new b(this);
        this.f.f3(bVar);
        bVar.k2(qfqVar);
        this.h.a();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void l2(@NonNull Target target, int i, boolean z) {
        Targets targets = this.g;
        Targets.j(targets.e, target);
        targets.k(target);
        if (a.j) {
            this.i.ug(targets.b.size() > 0);
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void p2(@NonNull String str) {
        Targets targets = this.g;
        targets.g = str;
        boolean isGraphic = TextUtils.isGraphic(str);
        l lVar = this.i;
        if (!isGraphic) {
            lVar.Mh(targets.f(), true);
            lVar.f0();
            lVar.ta();
        } else {
            View view = lVar.getView();
            Runnable runnable = this.l;
            view.removeCallbacks(runnable);
            lVar.getView().postDelayed(runnable, 300L);
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void u2(@NonNull Target target, int i, @Nullable String str) {
        Targets targets = this.g;
        Targets.j(targets.e, target);
        targets.k(target);
        if (str == null) {
            str = this.i.getCommentText();
        }
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, target);
        this.f.b3(str, arrayList, false);
    }

    @Override // com.vk.sharing.core.a, xsna.l4o0.b
    public final void v(@NonNull ArrayList<Target> arrayList, boolean z) {
        super.v(arrayList, z);
        l lVar = this.i;
        if (lVar.Vg()) {
            lVar.Mh(this.g.f(), false);
            lVar.f0();
            lVar.ta();
        }
    }

    public c(@NonNull b bVar, boolean z) {
        super(bVar.f, Boolean.valueOf(z));
        this.l = new pu5(this, 5);
        this.m = bVar.e;
        f();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void x2(boolean z) {
    }
}
