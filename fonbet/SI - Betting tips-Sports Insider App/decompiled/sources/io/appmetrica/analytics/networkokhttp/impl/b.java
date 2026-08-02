package io.appmetrica.analytics.networkokhttp.impl;

import gh.o0;
import gh.r0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f15172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o0 o0Var) {
        super(0);
        this.f15172a = o0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r0 r0Var = this.f15172a.f10279g;
        if (r0Var != null) {
            return r0Var.m0().inputStream();
        }
        return null;
    }
}
