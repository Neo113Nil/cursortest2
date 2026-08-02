package ru.ozon.app.android.account.orders.barcode.presentation;

import A00.a;
import R00.f;
import android.view.View;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class BarcodeFragment$onComposerCreated$1 extends AbstractC7737t implements Function1<a, Unit> {
    final /* synthetic */ BarcodeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeFragment$onComposerCreated$1(BarcodeFragment barcodeFragment) {
        super(1);
        this.this$0 = barcodeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(a aVar) {
        ComposerFragment barcodesComposerFragment;
        boolean z11;
        barcodesComposerFragment = this.this$0.getBarcodesComposerFragment();
        View view = barcodesComposerFragment.getView();
        Object obj = null;
        View findViewById = view != null ? view.findViewById(R$id.screenStateView) : null;
        if (aVar instanceof a.D) {
            Iterator<T> it = ((a.D) aVar).d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((f) next).a(), "barcode")) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                z11 = true;
                if ((findViewById == null && ViewExtKt.isVisible(findViewById)) || z11) {
                    this.this$0.getViewModel().composerError();
                    return;
                }
                if (!(aVar instanceof a.o)) {
                    this.this$0.getViewModel().composerIsUp();
                    return;
                } else {
                    if (!(aVar instanceof a.p) || (((a.p) aVar).g() instanceof a.r)) {
                        return;
                    }
                    this.this$0.getViewModel().getCachedBarcode();
                    return;
                }
            }
        }
        z11 = false;
        if (findViewById == null) {
        }
        if (!(aVar instanceof a.o)) {
        }
    }
}
