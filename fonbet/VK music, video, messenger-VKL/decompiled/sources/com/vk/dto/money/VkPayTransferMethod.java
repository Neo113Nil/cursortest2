package com.vk.dto.money;

import com.vk.core.serialize.Serializer;
import java.util.List;

/* compiled from: MoneyTransferMethod.kt */
/* loaded from: classes18.dex */
public final class VkPayTransferMethod extends MoneyTransferMethod {
    public static final Serializer.c<VkPayTransferMethod> CREATOR = new a();
    public final String e;
    public final boolean f;
    public final List<MoneyReceiverInfo> g;
    public final String h;
    public final int i;
    public final String j;
    public final int k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkPayTransferMethod> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkPayTransferMethod a(Serializer serializer) {
            return new VkPayTransferMethod(serializer.H(), serializer.m(), serializer.l(MoneyReceiverInfo.class.getClassLoader()), serializer.H(), serializer.u(), serializer.H(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkPayTransferMethod[i];
        }
    }

    public VkPayTransferMethod(String str, boolean z, List<MoneyReceiverInfo> list, String str2, int i, String str3, int i2) {
        super(str, z, list);
        this.e = str;
        this.f = z;
        this.g = list;
        this.h = str2;
        this.i = i;
        this.j = str3;
        this.k = i2;
    }

    @Override // com.vk.dto.money.MoneyTransferMethod
    public final List<MoneyReceiverInfo> Ab() {
        return this.g;
    }

    @Override // com.vk.dto.money.MoneyTransferMethod, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.h);
        serializer.S(this.i);
        serializer.j0(this.j);
        serializer.S(this.k);
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
