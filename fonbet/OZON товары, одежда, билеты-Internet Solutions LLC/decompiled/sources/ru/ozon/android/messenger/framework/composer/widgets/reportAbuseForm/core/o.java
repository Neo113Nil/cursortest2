package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.data.ReportAbuseFormDTO;
import ru.ozon.composer.compose.widget.overlay.d;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.e<ReportAbuseFormDTO, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f87047b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87048c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87049d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(a aVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2, ru.ozon.android.messenger.framework.domain.repository.a aVar3, ru.ozon.android.messenger.framework.navigation.controller.a aVar4) {
        super(1);
        this.f87047b = aVar;
        this.f87048c = aVar2;
        this.f87049d = aVar3;
        this.f87050e = aVar4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.overlay.e<ReportAbuseFormDTO, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> eVar) {
        ru.ozon.composer.compose.widget.overlay.e<ReportAbuseFormDTO, ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> overlayViewMapper = eVar;
        Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
        overlayViewMapper.k(j.f87036b, new k(2));
        overlayViewMapper.s(d.a.f94674b, new n(this.f87048c, this.f87049d, this.f87050e));
        return Unit.f71690a;
    }
}
