package ru.ozon.app.android.travel.molecules.view.airlineCustomCell;

import Am.C2438a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.airlineCustomCell.AirlineCustomCellVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u001dH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001a\u0010\u0017¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "title$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "subtitle", "getSubtitle", "subtitle$delegate", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badge$delegate", "mainCarrier", "Lru/ozon/uni/android/atom/image/Image;", "getMainCarrier", "()Lru/ozon/uni/android/atom/image/Image;", "mainCarrier$delegate", "operatingCarrier", "getOperatingCarrier", "operatingCarrier$delegate", "bind", "", "data", "Lru/ozon/app/android/travel/molecules/view/airlineCustomCell/AirlineCustomCellVO;", "setupConstraints", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AirlineCustomCellView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AirlineCustomCellView.class, SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AirlineCustomCellView.class, "subtitle", "getSubtitle()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(AirlineCustomCellView.class, "badge", "getBadge()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(AirlineCustomCellView.class, "mainCarrier", "getMainCarrier()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(AirlineCustomCellView.class, "operatingCarrier", "getOperatingCarrier()Lru/ozon/uni/android/atom/image/Image;", 0)};
    public static final int $stable;

    /* renamed from: badge$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badge;

    /* renamed from: mainCarrier$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate mainCarrier;

    /* renamed from: operatingCarrier$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate operatingCarrier;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitle;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate title;

    static {
        int i11 = Image.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        int i13 = i11 | i11 | i12 | i12 | BadgeView.$stable | i12;
        int i14 = TextAtomV2View.$stable;
        $stable = i13 | i14 | i12 | i14 | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirlineCustomCellView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.title = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$1(this), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitle = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$3(this), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.badge = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$5(this), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.mainCarrier = new PreCreationViewPoolDelegate(context5, N.b(Image.class), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$7(this), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$8());
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.operatingCarrier = new PreCreationViewPoolDelegate(context6, N.b(Image.class), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$9(this), new AirlineCustomCellView$special$$inlined$preCreationViewPool$default$10());
        addView(getTitle());
        addView(getSubtitle());
        addView(getBadge());
        addView(getMainCarrier());
        addView(getOperatingCarrier());
        setupConstraints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BadgeView getBadge() {
        return (BadgeView) this.badge.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Image getMainCarrier() {
        return (Image) this.mainCarrier.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Image getOperatingCarrier() {
        return (Image) this.operatingCarrier.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getSubtitle() {
        return (TextAtomV2View) this.subtitle.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getTitle() {
        return (TextAtomV2View) this.title.getValue(this, $$delegatedProperties[0]);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new AirlineCustomCellView$setupConstraints$1(this));
    }

    public final void bind(@NotNull AirlineCustomCellVO data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setPadding(data.getSettings().getLeftPadding(), data.getSettings().getTopPadding(), data.getSettings().getRightPadding(), data.getSettings().getBottomPadding());
        Image mainCarrier = getMainCarrier();
        AirlineCustomCellVO.LeftBlockVO leftBlock = data.getLeftBlock();
        ImageHolderKt.bindOrGone$default(mainCarrier, leftBlock != null ? leftBlock.getMainCarrier() : null, null, 2, null);
        Image operatingCarrier = getOperatingCarrier();
        AirlineCustomCellVO.LeftBlockVO leftBlock2 = data.getLeftBlock();
        ImageHolderKt.bindOrGone$default(operatingCarrier, leftBlock2 != null ? leftBlock2.getOperatingCarrier() : null, null, 2, null);
        TextHolderKt.bind$default(getTitle(), data.getCenterBlock().getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getSubtitle(), data.getCenterBlock().getSubtitle(), null, 2, null);
        BadgeView badge = getBadge();
        AirlineCustomCellVO.RightBlockVO rightBlock = data.getRightBlock();
        BadgeHolderKt.bindOrGone$default(badge, rightBlock != null ? rightBlock.getBadge() : null, (Function1) null, 2, (Object) null);
        TextAtomV2View title = getTitle();
        AirlineCustomCellVO.LeftBlockVO leftBlock3 = data.getLeftBlock();
        Integer valueOf = Integer.valueOf(leftBlock3 != null ? leftBlock3.getRightPadding() : 0);
        AirlineCustomCellVO.RightBlockVO rightBlock2 = data.getRightBlock();
        ViewExtensionsKt.safeUpdateMargins$default(title, null, null, valueOf, Integer.valueOf(rightBlock2 != null ? rightBlock2.getLeftPadding() : 0), 3, null);
    }
}
