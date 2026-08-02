package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Country;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class on2 extends g7 {
    public final List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on2(Context context, List list) {
        super(context);
        context.getClass();
        list.getClass();
        this.l = list;
    }

    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        super.F(CollectionsKt.w0(list, this.l));
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
        ((Country) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.channel_country_item, viewGroup, false);
        int i2 = R.id.channel_country_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.channel_country_icon, inflate);
        if (imageView != null) {
            i2 = R.id.channel_country_name;
            TextView textView = (TextView) nq8.B(R.id.channel_country_name, inflate);
            if (textView != null) {
                i2 = R.id.channel_indicator;
                ImageView imageView2 = (ImageView) nq8.B(R.id.channel_indicator, inflate);
                if (imageView2 != null) {
                    return new vh(this, new pn2((LinearLayout) inflate, imageView, textView, imageView2, 0));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
