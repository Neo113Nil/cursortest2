package com.unity3d.ads.core.data.model;

import xsna.air;
import xsna.epx;
import xsna.vby;

/* compiled from: GatewayUrl.kt */
@vby
/* loaded from: classes14.dex */
public final class GatewayUrl {
    private final String url;

    private /* synthetic */ GatewayUrl(String str) {
        this.url = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GatewayUrl m57boximpl(String str) {
        return new GatewayUrl(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m59equalsimpl(String str, Object obj) {
        return (obj instanceof GatewayUrl) && epx.f(str, ((GatewayUrl) obj).m63unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m60equalsimpl0(String str, String str2) {
        return epx.f(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m61hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m62toStringimpl(String str) {
        return air.b(')', "GatewayUrl(url=", str);
    }

    public boolean equals(Object obj) {
        return m59equalsimpl(this.url, obj);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return m61hashCodeimpl(this.url);
    }

    public String toString() {
        return m62toStringimpl(this.url);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m63unboximpl() {
        return this.url;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m58constructorimpl(String str) {
        return str;
    }
}
