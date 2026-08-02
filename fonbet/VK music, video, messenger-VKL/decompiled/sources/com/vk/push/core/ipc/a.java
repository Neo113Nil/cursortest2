package com.vk.push.core.ipc;

import android.os.IInterface;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: BaseIPCClient.kt */
/* loaded from: classes5.dex */
public final class a extends Lambda implements gzs<s3q0> {
    final /* synthetic */ BaseIPCClient<IInterface> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BaseIPCClient<IInterface> baseIPCClient) {
        super(0);
        this.this$0 = baseIPCClient;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Set set;
        set = this.this$0.k;
        if (set.isEmpty()) {
            this.this$0.k();
        }
        return s3q0.a;
    }
}
