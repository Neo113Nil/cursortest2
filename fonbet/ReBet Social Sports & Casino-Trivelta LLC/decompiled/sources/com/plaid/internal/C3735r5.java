package com.plaid.internal;

import ei.C4214d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3735r5 extends Lambda implements Function1<C4214d, Unit> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3735r5 f41026a = new C3735r5();

    public C3735r5() {
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
