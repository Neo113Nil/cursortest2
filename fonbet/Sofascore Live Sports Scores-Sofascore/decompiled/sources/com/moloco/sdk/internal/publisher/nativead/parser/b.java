package com.moloco.sdk.internal.publisher.nativead.parser;

import android.content.Context;
import android.os.Looper;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import defpackage.qx9;
import defpackage.ug6;
import defpackage.vf6;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return x.b(context);
            default:
                vf6 vf6Var = new vf6(context);
                Looper mainLooper = Looper.getMainLooper();
                qx9.t(!vf6Var.j);
                mainLooper.getClass();
                vf6Var.f = mainLooper;
                qx9.t(!vf6Var.j);
                vf6Var.j = true;
                return new ug6(vf6Var);
        }
    }
}
