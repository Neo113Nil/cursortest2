package com.vk.money.createtransfer.people;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.money.MoneySendTransfer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.money.MoneyGetCardsResult;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.money.MoneyTransferMethod;
import com.vk.money.createtransfer.people.ReceiverType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.CompoundRadioGroup;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.acv0;
import xsna.asp;
import xsna.brm0;
import xsna.c3h0;
import xsna.cpo;
import xsna.dc;
import xsna.dw20;
import xsna.e3h0;
import xsna.epx;
import xsna.f4m;
import xsna.ff20;
import xsna.g5g;
import xsna.gpu0;
import xsna.h9k;
import xsna.ha;
import xsna.hv90;
import xsna.ia;
import xsna.it9;
import xsna.ja;
import xsna.jwg0;
import xsna.k9i0;
import xsna.k9k;
import xsna.ko;
import xsna.kwg0;
import xsna.lf1;
import xsna.mt9;
import xsna.myc0;
import xsna.njp0;
import xsna.r730;
import xsna.rjp0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.scg0;
import xsna.tbv0;
import xsna.ts9;
import xsna.vt9;
import xsna.wcj;
import xsna.x2h0;
import xsna.zrp;

/* compiled from: CreatePeopleTransferPresenter.kt */
/* loaded from: classes3.dex */
public final class CreatePeopleTransferPresenter extends ja implements h9k {
    public final CreatePeopleTransferFragment o;
    public final d p;
    public TransferMode q;
    public rjp0 r;
    public volatile dc s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreatePeopleTransferPresenter.kt */
    public static final class TransferFrom {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TransferFrom[] $VALUES;
        public static final TransferFrom Cards;
        public static final TransferFrom SBP;
        public static final TransferFrom VKPay;

        static {
            TransferFrom transferFrom = new TransferFrom("Cards", 0);
            Cards = transferFrom;
            TransferFrom transferFrom2 = new TransferFrom("VKPay", 1);
            VKPay = transferFrom2;
            TransferFrom transferFrom3 = new TransferFrom("SBP", 2);
            SBP = transferFrom3;
            TransferFrom[] transferFromArr = {transferFrom, transferFrom2, transferFrom3};
            $VALUES = transferFromArr;
            $ENTRIES = new asp(transferFromArr);
        }

        public TransferFrom() {
            throw null;
        }

        public static TransferFrom valueOf(String str) {
            return (TransferFrom) Enum.valueOf(TransferFrom.class, str);
        }

        public static TransferFrom[] values() {
            return (TransferFrom[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreatePeopleTransferPresenter.kt */
    public static final class TransferMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TransferMode[] $VALUES;
        public static final TransferMode REQUEST;
        public static final TransferMode TRANSFER;

        static {
            TransferMode transferMode = new TransferMode("TRANSFER", 0);
            TRANSFER = transferMode;
            TransferMode transferMode2 = new TransferMode("REQUEST", 1);
            REQUEST = transferMode2;
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

    /* compiled from: CreatePeopleTransferPresenter.kt */
    public static final class a implements d {
        public final CreatePeopleTransferPresenter a;
        public final CreatePeopleTransferFragment b;

        public a(CreatePeopleTransferPresenter createPeopleTransferPresenter, CreatePeopleTransferFragment createPeopleTransferFragment) {
            this.a = createPeopleTransferPresenter;
            this.b = createPeopleTransferFragment;
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final void f() {
            this.a.r = new e3h0();
            CompoundRadioGroup compoundRadioGroup = this.b.u0;
            if (compoundRadioGroup == null) {
                compoundRadioGroup = null;
            }
            compoundRadioGroup.setCheckedId(R.id.sbp_receiver_checkbox_parent);
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final boolean g(ReceiverType receiverType) {
            if (receiverType != ReceiverType.Card2VkPay) {
                return true;
            }
            MoneyReceiverInfo b = this.a.k.b();
            if (b != null) {
                return b.i;
            }
            return false;
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final void h() {
            this.a.r = new ts9();
            this.b.Co();
        }
    }

    /* compiled from: CreatePeopleTransferPresenter.kt */
    public interface d {
        void f();

        boolean g(ReceiverType receiverType);

        void h();
    }

    /* compiled from: CreatePeopleTransferPresenter.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferMode.values().length];
            try {
                iArr[TransferMode.TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferMode.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReceiverType.values().length];
            try {
                iArr2[ReceiverType.Card2Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ReceiverType.Card2VkPay.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ReceiverType.VkPay2VkPay.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ReceiverType.Sbp2Sbp.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public CreatePeopleTransferPresenter(CreatePeopleTransferFragment createPeopleTransferFragment, Bundle bundle) {
        super(createPeopleTransferFragment, bundle);
        this.o = createPeopleTransferFragment;
        String string = bundle.getString("acceptOnlyVkPayOrCard", "both");
        this.p = epx.f(string, "card") ? new b(this, createPeopleTransferFragment) : epx.f(string, "vkpay") ? new c(this, createPeopleTransferFragment) : new a(this, createPeopleTransferFragment);
        this.q = TransferMode.TRANSFER;
        this.r = new ts9();
        MoneyReceiverInfo moneyReceiverInfo = new MoneyReceiverInfo(1, 75000, null, false, false, null, null, false, 0, false, null, 1536, null);
        this.s = new hv90(new MoneyReceiverInfo(moneyReceiverInfo.b, moneyReceiverInfo.c, null, false, false, null, null, false, 0, false, null, 1536, null));
    }

    @Override // xsna.ja
    public final r730 A(int i, UserId userId, String str, String str2) {
        return new r730(userId, i, str, str2, 0, false, r730.a.C3597a.a);
    }

    @Override // xsna.ja
    public final String B(int i) {
        int i2 = e.$EnumSwitchMapping$0[this.q.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return C(i);
            }
            throw new NoWhenBranchMatchedException();
        }
        String D = ja.D(R.string.money_transfer_send);
        if (i <= 0 || !myc0.f(this.j)) {
            return D;
        }
        return D + ' ' + i + ' ' + this.j;
    }

    @Override // xsna.ja
    public final njp0 E() {
        return this.s;
    }

    @Override // xsna.ja
    public final void H(Context context) {
        if (this.q == TransferMode.REQUEST) {
            I(context);
            return;
        }
        Bundle bundle = this.b;
        int i = 0;
        String str = null;
        String str2 = null;
        MoneySendTransfer moneySendTransfer = new MoneySendTransfer(this.g, this.h, this.i, this.m, this.c, i, str, str2, bundle.getInt("requestId"), bundle.getLong("peerId"), O(), 224, null);
        rjp0 rjp0Var = this.r;
        if (rjp0Var instanceof acv0) {
            CreatePeopleTransferFragment createPeopleTransferFragment = this.o;
            createPeopleTransferFragment.d0();
            ((acv0) rjp0Var).e(createPeopleTransferFragment.requireContext(), createPeopleTransferFragment, moneySendTransfer);
        } else {
            njp0 njp0Var = this.s;
            if (njp0Var instanceof dc.a) {
                moneySendTransfer = MoneySendTransfer.F0(moneySendTransfer, 0, ((dc.a) njp0Var).b(), null, 1983);
            }
            this.r.a(context, moneySendTransfer, new k9k(this, context));
        }
    }

    @Override // xsna.ja
    public final boolean J() {
        boolean z = this.h < this.s.e() || this.h > this.s.a();
        dc dcVar = this.s;
        if ((dcVar instanceof tbv0 ? (tbv0) dcVar : null) == null) {
            return z;
        }
        throw null;
    }

    @Override // xsna.ja
    public final void L(scg0 scg0Var) {
        if (this.q != TransferMode.REQUEST || (scg0Var instanceof scg0.d) || (scg0Var instanceof scg0.c)) {
            super.L(scg0Var);
        } else {
            super.L(new scg0.e(this.h));
        }
    }

    public final String O() {
        String a2 = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.ATTACH_MONEY_TRANSFER);
        String str = this.c;
        return epx.f(str, a2) ? "message" : (epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.MONEY_FRIENDS_SEND)) || epx.f(str, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.MONEY_TRANSFERS))) ? "settings" : CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE;
    }

    public final void P(TransferFrom transferFrom) {
        CreatePeopleTransferFragment createPeopleTransferFragment = this.o;
        createPeopleTransferFragment.Do(false);
        createPeopleTransferFragment.Fo(false);
        createPeopleTransferFragment.Eo(false);
        List list = (List) this.k.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (brm0.w(((MoneyTransferMethod) obj).getType(), transferFrom.name(), true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g5g.y(((MoneyTransferMethod) it.next()).Ab(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            MoneyReceiverInfo moneyReceiverInfo = (MoneyReceiverInfo) it2.next();
            ReceiverType.a aVar = ReceiverType.Companion;
            int i = moneyReceiverInfo.j;
            aVar.getClass();
            ReceiverType receiverType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ReceiverType.Sbp2Sbp : ReceiverType.VkPay2VkPay : ReceiverType.Card2VkPay : ReceiverType.Card2Card;
            if (receiverType != null) {
                int i2 = e.$EnumSwitchMapping$1[receiverType.ordinal()];
                d dVar = this.p;
                if (i2 == 1) {
                    createPeopleTransferFragment.Do(dVar.g(receiverType));
                } else if (i2 == 2 || i2 == 3) {
                    createPeopleTransferFragment.Fo(dVar.g(receiverType));
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    createPeopleTransferFragment.Eo(dVar.g(receiverType));
                }
            }
        }
    }

    @Override // xsna.ja, xsna.oak
    public final void d() {
        ViewGroup viewGroup;
        if (this.b.getBoolean("startWithRequest", false)) {
            this.q = TransferMode.REQUEST;
        }
        super.d();
        TransferMode transferMode = this.q;
        TransferMode transferMode2 = TransferMode.REQUEST;
        CreatePeopleTransferFragment createPeopleTransferFragment = this.o;
        if (transferMode != transferMode2) {
            ProgressBar progressBar = createPeopleTransferFragment.v0;
            if (progressBar == null) {
                progressBar = null;
            }
            progressBar.setVisibility(0);
            View view = createPeopleTransferFragment.q0;
            f4m.j(view != null ? view : null);
            return;
        }
        ProgressBar progressBar2 = createPeopleTransferFragment.v0;
        if (progressBar2 == null) {
            progressBar2 = null;
        }
        f4m.j(progressBar2);
        View view2 = createPeopleTransferFragment.q0;
        if (view2 == null) {
            view2 = null;
        }
        f4m.j(view2);
        TextView textView = createPeopleTransferFragment.l0;
        if (textView == null) {
            textView = null;
        }
        ViewParent parent = textView.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            TextView textView2 = createPeopleTransferFragment.l0;
            if (textView2 == null) {
                textView2 = null;
            }
            viewGroup2.removeView(textView2);
        }
        View view3 = createPeopleTransferFragment.getView();
        if (view3 == null || (viewGroup = (ViewGroup) view3.findViewById(R.id.scrollable_content)) == null) {
            return;
        }
        TextView textView3 = createPeopleTransferFragment.l0;
        viewGroup.addView(textView3 != null ? textView3 : null);
    }

    @Override // xsna.h9k
    public final void f() {
        this.s = new c3h0(c3h0.b);
        this.p.f();
        CreatePeopleTransferFragment createPeopleTransferFragment = this.o;
        String string = createPeopleTransferFragment.getString(R.string.money_transfer_pay_method_sbp);
        TextView textView = createPeopleTransferFragment.w0;
        if (textView == null) {
            textView = null;
        }
        textView.setText(string);
        P(TransferFrom.SBP);
        ja.M(this);
        N();
    }

    @Override // xsna.h9k
    public final void m() {
        ff20 ff20Var = new ff20("money.getTransferMethods", 3);
        ff20Var.F(this.g, "receiver_id");
        m1 y0 = rsg0.y0(ff20Var, null, null, 3);
        ia iaVar = new ia(new ha(this, 28), 21);
        String simpleName = CreatePeopleTransferPresenter.class.getSimpleName();
        int i = kwg0.a;
        this.d.b(y0.subscribe(iaVar, new jwg0(simpleName)));
    }

    @Override // xsna.h9k
    public final void q() {
        dw20.a i;
        CreatePeopleTransferFragment createPeopleTransferFragment = this.o;
        ArrayList arrayList = new ArrayList();
        MoneyReceiverInfo f = this.k.f();
        if (f != null ? f.i : false) {
            arrayList.add(new x2h0(false));
        }
        Iterator<MoneyCard> it = this.f.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MoneyCard next = it.next();
            if (!next.equals(MoneyCard.f)) {
                dc dcVar = this.s;
                mt9 mt9Var = dcVar instanceof mt9 ? (mt9) dcVar : null;
                arrayList.add(new it9(next, epx.f(mt9Var != null ? mt9Var.b.b : null, next.b)));
            }
        }
        MoneyReceiverInfo moneyReceiverInfo = this.e;
        if (moneyReceiverInfo == null) {
            moneyReceiverInfo = null;
        }
        if (moneyReceiverInfo.g != null) {
            MoneyCard moneyCard = MoneyCard.f;
            dc dcVar2 = this.s;
            mt9 mt9Var2 = dcVar2 instanceof mt9 ? (mt9) dcVar2 : null;
            arrayList.add(new it9(moneyCard, epx.f(mt9Var2 != null ? mt9Var2.b.b : null, "0")));
        }
        createPeopleTransferFragment.d0();
        dw20.b c2 = new dw20.b(createPeopleTransferFragment.requireContext(), null).v0(R.string.money_transfer_select_card_to_pay_dialog_title).c(new cpo(false, 0, 7));
        k9i0 k9i0Var = createPeopleTransferFragment.A0;
        k9i0Var.setItems(arrayList);
        s3q0 s3q0Var = s3q0.a;
        i = c2.i(k9i0Var, (r3 & 2) == 0, false);
        createPeopleTransferFragment.z0 = ((dw20.b) i).l0((gpu0) createPeopleTransferFragment.x0.getValue()).I0(null);
    }

    @Override // xsna.h9k
    public final void s() {
        MoneyReceiverInfo b2;
        if ((this.r instanceof ts9) && (b2 = this.k.b()) != null) {
            this.s = new mt9(this.f.c, b2);
            this.r = new vt9();
            ja.M(this);
            N();
        }
    }

    @Override // xsna.h9k
    public final void u(MoneyCard moneyCard) {
        this.p.h();
        MoneyReceiverInfo d2 = this.r.d(this.k);
        if (d2 == null && (d2 = this.e) == null) {
            d2 = null;
        }
        this.s = new mt9(moneyCard, d2);
        MoneyGetCardsResult moneyGetCardsResult = new MoneyGetCardsResult(this.f.b, moneyCard);
        this.f = moneyGetCardsResult;
        this.o.Go(moneyGetCardsResult);
        P(TransferFrom.Cards);
        N();
        ja.M(this);
    }

    @Override // xsna.h9k
    public final void v() {
        m1 y0 = rsg0.y0(new ko(1), null, null, 3);
        lf1 lf1Var = new lf1(new wcj(this, 2), 19);
        String simpleName = CreatePeopleTransferPresenter.class.getSimpleName();
        int i = kwg0.a;
        this.d.b(y0.subscribe(lf1Var, new jwg0(simpleName)));
    }

    @Override // xsna.h9k
    public final void y() {
        MoneyReceiverInfo f = this.k.f();
        if (f == null) {
            return;
        }
        this.s = new c3h0(f);
        this.r = new e3h0();
        ja.M(this);
        N();
    }

    @Override // xsna.h9k
    public final void z() {
        MoneyReceiverInfo a2;
        if ((this.r instanceof vt9) && (a2 = this.k.a()) != null) {
            this.s = new mt9(this.f.c, a2);
            this.r = new ts9();
            ja.M(this);
            N();
        }
    }

    /* compiled from: CreatePeopleTransferPresenter.kt */
    public static final class b implements d {
        public final CreatePeopleTransferPresenter a;
        public final CreatePeopleTransferFragment b;

        /* compiled from: CreatePeopleTransferPresenter.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReceiverType.values().length];
                try {
                    iArr[ReceiverType.Card2Card.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(CreatePeopleTransferPresenter createPeopleTransferPresenter, CreatePeopleTransferFragment createPeopleTransferFragment) {
            this.a = createPeopleTransferPresenter;
            this.b = createPeopleTransferFragment;
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final boolean g(ReceiverType receiverType) {
            return a.$EnumSwitchMapping$0[receiverType.ordinal()] == 1;
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final void h() {
            this.a.r = new ts9();
            this.b.Co();
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final void f() {
        }
    }

    /* compiled from: CreatePeopleTransferPresenter.kt */
    public static final class c implements d {
        public final CreatePeopleTransferPresenter a;
        public final CreatePeopleTransferFragment b;

        /* compiled from: CreatePeopleTransferPresenter.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReceiverType.values().length];
                try {
                    iArr[ReceiverType.Card2Card.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReceiverType.Card2VkPay.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ReceiverType.VkPay2VkPay.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ReceiverType.Sbp2Sbp.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(CreatePeopleTransferPresenter createPeopleTransferPresenter, CreatePeopleTransferFragment createPeopleTransferFragment) {
            this.a = createPeopleTransferPresenter;
            this.b = createPeopleTransferFragment;
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final boolean g(ReceiverType receiverType) {
            int i = a.$EnumSwitchMapping$0[receiverType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    MoneyReceiverInfo b = this.a.k.b();
                    if (b != null) {
                        return b.i;
                    }
                } else {
                    if (i == 3) {
                        return true;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return false;
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final void h() {
            this.a.r = new vt9();
            CompoundRadioGroup compoundRadioGroup = this.b.u0;
            if (compoundRadioGroup == null) {
                compoundRadioGroup = null;
            }
            compoundRadioGroup.setCheckedId(R.id.vkpay_receiver_checkbox_parent);
        }

        @Override // com.vk.money.createtransfer.people.CreatePeopleTransferPresenter.d
        public final void f() {
        }
    }

    @Override // xsna.oak
    public final void n() {
    }
}
