package com.vk.sharing.core;

import android.text.TextUtils;
import android.view.View;
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
import java.util.List;
import xsna.l4o0;
import xsna.mk5;
import xsna.nlf0;
import xsna.t6g0;
import xsna.zmp0;

/* compiled from: GroupSearchPresenter.java */
/* loaded from: classes5.dex */
public final class e extends com.vk.sharing.core.a {
    public final boolean l;
    public final a m;

    /* compiled from: GroupSearchPresenter.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            l4o0 l4o0Var = eVar.h;
            String str = eVar.g.g;
            if (l4o0Var.k) {
                return;
            }
            l4o0Var.k = !l4o0Var.k;
            t6g0 t6g0Var = t6g0.b;
            t6g0.b().r0(str, new nlf0(l4o0Var, 5));
        }
    }

    public e(@NonNull BaseSharingActivity baseSharingActivity) {
        super(baseSharingActivity, null);
        this.m = new a();
        f();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void K2(@NonNull Target target, int i) {
        l lVar = this.i;
        lVar.D0(lVar.S1(target));
    }

    @Override // com.vk.sharing.core.a, xsna.l4o0.b
    public final void Z(@NonNull ArrayList<Target> arrayList) {
        super.Z(arrayList);
        l lVar = this.i;
        if (lVar.Vg()) {
            lVar.Mh(this.g.g(), false);
            lVar.f0();
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void b() {
        if (this.h.j) {
            return;
        }
        this.h.c(2, false);
        this.i.e0();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void e(@NonNull Target target, int i) {
        d.i(((View) this.i).getContext(), target);
    }

    public final void f() {
        this.i.setFullScreen(true);
        this.i.E9();
        this.i.hideTitle();
        this.i.setEmptyText(this.f.getString(R.string.nothing_found, new Object[0]));
        this.i.setErrorMessage(this.f.getString(R.string.sharing_error_loading_groups, new Object[0]));
        this.i.Gf();
        this.i.setSearchHint(this.f.getString(R.string.sharing_hint_search_by_groups, new Object[0]));
        this.i.I1();
        if (!this.g.i()) {
            if (!this.h.j) {
                this.h.c(2, false);
            }
            this.i.e0();
            return;
        }
        if (TextUtils.isEmpty(this.g.g)) {
            this.i.Mh(this.g.g(), false);
        } else {
            this.i.setSearchQuery(this.g.g);
            l lVar = this.i;
            List<Target> list = this.g.e;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            lVar.Mh(list, false);
        }
        this.i.f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void h2() {
        this.i.d0();
        a.InterfaceC1778a interfaceC1778a = this.f;
        d dVar = new d(interfaceC1778a, null);
        dVar.l = false;
        boolean z = this.l;
        l lVar = dVar.i;
        lVar.setFullScreen(z);
        mk5 mk5Var = new mk5();
        mk5Var.e(100L);
        mk5Var.excludeTarget(R.id.content_animator, true);
        zmp0.a((ViewGroup) lVar, mk5Var.excludeTarget(R.id.targets_recycler, true));
        Targets targets = dVar.g;
        targets.e = null;
        targets.g = "";
        lVar.j7();
        lVar.uk();
        lVar.O8();
        lVar.n8();
        dVar.f();
        interfaceC1778a.f3(dVar);
        this.h.a();
    }

    @Override // com.vk.sharing.core.a, xsna.l4o0.b
    public final void n1(@NonNull ArrayList<Target> arrayList) {
        P(arrayList);
        l lVar = this.i;
        if (lVar.Vg()) {
            return;
        }
        List<Target> list = this.g.e;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        lVar.Mh(list, false);
        lVar.f0();
        lVar.ta();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void p2(@NonNull String str) {
        Targets targets = this.g;
        targets.g = str;
        boolean isEmpty = TextUtils.isEmpty(str);
        l lVar = this.i;
        if (isEmpty) {
            lVar.Mh(targets.g(), false);
            lVar.f0();
            lVar.ta();
        } else {
            View view = lVar.getView();
            a aVar = this.m;
            view.removeCallbacks(aVar);
            lVar.getView().postDelayed(aVar, 300L);
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final boolean q2() {
        return true;
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void u2(@NonNull Target target, int i, @Nullable String str) {
        Targets targets = this.g;
        Targets.j(targets.e, target);
        targets.k(target);
        if (str == null) {
            str = this.i.getCommentText();
        }
        this.f.c3(str, Collections.singletonList(target));
    }

    public e(@NonNull d dVar) {
        super(dVar.f, null);
        this.m = new a();
        this.l = dVar.e;
        f();
    }
}
