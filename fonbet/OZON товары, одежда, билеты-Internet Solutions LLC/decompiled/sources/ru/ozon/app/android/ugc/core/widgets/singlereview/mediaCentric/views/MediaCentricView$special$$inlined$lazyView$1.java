package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class MediaCentricView$special$$inlined$lazyView$1 extends AbstractC7737t implements Function0<RecyclerView> {
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ MediaCentricView $receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCentricView$special$$inlined$lazyView$1(ViewGroup viewGroup, MediaCentricView mediaCentricView) {
        super(0);
        this.$parent = viewGroup;
        this.$receiver$inlined = mediaCentricView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RecyclerView invoke() {
        RecyclerView createProductsRecycler;
        createProductsRecycler = this.$receiver$inlined.createProductsRecycler();
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(createProductsRecycler);
        }
        return createProductsRecycler;
    }
}
