package rl0;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rl0.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9304o extends AbstractC7737t implements Function1<Intent, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9304o(Y y11, int i11) {
        super(1);
        this.f83701b = y11;
        this.f83702c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Intent intent) {
        Intent intent2 = intent;
        Intrinsics.checkNotNullParameter(intent2, "intent");
        intent2.putExtra("RUN_INSTALL", true);
        intent2.putExtra("PACKAGE_NAME", this.f83701b.f83656a.getPackageName());
        intent2.putExtra("AppUpdateType", this.f83702c);
        return Unit.f71690a;
    }
}
