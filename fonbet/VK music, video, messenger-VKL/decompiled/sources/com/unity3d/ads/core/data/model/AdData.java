package com.unity3d.ads.core.data.model;

import xsna.air;
import xsna.epx;
import xsna.vby;

/* compiled from: AdContext.kt */
@vby
/* loaded from: classes14.dex */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m43boximpl(String str) {
        return new AdData(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m45equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && epx.f(str, ((AdData) obj).m49unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m46equalsimpl0(String str, String str2) {
        return epx.f(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m47hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m48toStringimpl(String str) {
        return air.b(')', "AdData(data=", str);
    }

    public boolean equals(Object obj) {
        return m45equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m47hashCodeimpl(this.data);
    }

    public String toString() {
        return m48toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m49unboximpl() {
        return this.data;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m44constructorimpl(String str) {
        return str;
    }
}
