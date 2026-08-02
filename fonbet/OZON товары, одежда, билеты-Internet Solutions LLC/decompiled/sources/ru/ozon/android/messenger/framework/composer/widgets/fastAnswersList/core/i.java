package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.data.FastAnswerTemplateListDTO;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.scrollable.j<FastAnswerTemplateListDTO, ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f86955b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86956c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
        super(1);
        this.f86955b = kVar;
        this.f86956c = aVar;
        this.f86957d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ru.ozon.composer.compose.widget.scrollable.j<FastAnswerTemplateListDTO, ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> jVar) {
        ru.ozon.composer.compose.widget.scrollable.j<FastAnswerTemplateListDTO, ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> viewMapper = jVar;
        Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
        viewMapper.k(c.f86946b, new d(2));
        viewMapper.G(new h(this.f86956c, this.f86957d));
        return Unit.f71690a;
    }
}
