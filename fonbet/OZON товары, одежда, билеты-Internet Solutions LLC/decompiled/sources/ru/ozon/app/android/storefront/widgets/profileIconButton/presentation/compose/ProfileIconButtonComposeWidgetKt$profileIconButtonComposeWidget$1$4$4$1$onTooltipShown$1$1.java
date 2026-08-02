package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1$onTooltipShown$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ SharedPreferences $sharedPreferences;
    final /* synthetic */ i<ProfileIconButtonVO> $this_content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1$onTooltipShown$1$1(i<ProfileIconButtonVO> iVar, SharedPreferences sharedPreferences) {
        super(1);
        this.$this_content = iVar;
        this.$sharedPreferences = sharedPreferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        String tooltipKey;
        IconTooltipDto iconTooltip = this.$this_content.b().getIconTooltip();
        if (iconTooltip == null || (tooltipKey = iconTooltip.getTooltipKey()) == null) {
            return;
        }
        SharedPreferences.Editor edit = this.$sharedPreferences.edit();
        edit.putString("profile_icon_button_tooltip_key", tooltipKey);
        edit.commit();
    }
}
