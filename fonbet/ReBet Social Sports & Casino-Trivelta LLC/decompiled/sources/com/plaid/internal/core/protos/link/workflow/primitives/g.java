package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum g implements Internal.EnumLite {
    CLIENT_TYPE_UNKNOWN(0),
    CLIENT_TYPE_ANDROID(1),
    CLIENT_TYPE_IOS(2),
    CLIENT_TYPE_WEB(3),
    CLIENT_TYPE_REACTNATIVEANDROID(4),
    CLIENT_TYPE_REACTNATIVEIOS(5),
    CLIENT_TYPE_LINK_WEB_SDK(6),
    CLIENT_TYPE_FLUTTERIOS(7),
    CLIENT_TYPE_FLUTTERANDROID(8),
    CLIENT_TYPE_HOSTED_LINK(9),
    UNRECOGNIZED(-1);

    public static final int CLIENT_TYPE_ANDROID_VALUE = 1;
    public static final int CLIENT_TYPE_FLUTTERANDROID_VALUE = 8;
    public static final int CLIENT_TYPE_FLUTTERIOS_VALUE = 7;
    public static final int CLIENT_TYPE_HOSTED_LINK_VALUE = 9;
    public static final int CLIENT_TYPE_IOS_VALUE = 2;
    public static final int CLIENT_TYPE_LINK_WEB_SDK_VALUE = 6;
    public static final int CLIENT_TYPE_REACTNATIVEANDROID_VALUE = 4;
    public static final int CLIENT_TYPE_REACTNATIVEIOS_VALUE = 5;
    public static final int CLIENT_TYPE_UNKNOWN_VALUE = 0;
    public static final int CLIENT_TYPE_WEB_VALUE = 3;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40504b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40506a;

    public class a implements Internal.EnumLiteMap<g> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final g findValueByNumber(int i10) {
            return g.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40507a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return g.forNumber(i10) != null;
        }
    }

    g(int i10) {
        this.f40506a = i10;
    }

    public static g forNumber(int i10) {
        switch (i10) {
            case 0:
                return CLIENT_TYPE_UNKNOWN;
            case 1:
                return CLIENT_TYPE_ANDROID;
            case 2:
                return CLIENT_TYPE_IOS;
            case 3:
                return CLIENT_TYPE_WEB;
            case 4:
                return CLIENT_TYPE_REACTNATIVEANDROID;
            case 5:
                return CLIENT_TYPE_REACTNATIVEIOS;
            case 6:
                return CLIENT_TYPE_LINK_WEB_SDK;
            case 7:
                return CLIENT_TYPE_FLUTTERIOS;
            case 8:
                return CLIENT_TYPE_FLUTTERANDROID;
            case 9:
                return CLIENT_TYPE_HOSTED_LINK;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<g> internalGetValueMap() {
        return f40504b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40507a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40506a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static g valueOf(int i10) {
        return forNumber(i10);
    }
}
