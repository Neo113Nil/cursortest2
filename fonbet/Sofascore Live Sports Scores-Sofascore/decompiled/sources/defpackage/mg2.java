package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mg2 extends g7 {
    public final LayoutInflater l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg2(Context context) {
        super(context);
        context.getClass();
        this.l = LayoutInflater.from(context);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((ZonedDateTime) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = this.l.inflate(R.layout.calendar_rail_item_layout, viewGroup, false);
        int i2 = R.id.indicator;
        ImageView imageView = (ImageView) nq8.B(R.id.indicator, inflate);
        if (imageView != null) {
            i2 = R.id.text_lower;
            TextView textView = (TextView) nq8.B(R.id.text_lower, inflate);
            if (textView != null) {
                i2 = R.id.text_upper;
                TextView textView2 = (TextView) nq8.B(R.id.text_upper, inflate);
                if (textView2 != null) {
                    return new vh(this, new pu1((LinearLayout) inflate, imageView, textView, textView2, 1));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
