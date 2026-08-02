package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.creative;

import FV.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0014J$\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/creative/StaticCouponListCreativeViewBinder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentViewBinder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Creative;", "Landroidx/appcompat/widget/AppCompatImageView;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bindTyped", "", "item", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setClickListeners", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListCreativeViewBinder extends StaticCouponListContentViewBinder<StaticCouponListVO.ContentItem.Creative, AppCompatImageView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListCreativeViewBinder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void setClickListeners(StaticCouponListVO.ContentItem.Creative item, Function1<? super AtomAction, Unit> actionHandler) {
        getCurrentView().setOnClickListener(new a(4, item, actionHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListeners$lambda$0(StaticCouponListVO.ContentItem.Creative creative, Function1 function1, View view) {
        AtomAction action = creative.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder
    public /* bridge */ /* synthetic */ void bindTyped(StaticCouponListVO.ContentItem.Creative creative, Function1 function1) {
        bindTyped2(creative, (Function1<? super AtomAction, Unit>) function1);
    }

    /* renamed from: bindTyped, reason: avoid collision after fix types in other method */
    protected void bindTyped2(@NotNull StaticCouponListVO.ContentItem.Creative item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ImageViewExtKt.load$default(getCurrentView(), item.getCreativeImage(), null, null, null, null, false, null, 126, null);
        setClickListeners(item, actionHandler);
    }
}
