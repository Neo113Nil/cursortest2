package ei0;

import android.content.Context;
import fi0.x;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ei0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6368a extends AbstractC7737t implements Function2<Context, x, InterfaceC6369b> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6368a f62343b = new C6368a(2);

    @Override // kotlin.jvm.functions.Function2
    public final InterfaceC6369b invoke(Context context, x xVar) {
        Context context2 = context;
        x settings = xVar;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new C6370c(context2, settings);
    }
}
