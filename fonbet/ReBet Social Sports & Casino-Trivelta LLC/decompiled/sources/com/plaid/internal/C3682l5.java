package com.plaid.internal;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3682l5 extends Lambda implements Function0<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3691m5 f40764a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3682l5(C3691m5 c3691m5) {
        super(0);
        this.f40764a = c3691m5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return this.f40764a.f40797a.getApplicationContext().getSharedPreferences("plaid_environment_values", 0);
    }
}
