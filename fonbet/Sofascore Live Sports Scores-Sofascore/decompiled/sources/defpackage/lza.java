package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lza extends w7 {
    public final /* synthetic */ int e = 1;
    public Object f;

    public lza(Context context, String str, List list) {
        super(context, list);
        this.f = str;
    }

    @Override // defpackage.w7
    public final View b(Context context, ViewGroup viewGroup, Object obj, View view) {
        Object zxiVar;
        Object a;
        switch (this.e) {
            case 0:
                context.getClass();
                viewGroup.getClass();
                if (view == null || (zxiVar = view.getTag()) == null) {
                    View inflate = LayoutInflater.from(context).inflate(R.layout.team_of_the_week_spinner_dropdown, viewGroup, false);
                    if (inflate == null) {
                        yhk.s("rootView");
                        return null;
                    }
                    zxiVar = new zxi((TextView) inflate);
                }
                TextView textView = ((zxi) zxiVar).a;
                textView.setText(obj instanceof String ? (CharSequence) obj : obj instanceof Season ? ((Season) obj).getName() : "");
                return textView;
            default:
                Season season = (Season) obj;
                context.getClass();
                viewGroup.getClass();
                season.getClass();
                if (view == null || (a = view.getTag()) == null) {
                    a = nza.a(LayoutInflater.from(context), viewGroup);
                }
                nza nzaVar = (nza) a;
                nzaVar.b.setText(season.getYear());
                TextView textView2 = nzaVar.a;
                w7.a(textView2, nzaVar);
                return textView2;
        }
    }

    @Override // defpackage.w7
    public final View c(Context context, ViewGroup viewGroup, Object obj, View view) {
        Object swaVar;
        Object a;
        String year;
        String str = "";
        switch (this.e) {
            case 0:
                context.getClass();
                viewGroup.getClass();
                if (view == null || (swaVar = view.getTag()) == null) {
                    View inflate = LayoutInflater.from(context).inflate(R.layout.league_events_item_view, viewGroup, false);
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    int i = R.id.item_text;
                    TextView textView = (TextView) nq8.B(R.id.item_text, inflate);
                    if (textView != null) {
                        i = R.id.season_image_arrow;
                        if (((ImageView) nq8.B(R.id.season_image_arrow, inflate)) != null) {
                            swaVar = new swa(linearLayout, textView);
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                    return null;
                }
                swa swaVar2 = (swa) swaVar;
                TextView textView2 = swaVar2.b;
                Object obj2 = this.f;
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else if (obj2 instanceof Season) {
                    str = ((Season) obj2).getName();
                }
                textView2.setText(str);
                LinearLayout linearLayout2 = swaVar2.a;
                linearLayout2.getClass();
                return linearLayout2;
            default:
                Season season = (Season) obj;
                context.getClass();
                viewGroup.getClass();
                season.getClass();
                if (view == null || (a = view.getTag()) == null) {
                    a = mza.a(LayoutInflater.from(context), viewGroup);
                }
                mza mzaVar = (mza) a;
                FrameLayout frameLayout = mzaVar.a;
                TextView textView3 = mzaVar.b;
                if (Intrinsics.c((String) this.f, Sports.E_SPORTS)) {
                    year = Intrinsics.c(season.getYear(), season.getName()) ? season.getYear() : null;
                    if (year == null) {
                        year = context.getString(R.string.e_sports_header, season.getYear(), c.r(season.getName(), " " + season.getYear(), "", false));
                        year.getClass();
                    }
                } else {
                    year = season.getYear();
                }
                textView3.setText(year);
                frameLayout.getClass();
                w7.a(frameLayout, mzaVar);
                return frameLayout;
        }
    }

    public /* synthetic */ lza(Context context, List list) {
        super(context, list);
    }
}
