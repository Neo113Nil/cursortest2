package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e1l extends WebView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1l(Context context) {
        super(context);
        this.a = 2;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                super.onTouchEvent(motionEvent);
                return false;
            case 1:
                super.onTouchEvent(motionEvent);
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 2:
                try {
                    super.onWindowFocusChanged(z);
                    break;
                } catch (NullPointerException unused) {
                    return;
                }
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        switch (this.a) {
            case 0:
                super.performClick();
                return false;
            case 1:
                super.performClick();
                return false;
            default:
                return super.performClick();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.a = i;
    }
}
