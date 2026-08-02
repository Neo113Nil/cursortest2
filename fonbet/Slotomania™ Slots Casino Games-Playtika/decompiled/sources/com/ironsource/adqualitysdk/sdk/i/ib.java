package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ib {

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<List<Field>> f2470;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f2471;

    public ib() {
        ArrayList arrayList = new ArrayList();
        this.f2470 = arrayList;
        int i = (-1) + 1;
        this.f2471 = i;
        arrayList.add(i, new ArrayList());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final void m7921(Field field) {
        this.f2470.get(this.f2471).add(field);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m7919(Field field) {
        this.f2470.get(this.f2471).remove(field);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m7918() {
        int i = this.f2471 + 1;
        this.f2471 = i;
        this.f2470.add(i, new ArrayList());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    final void m7922() {
        this.f2470.remove(this.f2471);
        this.f2471--;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    final List<List<Field>> m7920() {
        return this.f2470;
    }
}
