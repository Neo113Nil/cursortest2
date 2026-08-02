package com.vk.auth.main;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bpn0;
import xsna.epx;
import xsna.g3j;
import xsna.gz80;
import xsna.ihg;
import xsna.jhg;
import xsna.ug9;
import xsna.zrp;

/* compiled from: VkClientLibverifyInfo.kt */
/* loaded from: classes.dex */
public final class VkClientLibverifyInfo {
    public final ug9 a;
    public final String[] b;
    public final boolean c = true;
    public final bpn0 d = new bpn0(new ihg(16));
    public final String e = "vk_otp_auth";
    public final bpn0 f = new bpn0(new jhg(this, 10));
    public final String g = "notify_vk_verification";
    public final String h = "vk_fast_restore";
    public final bpn0 i = new bpn0(new g3j(this, 6));
    public final String j = "odkl_vkc_verification_module";
    public final String k = "vk_cua";
    public String[] l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkClientLibverifyInfo.kt */
    public static final class Service {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Service[] $VALUES;
        public static final Service ACCOUNT;
        public static final Service ODKL_VERIFICATION_MODULE;
        public static final Service OTP_AUTH;
        public static final Service PASSWORDLESS;
        public static final Service REGISTRATION;
        public static final Service RESTORE;
        public static final Service VALIDATION;

        static {
            Service service = new Service("OTP_AUTH", 0);
            OTP_AUTH = service;
            Service service2 = new Service("REGISTRATION", 1);
            REGISTRATION = service2;
            Service service3 = new Service("VALIDATION", 2);
            VALIDATION = service3;
            Service service4 = new Service("RESTORE", 3);
            RESTORE = service4;
            Service service5 = new Service("PASSWORDLESS", 4);
            PASSWORDLESS = service5;
            Service service6 = new Service("ODKL_VERIFICATION_MODULE", 5);
            ODKL_VERIFICATION_MODULE = service6;
            Service service7 = new Service("ACCOUNT", 6);
            ACCOUNT = service7;
            Service[] serviceArr = {service, service2, service3, service4, service5, service6, service7};
            $VALUES = serviceArr;
            $ENTRIES = new asp(serviceArr);
        }

        public Service() {
            throw null;
        }

        public static Service valueOf(String str) {
            return (Service) Enum.valueOf(Service.class, str);
        }

        public static Service[] values() {
            return (Service[]) $VALUES.clone();
        }
    }

    /* compiled from: VkClientLibverifyInfo.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Service.values().length];
            try {
                iArr[Service.OTP_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Service.REGISTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Service.VALIDATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Service.RESTORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Service.PASSWORDLESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Service.ACCOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Service.ODKL_VERIFICATION_MODULE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkClientLibverifyInfo(ug9 ug9Var, String[] strArr) {
        this.a = ug9Var;
        this.b = strArr;
    }

    public final boolean a() {
        return ((Boolean) this.a.invoke()).booleanValue();
    }

    public final String[] b(Context context) {
        String[] strArr = this.l;
        if (strArr != null) {
            return strArr;
        }
        boolean a2 = gz80.a(30);
        String[] strArr2 = this.b;
        if (a2 && context.getApplicationInfo().targetSdkVersion >= 30) {
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            this.l = strArr3;
            return strArr3;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr2) {
            if (!epx.f(str, "android.permission.READ_PHONE_NUMBERS")) {
                arrayList.add(str);
            }
        }
        String[] strArr4 = (String[]) arrayList.toArray(new String[0]);
        this.l = strArr4;
        if (strArr4 == null) {
            return null;
        }
        return strArr4;
    }

    public final String c(Service service) {
        switch (a.$EnumSwitchMapping$0[service.ordinal()]) {
            case 1:
                return this.e;
            case 2:
                return (String) this.f.getValue();
            case 3:
                return this.g;
            case 4:
                return this.h;
            case 5:
                return (String) this.i.getValue();
            case 6:
                return this.k;
            case 7:
                return this.j;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
