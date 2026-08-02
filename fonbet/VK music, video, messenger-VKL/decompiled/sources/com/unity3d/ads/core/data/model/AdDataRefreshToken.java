package com.unity3d.ads.core.data.model;

import xsna.air;
import xsna.epx;
import xsna.vby;

/* compiled from: AdContext.kt */
@vby
/* loaded from: classes14.dex */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m50boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m52equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && epx.f(str, ((AdDataRefreshToken) obj).m56unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m53equalsimpl0(String str, String str2) {
        return epx.f(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m54hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m55toStringimpl(String str) {
        return air.b(')', "AdDataRefreshToken(data=", str);
    }

    public boolean equals(Object obj) {
        return m52equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m54hashCodeimpl(this.data);
    }

    public String toString() {
        return m55toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m56unboximpl() {
        return this.data;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m51constructorimpl(String str) {
        return str;
    }
}
