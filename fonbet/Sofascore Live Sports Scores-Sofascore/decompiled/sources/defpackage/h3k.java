package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h3k extends g7 {
    public final LayoutInflater l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3k(Context context) {
        super(context);
        context.getClass();
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.l = from;
    }

    @Override // defpackage.ysk
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return obj instanceof Country;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 22);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof Country) {
            return 0;
        }
        if (obj instanceof CustomizableDivider) {
            return 1;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 0) {
            if (i == 1) {
                return new wh(new SofaDivider(this.b, null, 6));
            }
            ilg.c();
            return null;
        }
        View inflate = this.l.inflate(R.layout.image_label_indicator_layout, viewGroup, false);
        int i2 = R.id.row_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.row_icon, inflate);
        if (imageView != null) {
            i2 = R.id.row_indicator;
            View B = nq8.B(R.id.row_indicator, inflate);
            if (B != null) {
                i2 = R.id.row_title;
                TextView textView = (TextView) nq8.B(R.id.row_title, inflate);
                if (textView != null) {
                    return new j8i(new ez0((LinearLayout) inflate, imageView, B, textView, 16));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
