package nm0;

import Bl0.b0;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nm0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8614d extends AbstractC7737t implements Function0<Al0.a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8613c f77394b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8614d(C8613c c8613c) {
        super(0);
        this.f77394b = c8613c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Al0.a invoke() {
        Context context = this.f77394b.f77388a;
        Intrinsics.checkNotNullParameter(context, "context");
        return b0.f3963c.a(context).f3966b;
    }
}
