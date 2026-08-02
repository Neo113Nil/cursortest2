package air.com.playtika.android.common;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* compiled from: GameSurfaceView.java */
/* loaded from: classes8.dex */
class UniversalDelInputConnection extends BaseInputConnection {
    public UniversalDelInputConnection(View view, boolean z) {
        super(view, z);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (i == 1 && i2 == 0) {
            return super.sendKeyEvent(new KeyEvent(0, 67)) && super.sendKeyEvent(new KeyEvent(1, 67));
        }
        return super.deleteSurroundingText(i, i2);
    }
}
