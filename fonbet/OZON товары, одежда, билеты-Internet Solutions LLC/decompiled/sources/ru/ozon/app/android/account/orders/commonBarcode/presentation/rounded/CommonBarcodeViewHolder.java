package ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded;

import BS.a;
import He.c;
import N9.b;
import Sc.s;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.CommonBarcodeVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetCommonBarcodeBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/rounded/CommonBarcodeViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetCommonBarcodeBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetCommonBarcodeBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "subtitle", "", "subtitleStyle", "", "setSubtitle", "(Ljava/lang/String;I)V", "code", "setBarcode", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "createBarcodeDrawable", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "barcode", "Lcom/google/android/material/imageview/ShapeableImageView;", "bindBarcode", "(Landroid/graphics/drawable/Drawable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/commonBarcode/presentation/CommonBarcodeVO;Ll20/d;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetCommonBarcodeBinding;", "LN9/b;", "barcodeEncoder", "LN9/b;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeViewHolder extends k<CommonBarcodeVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final b barcodeEncoder;

    @NotNull
    private final WidgetCommonBarcodeBinding binding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int HORIZONTAL_LIGHT_MARGINS = ResourceExtKt.toPx(16);
    private static final int HORIZONTAL_DARK_MARGINS = ResourceExtKt.toPx(30);
    private static final float BARCODE_RADIUS = ResourceExtKt.toPxF(8);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/rounded/CommonBarcodeViewHolder$Companion;", "", "<init>", "()V", "BARCODE_WIDTH", "", "BARCODE_HEIGHT", "HORIZONTAL_LIGHT_MARGINS", "getHORIZONTAL_LIGHT_MARGINS", "()I", "HORIZONTAL_DARK_MARGINS", "getHORIZONTAL_DARK_MARGINS", "BARCODE_RADIUS", "", "getBARCODE_RADIUS", "()F", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBARCODE_RADIUS() {
            return CommonBarcodeViewHolder.BARCODE_RADIUS;
        }

        public final int getHORIZONTAL_DARK_MARGINS() {
            return CommonBarcodeViewHolder.HORIZONTAL_DARK_MARGINS;
        }

        public final int getHORIZONTAL_LIGHT_MARGINS() {
            return CommonBarcodeViewHolder.HORIZONTAL_LIGHT_MARGINS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommonBarcodeViewHolder(@NotNull WidgetCommonBarcodeBinding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.barcodeEncoder = new b();
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        binding.barcodeCl.setOnClickListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CommonBarcodeViewHolder commonBarcodeViewHolder, View view) {
        AtomAction action;
        CommonBarcodeVO boundData = commonBarcodeViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        commonBarcodeViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bindBarcode(Drawable drawable, d<? super ShapeableImageView> dVar) {
        CommonBarcodeViewHolder$bindBarcode$1 commonBarcodeViewHolder$bindBarcode$1;
        int i11;
        if (dVar instanceof CommonBarcodeViewHolder$bindBarcode$1) {
            commonBarcodeViewHolder$bindBarcode$1 = (CommonBarcodeViewHolder$bindBarcode$1) dVar;
            int i12 = commonBarcodeViewHolder$bindBarcode$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commonBarcodeViewHolder$bindBarcode$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = commonBarcodeViewHolder$bindBarcode$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = commonBarcodeViewHolder$bindBarcode$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 l02 = De.s.f6650a;
                    CommonBarcodeViewHolder$bindBarcode$2 commonBarcodeViewHolder$bindBarcode$2 = new CommonBarcodeViewHolder$bindBarcode$2(this, drawable, null);
                    commonBarcodeViewHolder$bindBarcode$1.label = 1;
                    obj = C10727i.f(l02, commonBarcodeViewHolder$bindBarcode$2, commonBarcodeViewHolder$bindBarcode$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        commonBarcodeViewHolder$bindBarcode$1 = new CommonBarcodeViewHolder$bindBarcode$1(this, dVar);
        Object obj2 = commonBarcodeViewHolder$bindBarcode$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = commonBarcodeViewHolder$bindBarcode$1.label;
        if (i11 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createBarcodeDrawable(String str, d<? super Drawable> dVar) {
        CommonBarcodeViewHolder$createBarcodeDrawable$1 commonBarcodeViewHolder$createBarcodeDrawable$1;
        int i11;
        if (dVar instanceof CommonBarcodeViewHolder$createBarcodeDrawable$1) {
            commonBarcodeViewHolder$createBarcodeDrawable$1 = (CommonBarcodeViewHolder$createBarcodeDrawable$1) dVar;
            int i12 = commonBarcodeViewHolder$createBarcodeDrawable$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commonBarcodeViewHolder$createBarcodeDrawable$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = commonBarcodeViewHolder$createBarcodeDrawable$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = commonBarcodeViewHolder$createBarcodeDrawable$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    c a11 = C10720e0.a();
                    CommonBarcodeViewHolder$createBarcodeDrawable$2 commonBarcodeViewHolder$createBarcodeDrawable$2 = new CommonBarcodeViewHolder$createBarcodeDrawable$2(this, str, null);
                    commonBarcodeViewHolder$createBarcodeDrawable$1.label = 1;
                    obj = C10727i.f(a11, commonBarcodeViewHolder$createBarcodeDrawable$2, commonBarcodeViewHolder$createBarcodeDrawable$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        commonBarcodeViewHolder$createBarcodeDrawable$1 = new CommonBarcodeViewHolder$createBarcodeDrawable$1(this, dVar);
        Object obj2 = commonBarcodeViewHolder$createBarcodeDrawable$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = commonBarcodeViewHolder$createBarcodeDrawable$1.label;
        if (i11 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    private final void setBarcode(String code) {
        C10727i.c(K.a(this), null, null, new CommonBarcodeViewHolder$setBarcode$1(this, code, null), 3);
    }

    private final void setSubtitle(String subtitle, int subtitleStyle) {
        TextView textView = this.binding.codeTv;
        textView.setText(subtitle);
        textView.setTextAppearance(subtitleStyle);
        textView.setTextColor(androidx.core.content.a.getColor(textView.getContext(), R$color.black));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CommonBarcodeVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCommonBarcodeBinding widgetCommonBarcodeBinding = this.binding;
        widgetCommonBarcodeBinding.titleTv.setText(item.getTitle());
        setSubtitle(item.getSubtitle(), item.getSubtitleTextStyle());
        TextAtomView descriptionTav = widgetCommonBarcodeBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
        TextAtomHolderKt.bindOrGone$default(descriptionTav, item.getDescription(), null, 2, null);
        setBarcode(item.getCode());
    }
}
