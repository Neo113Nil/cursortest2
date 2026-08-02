package com.vk.sharing.core.picker;

import androidx.annotation.NonNull;
import com.vk.dto.common.id.UserId;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.ext0;
import xsna.fkq0;
import xsna.l4o0;
import xsna.n4o0;
import xsna.npu;
import xsna.o25;

/* compiled from: GroupPickerPresenter.java */
/* loaded from: classes5.dex */
public final class c extends a {
    public c(@NonNull GroupPickerActivity groupPickerActivity) {
        super(groupPickerActivity);
        this.e.h0(false);
        ext0 ext0Var = this.e;
        int i = this.f.j;
        ext0Var.u0(g(i == 0 ? R.string.community_comments_author_of_comment : i, new Object[0]), false);
        this.e.setEmptyText(g(R.string.sharing_empty_groups, new Object[0]));
        this.e.setErrorMessage(g(R.string.sharing_error_loading_groups, new Object[0]));
        this.e.I1();
        if (this.c.i()) {
            this.e.setTargets(this.c.g());
            this.e.f0();
            return;
        }
        this.e.e0();
        if (this.d.j) {
            return;
        }
        l4o0 l4o0Var = this.d;
        UserId userId = this.f.h;
        if (l4o0Var.j) {
            return;
        }
        l4o0Var.f();
        npu.a().b(new n4o0(l4o0Var, userId));
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
        ArrayList<Target> arrayList2 = new ArrayList<>();
        Target target = new Target(o25.a().o().b());
        target.d = g(R.string.community_comments_you, new Object[0]);
        arrayList2.add(target);
        GroupPickerInfo groupPickerInfo = this.f;
        UserId userId = groupPickerInfo.g;
        if (userId != groupPickerInfo.h && fkq0.d(userId)) {
            Target h = h(fkq0.e(groupPickerInfo.g), arrayList);
            arrayList.remove(h);
            arrayList2.add(h);
        }
        Target h2 = h(fkq0.e(groupPickerInfo.h), arrayList);
        if (h2 != null) {
            arrayList.remove(h2);
            arrayList2.add(h2);
        }
        if (groupPickerInfo.c) {
            Iterator<Target> it = arrayList.iterator();
            while (it.hasNext()) {
                Target next = it.next();
                boolean z = (groupPickerInfo.b || next.m) ? false : true;
                boolean z2 = next.q;
                boolean z3 = next.r;
                if (z || z2 || z3) {
                    arrayList2.add(next);
                }
            }
        }
        Target h3 = h(groupPickerInfo.g, arrayList2);
        if (h3 != null) {
            h3.g = true;
        } else {
            target.g = true;
        }
        super.Z(arrayList2);
        List<Target> g = this.c.g();
        ext0 ext0Var = this.e;
        ext0Var.setTargets(g);
        ext0Var.f0();
    }

    @Override // xsna.ext0.a
    public final void a() {
        Iterator it = Collections.unmodifiableList(this.c.b).iterator();
        Target target = it.hasNext() ? (Target) it.next() : null;
        if (target != null) {
            this.b.U1(target);
            this.e.hide();
        }
    }

    @Override // xsna.ext0.a
    public final void b() {
        if (this.d.j) {
            return;
        }
        l4o0 l4o0Var = this.d;
        UserId userId = this.f.h;
        if (!l4o0Var.j) {
            l4o0Var.f();
            npu.a().b(new n4o0(l4o0Var, userId));
        }
        this.e.e0();
    }

    @Override // xsna.ext0.a
    public final void e(@NonNull Target target, int i) {
        this.b.U1(target);
        this.e.hide();
    }
}
