package ru.ozon.app.android.account.orders.emptyscreen.antibot;

import android.content.Context;
import android.widget.FrameLayout;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.app.android.barcodecache.di.BarcodeCacheComponentApi;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "frameLayout", "Landroid/widget/FrameLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OpenBarcodeButtonConfig$antibotFrameForHostProvider$1 extends AbstractC7737t implements Function1<FrameLayout, Unit> {
    final /* synthetic */ OpenBarcodeButtonConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenBarcodeButtonConfig$antibotFrameForHostProvider$1(OpenBarcodeButtonConfig openBarcodeButtonConfig) {
        super(1);
        this.this$0 = openBarcodeButtonConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FrameLayout frameLayout) {
        invoke2(frameLayout);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Context context = frameLayout.getContext();
        Intrinsics.f(context);
        if (BarcodeCacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component BarcodeCacheComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, BarcodeCacheComponentApi.class).getDependencyStorage();
        if (BarcodeCacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component BarcodeCacheComponentApi is not DiComponent");
        }
        BarcodeData barcode = ((BarcodeCacheComponentApi) dependencyStorage.b(BarcodeCacheComponentApi.class)).getPersistentCacheManager().getBarcode();
        if (barcode != null) {
            this.this$0.createButton(frameLayout, barcode);
        }
    }
}
