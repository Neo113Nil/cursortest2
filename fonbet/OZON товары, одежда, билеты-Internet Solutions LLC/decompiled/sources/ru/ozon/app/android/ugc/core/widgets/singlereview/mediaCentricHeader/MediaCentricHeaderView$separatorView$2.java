package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MediaCentricHeaderView$separatorView$2 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MediaCentricHeaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaCentricHeaderView$separatorView$2(Context context, MediaCentricHeaderView mediaCentricHeaderView) {
        super(0);
        this.$context = context;
        this.this$0 = mediaCentricHeaderView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(Dimens.INSTANCE.getDP_4());
        textAtomV2View.setLayoutParams(layoutParams);
        this.this$0.addView(textAtomV2View);
        return textAtomV2View;
    }
}
