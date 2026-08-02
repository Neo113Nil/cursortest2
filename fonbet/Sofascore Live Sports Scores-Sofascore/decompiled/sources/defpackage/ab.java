package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.inmobi.media.C3397ei;
import com.inmobi.media.Jc;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.chat.view.ScoreUpdateView;
import com.sofascore.results.feedback.FeedbackActivity;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ab implements View.OnTouchListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                view.performClick();
                return true;
            case 1:
                KProperty[] kPropertyArr = BaseActivity.H;
                return true;
            case 2:
                view.clearFocus();
                Context context = view.getContext();
                context.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                return true;
            case 3:
                int i = FeedbackActivity.M;
                if (view.canScrollVertically(1) || view.canScrollVertically(-1)) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            case 4:
                return Jc.a(view, motionEvent);
            case 5:
                return true;
            case 6:
                return false;
            case 7:
                int i2 = ScoreUpdateView.l;
                return true;
            default:
                return C3397ei.a(view, motionEvent);
        }
    }
}
