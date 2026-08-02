package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.deliveryCondition;

import Bi.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageIv", "Lru/ozon/uni/android/atom/icon/IconView;", "titleTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "bind", "", "state", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;", "addViews", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryConditionView extends ConstraintLayout {

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final IconView imageIv;

    @NotNull
    private final TextAtomV2View titleTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp6 = ResourceExtKt.toPx(Paddings.PADDING_250.getPx());
    private static final int dp8 = ResourceExtKt.toPx(Paddings.PADDING_300.getPx());
    private static final int dp12 = ResourceExtKt.toPx(Paddings.PADDING_400.getPx());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/deliveryCondition/DeliveryConditionView$Companion;", "", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeliveryConditionView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.imageIv);
        addView(this.titleTv);
        addView(this.badgeView);
    }

    public final void bind(@NotNull AddressEditPickUpDetailVO.DeliveryCondition state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TextHolderKt.bind$default(this.titleTv, state.getText(), null, 2, null);
        IconHolderKt.bind$default(this.imageIv, state.getIcon(), null, 2, null);
        BadgeHolderKt.bindOrGone$default(this.badgeView, state.getBadge(), (Function1) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryConditionView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        iconView.setLayoutParams(bVar);
        this.imageIv = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.titleTv, 0, -2);
        int i12 = dp12;
        d11.setMarginStart(i12);
        d11.setMarginEnd(i12);
        d11.f41636i = iconView.getId();
        d11.f41655s = iconView.getId();
        d11.f41658v = 0;
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTv = textAtomV2View;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, R$id.badgeView, -2, -2);
        ((ViewGroup.MarginLayoutParams) a11).topMargin = dp6;
        int i13 = R$id.titleTv;
        a11.f41638j = i13;
        a11.f41656t = i13;
        a11.f41642l = 0;
        badgeView.setLayoutParams(a11);
        this.badgeView = badgeView;
        int i14 = dp8;
        ViewExtKt.updatePadding$default(this, 0, i14, 0, i14, 5, null);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addViews();
    }
}
