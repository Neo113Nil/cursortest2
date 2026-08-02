package com.google.android.gms.internal.ads;

import defpackage.c6h;
import defpackage.rq3;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgcd implements c6h {
    public static final zzgcd a = new zzgcd();
    public static final zzgca b;

    static {
        zzgca G = zzgca.G();
        G.getClass();
        b = G;
    }

    private zzgcd() {
    }

    @Override // defpackage.c6h
    public final /* synthetic */ Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.c6h
    public final Object readFrom(InputStream inputStream, rq3 rq3Var) {
        try {
            return zzgca.F(inputStream);
        } catch (Exception unused) {
            return b;
        }
    }

    @Override // defpackage.c6h
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        ((zzgca) obj).b(outputStream);
        return Unit.a;
    }
}
