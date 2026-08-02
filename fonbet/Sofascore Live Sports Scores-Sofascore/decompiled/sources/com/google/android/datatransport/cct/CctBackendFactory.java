package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.bu0;
import defpackage.cm2;
import defpackage.hy3;
import defpackage.uxj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public uxj create(hy3 hy3Var) {
        Context context = ((bu0) hy3Var).a;
        bu0 bu0Var = (bu0) hy3Var;
        return new cm2(context, bu0Var.b, bu0Var.c);
    }
}
