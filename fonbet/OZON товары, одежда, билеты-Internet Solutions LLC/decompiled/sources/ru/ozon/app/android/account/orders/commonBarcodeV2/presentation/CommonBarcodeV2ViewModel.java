package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import N9.b;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7829k0;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "code", "Ll1/k0;", "createBarcodeImageBitmap", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Pair;", "lastBarcode", "Lkotlin/Pair;", "LN9/b;", "barcodeEncoder", "LN9/b;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CommonBarcodeV2ViewModel extends w0 {

    @NotNull
    private final b barcodeEncoder = new b();
    private Pair<String, ? extends InterfaceC7829k0> lastBarcode;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2ViewModel$Companion;", "", "<init>", "()V", "BARCODE_WIDTH", "", "BARCODE_HEIGHT", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final Object createBarcodeImageBitmap(@NotNull String str, @NotNull d<? super InterfaceC7829k0> dVar) {
        Pair<String, ? extends InterfaceC7829k0> pair = this.lastBarcode;
        return (pair == null || !Intrinsics.d(pair.e(), str)) ? C10727i.f(C10720e0.a(), new CommonBarcodeV2ViewModel$createBarcodeImageBitmap$3(this, str, null), dVar) : pair.f();
    }
}
