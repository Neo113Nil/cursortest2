package ru.ozon.app.android.ugc.core.widgets.avatarAchievements.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "tooltipKey", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$3$1 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ String $pageTag;
    final /* synthetic */ TooltipViewModel $tooltipViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarAchievementsComposeWidgetKt$AvatarAchievementsComposeWidget$1$3$3$1$3$1(TooltipViewModel tooltipViewModel, String str) {
        super(1);
        this.$tooltipViewModel = tooltipViewModel;
        this.$pageTag = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        TooltipViewModel tooltipViewModel = this.$tooltipViewModel;
        String str2 = this.$pageTag;
        return str2 == null ? Boolean.TRUE : str == null ? Boolean.TRUE : Boolean.valueOf(tooltipViewModel.isNeedToShow(str2, str));
    }
}
