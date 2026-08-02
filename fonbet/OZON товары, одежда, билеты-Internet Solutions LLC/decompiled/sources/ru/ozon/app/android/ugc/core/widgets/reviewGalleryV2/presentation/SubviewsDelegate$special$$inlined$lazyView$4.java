package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class SubviewsDelegate$special$$inlined$lazyView$4 extends AbstractC7737t implements Function0<BadgeView> {
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ SubviewsDelegate $receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubviewsDelegate$special$$inlined$lazyView$4(ViewGroup viewGroup, SubviewsDelegate subviewsDelegate) {
        super(0);
        this.$parent = viewGroup;
        this.$receiver$inlined = subviewsDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BadgeView invoke() {
        BadgeView createBadgeView;
        createBadgeView = this.$receiver$inlined.createBadgeView();
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(createBadgeView);
        }
        return createBadgeView;
    }
}
