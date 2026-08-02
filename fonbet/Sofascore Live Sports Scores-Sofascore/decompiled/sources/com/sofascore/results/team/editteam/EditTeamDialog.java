package com.sofascore.results.team.editteam;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stadium;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.post.TeamSuggestPostBody;
import com.sofascore.model.newNetwork.post.VenueSuggestPostBody;
import com.sofascore.results.team.editteam.EditTeamDialog;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.b6a;
import defpackage.bi5;
import defpackage.di5;
import defpackage.duf;
import defpackage.i63;
import defpackage.j63;
import defpackage.joa;
import defpackage.krk;
import defpackage.l15;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.ok0;
import defpackage.otk;
import defpackage.p24;
import defpackage.rq3;
import defpackage.tba;
import defpackage.uh5;
import defpackage.wj9;
import defpackage.wyh;
import defpackage.xg5;
import defpackage.xw3;
import defpackage.y1;
import defpackage.yh5;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import defpackage.z1;
import defpackage.zh5;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/team/editteam/EditTeamDialog;", "Lcom/sofascore/results/dialog/BaseSuggestChangesDialog;", "Ll15;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditTeamDialog extends Hilt_EditTeamDialog<l15> {
    public final otk D;
    public final mqi E;
    public final mqi F;

    public EditTeamDialog() {
        joa a = ypa.a(ysa.c, new j63(new j63(this, 17), 18));
        this.D = new otk(duf.a.getOrCreateKotlinClass(di5.class), new p24(a, 15), new y1(29, this, a), new p24(a, 16));
        final int i = 0;
        this.E = ypa.b(new Function0(this) { // from class: wh5
            public final /* synthetic */ EditTeamDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditTeamDialog editTeamDialog = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = editTeamDialog.requireContext();
                        requireContext.getClass();
                        return new uh5(requireContext, R.layout.simple_list_item_1, new ArrayList());
                    default:
                        Context requireContext2 = editTeamDialog.requireContext();
                        requireContext2.getClass();
                        return new bi5(requireContext2, R.layout.simple_list_item_1, new ArrayList());
                }
            }
        });
        final int i2 = 1;
        this.F = ypa.b(new Function0(this) { // from class: wh5
            public final /* synthetic */ EditTeamDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditTeamDialog editTeamDialog = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = editTeamDialog.requireContext();
                        requireContext.getClass();
                        return new uh5(requireContext, R.layout.simple_list_item_1, new ArrayList());
                    default:
                        Context requireContext2 = editTeamDialog.requireContext();
                        requireContext2.getClass();
                        return new bi5(requireContext2, R.layout.simple_list_item_1, new ArrayList());
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final di5 v() {
        return (di5) this.D.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "EditTeamModal";
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final boolean w() {
        l15 l15Var = (l15) this.w;
        if ((l15Var != null ? l15Var.b.getError() : null) != null) {
            return true;
        }
        l15 l15Var2 = (l15) this.w;
        if ((l15Var2 != null ? l15Var2.e.getError() : null) != null) {
            return true;
        }
        l15 l15Var3 = (l15) this.w;
        return (l15Var3 != null ? l15Var3.f.getError() : null) != null;
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final krk x(LayoutInflater layoutInflater, NestedScrollView nestedScrollView) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(com.sofascore.results.R.layout.dialog_edit_team_content, (ViewGroup) nestedScrollView, false);
        int i = com.sofascore.results.R.id.input_team_coach;
        SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(com.sofascore.results.R.id.input_team_coach, inflate);
        if (sofaTextInputLayout != null) {
            i = com.sofascore.results.R.id.input_team_name;
            SofaTextInputLayout sofaTextInputLayout2 = (SofaTextInputLayout) nq8.B(com.sofascore.results.R.id.input_team_name, inflate);
            if (sofaTextInputLayout2 != null) {
                i = com.sofascore.results.R.id.input_team_short_name;
                SofaTextInputLayout sofaTextInputLayout3 = (SofaTextInputLayout) nq8.B(com.sofascore.results.R.id.input_team_short_name, inflate);
                if (sofaTextInputLayout3 != null) {
                    i = com.sofascore.results.R.id.input_team_url;
                    SofaTextInputLayout sofaTextInputLayout4 = (SofaTextInputLayout) nq8.B(com.sofascore.results.R.id.input_team_url, inflate);
                    if (sofaTextInputLayout4 != null) {
                        i = com.sofascore.results.R.id.input_team_venue;
                        SofaTextInputLayout sofaTextInputLayout5 = (SofaTextInputLayout) nq8.B(com.sofascore.results.R.id.input_team_venue, inflate);
                        if (sofaTextInputLayout5 != null) {
                            i = com.sofascore.results.R.id.input_update_venue_name;
                            SofaTextInputLayout sofaTextInputLayout6 = (SofaTextInputLayout) nq8.B(com.sofascore.results.R.id.input_update_venue_name, inflate);
                            if (sofaTextInputLayout6 != null) {
                                i = com.sofascore.results.R.id.input_venue_capacity;
                                SofaTextInputLayout sofaTextInputLayout7 = (SofaTextInputLayout) nq8.B(com.sofascore.results.R.id.input_venue_capacity, inflate);
                                if (sofaTextInputLayout7 != null) {
                                    i = com.sofascore.results.R.id.team_coach;
                                    MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) nq8.B(com.sofascore.results.R.id.team_coach, inflate);
                                    if (materialAutoCompleteTextView != null) {
                                        i = com.sofascore.results.R.id.team_name;
                                        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(com.sofascore.results.R.id.team_name, inflate);
                                        if (textInputEditText != null) {
                                            i = com.sofascore.results.R.id.team_short_name;
                                            TextInputEditText textInputEditText2 = (TextInputEditText) nq8.B(com.sofascore.results.R.id.team_short_name, inflate);
                                            if (textInputEditText2 != null) {
                                                i = com.sofascore.results.R.id.team_url;
                                                TextInputEditText textInputEditText3 = (TextInputEditText) nq8.B(com.sofascore.results.R.id.team_url, inflate);
                                                if (textInputEditText3 != null) {
                                                    i = com.sofascore.results.R.id.team_venue;
                                                    MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) nq8.B(com.sofascore.results.R.id.team_venue, inflate);
                                                    if (materialAutoCompleteTextView2 != null) {
                                                        i = com.sofascore.results.R.id.update_venue_name;
                                                        TextInputEditText textInputEditText4 = (TextInputEditText) nq8.B(com.sofascore.results.R.id.update_venue_name, inflate);
                                                        if (textInputEditText4 != null) {
                                                            i = com.sofascore.results.R.id.venue_capacity;
                                                            TextInputEditText textInputEditText5 = (TextInputEditText) nq8.B(com.sofascore.results.R.id.venue_capacity, inflate);
                                                            if (textInputEditText5 != null) {
                                                                l15 l15Var = new l15((LinearLayout) inflate, sofaTextInputLayout, sofaTextInputLayout2, sofaTextInputLayout3, sofaTextInputLayout4, sofaTextInputLayout5, sofaTextInputLayout6, sofaTextInputLayout7, materialAutoCompleteTextView, textInputEditText, textInputEditText2, textInputEditText3, materialAutoCompleteTextView2, textInputEditText4, textInputEditText5);
                                                                sofaTextInputLayout3.setHelperTextTextAppearance(com.sofascore.results.R.style.AssistiveDefault);
                                                                sofaTextInputLayout3.setHelperTextColor(ColorStateList.valueOf(requireContext().getColor(com.sofascore.results.R.color.n_lv_3)));
                                                                sofaTextInputLayout3.setHelperText(getString(com.sofascore.results.R.string.suggest_changes_example, "West Brom"));
                                                                sofaTextInputLayout2.setHelperTextTextAppearance(com.sofascore.results.R.style.AssistiveDefault);
                                                                sofaTextInputLayout2.setHelperTextColor(ColorStateList.valueOf(requireContext().getColor(com.sofascore.results.R.color.n_lv_3)));
                                                                sofaTextInputLayout2.setHelperText(getString(com.sofascore.results.R.string.suggest_changes_example, "West Bromwich Albion"));
                                                                return l15Var;
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
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final void y() {
        boolean e;
        Sport sport;
        yzc yzcVar = v().j;
        Object[] objArr = 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        yzcVar.e(this, new z1(6, new Function1(this) { // from class: vh5
            public final /* synthetic */ EditTeamDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = objArr2;
                EditTeamDialog editTeamDialog = this.b;
                switch (i) {
                    case 0:
                        List list = (List) obj;
                        mqi mqiVar = editTeamDialog.E;
                        ((uh5) mqiVar.getValue()).clear();
                        uh5 uh5Var = (uh5) mqiVar.getValue();
                        ArrayList k = me4.k(list);
                        for (Object obj2 : list) {
                            if (!((Manager) obj2).getDeceased()) {
                                k.add(obj2);
                            }
                        }
                        uh5Var.addAll(k);
                        break;
                    case 1:
                        mqi mqiVar2 = editTeamDialog.F;
                        ((bi5) mqiVar2.getValue()).clear();
                        ((bi5) mqiVar2.getValue()).addAll((List) obj);
                        break;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        if (!Patterns.WEB_URL.matcher(str).matches()) {
                            break;
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i = 1;
        v().l.e(this, new z1(6, new Function1(this) { // from class: vh5
            public final /* synthetic */ EditTeamDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                EditTeamDialog editTeamDialog = this.b;
                switch (i2) {
                    case 0:
                        List list = (List) obj;
                        mqi mqiVar = editTeamDialog.E;
                        ((uh5) mqiVar.getValue()).clear();
                        uh5 uh5Var = (uh5) mqiVar.getValue();
                        ArrayList k = me4.k(list);
                        for (Object obj2 : list) {
                            if (!((Manager) obj2).getDeceased()) {
                                k.add(obj2);
                            }
                        }
                        uh5Var.addAll(k);
                        break;
                    case 1:
                        mqi mqiVar2 = editTeamDialog.F;
                        ((bi5) mqiVar2.getValue()).clear();
                        ((bi5) mqiVar2.getValue()).addAll((List) obj);
                        break;
                    default:
                        String str = (String) obj;
                        str.getClass();
                        if (!Patterns.WEB_URL.matcher(str).matches()) {
                            break;
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final l15 l15Var = (l15) this.w;
        if (l15Var != null) {
            final MaterialAutoCompleteTextView materialAutoCompleteTextView = l15Var.m;
            l15Var.j.addTextChangedListener(new zh5(this, 0));
            l15Var.c.setTextNoAnimation(v().o);
            l15Var.k.addTextChangedListener(new zh5(this, 3));
            l15Var.d.setTextNoAnimation(v().p);
            final int i2 = 2;
            l15Var.l.addTextChangedListener(new zh5(this, 2));
            b6a.E(l15Var.e, new Function1(this) { // from class: vh5
                public final /* synthetic */ EditTeamDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    EditTeamDialog editTeamDialog = this.b;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            mqi mqiVar = editTeamDialog.E;
                            ((uh5) mqiVar.getValue()).clear();
                            uh5 uh5Var = (uh5) mqiVar.getValue();
                            ArrayList k = me4.k(list);
                            for (Object obj2 : list) {
                                if (!((Manager) obj2).getDeceased()) {
                                    k.add(obj2);
                                }
                            }
                            uh5Var.addAll(k);
                            break;
                        case 1:
                            mqi mqiVar2 = editTeamDialog.F;
                            ((bi5) mqiVar2.getValue()).clear();
                            ((bi5) mqiVar2.getValue()).addAll((List) obj);
                            break;
                        default:
                            String str = (String) obj;
                            str.getClass();
                            if (!Patterns.WEB_URL.matcher(str).matches()) {
                                break;
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            final MaterialAutoCompleteTextView materialAutoCompleteTextView2 = l15Var.i;
            materialAutoCompleteTextView2.setThreshold(2);
            Team team = v().m;
            if (Intrinsics.c((team == null || (sport = team.getSport()) == null) ? null : sport.getSlug(), Sports.FOOTBALL)) {
                Manager manager = v().r;
                materialAutoCompleteTextView2.setText((CharSequence) (manager != null ? tba.s(manager) : null), false);
                materialAutoCompleteTextView2.setAdapter((uh5) this.E.getValue());
                materialAutoCompleteTextView2.addTextChangedListener(new zh5(this, 1));
                materialAutoCompleteTextView2.setOnItemClickListener(new yh5(this, 0));
                materialAutoCompleteTextView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xh5
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        int i3 = i;
                        String str = null;
                        EditTeamDialog editTeamDialog = this;
                        MaterialAutoCompleteTextView materialAutoCompleteTextView3 = materialAutoCompleteTextView2;
                        l15 l15Var2 = l15Var;
                        switch (i3) {
                            case 0:
                                if (!z) {
                                    SofaTextInputLayout sofaTextInputLayout = l15Var2.f;
                                    if (StringsKt.l0(materialAutoCompleteTextView3.getText().toString()).toString().length() > 0 && editTeamDialog.v().s == null) {
                                        str = editTeamDialog.getString(com.sofascore.results.R.string.edit_team_venue_error);
                                    }
                                    sofaTextInputLayout.setError(str);
                                    break;
                                }
                                break;
                            default:
                                if (!z) {
                                    SofaTextInputLayout sofaTextInputLayout2 = l15Var2.b;
                                    if (StringsKt.l0(materialAutoCompleteTextView3.getText().toString()).toString().length() > 0 && editTeamDialog.v().r == null) {
                                        str = editTeamDialog.getString(com.sofascore.results.R.string.edit_team_coach_error);
                                    }
                                    sofaTextInputLayout2.setError(str);
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                l15Var.b.setVisibility(8);
            }
            TextInputEditText textInputEditText = l15Var.n;
            TextInputEditText textInputEditText2 = l15Var.o;
            materialAutoCompleteTextView.setThreshold(2);
            Team team2 = v().m;
            Sport sport2 = team2 != null ? team2.getSport() : null;
            if (sport2 == null) {
                e = false;
            } else {
                Set set = wyh.a;
                e = wyh.e(sport2.getSlug());
            }
            if (e) {
                l15Var.g.setVisibility(8);
                l15Var.h.setVisibility(8);
                l15Var.f.setVisibility(8);
                return;
            }
            materialAutoCompleteTextView.setText((CharSequence) v().v, false);
            materialAutoCompleteTextView.setAdapter((bi5) this.F.getValue());
            materialAutoCompleteTextView.addTextChangedListener(new i63(i, this, l15Var));
            materialAutoCompleteTextView.setOnItemClickListener(new xg5(4, this, materialAutoCompleteTextView, l15Var));
            final Object[] objArr3 = objArr == true ? 1 : 0;
            materialAutoCompleteTextView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xh5
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    int i3 = objArr3;
                    String str = null;
                    EditTeamDialog editTeamDialog = this;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView3 = materialAutoCompleteTextView;
                    l15 l15Var2 = l15Var;
                    switch (i3) {
                        case 0:
                            if (!z) {
                                SofaTextInputLayout sofaTextInputLayout = l15Var2.f;
                                if (StringsKt.l0(materialAutoCompleteTextView3.getText().toString()).toString().length() > 0 && editTeamDialog.v().s == null) {
                                    str = editTeamDialog.getString(com.sofascore.results.R.string.edit_team_venue_error);
                                }
                                sofaTextInputLayout.setError(str);
                                break;
                            }
                            break;
                        default:
                            if (!z) {
                                SofaTextInputLayout sofaTextInputLayout2 = l15Var2.b;
                                if (StringsKt.l0(materialAutoCompleteTextView3.getText().toString()).toString().length() > 0 && editTeamDialog.v().r == null) {
                                    str = editTeamDialog.getString(com.sofascore.results.R.string.edit_team_coach_error);
                                }
                                sofaTextInputLayout2.setError(str);
                                break;
                            }
                            break;
                    }
                }
            });
            textInputEditText.addTextChangedListener(new zh5(this, 4));
            textInputEditText.setText(v().v);
            textInputEditText2.addTextChangedListener(new zh5(this, 5));
            textInputEditText2.setEnabled(v().s != null);
            Integer num = v().w;
            textInputEditText2.setText(num != null ? String.valueOf(num.intValue()) : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z() {
        Integer num;
        Venue venue;
        Integer num2;
        TeamSuggestPostBody teamSuggestPostBody;
        String str;
        Integer num3;
        Venue venue2;
        Stadium stadium;
        Venue venue3;
        Stadium stadium2;
        di5 v = v();
        wj9 wj9Var = v.e;
        Team team = v.m;
        String str2 = v.o;
        String str3 = !Intrinsics.c(v.n, str2) ? str2 : null;
        String str4 = !Intrinsics.c(team != null ? team.getShortName() : null, v.p) ? v.p : null;
        String str5 = v.q;
        String str6 = (str5 == null || str5.length() == 0) ? null : str5;
        Manager manager = v.r;
        if (manager != null) {
            if (Intrinsics.c(team != null ? team.getManager() : null, v.r)) {
                manager = null;
            }
            if (manager != null) {
                num = Integer.valueOf(manager.getId());
                venue = v.s;
                if (venue != null) {
                    Integer valueOf = Integer.valueOf(venue.getId());
                    String name = (team == null || (venue3 = team.getVenue()) == null || (stadium2 = venue3.getStadium()) == null) ? null : stadium2.getName();
                    Venue venue4 = v.s;
                    if (!Intrinsics.c(name, (venue4 == null || (stadium = venue4.getStadium()) == null) ? null : stadium.getName())) {
                        num2 = valueOf;
                        teamSuggestPostBody = new TeamSuggestPostBody(str3, str6, (String) null, str4, num, num2, 4, (DefaultConstructorMarker) null);
                        str = v.v;
                        if (str != null || str.equalsIgnoreCase(v.t)) {
                            str = null;
                        }
                        num3 = v.w;
                        if (Intrinsics.c(num3, v.u)) {
                            num3 = null;
                        }
                        VenueSuggestPostBody venueSuggestPostBody = new VenueSuggestPostBody(str, num3);
                        if (!teamSuggestPostBody.getEmpty() && venueSuggestPostBody.getEmpty()) {
                            ((yzc) wj9Var.b).j(Boolean.FALSE);
                            return;
                        }
                        if (team != null) {
                            Integer valueOf2 = Integer.valueOf(team.getId());
                            if (teamSuggestPostBody.getEmpty()) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                xw3.L(v.h(), null, null, new ok0(v, teamSuggestPostBody, valueOf2.intValue(), (rq3) null, 10), 3);
                            }
                        }
                        venue2 = v.s;
                        if (venue2 != null) {
                            Integer valueOf3 = Integer.valueOf(venue2.getId());
                            if (venueSuggestPostBody.getEmpty()) {
                                valueOf3 = null;
                            }
                            if (valueOf3 != null) {
                                xw3.L(v.h(), null, null, new ok0(v, venueSuggestPostBody, valueOf3.intValue(), (rq3) null, 11), 3);
                            }
                        }
                        ((yzc) wj9Var.b).j(Boolean.TRUE);
                    }
                }
                num2 = null;
                teamSuggestPostBody = new TeamSuggestPostBody(str3, str6, (String) null, str4, num, num2, 4, (DefaultConstructorMarker) null);
                str = v.v;
                if (str != null) {
                }
                str = null;
                num3 = v.w;
                if (Intrinsics.c(num3, v.u)) {
                }
                VenueSuggestPostBody venueSuggestPostBody2 = new VenueSuggestPostBody(str, num3);
                if (!teamSuggestPostBody.getEmpty()) {
                }
                if (team != null) {
                }
                venue2 = v.s;
                if (venue2 != null) {
                }
                ((yzc) wj9Var.b).j(Boolean.TRUE);
            }
        }
        num = null;
        venue = v.s;
        if (venue != null) {
        }
        num2 = null;
        teamSuggestPostBody = new TeamSuggestPostBody(str3, str6, (String) null, str4, num, num2, 4, (DefaultConstructorMarker) null);
        str = v.v;
        if (str != null) {
        }
        str = null;
        num3 = v.w;
        if (Intrinsics.c(num3, v.u)) {
        }
        VenueSuggestPostBody venueSuggestPostBody22 = new VenueSuggestPostBody(str, num3);
        if (!teamSuggestPostBody.getEmpty()) {
        }
        if (team != null) {
        }
        venue2 = v.s;
        if (venue2 != null) {
        }
        ((yzc) wj9Var.b).j(Boolean.TRUE);
    }
}
