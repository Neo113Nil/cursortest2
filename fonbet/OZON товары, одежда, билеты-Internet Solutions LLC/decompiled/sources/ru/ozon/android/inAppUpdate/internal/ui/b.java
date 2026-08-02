package ru.ozon.android.inAppUpdate.internal.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f83827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(0);
        this.f83827b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        a aVar = this.f83827b;
        aVar.f83824c = true;
        aVar.dismiss();
        return Unit.f71690a;
    }
}
