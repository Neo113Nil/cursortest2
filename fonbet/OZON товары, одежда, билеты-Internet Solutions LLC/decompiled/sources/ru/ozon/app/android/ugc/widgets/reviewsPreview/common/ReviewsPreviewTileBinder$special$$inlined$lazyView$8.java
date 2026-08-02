package ru.ozon.app.android.ugc.widgets.reviewsPreview.common;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class ReviewsPreviewTileBinder$special$$inlined$lazyView$8 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ ReviewsPreviewTileBinder $receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsPreviewTileBinder$special$$inlined$lazyView$8(ViewGroup viewGroup, ReviewsPreviewTileBinder reviewsPreviewTileBinder) {
        super(0);
        this.$parent = viewGroup;
        this.$receiver$inlined = reviewsPreviewTileBinder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View createTitleView;
        createTitleView = this.$receiver$inlined.createTitleView();
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(createTitleView);
        }
        return createTitleView;
    }
}
