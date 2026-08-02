package com.plaid.internal;

import ei.C4214d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3697n2 extends Lambda implements Function1<C4214d, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3697n2 f40844a = new C3697n2();

    public C3697n2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C4214d c4214d) {
        C4214d Json = c4214d;
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.e(true);
        return Unit.INSTANCE;
    }
}
