package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionTileHeaderView$playIcon$2 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SelectionTileHeaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionTileHeaderView$playIcon$2(Context context, SelectionTileHeaderView selectionTileHeaderView) {
        super(0);
        this.$context = context;
        this.this$0 = selectionTileHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        FrameLayout frameLayout;
        IconView iconView = new IconView(this.$context, null, 0, 6, null);
        iconView.setId(R$id.selectionHeaderPlayIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        frameLayout = this.this$0.rightContainer;
        frameLayout.addView(iconView);
        return iconView;
    }
}
