package com.facebook.soloader;

import x8.InterfaceC6804b;

/* loaded from: classes2.dex */
public class u implements InterfaceC6804b {
    @Override // x8.InterfaceC6804b
    public boolean a(String str, int i10) {
        return SoLoader.u(str, (i10 & 1) != 0 ? 16 : 0);
    }
}
