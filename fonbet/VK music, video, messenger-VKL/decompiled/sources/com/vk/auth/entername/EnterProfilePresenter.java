package com.vk.auth.entername;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteBirthday;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.VkGender;
import com.vk.superapp.multiaccount.api.SimpleDate;
import defpackage.i0;
import defpackage.n;
import defpackage.p;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.EmptySet;
import xsna.agn0;
import xsna.b00;
import xsna.bw;
import xsna.cp0;
import xsna.cw;
import xsna.drm0;
import xsna.e370;
import xsna.eph;
import xsna.epx;
import xsna.ew;
import xsna.g1j;
import xsna.hpp;
import xsna.hr;
import xsna.ifg;
import xsna.iie;
import xsna.izs;
import xsna.jeq0;
import xsna.jpp;
import xsna.mnh0;
import xsna.ngl;
import xsna.p66;
import xsna.pwk;
import xsna.qqe;
import xsna.s3q0;
import xsna.sc;
import xsna.sv;
import xsna.t34;
import xsna.u4e;
import xsna.vdx0;
import xsna.wje;
import xsna.z8f;
import xsna.zxo;

/* compiled from: EnterProfilePresenter.kt */
/* loaded from: classes15.dex */
public final class EnterProfilePresenter extends p66<jpp> implements hpp {
    public com.vk.auth.entername.a A = com.vk.auth.entername.a.f.getSTUB();
    public boolean B;
    public boolean C;
    public boolean D;
    public final b E;
    public Object F;
    public final RequiredNameType x;
    public final boolean y;
    public final boolean z;

    /* compiled from: EnterProfilePresenter.kt */
    public static final class GenderPredictionFail extends IllegalStateException {
    }

    /* compiled from: EnterProfilePresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequiredNameType.values().length];
            try {
                iArr[RequiredNameType.WITHOUT_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequiredNameType.FIRST_AND_LAST_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequiredNameType.FULL_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnterProfilePresenter(Bundle bundle, RequiredNameType requiredNameType, boolean z, boolean z2) {
        this.x = requiredNameType;
        this.y = z;
        this.z = z2;
        this.B = bundle != null ? bundle.getBoolean("genderWasPredicted") : false;
        this.C = bundle != null ? bundle.getBoolean("genderWasSelectedByUser") : false;
        this.D = bundle != null ? bundle.getBoolean("birthdayWasChecked") : false;
        b bVar = new b();
        this.t.b(bVar);
        this.E = bVar;
        this.F = EmptySet.b;
    }

    public final void A0(com.vk.auth.entername.a aVar) {
        B0(aVar);
        jpp jppVar = (jpp) this.a;
        if (jppVar != null) {
            jppVar.fc(this.A);
        }
    }

    public final void B0(com.vk.auth.entername.a aVar) {
        this.A = aVar;
        jpp jppVar = (jpp) this.a;
        if (jppVar != null) {
            jppVar.W0(!y0());
        }
    }

    @Override // xsna.hpp
    public final void a() {
        q T;
        com.vk.auth.entername.a aVar = this.A;
        final String str = aVar.a;
        final String str2 = aVar.b;
        final VkGender vkGender = aVar.d;
        final Uri uri = aVar.e;
        final SimpleDate simpleDate = aVar.c;
        int i = a.$EnumSwitchMapping$0[this.x.ordinal()];
        if (i != 1) {
            if (i == 2) {
                vdx0 vdx0Var = e370.e;
                agn0 w = (vdx0Var != null ? vdx0Var : null).w();
                com.vk.auth.entername.a aVar2 = this.A;
                T = w.a(aVar2.a, aVar2.b);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                vdx0 vdx0Var2 = e370.e;
                T = (vdx0Var2 != null ? vdx0Var2 : null).w().c(this.A.b + ' ' + this.A.a);
            }
        } else {
            T = q.T(Boolean.TRUE);
        }
        b0 a2 = com.vk.registration.funnels.a.a(T);
        p pVar = new p(new u4e(this, 15), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.t.b(mnh0.B(w0(a2.E(pVar, lVar, kVar, kVar).F(new sv(new pwk(this, 8), 27)), true), this.s, new izs() { // from class: xsna.ppp
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Triple triple;
                EnterProfilePresenter enterProfilePresenter = EnterProfilePresenter.this;
                enterProfilePresenter.E.e();
                if (enterProfilePresenter.B) {
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SEX_DETECTED, null, null, null, null, null, null, 254);
                    enterProfilePresenter.e.i(AuthStatSender.Screen.NAME);
                }
                int i2 = EnterProfilePresenter.a.$EnumSwitchMapping$0[enterProfilePresenter.x.ordinal()];
                if (i2 != 1) {
                    String str3 = str;
                    String str4 = str2;
                    if (i2 == 2) {
                        triple = new Triple(null, str3, str4);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        triple = new Triple(v1v.a(' ', str3, str4), null, null);
                    }
                } else {
                    triple = new Triple(null, null, null);
                }
                String str5 = (String) triple.d();
                String str6 = (String) triple.g();
                String str7 = (String) triple.h();
                com.vk.auth.main.e eVar = enterProfilePresenter.o;
                com.vk.auth.main.e eVar2 = eVar != null ? eVar : null;
                p66.c cVar = enterProfilePresenter.w;
                SignUpDataHolder signUpDataHolder = eVar2.b;
                ArrayList arrayList = signUpDataHolder.t;
                if (str5 != null) {
                    signUpDataHolder.k = str5;
                }
                if (str6 != null) {
                    signUpDataHolder.i = str6;
                }
                if (str7 != null) {
                    signUpDataHolder.j = str7;
                }
                signUpDataHolder.l = vkGender;
                signUpDataHolder.h = uri;
                signUpDataHolder.m = simpleDate;
                arrayList.add(SignUpField.NAME);
                arrayList.add(SignUpField.FIRST_LAST_NAME);
                arrayList.add(SignUpField.GENDER);
                arrayList.add(SignUpField.AVATAR);
                arrayList.add(SignUpField.BIRTHDAY);
                eVar2.j(SignUpRouter.DataScreen.NAME, cVar);
                return s3q0.a;
            }
        }, new zxo(this, 2), new ngl(new t34(this, 14), null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)));
    }

    @Override // xsna.hpp
    public final void b0(VkGender vkGender) {
        if (this.B && !this.C && this.A.d != vkGender) {
            AuthStatSender.Screen screen = AuthStatSender.Screen.NAME;
            new GenderPredictionFail();
            this.e.h(screen);
            this.B = false;
        }
        this.C = true;
        A0(com.vk.auth.entername.a.b(this.A, null, null, null, vkGender, null, 23));
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.NAME;
    }

    @Override // xsna.hpp
    public final void m(Fragment fragment) {
        SignUpRouter signUpRouter = this.n;
        if (signUpRouter == null) {
            signUpRouter = null;
        }
        signUpRouter.j(fragment, this.A.e != null);
        this.e.c(AuthStatSender.Screen.NAME, AuthStatSender.Status.DEFAULT, AuthStatSender.Element.AVATAR_BUTTON);
    }

    @Override // xsna.p66, xsna.z55
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 13) {
            return false;
        }
        if (i2 != -1) {
            return true;
        }
        A0(com.vk.auth.entername.a.b(this.A, null, null, null, null, intent != null ? (Uri) intent.getParcelableExtra("output") : null, 15));
        return true;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(jpp jppVar) {
        String str;
        VkGender vkGender;
        VkGender vkGender2;
        SimpleDate simpleDate;
        jpp jppVar2;
        jpp jppVar3;
        jpp jppVar4;
        jpp jppVar5;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        String str3;
        jpp jppVar6 = jppVar;
        super.y0(jppVar6);
        j1 Gb = jppVar6.Gb();
        int i = 20;
        cw cwVar = new cw(new wje(this, 18), i);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        b0 E = Gb.E(cwVar, lVar, kVar, kVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h0(E.y(300L, timeUnit).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ew(new z8f(this, 12), i)));
        int i2 = 23;
        h0(jppVar6.c8().E(new i0(new g1j(this, 6), 19), lVar, kVar, kVar).y(300L, timeUnit).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cp0(new iie(this, 11), i2)));
        h0(jppVar6.Fa().E(new n(new eph(this, 14), 24), lVar, kVar, kVar).y(300L, timeUnit).subscribe(new bw(new ifg(this, 15), i2)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SignUpDataHolder signUpDataHolder = this.p;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel = (signUpDataHolder != null ? signUpDataHolder : null).w;
        String str4 = "";
        String str5 = (signUpIncompleteFieldsModel == null || (str3 = signUpIncompleteFieldsModel.d) == null) ? "" : str3;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel2 = (signUpDataHolder != null ? signUpDataHolder : null).w;
        if (signUpIncompleteFieldsModel2 == null || (str = signUpIncompleteFieldsModel2.e) == null) {
            str = "";
        }
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel3 = (signUpDataHolder != null ? signUpDataHolder : null).w;
        if (signUpIncompleteFieldsModel3 == null || (vkGender = signUpIncompleteFieldsModel3.f) == null) {
            vkGender = VkGender.UNDEFINED;
        }
        VkGender vkGender3 = vkGender;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel4 = signUpDataHolder.w;
        SignUpIncompleteBirthday signUpIncompleteBirthday = signUpIncompleteFieldsModel4 != null ? signUpIncompleteFieldsModel4.b : null;
        int i3 = -1;
        int intValue = (signUpIncompleteBirthday == null || (num3 = signUpIncompleteBirthday.b) == null) ? -1 : num3.intValue();
        int intValue2 = (signUpIncompleteBirthday == null || (num2 = signUpIncompleteBirthday.c) == null) ? -1 : num2.intValue();
        if (signUpIncompleteBirthday != null && (num = signUpIncompleteBirthday.d) != null) {
            i3 = num.intValue();
        }
        SimpleDate simpleDate2 = new SimpleDate(intValue, intValue2, i3);
        SignUpDataHolder signUpDataHolder2 = this.p;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel5 = (signUpDataHolder2 != null ? signUpDataHolder2 : null).w;
        if (signUpIncompleteFieldsModel5 != null && (str2 = signUpIncompleteFieldsModel5.c) != null) {
            str4 = str2;
        }
        boolean z = (signUpDataHolder2 != null ? signUpDataHolder2 : null).u;
        com.vk.auth.entername.a aVar = this.A;
        if (!drm0.N(str5)) {
            aVar = com.vk.auth.entername.a.b(aVar, str5, null, null, null, null, 30);
            if (!z) {
                linkedHashSet.add(EnterProfileContract$FieldTypes.FIRST_NAME);
                s3q0 s3q0Var = s3q0.a;
            }
            if (z && (jppVar5 = (jpp) this.a) != null) {
                jppVar5.yf(EnterProfileContract$FieldTypes.FIRST_NAME);
            }
        }
        com.vk.auth.entername.a aVar2 = aVar;
        if (drm0.N(str)) {
            vkGender2 = vkGender3;
            simpleDate = simpleDate2;
        } else {
            vkGender2 = vkGender3;
            simpleDate = simpleDate2;
            aVar2 = com.vk.auth.entername.a.b(aVar2, null, str, null, null, null, 29);
            if (!z) {
                linkedHashSet.add(EnterProfileContract$FieldTypes.LAST_NAME);
                s3q0 s3q0Var2 = s3q0.a;
            }
            if (z && (jppVar4 = (jpp) this.a) != null) {
                jppVar4.yf(EnterProfileContract$FieldTypes.LAST_NAME);
            }
        }
        if (vkGender2 != VkGender.UNDEFINED) {
            aVar2 = com.vk.auth.entername.a.b(aVar2, null, null, null, vkGender2, null, 23);
            if (!z) {
                linkedHashSet.add(EnterProfileContract$FieldTypes.GENDER);
                s3q0 s3q0Var3 = s3q0.a;
            }
            if (z && (jppVar3 = (jpp) this.a) != null) {
                jppVar3.yf(EnterProfileContract$FieldTypes.GENDER);
            }
        }
        com.vk.auth.entername.a aVar3 = aVar2;
        if (!simpleDate.equals(SimpleDate.e.getSTUB())) {
            aVar3 = com.vk.auth.entername.a.b(aVar3, null, null, simpleDate, null, null, 27);
            if (!z) {
                linkedHashSet.add(EnterProfileContract$FieldTypes.BIRTHDAY);
                s3q0 s3q0Var4 = s3q0.a;
            }
            if (z && (jppVar2 = (jpp) this.a) != null) {
                jppVar2.yf(EnterProfileContract$FieldTypes.BIRTHDAY);
            }
        }
        com.vk.auth.entername.a aVar4 = aVar3;
        if (!drm0.N(str4)) {
            aVar4 = com.vk.auth.entername.a.b(aVar4, null, null, null, null, jeq0.g(str4), 15);
        }
        A0(aVar4);
        jpp jppVar7 = (jpp) this.a;
        if (jppVar7 != null) {
            jppVar7.hn(aVar4.c);
        }
        jpp jppVar8 = (jpp) this.a;
        if (jppVar8 != null) {
            jppVar8.Tb(linkedHashSet);
        }
        this.F = linkedHashSet;
        jppVar6.W0(!y0());
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putBoolean("genderWasPredicted", this.B);
        bundle.putBoolean("genderWasSelectedByUser", this.C);
        bundle.putBoolean("birthdayWasChecked", this.D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0059, code lost:
    
        if (r1 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y0() {
        boolean z;
        boolean contains = this.F.contains(EnterProfileContract$FieldTypes.FIRST_NAME);
        boolean contains2 = this.F.contains(EnterProfileContract$FieldTypes.LAST_NAME);
        boolean contains3 = this.F.contains(EnterProfileContract$FieldTypes.BIRTHDAY);
        int i = a.$EnumSwitchMapping$0[this.x.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (drm0.N(this.A.a)) {
                }
                if (drm0.N(this.A.b)) {
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (drm0.N(this.A.a)) {
                }
            }
            return !z && (this.y || this.A.d != VkGender.UNDEFINED) && (this.z || ((!epx.f(this.A.c, SimpleDate.e.getSTUB()) && this.D) || contains3));
        }
        z = true;
        if (z) {
        }
    }

    public final void z0() {
        com.vk.auth.entername.a aVar = this.A;
        String str = aVar.a;
        String str2 = aVar.b;
        boolean z = false;
        boolean z2 = str.length() > 0 || str2.length() > 0;
        if (this.y && !this.C) {
            z = true;
        }
        RequiredNameType requiredNameType = this.x;
        if (z && !z2 && requiredNameType != RequiredNameType.WITHOUT_NAME) {
            this.B = true;
            A0(com.vk.auth.entername.a.b(this.A, null, null, null, VkGender.UNDEFINED, null, 23));
        } else {
            if (!z || requiredNameType == RequiredNameType.WITHOUT_NAME) {
                return;
            }
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            this.E.b(new p1(com.vk.registration.funnels.a.a(vdx0Var.w().b(str, str2)), new hr(new sc(22))).subscribe(new b00(new qqe(this, 15), 24)));
        }
    }
}
