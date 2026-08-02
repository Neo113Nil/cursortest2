package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import com.ironsource.Ua;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.hpo;
import defpackage.jbd;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.md4;
import defpackage.nad;
import defpackage.up3;
import defpackage.zm3;
import defpackage.zy0;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k implements e {
    public final l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str, byte[] bArr, up3 up3Var, String str2) {
        str.getClass();
        bArr.getClass();
        up3Var.getClass();
        if (f1.r(str)) {
            try {
                Pair[] pairArr = {new Pair("url", str), new Pair("body", bArr), new Pair("contentType", up3Var.toString()), new Pair("contentEncoding", str2)};
                hpo hpoVar = new hpo(18);
                for (int i = 0; i < 4; i++) {
                    Pair pair = pairArr[i];
                    hpoVar.B(pair.b, (String) pair.a);
                }
                md4 l = hpoVar.l();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to ".concat(str), null, false, 12, null);
                ktd ktdVar = new ktd(UrlPostRequestWorker.class);
                jbd jbdVar = jbd.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ktdVar.c.j = new zm3(new nad(null), jbd.b, false, false, false, false, -1L, -1L, CollectionsKt.W0(linkedHashSet));
                this.a.a.a((ltd) ((ktd) ((ktd) ktdVar.d(zy0.b, Ua.s, TimeUnit.MILLISECONDS)).f(l)).a()).getClass();
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Failed to enqueue persistent request for url: ".concat(str), e, false, 8, null);
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public final void a(String str) {
        md4 md4Var;
        str.getClass();
        if (f1.r(str)) {
            try {
                Pair[] pairArr = {new Pair("url", str)};
                hpo hpoVar = new hpo(18);
                Pair pair = pairArr[0];
                hpoVar.B(pair.b, (String) pair.a);
                md4Var = hpoVar.l();
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", e.getMessage() + ". Url: " + str, null, false, 12, null);
                md4Var = null;
            }
            if (md4Var == null) {
                return;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", "Enqueuing request to ".concat(str), null, false, 12, null);
            ktd ktdVar = new ktd(UrlGetRequestWorker.class);
            jbd jbdVar = jbd.a;
            ktdVar.c.j = new zm3(new nad(null), jbd.b, false, false, false, false, -1L, -1L, CollectionsKt.W0(new LinkedHashSet()));
            this.a.a.a((ltd) ((ktd) ((ktd) ktdVar.d(zy0.b, Ua.s, TimeUnit.MILLISECONDS)).f(md4Var)).a()).getClass();
        }
    }
}
