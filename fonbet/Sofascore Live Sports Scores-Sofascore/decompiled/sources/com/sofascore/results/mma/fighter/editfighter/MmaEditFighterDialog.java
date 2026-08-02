package com.sofascore.results.mma.fighter.editfighter;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.post.FighterSuggestPostBody;
import com.sofascore.results.R;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.aaf;
import defpackage.b6a;
import defpackage.bi4;
import defpackage.dla;
import defpackage.duf;
import defpackage.dv3;
import defpackage.eh5;
import defpackage.fsf;
import defpackage.hv7;
import defpackage.i15;
import defpackage.imi;
import defpackage.ix7;
import defpackage.j08;
import defpackage.joa;
import defpackage.krk;
import defpackage.llc;
import defpackage.nlc;
import defpackage.nq8;
import defpackage.otk;
import defpackage.ppa;
import defpackage.qh;
import defpackage.rfi;
import defpackage.rq3;
import defpackage.tsk;
import defpackage.tv3;
import defpackage.usk;
import defpackage.v7a;
import defpackage.wj9;
import defpackage.wya;
import defpackage.wzb;
import defpackage.xg5;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/fighter/editfighter/MmaEditFighterDialog;", "Lcom/sofascore/results/dialog/BaseSuggestChangesDialog;", "Li15;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaEditFighterDialog extends Hilt_MmaEditFighterDialog<i15> {
    public final otk D;

    public MmaEditFighterDialog() {
        joa a = ypa.a(ysa.c, new hv7(new hv7(this, 28), 29));
        this.D = new otk(duf.a.getOrCreateKotlinClass(nlc.class), new ix7(a, 29), new wya(8, this, a), new llc(a, 0));
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final nlc v() {
        return (nlc) this.D.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "EditTeamModal";
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final boolean w() {
        LinearLayout linearLayout;
        i15 i15Var = (i15) this.w;
        if (i15Var == null || (linearLayout = i15Var.a) == null) {
            return false;
        }
        Iterator it = new tsk(linearLayout).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return false;
            }
            View view = (View) uskVar.next();
            if ((view instanceof SofaTextInputLayout) && ((SofaTextInputLayout) view).getError() != null) {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x020d, code lost:
    
        if (r5 == null) goto L70;
     */
    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final krk x(LayoutInflater layoutInflater, NestedScrollView nestedScrollView) {
        j08 j08Var;
        String str;
        Integer num;
        double d;
        final imi imiVar;
        Context requireContext;
        int i;
        Integer num2;
        final imi imiVar2;
        PlayerTeamInfo playerTeamInfo;
        Double reach;
        PlayerTeamInfo playerTeamInfo2;
        Double height;
        PlayerTeamInfo playerTeamInfo3;
        PlayerTeamInfo playerTeamInfo4;
        Country country;
        PlayerTeamInfo playerTeamInfo5;
        int i2 = 95;
        int i3 = 55;
        int i4 = 240;
        int i5 = 140;
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.dialog_edit_mma_fighter_content, (ViewGroup) nestedScrollView, false);
        int i6 = R.id.date_of_birth;
        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.date_of_birth, inflate);
        if (textInputEditText != null) {
            i6 = R.id.height;
            TextInputEditText textInputEditText2 = (TextInputEditText) nq8.B(R.id.height, inflate);
            if (textInputEditText2 != null) {
                i6 = R.id.image_url;
                TextInputEditText textInputEditText3 = (TextInputEditText) nq8.B(R.id.image_url, inflate);
                if (textInputEditText3 != null) {
                    i6 = R.id.input_date_of_birth;
                    if (((SofaTextInputLayout) nq8.B(R.id.input_date_of_birth, inflate)) != null) {
                        i6 = R.id.input_height;
                        SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.input_height, inflate);
                        if (sofaTextInputLayout != null) {
                            i6 = R.id.input_image_url;
                            SofaTextInputLayout sofaTextInputLayout2 = (SofaTextInputLayout) nq8.B(R.id.input_image_url, inflate);
                            if (sofaTextInputLayout2 != null) {
                                i6 = R.id.input_name;
                                if (((SofaTextInputLayout) nq8.B(R.id.input_name, inflate)) != null) {
                                    i6 = R.id.input_nationality;
                                    SofaTextInputLayout sofaTextInputLayout3 = (SofaTextInputLayout) nq8.B(R.id.input_nationality, inflate);
                                    if (sofaTextInputLayout3 != null) {
                                        i6 = R.id.input_nickname;
                                        if (((SofaTextInputLayout) nq8.B(R.id.input_nickname, inflate)) != null) {
                                            i6 = R.id.input_reach;
                                            SofaTextInputLayout sofaTextInputLayout4 = (SofaTextInputLayout) nq8.B(R.id.input_reach, inflate);
                                            if (sofaTextInputLayout4 != null) {
                                                i6 = R.id.input_style;
                                                SofaTextInputLayout sofaTextInputLayout5 = (SofaTextInputLayout) nq8.B(R.id.input_style, inflate);
                                                if (sofaTextInputLayout5 != null) {
                                                    i6 = R.id.name;
                                                    TextInputEditText textInputEditText4 = (TextInputEditText) nq8.B(R.id.name, inflate);
                                                    if (textInputEditText4 != null) {
                                                        i6 = R.id.nationality;
                                                        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) nq8.B(R.id.nationality, inflate);
                                                        if (materialAutoCompleteTextView != null) {
                                                            i6 = R.id.nickname;
                                                            TextInputEditText textInputEditText5 = (TextInputEditText) nq8.B(R.id.nickname, inflate);
                                                            if (textInputEditText5 != null) {
                                                                i6 = R.id.reach;
                                                                TextInputEditText textInputEditText6 = (TextInputEditText) nq8.B(R.id.reach, inflate);
                                                                if (textInputEditText6 != null) {
                                                                    i6 = R.id.style;
                                                                    MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) nq8.B(R.id.style, inflate);
                                                                    if (materialAutoCompleteTextView2 != null) {
                                                                        i15 i15Var = new i15((LinearLayout) inflate, textInputEditText, textInputEditText2, textInputEditText3, sofaTextInputLayout, sofaTextInputLayout2, sofaTextInputLayout3, sofaTextInputLayout4, sofaTextInputLayout5, textInputEditText4, materialAutoCompleteTextView, textInputEditText5, textInputEditText6, materialAutoCompleteTextView2);
                                                                        Team team = v().g;
                                                                        textInputEditText4.setText(team != null ? team.getName() : null);
                                                                        Team team2 = v().g;
                                                                        textInputEditText5.setText((team2 == null || (playerTeamInfo5 = team2.getPlayerTeamInfo()) == null) ? null : playerTeamInfo5.getNickname());
                                                                        String string = requireContext().getString(R.string.not_valid_url);
                                                                        string.getClass();
                                                                        final imi imiVar3 = new imi(string, new rfi(1));
                                                                        final int i7 = 0;
                                                                        b6a.E(sofaTextInputLayout2, new Function1() { // from class: klc
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj) {
                                                                                int i8 = i7;
                                                                                imi imiVar4 = imiVar3;
                                                                                String str2 = (String) obj;
                                                                                switch (i8) {
                                                                                    case 0:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                return imiVar4.a;
                                                                            }
                                                                        });
                                                                        ArrayList U0 = CollectionsKt.U0(dv3.a);
                                                                        List list = tv3.a;
                                                                        Context requireContext2 = requireContext();
                                                                        requireContext2.getClass();
                                                                        Collections.sort(U0, tv3.b(requireContext2));
                                                                        String string2 = requireContext().getString(R.string.value_unknown);
                                                                        string2.getClass();
                                                                        U0.add(new com.sofascore.model.Country(0, "", "", (String) null, string2));
                                                                        Team team3 = v().g;
                                                                        com.sofascore.model.Country a = dv3.a((team3 == null || (country = team3.getCountry()) == null) ? null : country.getAlpha2());
                                                                        String iso3Alpha = a != null ? a.getIso3Alpha() : null;
                                                                        Context requireContext3 = requireContext();
                                                                        requireContext3.getClass();
                                                                        eh5 eh5Var = new eh5(requireContext3, U0);
                                                                        materialAutoCompleteTextView.setText(eh5Var.a(iso3Alpha));
                                                                        materialAutoCompleteTextView.setAdapter(eh5Var);
                                                                        materialAutoCompleteTextView.setOnItemClickListener(new xg5(6, i15Var, this, eh5Var));
                                                                        Team team4 = v().g;
                                                                        String fightingStyle = (team4 == null || (playerTeamInfo4 = team4.getPlayerTeamInfo()) == null) ? null : playerTeamInfo4.getFightingStyle();
                                                                        Context requireContext4 = requireContext();
                                                                        requireContext4.getClass();
                                                                        eh5 eh5Var2 = new eh5(requireContext4, 2);
                                                                        j08[] j08VarArr = (j08[]) eh5Var2.b;
                                                                        int length = j08VarArr.length;
                                                                        int i8 = 0;
                                                                        while (true) {
                                                                            if (i8 >= length) {
                                                                                j08Var = null;
                                                                                break;
                                                                            }
                                                                            j08Var = j08VarArr[i8];
                                                                            int i9 = i8;
                                                                            if (j08Var.a.equals(fightingStyle)) {
                                                                                break;
                                                                            }
                                                                            i8 = i9 + 1;
                                                                        }
                                                                        if (j08Var != null) {
                                                                            str = eh5Var2.getContext().getString(j08Var.b);
                                                                        }
                                                                        str = "";
                                                                        materialAutoCompleteTextView2.setText(str);
                                                                        materialAutoCompleteTextView2.setAdapter(eh5Var2);
                                                                        materialAutoCompleteTextView2.setOnItemClickListener(new xg5(5, i15Var, this, eh5Var2));
                                                                        Team team5 = v().g;
                                                                        Long birthDateTimestamp = (team5 == null || (playerTeamInfo3 = team5.getPlayerTeamInfo()) == null) ? null : playerTeamInfo3.getBirthDateTimestamp();
                                                                        fsf fsfVar = new fsf();
                                                                        fsfVar.a = LocalDate.now().minusYears(10L);
                                                                        if (birthDateTimestamp != null) {
                                                                            long longValue = birthDateTimestamp.longValue();
                                                                            fsfVar.a = Instant.ofEpochMilli(1000 * longValue).atZone(ZoneId.of("GMT")).toLocalDate();
                                                                            bi4 bi4Var = bi4.PATTERN_DMY;
                                                                            Locale d2 = dla.d();
                                                                            ZoneId of = ZoneId.of("GMT");
                                                                            of.getClass();
                                                                            String format = DateTimeFormatter.ofPattern(bi4Var.d(), d2).withZone(of).withDecimalStyle(DecimalStyle.of(d2)).format(Instant.ofEpochSecond(longValue));
                                                                            format.getClass();
                                                                            textInputEditText.setText(format);
                                                                        }
                                                                        textInputEditText.setOnClickListener(new qh(22, this, fsfVar, i15Var));
                                                                        Context requireContext5 = requireContext();
                                                                        requireContext5.getClass();
                                                                        String u = v7a.u(requireContext5);
                                                                        Team team6 = v().g;
                                                                        if (team6 == null || (playerTeamInfo2 = team6.getPlayerTeamInfo()) == null || (height = playerTeamInfo2.getHeight()) == null) {
                                                                            num = null;
                                                                        } else {
                                                                            double doubleValue = height.doubleValue();
                                                                            Context requireContext6 = requireContext();
                                                                            requireContext6.getClass();
                                                                            num = Integer.valueOf(Intrinsics.c(v7a.u(requireContext6), "METRIC") ? wzb.a(doubleValue * 100.0d) : wzb.a(doubleValue / 0.0254d));
                                                                        }
                                                                        int i10 = 25;
                                                                        if (Intrinsics.c(u, "METRIC")) {
                                                                            String string3 = getString(R.string.edit_player_not_valid_height);
                                                                            string3.getClass();
                                                                            d = 0.0254d;
                                                                            imiVar = new imi(string3, new aaf(i10, i5, i4));
                                                                        } else {
                                                                            d = 0.0254d;
                                                                            String string4 = getString(R.string.edit_fighter_not_valid_height_in);
                                                                            string4.getClass();
                                                                            imiVar = new imi(string4, new aaf(i10, i3, i2));
                                                                        }
                                                                        if (Intrinsics.c(u, "METRIC")) {
                                                                            requireContext = requireContext();
                                                                            i = R.string.edit_fighter_height_cm;
                                                                        } else {
                                                                            requireContext = requireContext();
                                                                            i = R.string.edit_fighter_height_in;
                                                                        }
                                                                        sofaTextInputLayout.setHint(requireContext.getString(i));
                                                                        i15Var.c.setText(String.valueOf(num));
                                                                        final int i11 = 2;
                                                                        b6a.E(sofaTextInputLayout, new Function1() { // from class: klc
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj) {
                                                                                int i82 = i11;
                                                                                imi imiVar4 = imiVar;
                                                                                String str2 = (String) obj;
                                                                                switch (i82) {
                                                                                    case 0:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                return imiVar4.a;
                                                                            }
                                                                        });
                                                                        Context requireContext7 = requireContext();
                                                                        requireContext7.getClass();
                                                                        String u2 = v7a.u(requireContext7);
                                                                        Team team7 = v().g;
                                                                        if (team7 == null || (playerTeamInfo = team7.getPlayerTeamInfo()) == null || (reach = playerTeamInfo.getReach()) == null) {
                                                                            num2 = null;
                                                                        } else {
                                                                            double doubleValue2 = reach.doubleValue();
                                                                            Context requireContext8 = requireContext();
                                                                            requireContext8.getClass();
                                                                            num2 = Integer.valueOf(Intrinsics.c(v7a.u(requireContext8), "METRIC") ? wzb.a(doubleValue2 * 100.0d) : wzb.a(doubleValue2 / d));
                                                                        }
                                                                        if (Intrinsics.c(u2, "METRIC")) {
                                                                            String string5 = getString(R.string.edit_fighter_not_valid_reach_cm);
                                                                            string5.getClass();
                                                                            imiVar2 = new imi(string5, new aaf(i10, i5, i4));
                                                                        } else {
                                                                            String string6 = getString(R.string.edit_fighter_not_valid_reach_in);
                                                                            string6.getClass();
                                                                            imiVar2 = new imi(string6, new aaf(i10, i3, i2));
                                                                        }
                                                                        sofaTextInputLayout4.setHint(requireContext().getString(Intrinsics.c(u2, "METRIC") ? R.string.edit_fighter_reach_cm : R.string.edit_fighter_reach_in));
                                                                        i15Var.j.setText(String.valueOf(num2));
                                                                        final int i12 = 1;
                                                                        b6a.E(sofaTextInputLayout4, new Function1() { // from class: klc
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj) {
                                                                                int i82 = i12;
                                                                                imi imiVar4 = imiVar2;
                                                                                String str2 = (String) obj;
                                                                                switch (i82) {
                                                                                    case 0:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case 1:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        str2.getClass();
                                                                                        if (!((Boolean) imiVar4.b.invoke(str2)).booleanValue()) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                return imiVar4.a;
                                                                            }
                                                                        });
                                                                        return i15Var;
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
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final void z() {
        Integer num;
        Integer num2;
        i15 i15Var = (i15) this.w;
        rq3 rq3Var = null;
        if (i15Var != null) {
            TextInputEditText textInputEditText = i15Var.d;
            v().i.setName(String.valueOf(i15Var.g.getText()));
            v().i.setNickname(String.valueOf(i15Var.i.getText()));
            FighterSuggestPostBody fighterSuggestPostBody = v().i;
            String valueOf = String.valueOf(textInputEditText.getText());
            Editable text = textInputEditText.getText();
            if (text == null || text.length() <= 0) {
                valueOf = null;
            }
            fighterSuggestPostBody.setImageUrl(valueOf);
            FighterSuggestPostBody fighterSuggestPostBody2 = v().i;
            Double f = b.f(String.valueOf(i15Var.c.getText()));
            if (f != null) {
                double doubleValue = f.doubleValue();
                Context requireContext = requireContext();
                requireContext.getClass();
                if (!Intrinsics.c(v7a.u(requireContext), "METRIC")) {
                    doubleValue = Math.rint(doubleValue * 2.54d);
                }
                num = Integer.valueOf((int) doubleValue);
            } else {
                num = null;
            }
            fighterSuggestPostBody2.setHeight(num);
            FighterSuggestPostBody fighterSuggestPostBody3 = v().i;
            Double f2 = b.f(String.valueOf(i15Var.j.getText()));
            if (f2 != null) {
                double doubleValue2 = f2.doubleValue();
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                if (!Intrinsics.c(v7a.u(requireContext2), "METRIC")) {
                    doubleValue2 = Math.rint(doubleValue2 * 2.54d);
                }
                num2 = Integer.valueOf((int) doubleValue2);
            } else {
                num2 = null;
            }
            fighterSuggestPostBody3.setReach(num2);
        }
        nlc v = v();
        wj9 wj9Var = v.e;
        if (Intrinsics.c(v.h, v.i)) {
            ((yzc) wj9Var.b).j(Boolean.FALSE);
        } else {
            xw3.L(v.h(), null, null, new ppa(v, rq3Var, 13), 3);
            ((yzc) wj9Var.b).j(Boolean.TRUE);
        }
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final void y() {
    }
}
