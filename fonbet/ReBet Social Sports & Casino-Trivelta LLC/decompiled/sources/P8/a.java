package P8;

import O8.s;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8822a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f8823b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8824c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8825d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8826e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8827f;

    public a(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f8822a = linearLayout;
        this.f8823b = linearLayout2;
        this.f8824c = textView;
        this.f8825d = textView2;
        this.f8826e = textView3;
        this.f8827f = textView4;
    }

    public static a a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = s.f8449F;
        TextView textView = (TextView) N2.a.a(view, i10);
        if (textView != null) {
            i10 = s.f8451G;
            TextView textView2 = (TextView) N2.a.a(view, i10);
            if (textView2 != null) {
                i10 = s.f8459K;
                TextView textView3 = (TextView) N2.a.a(view, i10);
                if (textView3 != null) {
                    i10 = s.f8468Q;
                    TextView textView4 = (TextView) N2.a.a(view, i10);
                    if (textView4 != null) {
                        return new a(linearLayout, linearLayout, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
