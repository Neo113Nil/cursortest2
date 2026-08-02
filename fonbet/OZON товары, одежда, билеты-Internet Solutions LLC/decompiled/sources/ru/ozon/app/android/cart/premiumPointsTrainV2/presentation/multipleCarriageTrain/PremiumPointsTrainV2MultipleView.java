package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleTv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTv", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "trainRv", "Landroidx/recyclerview/widget/RecyclerView;", "getTrainRv", "()Landroidx/recyclerview/widget/RecyclerView;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PremiumPointsTrainV2MultipleView extends LinearLayout {

    @NotNull
    private final TextAtomView titleTv;

    @NotNull
    private final RecyclerView trainRv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_4 = UiExtKt.toPx(4);
    private static final int DP_16 = UiExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleView$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PremiumPointsTrainV2MultipleView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final TextAtomView getTitleTv() {
        return this.titleTv;
    }

    @NotNull
    public final RecyclerView getTrainRv() {
        return this.trainRv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumPointsTrainV2MultipleView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(R$id.premiumPointsTitle);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i13 = DP_16;
        marginLayoutParams.setMargins(i13, i13, i13, 0);
        textAtomView.setLayoutParams(marginLayoutParams);
        setOrientation(1);
        this.titleTv = textAtomView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.premiumPointsTrain);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        recyclerView.setPadding(i13, 0, i13, DP_4);
        layoutParams.gravity = 17;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setNestedScrollingEnabled(false);
        setOrientation(0);
        recyclerView.setClipChildren(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.trainRv = recyclerView;
        setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setClipChildren(false);
        setOrientation(1);
        addView(textAtomView);
        addView(recyclerView);
    }
}
