package com.vk.money.createtransfer.chat;

import com.vk.dto.money.CardTransferMethod;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.money.MoneyTransferMethod;
import com.vk.dto.money.VkPayTransferMethod;
import com.vk.money.createtransfer.people.ReceiverType;
import java.util.List;
import java.util.ListIterator;
import xsna.epx;
import xsna.j5g;

/* compiled from: AutoReceive.kt */
/* loaded from: classes3.dex */
public abstract class a {

    /* compiled from: AutoReceive.kt */
    public static final class b extends a {
        public final MoneyCard a;
        public final CardTransferMethod b;

        public b(MoneyCard moneyCard, CardTransferMethod cardTransferMethod) {
            this.a = moneyCard;
            this.b = cardTransferMethod;
        }

        @Override // com.vk.money.createtransfer.chat.a
        public final int a() {
            List<MoneyReceiverInfo> list;
            MoneyReceiverInfo moneyReceiverInfo;
            CardTransferMethod cardTransferMethod = this.b;
            if (cardTransferMethod == null || (list = cardTransferMethod.g) == null) {
                return 75000;
            }
            ListIterator<MoneyReceiverInfo> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    moneyReceiverInfo = null;
                    break;
                }
                moneyReceiverInfo = listIterator.previous();
                if (moneyReceiverInfo.j == ReceiverType.Card2Card.h()) {
                    break;
                }
            }
            MoneyReceiverInfo moneyReceiverInfo2 = moneyReceiverInfo;
            if (moneyReceiverInfo2 == null) {
                return 75000;
            }
            return moneyReceiverInfo2.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            CardTransferMethod cardTransferMethod = this.b;
            return hashCode + (cardTransferMethod == null ? 0 : cardTransferMethod.hashCode());
        }

        public final String toString() {
            return "Card(selectedCard=" + this.a + ", cardTransferMethod=" + this.b + ')';
        }
    }

    /* compiled from: AutoReceive.kt */
    public static final class c extends a {
        @Override // com.vk.money.createtransfer.chat.a
        public final int a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "VkPay(vkPayTransferMethod=null)";
        }
    }

    public abstract int a();

    /* compiled from: AutoReceive.kt */
    /* renamed from: com.vk.money.createtransfer.chat.a$a, reason: collision with other inner class name */
    public static final class C1281a extends a {
        public final MoneyTransferMethod a;

        public C1281a(VkPayTransferMethod vkPayTransferMethod) {
            this.a = vkPayTransferMethod;
        }

        @Override // com.vk.money.createtransfer.chat.a
        public final int a() {
            List<MoneyReceiverInfo> Ab;
            MoneyReceiverInfo moneyReceiverInfo;
            MoneyTransferMethod moneyTransferMethod = this.a;
            if (moneyTransferMethod == null || (Ab = moneyTransferMethod.Ab()) == null || (moneyReceiverInfo = (MoneyReceiverInfo) j5g.a0(Ab)) == null || !moneyReceiverInfo.i) {
                return 15000;
            }
            return moneyReceiverInfo.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1281a) && epx.f(this.a, ((C1281a) obj).a);
        }

        public final int hashCode() {
            MoneyTransferMethod moneyTransferMethod = this.a;
            if (moneyTransferMethod == null) {
                return 0;
            }
            return moneyTransferMethod.hashCode();
        }

        public final String toString() {
            return "Any(transferMethod=" + this.a + ')';
        }

        public C1281a() {
            this(null);
        }
    }
}
