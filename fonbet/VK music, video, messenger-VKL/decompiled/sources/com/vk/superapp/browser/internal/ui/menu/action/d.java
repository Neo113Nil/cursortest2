package com.vk.superapp.browser.internal.ui.menu.action;

import com.vk.superapp.browser.internal.ui.menu.action.b;
import xsna.z30;

/* compiled from: ActionMenuFilter.kt */
/* loaded from: classes6.dex */
public final class d implements z30 {
    @Override // xsna.z30
    public final boolean a(b bVar) {
        return bVar instanceof b.C1871b;
    }

    @Override // xsna.z30
    public final b b(b bVar) {
        b.C1871b c1871b = bVar instanceof b.C1871b ? (b.C1871b) bVar : null;
        if (c1871b != null) {
            return new b.C1871b(c1871b.b, c1871b.c, false);
        }
        return null;
    }
}
