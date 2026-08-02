package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class C extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0466s f12084a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C0466s c0466s) {
        super(1);
        this.f12084a = c0466s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f12084a.j = (byte[]) obj;
        return Unit.f19194a;
    }
}
