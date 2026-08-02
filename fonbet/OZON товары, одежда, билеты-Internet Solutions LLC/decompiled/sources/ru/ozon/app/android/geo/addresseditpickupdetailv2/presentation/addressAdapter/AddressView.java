package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.addressAdapter;

import Im.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.addressAdapter.AddressView;
import ru.ozon.app.android.uikit.extensions.view.VibrationExtKt;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageIv", "Lru/ozon/uni/android/atom/icon/IconView;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "state", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Address;", "onLongClick", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressView extends LinearLayout {

    @NotNull
    private final IconView imageIv;

    @NotNull
    private final TextAtomV2View titleTAV;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp4 = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/addressAdapter/AddressView$Companion;", "", "<init>", "()V", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AddressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.imageIv);
        addView(this.titleTAV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$7(AddressEditPickUpDetailVO.Address address, AddressView addressView, Function1 function1, View view) {
        AtomAction atomAction;
        CommonControlSettings common = address.getCommon();
        if (common != null && (atomAction = common.toAtomAction()) != null && function1 != null) {
            function1.invoke(atomAction);
        }
        VibrationExtKt.vibrateSingle(addressView);
        return true;
    }

    public final void bind(@NotNull final AddressEditPickUpDetailVO.Address state, final Function1<? super AtomAction, Unit> onLongClick) {
        Intrinsics.checkNotNullParameter(state, "state");
        TextHolderKt.bind$default(this.titleTAV, state.getText(), null, 2, null);
        IconDTO icon = state.getIcon();
        if (icon != null) {
            IconHolderKt.bind$default(this.imageIv, icon, null, 2, null);
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: yy.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean bind$lambda$7;
                bind$lambda$7 = AddressView.bind$lambda$7(AddressEditPickUpDetailVO.Address.this, this, onLongClick, view);
                return bind$lambda$7;
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i12 = dp8;
        marginLayoutParams.topMargin = i12;
        marginLayoutParams.setMarginEnd(i12);
        iconView.setLayoutParams(marginLayoutParams);
        this.imageIv = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.titleTv, -2, -2);
        a11.setMarginStart(dp4);
        textAtomV2View.setLayoutParams(a11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTAV = textAtomV2View;
        setOrientation(0);
        addViews();
    }
}
