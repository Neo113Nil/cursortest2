package ol0;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;
import zl0.C11151b;

/* renamed from: ol0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8749a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f78424b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M<ServiceConnection> f78425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8749a(Context context, M<ServiceConnection> m11) {
        super(0);
        this.f78424b = context;
        this.f78425c = m11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11151b.b(this.f78424b, this.f78425c.f71787a);
        return Unit.f71690a;
    }
}
