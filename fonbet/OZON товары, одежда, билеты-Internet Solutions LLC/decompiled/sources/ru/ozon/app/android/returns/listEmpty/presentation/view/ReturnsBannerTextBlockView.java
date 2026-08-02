package ru.ozon.app.android.returns.listEmpty.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.listEmpty.presentation.util.ReturnsTextBlockFooterBuilder;
import ru.ozon.app.android.returns.listEmpty.presentation.util.ReturnsTextBlockHeaderBuilder;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/view/ReturnsBannerTextBlockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp16", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "getImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "headerTextAtomView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getHeaderTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "textBlockVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "getTextBlockVAL", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "largeButtonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "getLargeButtonView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnsBannerTextBlockView extends LinearLayout {
    private final int dp16;

    @NotNull
    private final TextAtomView headerTextAtomView;

    @NotNull
    private final AppCompatImageView imageView;

    @NotNull
    private final LargeButtonView largeButtonView;

    @NotNull
    private final VerticalAtomsLayout textBlockVAL;

    public /* synthetic */ ReturnsBannerTextBlockView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final TextAtomView getHeaderTextAtomView() {
        return this.headerTextAtomView;
    }

    @NotNull
    public final AppCompatImageView getImageView() {
        return this.imageView;
    }

    @NotNull
    public final LargeButtonView getLargeButtonView() {
        return this.largeButtonView;
    }

    @NotNull
    public final VerticalAtomsLayout getTextBlockVAL() {
        return this.textBlockVAL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnsBannerTextBlockView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        ReturnsTextBlockHeaderBuilder returnsTextBlockHeaderBuilder = ReturnsTextBlockHeaderBuilder.INSTANCE;
        AppCompatImageView createHeaderImageView = returnsTextBlockHeaderBuilder.createHeaderImageView(context);
        this.imageView = createHeaderImageView;
        TextAtomView createHeaderTextAtomView = returnsTextBlockHeaderBuilder.createHeaderTextAtomView(context);
        this.headerTextAtomView = createHeaderTextAtomView;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(View.generateViewId());
        verticalAtomsLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.textBlockVAL = verticalAtomsLayout;
        LargeButtonView createLargeButtonView = ReturnsTextBlockFooterBuilder.INSTANCE.createLargeButtonView(context);
        this.largeButtonView = createLargeButtonView;
        setOrientation(1);
        setPadding(px, px, px, px);
        addView(createHeaderImageView);
        addView(createHeaderTextAtomView);
        addView(verticalAtomsLayout);
        addView(createLargeButtonView);
    }
}
