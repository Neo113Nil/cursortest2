package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.hockey.HockeyEventMapView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vd9 extends t2 {
    public final ed j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd9(Context context, h16 h16Var) {
        super(context);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.hockey_play_by_play_shotmap_collapsable, (ViewGroup) getBinding().a, false);
        HockeyEventMapView hockeyEventMapView = (HockeyEventMapView) nq8.B(R.id.shotmap, inflate);
        if (hockeyEventMapView == null) {
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.shotmap)));
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.j = new ed(constraintLayout, 11, hockeyEventMapView);
        Integer valueOf = Integer.valueOf(R.drawable.hockey_shotmap_icon);
        constraintLayout.getClass();
        t2.j(this, R.string.hockey_event_map, valueOf, 0, constraintLayout, false, "HOCKEY_EVENT_MAP", h16Var, new uf8(5, this, context), 42);
    }

    public final void setSelectedIncident(@Nullable HockeyIncident hockeyIncident) {
        Boolean isHome = hockeyIncident != null ? hockeyIncident.getIsHome() : null;
        TeamSelection teamSelection = Intrinsics.c(isHome, Boolean.TRUE) ? TeamSelection.First : Intrinsics.c(isHome, Boolean.FALSE) ? TeamSelection.Second : null;
        HockeyEventMapView hockeyEventMapView = (HockeyEventMapView) this.j.c;
        HockeyShotmapItem eventMapItem = hockeyIncident != null ? hockeyIncident.getEventMapItem() : null;
        hockeyEventMapView.C = eventMapItem != null ? new wd9(eventMapItem, hockeyEventMapView.c(eventMapItem.getPoint())) : null;
        hockeyEventMapView.D = teamSelection;
        hockeyEventMapView.invalidate();
    }
}
