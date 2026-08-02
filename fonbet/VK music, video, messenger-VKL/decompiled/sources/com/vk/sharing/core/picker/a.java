package com.vk.sharing.core.picker;

import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.target.Targets;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.ext0;
import xsna.l4o0;

/* compiled from: BasePickerPresenter.kt */
/* loaded from: classes5.dex */
public abstract class a implements ext0.a, l4o0.b {
    public final GroupPickerActivity b;
    public final Targets c;
    public final l4o0 d;
    public final ext0 e;
    public final GroupPickerInfo f;

    /* compiled from: BasePickerPresenter.kt */
    /* renamed from: com.vk.sharing.core.picker.a$a, reason: collision with other inner class name */
    public interface InterfaceC1780a {
        String getString(int i, Object... objArr);
    }

    public a(GroupPickerActivity groupPickerActivity) {
        this.b = groupPickerActivity;
        this.c = groupPickerActivity.y;
        this.d = groupPickerActivity.z;
        this.e = groupPickerActivity.x;
        this.f = groupPickerActivity.C;
    }

    @Override // xsna.l4o0.b
    public void Z(ArrayList<Target> arrayList) {
        this.c.a(arrayList);
    }

    @Override // xsna.ext0.a
    public final void c() {
        GroupPickerActivity groupPickerActivity = this.b;
        groupPickerActivity.setResult(groupPickerActivity.A ? -1 : 0, groupPickerActivity.B);
        groupPickerActivity.finish();
    }

    @Override // xsna.l4o0.b
    public final void c0() {
        if (this.c.i()) {
            return;
        }
        this.e.g0();
    }

    @Override // xsna.ext0.a
    public final boolean d() {
        return this.f.q;
    }

    @Override // xsna.ext0.a
    public final int f() {
        return this.f.r;
    }

    public final String g(int i, Object... objArr) {
        return this.b.getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // xsna.ext0.a
    public final void h2() {
        this.e.hide();
    }

    @Override // xsna.ext0.a
    public final void i2() {
        this.e.hide();
    }

    @Override // xsna.l4o0.b
    public final void o0() {
        if (this.c.c != null) {
            return;
        }
        this.e.g0();
    }

    @Override // xsna.l4o0.b
    public final void b1() {
    }

    @Override // xsna.l4o0.b
    public final void P(ArrayList<Target> arrayList) {
    }

    @Override // xsna.l4o0.b
    public final void n1(ArrayList<Target> arrayList) {
    }

    @Override // xsna.l4o0.b
    public final void v(ArrayList<Target> arrayList, boolean z) {
    }
}
