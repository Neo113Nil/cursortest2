package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final CardView f66329a;

    /* renamed from: b, reason: collision with root package name */
    public final CardView f66330b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f66331c;

    /* renamed from: d, reason: collision with root package name */
    public final MobilistenTextView f66332d;

    /* renamed from: e, reason: collision with root package name */
    public final RelativeLayout f66333e;

    public m(CardView cardView, CardView cardView2, LinearLayout linearLayout, MobilistenTextView mobilistenTextView, RelativeLayout relativeLayout) {
        this.f66329a = cardView;
        this.f66330b = cardView2;
        this.f66331c = linearLayout;
        this.f66332d = mobilistenTextView;
        this.f66333e = relativeLayout;
    }

    public static m a(View view) {
        CardView cardView = (CardView) view;
        int i10 = q.f60694w7;
        LinearLayout linearLayout = (LinearLayout) N2.a.a(view, i10);
        if (linearLayout != null) {
            i10 = q.f60704x7;
            MobilistenTextView mobilistenTextView = (MobilistenTextView) N2.a.a(view, i10);
            if (mobilistenTextView != null) {
                i10 = q.f60714y7;
                RelativeLayout relativeLayout = (RelativeLayout) N2.a.a(view, i10);
                if (relativeLayout != null) {
                    return new m(cardView, cardView, linearLayout, mobilistenTextView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60748L, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CardView b() {
        return this.f66329a;
    }
}
