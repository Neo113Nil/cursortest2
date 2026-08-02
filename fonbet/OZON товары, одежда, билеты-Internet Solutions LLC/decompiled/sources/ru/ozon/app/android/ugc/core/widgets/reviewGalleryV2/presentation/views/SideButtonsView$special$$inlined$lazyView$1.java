package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.views;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SideButtonsView$special$$inlined$lazyView$1 extends AbstractC7737t implements Function0<IconButtonV3View> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideButtonsView$special$$inlined$lazyView$1(ViewGroup viewGroup, Context context) {
        super(0);
        this.$parent = viewGroup;
        this.$context$inlined = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final IconButtonV3View invoke() {
        IconButtonV3View iconButtonV3View = new IconButtonV3View(this.$context$inlined, null, 0, 0, 14, null);
        iconButtonV3View.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388627));
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(iconButtonV3View);
        }
        return iconButtonV3View;
    }
}
