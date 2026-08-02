package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.R;
import defpackage.d7a;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Bf extends hoi implements Function2 {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Bf(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Bf(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Df df = Df.a;
        Context context = this.a;
        Gf gf = Df.c;
        if (gf == null) {
            gf = new Gf(context);
            Df.c = gf;
        }
        String a = gf.a.a("omid_js_string");
        if (a != null) {
            return a;
        }
        Context context2 = this.a;
        int i = R.raw.inmobi_omid_js;
        context2.getClass();
        try {
            InputStream openRawResource = context2.getResources().openRawResource(i);
            openRawResource.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), 8192);
            try {
                String E = d7a.E(bufferedReader);
                bufferedReader.close();
                return E;
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }
}
