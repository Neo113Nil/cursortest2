package com.vk.profile.community.members.impl.ui;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: MembersStore.kt */
@b6l(c = "com.vk.profile.community.members.impl.ui.MembersStoreKt", f = "MembersStore.kt", l = {139}, m = "doLoadData")
/* loaded from: classes5.dex */
public final class i extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public i() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j.c(null, null, null, this);
    }
}
