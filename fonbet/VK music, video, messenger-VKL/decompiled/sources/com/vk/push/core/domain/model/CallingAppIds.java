package com.vk.push.core.domain.model;

/* compiled from: CallingAppIds.kt */
/* loaded from: classes5.dex */
public final class CallingAppIds {
    public final int a;
    public final int b;

    public CallingAppIds(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int getPid() {
        return this.b;
    }

    public final int getUid() {
        return this.a;
    }

    public String toString() {
        return "uid = " + this.a + ", pid = " + this.b;
    }
}
