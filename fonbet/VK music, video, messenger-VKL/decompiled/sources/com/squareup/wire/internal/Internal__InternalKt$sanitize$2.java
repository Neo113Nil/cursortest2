package com.squareup.wire.internal;

import kotlin.jvm.internal.FunctionReference;
import xsna.b890;
import xsna.ecy;
import xsna.fpf0;
import xsna.izs;

/* compiled from: Internal.kt */
/* loaded from: classes14.dex */
public /* synthetic */ class Internal__InternalKt$sanitize$2 extends FunctionReference implements izs<String, String> {
    public static final Internal__InternalKt$sanitize$2 INSTANCE = new Internal__InternalKt$sanitize$2();

    public Internal__InternalKt$sanitize$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, xsna.ccy
    public final String getName() {
        return "sanitize";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final ecy getOwner() {
        fpf0.a.getClass();
        return new b890(Internal__InternalKt.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "sanitize(Ljava/lang/String;)Ljava/lang/String;";
    }

    @Override // xsna.izs
    public final String invoke(String str) {
        return Internal.sanitize(str);
    }
}
