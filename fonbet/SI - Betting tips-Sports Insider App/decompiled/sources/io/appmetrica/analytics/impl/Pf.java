package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.util.DesugarCollections;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Pf {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f12751a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f12752b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f12753c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f12754d;

    static {
        HashMap hashMap = new HashMap();
        Vk vk = Vk.FOREGROUND;
        hashMap.put(vk, 0);
        Vk vk2 = Vk.BACKGROUND;
        hashMap.put(vk2, 1);
        f12751a = DesugarCollections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, vk);
        sparseArray.put(1, vk2);
        f12752b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_INIT;
        hashMap2.put(enumC0047bb, 1);
        EnumC0047bb enumC0047bb2 = EnumC0047bb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0047bb2, 4);
        EnumC0047bb enumC0047bb3 = EnumC0047bb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0047bb3, 5);
        EnumC0047bb enumC0047bb4 = EnumC0047bb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0047bb4, 7);
        EnumC0047bb enumC0047bb5 = EnumC0047bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0047bb5, 26);
        EnumC0047bb enumC0047bb6 = EnumC0047bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0047bb6, 26);
        EnumC0047bb enumC0047bb7 = EnumC0047bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0047bb7, 26);
        EnumC0047bb enumC0047bb8 = EnumC0047bb.EVENT_TYPE_ANR;
        hashMap2.put(enumC0047bb8, 25);
        EnumC0047bb enumC0047bb9 = EnumC0047bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0047bb9, 26);
        EnumC0047bb enumC0047bb10 = EnumC0047bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0047bb10, 26);
        EnumC0047bb enumC0047bb11 = EnumC0047bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0047bb11, 27);
        EnumC0047bb enumC0047bb12 = EnumC0047bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0047bb12, 27);
        EnumC0047bb enumC0047bb13 = EnumC0047bb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0047bb13, 13);
        EnumC0047bb enumC0047bb14 = EnumC0047bb.EVENT_TYPE_START;
        hashMap2.put(enumC0047bb14, 2);
        EnumC0047bb enumC0047bb15 = EnumC0047bb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0047bb15, 16);
        EnumC0047bb enumC0047bb16 = EnumC0047bb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0047bb16, 17);
        EnumC0047bb enumC0047bb17 = EnumC0047bb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0047bb17, 18);
        EnumC0047bb enumC0047bb18 = EnumC0047bb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0047bb18, 19);
        EnumC0047bb enumC0047bb19 = EnumC0047bb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0047bb19, 20);
        EnumC0047bb enumC0047bb20 = EnumC0047bb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0047bb20, 21);
        EnumC0047bb enumC0047bb21 = EnumC0047bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0047bb21, 40);
        EnumC0047bb enumC0047bb22 = EnumC0047bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0047bb22, 35);
        hashMap2.put(EnumC0047bb.EVENT_TYPE_CLEANUP, 29);
        EnumC0047bb enumC0047bb23 = EnumC0047bb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0047bb23, 38);
        EnumC0047bb enumC0047bb24 = EnumC0047bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0047bb24, 42);
        f12753c = DesugarCollections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C0575w8 c0575w8 = new C0575w8();
        C8 c8 = new C8(new H8());
        C0600x8 c0600x8 = new C0600x8();
        C0065c3 c0065c3 = new C0065c3(new H8());
        Pn pn = new Pn(new H8());
        Lf lf2 = new Lf();
        T8 a7 = U8.a();
        a7.f12908b = lf2;
        a7.f12909c = lf2;
        U8 u82 = new U8(a7);
        T8 a10 = U8.a();
        a10.f12908b = c8;
        U8 u83 = new U8(a10);
        T8 a11 = U8.a();
        a11.f12908b = c0065c3;
        U8 u84 = new U8(a11);
        T8 a12 = U8.a();
        a12.f12908b = pn;
        U8 u85 = new U8(a12);
        T8 a13 = U8.a();
        a13.f12907a = c0575w8;
        U8 u86 = new U8(a13);
        T8 a14 = U8.a();
        a14.f12908b = new uo(new C8());
        U8 u87 = new U8(a14);
        hashMap3.put(enumC0047bb2, u83);
        T8 a15 = U8.a();
        a15.f12908b = new Nf();
        hashMap3.put(enumC0047bb3, new U8(a15));
        T8 a16 = U8.a();
        a16.f12907a = c0575w8;
        a16.f12908b = c0600x8;
        a16.f12911e = new W7();
        a16.f12912f = new X7();
        hashMap3.put(enumC0047bb4, new U8(a16));
        hashMap3.put(enumC0047bb9, u82);
        hashMap3.put(enumC0047bb10, u82);
        hashMap3.put(enumC0047bb11, u84);
        hashMap3.put(enumC0047bb12, u84);
        hashMap3.put(enumC0047bb5, u84);
        hashMap3.put(enumC0047bb6, u84);
        hashMap3.put(enumC0047bb7, u84);
        hashMap3.put(enumC0047bb8, u84);
        T8 a17 = U8.a();
        a17.f12907a = new C0575w8();
        a17.f12908b = c0065c3;
        hashMap3.put(enumC0047bb14, new U8(a17));
        EnumC0047bb enumC0047bb25 = EnumC0047bb.EVENT_TYPE_CUSTOM_EVENT;
        T8 a18 = U8.a();
        a18.f12910d = new Of();
        hashMap3.put(enumC0047bb25, new U8(a18));
        hashMap3.put(enumC0047bb15, u83);
        hashMap3.put(enumC0047bb17, u86);
        hashMap3.put(enumC0047bb18, u86);
        hashMap3.put(enumC0047bb19, u84);
        hashMap3.put(enumC0047bb20, u84);
        hashMap3.put(enumC0047bb21, u84);
        hashMap3.put(enumC0047bb22, u85);
        hashMap3.put(enumC0047bb, u87);
        hashMap3.put(enumC0047bb16, u87);
        hashMap3.put(enumC0047bb13, u83);
        hashMap3.put(enumC0047bb23, u83);
        hashMap3.put(enumC0047bb24, u84);
        f12754d = DesugarCollections.unmodifiableMap(hashMap3);
    }

    public static C0226i9 a(Long l6, Long l10, Boolean bool) {
        C0226i9 c0226i9 = new C0226i9();
        if (l6 != null) {
            c0226i9.f13935a = l6.longValue();
            c0226i9.f13936b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l6.longValue() * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l10 != null) {
            c0226i9.f13937c = l10.longValue();
        }
        if (bool != null) {
            c0226i9.f13938d = bool.booleanValue();
        }
        return c0226i9;
    }

    public static void a(C0174g9 c0174g9) {
        C0122e9[] c0122e9Arr = c0174g9.f13826c;
        if (c0122e9Arr != null) {
            for (C0122e9 c0122e9 : c0122e9Arr) {
            }
        }
    }
}
