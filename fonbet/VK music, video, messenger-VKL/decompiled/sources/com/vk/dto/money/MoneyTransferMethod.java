package com.vk.dto.money;

import com.vk.core.serialize.Serializer;
import java.util.List;

/* compiled from: MoneyTransferMethod.kt */
/* loaded from: classes18.dex */
public abstract class MoneyTransferMethod extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final boolean c;
    public final List<MoneyReceiverInfo> d;

    public MoneyTransferMethod(String str, boolean z, List<MoneyReceiverInfo> list) {
        this.b = str;
        this.c = z;
        this.d = list;
    }

    public List<MoneyReceiverInfo> Ab() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(getType());
        serializer.L(zb() ? (byte) 1 : (byte) 0);
        serializer.W(Ab());
    }

    public String getType() {
        return this.b;
    }

    public boolean zb() {
        return this.c;
    }
}
