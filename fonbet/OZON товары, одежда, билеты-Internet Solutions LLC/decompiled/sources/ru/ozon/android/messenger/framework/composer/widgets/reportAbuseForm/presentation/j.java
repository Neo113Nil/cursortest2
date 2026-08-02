package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.a;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f87100b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f87101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(p pVar, int i11) {
        super(1);
        this.f87100b = pVar;
        this.f87101c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f87100b.g0(new a.b(this.f87101c));
        return Unit.f71690a;
    }
}
