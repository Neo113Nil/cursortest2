package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import defpackage.d7a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e {
    public final Context a;

    public e(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            default:
                this.a = context;
                break;
        }
    }

    public String a(String str) {
        InputStream open = this.a.getAssets().open(str);
        open.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192);
        try {
            String E = d7a.E(bufferedReader);
            bufferedReader.close();
            return E;
        } finally {
        }
    }
}
