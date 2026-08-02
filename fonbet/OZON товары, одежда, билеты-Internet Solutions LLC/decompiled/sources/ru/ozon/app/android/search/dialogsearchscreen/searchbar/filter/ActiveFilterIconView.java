package ru.ozon.app.android.search.dialogsearchscreen.searchbar.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019J\u0006\u0010\u001b\u001a\u00020\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/ActiveFilterIconView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "iconSize", "iconPadding", "indicatorTopMargin", "iconV3DTO", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "filterIcon", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "indicator", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "bindFilterIcon", "", "indicatorDTO", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "iconDTO", "action", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "disableIconButton", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActiveFilterIconView extends FrameLayout {

    @NotNull
    private final IconButtonV3View filterIcon;
    private final int iconPadding;
    private final int iconSize;
    private IconButtonV3DTO iconV3DTO;

    @NotNull
    private final IndicatorView indicator;
    private final int indicatorTopMargin;

    public /* synthetic */ ActiveFilterIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bindFilterIcon(IndicatorDTO indicatorDTO, IconButtonV3DTO iconDTO, Function1<? super AtomAction, Unit> action) {
        IndicatorHolderKt.bindOrGone$default(this.indicator, indicatorDTO, null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.filterIcon, iconDTO, action);
        this.iconV3DTO = iconDTO;
    }

    public final void disableIconButton() {
        IconButtonV3HolderKt.bindOrGone(this.filterIcon, this.iconV3DTO, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveFilterIconView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(32);
        this.iconSize = px;
        int px2 = ResourceExtKt.toPx(8);
        this.iconPadding = px2;
        int px3 = ResourceExtKt.toPx(4);
        this.indicatorTopMargin = px3;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setPadding(px2, px2, px2, px2);
        ViewExtKt.gone(iconButtonV3View);
        this.filterIcon = iconButtonV3View;
        IndicatorView indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(px, px, 8388613);
        layoutParams.topMargin = px3;
        indicatorView.setLayoutParams(layoutParams);
        ViewExtKt.gone(indicatorView);
        this.indicator = indicatorView;
        addView(iconButtonV3View);
        addView(indicatorView);
    }
}
