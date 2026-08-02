package com.vk.core.ui.bottomsheet.internal;

import xsna.b5e;
import xsna.jfq;

/* compiled from: ContentSnapStrategy.kt */
/* loaded from: classes17.dex */
public abstract class b {

    /* compiled from: ContentSnapStrategy.kt */
    public static class a {
        public int a;
        public int b;
    }

    public boolean a() {
        return this instanceof jfq;
    }

    public boolean b() {
        return this instanceof b5e;
    }

    public abstract int c(int i, int i2, int i3);

    public abstract int d(int i, int i2, int i3);

    public void e(int i, int i2, int i3, int i4, a aVar) {
        aVar.b = Math.max(0, c(i, i2, i4));
        aVar.a = d(i, i3, i4);
    }
}
