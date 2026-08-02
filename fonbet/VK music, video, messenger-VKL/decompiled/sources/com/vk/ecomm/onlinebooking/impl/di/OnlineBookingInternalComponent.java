package com.vk.ecomm.onlinebooking.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.movika.sdk.base.flow.binding.g;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ap7;
import xsna.ap80;
import xsna.bp80;
import xsna.cty;
import xsna.ep;
import xsna.ewy;
import xsna.fm20;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.kx7;
import xsna.ldi;
import xsna.lm7;
import xsna.loi0;
import xsna.lq7;
import xsna.ml7;
import xsna.n7w;
import xsna.pd4;
import xsna.qcy;
import xsna.s1x;
import xsna.tzv;
import xsna.u210;
import xsna.umk;
import xsna.xm7;
import xsna.xsw;
import xsna.yo80;
import xsna.yy7;
import xsna.zo80;
import xsna.zq7;
import xsna.zu7;

/* compiled from: OnlineBookingInternalComponent.kt */
/* loaded from: classes18.dex */
public final class OnlineBookingInternalComponent implements DiScopedComponent<bp80> {
    public static final a n;
    public static final /* synthetic */ qcy<Object>[] o;
    public final ewy l;
    public final ewy a = new ewy(new pd4(29));
    public final ewy b = new ewy(new zo80(0));
    public final ewy c = new ewy(new ap80(0));
    public final ewy d = new ewy(new cty(this, 21));
    public final ewy e = new ewy(new n7w(this, 17));
    public final ewy f = new ewy(new xsw(this, 19));
    public final ewy g = new ewy(new fm20(this, 11));
    public final ewy h = new ewy(new ml7(21));
    public final ewy i = new ewy(new u210(this, 11));
    public final ewy j = new ewy(new s1x(this, 19));
    public final ewy k = new ewy(new tzv(this, 20));
    public final ewy m = new ewy(new yo80(0));

    /* compiled from: OnlineBookingInternalComponent.kt */
    public static final class a {
        public static FeatureScopesKt$createFeatureScope$scope$2 a(bp80 bp80Var) {
            return new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, bp80Var, fpf0.a(OnlineBookingInternalComponent.class), new ldi((byte) 0, 6));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(OnlineBookingInternalComponent.class, "bookingService", "getBookingService()Lcom/vk/internal/api/serviceBooking/ServiceBookingService;", 0);
        hpf0 hpf0Var = fpf0.a;
        o = new qcy[]{propertyReference1Impl, fp.c(0, OnlineBookingInternalComponent.class, "servicesService", "getServicesService()Lcom/vk/internal/api/services/ServicesService;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "accountService", "getAccountService()Lcom/vk/internal/api/account/AccountService;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "recordInteractor", "getRecordInteractor$impl_release()Lcom/vk/ecomm/onlinebooking/impl/common/domain/BookingRecordInteractor;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "mastersInteractor", "getMastersInteractor$impl_release()Lcom/vk/ecomm/onlinebooking/impl/masters/domain/BookingMastersInteractor;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "settingsInteractor", "getSettingsInteractor$impl_release()Lcom/vk/ecomm/onlinebooking/impl/main/domain/BookingSettingsInteractor;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "servicesInteractorFactory", "getServicesInteractorFactory$impl_release()Lcom/vk/ecomm/onlinebooking/impl/services/domain/BookingServicesInteractorFactory;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "customCategoryInteractorFactory", "getCustomCategoryInteractorFactory$impl_release()Lcom/vk/ecomm/onlinebooking/impl/services/domain/CustomCategoryInteractorFactory;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "pickerServicesInteractor", "getPickerServicesInteractor$impl_release()Lcom/vk/ecomm/onlinebooking/impl/services/domain/PickerBookingServicesInteractor;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "groupServicesInteractorFactory", "getGroupServicesInteractorFactory$impl_release()Lcom/vk/ecomm/onlinebooking/impl/services/domain/BookingGroupServiceInteractorFactory;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "calendarInteractorFactory", "getCalendarInteractorFactory$impl_release()Lcom/vk/ecomm/onlinebooking/impl/calendar/domain/BookingCalendarInteractorFactory;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "editInteractorFactory", "getEditInteractorFactory$impl_release()Lcom/vk/ecomm/onlinebooking/impl/edit/domain/BookingEditInteractorFactory;", hpf0Var), ep.a(0, OnlineBookingInternalComponent.class, "bookingAnalytics", "getBookingAnalytics$impl_release()Lcom/vk/ecomm/onlinebooking/impl/common/analytics/BookingAnalytics;", hpf0Var)};
        n = new a();
    }

    public OnlineBookingInternalComponent(AuthBridgeComponent authBridgeComponent) {
        this.l = new ewy(new g(18, this, authBridgeComponent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lm7 Df() {
        qcy<Object> qcyVar = o[12];
        return (lm7) this.m.c();
    }

    public final loi0 Ef() {
        qcy<Object> qcyVar = o[0];
        return (loi0) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xm7 Ff() {
        qcy<Object> qcyVar = o[10];
        return (xm7) this.k.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final umk Gf() {
        qcy<Object> qcyVar = o[7];
        return (umk) this.h.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ap7 Hf() {
        qcy<Object> qcyVar = o[11];
        return (ap7) this.l.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lq7 If() {
        qcy<Object> qcyVar = o[9];
        return (lq7) this.j.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zq7 Jf() {
        qcy<Object> qcyVar = o[4];
        return (zq7) this.e.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zu7 Kf() {
        qcy<Object> qcyVar = o[3];
        return (zu7) this.d.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kx7 Lf() {
        qcy<Object> qcyVar = o[6];
        return (kx7) this.g.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yy7 Mf() {
        qcy<Object> qcyVar = o[5];
        return (yy7) this.f.c();
    }
}
