package com.vk.knet.core.http;

import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpProtocol.kt */
/* loaded from: classes2.dex */
public final class HttpProtocol {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HttpProtocol[] $VALUES;
    public static final a Companion;
    public static final HttpProtocol HTTP_1_0;
    public static final HttpProtocol HTTP_1_1;
    public static final HttpProtocol HTTP_2;
    public static final HttpProtocol QUIC;
    public static final HttpProtocol SPDY;

    /* compiled from: HttpProtocol.kt */
    public static final class a {
    }

    /* compiled from: HttpProtocol.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpProtocol.values().length];
            try {
                iArr[HttpProtocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpProtocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpProtocol.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HttpProtocol.SPDY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HttpProtocol.QUIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HttpProtocol httpProtocol = new HttpProtocol("HTTP_1_0", 0);
        HTTP_1_0 = httpProtocol;
        HttpProtocol httpProtocol2 = new HttpProtocol("HTTP_1_1", 1);
        HTTP_1_1 = httpProtocol2;
        HttpProtocol httpProtocol3 = new HttpProtocol("HTTP_2", 2);
        HTTP_2 = httpProtocol3;
        HttpProtocol httpProtocol4 = new HttpProtocol("SPDY", 3);
        SPDY = httpProtocol4;
        HttpProtocol httpProtocol5 = new HttpProtocol("QUIC", 4);
        QUIC = httpProtocol5;
        HttpProtocol[] httpProtocolArr = {httpProtocol, httpProtocol2, httpProtocol3, httpProtocol4, httpProtocol5};
        $VALUES = httpProtocolArr;
        $ENTRIES = new asp(httpProtocolArr);
        Companion = new a();
    }

    public HttpProtocol() {
        throw null;
    }

    public static HttpProtocol valueOf(String str) {
        return (HttpProtocol) Enum.valueOf(HttpProtocol.class, str);
    }

    public static HttpProtocol[] values() {
        return (HttpProtocol[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = b.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "http/1.0";
        }
        if (i == 2) {
            return "http/1.1";
        }
        if (i == 3) {
            return "h2";
        }
        if (i == 4) {
            return "spdy";
        }
        if (i == 5) {
            return "quic";
        }
        throw new NoWhenBranchMatchedException();
    }
}
