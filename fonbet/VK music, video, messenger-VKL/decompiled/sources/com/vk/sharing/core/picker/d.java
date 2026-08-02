package com.vk.sharing.core.picker;

import androidx.annotation.NonNull;
import com.vk.dto.common.id.UserId;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.target.Targets;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.ext0;
import xsna.fkq0;
import xsna.o25;

/* compiled from: UniversalGroupPickerPresenter.java */
/* loaded from: classes5.dex */
public class d extends a {
    public d(@NonNull GroupPickerActivity groupPickerActivity) {
        super(groupPickerActivity);
        this.e.h0(false);
        if (this.f.p) {
            this.e.I1();
        } else {
            this.e.Qd();
        }
        ext0 ext0Var = this.e;
        int i = this.f.j;
        ext0Var.u0(g(i == 0 ? R.string.select : i, new Object[0]), false);
        this.e.setEmptyText(g(R.string.sharing_empty_groups, new Object[0]));
        this.e.setErrorMessage(g(R.string.sharing_error_loading_groups, new Object[0]));
        if (this.c.i()) {
            this.e.setTargets(this.c.g());
            this.e.f0();
        } else {
            this.e.e0();
            if (!this.d.j) {
                i();
            }
        }
        if (this.f.q) {
            this.e.Tj();
        }
    }

    public static Target h(UserId userId, @NonNull ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            Target target = (Target) arrayList.get(i);
            if (target != null && target.c.equals(userId)) {
                return target;
            }
        }
        return null;
    }

    @Override // com.vk.sharing.core.picker.a, xsna.l4o0.b
    public final void Z(@NonNull ArrayList<Target> arrayList) {
        Target target;
        ArrayList<Target> arrayList2 = new ArrayList<>();
        GroupPickerInfo groupPickerInfo = this.f;
        boolean z = groupPickerInfo.f;
        ArrayList arrayList3 = groupPickerInfo.t;
        if (z) {
            target = new Target(o25.a().o().b());
            target.d = g(R.string.community_comments_you, new Object[0]);
            arrayList2.add(target);
        } else {
            target = null;
        }
        UserId userId = groupPickerInfo.g;
        if (userId != groupPickerInfo.h && fkq0.d(userId)) {
            Target h = h(groupPickerInfo.g, arrayList);
            arrayList.remove(h);
            arrayList2.add(h);
        }
        Target h2 = h(groupPickerInfo.h, arrayList);
        if (h2 != null) {
            arrayList.remove(h2);
            arrayList2.add(h2);
        }
        if (!groupPickerInfo.b) {
            Iterator<Target> it = arrayList.iterator();
            while (it.hasNext()) {
                Target next = it.next();
                if (!groupPickerInfo.e || !next.m) {
                    arrayList2.add(next);
                }
            }
        }
        Target h3 = h(groupPickerInfo.g, arrayList2);
        if (h3 != null) {
            h3.g = true;
        } else if (target != null) {
            target.g = true;
        }
        if (groupPickerInfo.s && !arrayList3.isEmpty()) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Target h4 = h((UserId) it2.next(), arrayList2);
                if (h4 != null) {
                    h4.g = true;
                }
            }
        }
        super.Z(arrayList2);
        Targets targets = this.c;
        List<Target> g = targets.g();
        ext0 ext0Var = this.e;
        ext0Var.setTargets(g);
        ext0Var.f0();
        if (groupPickerInfo.p) {
            ext0Var.I1();
        } else if (Collections.unmodifiableList(targets.b).size() > 0) {
            ext0Var.ve();
        } else {
            ext0Var.Qd();
        }
    }

    @Override // xsna.ext0.a
    public final void a() {
        boolean z = this.f.s;
        GroupPickerActivity groupPickerActivity = this.b;
        ext0 ext0Var = this.e;
        Targets targets = this.c;
        if (z) {
            List<Target> unmodifiableList = Collections.unmodifiableList(targets.b);
            if (unmodifiableList.size() > 0) {
                ext0Var.hide();
                groupPickerActivity.T1(unmodifiableList);
                return;
            }
            return;
        }
        Iterator it = Collections.unmodifiableList(targets.b).iterator();
        Target target = it.hasNext() ? (Target) it.next() : null;
        if (target != null) {
            ext0Var.hide();
            groupPickerActivity.U1(target);
        }
    }

    @Override // xsna.ext0.a
    public final void b() {
        if (this.d.j) {
            return;
        }
        i();
        this.e.e0();
    }

    @Override // xsna.ext0.a
    public final void e(@NonNull Target target, int i) {
        int i2;
        Target target2;
        GroupPickerInfo groupPickerInfo = this.f;
        boolean z = groupPickerInfo.s;
        Targets targets = this.c;
        ext0 ext0Var = this.e;
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = Collections.unmodifiableList(targets.b).iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(ext0Var.S1((Target) it.next())));
            }
            if (!groupPickerInfo.d && arrayList.size() == 1 && ((Integer) arrayList.get(0)).intValue() == i) {
                return;
            }
            Targets.j(targets.d, target);
            targets.k(target);
            ext0Var.D0(i);
            this.b.T1(Collections.unmodifiableList(targets.b));
            return;
        }
        Iterator it2 = Collections.unmodifiableList(targets.b).iterator();
        if (it2.hasNext()) {
            target2 = (Target) it2.next();
            i2 = ext0Var.S1(target2);
        } else {
            i2 = -1;
            target2 = null;
        }
        if (i2 != i) {
            if (target2 != null) {
                targets.d();
                ext0Var.D0(i2);
            }
            Targets.j(targets.d, target);
            targets.k(target);
            ext0Var.D0(i);
        } else if (groupPickerInfo.d) {
            Targets.j(targets.d, target2);
            targets.k(target2);
            ext0Var.D0(i2);
        }
        if (Collections.unmodifiableList(targets.b).size() <= 0) {
            ext0Var.Qd();
        } else if (groupPickerInfo.i) {
            a();
        } else {
            ext0Var.ve();
        }
    }

    public void i() {
        this.d.c(this.f.l, false);
    }
}
