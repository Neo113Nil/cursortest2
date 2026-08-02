package xk0;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.uni.android.component.sheet.SheetDialog;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean wrapInBottomSheet$lambda$12$lambda$11;
        wrapInBottomSheet$lambda$12$lambda$11 = SheetDialog.wrapInBottomSheet$lambda$12$lambda$11(view, motionEvent);
        return wrapInBottomSheet$lambda$12$lambda$11;
    }
}
