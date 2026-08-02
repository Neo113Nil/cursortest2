package com.sofascore.results.dialog;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.sofascore.model.Country;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.dialog.TransferFilterModal;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.ah5;
import defpackage.dk2;
import defpackage.dmi;
import defpackage.duf;
import defpackage.dxe;
import defpackage.eh5;
import defpackage.fvj;
import defpackage.g5k;
import defpackage.hvj;
import defpackage.i63;
import defpackage.js2;
import defpackage.kr9;
import defpackage.nq8;
import defpackage.otk;
import defpackage.qdj;
import defpackage.ql4;
import defpackage.tk2;
import defpackage.tv3;
import defpackage.uvj;
import defpackage.vt2;
import defpackage.ygi;
import defpackage.yhk;
import defpackage.z1g;
import defpackage.z3f;
import defpackage.zk2;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/TransferFilterModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransferFilterModal extends BaseModalBottomSheetDialog {
    public UniqueTournament A;
    public kr9 B;
    public final otk w = new otk(duf.a.getOrCreateKotlinClass(uvj.class), new hvj(this, 0), new hvj(this, 2), new hvj(this, 1));
    public js2 x;
    public z3f y;
    public Country z;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View B(LayoutInflater layoutInflater) {
        z3f d = z3f.d(layoutInflater, (FrameLayout) v().k);
        this.y = d;
        ((Button) d.d).setOnClickListener(new fvj(this, 0));
        z3f z3fVar = this.y;
        if (z3fVar == null) {
            Intrinsics.i("modalFooter");
            throw null;
        }
        ((Button) z3fVar.c).setOnClickListener(new fvj(this, 1));
        z3f z3fVar2 = this.y;
        if (z3fVar2 == null) {
            Intrinsics.i("modalFooter");
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) z3fVar2.b;
        constraintLayout.getClass();
        return constraintLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        String str;
        Typeface typeface;
        Typeface typeface2;
        PlayerTransferFilterData.PlayerPositionSelection position;
        PlayerTransferFilterData.FollowerCountSelection minFollowers;
        PlayerTransferFilterData.IncomingOutgoingSelection incomingOutgoing;
        Country country;
        String name;
        Object[] objArr = 0;
        View inflate = layoutInflater.inflate(R.layout.transfer_filter_modal_layout, (ViewGroup) v().l, false);
        int i = R.id.age_range_slider;
        RangeSlider rangeSlider = (RangeSlider) nq8.B(R.id.age_range_slider, inflate);
        if (rangeSlider != null) {
            i = R.id.age_range_subtitle;
            View B = nq8.B(R.id.age_range_subtitle, inflate);
            if (B != null) {
                dk2 b = dk2.b(B);
                i = R.id.age_range_text;
                TextView textView = (TextView) nq8.B(R.id.age_range_text, inflate);
                if (textView != null) {
                    i = R.id.followers_header;
                    TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.followers_header, inflate);
                    if (typeHeaderView != null) {
                        i = R.id.followers_subtitle;
                        View B2 = nq8.B(R.id.followers_subtitle, inflate);
                        if (B2 != null) {
                            dk2 b2 = dk2.b(B2);
                            i = R.id.incoming_outgoing_header;
                            TypeHeaderView typeHeaderView2 = (TypeHeaderView) nq8.B(R.id.incoming_outgoing_header, inflate);
                            if (typeHeaderView2 != null) {
                                i = R.id.nationality_filter;
                                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) nq8.B(R.id.nationality_filter, inflate);
                                if (autoCompleteTextView != null) {
                                    i = R.id.nationality_input;
                                    TextInputLayout textInputLayout = (TextInputLayout) nq8.B(R.id.nationality_input, inflate);
                                    if (textInputLayout != null) {
                                        i = R.id.position_header;
                                        TypeHeaderView typeHeaderView3 = (TypeHeaderView) nq8.B(R.id.position_header, inflate);
                                        if (typeHeaderView3 != null) {
                                            i = R.id.position_subtitle;
                                            View B3 = nq8.B(R.id.position_subtitle, inflate);
                                            if (B3 != null) {
                                                dk2 b3 = dk2.b(B3);
                                                i = R.id.tournament_filter;
                                                AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) nq8.B(R.id.tournament_filter, inflate);
                                                if (autoCompleteTextView2 != null) {
                                                    i = R.id.tournament_input;
                                                    TextInputLayout textInputLayout2 = (TextInputLayout) nq8.B(R.id.tournament_input, inflate);
                                                    if (textInputLayout2 != null) {
                                                        i = R.id.transfer_filter_modal_container;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.transfer_filter_modal_container, inflate);
                                                        if (constraintLayout != null) {
                                                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                            this.x = new js2(nestedScrollView, rangeSlider, b, textView, typeHeaderView, b2, typeHeaderView2, autoCompleteTextView, textInputLayout, typeHeaderView3, b3, autoCompleteTextView2, textInputLayout2, constraintLayout);
                                                            nestedScrollView.getClass();
                                                            r(nestedScrollView);
                                                            js2 js2Var = this.x;
                                                            if (js2Var == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var.f).setThreshold(0);
                                                            Context requireContext = requireContext();
                                                            requireContext.getClass();
                                                            final int i2 = 1;
                                                            eh5 eh5Var = new eh5(requireContext, 1);
                                                            eh5Var.setNotifyOnChange(true);
                                                            PlayerTransferFilterData playerTransferFilterData = F().g;
                                                            String str2 = "";
                                                            if (playerTransferFilterData == null || (country = playerTransferFilterData.getCountry()) == null || (name = country.getName()) == null) {
                                                                str = "";
                                                            } else {
                                                                Context requireContext2 = requireContext();
                                                                requireContext2.getClass();
                                                                str = tv3.c(requireContext2, name);
                                                            }
                                                            int i3 = 6;
                                                            new zk2(eh5Var, i3).filter(str);
                                                            PlayerTransferFilterData playerTransferFilterData2 = F().g;
                                                            this.z = playerTransferFilterData2 != null ? playerTransferFilterData2.getCountry() : null;
                                                            js2 js2Var2 = this.x;
                                                            if (js2Var2 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var2.f).setText(str);
                                                            js2 js2Var3 = this.x;
                                                            if (js2Var3 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var3.f).setAdapter(eh5Var);
                                                            js2 js2Var4 = this.x;
                                                            if (js2Var4 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            TextInputLayout textInputLayout3 = (TextInputLayout) js2Var4.g;
                                                            Context context = getContext();
                                                            if (context != null) {
                                                                try {
                                                                    typeface = z1g.a(R.font.sofascore_sans_regular, context);
                                                                } catch (Exception unused) {
                                                                    typeface = Typeface.DEFAULT;
                                                                }
                                                            } else {
                                                                typeface = null;
                                                            }
                                                            textInputLayout3.setTypeface(typeface);
                                                            js2 js2Var5 = this.x;
                                                            if (js2Var5 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((TextInputLayout) js2Var5.g).setEndIconVisible(false);
                                                            js2 js2Var6 = this.x;
                                                            if (js2Var6 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            AutoCompleteTextView autoCompleteTextView3 = (AutoCompleteTextView) js2Var6.f;
                                                            final Object[] objArr2 = objArr == true ? 1 : 0;
                                                            autoCompleteTextView3.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: gvj
                                                                public final /* synthetic */ TransferFilterModal b;

                                                                {
                                                                    this.b = this;
                                                                }

                                                                @Override // android.view.View.OnFocusChangeListener
                                                                public final void onFocusChange(View view, boolean z) {
                                                                    int i4 = objArr2;
                                                                    TransferFilterModal transferFilterModal = this.b;
                                                                    switch (i4) {
                                                                        case 0:
                                                                            js2 js2Var7 = transferFilterModal.x;
                                                                            if (js2Var7 == null) {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                            TextInputLayout textInputLayout4 = (TextInputLayout) js2Var7.g;
                                                                            if (js2Var7 == null) {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                            transferFilterModal.H(textInputLayout4, (AutoCompleteTextView) js2Var7.f, z);
                                                                            if (z) {
                                                                                js2 js2Var8 = transferFilterModal.x;
                                                                                if (js2Var8 == null) {
                                                                                    Intrinsics.i("modalBinding");
                                                                                    throw null;
                                                                                }
                                                                                if (((AutoCompleteTextView) js2Var8.f).getText().toString().length() == 0) {
                                                                                    transferFilterModal.z = null;
                                                                                    js2 js2Var9 = transferFilterModal.x;
                                                                                    if (js2Var9 != null) {
                                                                                        ((AutoCompleteTextView) js2Var9.f).showDropDown();
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.i("modalBinding");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        default:
                                                                            js2 js2Var10 = transferFilterModal.x;
                                                                            if (js2Var10 == null) {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                            TextInputLayout textInputLayout5 = (TextInputLayout) js2Var10.n;
                                                                            if (js2Var10 != null) {
                                                                                transferFilterModal.H(textInputLayout5, (AutoCompleteTextView) js2Var10.m, z);
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            js2 js2Var7 = this.x;
                                                            if (js2Var7 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((TextInputLayout) js2Var7.g).setEndIconOnClickListener(new fvj(this, 3));
                                                            js2 js2Var8 = this.x;
                                                            if (js2Var8 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            int i4 = 4;
                                                            ((AutoCompleteTextView) js2Var8.f).addTextChangedListener(new i63(i4, this, eh5Var));
                                                            js2 js2Var9 = this.x;
                                                            if (js2Var9 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var9.f).setOnItemClickListener(new ah5(7, this, eh5Var));
                                                            PlayerTransferFilterData playerTransferFilterData3 = F().g;
                                                            UniqueTournament tournament = playerTransferFilterData3 != null ? playerTransferFilterData3.getTournament() : null;
                                                            this.A = tournament;
                                                            if (tournament != null) {
                                                                String name2 = tournament.getName();
                                                                Context requireContext3 = requireContext();
                                                                requireContext3.getClass();
                                                                String lowerCase = tournament.getCategory().getName().toLowerCase(Locale.ROOT);
                                                                lowerCase.getClass();
                                                                str2 = dmi.r(name2, " (", tv3.c(requireContext3, lowerCase), ")");
                                                            }
                                                            js2 js2Var10 = this.x;
                                                            if (js2Var10 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var10.m).setText(str2);
                                                            js2 js2Var11 = this.x;
                                                            if (js2Var11 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            TextInputLayout textInputLayout4 = (TextInputLayout) js2Var11.n;
                                                            Context context2 = getContext();
                                                            if (context2 != null) {
                                                                try {
                                                                    typeface2 = z1g.a(R.font.sofascore_sans_regular, context2);
                                                                } catch (Exception unused2) {
                                                                    typeface2 = Typeface.DEFAULT;
                                                                }
                                                            } else {
                                                                typeface2 = null;
                                                            }
                                                            textInputLayout4.setTypeface(typeface2);
                                                            js2 js2Var12 = this.x;
                                                            if (js2Var12 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((TextInputLayout) js2Var12.n).setEndIconVisible(false);
                                                            js2 js2Var13 = this.x;
                                                            if (js2Var13 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var13.m).setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: gvj
                                                                public final /* synthetic */ TransferFilterModal b;

                                                                {
                                                                    this.b = this;
                                                                }

                                                                @Override // android.view.View.OnFocusChangeListener
                                                                public final void onFocusChange(View view, boolean z) {
                                                                    int i42 = i2;
                                                                    TransferFilterModal transferFilterModal = this.b;
                                                                    switch (i42) {
                                                                        case 0:
                                                                            js2 js2Var72 = transferFilterModal.x;
                                                                            if (js2Var72 == null) {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                            TextInputLayout textInputLayout42 = (TextInputLayout) js2Var72.g;
                                                                            if (js2Var72 == null) {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                            transferFilterModal.H(textInputLayout42, (AutoCompleteTextView) js2Var72.f, z);
                                                                            if (z) {
                                                                                js2 js2Var82 = transferFilterModal.x;
                                                                                if (js2Var82 == null) {
                                                                                    Intrinsics.i("modalBinding");
                                                                                    throw null;
                                                                                }
                                                                                if (((AutoCompleteTextView) js2Var82.f).getText().toString().length() == 0) {
                                                                                    transferFilterModal.z = null;
                                                                                    js2 js2Var92 = transferFilterModal.x;
                                                                                    if (js2Var92 != null) {
                                                                                        ((AutoCompleteTextView) js2Var92.f).showDropDown();
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.i("modalBinding");
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        default:
                                                                            js2 js2Var102 = transferFilterModal.x;
                                                                            if (js2Var102 == null) {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                            TextInputLayout textInputLayout5 = (TextInputLayout) js2Var102.n;
                                                                            if (js2Var102 != null) {
                                                                                transferFilterModal.H(textInputLayout5, (AutoCompleteTextView) js2Var102.m, z);
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.i("modalBinding");
                                                                                throw null;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            js2 js2Var14 = this.x;
                                                            if (js2Var14 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((TextInputLayout) js2Var14.n).setEndIconOnClickListener(new fvj(this, i4));
                                                            Context requireContext4 = requireContext();
                                                            requireContext4.getClass();
                                                            dxe dxeVar = new dxe(requireContext4);
                                                            int i5 = 5;
                                                            F().j.e(this, new ygi(i3, new qdj(dxeVar, i5)));
                                                            js2 js2Var15 = this.x;
                                                            if (js2Var15 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var15.m).setAdapter(dxeVar);
                                                            js2 js2Var16 = this.x;
                                                            if (js2Var16 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var16.m).addTextChangedListener(new ql4(this, i5));
                                                            js2 js2Var17 = this.x;
                                                            if (js2Var17 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((AutoCompleteTextView) js2Var17.m).setOnItemClickListener(new ah5(8, this, dxeVar));
                                                            PlayerTransferFilterData playerTransferFilterData4 = F().g;
                                                            boolean z = (playerTransferFilterData4 != null ? playerTransferFilterData4.getTournament() : null) != null;
                                                            js2 js2Var18 = this.x;
                                                            if (js2Var18 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            g5k g5kVar = new g5k((TypeHeaderView) js2Var18.e);
                                                            String string = getString(R.string.all);
                                                            string.getClass();
                                                            vt2 vt2Var = new vt2("ALL", string, false, null, null, null, null, 252);
                                                            String string2 = getString(R.string.incoming_transfers);
                                                            string2.getClass();
                                                            vt2 vt2Var2 = new vt2("INCOMING", string2, false, null, null, null, null, 252);
                                                            String string3 = getString(R.string.outgoing_transfers);
                                                            string3.getClass();
                                                            List j = kotlin.collections.b.j(vt2Var, vt2Var2, new vt2("OUTGOING", string3, false, null, null, null, null, 252));
                                                            j.getClass();
                                                            g5kVar.b = j;
                                                            PlayerTransferFilterData playerTransferFilterData5 = F().g;
                                                            g5kVar.c = (playerTransferFilterData5 == null || (incomingOutgoing = playerTransferFilterData5.getIncomingOutgoing()) == null) ? null : incomingOutgoing.name();
                                                            g5kVar.b();
                                                            G(z);
                                                            js2 js2Var19 = this.x;
                                                            if (js2Var19 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((dk2) js2Var19.k).c.setText(requireContext().getString(R.string.age_range));
                                                            js2 js2Var20 = this.x;
                                                            if (js2Var20 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((RangeSlider) js2Var20.j).m.add(new tk2(this, i2));
                                                            js2 js2Var21 = this.x;
                                                            if (js2Var21 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((RangeSlider) js2Var21.j).setValues(kotlin.collections.b.e(Float.valueOf(Math.max(F().g != null ? r5.getAgeFrom() : 15.0f, 15.0f)), Float.valueOf(Math.min(F().g != null ? r6.getAgeTo() : 50.0f, 50.0f))));
                                                            js2 js2Var22 = this.x;
                                                            if (js2Var22 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((dk2) js2Var22.c).c.setText(requireContext().getString(R.string.minimum_number_of_followers));
                                                            js2 js2Var23 = this.x;
                                                            if (js2Var23 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            g5k g5kVar2 = new g5k((TypeHeaderView) js2Var23.b);
                                                            List j2 = kotlin.collections.b.j(new vt2("F0", "0", false, null, null, null, null, 252), new vt2("F10", "10", false, null, null, null, null, 252), new vt2("F100", StatisticData.ERROR_CODE_NOT_FOUND, false, null, null, null, null, 252), new vt2("F1000", "1000", false, null, null, null, null, 252));
                                                            j2.getClass();
                                                            g5kVar2.b = j2;
                                                            PlayerTransferFilterData playerTransferFilterData6 = F().g;
                                                            g5kVar2.c = (playerTransferFilterData6 == null || (minFollowers = playerTransferFilterData6.getMinFollowers()) == null) ? null : minFollowers.name();
                                                            g5kVar2.b();
                                                            js2 js2Var24 = this.x;
                                                            if (js2Var24 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((dk2) js2Var24.l).c.setText(requireContext().getString(R.string.player_position));
                                                            js2 js2Var25 = this.x;
                                                            if (js2Var25 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            g5k g5kVar3 = new g5k((TypeHeaderView) js2Var25.h);
                                                            String string4 = getString(R.string.all);
                                                            string4.getClass();
                                                            vt2 vt2Var3 = new vt2("ALL", string4, false, null, null, null, null, 252);
                                                            String string5 = getString(R.string.forward_short);
                                                            string5.getClass();
                                                            vt2 vt2Var4 = new vt2("FW", string5, false, null, null, null, null, 252);
                                                            String string6 = getString(R.string.midfielder_short);
                                                            string6.getClass();
                                                            vt2 vt2Var5 = new vt2("MF", string6, false, null, null, null, null, 252);
                                                            String string7 = getString(R.string.defender_short);
                                                            string7.getClass();
                                                            vt2 vt2Var6 = new vt2("DF", string7, false, null, null, null, null, 252);
                                                            String string8 = getString(R.string.goalkeeper_short);
                                                            string8.getClass();
                                                            List j3 = kotlin.collections.b.j(vt2Var3, vt2Var4, vt2Var5, vt2Var6, new vt2("GK", string8, false, null, null, null, null, 252));
                                                            j3.getClass();
                                                            g5kVar3.b = j3;
                                                            PlayerTransferFilterData playerTransferFilterData7 = F().g;
                                                            g5kVar3.c = (playerTransferFilterData7 == null || (position = playerTransferFilterData7.getPosition()) == null) ? null : position.name();
                                                            g5kVar3.b();
                                                            js2 js2Var26 = this.x;
                                                            if (js2Var26 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            ((ConstraintLayout) js2Var26.o).setOnClickListener(new fvj(this, 2));
                                                            js2 js2Var27 = this.x;
                                                            if (js2Var27 == null) {
                                                                Intrinsics.i("modalBinding");
                                                                throw null;
                                                            }
                                                            NestedScrollView nestedScrollView2 = (NestedScrollView) js2Var27.i;
                                                            nestedScrollView2.getClass();
                                                            return nestedScrollView2;
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

    public final uvj F() {
        return (uvj) this.w.getValue();
    }

    public final void G(boolean z) {
        js2 js2Var = this.x;
        if (js2Var == null) {
            Intrinsics.i("modalBinding");
            throw null;
        }
        ((TypeHeaderView) js2Var.e).setEnabledStateAll(z);
        js2 js2Var2 = this.x;
        if (js2Var2 != null) {
            ((TypeHeaderView) js2Var2.e).setSelectedIndex(0);
        } else {
            Intrinsics.i("modalBinding");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView, boolean z) {
        boolean z2;
        Typeface typeface;
        Typeface typeface2;
        if (z) {
            Editable text = autoCompleteTextView.getText();
            text.getClass();
            if (text.length() > 0) {
                z2 = true;
                textInputLayout.setEndIconVisible(z2);
                Typeface typeface3 = null;
                if (!z) {
                    Context context = getContext();
                    if (context != null) {
                        try {
                            typeface2 = z1g.a(R.font.sofascore_sans_medium, context);
                        } catch (Exception unused) {
                            typeface2 = Typeface.DEFAULT;
                        }
                        typeface3 = typeface2;
                    }
                    textInputLayout.setTypeface(typeface3);
                    return;
                }
                Context context2 = getContext();
                if (context2 != null) {
                    try {
                        typeface = z1g.a(R.font.sofascore_sans_regular, context2);
                    } catch (Exception unused2) {
                        typeface = Typeface.DEFAULT;
                    }
                    typeface3 = typeface;
                }
                textInputLayout.setTypeface(typeface3);
                Context context3 = autoCompleteTextView.getContext();
                context3.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context3.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                    return;
                }
                return;
            }
        }
        z2 = false;
        textInputLayout.setEndIconVisible(z2);
        Typeface typeface32 = null;
        if (!z) {
        }
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
        return "TransfersFilterModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.filter_by);
        string.getClass();
        return string;
    }
}
