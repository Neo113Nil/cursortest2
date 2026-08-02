package com.sofascore.results.player;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.h;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.post.TransferSuggestPostBody;
import com.sofascore.results.R;
import com.sofascore.results.player.EditPlayerTransferDialog;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.ah5;
import defpackage.b6a;
import defpackage.c25;
import defpackage.duf;
import defpackage.fh5;
import defpackage.ia0;
import defpackage.j63;
import defpackage.joa;
import defpackage.jr2;
import defpackage.k15;
import defpackage.krk;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.oh5;
import defpackage.ok0;
import defpackage.ok3;
import defpackage.otk;
import defpackage.p24;
import defpackage.ph5;
import defpackage.ql4;
import defpackage.qvj;
import defpackage.rq3;
import defpackage.sh5;
import defpackage.v8a;
import defpackage.wg5;
import defpackage.xg5;
import defpackage.xw3;
import defpackage.y1;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import defpackage.z1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/EditPlayerTransferDialog;", "Lcom/sofascore/results/dialog/BaseSuggestChangesDialog;", "Lk15;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditPlayerTransferDialog extends Hilt_EditPlayerTransferDialog<k15> {
    public final otk D;
    public final mqi E;
    public final mqi F;
    public final mqi G;

    public EditPlayerTransferDialog() {
        joa a = ypa.a(ysa.c, new j63(new j63(this, 15), 16));
        this.D = new otk(duf.a.getOrCreateKotlinClass(sh5.class), new p24(a, 13), new y1(28, this, a), new p24(a, 14));
        final int i = 0;
        this.E = ypa.b(new Function0(this) { // from class: nh5
            public final /* synthetic */ EditPlayerTransferDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String t;
                int i2 = i;
                EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = editPlayerTransferDialog.requireContext();
                        requireContext.getClass();
                        return new fh5(requireContext);
                    case 1:
                        Context requireContext2 = editPlayerTransferDialog.requireContext();
                        requireContext2.getClass();
                        return new fh5(requireContext2);
                    default:
                        Player player = editPlayerTransferDialog.v().m;
                        if (player != null && (t = tba.t(player)) != null) {
                            return t;
                        }
                        String string = editPlayerTransferDialog.requireContext().getString(R.string.suggest_changes);
                        string.getClass();
                        return string;
                }
            }
        });
        final int i2 = 1;
        this.F = ypa.b(new Function0(this) { // from class: nh5
            public final /* synthetic */ EditPlayerTransferDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String t;
                int i22 = i2;
                EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = editPlayerTransferDialog.requireContext();
                        requireContext.getClass();
                        return new fh5(requireContext);
                    case 1:
                        Context requireContext2 = editPlayerTransferDialog.requireContext();
                        requireContext2.getClass();
                        return new fh5(requireContext2);
                    default:
                        Player player = editPlayerTransferDialog.v().m;
                        if (player != null && (t = tba.t(player)) != null) {
                            return t;
                        }
                        String string = editPlayerTransferDialog.requireContext().getString(R.string.suggest_changes);
                        string.getClass();
                        return string;
                }
            }
        });
        final int i3 = 2;
        this.G = ypa.b(new Function0(this) { // from class: nh5
            public final /* synthetic */ EditPlayerTransferDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String t;
                int i22 = i3;
                EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = editPlayerTransferDialog.requireContext();
                        requireContext.getClass();
                        return new fh5(requireContext);
                    case 1:
                        Context requireContext2 = editPlayerTransferDialog.requireContext();
                        requireContext2.getClass();
                        return new fh5(requireContext2);
                    default:
                        Player player = editPlayerTransferDialog.v().m;
                        if (player != null && (t = tba.t(player)) != null) {
                            return t;
                        }
                        String string = editPlayerTransferDialog.requireContext().getString(R.string.suggest_changes);
                        string.getClass();
                        return string;
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final sh5 v() {
        return (sh5) this.D.getValue();
    }

    public final void C() {
        Boolean bool;
        Boolean bool2;
        boolean c;
        Boolean bool3;
        boolean c2;
        k15 k15Var = (k15) this.w;
        Boolean bool4 = null;
        boolean z = false;
        if (k15Var != null) {
            bool = Boolean.valueOf(k15Var.g.getVisibility() == 0);
        } else {
            bool = null;
        }
        Boolean bool5 = Boolean.TRUE;
        if (Intrinsics.c(bool, bool5)) {
            c = v().p != null;
        } else {
            k15 k15Var2 = (k15) this.w;
            if (k15Var2 != null) {
                bool2 = Boolean.valueOf(k15Var2.d.getVisibility() == 0);
            } else {
                bool2 = null;
            }
            c = Intrinsics.c(bool2, Boolean.FALSE);
        }
        k15 k15Var3 = (k15) this.w;
        if (k15Var3 != null) {
            bool3 = Boolean.valueOf(k15Var3.d.getVisibility() == 0);
        } else {
            bool3 = null;
        }
        if (Intrinsics.c(bool3, bool5)) {
            c2 = v().o != null;
        } else {
            k15 k15Var4 = (k15) this.w;
            if (k15Var4 != null) {
                bool4 = Boolean.valueOf(k15Var4.g.getVisibility() == 0);
            }
            c2 = Intrinsics.c(bool4, Boolean.FALSE);
        }
        c25 c25Var = (c25) this.s;
        if (c25Var != null) {
            TextView textView = c25Var.c.d;
            ia0 ia0Var = ia0.q;
            if (ok3.p().e().getIsLoggedIn() && (c || c2)) {
                z = true;
            }
            textView.setEnabled(z);
        }
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog, com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "EditPlayerTransferModal";
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final String u() {
        return (String) this.G.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final boolean w() {
        k15 k15Var = (k15) this.w;
        return (k15Var != null ? k15Var.o.getError() : null) != null;
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final krk x(LayoutInflater layoutInflater, NestedScrollView nestedScrollView) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.dialog_edit_player_transfer_content, (ViewGroup) nestedScrollView, false);
        int i = R.id.input_transfer_currency;
        SofaTextInputLayout sofaTextInputLayout = (SofaTextInputLayout) nq8.B(R.id.input_transfer_currency, inflate);
        if (sofaTextInputLayout != null) {
            i = R.id.input_transfer_date;
            SofaTextInputLayout sofaTextInputLayout2 = (SofaTextInputLayout) nq8.B(R.id.input_transfer_date, inflate);
            if (sofaTextInputLayout2 != null) {
                i = R.id.input_transfer_from;
                SofaTextInputLayout sofaTextInputLayout3 = (SofaTextInputLayout) nq8.B(R.id.input_transfer_from, inflate);
                if (sofaTextInputLayout3 != null) {
                    i = R.id.input_transfer_link;
                    SofaTextInputLayout sofaTextInputLayout4 = (SofaTextInputLayout) nq8.B(R.id.input_transfer_link, inflate);
                    if (sofaTextInputLayout4 != null) {
                        i = R.id.input_transfer_price;
                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.input_transfer_price, inflate);
                        if (constraintLayout != null) {
                            i = R.id.input_transfer_to;
                            SofaTextInputLayout sofaTextInputLayout5 = (SofaTextInputLayout) nq8.B(R.id.input_transfer_to, inflate);
                            if (sofaTextInputLayout5 != null) {
                                i = R.id.input_transfer_type;
                                SofaTextInputLayout sofaTextInputLayout6 = (SofaTextInputLayout) nq8.B(R.id.input_transfer_type, inflate);
                                if (sofaTextInputLayout6 != null) {
                                    i = R.id.input_transfer_until;
                                    SofaTextInputLayout sofaTextInputLayout7 = (SofaTextInputLayout) nq8.B(R.id.input_transfer_until, inflate);
                                    if (sofaTextInputLayout7 != null) {
                                        i = R.id.transfer_currency;
                                        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) nq8.B(R.id.transfer_currency, inflate);
                                        if (materialAutoCompleteTextView != null) {
                                            i = R.id.transfer_date;
                                            TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.transfer_date, inflate);
                                            if (textInputEditText != null) {
                                                i = R.id.transfer_from;
                                                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = (MaterialAutoCompleteTextView) nq8.B(R.id.transfer_from, inflate);
                                                if (materialAutoCompleteTextView2 != null) {
                                                    i = R.id.transfer_link;
                                                    TextInputEditText textInputEditText2 = (TextInputEditText) nq8.B(R.id.transfer_link, inflate);
                                                    if (textInputEditText2 != null) {
                                                        i = R.id.transfer_price;
                                                        TextInputEditText textInputEditText3 = (TextInputEditText) nq8.B(R.id.transfer_price, inflate);
                                                        if (textInputEditText3 != null) {
                                                            i = R.id.transfer_price_input_layout;
                                                            SofaTextInputLayout sofaTextInputLayout8 = (SofaTextInputLayout) nq8.B(R.id.transfer_price_input_layout, inflate);
                                                            if (sofaTextInputLayout8 != null) {
                                                                i = R.id.transfer_to;
                                                                MaterialAutoCompleteTextView materialAutoCompleteTextView3 = (MaterialAutoCompleteTextView) nq8.B(R.id.transfer_to, inflate);
                                                                if (materialAutoCompleteTextView3 != null) {
                                                                    i = R.id.transfer_type;
                                                                    MaterialAutoCompleteTextView materialAutoCompleteTextView4 = (MaterialAutoCompleteTextView) nq8.B(R.id.transfer_type, inflate);
                                                                    if (materialAutoCompleteTextView4 != null) {
                                                                        i = R.id.transfer_until;
                                                                        TextInputEditText textInputEditText4 = (TextInputEditText) nq8.B(R.id.transfer_until, inflate);
                                                                        if (textInputEditText4 != null) {
                                                                            return new k15((LinearLayout) inflate, sofaTextInputLayout, sofaTextInputLayout2, sofaTextInputLayout3, sofaTextInputLayout4, constraintLayout, sofaTextInputLayout5, sofaTextInputLayout6, sofaTextInputLayout7, materialAutoCompleteTextView, textInputEditText, materialAutoCompleteTextView2, textInputEditText2, textInputEditText3, sofaTextInputLayout8, materialAutoCompleteTextView3, materialAutoCompleteTextView4, textInputEditText4);
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
        Team team;
        final k15 k15Var = (k15) this.w;
        if (k15Var != null) {
            TextInputEditText textInputEditText = k15Var.n;
            TextInputEditText textInputEditText2 = k15Var.m;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = k15Var.q;
            Context requireContext = requireContext();
            requireContext.getClass();
            wg5 wg5Var = new wg5(requireContext, 2);
            materialAutoCompleteTextView.setAdapter(wg5Var);
            qvj qvjVar = qvj.a;
            Context context = wg5Var.getContext();
            context.getClass();
            materialAutoCompleteTextView.setText(v8a.C(3, context));
            materialAutoCompleteTextView.setOnItemClickListener(new xg5(3, k15Var, wg5Var, this));
            final MaterialAutoCompleteTextView materialAutoCompleteTextView2 = k15Var.l;
            materialAutoCompleteTextView2.setThreshold(2);
            materialAutoCompleteTextView2.setAdapter((fh5) this.E.getValue());
            final int i = 1;
            k15Var.d.setEndIconOnClickListener(new View.OnClickListener(this) { // from class: kh5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    k15 k15Var2 = k15Var;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    switch (i2) {
                        case 0:
                            if (editPlayerTransferDialog.v().p == null) {
                                k15Var2.p.requestFocus();
                                break;
                            } else {
                                k15Var2.p.setText("");
                                break;
                            }
                        default:
                            if (editPlayerTransferDialog.v().o == null) {
                                k15Var2.l.requestFocus();
                                break;
                            } else {
                                k15Var2.l.setText("");
                                break;
                            }
                    }
                }
            });
            final int i2 = 0;
            materialAutoCompleteTextView2.addTextChangedListener(new oh5(this, k15Var, i2));
            materialAutoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: ih5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                    int i4 = i2;
                    k15 k15Var2 = k15Var;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView3 = materialAutoCompleteTextView2;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    switch (i4) {
                        case 0:
                            sh5 v = editPlayerTransferDialog.v();
                            Object item = adapterView.getAdapter().getItem(i3);
                            v.o = item instanceof Team ? (Team) item : null;
                            editPlayerTransferDialog.C();
                            Context context2 = materialAutoCompleteTextView3.getContext();
                            context2.getClass();
                            InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(materialAutoCompleteTextView3.getWindowToken(), 0);
                            }
                            k15Var2.d.setError(null);
                            SofaTextInputLayout sofaTextInputLayout = k15Var2.d;
                            sofaTextInputLayout.setEndIconDrawable(R.drawable.ic_remove);
                            sofaTextInputLayout.setError(null);
                            break;
                        default:
                            sh5 v2 = editPlayerTransferDialog.v();
                            Object item2 = adapterView.getAdapter().getItem(i3);
                            v2.p = item2 instanceof Team ? (Team) item2 : null;
                            editPlayerTransferDialog.C();
                            Context context3 = materialAutoCompleteTextView3.getContext();
                            context3.getClass();
                            InputMethodManager inputMethodManager2 = (InputMethodManager) context3.getSystemService(InputMethodManager.class);
                            if (inputMethodManager2 != null) {
                                inputMethodManager2.hideSoftInputFromWindow(materialAutoCompleteTextView3.getWindowToken(), 0);
                            }
                            SofaTextInputLayout sofaTextInputLayout2 = k15Var2.g;
                            sofaTextInputLayout2.setEndIconDrawable(R.drawable.ic_remove);
                            sofaTextInputLayout2.setError(null);
                            break;
                    }
                }
            });
            final MaterialAutoCompleteTextView materialAutoCompleteTextView3 = k15Var.p;
            materialAutoCompleteTextView3.setThreshold(2);
            materialAutoCompleteTextView3.setAdapter((fh5) this.F.getValue());
            k15Var.g.setEndIconOnClickListener(new View.OnClickListener(this) { // from class: kh5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    k15 k15Var2 = k15Var;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    switch (i22) {
                        case 0:
                            if (editPlayerTransferDialog.v().p == null) {
                                k15Var2.p.requestFocus();
                                break;
                            } else {
                                k15Var2.p.setText("");
                                break;
                            }
                        default:
                            if (editPlayerTransferDialog.v().o == null) {
                                k15Var2.l.requestFocus();
                                break;
                            } else {
                                k15Var2.l.setText("");
                                break;
                            }
                    }
                }
            });
            materialAutoCompleteTextView3.addTextChangedListener(new oh5(this, k15Var, i));
            materialAutoCompleteTextView3.setOnItemClickListener(new AdapterView.OnItemClickListener(this) { // from class: ih5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                    int i4 = i;
                    k15 k15Var2 = k15Var;
                    MaterialAutoCompleteTextView materialAutoCompleteTextView32 = materialAutoCompleteTextView3;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    switch (i4) {
                        case 0:
                            sh5 v = editPlayerTransferDialog.v();
                            Object item = adapterView.getAdapter().getItem(i3);
                            v.o = item instanceof Team ? (Team) item : null;
                            editPlayerTransferDialog.C();
                            Context context2 = materialAutoCompleteTextView32.getContext();
                            context2.getClass();
                            InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                            if (inputMethodManager != null) {
                                inputMethodManager.hideSoftInputFromWindow(materialAutoCompleteTextView32.getWindowToken(), 0);
                            }
                            k15Var2.d.setError(null);
                            SofaTextInputLayout sofaTextInputLayout = k15Var2.d;
                            sofaTextInputLayout.setEndIconDrawable(R.drawable.ic_remove);
                            sofaTextInputLayout.setError(null);
                            break;
                        default:
                            sh5 v2 = editPlayerTransferDialog.v();
                            Object item2 = adapterView.getAdapter().getItem(i3);
                            v2.p = item2 instanceof Team ? (Team) item2 : null;
                            editPlayerTransferDialog.C();
                            Context context3 = materialAutoCompleteTextView32.getContext();
                            context3.getClass();
                            InputMethodManager inputMethodManager2 = (InputMethodManager) context3.getSystemService(InputMethodManager.class);
                            if (inputMethodManager2 != null) {
                                inputMethodManager2.hideSoftInputFromWindow(materialAutoCompleteTextView32.getWindowToken(), 0);
                            }
                            SofaTextInputLayout sofaTextInputLayout2 = k15Var2.g;
                            sofaTextInputLayout2.setEndIconDrawable(R.drawable.ic_remove);
                            sofaTextInputLayout2.setError(null);
                            break;
                    }
                }
            });
            textInputEditText2.setOnFocusChangeListener(new jr2(this, 4));
            textInputEditText2.addTextChangedListener(new ph5(this, 0));
            b6a.E(k15Var.e, new Function1(this) { // from class: jh5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    String str = (String) obj;
                    switch (i3) {
                        case 0:
                            str.getClass();
                            if (Patterns.WEB_URL.matcher(str).matches()) {
                                return null;
                            }
                            return editPlayerTransferDialog.getString(R.string.not_valid_url);
                        default:
                            str.getClass();
                            String replace = new Regex("\\D").replace(str, "");
                            editPlayerTransferDialog.v();
                            if (replace == null || StringsKt.R(replace) || !TextUtils.isDigitsOnly(replace) || replace.length() > 12) {
                                return editPlayerTransferDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            long parseLong = Long.parseLong(replace);
                            if (parseLong <= 0 || parseLong > 9.99999999999E11d) {
                                return editPlayerTransferDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            return null;
                    }
                }
            });
            final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            k15Var.k.setOnClickListener(new View.OnClickListener() { // from class: lh5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    int i4 = 0;
                    k15 k15Var2 = k15Var;
                    Calendar calendar2 = calendar;
                    EditPlayerTransferDialog editPlayerTransferDialog = this;
                    int i5 = 1;
                    switch (i3) {
                        case 0:
                            Calendar.getInstance().add(1, 1);
                            b bVar = new b();
                            bVar.d = ug5.p(editPlayerTransferDialog.getContext());
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.getClass();
                            calendar3.set(11, 0);
                            calendar3.set(12, 0);
                            calendar3.set(13, 0);
                            calendar3.set(14, 0);
                            bVar.a = calendar3.getTimeInMillis();
                            bVar.e = new DateValidatorPointForward(lhk.d().getTimeInMillis());
                            h hVar = new h(new SingleDateSelector());
                            hVar.c = R.string.edit_player_transfer_until;
                            hVar.d = Long.valueOf(calendar2.getTimeInMillis());
                            hVar.b = bVar.a();
                            MaterialDatePicker a = hVar.a();
                            a.q.add(new yg5(2, new mh5(i5, k15Var2, editPlayerTransferDialog, calendar2)));
                            a.p(editPlayerTransferDialog.getChildFragmentManager(), "TransferUntilDatePicker");
                            break;
                        default:
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.add(1, 1);
                            b bVar2 = new b();
                            bVar2.d = ug5.p(editPlayerTransferDialog.getContext());
                            bVar2.a = -2208988800000L;
                            bVar2.b = calendar4.getTimeInMillis();
                            h hVar2 = new h(new SingleDateSelector());
                            int ordinal = editPlayerTransferDialog.v().n.ordinal();
                            hVar2.c = ordinal != 4 ? ordinal != 6 ? R.string.edit_player_transfer_date : R.string.edit_player_release_date : R.string.edit_player_retirement_date;
                            hVar2.d = Long.valueOf(calendar2.getTimeInMillis());
                            hVar2.b = bVar2.a();
                            MaterialDatePicker a2 = hVar2.a();
                            a2.q.add(new yg5(1, new mh5(i4, k15Var2, editPlayerTransferDialog, calendar2)));
                            a2.p(editPlayerTransferDialog.getChildFragmentManager(), "TransferDatePicker");
                            break;
                    }
                }
            });
            final Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            k15Var.r.setOnClickListener(new View.OnClickListener() { // from class: lh5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    int i4 = 0;
                    k15 k15Var2 = k15Var;
                    Calendar calendar22 = calendar2;
                    EditPlayerTransferDialog editPlayerTransferDialog = this;
                    int i5 = 1;
                    switch (i3) {
                        case 0:
                            Calendar.getInstance().add(1, 1);
                            b bVar = new b();
                            bVar.d = ug5.p(editPlayerTransferDialog.getContext());
                            Calendar calendar3 = Calendar.getInstance();
                            calendar3.getClass();
                            calendar3.set(11, 0);
                            calendar3.set(12, 0);
                            calendar3.set(13, 0);
                            calendar3.set(14, 0);
                            bVar.a = calendar3.getTimeInMillis();
                            bVar.e = new DateValidatorPointForward(lhk.d().getTimeInMillis());
                            h hVar = new h(new SingleDateSelector());
                            hVar.c = R.string.edit_player_transfer_until;
                            hVar.d = Long.valueOf(calendar22.getTimeInMillis());
                            hVar.b = bVar.a();
                            MaterialDatePicker a = hVar.a();
                            a.q.add(new yg5(2, new mh5(i5, k15Var2, editPlayerTransferDialog, calendar22)));
                            a.p(editPlayerTransferDialog.getChildFragmentManager(), "TransferUntilDatePicker");
                            break;
                        default:
                            Calendar calendar4 = Calendar.getInstance();
                            calendar4.add(1, 1);
                            b bVar2 = new b();
                            bVar2.d = ug5.p(editPlayerTransferDialog.getContext());
                            bVar2.a = -2208988800000L;
                            bVar2.b = calendar4.getTimeInMillis();
                            h hVar2 = new h(new SingleDateSelector());
                            int ordinal = editPlayerTransferDialog.v().n.ordinal();
                            hVar2.c = ordinal != 4 ? ordinal != 6 ? R.string.edit_player_transfer_date : R.string.edit_player_release_date : R.string.edit_player_retirement_date;
                            hVar2.d = Long.valueOf(calendar22.getTimeInMillis());
                            hVar2.b = bVar2.a();
                            MaterialDatePicker a2 = hVar2.a();
                            a2.q.add(new yg5(1, new mh5(i4, k15Var2, editPlayerTransferDialog, calendar22)));
                            a2.p(editPlayerTransferDialog.getChildFragmentManager(), "TransferDatePicker");
                            break;
                    }
                }
            });
            textInputEditText.addTextChangedListener(new ph5(this, 1));
            textInputEditText.addTextChangedListener(new ql4(textInputEditText, i2));
            b6a.E(k15Var.o, new Function1(this) { // from class: jh5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    String str = (String) obj;
                    switch (i3) {
                        case 0:
                            str.getClass();
                            if (Patterns.WEB_URL.matcher(str).matches()) {
                                return null;
                            }
                            return editPlayerTransferDialog.getString(R.string.not_valid_url);
                        default:
                            str.getClass();
                            String replace = new Regex("\\D").replace(str, "");
                            editPlayerTransferDialog.v();
                            if (replace == null || StringsKt.R(replace) || !TextUtils.isDigitsOnly(replace) || replace.length() > 12) {
                                return editPlayerTransferDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            long parseLong = Long.parseLong(replace);
                            if (parseLong <= 0 || parseLong > 9.99999999999E11d) {
                                return editPlayerTransferDialog.getString(R.string.edit_player_not_valid_market_value);
                            }
                            return null;
                    }
                }
            });
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            wg5 wg5Var2 = new wg5(requireContext2, 0);
            MaterialAutoCompleteTextView materialAutoCompleteTextView4 = k15Var.j;
            materialAutoCompleteTextView4.setAdapter(wg5Var2);
            materialAutoCompleteTextView4.setText((CharSequence) ((Pair) wg5Var2.b.get(wg5Var2.a(v().u))).a, false);
            materialAutoCompleteTextView4.setOnItemClickListener(new ah5(i, k15Var, this));
            Player player = v().m;
            final Gender gender = (player == null || (team = player.getTeam()) == null) ? null : team.getGender();
            v().j.e(getViewLifecycleOwner(), new z1(5, new Function1(this) { // from class: hh5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i2;
                    Gender gender2 = gender;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    List list = (List) obj;
                    switch (i3) {
                        case 0:
                            mqi mqiVar = editPlayerTransferDialog.E;
                            ((fh5) mqiVar.getValue()).clear();
                            fh5 fh5Var = (fh5) mqiVar.getValue();
                            ArrayList k = me4.k(list);
                            for (Object obj2 : list) {
                                Team team2 = (Team) obj2;
                                if (!team2.getNational() && (team2.getGender() == null || team2.getGender() == gender2 || gender2 == null)) {
                                    k.add(obj2);
                                }
                            }
                            fh5Var.addAll(k);
                            break;
                        default:
                            mqi mqiVar2 = editPlayerTransferDialog.F;
                            ((fh5) mqiVar2.getValue()).clear();
                            fh5 fh5Var2 = (fh5) mqiVar2.getValue();
                            ArrayList k2 = me4.k(list);
                            for (Object obj3 : list) {
                                Team team3 = (Team) obj3;
                                if (!team3.getNational() && (team3.getGender() == null || team3.getGender() == gender2 || gender2 == null)) {
                                    k2.add(obj3);
                                }
                            }
                            fh5Var2.addAll(k2);
                            break;
                    }
                    return Unit.a;
                }
            }));
            v().l.e(getViewLifecycleOwner(), new z1(5, new Function1(this) { // from class: hh5
                public final /* synthetic */ EditPlayerTransferDialog b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i3 = i;
                    Gender gender2 = gender;
                    EditPlayerTransferDialog editPlayerTransferDialog = this.b;
                    List list = (List) obj;
                    switch (i3) {
                        case 0:
                            mqi mqiVar = editPlayerTransferDialog.E;
                            ((fh5) mqiVar.getValue()).clear();
                            fh5 fh5Var = (fh5) mqiVar.getValue();
                            ArrayList k = me4.k(list);
                            for (Object obj2 : list) {
                                Team team2 = (Team) obj2;
                                if (!team2.getNational() && (team2.getGender() == null || team2.getGender() == gender2 || gender2 == null)) {
                                    k.add(obj2);
                                }
                            }
                            fh5Var.addAll(k);
                            break;
                        default:
                            mqi mqiVar2 = editPlayerTransferDialog.F;
                            ((fh5) mqiVar2.getValue()).clear();
                            fh5 fh5Var2 = (fh5) mqiVar2.getValue();
                            ArrayList k2 = me4.k(list);
                            for (Object obj3 : list) {
                                Team team3 = (Team) obj3;
                                if (!team3.getNational() && (team3.getGender() == null || team3.getGender() == gender2 || gender2 == null)) {
                                    k2.add(obj3);
                                }
                            }
                            fh5Var2.addAll(k2);
                            break;
                    }
                    return Unit.a;
                }
            }));
        }
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final void z() {
        sh5 v = v();
        int ordinal = v.n.ordinal();
        Team team = v.o;
        rq3 rq3Var = null;
        Integer valueOf = team != null ? Integer.valueOf(team.getId()) : null;
        Team team2 = v.p;
        Integer valueOf2 = team2 != null ? Integer.valueOf(team2.getId()) : null;
        String str = v.q;
        TransferSuggestPostBody transferSuggestPostBody = new TransferSuggestPostBody(valueOf, valueOf2, (Long) null, (String) null, (Long) null, (Long) null, Integer.valueOf(ordinal), (str == null || str.length() == 0) ? null : str, 60, (DefaultConstructorMarker) null);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        long j = v.r;
        if (j > 0) {
            calendar.setTimeInMillis(j * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            transferSuggestPostBody.setTimestamp(Long.valueOf(calendar.getTimeInMillis() / 1000));
        }
        long j2 = v.s;
        if (j2 > 0) {
            calendar.setTimeInMillis(j2 * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            transferSuggestPostBody.setContractUntil(Long.valueOf(calendar.getTimeInMillis() / 1000));
        }
        String str2 = v.t;
        if (str2 != null && !StringsKt.R(str2) && TextUtils.isDigitsOnly(str2) && str2.length() <= 12) {
            String str3 = v.t;
            transferSuggestPostBody.setTransferFee(str3 != null ? Long.valueOf(Long.parseLong(str3)) : null);
            transferSuggestPostBody.setTransferCurrency(v.u);
        }
        ((yzc) v.e.b).j(Boolean.TRUE);
        Player player = v.m;
        if (player != null) {
            xw3.L(v.h(), null, null, new ok0(v, transferSuggestPostBody, player.getId(), rq3Var, 8), 3);
        }
    }
}
