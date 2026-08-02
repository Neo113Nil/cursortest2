package ol0;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import zl0.C11151b;

/* renamed from: ol0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8750b extends AbstractC7737t implements Function1<wl0.c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f78426b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M<ServiceConnection> f78427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8750b(Context context, M<ServiceConnection> m11) {
        super(1);
        this.f78426b = context;
        this.f78427c = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(wl0.c cVar) {
        wl0.c it = cVar;
        Intrinsics.checkNotNullParameter(it, "it");
        C11151b.b(this.f78426b, this.f78427c.f71787a);
        return Unit.f71690a;
    }
}
