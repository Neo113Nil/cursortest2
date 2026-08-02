package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f12766a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u10) {
        super(0);
        this.f12766a = u10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        U u10 = this.f12766a;
        N n9 = u10.f12946f;
        Context context = u10.f12941a;
        n9.getClass();
        return N.a(new L(n9, context));
    }
}
