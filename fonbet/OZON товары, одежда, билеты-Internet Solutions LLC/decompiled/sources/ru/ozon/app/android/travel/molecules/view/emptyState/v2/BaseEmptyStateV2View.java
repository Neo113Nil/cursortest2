package ru.ozon.app.android.travel.molecules.view.emptyState.v2;

import Im.a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015H\u0015J\b\u0010\u0017\u001a\u00020\u0011H\u0015J\b\u0010\u0018\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v2/BaseEmptyStateV2View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "imageSizeDefault", "", "dp8", "dp16", "dp24", "imageACIV", "Landroidx/appcompat/widget/AppCompatImageView;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "messageTAV", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setUpLayout", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseEmptyStateV2View extends LinearLayout {
    private final int dp16;
    private final int dp24;
    private final int dp8;

    @NotNull
    private final AppCompatImageView imageACIV;
    private final int imageSizeDefault;

    @NotNull
    private final TextAtomV2View messageTAV;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEmptyStateV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(160, context);
        this.imageSizeDefault = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp24 = ResourceExtKt.toPx(24, context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.emptyStateV2imageACIV);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px, px);
        layoutParams.gravity = 1;
        appCompatImageView.setLayoutParams(layoutParams);
        this.imageACIV = appCompatImageView;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.emptyStateV2titleTAV, -1, -2);
        a11.topMargin = px2;
        textAtomV2View.setLayoutParams(a11);
        this.titleTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams a12 = a.a(textAtomV2View2, R$id.emptyStateV2messageTAV, -1, -2);
        a12.topMargin = px2;
        textAtomV2View2.setLayoutParams(a12);
        this.messageTAV = textAtomV2View2;
        setUpLayout();
    }

    private final void setUpLayout() {
        setOrientation(1);
        setGravity(1);
        int i11 = this.dp16;
        int i12 = this.dp24;
        setPadding(i11, i12, i11, i12);
    }

    protected void addViews() {
        addView(this.imageACIV);
        addView(this.titleTAV);
        addView(this.messageTAV);
    }

    protected void bind(@NotNull EmptyStateV2VO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.imageACIV, item.getImageURL(), null, null, null, null, false, null, 126, null);
        int imageSize = item.getImageSize();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(imageSize, context);
        if (px != this.imageACIV.getLayoutParams().width) {
            AppCompatImageView appCompatImageView = this.imageACIV;
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = px;
            layoutParams.width = px;
            appCompatImageView.setLayoutParams(layoutParams);
        }
        TextHolderKt.bind$default(this.titleTAV, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.messageTAV, item.getMessage(), null, 2, null);
        if (onAction != null) {
            onAction.invoke(new AtomAction.ViewAction(item.getTrackingInfo(), null, 2, null));
        }
    }
}
