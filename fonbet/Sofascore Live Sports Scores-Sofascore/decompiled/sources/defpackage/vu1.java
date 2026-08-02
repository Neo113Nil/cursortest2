package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.sofascore.results.bettingtips.BettingTipsActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vu1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vu1(KeyEvent.Callback callback, Object obj, int i) {
        this.a = i;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.a;
        Object obj = this.c;
        KeyEvent.Callback callback = this.b;
        switch (i2) {
            case 0:
                BettingTipsActivity bettingTipsActivity = (BettingTipsActivity) callback;
                int i3 = BettingTipsActivity.Q;
                bettingTipsActivity.R().a.postDelayed(new uu1(bettingTipsActivity, (lkj) obj, i, 0), 100L);
                break;
            default:
                SpinnerAdapter adapter = ((Spinner) callback).getAdapter();
                w7 w7Var = adapter instanceof w7 ? (w7) adapter : null;
                if (w7Var != null) {
                    w7Var.c = i;
                }
                ((et8) obj).invoke(adapterView, view, Integer.valueOf(i), Long.valueOf(j));
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
