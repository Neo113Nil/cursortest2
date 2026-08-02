package hB;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.orderdetails.molecule.images.presentation.ImagesDelegate;
import ru.ozon.fintech.ui.input.InputView;

/* renamed from: hB.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class ViewOnTouchListenerC6882a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f65195b;

    public /* synthetic */ ViewOnTouchListenerC6882a(Object obj, int i11) {
        this.f65194a = i11;
        this.f65195b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean lambda$1$lambda$0;
        boolean _init_$lambda$30;
        switch (this.f65194a) {
            case 0:
                lambda$1$lambda$0 = ImagesDelegate.lambda$1$lambda$0((ImagesDelegate) this.f65195b, view, motionEvent);
                return lambda$1$lambda$0;
            default:
                _init_$lambda$30 = InputView._init_$lambda$30((InputView) this.f65195b, view, motionEvent);
                return _init_$lambda$30;
        }
    }
}
