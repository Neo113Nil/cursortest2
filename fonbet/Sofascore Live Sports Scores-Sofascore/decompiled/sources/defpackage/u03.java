package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.results.R;
import com.sofascore.results.view.CircularDropdownIndicatorView;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u03 extends p8 {
    public final /* synthetic */ int c;
    public final z82 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u03(z82 z82Var, int i) {
        super(r2);
        this.c = i;
        switch (i) {
            case 1:
                LinearLayout linearLayout = (LinearLayout) z82Var.b;
                linearLayout.getClass();
                super(linearLayout);
                this.d = z82Var;
                break;
            default:
                LinearLayout linearLayout2 = (LinearLayout) z82Var.b;
                linearLayout2.getClass();
                this.d = z82Var;
                break;
        }
    }

    @Override // defpackage.p8
    public void a(Object obj) {
        switch (this.c) {
            case 0:
                obj.getClass();
                if (obj instanceof tcb) {
                    Category category = ((tcb) obj).a.b;
                    d(category.getLiveEvents(), category.getTotalEvents());
                    break;
                }
                break;
            default:
                super.a(obj);
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        Context context = this.b;
        z82 z82Var = this.d;
        boolean z = false;
        switch (i3) {
            case 0:
                ci6 ci6Var = (ci6) obj;
                ci6Var.getClass();
                LinearLayout linearLayout = (LinearLayout) z82Var.b;
                TextView textView = (TextView) z82Var.c;
                CircularDropdownIndicatorView circularDropdownIndicatorView = (CircularDropdownIndicatorView) z82Var.f;
                linearLayout.getClass();
                boolean z2 = ci6Var.d;
                Category category = ci6Var.b;
                sea.v(linearLayout, true, !z2 || category.getIsDownloading(), 24, 6, 0, null, 112);
                rv3 z3 = tba.z(category, context);
                String str = z3.b;
                ((TextView) z82Var.g).setText(z3.a);
                textView.setVisibility(str != null ? 0 : 8);
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                if (category.getType() != null) {
                    circularDropdownIndicatorView.setVisibility(4);
                } else {
                    circularDropdownIndicatorView.setVisibility(0);
                    circularDropdownIndicatorView.setExpanded(ci6Var.d);
                    if (ci6Var.d && category.getIsDownloading()) {
                        z = true;
                    }
                    circularDropdownIndicatorView.setLoading(z);
                }
                as9.b((ImageView) z82Var.e, Integer.valueOf(category.getId()), null);
                d(category.getLiveEvents(), category.getTotalEvents());
                break;
            default:
                dhe dheVar = (dhe) obj;
                dheVar.getClass();
                LinearLayout linearLayout2 = (LinearLayout) z82Var.b;
                CircularDropdownIndicatorView circularDropdownIndicatorView2 = (CircularDropdownIndicatorView) z82Var.f;
                TextView textView2 = (TextView) z82Var.d;
                linearLayout2.getClass();
                boolean z4 = dheVar.a;
                int i4 = dheVar.c;
                sea.v(linearLayout2, true, !z4 || dheVar.b, 24, 6, 0, null, 112);
                ((ImageView) z82Var.e).setVisibility(8);
                ((TextView) z82Var.c).setVisibility(8);
                ((TextView) z82Var.g).setText(context.getString(R.string.recommended));
                textView2.setVisibility(i4 > 0 ? 0 : 8);
                textView2.setText(yid.e(3, null, Integer.valueOf(i4)));
                circularDropdownIndicatorView2.setExpanded(dheVar.a);
                if (dheVar.a && dheVar.b) {
                    z = true;
                }
                circularDropdownIndicatorView2.setLoading(z);
                break;
        }
    }

    public void d(int i, int i2) {
        TextView textView = (TextView) this.d.d;
        textView.setVisibility(i >= 0 ? 0 : 8);
        if (i <= 0) {
            textView.setText(yid.e(3, null, Integer.valueOf(i2)));
            return;
        }
        SpannableString spannableString = new SpannableString(String.format(dla.d(), "%d / %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2)));
        spannableString.setSpan(new ForegroundColorSpan(this.b.getColor(R.color.live)), 0, String.valueOf(i).length(), 0);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }
}
