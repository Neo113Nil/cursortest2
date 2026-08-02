package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import defpackage.aal;
import defpackage.ajj;
import defpackage.bea;
import defpackage.bka;
import defpackage.dsf;
import defpackage.hkg;
import defpackage.hs4;
import defpackage.jof;
import defpackage.k53;
import defpackage.ku3;
import defpackage.pea;
import defpackage.rob;
import defpackage.uci;
import defpackage.un0;
import defpackage.y7k;
import defpackage.y9l;
import defpackage.yso;
import defpackage.z45;
import defpackage.z88;
import defpackage.z9l;
import java.net.URI;
import java.security.MessageDigest;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class i0 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final jof a(int i, ku3 ku3Var, z88 z88Var) {
        dsf dsfVar = new dsf();
        dsfVar.a = i;
        dsf dsfVar2 = new dsf();
        dsfVar2.a = i;
        return un0.K(yso.r(new ajj(dsfVar2, z88Var, dsfVar, null, 14)), ku3Var, new uci(0L, Long.MAX_VALUE), new y7k(i));
    }

    public static final void b(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT < 30) {
            decorView.getClass();
            decorView.setSystemUiVisibility(4102);
            return;
        }
        bea.L(activity.getWindow(), false);
        Window window = activity.getWindow();
        bka bkaVar = new bka(activity.getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
        aalVar.x(519);
        aalVar.D();
    }

    public static final z88 c(z88 z88Var) {
        z88 H = hkg.H(k53.W(z88Var, -1));
        hs4 hs4Var = z45.a;
        return k53.g0(H, rob.a);
    }

    public static final String d(String str) {
        str.getClass();
        URI uri = new URI(str);
        String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        uri2.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        byte[] bytes = uri2.getBytes(Charsets.UTF_8);
        bytes.getClass();
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        digest.getClass();
        digest.getClass();
        char[] cArr = new char[digest.length * 2];
        int length = digest.length;
        for (int i = 0; i < length; i++) {
            byte b = digest[i];
            int i2 = i * 2;
            int i3 = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 4;
            char[] cArr2 = a;
            cArr[i2] = cArr2[i3];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
