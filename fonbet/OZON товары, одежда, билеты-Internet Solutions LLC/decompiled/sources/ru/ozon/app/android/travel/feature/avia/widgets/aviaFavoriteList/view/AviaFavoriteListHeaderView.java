package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.AviaFavoriteListHeaderVI;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/view/AviaFavoriteListHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "headerBackground", "Landroid/graphics/drawable/ShapeDrawable;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "subtitleTAV", "getSubtitleTAV", "subtitleTAV$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaFavoriteList/presentation/AviaFavoriteListHeaderVI;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaFavoriteListHeaderView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AviaFavoriteListHeaderView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AviaFavoriteListHeaderView.class, "subtitleTAV", "getSubtitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final ShapeDrawable headerBackground;

    /* renamed from: subtitleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitleTAV;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaFavoriteListHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        ShapeDrawable produce$default = RoundedBackgroundProducer.produce$default(new RoundedBackgroundProducer(), ThemeExtKt.themeColor(context, R$attr.layerFloor0), 0.0f, 0.0f, 0.0f, 0.0f, 30, null);
        this.headerBackground = produce$default;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new AviaFavoriteListHeaderView$special$$inlined$preCreationViewPool$default$1(this), new AviaFavoriteListHeaderView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitleTAV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new AviaFavoriteListHeaderView$special$$inlined$preCreationViewPool$default$3(this), new AviaFavoriteListHeaderView$special$$inlined$preCreationViewPool$default$4());
        setBackground(produce$default);
        setOrientation(1);
        setPadding(dimens$default.getMargin16(), 0, dimens$default.getMargin16(), 0);
        addView(getTitleTAV());
        addView(getSubtitleTAV());
    }

    private final TextAtomV2View getSubtitleTAV() {
        return (TextAtomV2View) this.subtitleTAV.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull AviaFavoriteListHeaderVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getTitleTAV(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getSubtitleTAV(), item.getSubtitle(), null, 2, null);
    }
}
