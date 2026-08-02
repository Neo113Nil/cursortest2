package com.vk.movika.sdk.base.ui;

import android.util.Log;
import com.vk.movika.sdk.player.base.components.b;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes3.dex */
public final class w0 implements b.a {
    public final /* synthetic */ izs<com.vk.movika.sdk.player.base.model.a, s3q0> a;
    public final /* synthetic */ com.vk.movika.sdk.player.base.model.a b;

    /* JADX WARN: Multi-variable type inference failed */
    public w0(izs<? super com.vk.movika.sdk.player.base.model.a, s3q0> izsVar, com.vk.movika.sdk.player.base.model.a aVar) {
        this.a = izsVar;
        this.b = aVar;
    }

    @Override // com.vk.movika.sdk.player.base.components.b.a
    public final void a(com.vk.movika.sdk.player.base.model.a aVar) {
        izs<com.vk.movika.sdk.player.base.model.a, s3q0> izsVar = this.a;
        if (izsVar != null) {
            izsVar.invoke(aVar);
        }
    }

    @Override // com.vk.movika.sdk.player.base.components.b.a
    public final void b(com.vk.movika.sdk.player.base.model.a aVar, RuntimeException runtimeException) {
        if (com.vk.movika.sdk.utils.f.b.b - 3 <= 0) {
            String str = "resolvePlayerItem: error " + runtimeException + ". Trying to send source PlayerItem instead";
            if (str == null) {
                str = "";
            }
            Log.e(com.vk.movika.sdk.utils.c.a(this, "PlayerController"), str, runtimeException);
        }
        izs<com.vk.movika.sdk.player.base.model.a, s3q0> izsVar = this.a;
        if (izsVar != null) {
            izsVar.invoke(this.b);
        }
    }
}
