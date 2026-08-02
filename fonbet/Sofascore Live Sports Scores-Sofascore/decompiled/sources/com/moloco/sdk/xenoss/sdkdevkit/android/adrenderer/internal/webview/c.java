package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import defpackage.f1d;
import defpackage.fdi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1d b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ c(f1d f1dVar, Function0 function0, int i) {
        this.a = i;
        this.b = f1dVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                if (((Boolean) ((fdi) this.b).getValue()).booleanValue()) {
                    this.c.invoke();
                }
                break;
            case 1:
                if (((Boolean) ((fdi) this.b).getValue()).booleanValue()) {
                    this.c.invoke();
                }
                break;
            case 2:
                if (((Boolean) ((fdi) this.b).getValue()).booleanValue()) {
                    this.c.invoke();
                }
                break;
            default:
                if (((Boolean) ((fdi) this.b).getValue()).booleanValue()) {
                    this.c.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
