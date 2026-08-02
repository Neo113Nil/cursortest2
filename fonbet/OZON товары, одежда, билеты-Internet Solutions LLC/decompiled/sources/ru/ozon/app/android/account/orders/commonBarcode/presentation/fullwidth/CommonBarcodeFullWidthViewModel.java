package ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth;

import He.c;
import N9.b;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "code", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "createBarcodeDrawable", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Pair;", "lastBarcode", "Lkotlin/Pair;", "LN9/b;", "barcodeEncoder", "LN9/b;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeFullWidthViewModel extends w0 {

    @NotNull
    private final b barcodeEncoder = new b();
    private Pair<String, ? extends Drawable> lastBarcode;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float BARCODE_RADIUS = ResourceExtKt.toPxF(8);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewModel$Companion;", "", "<init>", "()V", "BARCODE_WIDTH", "", "BARCODE_HEIGHT", "BARCODE_RADIUS", "", "getBARCODE_RADIUS", "()F", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getBARCODE_RADIUS() {
            return CommonBarcodeFullWidthViewModel.BARCODE_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createBarcodeDrawable(@NotNull String str, @NotNull Context context, @NotNull d<? super Drawable> dVar) {
        CommonBarcodeFullWidthViewModel$createBarcodeDrawable$1 commonBarcodeFullWidthViewModel$createBarcodeDrawable$1;
        int i11;
        CommonBarcodeFullWidthViewModel commonBarcodeFullWidthViewModel;
        Drawable f7;
        if (dVar instanceof CommonBarcodeFullWidthViewModel$createBarcodeDrawable$1) {
            commonBarcodeFullWidthViewModel$createBarcodeDrawable$1 = (CommonBarcodeFullWidthViewModel$createBarcodeDrawable$1) dVar;
            int i12 = commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Pair<String, ? extends Drawable> pair = this.lastBarcode;
                    if (pair != null) {
                        if (!Intrinsics.d(pair.e(), str)) {
                            pair = null;
                        }
                        if (pair != null && (f7 = pair.f()) != null) {
                            return f7;
                        }
                    }
                    c a11 = C10720e0.a();
                    CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3 commonBarcodeFullWidthViewModel$createBarcodeDrawable$3 = new CommonBarcodeFullWidthViewModel$createBarcodeDrawable$3(this, str, context, null);
                    commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.L$0 = this;
                    commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.L$1 = str;
                    commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.label = 1;
                    obj = C10727i.f(a11, commonBarcodeFullWidthViewModel$createBarcodeDrawable$3, commonBarcodeFullWidthViewModel$createBarcodeDrawable$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    commonBarcodeFullWidthViewModel = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.L$1;
                    commonBarcodeFullWidthViewModel = (CommonBarcodeFullWidthViewModel) commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.L$0;
                    s.b(obj);
                }
                commonBarcodeFullWidthViewModel.lastBarcode = new Pair<>(str, (androidx.core.graphics.drawable.d) obj);
                Intrinsics.checkNotNullExpressionValue(obj, "also(...)");
                return (Drawable) obj;
            }
        }
        commonBarcodeFullWidthViewModel$createBarcodeDrawable$1 = new CommonBarcodeFullWidthViewModel$createBarcodeDrawable$1(this, dVar);
        Object obj2 = commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = commonBarcodeFullWidthViewModel$createBarcodeDrawable$1.label;
        if (i11 != 0) {
        }
        commonBarcodeFullWidthViewModel.lastBarcode = new Pair<>(str, (androidx.core.graphics.drawable.d) obj2);
        Intrinsics.checkNotNullExpressionValue(obj2, "also(...)");
        return (Drawable) obj2;
    }
}
