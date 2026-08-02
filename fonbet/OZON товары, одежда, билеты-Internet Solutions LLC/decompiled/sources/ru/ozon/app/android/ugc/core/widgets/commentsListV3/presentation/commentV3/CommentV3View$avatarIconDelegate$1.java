package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentV3View$avatarIconDelegate$1 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentV3View$avatarIconDelegate$1(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        IconView iconView = new IconView(this.$context, null, 0, 6, null);
        iconView.setId(R$id.commentAvatarIcon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDP_8();
        layoutParams.setMarginStart(dimens.getDP_1());
        iconView.setLayoutParams(layoutParams);
        return iconView;
    }
}
