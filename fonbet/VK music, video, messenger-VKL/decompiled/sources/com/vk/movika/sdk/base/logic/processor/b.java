package com.vk.movika.sdk.base.logic.processor;

import java.util.List;
import xsna.izs;
import xsna.j5g;
import xsna.qgi0;
import xsna.s3q0;
import xsna.tgi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.movika.sdk.base.model.history.c cVar = (com.vk.movika.sdk.base.model.history.c) obj;
                List<String> list = cVar.e;
                String str = this.c;
                return list.contains(str) ? com.vk.movika.sdk.base.model.history.c.a(cVar, null, null, j5g.s0(list, str), null, 47) : cVar;
            default:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
        }
    }
}
