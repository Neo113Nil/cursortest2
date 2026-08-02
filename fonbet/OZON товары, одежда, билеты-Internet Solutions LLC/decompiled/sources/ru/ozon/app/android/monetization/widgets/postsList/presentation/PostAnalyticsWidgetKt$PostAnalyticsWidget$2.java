package ru.ozon.app.android.monetization.widgets.postsList.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.postsList.presentation.models.PostAnalyticsVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class PostAnalyticsWidgetKt$PostAnalyticsWidget$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ PostAnalyticsVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostAnalyticsWidgetKt$PostAnalyticsWidget$2(PostAnalyticsVI postAnalyticsVI, int i11) {
        super(2);
        this.$state = postAnalyticsVI;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PostAnalyticsWidgetKt.PostAnalyticsWidget(this.$state, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
