package com.vk.superapp.browser.internal.ui.menu.action;

import com.vk.superapp.browser.internal.ui.menu.action.b;
import java.util.List;
import xsna.z30;

/* compiled from: ActionMenuFilter.kt */
/* loaded from: classes6.dex */
public final class f implements z30 {
    public final List<OtherAction> a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends OtherAction> list) {
        this.a = list;
    }

    @Override // xsna.z30
    public final boolean a(b bVar) {
        if (bVar instanceof b.d) {
            return this.a.contains(((b.d) bVar).b);
        }
        return false;
    }

    @Override // xsna.z30
    public final b b(b bVar) {
        return null;
    }
}
