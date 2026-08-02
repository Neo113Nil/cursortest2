package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.scrollable.j<ReportAbuseFormDTO, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f87034b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.analytics.i f87035c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(a aVar, ru.ozon.android.messenger.framework.analytics.i iVar) {
        super(1);
        this.f87034b = aVar;
        this.f87035c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.scrollable.j<ReportAbuseFormDTO, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> jVar) {
        ru.ozon.composer.compose.widget.scrollable.j<ReportAbuseFormDTO, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> viewMapper = jVar;
        Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
        viewMapper.k(d.f87029b, new e(2));
        viewMapper.G(new h(this.f87035c));
        return Unit.f71690a;
    }
}
