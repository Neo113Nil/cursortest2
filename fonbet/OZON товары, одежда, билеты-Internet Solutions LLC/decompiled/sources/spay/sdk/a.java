package spay.sdk;

import Lm0.a;
import Sc.s;
import Ve.A0;
import Ve.C2;
import Ve.C4117b5;
import Ve.C4133bl;
import Ve.C4219el;
import Ve.C4220em;
import Ve.C4237fa;
import Ve.C4248fl;
import Ve.C4250fn;
import Ve.C4257g1;
import Ve.C4267gb;
import Ve.C4274gi;
import Ve.C4317i3;
import Ve.C4387kg;
import Ve.C4419lj;
import Ve.C4549q4;
import Ve.C4555qa;
import Ve.C4640t9;
import Ve.C4712vn;
import Ve.C4722w5;
import Ve.C4726w9;
import Ve.C4744x;
import Ve.C4763xi;
import Ve.EnumC4290h5;
import Ve.Fg;
import Ve.InterfaceC4103ak;
import Ve.InterfaceC4678ui;
import Ve.Jb;
import Ve.M0;
import Ve.Nj;
import Ve.Ob;
import Ve.Qc;
import Ve.Rn;
import Ve.Sl;
import Ve.T;
import Ve.T8;
import Ve.Tl;
import Ve.Vl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt;
import spay.sdk.domain.model.response.SPaySdkConfig;
import xe.M;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Vl f98841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4744x f98842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T8 f98843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlin.coroutines.d dVar, C4744x c4744x, Vl vl, T8 t82) {
        super(2, dVar);
        this.f98841a = vl;
        this.f98842b = c4744x;
        this.f98843c = t82;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new a(dVar, this.f98842b, this.f98841a, this.f98843c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Integer w02;
        Integer w03;
        List<String> list;
        Object obj2;
        InterfaceC4678ui interfaceC4678ui;
        int i11 = 2;
        char c11 = 1;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Vl vl = this.f98841a;
        C4744x c4744x = this.f98842b;
        T8 t82 = this.f98843c;
        C4248fl c4248fl = c4744x.f32422k;
        C4712vn c4712vn = (C4712vn) vl;
        SPaySdkConfig config = c4712vn.f32313c;
        if (config == null) {
            throw C4317i3.f31235a;
        }
        c4248fl.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getVersionInfo() != null) {
            c4248fl.f31047a = new Qc();
        }
        C4640t9 c4640t9 = new C4640t9();
        c4640t9.f32094a = true;
        c4248fl.f31048b = c4640t9;
        if (!config.getFeaturesToggle().isEmpty()) {
            LinkedHashMap linkedHashMap = c4248fl.f31050d;
            for (EnumC4290h5 enumC4290h5 : linkedHashMap.keySet()) {
                String str = enumC4290h5.f31167a;
                Iterator<T> it = config.getFeaturesToggle().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    SPaySdkConfig.FeatureToggle featureToggle = (SPaySdkConfig.FeatureToggle) obj2;
                    if (Intrinsics.d(featureToggle != null ? featureToggle.getName() : null, str)) {
                        break;
                    }
                }
                SPaySdkConfig.FeatureToggle featureToggle2 = (SPaySdkConfig.FeatureToggle) obj2;
                if (featureToggle2 != null && featureToggle2.getValue()) {
                    if (Intrinsics.d(str, "refreshToken")) {
                        interfaceC4678ui = new M0();
                    } else if (Intrinsics.d(str, "bnpl")) {
                        interfaceC4678ui = new Ob();
                    } else if (Intrinsics.d(str, "compoundWallet")) {
                        interfaceC4678ui = new C4117b5(1);
                    } else if (Intrinsics.d(str, "cardBalance")) {
                        interfaceC4678ui = new C4133bl();
                    } else if (Intrinsics.d(str, "bnpl")) {
                        interfaceC4678ui = new T(0);
                    } else if (Intrinsics.d(str, "sbp")) {
                        interfaceC4678ui = new T(1);
                    } else if (Intrinsics.d(str, "newCreditCard")) {
                        interfaceC4678ui = new A0();
                    } else if (Intrinsics.d(str, "newDebitCard")) {
                        interfaceC4678ui = new C4257g1(0);
                    } else if (Intrinsics.d(str, "retries")) {
                        interfaceC4678ui = new C2();
                    } else if (Intrinsics.d(str, "spasiboBonuses")) {
                        interfaceC4678ui = new T(2);
                    } else if (Intrinsics.d(str, "spasiboBonusesPayment") ? true : Intrinsics.d(str, "spasiboBonusesPaymentv2")) {
                        InterfaceC4103ak interfaceC4103ak = Intrinsics.d(str, "spasiboBonusesPayment") ? C4419lj.f31533a : Intrinsics.d(str, "spasiboBonusesPaymentv2") ? Nj.f29561a : null;
                        Tl tl2 = c4248fl.f31049c;
                        if (tl2 == null) {
                            tl2 = new Tl();
                            c4248fl.f31049c = tl2;
                        }
                        tl2.a(interfaceC4103ak);
                        interfaceC4678ui = c4248fl.f31049c;
                    } else if (Intrinsics.d(str, "sortListCards")) {
                        interfaceC4678ui = new C4220em();
                    } else if (Intrinsics.d(str, "useCachedCardsList")) {
                        interfaceC4678ui = new C4117b5(0);
                    } else if (Intrinsics.d(str, "ssl")) {
                        interfaceC4678ui = new C4257g1(1);
                    } else if (Intrinsics.d(str, "dynatrace")) {
                        interfaceC4678ui = new C4219el();
                    } else if (Intrinsics.d(str, "clickStream")) {
                        interfaceC4678ui = new C4387kg(0);
                    } else if (Intrinsics.d(str, "localSessionId")) {
                        interfaceC4678ui = new C4555qa();
                    } else if (Intrinsics.d(str, "seamlessAuth")) {
                        interfaceC4678ui = new Fg();
                    } else if (Intrinsics.d(str, BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BALANCE_CHECK_FIELD)) {
                        interfaceC4678ui = new C4722w5();
                    } else if (Intrinsics.d(str, "payBindingV2")) {
                        interfaceC4678ui = new C4722w5();
                    } else if (Intrinsics.d(str, "phoneNumberAuth")) {
                        interfaceC4678ui = new Rn();
                    } else if (Intrinsics.d(str, "appAuth")) {
                        interfaceC4678ui = new C4763xi();
                    } else if (Intrinsics.d(str, "phoneNumberAuthSsl")) {
                        interfaceC4678ui = new C4387kg(1);
                    }
                    linkedHashMap.put(enumC4290h5, interfaceC4678ui);
                }
                interfaceC4678ui = null;
                linkedHashMap.put(enumC4290h5, interfaceC4678ui);
            }
        }
        EnumC4290h5 tag = EnumC4290h5.BNPL;
        C4248fl c4248fl2 = c4744x.f32422k;
        c4248fl2.getClass();
        Intrinsics.checkNotNullParameter(tag, "tag");
        LinkedHashMap linkedHashMap2 = c4248fl2.f31050d;
        InterfaceC4678ui interfaceC4678ui2 = (InterfaceC4678ui) linkedHashMap2.get(tag);
        if (interfaceC4678ui2 != null) {
            SPaySdkInitConfig sPaySdkInitConfig = ((C4726w9) t82).f32350a;
            if (sPaySdkInitConfig == null) {
                throw C4549q4.f31841a;
            }
            interfaceC4678ui2.a(new C4237fa(sPaySdkInitConfig.getEnableBnpl()));
        }
        EnumC4290h5 tag2 = EnumC4290h5.COMPOUND_WALLET;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        InterfaceC4678ui interfaceC4678ui3 = (InterfaceC4678ui) linkedHashMap2.get(tag2);
        if (interfaceC4678ui3 != null) {
            interfaceC4678ui3.a(new C4250fn());
        }
        Qc qc2 = c4248fl2.f31047a;
        if (qc2 != null) {
            SPaySdkConfig sPaySdkConfig = c4712vn.f32313c;
            if (sPaySdkConfig == null) {
                throw C4317i3.f31235a;
            }
            SPaySdkConfig.VersionInfo versionInfo = sPaySdkConfig.getVersionInfo();
            if (versionInfo == null || (list = versionInfo.getDeprecated()) == null) {
                list = K.f71697a;
            }
            qc2.a(new Jb(list));
            SPaySdkConfig sPaySdkConfig2 = c4712vn.f32313c;
            if (sPaySdkConfig2 == null) {
                throw C4317i3.f31235a;
            }
            SPaySdkConfig.VersionInfo versionInfo2 = sPaySdkConfig2.getVersionInfo();
            String active = versionInfo2 != null ? versionInfo2.getActive() : null;
            if (active == null) {
                active = "";
            }
            qc2.a(new C4267gb(active));
        }
        Sl onDebug = Sl.f29990b;
        C4274gi onRelease = new C4274gi(t82, i11);
        Intrinsics.checkNotNullParameter(onDebug, "onDebug");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        boolean booleanValue = ((Boolean) onRelease.invoke()).booleanValue();
        C4640t9 c4640t92 = c4248fl2.f31048b;
        if (c4640t92 != null) {
            c4640t92.f32094a = booleanValue;
        }
        SPaySdkConfig sPaySdkConfig3 = c4712vn.f32313c;
        if (sPaySdkConfig3 == null) {
            throw C4317i3.f31235a;
        }
        String v12 = sPaySdkConfig3.getVersion();
        Intrinsics.checkNotNullParameter(v12, "v1");
        Intrinsics.checkNotNullParameter("3.1.3", "v2");
        List m11 = h.m(v12, new String[]{"."}, 0, 6);
        List m12 = h.m("3.1.3", new String[]{"."}, 0, 6);
        int max = Math.max(m11.size(), m12.size());
        int i12 = 0;
        while (true) {
            if (i12 >= max) {
                c11 = 0;
                break;
            }
            String str2 = (String) C7714v.Q(i12, m11);
            int intValue = (str2 == null || (w03 = h.w0(str2)) == null) ? 0 : w03.intValue();
            String str3 = (String) C7714v.Q(i12, m12);
            int intValue2 = (str3 == null || (w02 = h.w0(str3)) == null) ? 0 : w02.intValue();
            if (intValue < intValue2) {
                c11 = 65535;
                break;
            }
            if (intValue > intValue2) {
                break;
            }
            i12++;
        }
        if (c11 > 0) {
            int i13 = R.string.spay_update_sdk_version_error_message;
            SPaySdkConfig sPaySdkConfig4 = c4712vn.f32313c;
            if (sPaySdkConfig4 == null) {
                throw C4317i3.f31235a;
            }
            String a11 = c4744x.f32428q.a(i13, sPaySdkConfig4.getVersion());
            a.b bVar = Lm0.a.f17149a;
            bVar.b("SPaySdk");
            bVar.e(a11, new Object[0]);
        }
        return Unit.f71690a;
    }
}
