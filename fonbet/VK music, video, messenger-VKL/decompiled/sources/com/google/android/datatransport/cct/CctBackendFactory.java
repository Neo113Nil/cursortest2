package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import xsna.hbk;
import xsna.rla;
import xsna.rop0;
import xsna.sv5;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements sv5 {
    @Override // xsna.sv5
    public rop0 create(hbk hbkVar) {
        return new rla(hbkVar.a(), hbkVar.d(), hbkVar.c());
    }
}
