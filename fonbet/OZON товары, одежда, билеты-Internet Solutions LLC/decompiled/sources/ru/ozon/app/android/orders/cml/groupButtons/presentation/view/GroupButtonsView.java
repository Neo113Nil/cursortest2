package ru.ozon.app.android.orders.cml.groupButtons.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.groupButtons.data.TextAndIconButtonDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\fJ3\u0010\u0019\u001a\u00020\n2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/orders/cml/groupButtons/presentation/view/GroupButtonsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "()V", "Lru/ozon/app/android/orders/cml/groupButtons/data/TextAndIconButtonDTO;", "buttonData", "", "addTopMargin", "addButtonPairRow", "(Lru/ozon/app/android/orders/cml/groupButtons/data/TextAndIconButtonDTO;Z)V", "onDetachedFromWindow", "", "dataList", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindView", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "onActionListener", "Lkotlin/jvm/functions/Function1;", "Companion", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GroupButtonsView extends LinearLayout {
    private Function1<? super AtomAction, Unit> onActionListener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int VERTICAL_PADDING = UiExtKt.toPx(6);
    private static final int HORIZONTAL_PADDING = UiExtKt.toPx(16);
    private static final int BETWEEN_PADDING = UiExtKt.toPx(8);
    private static final int BUTTONS_VERTICAL_SPACING = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/orders/cml/groupButtons/presentation/view/GroupButtonsView$Companion;", "", "<init>", "()V", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ GroupButtonsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addButtonPairRow(TextAndIconButtonDTO buttonData, boolean addTopMargin) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (addTopMargin) {
            layoutParams.topMargin = BUTTONS_VERTICAL_SPACING;
        }
        linearLayout.setLayoutParams(layoutParams);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        buttonV3View.setLayoutParams(layoutParams2);
        ButtonV3HolderKt.bind(buttonV3View, buttonData.getButton(), this.onActionListener);
        linearLayout.addView(buttonV3View);
        IconButtonV3DTO iconButton = buttonData.getIconButton();
        if (iconButton != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            IconButtonV3View iconButtonV3View = new IconButtonV3View(context2, null, 0, 0, 14, null);
            iconButtonV3View.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMarginStart(BETWEEN_PADDING);
            iconButtonV3View.setLayoutParams(layoutParams3);
            IconButtonV3HolderKt.bind(iconButtonV3View, iconButton, this.onActionListener);
            linearLayout.addView(iconButtonV3View);
        }
        addView(linearLayout);
    }

    private final void initView() {
        setOrientation(1);
        int i11 = HORIZONTAL_PADDING;
        int i12 = VERTICAL_PADDING;
        setPadding(i11, i12, i11, i12);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    public final void bindView(List<TextAndIconButtonDTO> dataList, Function1<? super AtomAction, Unit> onAction) {
        removeAllViews();
        this.onActionListener = onAction;
        if (dataList == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
        }
        if (dataList != null) {
            int i11 = 0;
            for (Object obj : dataList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                addButtonPairRow((TextAndIconButtonDTO) obj, i11 > 0);
                i11 = i12;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onActionListener = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupButtonsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        initView();
    }
}
