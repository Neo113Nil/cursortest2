package com.unity3d.ads.core.data.model;

import xsna.air;
import xsna.epx;
import xsna.vby;

/* compiled from: AdContext.kt */
@vby
/* loaded from: classes14.dex */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m64boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m66equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && epx.f(str, ((ImpressionConfig) obj).m70unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m67equalsimpl0(String str, String str2) {
        return epx.f(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m68hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m69toStringimpl(String str) {
        return air.b(')', "ImpressionConfig(data=", str);
    }

    public boolean equals(Object obj) {
        return m66equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m68hashCodeimpl(this.data);
    }

    public String toString() {
        return m69toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m70unboximpl() {
        return this.data;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m65constructorimpl(String str) {
        return str;
    }
}
