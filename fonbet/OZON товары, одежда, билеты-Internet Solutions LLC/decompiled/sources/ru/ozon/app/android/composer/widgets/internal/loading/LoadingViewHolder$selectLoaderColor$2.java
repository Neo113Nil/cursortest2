package ru.ozon.app.android.composer.widgets.internal.loading;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LoadingViewHolder$selectLoaderColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ LoadingViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingViewHolder$selectLoaderColor$2(LoadingViewHolder loadingViewHolder) {
        super(0);
        this.this$0 = loadingViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return StyleParser.INSTANCE.parseColor(this.this$0.getContext(), UniTheme.INSTANCE.getColorTokens().getGraphicOverlapPrimary().getId());
    }
}
