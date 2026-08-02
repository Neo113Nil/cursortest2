package com.vk.mail.auth.contract.di;

import com.vk.mail.auth.contract.result.userblockstatus.MailUserBlockedStatus;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g1;
import xsna.ad00;

/* compiled from: MailAuthInternalComponent.kt */
/* loaded from: classes3.dex */
public final class c implements ad00 {
    @Override // xsna.ad00
    public final g1 invoke() {
        return q.T(MailUserBlockedStatus.NORMAL);
    }
}
