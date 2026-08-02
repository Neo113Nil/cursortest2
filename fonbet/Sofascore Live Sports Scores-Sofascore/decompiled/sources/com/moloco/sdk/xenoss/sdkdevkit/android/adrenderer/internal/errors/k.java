package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k implements c {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;
    public static final /* synthetic */ k[] G;
    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    public static final k r;
    public static final k s;
    public static final k t;
    public static final k u;
    public static final k v;
    public static final k w;
    public static final k x;
    public static final k y;
    public static final k z;

    static {
        k kVar = new k("VAST_AD_LOAD_INCOMPLETE_ERROR", 0);
        a = kVar;
        k kVar2 = new k("VAST_AD_LOAD_XML_PARSE_ERROR", 1);
        b = kVar2;
        k kVar3 = new k("VAST_AD_LOAD_NO_XML_TAG_ERROR", 2);
        c = kVar3;
        k kVar4 = new k("VAST_AD_LOAD_NO_ADS_ERROR", 3);
        d = kVar4;
        k kVar5 = new k("VAST_AD_LOAD_WRAPPER_LIMIT_ERROR", 4);
        e = kVar5;
        k kVar6 = new k("VAST_AD_LOAD_WRAPPER_TIMEOUT_ERROR", 5);
        f = kVar6;
        k kVar7 = new k("VAST_AD_LOAD_WRAPPER_FETCH_ERROR", 6);
        g = kVar7;
        k kVar8 = new k("VAST_AD_LOAD_INLINE_CREATIVES_EMPTY_ERROR", 7);
        h = kVar8;
        k kVar9 = new k("VAST_AD_LOAD_INLINE_CREATIVES_NO_LINEAR_ERROR", 8);
        i = kVar9;
        k kVar10 = new k("VAST_AD_LOAD_LINEAR_NOT_SUPPORTED_MEDIA_ERROR", 9);
        j = kVar10;
        k kVar11 = new k("VAST_AD_LOAD_MEDIA_FILE_CLIENT_HTTP_ERROR", 10);
        k = kVar11;
        k kVar12 = new k("VAST_AD_LOAD_MEDIA_FILE_SERVER_HTTP_ERROR", 11);
        l = kVar12;
        k kVar13 = new k("VAST_AD_LOAD_MEDIA_FILE_NO_NETWORK_HTTP_ERROR", 12);
        m = kVar13;
        k kVar14 = new k("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_HOST_HTTP_ERROR", 13);
        n = kVar14;
        k kVar15 = new k("VAST_AD_LOAD_MEDIA_FILE_SOCKET_HTTP_ERROR", 14);
        o = kVar15;
        k kVar16 = new k("VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_IO_ERROR", 15);
        p = kVar16;
        k kVar17 = new k("VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_SECURITY_ERROR", 16);
        q = kVar17;
        k kVar18 = new k("VAST_AD_LOAD_MEDIA_FILE_HTTP_SSL_ERROR", 17);
        r = kVar18;
        k kVar19 = new k("VAST_AD_LOAD_MEDIA_TMP_FILE_NOT_RENAMED_DISK_ERROR", 18);
        s = kVar19;
        k kVar20 = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_DISK_ERROR", 19);
        t = kVar20;
        k kVar21 = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_SECURITY_DISK_ERROR", 20);
        u = kVar21;
        k kVar22 = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_IO_DISK_ERROR", 21);
        v = kVar22;
        k kVar23 = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_UNKNOWN_DISK_ERROR", 22);
        w = kVar23;
        k kVar24 = new k("VAST_AD_LOAD_MEDIA_FILE_TIMEOUT_ERROR", 23);
        x = kVar24;
        k kVar25 = new k("VAST_AD_LOAD_MEDIA_FILE_TIMEOUT_NOT_ENOUGH_PLAYABLE_ERROR", 24);
        y = kVar25;
        k kVar26 = new k("VAST_AD_LOAD_MEDIA_FILE_UNABLE_TO_DETERMINE_TIMEOUT_ERROR", 25);
        z = kVar26;
        k kVar27 = new k("VAST_AD_LOAD_MEDIA_NUMBER_PARSE_ERROR", 26);
        A = kVar27;
        k kVar28 = new k("VAST_AD_LOAD_MEDIA_FILE_INVALID_URL_ERROR", 27);
        B = kVar28;
        k kVar29 = new k("VAST_AD_LOAD_MEDIA_FILE_NOT_FOUND_ERROR", 28);
        C = kVar29;
        k kVar30 = new k("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_MEDIA_FETCH_ERROR", 29);
        D = kVar30;
        k kVar31 = new k("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_ERROR", 30);
        E = kVar31;
        k kVar32 = new k("VAST_AD_LOAD_RENDER_AD_LOAD_ERROR", 31);
        F = kVar32;
        G = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24, kVar25, kVar26, kVar27, kVar28, kVar29, kVar30, kVar31, kVar32};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) G.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public final String a() {
        return name();
    }
}
