package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qmc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaFightNightActivity b;

    public /* synthetic */ qmc(MmaFightNightActivity mmaFightNightActivity, int i) {
        this.a = i;
        this.b = mmaFightNightActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        int parseColor;
        switch (this.a) {
            case 0:
                xmc xmcVar = (xmc) obj;
                int i = MmaFightNightActivity.R;
                xmcVar.getClass();
                Tournament tournament = xmcVar.a;
                MmaFightNightActivity mmaFightNightActivity = this.b;
                mmaFightNightActivity.Q().l.setRefreshing(false);
                mmaFightNightActivity.x.a = Integer.valueOf(mmaFightNightActivity.Y());
                mqi mqiVar = mmaFightNightActivity.N;
                inc incVar = (inc) mqiVar.getValue();
                incVar.getClass();
                tournament.getClass();
                incVar.r = tournament;
                if (!mmaFightNightActivity.Q) {
                    mmaFightNightActivity.Q = true;
                    new pmc(mmaFightNightActivity, 3);
                    mmaFightNightActivity.Q().l.setEnabled(false);
                    split$default = StringsKt__StringsKt.split$default(tournament.getName(), new String[]{":"}, false, 0, 6, null);
                    String str = (String) CollectionsKt.firstOrNull(split$default);
                    String obj2 = str != null ? StringsKt.l0(str).toString() : null;
                    String str2 = (String) CollectionsKt.a0(1, split$default);
                    CollapsibleToolbarActivity.V(mmaFightNightActivity, obj2, null, str2 != null ? StringsKt.l0(str2).toString() : null, 8);
                    ImageView R = mmaFightNightActivity.R();
                    UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                    as9.q(R, uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null, tournament.getId(), null);
                    mmaFightNightActivity.R().setBackground(mmaFightNightActivity.getDrawable(R.drawable.rounded_surface_level_4));
                    mmaFightNightActivity.Q().e.setVisibility(0);
                    pco.G(mmaFightNightActivity.Q().e, new ixa(14, mmaFightNightActivity, tournament));
                    AbstractActivity.P(mmaFightNightActivity.Q().h, 0, 4);
                    UniqueTournament uniqueTournament2 = tournament.getUniqueTournament();
                    String primaryColorHex = uniqueTournament2 != null ? uniqueTournament2.getPrimaryColorHex() : null;
                    if (primaryColorHex != null) {
                        try {
                            parseColor = Color.parseColor(primaryColorHex);
                        } catch (Exception unused) {
                        }
                        mmaFightNightActivity.Q().d.setBackground(new ry0(parseColor));
                        mmaFightNightActivity.I(mmaFightNightActivity.Q().b, sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.MMA)));
                    }
                    parseColor = 0;
                    mmaFightNightActivity.Q().d.setBackground(new ry0(parseColor));
                    mmaFightNightActivity.I(mmaFightNightActivity.Q().b, sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.MMA)));
                }
                kp5 kp5Var = hnc.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : kp5Var) {
                    if (((Boolean) ((hnc) obj3).b.invoke(xmcVar)).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                ((inc) mqiVar.getValue()).x(arrayList);
                int id = tournament.getId();
                Boolean isLive = tournament.isLive();
                boolean booleanValue = isLive != null ? isLive.booleanValue() : false;
                Intent intent = mmaFightNightActivity.getIntent();
                intent.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                nv.h(firebaseBundle, intent);
                String F = nv.F(intent);
                if (F != null) {
                    firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
                }
                firebaseBundle.putString("location", nv.G(intent).a);
                firebaseBundle.putInt("id", id);
                firebaseBundle.putString("status", booleanValue ? "live" : "notlive");
                nv.N(mmaFightNightActivity, firebaseBundle, "open_fight_night");
                break;
            default:
                final UniqueTournament uniqueTournament3 = (UniqueTournament) obj;
                int i2 = MmaFightNightActivity.R;
                uniqueTournament3.getClass();
                MmaFightNightActivity mmaFightNightActivity2 = this.b;
                if (!mmaFightNightActivity2.isFinishing()) {
                    final py pyVar = new py(3, mmaFightNightActivity2, MmaFightNightActivity.class, "onFollowDialogDismissed", "onFollowDialogDismissed(IZZ)V", 0, 5);
                    final AlertDialog create = new AlertDialog.Builder(mmaFightNightActivity2, R.style.RedesignDialog).create();
                    final nr1 f = nr1.f(LayoutInflater.from(mmaFightNightActivity2));
                    as9.q((ImageView) f.e, Integer.valueOf(uniqueTournament3.getId()), 0, null);
                    ((TextView) f.i).setText(tba.x(uniqueTournament3));
                    f.b.setText(mmaFightNightActivity2.getString(R.string.mma_follow_organisation_popup_text, tba.x(uniqueTournament3)));
                    final int i3 = 0;
                    ((TextView) f.h).setOnClickListener(new View.OnClickListener() { // from class: xn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            AlertDialog alertDialog = create;
                            nr1 nr1Var = f;
                            UniqueTournament uniqueTournament4 = uniqueTournament3;
                            py pyVar2 = pyVar;
                            switch (i4) {
                                case 0:
                                    pyVar2.invoke(Integer.valueOf(uniqueTournament4.getId()), Boolean.FALSE, Boolean.valueOf(((MaterialCheckBox) nr1Var.f).isChecked()));
                                    alertDialog.dismiss();
                                    break;
                                default:
                                    pyVar2.invoke(Integer.valueOf(uniqueTournament4.getId()), Boolean.TRUE, Boolean.valueOf(((MaterialCheckBox) nr1Var.f).isChecked()));
                                    alertDialog.dismiss();
                                    break;
                            }
                        }
                    });
                    final int i4 = 1;
                    ((MaterialButton) f.g).setOnClickListener(new View.OnClickListener() { // from class: xn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i42 = i4;
                            AlertDialog alertDialog = create;
                            nr1 nr1Var = f;
                            UniqueTournament uniqueTournament4 = uniqueTournament3;
                            py pyVar2 = pyVar;
                            switch (i42) {
                                case 0:
                                    pyVar2.invoke(Integer.valueOf(uniqueTournament4.getId()), Boolean.FALSE, Boolean.valueOf(((MaterialCheckBox) nr1Var.f).isChecked()));
                                    alertDialog.dismiss();
                                    break;
                                default:
                                    pyVar2.invoke(Integer.valueOf(uniqueTournament4.getId()), Boolean.TRUE, Boolean.valueOf(((MaterialCheckBox) nr1Var.f).isChecked()));
                                    alertDialog.dismiss();
                                    break;
                            }
                        }
                    });
                    create.setView((ConstraintLayout) f.c);
                    create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: bo
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            Integer valueOf = Integer.valueOf(uniqueTournament3.getId());
                            Boolean bool = Boolean.FALSE;
                            py.this.invoke(valueOf, bool, bool);
                        }
                    });
                    create.show();
                }
                break;
        }
        return Unit.a;
    }
}
