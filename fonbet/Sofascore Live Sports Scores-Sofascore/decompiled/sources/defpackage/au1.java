package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.EventType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class au1 extends z6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au1(Context context) {
        super(context);
        context.getClass();
    }

    public final void c(View view, Event event, boolean z) {
        p12 c = p12.c(a());
        nfc nfcVar = (nfc) c.l;
        ImageView imageView = nfcVar.b;
        ConstraintLayout constraintLayout = nfcVar.a;
        nfc nfcVar2 = (nfc) c.d;
        ConstraintLayout constraintLayout2 = nfcVar2.a;
        nfc nfcVar3 = (nfc) c.b;
        ConstraintLayout constraintLayout3 = nfcVar3.a;
        nfc nfcVar4 = (nfc) c.e;
        ConstraintLayout constraintLayout4 = nfcVar4.a;
        nfc nfcVar5 = (nfc) c.j;
        ConstraintLayout constraintLayout5 = nfcVar5.a;
        nfc nfcVar6 = (nfc) c.i;
        ConstraintLayout constraintLayout6 = nfcVar6.a;
        nfc nfcVar7 = (nfc) c.k;
        ConstraintLayout constraintLayout7 = nfcVar7.a;
        nfc nfcVar8 = (nfc) c.c;
        ConstraintLayout constraintLayout8 = nfcVar8.a;
        ImageView imageView2 = nfcVar8.b;
        this.d = new PopupWindow((FrameLayout) c.h, -2, -2);
        LinearLayout linearLayout = (LinearLayout) c.f;
        linearLayout.setBackgroundResource(R.drawable.menu_background_surface);
        linearLayout.setElevation(this.c);
        if (z) {
            constraintLayout8.setOnClickListener(new cn(9, event, this));
            imageView2.setVisibility(0);
            imageView2.setImageResource(R.drawable.ic_notification_mute);
            Context context = this.a;
            imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.neutral_default)));
            nfcVar8.c.setText(context.getString(R.string.mute_event));
        } else {
            c.g.setVisibility(8);
            constraintLayout8.getClass();
            constraintLayout8.setVisibility(8);
        }
        HashSet<EventType> typeList = event.getTypeList();
        if (typeList == null || !typeList.contains(EventType.MY_FIRST_TEAM)) {
            constraintLayout7.setVisibility(8);
        } else {
            constraintLayout7.setVisibility(0);
            e(nfcVar7, Event.getHomeTeam$default(event, null, 1, null));
        }
        HashSet<EventType> typeList2 = event.getTypeList();
        if (typeList2 == null || !typeList2.contains(EventType.MY_FIRST_SUB_TEAM_1)) {
            constraintLayout6.setVisibility(8);
        } else {
            constraintLayout6.setVisibility(0);
            d(nfcVar6, Event.getHomeTeam$default(event, null, 1, null).getSubTeam1());
        }
        HashSet<EventType> typeList3 = event.getTypeList();
        if (typeList3 == null || !typeList3.contains(EventType.MY_FIRST_SUB_TEAM_2)) {
            constraintLayout5.setVisibility(8);
        } else {
            constraintLayout5.setVisibility(0);
            d(nfcVar5, Event.getHomeTeam$default(event, null, 1, null).getSubTeam2());
        }
        HashSet<EventType> typeList4 = event.getTypeList();
        if (typeList4 == null || !typeList4.contains(EventType.MY_SECOND_TEAM)) {
            constraintLayout4.setVisibility(8);
        } else {
            constraintLayout4.setVisibility(0);
            e(nfcVar4, Event.getAwayTeam$default(event, null, 1, null));
        }
        HashSet<EventType> typeList5 = event.getTypeList();
        if (typeList5 == null || !typeList5.contains(EventType.MY_SECOND_SUB_TEAM_1)) {
            constraintLayout3.setVisibility(8);
        } else {
            constraintLayout3.setVisibility(0);
            d(nfcVar3, Event.getAwayTeam$default(event, null, 1, null).getSubTeam1());
        }
        HashSet<EventType> typeList6 = event.getTypeList();
        if (typeList6 == null || !typeList6.contains(EventType.MY_SECOND_SUB_TEAM_2)) {
            constraintLayout2.setVisibility(8);
        } else {
            constraintLayout2.setVisibility(0);
            d(nfcVar2, Event.getAwayTeam$default(event, null, 1, null).getSubTeam2());
        }
        HashSet<EventType> typeList7 = event.getTypeList();
        if (typeList7 == null || !typeList7.contains(EventType.MY_LEAGUES)) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            Tournament tournament = event.getTournament();
            imageView.setVisibility(0);
            UniqueTournament uniqueTournament = tournament.getUniqueTournament();
            if (uniqueTournament != null) {
                as9.q(imageView, Integer.valueOf(uniqueTournament.getId()), 0, null);
                nfcVar.c.setText(tba.x(uniqueTournament));
                constraintLayout.setOnClickListener(new qh(4, this, uniqueTournament, tournament));
            }
        }
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            b(view, popupWindow);
        }
    }

    public final void d(nfc nfcVar, SubTeam subTeam) {
        ImageView imageView = nfcVar.b;
        if (subTeam == null) {
            return;
        }
        imageView.setVisibility(0);
        as9.o(imageView, subTeam.getId());
        nfcVar.c.setText(tba.v(subTeam, this.a));
        if (subTeam.getDisabled()) {
            return;
        }
        nfcVar.a.setOnClickListener(new cn(12, this, subTeam));
    }

    public final void e(nfc nfcVar, Team team) {
        ImageView imageView = nfcVar.b;
        if (team == null) {
            return;
        }
        imageView.setVisibility(0);
        as9.o(imageView, team.getId());
        nfcVar.c.setText(tba.p(this.a, team));
        if (team.getDisabled()) {
            return;
        }
        nfcVar.a.setOnClickListener(new cn(11, this, team));
    }

    public final void f(View view, Stage stage, Function0 function0) {
        e92 h = e92.h(a());
        this.d = new PopupWindow((FrameLayout) h.b, -2, -2);
        LinearLayout linearLayout = (LinearLayout) h.f;
        linearLayout.setBackgroundResource(R.drawable.menu_background_surface);
        linearLayout.setElevation(this.c);
        nfc nfcVar = (nfc) h.c;
        TextView textView = nfcVar.c;
        Context context = this.a;
        textView.setText(context.getString(R.string.remove_from_favourites));
        ImageView imageView = nfcVar.b;
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.ic_delete);
        imageView.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.error)));
        nfcVar.a.setOnClickListener(new qh(3, stage, function0, this));
        ((View) h.e).setVisibility(8);
        ((nfc) h.d).a.setVisibility(8);
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            b(view, popupWindow);
        }
    }

    public final void g(View view, Stage stage, Function0 function0) {
        p12 c = p12.c(a());
        nfc nfcVar = (nfc) c.l;
        ImageView imageView = nfcVar.b;
        ConstraintLayout constraintLayout = nfcVar.a;
        PopupWindow popupWindow = new PopupWindow((FrameLayout) c.h, -2, -2);
        this.d = popupWindow;
        LinearLayout linearLayout = (LinearLayout) c.f;
        linearLayout.setBackgroundResource(R.drawable.menu_background_surface);
        linearLayout.setElevation(this.c);
        ((nfc) c.k).a.setVisibility(8);
        ((nfc) c.i).a.setVisibility(8);
        ((nfc) c.j).a.setVisibility(8);
        ((nfc) c.e).a.setVisibility(8);
        ((nfc) c.b).a.setVisibility(8);
        ((nfc) c.d).a.setVisibility(8);
        nfc nfcVar2 = (nfc) c.c;
        nfcVar2.a.setOnClickListener(new qh(2, stage, function0, popupWindow));
        ImageView imageView2 = nfcVar2.b;
        imageView2.setVisibility(0);
        imageView2.setImageResource(R.drawable.ic_notification_mute);
        Context context = this.a;
        imageView2.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.neutral_default)));
        nfcVar2.c.setText(context.getString(R.string.mute_event));
        UniqueStage uniqueStage = stage.getUniqueStage();
        if (uniqueStage == null) {
            StageSeason stageSeason = stage.getStageSeason();
            uniqueStage = stageSeason != null ? stageSeason.getUniqueStage() : null;
        }
        if (!stage.getTypeList().contains(StageType.MY_UNIQUE_STAGE) || uniqueStage == null) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            imageView.setVisibility(0);
            as9.b(imageView, Integer.valueOf(uniqueStage.getCategory().getId()), null);
            nfcVar.c.setText(uniqueStage.getName());
            constraintLayout.setOnClickListener(new cn(10, this, uniqueStage));
        }
        b(view, popupWindow);
    }
}
