package com.google.android.material.datepicker;

import defpackage.pqd;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i extends pqd {
    public final /* synthetic */ MaterialTextInputPicker a;

    public i(MaterialTextInputPicker materialTextInputPicker) {
        this.a = materialTextInputPicker;
    }

    @Override // defpackage.pqd
    public final void a() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((pqd) it.next()).a();
        }
    }

    @Override // defpackage.pqd
    public final void b(Object obj) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((pqd) it.next()).b(obj);
        }
    }
}
