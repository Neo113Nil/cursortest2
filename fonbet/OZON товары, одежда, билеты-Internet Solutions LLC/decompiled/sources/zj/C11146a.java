package zj;

import Sd0.h;
import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.ozonLogger.android.debug.OzonLoggerDebugActivity;

/* renamed from: zj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C11146a extends AbstractC7737t implements Function1<Td0.c, Intent> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Rd0.a f109296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11146a(Rd0.a aVar) {
        super(1);
        this.f109296b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Intent invoke(Td0.c cVar) {
        Td0.c request = cVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent(this.f109296b.t(), (Class<?>) OzonLoggerDebugActivity.class);
        h a11 = request.a();
        intent.setData(a11 != null ? a11.c() : null);
        return intent;
    }
}
