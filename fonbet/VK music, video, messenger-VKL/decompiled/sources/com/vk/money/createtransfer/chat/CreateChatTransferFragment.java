package com.vk.money.createtransfer.chat;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.VKTabLayout;
import com.vk.money.createtransfer.AbsCreateTransferFragment;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.movika.sdk.base.observable.o;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d7k;
import xsna.dw20;
import xsna.dwg;
import xsna.eph;
import xsna.jjv0;
import xsna.k9i0;
import xsna.pcg;
import xsna.rno0;
import xsna.tj2;
import xsna.xcd;
import xsna.z3i;
import xsna.zqf;

/* compiled from: CreateChatTransferFragment.kt */
/* loaded from: classes3.dex */
public final class CreateChatTransferFragment extends AbsCreateTransferFragment<d7k> {
    public static final /* synthetic */ int F0 = 0;
    public com.vk.money.createtransfer.chat.b A0;
    public dw20 B0;
    public final bpn0 C0 = new bpn0(new tj2(10));
    public final k9i0 D0 = new k9i0(new o(this, 24), null, new z3i(this, 3), new dwg(this, 7), new xcd(this, 11), null, 68);
    public final bpn0 E0 = new bpn0(new zqf(this, 12));
    public EditText q0;
    public LinearLayout r0;
    public TextView s0;
    public CheckBox t0;
    public CheckBox u0;
    public TextView v0;
    public CheckBox w0;
    public ViewGroup x0;
    public VKTabLayout y0;
    public TextView z0;

    /* compiled from: CreateChatTransferFragment.kt */
    public static final class a extends AbsCreateTransferFragment.a {
    }

    /* compiled from: CreateChatTransferFragment.kt */
    public static class b extends rno0 {
    }

    /* compiled from: CreateChatTransferFragment.kt */
    public static final class c implements jjv0 {
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
        TextView textView = this.z0;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.vk.money.createtransfer.AbsCreateTransferFragment, me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.u0 = (CheckBox) onCreateView.findViewById(R.id.cb_participate_in_collecting);
        this.t0 = (CheckBox) onCreateView.findViewById(R.id.cb_auto_card);
        this.v0 = (TextView) onCreateView.findViewById(R.id.currency_sign_recommended);
        this.q0 = (EditText) onCreateView.findViewById(R.id.et_recommended_input);
        this.r0 = (LinearLayout) onCreateView.findViewById(R.id.ll_recommended_container);
        this.s0 = (TextView) onCreateView.findViewById(R.id.ll_recommended_info);
        this.w0 = (CheckBox) onCreateView.findViewById(R.id.cb_pin_msg);
        this.x0 = (ViewGroup) onCreateView.findViewById(R.id.ll_chat_request_controls);
        this.y0 = (VKTabLayout) onCreateView.findViewById(R.id.tabs_request);
        this.z0 = (TextView) onCreateView.findViewById(R.id.tv_card_title);
        return onCreateView;
    }

    @Override // com.vk.money.createtransfer.AbsCreateTransferFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.q0;
        if (editText != null) {
            editText.removeTextChangedListener(this.A0);
        }
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.money.createtransfer.AbsCreateTransferFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TransferInputField transferInputField = this.p0;
        if (transferInputField != null) {
            transferInputField.s1(TransferInputField.EditableTarget.AMOUNT, new InputFilter[]{new InputFilter.LengthFilter(7)});
        }
        TransferInputField transferInputField2 = this.p0;
        if (transferInputField2 != null) {
            transferInputField2.q1(TransferInputField.EditableTarget.COMMENT, 5);
        }
        CheckBox checkBox = this.u0;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.e7k
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    int i = CreateChatTransferFragment.F0;
                    Object obj = CreateChatTransferFragment.this.m0;
                    if (obj == null) {
                        obj = null;
                    }
                    ((d7k) obj).h(z);
                }
            });
        }
        CheckBox checkBox2 = this.t0;
        if (checkBox2 != null) {
            checkBox2.setChecked(false);
        }
        CheckBox checkBox3 = this.t0;
        if (checkBox3 != null) {
            checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.f7k
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    int i = CreateChatTransferFragment.F0;
                    Object obj = CreateChatTransferFragment.this.m0;
                    if (obj == null) {
                        obj = null;
                    }
                    ((d7k) obj).r(z);
                }
            });
        }
        Object obj = this.m0;
        if (obj == null) {
            obj = null;
        }
        d7k d7kVar = (d7k) obj;
        CheckBox checkBox4 = this.t0;
        d7kVar.r(checkBox4 != null ? checkBox4.isChecked() : false);
        com.vk.money.createtransfer.chat.b bVar = new com.vk.money.createtransfer.chat.b(this);
        this.A0 = bVar;
        EditText editText = this.q0;
        if (editText != null) {
            editText.addTextChangedListener(bVar);
        }
        CheckBox checkBox5 = this.w0;
        if (checkBox5 != null) {
            checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.g7k
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    int i = CreateChatTransferFragment.F0;
                    Object obj2 = CreateChatTransferFragment.this.m0;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    ((d7k) obj2).p(z);
                }
            });
        }
        Object obj2 = this.m0;
        d7k d7kVar2 = (d7k) (obj2 != null ? obj2 : null);
        CheckBox checkBox6 = this.w0;
        d7kVar2.p(checkBox6 != null ? checkBox6.isChecked() : false);
        LinearLayout linearLayout = this.r0;
        if (linearLayout != null) {
            bwt0.i0(linearLayout, new eph(this, 4));
        }
        TextView textView = this.z0;
        if (textView != null) {
            bwt0.i0(textView, new pcg(this, 10));
        }
        super.onViewCreated(view, bundle);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        Object obj = this.m0;
        if (obj == null) {
            obj = null;
        }
        ((d7k) obj).n();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.money_chat_transfer_new, (ViewGroup) null);
    }

    @Override // com.vk.money.createtransfer.AbsCreateTransferFragment
    public final d7k uo(Bundle bundle) {
        return new CreateChatTransferPresenter(this, bundle);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
