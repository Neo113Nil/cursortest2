package ru.ozon.app.android.account.orders.emptyscreen.fintech.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cs_orders.R$drawable;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "image", "Lru/ozon/uni/android/atom/image/Image;", "getImage", "()Lru/ozon/uni/android/atom/image/Image;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitle", "getSubtitle", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OfflineFintechBannerView extends ConstraintLayout {

    @NotNull
    private final Image image;

    @NotNull
    private final TextAtomV2View subtitle;

    @NotNull
    private final TextAtomV2View title;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable | Image.$stable;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.emptyscreen.fintech.presentation.OfflineFintechBannerView$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<d, Unit> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            ConstraintSetExtKt.startToStart(updateConstraints, OfflineFintechBannerView.this.getImage().getId(), 0, UiExtKt.toPx(16, this.$context));
            ConstraintSetExtKt.topToTop$default(updateConstraints, OfflineFintechBannerView.this.getImage().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(updateConstraints, OfflineFintechBannerView.this.getImage().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.startToEnd(updateConstraints, OfflineFintechBannerView.this.getTitle().getId(), OfflineFintechBannerView.this.getImage().getId(), UiExtKt.toPx(12, this.$context));
            ConstraintSetExtKt.endToEnd(updateConstraints, OfflineFintechBannerView.this.getTitle().getId(), 0, UiExtKt.toPx(16, this.$context));
            ConstraintSetExtKt.topToTop(updateConstraints, OfflineFintechBannerView.this.getTitle().getId(), 0, UiExtKt.toPx(18, this.$context));
            ConstraintSetExtKt.startToEnd(updateConstraints, OfflineFintechBannerView.this.getSubtitle().getId(), OfflineFintechBannerView.this.getImage().getId(), UiExtKt.toPx(12, this.$context));
            ConstraintSetExtKt.endToEnd(updateConstraints, OfflineFintechBannerView.this.getSubtitle().getId(), 0, UiExtKt.toPx(16, this.$context));
            ConstraintSetExtKt.topToBottom(updateConstraints, OfflineFintechBannerView.this.getSubtitle().getId(), OfflineFintechBannerView.this.getTitle().getId(), UiExtKt.toPx(2, this.$context));
            ConstraintSetExtKt.bottomToBottom(updateConstraints, OfflineFintechBannerView.this.getSubtitle().getId(), 0, UiExtKt.toPx(18, this.$context));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerView$Companion;", "", "<init>", "()V", "ROOT_MARGIN", "", "IMAGE_SIZE", "IMAGE_START_MARGIN", "TEXT_START_MARGIN", "TEXT_END_MARGIN", "TITLE_TOP_MARGIN", "SUBTITLE_TOP_MARGIN", "SUBTITLE_BOTTOM_MARGIN", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ OfflineFintechBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final TextAtomV2View getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtomV2View getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineFintechBannerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(View.generateViewId());
        image.setLayoutParams(new ConstraintLayout.b(UiExtKt.toPx(44), UiExtKt.toPx(44)));
        addView(image);
        this.image = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(textAtomV2View);
        this.title = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(View.generateViewId());
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(textAtomV2View2);
        this.subtitle = textAtomV2View2;
        setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMarginStart(UiExtKt.toPx(8));
        marginLayoutParams.setMarginEnd(UiExtKt.toPx(8));
        marginLayoutParams.bottomMargin = UiExtKt.toPx(8);
        setLayoutParams(marginLayoutParams);
        setBackground(C7232a.a(context, R$drawable.background_rounded_bg_secondary_16));
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass2(context));
    }
}
