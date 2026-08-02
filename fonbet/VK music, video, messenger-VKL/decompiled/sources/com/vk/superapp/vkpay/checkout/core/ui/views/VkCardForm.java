package com.vk.superapp.vkpay.checkout.core.ui.views;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.superapp.ui.VkTextFieldView;
import com.vk.superapp.vkpay.checkout.data.model.CreditCard;
import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.Card;
import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.Cvc;
import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.ExpireDate;
import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.Number;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.asp;
import xsna.brm0;
import xsna.epx;
import xsna.hij0;
import xsna.hnj;
import xsna.izs;
import xsna.m33;
import xsna.mhy;
import xsna.oa01;
import xsna.p9q;
import xsna.pn00;
import xsna.pt9;
import xsna.s3q0;
import xsna.ur;
import xsna.whg0;
import xsna.xim0;
import xsna.xsj0;
import xsna.yka0;
import xsna.zrp;

/* compiled from: VkCardForm.kt */
/* loaded from: classes6.dex */
public final class VkCardForm extends LinearLayout {
    public static final /* synthetic */ int g = 0;
    public final VkTextFieldView b;
    public final VkTextFieldView c;
    public final VkTextFieldView d;
    public izs<? super View, s3q0> e;
    public izs<? super b, s3q0> f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCardForm.kt */
    public static final class CardField {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CardField[] $VALUES;
        public static final CardField CVC;
        public static final CardField EXPIRE_DATE;
        public static final CardField NUMBER;

        static {
            CardField cardField = new CardField("NUMBER", 0);
            NUMBER = cardField;
            CardField cardField2 = new CardField("EXPIRE_DATE", 1);
            EXPIRE_DATE = cardField2;
            CardField cardField3 = new CardField("CVC", 2);
            CVC = cardField3;
            CardField[] cardFieldArr = {cardField, cardField2, cardField3};
            $VALUES = cardFieldArr;
            $ENTRIES = new asp(cardFieldArr);
        }

        public CardField() {
            throw null;
        }

        public static CardField valueOf(String str) {
            return (CardField) Enum.valueOf(CardField.class, str);
        }

        public static CardField[] values() {
            return (CardField[]) $VALUES.clone();
        }
    }

    /* compiled from: VkCardForm.kt */
    public static final class IllegalCardDataException extends RuntimeException {
        private final Set<CardField> incorrectFields;
    }

    /* compiled from: VkCardForm.kt */
    public static final class a extends xsj0 {
        public static final Regex d = new Regex("^(5[1-5][0-9]{0,14}|2(22[1-9][0-9]{0,12}|2[3-9][0-9]{0,13}|[3-6][0-9]{0,14}|7[0-1][0-9]{0,13}|720[0-9]{0,12}))$");
        public static final Regex e = new Regex("^4\\d{0,15}$");
        public static final Regex f = new Regex("^2\\d{0,15}$");
        public static final Regex g = new Regex("^35\\d{0,14}$");
        public static final Regex h = new Regex("^3[47]\\d{0,13}$");
        public static final Regex i = new Regex("^3(?:0[0-5]|[68][0-9])[0-9]{0,11}$");
        public static final Regex j = new Regex("^(62[0-9]{0,15})$");
        public static final Regex k = new Regex("^6(?:011|5[0-9]{2})[0-9]{0,12}$");
        public final VkTextFieldView b;
        public final HashMap<CreditCard, Regex> c = pn00.i(new Pair(CreditCard.VISA, e), new Pair(CreditCard.MASTERCARD, d), new Pair(CreditCard.MIR, f), new Pair(CreditCard.JCB, g), new Pair(CreditCard.AMERICAN_EXPRESS, h), new Pair(CreditCard.DINERS, i), new Pair(CreditCard.UNION, j), new Pair(CreditCard.DISCOVER, k));

        public a(VkTextFieldView vkTextFieldView) {
            this.b = vkTextFieldView;
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            VkTextFieldView vkTextFieldView;
            Map.Entry<CreditCard, Regex> next;
            CreditCard key;
            String y = brm0.y(editable.toString(), " ", "");
            Iterator<Map.Entry<CreditCard, Regex>> it = this.c.entrySet().iterator();
            do {
                boolean hasNext = it.hasNext();
                vkTextFieldView = this.b;
                if (!hasNext) {
                    int i2 = VkTextFieldView.i;
                    vkTextFieldView.a(null, null);
                    return;
                } else {
                    next = it.next();
                    key = next.getKey();
                }
            } while (!next.getValue().f(y));
            int h2 = key.h();
            int i3 = VkTextFieldView.i;
            vkTextFieldView.a(m33.a(h2, vkTextFieldView.getContext()), null);
        }
    }

    /* compiled from: VkCardForm.kt */
    public static abstract class b {

        /* compiled from: VkCardForm.kt */
        public static final class a extends b {
            public final Card a;

            public a(Card card) {
                this.a = card;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Correct(card=" + this.a + ')';
            }
        }

        /* compiled from: VkCardForm.kt */
        /* renamed from: com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm$b$b, reason: collision with other inner class name */
        public static final class C1919b extends b {
            public static final C1919b a = new C1919b();
        }

        /* compiled from: VkCardForm.kt */
        public static final class c extends b {
            public final Set<CardField> a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(Set<? extends CardField> set) {
                this.a = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ur.c(new StringBuilder("WithErrors(errors="), this.a, ')');
            }
        }
    }

    /* compiled from: VkCardForm.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardField.values().length];
            try {
                iArr[CardField.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardField.EXPIRE_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardField.CVC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkCardForm(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.vk_pay_checkout_card_form_layout, this);
        setOrientation(1);
        this.b = (VkTextFieldView) findViewById(R.id.bind_card_number_view);
        this.c = (VkTextFieldView) findViewById(R.id.bind_card_expiration_date_view);
        this.d = (VkTextFieldView) findViewById(R.id.bind_card_cvc_view);
        VkTextFieldView vkTextFieldView = this.b;
        (vkTextFieldView == null ? null : vkTextFieldView).c.addTextChangedListener(new pt9());
        VkTextFieldView vkTextFieldView2 = this.b;
        vkTextFieldView2 = vkTextFieldView2 == null ? null : vkTextFieldView2;
        VkTextFieldView vkTextFieldView3 = this.b;
        vkTextFieldView2.c.addTextChangedListener(new a(vkTextFieldView3 == null ? null : vkTextFieldView3));
        VkTextFieldView vkTextFieldView4 = this.b;
        oa01.a((vkTextFieldView4 == null ? null : vkTextFieldView4).c, new hij0(this, 21));
        VkTextFieldView vkTextFieldView5 = this.c;
        (vkTextFieldView5 == null ? null : vkTextFieldView5).c.addTextChangedListener(new p9q());
        VkTextFieldView vkTextFieldView6 = this.c;
        oa01.a((vkTextFieldView6 == null ? null : vkTextFieldView6).c, new whg0(this, 25));
        VkTextFieldView vkTextFieldView7 = this.d;
        oa01.a((vkTextFieldView7 == null ? null : vkTextFieldView7).c, new xim0(this, 13));
        VkTextFieldView vkTextFieldView8 = this.d;
        (vkTextFieldView8 == null ? null : vkTextFieldView8).setIconClickListener(new yka0(this, 26));
        VkTextFieldView vkTextFieldView9 = this.b;
        (vkTextFieldView9 == null ? null : vkTextFieldView9).requestFocus();
        VkTextFieldView vkTextFieldView10 = this.b;
        mhy.j((vkTextFieldView10 != null ? vkTextFieldView10 : null).getKeyboardTargetView());
    }

    public final b getCardData() throws IllegalCardDataException {
        Number number;
        ExpireDate expireDate;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Cvc cvc = null;
        try {
            VkTextFieldView vkTextFieldView = this.b;
            if (vkTextFieldView == null) {
                vkTextFieldView = null;
            }
            number = new Number(vkTextFieldView.getValueWithoutSpaces());
        } catch (Exception unused) {
            linkedHashSet.add(CardField.NUMBER);
            number = null;
        }
        try {
            Regex regex = ExpireDate.b;
            VkTextFieldView vkTextFieldView2 = this.c;
            if (vkTextFieldView2 == null) {
                vkTextFieldView2 = null;
            }
            expireDate = ExpireDate.a.a(vkTextFieldView2.getValueWithoutSpaces());
        } catch (Exception unused2) {
            linkedHashSet.add(CardField.EXPIRE_DATE);
            expireDate = null;
        }
        try {
            VkTextFieldView vkTextFieldView3 = this.d;
            if (vkTextFieldView3 == null) {
                vkTextFieldView3 = null;
            }
            cvc = new Cvc(vkTextFieldView3.getValueWithoutSpaces());
        } catch (Exception unused3) {
            linkedHashSet.add(CardField.CVC);
        }
        return linkedHashSet.isEmpty() ? new b.a(new Card(number, expireDate, cvc)) : new b.c(linkedHashSet);
    }

    public final void setCardData(Card card) {
        String str;
        String str2;
        Cvc i;
        String d;
        ExpireDate j;
        Number k;
        VkTextFieldView vkTextFieldView = this.b;
        if (vkTextFieldView == null) {
            vkTextFieldView = null;
        }
        String str3 = "";
        if (card == null || (k = card.k()) == null || (str = k.d()) == null) {
            str = "";
        }
        vkTextFieldView.setValue(str);
        VkTextFieldView vkTextFieldView2 = this.c;
        if (vkTextFieldView2 == null) {
            vkTextFieldView2 = null;
        }
        if (card == null || (j = card.j()) == null || (str2 = j.toString()) == null) {
            str2 = "";
        }
        vkTextFieldView2.setValue(str2);
        VkTextFieldView vkTextFieldView3 = this.d;
        VkTextFieldView vkTextFieldView4 = vkTextFieldView3 != null ? vkTextFieldView3 : null;
        if (card != null && (i = card.i()) != null && (d = i.d()) != null) {
            str3 = d;
        }
        vkTextFieldView4.setValue(str3);
    }

    public final void setCardInfoChangeListener(izs<? super b, s3q0> izsVar) {
        this.f = izsVar;
    }

    public final void setCvcIconClickListener(izs<? super View, s3q0> izsVar) {
        this.e = izsVar;
    }
}
