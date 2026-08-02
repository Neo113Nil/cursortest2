package com.vk.money.createtransfer.chat;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.money.createtransfer.chat.a;
import com.vk.money.createtransfer.chat.c;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bf2;
import xsna.bwt0;
import xsna.cpo;
import xsna.cvk;
import xsna.d7k;
import xsna.dw1;
import xsna.dw20;
import xsna.e43;
import xsna.epx;
import xsna.fcv0;
import xsna.gpu0;
import xsna.hfz;
import xsna.i2w;
import xsna.it9;
import xsna.izb;
import xsna.j5g;
import xsna.ja;
import xsna.jp0;
import xsna.k9i0;
import xsna.njp0;
import xsna.pz;
import xsna.qz;
import xsna.r730;
import xsna.s3q0;
import xsna.scg0;
import xsna.sqm;
import xsna.uqm;
import xsna.vbv0;
import xsna.vtb;
import xsna.wk0;
import xsna.yad;
import xsna.zg7;
import xsna.zrp;

/* compiled from: CreateChatTransferPresenter.kt */
/* loaded from: classes3.dex */
public final class CreateChatTransferPresenter extends ja implements d7k {
    public final CreateChatTransferFragment o;
    public TransferMode p;
    public boolean q;
    public com.vk.money.createtransfer.chat.a r;
    public volatile vtb s;
    public final c t;
    public final List<Class<? extends hfz>> u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateChatTransferPresenter.kt */
    public static final class TransferMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TransferMode[] $VALUES;
        public static final TransferMode FIXED;
        public static final TransferMode UNLIMITED;

        static {
            TransferMode transferMode = new TransferMode("FIXED", 0);
            FIXED = transferMode;
            TransferMode transferMode2 = new TransferMode("UNLIMITED", 1);
            UNLIMITED = transferMode2;
            TransferMode[] transferModeArr = {transferMode, transferMode2};
            $VALUES = transferModeArr;
            $ENTRIES = new asp(transferModeArr);
        }

        public TransferMode() {
            throw null;
        }

        public static TransferMode valueOf(String str) {
            return (TransferMode) Enum.valueOf(TransferMode.class, str);
        }

        public static TransferMode[] values() {
            return (TransferMode[]) $VALUES.clone();
        }
    }

    /* compiled from: CreateChatTransferPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferMode.values().length];
            try {
                iArr[TransferMode.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferMode.UNLIMITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CreateChatTransferPresenter(CreateChatTransferFragment createChatTransferFragment, Bundle bundle) {
        super(createChatTransferFragment, bundle);
        this.o = createChatTransferFragment;
        this.p = TransferMode.FIXED;
        this.r = new a.C1281a(null);
        this.s = new vtb(new a.C1281a(null), new izb(0));
        this.t = new c();
        this.u = e43.l(it9.class, fcv0.class, vbv0.class, wk0.class, jp0.class);
    }

    @Override // xsna.ja
    public final r730 A(int i, UserId userId, String str, String str2) {
        r730.a aVar;
        String str3;
        String str4;
        r730.a bVar;
        UserId userId2;
        int O = this.p == TransferMode.UNLIMITED ? 0 : O();
        izb izbVar = this.s.b;
        int i2 = izbVar.b.a;
        boolean z = izbVar.a;
        com.vk.money.createtransfer.chat.a aVar2 = this.s.a;
        if (aVar2 instanceof a.C1281a) {
            aVar = r730.a.C3597a.a;
        } else {
            if (aVar2 instanceof a.b) {
                str3 = str;
                str4 = str2;
                bVar = new r730.a.b(((a.b) aVar2).a.b);
                userId2 = userId;
                return new r730(userId2, i2, str3, str4, O, z, bVar);
            }
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = r730.a.c.a;
        }
        bVar = aVar;
        userId2 = userId;
        str3 = str;
        str4 = str2;
        return new r730(userId2, i2, str3, str4, O, z, bVar);
    }

    @Override // xsna.ja
    public final String B(int i) {
        return this.j.length() == 0 ? ja.D(R.string.money_transfer_send_request) : C(O());
    }

    @Override // xsna.ja
    public final njp0 E() {
        return this.s;
    }

    @Override // xsna.ja
    public final boolean F() {
        int i = a.$EnumSwitchMapping$0[this.p.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if ((this.s.a instanceof a.C1281a) && this.q) {
                z = true;
            }
            return !z;
        }
        if (!super.F()) {
            return false;
        }
        if ((this.s.a instanceof a.C1281a) && this.q) {
            z = true;
        }
        return !z;
    }

    @Override // xsna.ja
    public final void H(Context context) {
        int a2 = this.s.a.a();
        if (this.s.b.b.a <= a2) {
            I(context);
        } else {
            cvk.w(this.o.getString(R.string.money_transfer_max, String.valueOf(a2)), false);
            this.n = false;
        }
    }

    @Override // xsna.ja
    public final boolean J() {
        return this.p == TransferMode.FIXED && this.h < this.s.e();
    }

    @Override // xsna.ja
    public final void K(int i) {
        String valueOf = String.valueOf(i);
        CreateChatTransferFragment createChatTransferFragment = this.o;
        createChatTransferFragment.yo(valueOf);
        if (this.p != TransferMode.FIXED) {
            createChatTransferFragment.d0();
        }
    }

    @Override // xsna.ja
    public final void L(scg0 scg0Var) {
        if (this.p == TransferMode.UNLIMITED) {
            return;
        }
        if ((scg0Var instanceof scg0.d) || (scg0Var instanceof scg0.c)) {
            super.L(scg0Var);
        } else {
            super.L(new scg0.e(O()));
        }
    }

    public final int O() {
        vtb vtbVar = this.s;
        int i = this.h;
        c cVar = this.t;
        vtb vtbVar2 = this.s;
        int i2 = this.h;
        cVar.getClass();
        return Math.max(i - (c.a(vtbVar2, i2) * (vtbVar.b.c ? 1 : 0)), 0);
    }

    public final void P(int i) {
        b bVar;
        c cVar = this.t;
        vtb vtbVar = this.s;
        cVar.getClass();
        int a2 = c.a(vtbVar, i);
        CreateChatTransferFragment createChatTransferFragment = this.o;
        EditText editText = createChatTransferFragment.q0;
        if (editText != null && (bVar = createChatTransferFragment.A0) != null) {
            editText.removeTextChangedListener(bVar);
            editText.setText(String.valueOf(a2));
            editText.addTextChangedListener(bVar);
        }
        S(a2);
        Q(false);
        CreateChatTransferFragment createChatTransferFragment2 = this.o;
        String str = this.j;
        TextView textView = createChatTransferFragment2.v0;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(boolean z) {
        String str;
        TextView textView;
        LinearLayout linearLayout;
        TextView textView2;
        int i = this.s.b.b.a;
        c cVar = this.t;
        vtb vtbVar = this.s;
        int i2 = this.h;
        cVar.getClass();
        int a2 = vtbVar.a.a();
        int e = vtbVar.e();
        int a3 = c.a(vtbVar, e);
        int i3 = e - ((vtbVar.b.c ? 1 : 0) * a3);
        boolean z2 = false;
        Object bVar = i > a2 ? new c.a.b(a2) : i < Math.max(i3, 0) ? new c.a.C1283c(a3) : i > i2 ? c.a.C1282a.a : c.a.d.a;
        String str2 = this.j;
        if (bVar instanceof c.a.b) {
            Object[] objArr = {((c.a.b) bVar).a + ' ' + str2};
            Context context = e43.a;
            str = (context != null ? context : null).getString(R.string.money_transfer_max, Arrays.copyOf(objArr, 1));
        } else {
            if (!(bVar instanceof c.a.C1283c)) {
                if (epx.f(bVar, c.a.C1282a.a)) {
                    if (this.p == TransferMode.FIXED) {
                        str = ja.D(R.string.money_transfer_recommended_amount_higher_than_total);
                    }
                } else if (!epx.f(bVar, c.a.d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "";
                if (!z2 && z) {
                    CreateChatTransferFragment createChatTransferFragment = this.o;
                    TextView textView3 = createChatTransferFragment.s0;
                    if (textView3 != null) {
                        textView3.setText(str);
                    }
                    LinearLayout linearLayout2 = createChatTransferFragment.r0;
                    if (linearLayout2 != null) {
                        linearLayout2.setBackgroundResource(R.drawable.bg_money_chat_request_error);
                    }
                    TextView textView4 = createChatTransferFragment.s0;
                    if (textView4 != null) {
                        textView4.setTextColor(createChatTransferFragment.getActivity().getColor(R.color.vk_red));
                    }
                    this.o.vo();
                    return;
                }
                CreateChatTransferFragment createChatTransferFragment2 = this.o;
                String D = ja.D(R.string.money_transfer_will_be_offered_to_each_sender);
                textView = createChatTransferFragment2.s0;
                if (textView != null) {
                    textView.setText(D);
                }
                linearLayout = createChatTransferFragment2.r0;
                if (linearLayout != null) {
                    linearLayout.setBackgroundResource(R.drawable.bg_money_chat_request);
                }
                textView2 = createChatTransferFragment2.s0;
                if (textView2 != null) {
                    textView2.setTextColor(createChatTransferFragment2.getActivity().getColor(R.color.vk_gray_500));
                }
                N();
            }
            Object[] objArr2 = {((c.a.C1283c) bVar).a + ' ' + str2};
            Context context2 = e43.a;
            str = (context2 != null ? context2 : null).getString(R.string.money_transfer_min, Arrays.copyOf(objArr2, 1));
        }
        z2 = true;
        if (!z2) {
        }
        CreateChatTransferFragment createChatTransferFragment22 = this.o;
        String D2 = ja.D(R.string.money_transfer_will_be_offered_to_each_sender);
        textView = createChatTransferFragment22.s0;
        if (textView != null) {
        }
        linearLayout = createChatTransferFragment22.r0;
        if (linearLayout != null) {
        }
        textView2 = createChatTransferFragment22.s0;
        if (textView2 != null) {
        }
        N();
    }

    public final void R(com.vk.money.createtransfer.chat.a aVar) {
        this.s = vtb.b(this.s, aVar, null, 2);
        N();
        ja.M(this);
        P(this.h);
    }

    public final void S(int i) {
        this.s = vtb.b(this.s, null, izb.a(this.s.b, false, new dw1(i, this.j), false, 0, 13), 1);
    }

    @Override // xsna.ja, xsna.oak
    public final void b(String str) {
        super.b(str);
        P(ja.G(str));
    }

    @Override // xsna.ja, xsna.oak
    public final void c(int i) {
        ja.M(this);
        this.p = i == 0 ? TransferMode.FIXED : TransferMode.UNLIMITED;
        N();
        i();
        Q(true);
        if (this.s.b.b.a < this.s.e()) {
            P(this.s.e());
        }
        int i2 = a.$EnumSwitchMapping$0[this.p.ordinal()];
        if (i2 == 1) {
            this.a.zo(B(this.h));
            CheckBox checkBox = this.o.u0;
            if (checkBox != null) {
                checkBox.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.o.zo(ja.D(R.string.money_transfer_send_request));
        CheckBox checkBox2 = this.o.u0;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
    }

    @Override // xsna.ja, xsna.oak
    public final void d() {
        super.d();
        TextView textView = this.o.v0;
        if (textView != null) {
            textView.setText(this.j);
        }
    }

    @Override // xsna.ja, xsna.oak
    public final void e() {
        if (this.p == TransferMode.FIXED) {
            super.e();
        }
    }

    @Override // xsna.d7k
    public final void g() {
        String string;
        R(new a.c());
        CreateChatTransferFragment createChatTransferFragment = this.o;
        FragmentActivity activity = createChatTransferFragment.getActivity();
        if (activity == null || (string = activity.getString(R.string.money_transfer_pay_method_vkpay)) == null) {
            return;
        }
        createChatTransferFragment.Bo(string);
    }

    @Override // xsna.d7k
    public final void h(boolean z) {
        this.s = vtb.b(this.s, null, izb.a(this.s.b, false, null, z, 0, 11), 1);
        P(this.h);
        ja.M(this);
        this.a.zo(B(O()));
        N();
    }

    @Override // xsna.d7k
    public final void i() {
        TransferMode transferMode = this.p;
        TransferMode transferMode2 = TransferMode.FIXED;
        CreateChatTransferFragment createChatTransferFragment = this.o;
        if (transferMode == transferMode2) {
            TransferInputField transferInputField = createChatTransferFragment.p0;
            if (transferInputField != null) {
                transferInputField.o1();
            }
            ja.M(this);
            return;
        }
        TransferInputField transferInputField2 = createChatTransferFragment.p0;
        if (transferInputField2 != null) {
            transferInputField2.p1();
        }
        createChatTransferFragment.d0();
    }

    @Override // xsna.d7k
    public final void j(String str) {
        S(ja.G(str));
        Q(true);
    }

    @Override // xsna.oak
    public final void n() {
        this.d.b(i2w.a().E(this, new uqm(new sqm(com.vk.dto.common.a.a(this.g), Source.NETWORK, true, (Object) null, 24))).subscribe(new qz(new pz(this, 26), 13), new bf2(new yad(this, 16), 12)));
    }

    @Override // xsna.d7k
    public final void p(boolean z) {
        this.s = vtb.b(this.s, null, izb.a(this.s.b, z, null, false, 0, 14), 1);
    }

    @Override // xsna.d7k
    public final void r(boolean z) {
        FragmentActivity activity;
        this.q = z;
        if (z && (this.r instanceof a.C1281a)) {
            MoneyCard moneyCard = (MoneyCard) j5g.a0(this.f.b);
            this.r = moneyCard != null ? new a.b(moneyCard, this.k.c()) : new a.C1281a(this.k.g());
        }
        com.vk.money.createtransfer.chat.a aVar = this.r;
        if (aVar == null) {
            return;
        }
        if (!z) {
            aVar = new a.C1281a(this.k.g());
        }
        R(aVar);
        N();
        com.vk.money.createtransfer.chat.a aVar2 = this.s.a;
        String str = null;
        if (aVar2 instanceof a.C1281a) {
            if (z && (activity = this.o.getActivity()) != null) {
                str = activity.getString(R.string.money_transfer_new_card);
            }
        } else if (aVar2 instanceof a.b) {
            str = ((a.b) aVar2).a.getTitle();
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            FragmentActivity activity2 = this.o.getActivity();
            if (activity2 != null) {
                str = activity2.getString(R.string.money_transfer_pay_method_vkpay);
            }
        }
        if (str != null) {
            this.o.Bo(str);
        }
        if (z) {
            TextView textView = this.o.z0;
            if (textView != null) {
                bwt0.p0(textView, true);
                return;
            }
            return;
        }
        TextView textView2 = this.o.z0;
        if (textView2 != null) {
            bwt0.p0(textView2, false);
        }
    }

    @Override // xsna.d7k
    public final void t(MoneyCard moneyCard) {
        R(new a.b(moneyCard, this.k.c()));
        this.o.Bo(moneyCard.getTitle());
    }

    @Override // xsna.d7k
    public final void w() {
        dw20.a i;
        CreateChatTransferFragment createChatTransferFragment = this.o;
        com.vk.money.createtransfer.chat.a aVar = this.s.a;
        ArrayList arrayList = new ArrayList();
        Iterator<MoneyCard> it = this.f.b.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            MoneyCard next = it.next();
            if (!next.equals(MoneyCard.f)) {
                if ((aVar instanceof a.b) && epx.f(((a.b) aVar).a, next)) {
                    z = true;
                }
                arrayList.add(new it9(next, z));
            }
        }
        MoneyReceiverInfo moneyReceiverInfo = this.e;
        if (moneyReceiverInfo == null) {
            moneyReceiverInfo = null;
        }
        String str = moneyReceiverInfo.g;
        if (str != null) {
            arrayList.add(new wk0(str));
        }
        MoneyReceiverInfo moneyReceiverInfo2 = this.e;
        if (moneyReceiverInfo2 == null) {
            moneyReceiverInfo2 = null;
        }
        boolean z2 = moneyReceiverInfo2.k;
        final zg7 zg7Var = new zg7(this, 4);
        List<? extends hfz> D0 = j5g.D0(new Comparator() { // from class: xsna.i7k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) zg7.this.invoke(obj, obj2)).intValue();
            }
        }, arrayList);
        createChatTransferFragment.d0();
        dw20.b c = new dw20.b(createChatTransferFragment.getActivity(), null).v0(R.string.money_transfer_destination_for_transfer).c(new cpo(false, 0, 7));
        k9i0 k9i0Var = createChatTransferFragment.D0;
        k9i0Var.setItems(D0);
        s3q0 s3q0Var = s3q0.a;
        i = c.i(k9i0Var, (r3 & 2) == 0, false);
        createChatTransferFragment.B0 = ((dw20.b) i).l0((gpu0) createChatTransferFragment.E0.getValue()).I0(null);
    }
}
