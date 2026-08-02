package com.vk.movika.sdk.base.ui;

import android.content.Context;
import xsna.gzs;
import xsna.o25;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(com.vk.channelrestrictions.b bVar, boolean z, Context context) {
        this.d = bVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((y) obj).d.j.s(z);
                break;
            default:
                com.vk.channelrestrictions.b bVar = (com.vk.channelrestrictions.b) obj;
                int i2 = com.vk.channelrestrictions.b.h1;
                if (z || o25.a().b()) {
                    bVar.co(false);
                } else {
                    o25.a().getClass();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n(y yVar, boolean z) {
        this.d = yVar;
        this.c = z;
    }
}
