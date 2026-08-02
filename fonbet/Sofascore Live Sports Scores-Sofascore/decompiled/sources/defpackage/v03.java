package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.adsbynimbus.render.mraid.Host;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v03 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ViewGroup c;

    public v03(lsi lsiVar, View view) {
        this.a = 2;
        this.c = lsiVar;
        this.b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        ViewGroup viewGroup = this.c;
        Object obj = this.b;
        switch (i9) {
            case 0:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                msk mskVar = (msk) obj;
                TextView textView = mskVar.h;
                TextView textView2 = mskVar.c;
                float measuredWidth = ((z03) viewGroup).getBinding().l.getMeasuredWidth() / (mskVar.j.getMeasuredWidth() + mskVar.g.getMeasuredWidth());
                if (measuredWidth < 1.0f) {
                    float textSize = textView2.getTextSize() * measuredWidth;
                    float textSize2 = textView.getTextSize() * measuredWidth;
                    textView2.setTextSize(0, textSize);
                    mskVar.d.setTextSize(0, textSize);
                    textView.setTextSize(0, textSize2);
                    mskVar.e.setTextSize(0, textSize);
                    mskVar.f.setTextSize(0, textSize);
                    mskVar.i.setTextSize(0, textSize2);
                    break;
                }
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                displayMetrics.getClass();
                int C = iz8.C(displayMetrics, view.getWidth());
                int C2 = iz8.C(displayMetrics, view.getHeight());
                Host host = (Host) obj;
                host.CurrentPosition = new l2f(C, C2, iz8.C(displayMetrics, view.getLeft()), iz8.C(displayMetrics, view.getTop()));
                host.State = "expanded";
                StringBuilder sb = new StringBuilder();
                t33.f(sb, host.CurrentPosition, false);
                t33.h(host.State, sb);
                t33.d(sb, new ljh(C, C2));
                t33.e("expanded", sb);
                ((WebView) viewGroup).evaluateJavascript(sb.toString(), null);
                break;
            default:
                View view2 = (View) obj;
                if (view2.getVisibility() == 0) {
                    ((lsi) viewGroup).c(view2);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v03(ViewGroup viewGroup, int i, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = viewGroup;
    }
}
