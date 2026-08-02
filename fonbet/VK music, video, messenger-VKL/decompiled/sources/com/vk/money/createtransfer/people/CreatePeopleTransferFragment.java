package com.vk.money.createtransfer.people;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.money.MoneyGetCardsResult;
import com.vk.money.MoneyWebViewFragment;
import com.vk.money.createtransfer.AbsCreateTransferFragment;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.CompoundRadioGroup;
import xsna.akh;
import xsna.bpn0;
import xsna.cqf;
import xsna.dw20;
import xsna.e3m;
import xsna.en9;
import xsna.fq1;
import xsna.h9k;
import xsna.i9k;
import xsna.j9k;
import xsna.jjv0;
import xsna.k9i0;
import xsna.l63;
import xsna.l8g;
import xsna.mhy;
import xsna.oz50;
import xsna.ozh;
import xsna.rx0;
import xsna.tvj;
import xsna.x2e;

/* compiled from: CreatePeopleTransferFragment.kt */
/* loaded from: classes3.dex */
public final class CreatePeopleTransferFragment extends AbsCreateTransferFragment<h9k> implements i9k {
    public static final /* synthetic */ int B0 = 0;
    public View q0;
    public RadioButton r0;
    public RadioButton s0;
    public RadioButton t0;
    public CompoundRadioGroup u0;
    public ProgressBar v0;
    public TextView w0;
    public dw20 z0;
    public final bpn0 x0 = new bpn0(new tvj(this, 1));
    public final bpn0 y0 = new bpn0(new l63(11));
    public final k9i0 A0 = new k9i0(new ozh(this, 5), new x2e(this, 6), null, new cqf(this, 9), new j9k(this, 0), new akh(this, 6), 8);

    /* compiled from: CreatePeopleTransferFragment.kt */
    public static final class a extends AbsCreateTransferFragment.a {
        public a() {
            super(CreatePeopleTransferFragment.class, null, null);
        }
    }

    /* compiled from: CreatePeopleTransferFragment.kt */
    public static final class b implements jjv0 {
        @Override // xsna.jjv0
        public final int n1(int i) {
            return i == 0 ? 4 : 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    public final void Bo(String str) {
        Activity h;
        FragmentActivity activity = getActivity();
        if (activity == null || (h = e3m.h(activity)) == null) {
            return;
        }
        mhy.b(h);
        Bundle bundle = new Bundle();
        bundle.putString("url_to_load", str);
        bundle.putInt("request_code", 1000);
        bundle.putInt("transfer_id", 0);
        new oz50(MoneyWebViewFragment.class, null, bundle).g(1000, this);
    }

    public final void Co() {
        CompoundRadioGroup compoundRadioGroup = this.u0;
        if (compoundRadioGroup == null) {
            compoundRadioGroup = null;
        }
        compoundRadioGroup.setCheckedId(R.id.card_receiver_checkbox_parent);
    }

    public final void Do(boolean z) {
        RadioButton radioButton = this.s0;
        if (radioButton == null) {
            radioButton = null;
        }
        radioButton.setEnabled(z);
        RadioButton radioButton2 = this.s0;
        RadioButton radioButton3 = radioButton2 == null ? null : radioButton2;
        int currentTextColor = (radioButton2 != null ? radioButton2 : null).getCurrentTextColor();
        radioButton3.setTextColor(z ? l8g.f(1.0f, currentTextColor) : l8g.f(0.4f, currentTextColor));
    }

    public final void Eo(boolean z) {
        RadioButton radioButton = this.t0;
        if (radioButton == null) {
            radioButton = null;
        }
        radioButton.setEnabled(z);
        RadioButton radioButton2 = this.t0;
        RadioButton radioButton3 = radioButton2 == null ? null : radioButton2;
        int currentTextColor = (radioButton2 != null ? radioButton2 : null).getCurrentTextColor();
        radioButton3.setTextColor(z ? l8g.f(1.0f, currentTextColor) : l8g.f(0.4f, currentTextColor));
    }

    public final void Fo(boolean z) {
        RadioButton radioButton = this.r0;
        if (radioButton == null) {
            radioButton = null;
        }
        radioButton.setEnabled(z);
        RadioButton radioButton2 = this.r0;
        RadioButton radioButton3 = radioButton2 == null ? null : radioButton2;
        int currentTextColor = (radioButton2 != null ? radioButton2 : null).getCurrentTextColor();
        radioButton3.setTextColor(z ? l8g.f(1.0f, currentTextColor) : l8g.f(0.4f, currentTextColor));
    }

    public final void Go(MoneyGetCardsResult moneyGetCardsResult) {
        MoneyCard moneyCard = moneyGetCardsResult.c;
        String title = !moneyCard.equals(MoneyCard.f) ? moneyCard.getTitle() : getString(R.string.money_transfer_new_card);
        TextView textView = this.w0;
        if (textView == null) {
            textView = null;
        }
        textView.setText(title);
    }

    @Override // xsna.i9k
    public final void n1() {
        TransferInputField transferInputField = this.p0;
        if (transferInputField != null) {
            transferInputField.n1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.money.createtransfer.AbsCreateTransferFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object obj = this.m0;
        if (obj == null) {
            obj = null;
        }
        ((h9k) obj).l();
        if (i != 100) {
            if (i != 1003) {
                super.onActivityResult(i, i2, intent);
                return;
            } else {
                Object obj2 = this.m0;
                ((h9k) (obj2 != null ? obj2 : null)).v();
                return;
            }
        }
        if (i2 == 1) {
            fq1 fq1Var = this.n0;
            if (fq1Var != null) {
                fq1Var.a();
            }
            wo();
        }
    }

    @Override // com.vk.money.createtransfer.AbsCreateTransferFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TransferInputField transferInputField = this.p0;
        if (transferInputField != null) {
            transferInputField.q1(TransferInputField.EditableTarget.AMOUNT, 5);
        }
        TransferInputField transferInputField2 = this.p0;
        if (transferInputField2 != null) {
            transferInputField2.q1(TransferInputField.EditableTarget.COMMENT, 6);
        }
        this.q0 = view.findViewById(R.id.merge_transfer_block);
        this.v0 = (ProgressBar) view.findViewById(R.id.merge_transfer_block_progressbar);
        CompoundRadioGroup compoundRadioGroup = (CompoundRadioGroup) view.findViewById(R.id.card_type_radiogroup);
        this.u0 = compoundRadioGroup;
        if (compoundRadioGroup == null) {
            compoundRadioGroup = null;
        }
        this.s0 = (RadioButton) ((ViewGroup) compoundRadioGroup.findViewById(R.id.card_receiver_checkbox_parent)).getChildAt(0);
        CompoundRadioGroup compoundRadioGroup2 = this.u0;
        if (compoundRadioGroup2 == null) {
            compoundRadioGroup2 = null;
        }
        this.r0 = (RadioButton) ((ViewGroup) compoundRadioGroup2.findViewById(R.id.vkpay_receiver_checkbox_parent)).getChildAt(0);
        CompoundRadioGroup compoundRadioGroup3 = this.u0;
        if (compoundRadioGroup3 == null) {
            compoundRadioGroup3 = null;
        }
        ViewGroup viewGroup = (ViewGroup) compoundRadioGroup3.findViewById(R.id.sbp_receiver_checkbox_parent);
        if (viewGroup == null) {
            viewGroup = null;
        }
        this.t0 = (RadioButton) viewGroup.getChildAt(0);
        CompoundRadioGroup compoundRadioGroup4 = this.u0;
        if (compoundRadioGroup4 == null) {
            compoundRadioGroup4 = null;
        }
        compoundRadioGroup4.setOnCheckedChangeListener(new rx0(this, 16));
        TextView textView = (TextView) view.findViewById(R.id.tv_card_title);
        this.w0 = textView;
        (textView != null ? textView : null).setOnClickListener(new en9(this, 3));
        super.onViewCreated(view, bundle);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        Object obj = this.m0;
        if (obj == null) {
            obj = null;
        }
        ((h9k) obj).n();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.money_people_transfer_new, (ViewGroup) null);
    }

    @Override // com.vk.money.createtransfer.AbsCreateTransferFragment
    public final h9k uo(Bundle bundle) {
        return new CreatePeopleTransferPresenter(this, bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = requireArguments().getBoolean("startWithRequest", false) ? MobileOfficialAppsCoreNavStat$EventScreen.CREATE_MONEY_REQUEST : MobileOfficialAppsCoreNavStat$EventScreen.CREATE_MONEY_TRANSFER;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
