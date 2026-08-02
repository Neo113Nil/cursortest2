package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.a;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f87102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(p pVar) {
        super(1);
        this.f87102b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f87102b.g0(new a.e(it));
        return Unit.f71690a;
    }
}
