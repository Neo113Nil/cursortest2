package rl0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class D extends AbstractC7737t implements Function0<Al0.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C9306q f83610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C9306q c9306q) {
        super(0);
        this.f83610b = c9306q;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Al0.a invoke() {
        Context context = this.f83610b.f83706a;
        Intrinsics.checkNotNullParameter(context, "context");
        return Bl0.b0.f3963c.a(context).f3966b;
    }
}
