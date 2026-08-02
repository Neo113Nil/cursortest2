package com.vk.method.selector.impl;

import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.method.selector.impl.a;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a35;
import xsna.frf0;
import xsna.gzs;
import xsna.hk20;
import xsna.pn00;
import xsna.s3q0;
import xsna.uk20;
import xsna.yj20;

/* compiled from: MethodSelectorStat.kt */
/* loaded from: classes3.dex */
public final class c {
    public com.vk.method.selector.impl.a a = a.c.a;
    public final HashMap<SchemeStatSak$RegistrationFieldItem.Name, TypeAvailability> b;
    public VerificationMethodTypes c;

    /* compiled from: MethodSelectorStat.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationMethodTypes.values().length];
            try {
                iArr[VerificationMethodTypes.CALLRESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationMethodTypes.CODEGEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationMethodTypes.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationMethodTypes.PASSKEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationMethodTypes.PASSWORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VerificationMethodTypes.PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VerificationMethodTypes.RESERVE_CODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VerificationMethodTypes.SMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_OTP_CODE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VerificationMethodTypes.MAX_MESSENGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VerificationMethodTypes.OFFICIAL_MESSENGER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c() {
        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.PASSKEY;
        TypeAvailability typeAvailability = TypeAvailability.GONE;
        this.b = pn00.i(new Pair(name, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.APP, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.ECOSYSTEM_PUSH, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.SMS, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.CALL_RESET, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.EMAIL, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.RESERVE_CODE, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.PASSWORD, typeAvailability), new Pair(SchemeStatSak$RegistrationFieldItem.Name.OFFICIAL_MESSENGER, typeAvailability));
        b(this, new hk20(0, b.a.a, b.a.class, "onProceedToPrimaryFactorChoice", "onProceedToPrimaryFactorChoice()V", 0), 6);
    }

    public static /* synthetic */ void b(c cVar, gzs gzsVar, int i) {
        cVar.a(new ArrayList(), gzsVar, (i & 4) != 0);
    }

    public final void a(ArrayList arrayList, gzs gzsVar, boolean z) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        SchemeStatSak$RegistrationFieldItem.Name name = SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_FLOW;
        bVar.getClass();
        SchemeStatSak$RegistrationFieldItem f = com.vk.registration.funnels.b.f(name);
        if (f != null && z) {
            arrayList.add(f);
        }
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.l(SchemeStatSak$EventScreen.PRIMARY_FACTOR_CHOICE, arrayList);
        com.vk.method.selector.impl.a aVar = this.a;
        if ((aVar instanceof a.b) || (aVar instanceof a.c)) {
            gzsVar.invoke();
            return;
        }
        if (!(aVar instanceof a.AbstractC1275a)) {
            throw new NoWhenBranchMatchedException();
        }
        a.AbstractC1275a abstractC1275a = (a.AbstractC1275a) aVar;
        if (abstractC1275a instanceof a.AbstractC1275a.b) {
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_SMS_ALREADY_SEND, null, null, null, null, null, null, 254);
            return;
        }
        if (abstractC1275a instanceof a.AbstractC1275a.d) {
            return;
        }
        if (abstractC1275a instanceof a.AbstractC1275a.c) {
            com.vk.registration.funnels.b.t(bVar);
        } else if (abstractC1275a instanceof a.AbstractC1275a.C1276a) {
            a35.a(abstractC1275a.a);
        }
    }

    public final void c(gzs<s3q0> gzsVar) {
        com.vk.method.selector.impl.a aVar = this.a;
        if (!(aVar instanceof a.b)) {
            return;
        }
        List<yj20> list = ((a.b) aVar).a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap<SchemeStatSak$RegistrationFieldItem.Name, TypeAvailability> hashMap = this.b;
            if (!hasNext) {
                for (Map.Entry<SchemeStatSak$RegistrationFieldItem.Name, TypeAvailability> entry : hashMap.entrySet()) {
                    arrayList.add(entry.getValue().a(entry.getKey()));
                }
                a(arrayList, gzsVar, false);
                return;
            }
            yj20 yj20Var = (yj20) it.next();
            if (yj20Var instanceof yj20.c.a) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.APP, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.C4105c) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.EMAIL, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.g) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.PASSKEY, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.h) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.PASSWORD, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.i) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.ECOSYSTEM_PUSH, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.j) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.RESERVE_CODE, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.k) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.SMS, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.b) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.CALL_RESET, uk20.a((yj20.c) yj20Var));
            } else if (yj20Var instanceof yj20.c.d) {
                hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.MAX_MESSENGER, uk20.a((yj20.c) yj20Var));
            } else if (!(yj20Var instanceof yj20.b) && !(yj20Var instanceof yj20.a)) {
                if (yj20Var instanceof yj20.c.f) {
                    hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.OFFICIAL_MESSENGER, uk20.a((yj20.c) yj20Var));
                } else {
                    if (!(yj20Var instanceof yj20.c.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashMap.put(SchemeStatSak$RegistrationFieldItem.Name.MAX_CODE, uk20.a((yj20.c) yj20Var));
                }
            }
        }
    }
}
