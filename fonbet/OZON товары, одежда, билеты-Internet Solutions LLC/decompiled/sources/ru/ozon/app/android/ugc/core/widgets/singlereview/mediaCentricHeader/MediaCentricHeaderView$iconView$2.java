package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.icon.IconView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MediaCentricHeaderView$iconView$2 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MediaCentricHeaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaCentricHeaderView$iconView$2(Context context, MediaCentricHeaderView mediaCentricHeaderView) {
        super(0);
        this.$context = context;
        this.this$0 = mediaCentricHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        IconView iconView = new IconView(this.$context, null, 0, 6, null);
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.this$0.addView(iconView);
        return iconView;
    }
}
