package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0576w9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f14825a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f14826b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f14827c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f14828d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f14829e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumSet f14830f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f14831g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f14832h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f14833i;
    public static final List j;

    static {
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0047bb enumC0047bb2 = EnumC0047bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        f14825a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0047bb enumC0047bb3 = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        EnumC0047bb enumC0047bb4 = EnumC0047bb.EVENT_TYPE_PURGE_BUFFER;
        EnumC0047bb enumC0047bb5 = EnumC0047bb.EVENT_TYPE_SEND_REFERRER;
        EnumC0047bb enumC0047bb6 = EnumC0047bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0047bb enumC0047bb7 = EnumC0047bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0047bb enumC0047bb8 = EnumC0047bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0047bb enumC0047bb9 = EnumC0047bb.EVENT_TYPE_SET_SESSION_EXTRA;
        f14826b = EnumSet.of(enumC0047bb3, enumC0047bb4, enumC0047bb5, enumC0047bb6, enumC0047bb7, EnumC0047bb.EVENT_TYPE_ACTIVATION, enumC0047bb8, enumC0047bb2, enumC0047bb9);
        EnumC0047bb enumC0047bb10 = EnumC0047bb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0047bb enumC0047bb11 = EnumC0047bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f14827c = EnumSet.of(enumC0047bb10, enumC0047bb, enumC0047bb2, enumC0047bb8, enumC0047bb11);
        EnumC0047bb enumC0047bb12 = EnumC0047bb.EVENT_TYPE_REGULAR;
        f14828d = EnumSet.of(enumC0047bb, enumC0047bb2, EnumC0047bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC0047bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC0047bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC0047bb11, enumC0047bb8, enumC0047bb12, EnumC0047bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0047bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0047bb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0047bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0047bb4, EnumC0047bb.EVENT_TYPE_INIT, EnumC0047bb.EVENT_TYPE_SEND_USER_PROFILE, EnumC0047bb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0047bb5, enumC0047bb6, enumC0047bb7, EnumC0047bb.EVENT_TYPE_FIRST_ACTIVATION, EnumC0047bb.EVENT_TYPE_START, EnumC0047bb.EVENT_TYPE_APP_OPEN, EnumC0047bb.EVENT_TYPE_APP_UPDATE, EnumC0047bb.EVENT_TYPE_ANR);
        f14829e = EnumSet.of(enumC0047bb12);
        f14830f = EnumSet.of(enumC0047bb12);
        f14831g = EnumSet.of(enumC0047bb8);
        f14832h = EnumSet.of(EnumC0047bb.EVENT_TYPE_ALIVE, enumC0047bb4, enumC0047bb9, enumC0047bb2, enumC0047bb8);
        f14833i = Arrays.asList(0, 6145, 4097, 8224);
        j = Arrays.asList(12290);
    }
}
