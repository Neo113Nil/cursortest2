package com.vk.voip;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.izs;
import xsna.s3q0;

/* compiled from: OKVoipEngine.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        ((Consumer) this.receiver).accept(th);
        return s3q0.a;
    }
}
