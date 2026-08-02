package com.vungle.ads.internal.network.converters;

import com.vungle.ads.internal.network.j;
import defpackage.by9;
import defpackage.cga;
import defpackage.ehi;
import defpackage.eml;
import defpackage.eof;
import defpackage.ro2;
import defpackage.sha;
import defpackage.wp2;
import defpackage.yea;
import java.io.InputStream;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d implements a {
    public static final yea b = cga.c(c.a);
    public final KType a;

    public d(KType kType) {
        kType.getClass();
        this.a = kType;
    }

    @Override // com.vungle.ads.internal.network.converters.a
    public final Object a(j jVar) {
        try {
            InputStream byteStream = jVar.byteStream();
            if (byteStream == null) {
                jVar.close();
                return null;
            }
            yea yeaVar = b;
            KSerializer Q = sha.Q(yea.d.b, this.a);
            yeaVar.getClass();
            by9 by9Var = new by9();
            by9Var.a = new wp2(byteStream, Charsets.UTF_8);
            try {
                KSerializer kSerializer = Q;
                eof eofVar = new eof(by9Var, ro2.c.F(16384), yeaVar.a);
                try {
                    Object y = new ehi(yeaVar, eml.c, eofVar, kSerializer.getDescriptor(), null).y(kSerializer);
                    eofVar.q();
                    eofVar.G();
                    by9Var.v();
                    jVar.close();
                    return y;
                } catch (Throwable th) {
                    eofVar.G();
                    throw th;
                }
            } catch (Throwable th2) {
                by9Var.v();
                throw th2;
            }
        } finally {
        }
    }
}
