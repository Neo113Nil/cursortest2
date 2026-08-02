package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import defpackage.j8f;
import defpackage.k8f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8f b;

    public /* synthetic */ b(k8f k8fVar, int i) {
        this.a = i;
        this.b = k8fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((j8f) this.b).d((d) obj);
                break;
            default:
                ((j8f) this.b).d((e) obj);
                break;
        }
        return Unit.a;
    }
}
