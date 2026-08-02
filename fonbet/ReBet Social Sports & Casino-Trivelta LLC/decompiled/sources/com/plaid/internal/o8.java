package com.plaid.internal;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class o8 extends Lambda implements Function0<r8> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p8<u8> f40923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(p8<u8> p8Var) {
        super(0);
        this.f40923a = p8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final r8 invoke() {
        r8 r8Var;
        Bundle arguments = this.f40923a.getArguments();
        if (arguments == null || (r8Var = (r8) arguments.getParcelable("workflow_pane_id")) == null) {
            throw new RuntimeException("Needs pane id");
        }
        return r8Var;
    }
}
