package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class yy9 extends g7 {
    public final Gender l;
    public final LayoutInflater m;
    public boolean n;
    public final boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy9(Context context, Gender gender) {
        super(context);
        context.getClass();
        this.l = gender;
        this.m = LayoutInflater.from(context);
        this.o = true;
    }

    public final void G(List list, gy5 gy5Var, gwf gwfVar, boolean z, Long l) {
        Object obj;
        Integer num;
        Integer time;
        Integer time2;
        list.getClass();
        boolean z2 = this.n;
        Context context = this.b;
        context.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof Incident) {
                    break;
                }
            }
        }
        if (!(obj instanceof Incident)) {
            obj = null;
        }
        Incident incident = (Incident) obj;
        String sport = incident != null ? incident.getSport() : null;
        xbb b = a.b();
        if (l != null) {
            if (!Intrinsics.c(gy5Var != null ? Boolean.valueOf(gy5Var.a) : null, Boolean.TRUE)) {
                b.add(new bz9(l.longValue()));
            }
        }
        if (Intrinsics.c(gy5Var != null ? Boolean.valueOf(gy5Var.a) : null, Boolean.TRUE)) {
            b.add(new zy9(list.isEmpty()));
        }
        Iterator it2 = list.iterator();
        Incident incident2 = null;
        while (it2.hasNext()) {
            Incident incident3 = (Incident) it2.next();
            if (Intrinsics.c(sport, Sports.FOOTBALL)) {
                if (Intrinsics.c(incident2 != null ? Boolean.valueOf(incident2.isOnBench()) : null, Boolean.FALSE) && incident3.isOnBench()) {
                    b.add(dz9.c);
                } else if (z && ((incident2 == null || (time2 = incident2.getTime()) == null || time2.intValue() != -1 || !(incident2 instanceof Incident.CardIncident)) && (time = incident3.getTime()) != null && time.intValue() == -1 && (incident3 instanceof Incident.CardIncident))) {
                    b.add(hz9.c);
                }
                incident2 = incident3;
            }
            b.add(jz9.a(context, incident3, gwfVar));
        }
        if ((gy5Var != null ? gy5Var.b : null) != null && (num = gy5Var.c) != null) {
            b.add(new az9(gy5Var.b, num));
        }
        xbb a = a.a(b);
        iz9 iz9Var = (iz9) CollectionsKt.firstOrNull(a);
        if (iz9Var != null) {
            iz9Var.a = !z2;
        }
        iz9 iz9Var2 = (iz9) CollectionsKt.j0(a);
        if (iz9Var2 != null) {
            iz9Var2.b = true;
        }
        F(a);
    }

    public String H(fz9 fz9Var) {
        return afi.c(this.b, fz9Var.d, fz9Var.f, true);
    }

    public boolean I() {
        return this.o;
    }

    @Override // defpackage.ysk
    /* renamed from: J */
    public boolean j(int i, iz9 iz9Var) {
        if (iz9Var instanceof zy9) {
            return true;
        }
        if (iz9Var instanceof gz9) {
            return ((gz9) iz9Var).e;
        }
        return false;
    }

    @Override // defpackage.ysk
    public final Integer a(int i) {
        if (i == 3) {
            return Integer.valueOf(R.id.section_text);
        }
        return null;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 19);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        iz9 iz9Var = (iz9) obj;
        iz9Var.getClass();
        boolean z = iz9Var instanceof gz9;
        if (z && ((gz9) iz9Var).c.o != null) {
            return 10;
        }
        if (z) {
            return 1;
        }
        if (iz9Var instanceof fz9) {
            return 2;
        }
        if (iz9Var instanceof bz9) {
            return 11;
        }
        if (iz9Var instanceof cz9) {
            return 3;
        }
        if (iz9Var instanceof dz9) {
            return 4;
        }
        if (iz9Var instanceof ez9) {
            return 5;
        }
        if (iz9Var instanceof zy9) {
            return 6;
        }
        if (iz9Var instanceof az9) {
            return 7;
        }
        if (iz9Var instanceof hz9) {
            return 8;
        }
        zzl.b();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        mqi b = ypa.b(new ij8(17, this, viewGroup));
        int i2 = 0;
        LayoutInflater layoutInflater = this.m;
        switch (i) {
            case 1:
            case 10:
                View inflate = layoutInflater.inflate(R.layout.incident_view_holder_layout, viewGroup, false);
                int i3 = R.id.compose_view;
                ComposeView composeView = (ComposeView) nq8.B(R.id.compose_view, inflate);
                if (composeView != null) {
                    i3 = R.id.popup_anchor_away;
                    View B = nq8.B(R.id.popup_anchor_away, inflate);
                    if (B != null) {
                        i3 = R.id.popup_anchor_home;
                        View B2 = nq8.B(R.id.popup_anchor_home, inflate);
                        if (B2 != null) {
                            return new xy9(this, new ez0((FrameLayout) inflate, composeView, B, B2, 17), this.l);
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 2:
                return new wde((vz9) b.getValue(), this instanceof ii6, I(), new s26(1, this, yy9.class, "getPeriodText", "getPeriodText(Lcom/sofascore/results/event/details/adapter/model/IncidentAdapterItem$PeriodIncident;)Ljava/lang/String;", 0, 19));
            case 3:
                View inflate2 = layoutInflater.inflate(R.layout.event_incident_injury_time, viewGroup, false);
                TextView textView = (TextView) nq8.B(R.id.text_injury_time, inflate2);
                if (textView != null) {
                    return new l32(new o16((FrameLayout) inflate2, textView, i2));
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.text_injury_time)));
                return null;
            case 4:
                return new wpd((vz9) b.getValue(), 0);
            case 5:
                return new wpd(vz9.a(layoutInflater, viewGroup), 1);
            case 6:
                View inflate3 = layoutInflater.inflate(R.layout.crowdsourcing_incidents_banner, viewGroup, false);
                int i4 = R.id.contribute;
                if (((TextView) nq8.B(R.id.contribute, inflate3)) != null) {
                    i4 = R.id.icon;
                    if (((ImageView) nq8.B(R.id.icon, inflate3)) != null) {
                        i4 = R.id.subtitle;
                        if (((TextView) nq8.B(R.id.subtitle, inflate3)) != null) {
                            i4 = R.id.t_com_view;
                            if (((ShapeableImageView) nq8.B(R.id.t_com_view, inflate3)) != null) {
                                i4 = R.id.title;
                                if (((TextView) nq8.B(R.id.title, inflate3)) != null) {
                                    return new wh(new t54((FrameLayout) inflate3, 0));
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i4)));
                return null;
            case 7:
                return new m34(esk.b(layoutInflater, viewGroup), 0);
            case 8:
                return new wpd((vz9) b.getValue(), 2);
            case 9:
            default:
                ilg.c();
                return null;
            case 11:
                return new vh(esk.b(layoutInflater, viewGroup));
        }
    }
}
