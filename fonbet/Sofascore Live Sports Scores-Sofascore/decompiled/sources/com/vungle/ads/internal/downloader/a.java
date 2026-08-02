package com.vungle.ads.internal.downloader;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a {
    public static boolean a(b bVar) {
        bVar.getClass();
        if (bVar.b() != 1) {
            return false;
        }
        int c = bVar.c();
        if (c != -1 && c != 408 && c != 500) {
            switch (c) {
                case 502:
                case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                case PglCryptUtils.BASE64_FAILED /* 504 */:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
