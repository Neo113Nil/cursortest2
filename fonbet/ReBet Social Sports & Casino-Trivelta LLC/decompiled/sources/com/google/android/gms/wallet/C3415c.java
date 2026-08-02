package com.google.android.gms.wallet;

import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.internal.wallet.zzy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AbstractC3416d;

/* renamed from: com.google.android.gms.wallet.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3415c extends com.google.android.gms.common.api.e {
    public C3415c(Context context, AbstractC3416d.a aVar) {
        super(context, AbstractC3416d.f34612a, aVar, e.a.f32290c);
    }

    public Task d(final IsReadyToPayRequest isReadyToPayRequest) {
        return doRead(AbstractC3163x.a().e(23705).b(new InterfaceC3153s() { // from class: com.google.android.gms.wallet.j
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzy) obj).zzs(IsReadyToPayRequest.this, (TaskCompletionSource) obj2);
            }
        }).a());
    }

    public Task e(final PaymentDataRequest paymentDataRequest) {
        return doWrite(AbstractC3163x.a().b(new InterfaceC3153s() { // from class: com.google.android.gms.wallet.k
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final void accept(Object obj, Object obj2) {
                ((zzy) obj).zzt(PaymentDataRequest.this, (TaskCompletionSource) obj2);
            }
        }).d(x.f34673c).c(true).e(23707).a());
    }
}
