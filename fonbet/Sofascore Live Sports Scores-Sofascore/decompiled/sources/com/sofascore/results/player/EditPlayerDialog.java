package com.sofascore.results.player;

import android.content.Context;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.Country;
import com.sofascore.model.Money;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.post.PlayerSuggestPostBody;
import com.sofascore.results.R;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.ah5;
import defpackage.b6a;
import defpackage.bi4;
import defpackage.ch5;
import defpackage.dla;
import defpackage.duf;
import defpackage.dv3;
import defpackage.eh5;
import defpackage.j15;
import defpackage.j63;
import defpackage.joa;
import defpackage.krk;
import defpackage.nq8;
import defpackage.o84;
import defpackage.ok0;
import defpackage.otk;
import defpackage.p24;
import defpackage.pm;
import defpackage.qh;
import defpackage.ql4;
import defpackage.rq3;
import defpackage.th5;
import defpackage.tv3;
import defpackage.v7a;
import defpackage.vha;
import defpackage.wg5;
import defpackage.xg5;
import defpackage.xw3;
import defpackage.y1;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/EditPlayerDialog;", "Lcom/sofascore/results/dialog/BaseSuggestChangesDialog;", "Lj15;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditPlayerDialog extends Hilt_EditPlayerDialog<j15> {
    public final otk D;

    public EditPlayerDialog() {
        joa a = ypa.a(ysa.c, new j63(new j63(this, 13), 14));
        this.D = new otk(duf.a.getOrCreateKotlinClass(th5.class), new p24(a, 11), new y1(27, this, a), new p24(a, 12));
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final th5 v() {
        return (th5) this.D.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "EditPlayerModal";
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final boolean w() {
        if (v().j != null) {
            j15 j15Var = (j15) this.w;
            if ((j15Var != null ? j15Var.j.getError() : null) != null) {
                return true;
            }
        }
        if (v().k != null) {
            j15 j15Var2 = (j15) this.w;
            if ((j15Var2 != null ? j15Var2.g.getError() : null) != null) {
                return true;
            }
        }
        if (v().l != null) {
            j15 j15Var3 = (j15) this.w;
            if ((j15Var3 != null ? j15Var3.i.getError() : null) != null) {
                return true;
            }
        }
        if (v().p == null) {
            return false;
        }
        j15 j15Var4 = (j15) this.w;
        return (j15Var4 != null ? j15Var4.c.getError() : null) != null;
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final krk x(LayoutInflater layoutInflater, NestedScrollView nestedScrollView) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.dialog_edit_player_content, (ViewGroup) nestedScrollView, false);
        int i = R.id.birth_date;
        TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.birth_date, inflate);
        if (textInputEditText != null) {
            i = R.id.input_birth_date;
            if (((SofaTextInputLayout) nq8.B(R.id.input_birth_date, inflate)) != null) {
                i = R.id.input_market_value;
                SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.input_market_value, inflate);
                if (sofaTextInputLayout != null) {
                    i = R.id.input_market_value_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.input_market_value_container, inflate);
                    if (constraintLayout != null) {
                        i = R.id.input_market_value_currency;
                        SofaTextInputLayout sofaTextInputLayout2 = (SofaTextInputLayout) nq8.B(R.id.input_market_value_currency, inflate);
                        if (sofaTextInputLayout2 != null) {
                            i = R.id.input_nationality;
                            SofaTextInputLayout sofaTextInputLayout3 = (SofaTextInputLayout) nq8.B(R.id.input_nationality, inflate);
                            if (sofaTextInputLayout3 != null) {
                                i = R.id.input_player_height;
                                SofaTextInputLayout sofaTextInputLayout4 = (SofaTextInputLayout) nq8.B(R.id.input_player_height, inflate);
                                if (sofaTextInputLayout4 != null) {
                                    i = R.id.input_player_name;
                                    SofaTextInputLayout sofaTextInputLayout5 = (SofaTextInputLayout) nq8.B(R.id.input_player_name, inflate);
                                    if (sofaTextInputLayout5 != null) {
                                        i = R.id.input_player_shirt_number;
                                        SofaTextInputLayout sofaTextInputLayout6 = (SofaTextInputLayout) nq8.B(R.id.input_player_shirt_number, inflate);
                                        if (sofaTextInputLayout6 != null) {
                                            i = R.id.input_player_url;
                                            SofaTextInputLayout sofaTextInputLayout7 = (SofaTextInputLayout) nq8.B(R.id.input_player_url, inflate);
                                            if (sofaTextInputLayout7 != null) {
                                                i = R.id.input_position;
                                                SofaTextInputLayout sofaTextInputLayout8 = (SofaTextInputLayout) nq8.B(R.id.input_position, inflate);
                                                if (sofaTextInputLayout8 != null) {
                                                    i = R.id.input_preferred_foot;
                                                    SofaTextInputLayout sofaTextInputLayout9 = (SofaTextInputLayout) nq8.B(R.id.input_preferred_foot, inflate);
                                                    if (sofaTextInputLayout9 != null) {
                                                        i = R.id.market_value;
                                                        TextInputEditText textInputEditText2 = (TextInputEditText) nq8.B(R.id.market_value, inflate);
                                                        if (textInputEditText2 != null) {
                                                            i = R.id.market_value_currency;
                                                            MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) nq8.B(R.id.market_value_currency, inflate);
                                                            if (materialAutoCompleteTextView != null) {
                                                                i = R.id.nationality;
                                                                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) nq8.B(R.id.nationality, inflate);
                                                                if (materialAutoCompleteTextView2 != null) {
                                                                    i = R.id.player_height;
                                                                    TextInputEditText textInputEditText3 = (TextInputEditText) nq8.B(R.id.player_height, inflate);
                                                                    if (textInputEditText3 != null) {
                                                                        i = R.id.player_name;
                                                                        TextInputEditText textInputEditText4 = (TextInputEditText) nq8.B(R.id.player_name, inflate);
                                                                        if (textInputEditText4 != null) {
                                                                            i = R.id.player_shirt_number;
                                                                            TextInputEditText textInputEditText5 = (TextInputEditText) nq8.B(R.id.player_shirt_number, inflate);
                                                                            if (textInputEditText5 != null) {
                                                                                i = R.id.player_url;
                                                                                TextInputEditText textInputEditText6 = (TextInputEditText) nq8.B(R.id.player_url, inflate);
                                                                                if (textInputEditText6 != null) {
                                                                                    i = R.id.position;
                                                                                    MaterialAutoCompleteTextView materialAutoCompleteTextView3 = (MaterialAutoCompleteTextView) nq8.B(R.id.position, inflate);
                                                                                    if (materialAutoCompleteTextView3 != null) {
                                                                                        i = R.id.preferred_foot;
                                                                                        MaterialAutoCompleteTextView materialAutoCompleteTextView4 = (MaterialAutoCompleteTextView) nq8.B(R.id.preferred_foot, inflate);
                                                                                        if (materialAutoCompleteTextView4 != null) {
                                                                                            return new j15((LinearLayout) inflate, textInputEditText, sofaTextInputLayout, constraintLayout, sofaTextInputLayout2, sofaTextInputLayout3, sofaTextInputLayout4, sofaTextInputLayout5, sofaTextInputLayout6, sofaTextInputLayout7, sofaTextInputLayout8, sofaTextInputLayout9, textInputEditText2, materialAutoCompleteTextView, materialAutoCompleteTextView2, textInputEditText3, textInputEditText4, textInputEditText5, textInputEditText6, materialAutoCompleteTextView3, materialAutoCompleteTextView4);
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
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final void y() {
        Gender gender;
        Team team;
        Team team2;
        Sport sport;
        Team team3;
        Sport sport2;
        Long dateOfBirthTimestamp;
        j15 j15Var = (j15) this.w;
        if (j15Var != null) {
            SofaTextInputLayout sofaTextInputLayout = j15Var.i;
            TextInputEditText textInputEditText = j15Var.b;
            j15Var.h.setTextNoAnimation(v().i);
            final int i = 0;
            j15Var.q.addTextChangedListener(new ch5(this, 0));
            j15Var.s.addTextChangedListener(new ch5(this, 3));
            final int i2 = 2;
            b6a.E(j15Var.j, new Function1(this) { // from class: zg5
                public final /* synthetic */ EditPlayerDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    EditPlayerDialog editPlayerDialog = this.b;
                    String str = (String) obj;
                    switch (i3) {
                        case 0:
                            str.getClass();
                            String replace = new Regex("\\D").replace(str, "");
                            if (!editPlayerDialog.v().k(12, replace)) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            long parseLong = Long.parseLong(replace);
                            if (parseLong <= 0 || parseLong > 9.99999999999E11d) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            return null;
                        case 1:
                            str.getClass();
                            if (!editPlayerDialog.v().k(4, str)) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_shirt_number);
                            }
                            int parseInt = Integer.parseInt(str);
                            if (parseInt < 0 || parseInt > 999) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_shirt_number);
                            }
                            return null;
                        default:
                            str.getClass();
                            if (Patterns.WEB_URL.matcher(str).matches()) {
                                return null;
                            }
                            return editPlayerDialog.getString(R.string.not_valid_url);
                    }
                }
            });
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            Player player = v().g;
            long longValue = (player == null || (dateOfBirthTimestamp = player.getDateOfBirthTimestamp()) == null) ? 0L : dateOfBirthTimestamp.longValue();
            if (longValue != 0) {
                calendar.setTimeInMillis(1000 * longValue);
                bi4 bi4Var = bi4.PATTERN_DMY;
                Locale d = dla.d();
                ZoneId of = ZoneId.of("GMT");
                of.getClass();
                String format = DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d)).format(Instant.ofEpochSecond(longValue));
                format.getClass();
                textInputEditText.setText(format);
            }
            textInputEditText.setOnClickListener(new qh(14, this, calendar, j15Var));
            Context requireContext = requireContext();
            requireContext.getClass();
            boolean c = Intrinsics.c(v7a.u(requireContext), "METRIC");
            final String string = getString(c ? R.string.edit_player_not_valid_height : R.string.edit_fighter_not_valid_height_in);
            string.getClass();
            String string2 = getString(c ? R.string.edit_player_height : R.string.edit_fighter_height_in);
            string2.getClass();
            final int i3 = c ? 140 : 55;
            final int i4 = c ? 240 : 95;
            SofaTextInputLayout sofaTextInputLayout2 = j15Var.g;
            sofaTextInputLayout2.setHint(string2);
            Integer num = v().k;
            if ((num != null ? num.intValue() : 0) > 0) {
                sofaTextInputLayout2.setTextNoAnimation(String.valueOf(v().k));
            }
            j15Var.p.addTextChangedListener(new ch5(this, 2));
            b6a.E(sofaTextInputLayout2, new Function1() { // from class: bh5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int parseInt;
                    String str = (String) obj;
                    str.getClass();
                    if (!EditPlayerDialog.this.v().k(4, str) || (parseInt = Integer.parseInt(str)) < i3 || parseInt > i4) {
                        return string;
                    }
                    return null;
                }
            });
            Player player2 = v().g;
            sofaTextInputLayout.setTextNoAnimation(player2 != null ? player2.getJerseyNumber() : null);
            final int i5 = 1;
            b6a.E(sofaTextInputLayout, new Function1(this) { // from class: zg5
                public final /* synthetic */ EditPlayerDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i32 = i5;
                    EditPlayerDialog editPlayerDialog = this.b;
                    String str = (String) obj;
                    switch (i32) {
                        case 0:
                            str.getClass();
                            String replace = new Regex("\\D").replace(str, "");
                            if (!editPlayerDialog.v().k(12, replace)) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            long parseLong = Long.parseLong(replace);
                            if (parseLong <= 0 || parseLong > 9.99999999999E11d) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            return null;
                        case 1:
                            str.getClass();
                            if (!editPlayerDialog.v().k(4, str)) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_shirt_number);
                            }
                            int parseInt = Integer.parseInt(str);
                            if (parseInt < 0 || parseInt > 999) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_shirt_number);
                            }
                            return null;
                        default:
                            str.getClass();
                            if (Patterns.WEB_URL.matcher(str).matches()) {
                                return null;
                            }
                            return editPlayerDialog.getString(R.string.not_valid_url);
                    }
                }
            });
            j15Var.r.addTextChangedListener(new ch5(this, 4));
            Player player3 = v().g;
            if (Intrinsics.c((player3 == null || (team3 = player3.getTeam()) == null || (sport2 = team3.getSport()) == null) ? null : sport2.getSlug(), Sports.FOOTBALL)) {
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                wg5 wg5Var = new wg5(requireContext2, 1);
                MaterialAutoCompleteTextView materialAutoCompleteTextView = j15Var.u;
                materialAutoCompleteTextView.setOnItemClickListener(new xg5(i5, j15Var, this, wg5Var));
                th5 v = v();
                Player player4 = v().g;
                v.m = player4 != null ? player4.getPreferredFoot() : null;
                materialAutoCompleteTextView.setAdapter(wg5Var);
                materialAutoCompleteTextView.setText((CharSequence) wg5Var.b(CollectionsKt.c0(wg5Var.b, v().m), false), false);
            } else {
                j15Var.l.setVisibility(8);
            }
            Player player5 = v().g;
            if (Intrinsics.c((player5 == null || (team2 = player5.getTeam()) == null || (sport = team2.getSport()) == null) ? null : sport.getSlug(), Sports.FOOTBALL)) {
                Context requireContext3 = requireContext();
                requireContext3.getClass();
                Player player6 = v().g;
                if (player6 == null || (gender = player6.getGender()) == null) {
                    Player player7 = v().g;
                    gender = (player7 == null || (team = player7.getTeam()) == null) ? null : team.getGender();
                }
                pm pmVar = new pm(requireContext3, gender);
                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = j15Var.t;
                materialAutoCompleteTextView2.setAdapter(pmVar);
                String str = v().n;
                Context context = pmVar.getContext();
                context.getClass();
                String t = vha.t(context, (Gender) pmVar.b, Sports.FOOTBALL, str, false);
                if (Intrinsics.c(t, pmVar.getContext().getString(R.string.value_unknown))) {
                    t = null;
                }
                if (t == null) {
                    t = "";
                }
                materialAutoCompleteTextView2.setText((CharSequence) t, false);
                materialAutoCompleteTextView2.setOnItemClickListener(new xg5(i, j15Var, this, pmVar));
            } else {
                j15Var.k.setVisibility(8);
            }
            ArrayList U0 = CollectionsKt.U0(dv3.a);
            List list = tv3.a;
            Context requireContext4 = requireContext();
            requireContext4.getClass();
            Collections.sort(U0, tv3.b(requireContext4));
            String string3 = requireContext().getString(R.string.value_unknown);
            string3.getClass();
            U0.add(new Country(0, "", "", (String) null, string3));
            Context requireContext5 = requireContext();
            requireContext5.getClass();
            eh5 eh5Var = new eh5(requireContext5, U0);
            MaterialAutoCompleteTextView materialAutoCompleteTextView3 = j15Var.o;
            materialAutoCompleteTextView3.setAdapter(eh5Var);
            materialAutoCompleteTextView3.setText((CharSequence) eh5Var.a(v().o), false);
            materialAutoCompleteTextView3.setOnItemClickListener(new xg5(i2, j15Var, this, eh5Var));
            Player player8 = v().g;
            if (!Intrinsics.c(player8 != null ? player8.getSportSlug() : null, Sports.FOOTBALL) || player8.getDeceased()) {
                j15Var.d.setVisibility(8);
                return;
            }
            TextInputEditText textInputEditText2 = j15Var.m;
            SofaTextInputLayout sofaTextInputLayout3 = j15Var.c;
            textInputEditText2.addTextChangedListener(new ch5(this, 1));
            textInputEditText2.addTextChangedListener(new ql4(textInputEditText2, i));
            sofaTextInputLayout3.setHintAnimationEnabled(false);
            Player player9 = v().g;
            Money proposedMarketValueRaw = player9 != null ? player9.getProposedMarketValueRaw() : null;
            if (proposedMarketValueRaw == null || proposedMarketValueRaw.getValue() <= 0) {
                v().p = "";
            } else {
                Set set = o84.a;
                Context requireContext6 = requireContext();
                requireContext6.getClass();
                Long b = o84.b(requireContext6, proposedMarketValueRaw, 0L);
                v().p = String.valueOf(b != null ? b.longValue() : proposedMarketValueRaw.getValue());
                textInputEditText2.setText(v().p);
            }
            sofaTextInputLayout3.setHintAnimationEnabled(true);
            b6a.E(sofaTextInputLayout3, new Function1(this) { // from class: zg5
                public final /* synthetic */ EditPlayerDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i32 = i;
                    EditPlayerDialog editPlayerDialog = this.b;
                    String str2 = (String) obj;
                    switch (i32) {
                        case 0:
                            str2.getClass();
                            String replace = new Regex("\\D").replace(str2, "");
                            if (!editPlayerDialog.v().k(12, replace)) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            long parseLong = Long.parseLong(replace);
                            if (parseLong <= 0 || parseLong > 9.99999999999E11d) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            return null;
                        case 1:
                            str2.getClass();
                            if (!editPlayerDialog.v().k(4, str2)) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_shirt_number);
                            }
                            int parseInt = Integer.parseInt(str2);
                            if (parseInt < 0 || parseInt > 999) {
                                return editPlayerDialog.getString(R.string.edit_player_not_valid_shirt_number);
                            }
                            return null;
                        default:
                            str2.getClass();
                            if (Patterns.WEB_URL.matcher(str2).matches()) {
                                return null;
                            }
                            return editPlayerDialog.getString(R.string.not_valid_url);
                    }
                }
            });
            Set set2 = o84.a;
            Context requireContext7 = requireContext();
            requireContext7.getClass();
            String e = o84.e(requireContext7);
            Context requireContext8 = requireContext();
            requireContext8.getClass();
            wg5 wg5Var2 = new wg5(requireContext8, 0);
            MaterialAutoCompleteTextView materialAutoCompleteTextView4 = j15Var.n;
            materialAutoCompleteTextView4.setAdapter(wg5Var2);
            materialAutoCompleteTextView4.setText((CharSequence) ((Pair) wg5Var2.b.get(wg5Var2.a(e))).a, false);
            materialAutoCompleteTextView4.setOnItemClickListener(new ah5(i, j15Var, this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0108, code lost:
    
        if (r7 != r9.longValue()) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00be  */
    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z() {
        Integer num;
        String str;
        String str2;
        String str3;
        PlayerSuggestPostBody playerSuggestPostBody;
        Long l;
        boolean z;
        Integer valueOf;
        th5 v = v();
        String str4 = v.i;
        Player player = v.g;
        rq3 rq3Var = null;
        String str5 = !Intrinsics.c(player != null ? player.getName() : null, v.i) ? str4 : null;
        String str6 = v.j;
        String str7 = (str6 == null || str6.length() == 0) ? null : str6;
        Integer num2 = v.k;
        if (num2 != null) {
            double intValue = num2.intValue();
            num = Integer.valueOf((int) ((Intrinsics.c(v7a.u(v.i()), "METRIC") ? intValue / 100.0d : intValue * 0.0254d) * 100.0d));
        } else {
            num = null;
        }
        Integer num3 = (Intrinsics.c(player != null ? player.getHeight() : null, num) || !v.k(4, String.valueOf(num))) ? null : num;
        String str8 = v.l;
        if (c.o(player != null ? player.getJerseyNumber() : null, v.l, true) || !v.k(4, v.l)) {
            str8 = null;
        }
        String str9 = v.m;
        if (str9 != null && str9.length() != 0) {
            if (!c.o(player != null ? player.getPreferredFoot() : null, v.m, true)) {
                str = str9;
                str2 = v.n;
                if (str2 != null && str2.length() != 0) {
                    if (!c.o(player == null ? player.getPosition() : null, v.n, true)) {
                        str3 = str2;
                        String str10 = v.o;
                        Country country = v.h;
                        playerSuggestPostBody = new PlayerSuggestPostBody(str5, str7, (Long) null, num3, str8, str, str3, !Intrinsics.c(country != null ? country.getIso3Alpha() : null, v.o) ? str10 : null, 4, (DefaultConstructorMarker) null);
                        l = v.q;
                        if (l != null) {
                            if (player != null) {
                                long longValue = l.longValue();
                                Long dateOfBirthTimestamp = player.getDateOfBirthTimestamp();
                                if (dateOfBirthTimestamp != null) {
                                }
                            }
                            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                            calendar.setTimeInMillis(l.longValue() * 1000);
                            calendar.set(11, 0);
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            playerSuggestPostBody.setDateOfBirthTimestamp(Long.valueOf(calendar.getTimeInMillis() / 1000));
                        }
                        if (!c.o(v.l(), v.p, true) && v.k(12, v.p)) {
                            valueOf = player == null ? Integer.valueOf(player.getId()) : null;
                            String str11 = v.p;
                            Long k0 = str11 == null ? StringsKt.k0(str11) : null;
                            if (valueOf != null && k0 != null) {
                                z = true;
                                ((yzc) v.e.b).j(Boolean.valueOf(playerSuggestPostBody.getEmpty() || z));
                                if (playerSuggestPostBody.getEmpty() || player == null) {
                                    return;
                                }
                                xw3.L(v.h(), null, null, new ok0(v, playerSuggestPostBody, player.getId(), rq3Var, 9), 3);
                                return;
                            }
                        }
                        z = false;
                        ((yzc) v.e.b).j(Boolean.valueOf(playerSuggestPostBody.getEmpty() || z));
                        if (playerSuggestPostBody.getEmpty()) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                str3 = null;
                String str102 = v.o;
                Country country2 = v.h;
                playerSuggestPostBody = new PlayerSuggestPostBody(str5, str7, (Long) null, num3, str8, str, str3, !Intrinsics.c(country2 != null ? country2.getIso3Alpha() : null, v.o) ? str102 : null, 4, (DefaultConstructorMarker) null);
                l = v.q;
                if (l != null) {
                }
                if (!c.o(v.l(), v.p, true)) {
                    if (player == null) {
                    }
                    String str112 = v.p;
                    if (str112 == null) {
                    }
                    if (valueOf != null) {
                        z = true;
                        ((yzc) v.e.b).j(Boolean.valueOf(playerSuggestPostBody.getEmpty() || z));
                        if (playerSuggestPostBody.getEmpty()) {
                        }
                    }
                }
                z = false;
                ((yzc) v.e.b).j(Boolean.valueOf(playerSuggestPostBody.getEmpty() || z));
                if (playerSuggestPostBody.getEmpty()) {
                }
            }
        }
        str = null;
        str2 = v.n;
        if (str2 != null) {
            if (!c.o(player == null ? player.getPosition() : null, v.n, true)) {
            }
        }
        str3 = null;
        String str1022 = v.o;
        Country country22 = v.h;
        playerSuggestPostBody = new PlayerSuggestPostBody(str5, str7, (Long) null, num3, str8, str, str3, !Intrinsics.c(country22 != null ? country22.getIso3Alpha() : null, v.o) ? str1022 : null, 4, (DefaultConstructorMarker) null);
        l = v.q;
        if (l != null) {
        }
        if (!c.o(v.l(), v.p, true)) {
        }
        z = false;
        ((yzc) v.e.b).j(Boolean.valueOf(playerSuggestPostBody.getEmpty() || z));
        if (playerSuggestPostBody.getEmpty()) {
        }
    }
}
