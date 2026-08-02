package com.vk.dto.money;

import java.util.List;

/* compiled from: MoneyTransferMethod.kt */
/* loaded from: classes18.dex */
public final class SbpTransferMethod extends MoneyTransferMethod {
    public final String e;
    public final boolean f;
    public final List<MoneyReceiverInfo> g;

    public SbpTransferMethod(String str, boolean z, List<MoneyReceiverInfo> list) {
        super(str, z, list);
        this.e = str;
        this.f = z;
        this.g = list;
    }

    @Override // com.vk.dto.money.MoneyTransferMethod
    public final List<MoneyReceiverInfo> Ab() {
        return this.g;
    }

    @Override // com.vk.dto.money.MoneyTransferMethod
    public final String getType() {
        return this.e;
    }

    @Override // com.vk.dto.money.MoneyTransferMethod
    public final boolean zb() {
        return this.f;
    }
}
