package com.sofascore.results.team.playerstats;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFilterModal;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.bte;
import defpackage.duf;
import defpackage.e92;
import defpackage.fwi;
import defpackage.hyi;
import defpackage.in;
import defpackage.joa;
import defpackage.jyi;
import defpackage.kp5;
import defpackage.lre;
import defpackage.nq8;
import defpackage.o1i;
import defpackage.oei;
import defpackage.otk;
import defpackage.ryi;
import defpackage.tyi;
import defpackage.yhk;
import defpackage.yid;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yt;
import defpackage.z3f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/playerstats/TeamPlayerStatsFilterModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "jyi", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamPlayerStatsFilterModal extends BaseModalBottomSheetDialog {
    public final joa A;
    public final joa B;
    public e92 w;
    public z3f x;
    public final otk y;
    public final kp5 z;

    public TeamPlayerStatsFilterModal() {
        hyi hyiVar = new hyi(this, 0);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(hyiVar, 22));
        this.y = new otk(duf.a.getOrCreateKotlinClass(tyi.class), new fwi(a, 5), new bte(this, a, 23), new fwi(a, 6));
        this.z = yt.e;
        this.A = ypa.a(ysaVar, new hyi(this, 1));
        this.B = ypa.a(ysaVar, new hyi(this, 2));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View B(LayoutInflater layoutInflater) {
        z3f d = z3f.d(layoutInflater, (FrameLayout) v().k);
        this.x = d;
        final int i = 0;
        ((Button) d.d).setOnClickListener(new View.OnClickListener(this) { // from class: gyi
            public final /* synthetic */ TeamPlayerStatsFilterModal b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                TeamPlayerStatsFilterModal teamPlayerStatsFilterModal = this.b;
                switch (i2) {
                    case 0:
                        e92 e92Var = teamPlayerStatsFilterModal.w;
                        if (e92Var == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        ((MaterialAutoCompleteTextView) e92Var.b).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.A.getValue()).getItem(0));
                        ((MaterialAutoCompleteTextView) e92Var.d).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.B.getValue()).getItem(0));
                        ((RadioGroup) e92Var.f).check(((RadioButton) e92Var.c).getId());
                        z3f z3fVar = teamPlayerStatsFilterModal.x;
                        if (z3fVar != null) {
                            ((Button) z3fVar.d).setEnabled(false);
                            return;
                        } else {
                            Intrinsics.i("footerBinding");
                            throw null;
                        }
                    default:
                        tyi tyiVar = (tyi) teamPlayerStatsFilterModal.y.getValue();
                        kp5 kp5Var = teamPlayerStatsFilterModal.z;
                        jyi jyiVar = (jyi) teamPlayerStatsFilterModal.A.getValue();
                        e92 e92Var2 = teamPlayerStatsFilterModal.w;
                        if (e92Var2 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        yt ytVar = (yt) kp5Var.get(jyiVar.getPosition(((MaterialAutoCompleteTextView) e92Var2.b).getText().toString()));
                        kp5 kp5Var2 = lre.e;
                        jyi jyiVar2 = (jyi) teamPlayerStatsFilterModal.B.getValue();
                        e92 e92Var3 = teamPlayerStatsFilterModal.w;
                        if (e92Var3 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        lre lreVar = (lre) kp5Var2.get(jyiVar2.getPosition(((MaterialAutoCompleteTextView) e92Var3.d).getText().toString()));
                        e92 e92Var4 = teamPlayerStatsFilterModal.w;
                        if (e92Var4 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        tyiVar.m = new ryi(ytVar, lreVar, ((RadioButton) e92Var4.c).isChecked() ? oei.d : oei.c);
                        ArrayList arrayList = tyiVar.k;
                        if (arrayList != null) {
                            tyiVar.g(arrayList);
                        }
                        teamPlayerStatsFilterModal.j();
                        return;
                }
            }
        });
        final int i2 = 1;
        ((Button) d.c).setOnClickListener(new View.OnClickListener(this) { // from class: gyi
            public final /* synthetic */ TeamPlayerStatsFilterModal b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                TeamPlayerStatsFilterModal teamPlayerStatsFilterModal = this.b;
                switch (i22) {
                    case 0:
                        e92 e92Var = teamPlayerStatsFilterModal.w;
                        if (e92Var == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        ((MaterialAutoCompleteTextView) e92Var.b).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.A.getValue()).getItem(0));
                        ((MaterialAutoCompleteTextView) e92Var.d).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.B.getValue()).getItem(0));
                        ((RadioGroup) e92Var.f).check(((RadioButton) e92Var.c).getId());
                        z3f z3fVar = teamPlayerStatsFilterModal.x;
                        if (z3fVar != null) {
                            ((Button) z3fVar.d).setEnabled(false);
                            return;
                        } else {
                            Intrinsics.i("footerBinding");
                            throw null;
                        }
                    default:
                        tyi tyiVar = (tyi) teamPlayerStatsFilterModal.y.getValue();
                        kp5 kp5Var = teamPlayerStatsFilterModal.z;
                        jyi jyiVar = (jyi) teamPlayerStatsFilterModal.A.getValue();
                        e92 e92Var2 = teamPlayerStatsFilterModal.w;
                        if (e92Var2 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        yt ytVar = (yt) kp5Var.get(jyiVar.getPosition(((MaterialAutoCompleteTextView) e92Var2.b).getText().toString()));
                        kp5 kp5Var2 = lre.e;
                        jyi jyiVar2 = (jyi) teamPlayerStatsFilterModal.B.getValue();
                        e92 e92Var3 = teamPlayerStatsFilterModal.w;
                        if (e92Var3 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        lre lreVar = (lre) kp5Var2.get(jyiVar2.getPosition(((MaterialAutoCompleteTextView) e92Var3.d).getText().toString()));
                        e92 e92Var4 = teamPlayerStatsFilterModal.w;
                        if (e92Var4 == null) {
                            Intrinsics.i("binding");
                            throw null;
                        }
                        tyiVar.m = new ryi(ytVar, lreVar, ((RadioButton) e92Var4.c).isChecked() ? oei.d : oei.c);
                        ArrayList arrayList = tyiVar.k;
                        if (arrayList != null) {
                            tyiVar.g(arrayList);
                        }
                        teamPlayerStatsFilterModal.j();
                        return;
                }
            }
        });
        ConstraintLayout constraintLayout = (ConstraintLayout) d.b;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.modal_team_player_stats_filter, (ViewGroup) v().l, false);
        int i2 = R.id.appearance_input;
        if (((SofaTextInputLayout) nq8.B(R.id.appearance_input, inflate)) != null) {
            i2 = R.id.appearance_picker;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) nq8.B(R.id.appearance_picker, inflate);
            if (materialAutoCompleteTextView != null) {
                i2 = R.id.position_input;
                if (((SofaTextInputLayout) nq8.B(R.id.position_input, inflate)) != null) {
                    i2 = R.id.position_picker;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) nq8.B(R.id.position_picker, inflate);
                    if (materialAutoCompleteTextView2 != null) {
                        i2 = R.id.radio_group;
                        RadioGroup radioGroup = (RadioGroup) nq8.B(R.id.radio_group, inflate);
                        if (radioGroup != null) {
                            i2 = R.id.radio_per_game;
                            RadioButton radioButton = (RadioButton) nq8.B(R.id.radio_per_game, inflate);
                            if (radioButton != null) {
                                i2 = R.id.radio_totals;
                                RadioButton radioButton2 = (RadioButton) nq8.B(R.id.radio_totals, inflate);
                                if (radioButton2 != null) {
                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                    final e92 e92Var = new e92(linearLayout, materialAutoCompleteTextView, materialAutoCompleteTextView2, radioGroup, radioButton, radioButton2);
                                    this.w = e92Var;
                                    materialAutoCompleteTextView2.setAdapter((jyi) this.A.getValue());
                                    materialAutoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: iyi
                                        @Override // android.widget.AdapterView.OnItemClickListener
                                        public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                                            int i4 = i;
                                            TeamPlayerStatsFilterModal teamPlayerStatsFilterModal = this;
                                            e92 e92Var2 = e92Var;
                                            switch (i4) {
                                                case 0:
                                                    ((MaterialAutoCompleteTextView) e92Var2.b).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.A.getValue()).getItem(i3));
                                                    teamPlayerStatsFilterModal.F();
                                                    break;
                                                default:
                                                    ((MaterialAutoCompleteTextView) e92Var2.d).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.B.getValue()).getItem(i3));
                                                    teamPlayerStatsFilterModal.F();
                                                    break;
                                            }
                                        }
                                    });
                                    materialAutoCompleteTextView.setAdapter((jyi) this.B.getValue());
                                    final int i3 = 1;
                                    materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: iyi
                                        @Override // android.widget.AdapterView.OnItemClickListener
                                        public final void onItemClick(AdapterView adapterView, View view, int i32, long j) {
                                            int i4 = i3;
                                            TeamPlayerStatsFilterModal teamPlayerStatsFilterModal = this;
                                            e92 e92Var2 = e92Var;
                                            switch (i4) {
                                                case 0:
                                                    ((MaterialAutoCompleteTextView) e92Var2.b).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.A.getValue()).getItem(i32));
                                                    teamPlayerStatsFilterModal.F();
                                                    break;
                                                default:
                                                    ((MaterialAutoCompleteTextView) e92Var2.d).setText((CharSequence) ((jyi) teamPlayerStatsFilterModal.B.getValue()).getItem(i32));
                                                    teamPlayerStatsFilterModal.F();
                                                    break;
                                            }
                                        }
                                    });
                                    ryi ryiVar = ((tyi) this.y.getValue()).m;
                                    yt ytVar = ryiVar.a;
                                    lre lreVar = ryiVar.b;
                                    materialAutoCompleteTextView2.setText(ytVar.a == R.string.at_least_percent_appearances ? requireContext().getString(ytVar.a, yid.r(50)) : requireContext().getString(ytVar.a));
                                    int i4 = lreVar.a;
                                    int i5 = lreVar.a;
                                    materialAutoCompleteTextView.setText(i4 == R.string.at_least_percent_appearances ? requireContext().getString(i5, yid.r(50)) : requireContext().getString(i5));
                                    radioGroup.check(ryiVar.c == oei.d ? radioButton2.getId() : radioButton.getId());
                                    radioGroup.setOnCheckedChangeListener(new in(this, 2));
                                    F();
                                    linearLayout.getClass();
                                    return linearLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void F() {
        boolean z;
        z3f z3fVar = this.x;
        if (z3fVar == null) {
            Intrinsics.i("footerBinding");
            throw null;
        }
        Button button = (Button) z3fVar.d;
        jyi jyiVar = (jyi) this.A.getValue();
        e92 e92Var = this.w;
        if (e92Var == null) {
            Intrinsics.i("binding");
            throw null;
        }
        if (jyiVar.getPosition(((MaterialAutoCompleteTextView) e92Var.b).getText().toString()) == 0) {
            jyi jyiVar2 = (jyi) this.B.getValue();
            e92 e92Var2 = this.w;
            if (e92Var2 == null) {
                Intrinsics.i("binding");
                throw null;
            }
            if (jyiVar2.getPosition(((MaterialAutoCompleteTextView) e92Var2.d).getText().toString()) == 0) {
                e92 e92Var3 = this.w;
                if (e92Var3 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                int checkedRadioButtonId = ((RadioGroup) e92Var3.f).getCheckedRadioButtonId();
                e92 e92Var4 = this.w;
                if (e92Var4 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                if (checkedRadioButtonId == ((RadioButton) e92Var4.c).getId()) {
                    z = false;
                    button.setEnabled(z);
                }
            }
        }
        z = true;
        button.setEnabled(z);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior.C((View) parent).M(3);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FilterModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.filter_by);
        string.getClass();
        return string;
    }
}
