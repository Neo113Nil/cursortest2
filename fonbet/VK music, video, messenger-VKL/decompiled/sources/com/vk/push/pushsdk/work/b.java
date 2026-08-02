package com.vk.push.pushsdk.work;

import androidx.work.Data;
import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* compiled from: CheckThatDeletedAppIsHostWorker.kt */
/* loaded from: classes5.dex */
public final class b extends Lambda implements izs<Data.a, Data.a> {
    final /* synthetic */ String $deletedAppPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(1);
        this.$deletedAppPackage = str;
    }

    @Override // xsna.izs
    public final Data.a invoke(Data.a aVar) {
        Data.a aVar2 = aVar;
        aVar2.a.put("DELETED_APP_KEY", this.$deletedAppPackage);
        return aVar2;
    }
}
