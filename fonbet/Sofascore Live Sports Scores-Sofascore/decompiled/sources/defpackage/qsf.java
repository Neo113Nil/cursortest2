package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qsf extends g7 {
    public int l;
    public final LayoutInflater m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsf(Context context) {
        super(context);
        context.getClass();
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.m = from;
    }

    public final void G(int i) {
        int i2;
        this.l = i;
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        for (Object obj : arrayList) {
            if (obj instanceof RefereeStatisticsItem) {
                i2 = i;
                obj = RefereeStatisticsItem.copy$default((RefereeStatisticsItem) obj, null, 0, 0, 0, 0, 0, i2, 63, null);
            } else {
                i2 = i;
            }
            arrayList2.add(obj);
            i = i2;
        }
        H(i, arrayList2);
    }

    public final void H(int i, List list) {
        int i2 = this.l;
        if (i != i2) {
            G(i2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.add(new atf());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof RefereeStatisticsItem) {
                    arrayList2.add(obj);
                }
            }
            int i3 = this.l;
            arrayList.addAll(CollectionsKt.B0(i3 != 0 ? i3 != 1 ? i3 != 2 ? CollectionsKt.H0(arrayList2, new psf(o93.a(new osf(3), new osf(4)), 2)) : CollectionsKt.H0(arrayList2, new psf(o93.a(new osf(1), new osf(2)), 1)) : CollectionsKt.H0(arrayList2, new psf(o93.a(new b1f(29), new osf(0)), 0)) : CollectionsKt.H0(arrayList2, new cp(new laf(8), 26))));
        }
        F(arrayList);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 8);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof RefereeStatisticsItem) {
            return 1;
        }
        if (obj instanceof atf) {
            return 2;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.m;
        if (i == 1) {
            View inflate = layoutInflater.inflate(R.layout.referee_data, viewGroup, false);
            int i2 = R.id.appearances_data;
            TextView textView = (TextView) nq8.B(R.id.appearances_data, inflate);
            if (textView != null) {
                i2 = R.id.league_icon;
                ImageView imageView = (ImageView) nq8.B(R.id.league_icon, inflate);
                if (imageView != null) {
                    i2 = R.id.league_name;
                    TextView textView2 = (TextView) nq8.B(R.id.league_name, inflate);
                    if (textView2 != null) {
                        i2 = R.id.penalties_data;
                        TextView textView3 = (TextView) nq8.B(R.id.penalties_data, inflate);
                        if (textView3 != null) {
                            i2 = R.id.red_card_data;
                            TextView textView4 = (TextView) nq8.B(R.id.red_card_data, inflate);
                            if (textView4 != null) {
                                i2 = R.id.yellow_card_data;
                                TextView textView5 = (TextView) nq8.B(R.id.yellow_card_data, inflate);
                                if (textView5 != null) {
                                    return new z02(new eoc((ConstraintLayout) inflate, textView, imageView, textView2, textView3, textView4, textView5));
                                }
                            }
                        }
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i != 2) {
            ilg.c();
            return null;
        }
        View inflate2 = layoutInflater.inflate(R.layout.referee_section, viewGroup, false);
        int i3 = R.id.app_header;
        View B = nq8.B(R.id.app_header, inflate2);
        if (B != null) {
            v12 a = v12.a(B);
            i3 = R.id.pen_header;
            View B2 = nq8.B(R.id.pen_header, inflate2);
            if (B2 != null) {
                v12 a2 = v12.a(B2);
                i3 = R.id.red_header;
                View B3 = nq8.B(R.id.red_header, inflate2);
                if (B3 != null) {
                    v12 a3 = v12.a(B3);
                    i3 = R.id.referee_sub_section;
                    View B4 = nq8.B(R.id.referee_sub_section, inflate2);
                    if (B4 != null) {
                        kqb b = kqb.b(B4);
                        i3 = R.id.sort_lineups_header_text;
                        if (((TextView) nq8.B(R.id.sort_lineups_header_text, inflate2)) != null) {
                            i3 = R.id.yellow_header;
                            View B5 = nq8.B(R.id.yellow_header, inflate2);
                            if (B5 != null) {
                                return new kf8(new djf((LinearLayout) inflate2, a, a2, a3, b, v12.a(B5), 1), new mme(this, 20));
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        return null;
    }
}
