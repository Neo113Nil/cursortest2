package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.TvEvent;
import com.sofascore.model.newNetwork.TvStageEvent;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class csi extends g7 {
    public final int l;
    public final int m;
    public final LayoutInflater n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csi(Context context) {
        super(context);
        context.getClass();
        this.l = ao2.s(16, context);
        this.m = ao2.s(4, context);
        this.n = LayoutInflater.from(context);
    }

    public final TextView G(List list, boolean z) {
        TextView textView = new TextView(new ContextThemeWrapper(this.b, R.style.BodyMedium));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i4 = this.m;
        layoutParams.setMargins(i, i4, i2, i3);
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(5);
        textView.setTextColor(textView.getContext().getColor(R.color.n_lv_3));
        textView.setCompoundDrawablePadding(i4);
        textView.setText(CollectionsKt.f0(list, "\n", null, null, new gk(z, textView, this, 14), 30));
        return textView;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return (obj instanceof TvEvent) || (obj instanceof TvStageEvent);
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 17);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof TvEvent) {
            return 2;
        }
        if (obj instanceof TvStageEvent) {
            return 3;
        }
        if (obj instanceof String) {
            return 1;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 1) {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.tv_schedule_time_separator_item, viewGroup, false);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                return new j8i(new mt1(textView, textView, 1));
            }
            yhk.s("rootView");
            return null;
        }
        int i2 = R.id.sport;
        LayoutInflater layoutInflater = this.n;
        if (i != 2) {
            if (i != 3) {
                ilg.c();
                return null;
            }
            View inflate2 = layoutInflater.inflate(R.layout.tv_schedule_stage_item, viewGroup, false);
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.channels_container, inflate2);
            if (linearLayout != null) {
                int i3 = R.id.description;
                TextView textView2 = (TextView) nq8.B(R.id.description, inflate2);
                if (textView2 != null) {
                    i3 = R.id.icon;
                    ImageView imageView = (ImageView) nq8.B(R.id.icon, inflate2);
                    if (imageView != null) {
                        TextView textView3 = (TextView) nq8.B(R.id.sport, inflate2);
                        if (textView3 != null) {
                            return new gai(this, new mvj((ConstraintLayout) inflate2, linearLayout, textView2, imageView, textView3));
                        }
                    }
                }
                i2 = i3;
            } else {
                i2 = R.id.channels_container;
            }
            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
            return null;
        }
        View inflate3 = layoutInflater.inflate(R.layout.tv_schedule_event_item, viewGroup, false);
        LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.channels_container, inflate3);
        if (linearLayout2 != null) {
            int i4 = R.id.first_icon;
            ImageView imageView2 = (ImageView) nq8.B(R.id.first_icon, inflate3);
            if (imageView2 != null) {
                i4 = R.id.first_team;
                TextView textView4 = (TextView) nq8.B(R.id.first_team, inflate3);
                if (textView4 != null) {
                    i4 = R.id.second_icon;
                    ImageView imageView3 = (ImageView) nq8.B(R.id.second_icon, inflate3);
                    if (imageView3 != null) {
                        i4 = R.id.second_team;
                        TextView textView5 = (TextView) nq8.B(R.id.second_team, inflate3);
                        if (textView5 != null) {
                            TextView textView6 = (TextView) nq8.B(R.id.sport, inflate3);
                            if (textView6 != null) {
                                i2 = R.id.teams_separator;
                                if (((TextView) nq8.B(R.id.teams_separator, inflate3)) != null) {
                                    return new gai(this, new v82((ConstraintLayout) inflate3, (View) linearLayout2, imageView2, textView4, (View) imageView3, (View) textView5, (View) textView6, 15));
                                }
                            }
                        }
                    }
                }
            }
            i2 = i4;
        } else {
            i2 = R.id.channels_container;
        }
        yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
        return null;
    }
}
