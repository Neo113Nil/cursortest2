package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation;

import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserVI;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class IconChooserContentKt$IconSelector$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<IconChooserVI.IconSelectorVI, Unit> $iconSelectCallback;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ IconChooserVI.IconSelectorVI $selector;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IconChooserContentKt$IconSelector$2$1(boolean z11, IconChooserVI.IconSelectorVI iconSelectorVI, Function1<? super IconChooserVI.IconSelectorVI, Unit> function1, l lVar) {
        super(0);
        this.$isSelected = z11;
        this.$selector = iconSelectorVI;
        this.$iconSelectCallback = function1;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isSelected) {
            return;
        }
        IconChooserContentKt.onItemClick(this.$selector, this.$iconSelectCallback, this.$tokenizedAnalytics);
    }
}
