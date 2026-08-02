package io;

import android.view.KeyEvent;
import android.widget.TextView;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder.CountPickerBinder;
import ru.ozon.app.android.cart.ui.quantityInput.QuantityInput;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetView;

/* renamed from: io.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C7092a implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66518b;

    public /* synthetic */ C7092a(Object obj, int i11) {
        this.f66517a = i11;
        this.f66518b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        boolean lambda$4$lambda$2;
        boolean initQuantityInput$lambda$9$lambda$8;
        switch (this.f66517a) {
            case 0:
                lambda$4$lambda$2 = SearchSheetView.lambda$4$lambda$2((SearchSheetView) this.f66518b, textView, i11, keyEvent);
                return lambda$4$lambda$2;
            default:
                initQuantityInput$lambda$9$lambda$8 = CountPickerBinder.initQuantityInput$lambda$9$lambda$8((QuantityInput) this.f66518b, textView, i11, keyEvent);
                return initQuantityInput$lambda$9$lambda$8;
        }
    }
}
