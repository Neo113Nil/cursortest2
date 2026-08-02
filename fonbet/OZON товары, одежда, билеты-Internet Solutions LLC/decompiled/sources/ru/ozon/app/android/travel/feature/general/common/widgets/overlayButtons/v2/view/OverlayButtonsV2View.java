package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2State;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.adapter.OverlayButtonsV2Adapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.adapter.OverlayButtonsV2DividerDecoration;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003*\u0001\u0019\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u001aR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/view/OverlayButtonsV2View;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "overlayAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/view/adapter/OverlayButtonsV2Adapter;", "backgroundColor", "", "dividerColorCache", "", "dividerDecoration", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/view/adapter/OverlayButtonsV2DividerDecoration;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2State;", "bindBackgroundColor", "colorToken", "bindDividerColor", "getRoundedOutlineProvider", "ru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/view/OverlayButtonsV2View$getRoundedOutlineProvider$1", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/view/OverlayButtonsV2View$getRoundedOutlineProvider$1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsV2View extends RecyclerView {
    private Function1<? super AtomAction, Unit> actionHandler;
    private int backgroundColor;

    @NotNull
    private String dividerColorCache;

    @NotNull
    private final OverlayButtonsV2DividerDecoration dividerDecoration;

    @NotNull
    private final OverlayButtonsV2Adapter overlayAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayButtonsV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OverlayButtonsV2Adapter overlayButtonsV2Adapter = new OverlayButtonsV2Adapter(new OverlayButtonsV2View$overlayAdapter$1(this));
        this.overlayAdapter = overlayButtonsV2Adapter;
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1Inverted);
        this.dividerColorCache = UniColors.GRAPHIC_TERTIARY_INVERTED.getToken();
        OverlayButtonsV2DividerDecoration overlayButtonsV2DividerDecoration = new OverlayButtonsV2DividerDecoration(context, ThemeExtKt.themeColor(context, R$attr.graphicTertiaryInverted));
        this.dividerDecoration = overlayButtonsV2DividerDecoration;
        setOverScrollMode(2);
        setOutlineProvider(getRoundedOutlineProvider(context));
        setClipToOutline(true);
        setElevation(ResourceExtKt.toPxF(8, context));
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setAdapter(overlayButtonsV2Adapter);
        setBackgroundColor(this.backgroundColor);
        addItemDecoration(overlayButtonsV2DividerDecoration);
        setItemAnimator(null);
    }

    private final void bindBackgroundColor(String colorToken) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, colorToken, UniColors.LAYER_FLOOR_1_INVERTED.getResId());
        if (parseColor != this.backgroundColor) {
            this.backgroundColor = parseColor;
            setBackgroundColor(parseColor);
        }
    }

    private final void bindDividerColor(String colorToken) {
        if (colorToken == null || colorToken.equals(this.dividerColorCache)) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.dividerDecoration.setColor(styleParser.parseColor(context, colorToken, UniColors.GRAPHIC_TERTIARY_INVERTED.getResId()));
        invalidateItemDecorations();
        this.dividerColorCache = colorToken;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.OverlayButtonsV2View$getRoundedOutlineProvider$1] */
    private final OverlayButtonsV2View$getRoundedOutlineProvider$1 getRoundedOutlineProvider(final Context context) {
        return new ViewOutlineProvider(context) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.OverlayButtonsV2View$getRoundedOutlineProvider$1
            private float radius;

            {
                this.radius = ResourceExtKt.toPxF(12, context);
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (view == null || outline == null) {
                    return;
                }
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius);
            }
        };
    }

    public final void bind(@NotNull OverlayButtonsV2State item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (item.getButtons().isEmpty()) {
            ViewExtKt.gone(this);
            return;
        }
        this.actionHandler = actionHandler;
        bindBackgroundColor(item.getBackgroundColor());
        bindDividerColor(item.getDividerColor());
        this.overlayAdapter.submitList(item.getButtons());
        ViewExtKt.show(this);
    }
}
