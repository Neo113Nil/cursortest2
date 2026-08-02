package ru.ozon.app.android.ordertracking.v4.presentation.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ordertracking.v4.presentation.model.SubtitleVO;
import ru.ozon.app.android.ordertracking.v4.presentation.view.OrderTrackingAddressView;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J$\u0010\u001a\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ\"\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/view/OrderTrackingAddressView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO$AddressVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "deliveryVariantNameWidth", "", "houseWidth", "lineWidth", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "bindOrGone", "bind", "Companion", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class OrderTrackingAddressView extends TextAtomV2View {
    private SubtitleVO.AddressVO address;
    private float deliveryVariantNameWidth;
    private float houseWidth;
    private int lineWidth;

    @NotNull
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private StringBuilder stringBuilder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderTrackingAddressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(OrderTrackingAddressView orderTrackingAddressView, View view, MotionEvent motionEvent) {
        SubtitleVO.AddressVO addressVO;
        AtomAction action;
        if (motionEvent.getAction() != 1 || (addressVO = orderTrackingAddressView.address) == null || (action = addressVO.getAction()) == null) {
            return false;
        }
        orderTrackingAddressView.onAction.invoke(action);
        return false;
    }

    public final void bind(@NotNull SubtitleVO.AddressVO address, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        ViewExtKt.show(this);
        this.address = address;
        this.onAction = onAction;
    }

    public final void bindOrGone(SubtitleVO.AddressVO address, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (address == null) {
            ViewExtKt.gone(this);
        } else {
            bind(address, onAction);
        }
    }

    @Override // ru.ozon.uni.android.atom.text.TextAtomV2View, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        SubtitleVO.AddressVO addressVO = this.address;
        if (addressVO == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        boolean z11 = addressVO.getStreet().getText().length() <= 4;
        String obj = addressVO.getDeliveryVariantName().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        String obj2 = addressVO.getStreet().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
        TextDTO house = addressVO.getHouse();
        String obj3 = OzonSpannableStringKt.orEmpty(house != null ? house.getText() : null).toString();
        Intrinsics.checkNotNullExpressionValue(obj3, "toString(...)");
        boolean z12 = false;
        boolean z13 = false;
        while (!z12) {
            this.lineWidth = (View.MeasureSpec.getSize(widthMeasureSpec) - getCompoundPaddingStart()) - getCompoundPaddingEnd();
            this.deliveryVariantNameWidth = z13 ? 0.0f : getPaint().measureText(obj);
            float measureText = getPaint().measureText(obj3);
            this.houseWidth = measureText;
            float f7 = (this.lineWidth - this.deliveryVariantNameWidth) - measureText;
            if (!z11) {
                obj2 = TextUtils.ellipsize(addressVO.getStreet().getText(), getPaint(), f7, TextUtils.TruncateAt.MIDDLE).toString();
            }
            z12 = !z11 ? obj2.length() <= 4 : f7 < getPaint().measureText(obj2);
            if (z12) {
                break;
            } else if (z13) {
                obj3 = TextUtils.ellipsize(obj3, getPaint(), (this.lineWidth - f7) - 10, TextUtils.TruncateAt.END).toString();
            } else {
                z13 = true;
            }
        }
        TextDTO street = addressVO.getStreet();
        StringBuilder sb2 = this.stringBuilder;
        sb2.setLength(0);
        if (!z13) {
            sb2.append(obj);
        }
        sb2.append(obj2);
        sb2.append(obj3);
        Unit unit = Unit.f71690a;
        TextHolderKt.bind(this, TextDTO.copy$default(street, OzonSpannableStringKt.toOzonSpannableString(sb2), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), this.onAction);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public /* synthetic */ OrderTrackingAddressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTrackingAddressView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onAction = OrderTrackingAddressView$onAction$1.INSTANCE;
        this.stringBuilder = new StringBuilder();
        setMaxLines(1);
        setOnTouchListener(new View.OnTouchListener() { // from class: OB.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$0;
                _init_$lambda$0 = OrderTrackingAddressView._init_$lambda$0(OrderTrackingAddressView.this, view, motionEvent);
                return _init_$lambda$0;
            }
        });
    }
}
