package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.results.view.CircularDropdownIndicatorView;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v93 extends p8 {
    public final /* synthetic */ int c;
    public final z82 d;
    public final /* synthetic */ ca3 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v93(ca3 ca3Var, z82 z82Var, int i) {
        super(r1);
        this.c = i;
        switch (i) {
            case 1:
                this.e = ca3Var;
                LinearLayout linearLayout = (LinearLayout) z82Var.b;
                linearLayout.getClass();
                super(linearLayout);
                this.d = z82Var;
                break;
            default:
                this.e = ca3Var;
                LinearLayout linearLayout2 = (LinearLayout) z82Var.b;
                linearLayout2.getClass();
                this.d = z82Var;
                break;
        }
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3 = this.c;
        ca3 ca3Var = this.e;
        z82 z82Var = this.d;
        switch (i3) {
            case 0:
                w93 w93Var = (w93) obj;
                w93Var.getClass();
                LinearLayout linearLayout = (LinearLayout) z82Var.b;
                TextView textView = (TextView) z82Var.c;
                CircularDropdownIndicatorView circularDropdownIndicatorView = (CircularDropdownIndicatorView) z82Var.f;
                linearLayout.getClass();
                ArrayList arrayList = ca3Var.i;
                sea.v(linearLayout, true, i == b.i(arrayList) || (CollectionsKt.a0(i + 1, arrayList) instanceof w93), 24, 6, 0, null, 112);
                Category category = w93Var.b;
                rv3 z = tba.z(category, this.b);
                String str = z.b;
                ((TextView) z82Var.g).setText(z.a);
                textView.setVisibility(str != null ? 0 : 8);
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                ((TextView) z82Var.d).setVisibility(8);
                if (category.getType() != null) {
                    circularDropdownIndicatorView.setVisibility(4);
                } else {
                    circularDropdownIndicatorView.setVisibility(0);
                    circularDropdownIndicatorView.setExpanded(w93Var.d);
                    circularDropdownIndicatorView.setLoading(w93Var.d && category.getIsDownloading());
                }
                as9.b((ImageView) z82Var.e, Integer.valueOf(category.getId()), null);
                break;
            default:
                x93 x93Var = (x93) obj;
                x93Var.getClass();
                LinearLayout linearLayout2 = (LinearLayout) z82Var.b;
                linearLayout2.getClass();
                Object a0 = CollectionsKt.a0(i + 1, ca3Var.i);
                sea.v(linearLayout2, false, a0 == null || (a0 instanceof w93), 24, 4, 0, null, 112);
                ((TextView) z82Var.g).setText(x93Var.b);
                ((TextView) z82Var.c).setVisibility(8);
                ((TextView) z82Var.d).setVisibility(8);
                CircularDropdownIndicatorView circularDropdownIndicatorView2 = (CircularDropdownIndicatorView) z82Var.f;
                circularDropdownIndicatorView2.setVisibility(0);
                circularDropdownIndicatorView2.setExpanded(x93Var.e);
                circularDropdownIndicatorView2.setLoading(false);
                as9.q((ImageView) z82Var.e, x93Var.c, 0, null);
                break;
        }
    }
}
