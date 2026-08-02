package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum u implements Internal.EnumLite {
    TYPE_UNKNOWN(0),
    TYPE_WALLETCONNECT_V1_MOBILE(1),
    TYPE_WALLETCONNECT_V1_DESKTOP(10),
    TYPE_WALLETCONNECT_V1_WEB_APP(14),
    TYPE_WALLETCONNECT_V2_MOBILE(2),
    TYPE_WALLETCONNECT_V2_DESKTOP(12),
    TYPE_WALLETCONNECT_V2_WEB_APP(15),
    TYPE_PLUGIN(3),
    TYPE_COINBASE_WALLET(4),
    TYPE_MOBILE_APP_PLUGIN(5),
    TYPE_MEW_MOBILE_APP(6),
    TYPE_MEW_BROWSER_PLUGIN(7),
    TYPE_TREZOR_CONNECT(8),
    TYPE_TORUS_CONNECT(9),
    TYPE_BITSKI(11),
    TYPE_RAINBOWKIT(13),
    UNRECOGNIZED(-1);

    public static final int TYPE_BITSKI_VALUE = 11;
    public static final int TYPE_COINBASE_WALLET_VALUE = 4;
    public static final int TYPE_MEW_BROWSER_PLUGIN_VALUE = 7;
    public static final int TYPE_MEW_MOBILE_APP_VALUE = 6;
    public static final int TYPE_MOBILE_APP_PLUGIN_VALUE = 5;
    public static final int TYPE_PLUGIN_VALUE = 3;
    public static final int TYPE_RAINBOWKIT_VALUE = 13;
    public static final int TYPE_TORUS_CONNECT_VALUE = 9;
    public static final int TYPE_TREZOR_CONNECT_VALUE = 8;
    public static final int TYPE_UNKNOWN_VALUE = 0;
    public static final int TYPE_WALLETCONNECT_V1_DESKTOP_VALUE = 10;
    public static final int TYPE_WALLETCONNECT_V1_MOBILE_VALUE = 1;
    public static final int TYPE_WALLETCONNECT_V1_WEB_APP_VALUE = 14;
    public static final int TYPE_WALLETCONNECT_V2_DESKTOP_VALUE = 12;
    public static final int TYPE_WALLETCONNECT_V2_MOBILE_VALUE = 2;
    public static final int TYPE_WALLETCONNECT_V2_WEB_APP_VALUE = 15;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40538b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40540a;

    public class a implements Internal.EnumLiteMap<u> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final u findValueByNumber(int i10) {
            return u.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40541a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return u.forNumber(i10) != null;
        }
    }

    u(int i10) {
        this.f40540a = i10;
    }

    public static u forNumber(int i10) {
        switch (i10) {
            case 0:
                return TYPE_UNKNOWN;
            case 1:
                return TYPE_WALLETCONNECT_V1_MOBILE;
            case 2:
                return TYPE_WALLETCONNECT_V2_MOBILE;
            case 3:
                return TYPE_PLUGIN;
            case 4:
                return TYPE_COINBASE_WALLET;
            case 5:
                return TYPE_MOBILE_APP_PLUGIN;
            case 6:
                return TYPE_MEW_MOBILE_APP;
            case 7:
                return TYPE_MEW_BROWSER_PLUGIN;
            case 8:
                return TYPE_TREZOR_CONNECT;
            case 9:
                return TYPE_TORUS_CONNECT;
            case 10:
                return TYPE_WALLETCONNECT_V1_DESKTOP;
            case 11:
                return TYPE_BITSKI;
            case 12:
                return TYPE_WALLETCONNECT_V2_DESKTOP;
            case 13:
                return TYPE_RAINBOWKIT;
            case 14:
                return TYPE_WALLETCONNECT_V1_WEB_APP;
            case 15:
                return TYPE_WALLETCONNECT_V2_WEB_APP;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<u> internalGetValueMap() {
        return f40538b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40541a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40540a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static u valueOf(int i10) {
        return forNumber(i10);
    }
}
