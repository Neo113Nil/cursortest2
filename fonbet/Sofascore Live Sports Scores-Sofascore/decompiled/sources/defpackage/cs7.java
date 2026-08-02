package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.DateSection;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.EventListScoreTextView;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class cs7 extends qzh {
    public final boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs7(Context context) {
        super(context);
        context.getClass();
        this.t = true;
    }

    @Override // defpackage.qzh, defpackage.w0
    public final void G(t54 t54Var, int i, int i2, AdBannerView adBannerView) {
        int i3;
        int intValue;
        int intValue2;
        super.G(t54Var, i, i2, adBannerView);
        ArrayList arrayList = this.i;
        int i4 = i + 1;
        int i5 = -1;
        if (arrayList.size() > i4) {
            Object obj = arrayList.get(i4);
            obj.getClass();
            i3 = v(obj);
        } else {
            i3 = -1;
        }
        if (i > 0) {
            Object obj2 = arrayList.get(i - 1);
            obj2.getClass();
            i5 = v(obj2);
        }
        pzh.b.getClass();
        Integer[] numArr = pzh.c;
        boolean v = ph0.v(numArr, Integer.valueOf(i5));
        Context context = this.b;
        if ((!v && i5 != 2 && i5 != 9) || (!ph0.v(numArr, Integer.valueOf(i3)) && i3 != 2)) {
            adBannerView.setBackgroundColor(context.getColor(R.color.surface_0));
            return;
        }
        boolean z = true;
        if (arrayList.size() - 1 != i) {
            Object a0 = CollectionsKt.a0(i4, arrayList);
            Integer valueOf = a0 != null ? Integer.valueOf(v(a0)) : null;
            Object a02 = CollectionsKt.a0(i + 2, arrayList);
            Integer valueOf2 = a02 != null ? Integer.valueOf(v(a02)) : null;
            if ((valueOf != null && valueOf.intValue() == 10001) || (valueOf != null && valueOf.intValue() == 10002) ? !(valueOf2 == null || (intValue2 = valueOf2.intValue()) == 16 || intValue2 == 17) : !(valueOf == null || (intValue = valueOf.intValue()) == 16 || intValue == 17)) {
                z = false;
            }
        }
        adBannerView.setBackgroundColor(context.getColor(R.color.surface_1));
        sea.v(adBannerView, false, z, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    @Override // defpackage.w0
    public final boolean J() {
        return this.t;
    }

    @Override // defpackage.qzh
    public final void U() {
        Event d;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            y21 y21Var = obj instanceof y21 ? (y21) obj : null;
            if (y21Var != null && (d = y21Var.d()) != null) {
                notifyItemChanged(this.g.size() + i, new scb(d));
            }
        }
    }

    public final void V(TextView textView, long j) {
        ZoneId systemDefault = ZoneId.systemDefault();
        if (Instant.ofEpochSecond(j).atZone(systemDefault).toLocalDate().isAfter(LocalDate.now(systemDefault))) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Context context = this.b;
        context.getClass();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
        bestPattern.getClass();
        fn0.u(j, hk4.a(bestPattern), textView);
    }

    @Override // defpackage.qzh, defpackage.ysk
    public final Integer a(int i) {
        haf hafVar = pzh.b;
        return i == 2 ? Integer.valueOf(R.id.card_content) : super.a(i);
    }

    @Override // defpackage.g7, androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.k = recyclerView;
        u6b w = qha.w(recyclerView);
        if (w != null) {
            hc6.i(this, w);
        }
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public int v(Object obj) {
        obj.getClass();
        if (obj instanceof lrj) {
            haf hafVar = pzh.b;
            return 2;
        }
        if (obj instanceof m5i) {
            haf hafVar2 = pzh.b;
            return 18;
        }
        if (obj instanceof nak) {
            haf hafVar3 = pzh.b;
            return 19;
        }
        if (obj instanceof DateSection) {
            haf hafVar4 = pzh.b;
            return 16;
        }
        if (obj == pzh.d) {
            return 21;
        }
        return super.v(obj);
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        LayoutInflater layoutInflater = this.r;
        if (i == 16) {
            return new as7(w16.a(layoutInflater, viewGroup), 0);
        }
        if (i != 18) {
            if (i == 19) {
                return new wh(zl.e(layoutInflater, viewGroup));
            }
            int i2 = 1;
            if (i == 5) {
                return new ai6(this, pvk.a(layoutInflater, viewGroup), i2);
            }
            if (i == 7) {
                return new bi6(this, qvk.a(layoutInflater, viewGroup));
            }
            if (i == 8) {
                return new yh6(this, j22.d(layoutInflater, viewGroup));
            }
            int i3 = 2;
            if (i == 4 || i == 0) {
                return new wk4(this, bcb.a(layoutInflater, viewGroup), i3);
            }
            if (i == 2) {
                return new bs7(zl.e(layoutInflater, viewGroup), false, 0, S(), 22, 0);
            }
            if (i == 20) {
                MaterialCardView materialCardView = (MaterialCardView) z82.k(layoutInflater, viewGroup).b;
                materialCardView.getClass();
                return new r71(5, materialCardView);
            }
            if (i != 21) {
                return super.z(viewGroup, i);
            }
            View inflate = layoutInflater.inflate(R.layout.no_favorite_header_view, viewGroup, false);
            GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
            if (graphicLarge != null) {
                return new wh(new tm5((FrameLayout) inflate, graphicLarge, 1));
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.empty_state)));
            return null;
        }
        View inflate2 = layoutInflater.inflate(R.layout.viewholder_stage, viewGroup, false);
        int i4 = R.id.action_layout;
        View B = nq8.B(R.id.action_layout, inflate2);
        if (B != null) {
            nr1 a = nr1.a(B);
            i4 = R.id.description;
            if (((TextView) nq8.B(R.id.description, inflate2)) != null) {
                i4 = R.id.first_team_logo;
                if (((ImageView) nq8.B(R.id.first_team_logo, inflate2)) != null) {
                    i4 = R.id.first_team_name;
                    TextView textView = (TextView) nq8.B(R.id.first_team_name, inflate2);
                    if (textView != null) {
                        i4 = R.id.highlight;
                        View B2 = nq8.B(R.id.highlight, inflate2);
                        if (B2 != null) {
                            i4 = R.id.second_team_logo;
                            if (((ImageView) nq8.B(R.id.second_team_logo, inflate2)) != null) {
                                i4 = R.id.second_team_name;
                                TextView textView2 = (TextView) nq8.B(R.id.second_team_name, inflate2);
                                if (textView2 != null) {
                                    i4 = R.id.time_lower;
                                    EventListScoreTextView eventListScoreTextView = (EventListScoreTextView) nq8.B(R.id.time_lower, inflate2);
                                    if (eventListScoreTextView != null) {
                                        i4 = R.id.time_upper;
                                        TextView textView3 = (TextView) nq8.B(R.id.time_upper, inflate2);
                                        if (textView3 != null) {
                                            i4 = R.id.vertical_guideline_start;
                                            if (((Guideline) nq8.B(R.id.vertical_guideline_start, inflate2)) != null) {
                                                return new wh(new v82((ViewGroup) inflate2, (krk) a, textView, B2, (Object) textView2, (View) eventListScoreTextView, (Object) textView3, 17));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
        return null;
    }
}
