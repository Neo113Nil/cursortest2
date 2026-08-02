package rl0;

import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import zl0.C11151b;

/* loaded from: classes8.dex */
public final class U extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f83646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Y y11, ServiceConnection serviceConnection) {
        super(0);
        this.f83645b = y11;
        this.f83646c = serviceConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11151b.b(this.f83645b.f83656a, this.f83646c);
        return Unit.f71690a;
    }
}
