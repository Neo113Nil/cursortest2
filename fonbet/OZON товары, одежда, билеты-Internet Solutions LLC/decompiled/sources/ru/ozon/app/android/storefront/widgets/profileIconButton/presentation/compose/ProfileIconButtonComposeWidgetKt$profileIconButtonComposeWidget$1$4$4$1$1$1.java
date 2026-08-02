package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "tooltipKey", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1$1$1 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ SharedPreferences $sharedPreferences;
    final /* synthetic */ i<ProfileIconButtonVO> $this_content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonComposeWidgetKt$profileIconButtonComposeWidget$1$4$4$1$1$1(i<ProfileIconButtonVO> iVar, SharedPreferences sharedPreferences) {
        super(1);
        this.$this_content = iVar;
        this.$sharedPreferences = sharedPreferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        IconTooltipDto iconTooltip = this.$this_content.b().getIconTooltip();
        return iconTooltip == null ? Boolean.FALSE : (str == null && (str = iconTooltip.getTooltipKey()) == null) ? Boolean.TRUE : Intrinsics.d(this.$sharedPreferences.getString("profile_icon_button_tooltip_key", null), str) ? Boolean.FALSE : Boolean.TRUE;
    }
}
