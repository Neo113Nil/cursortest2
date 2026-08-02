package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ t(v vVar, int i) {
        this.a = i;
        this.b = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        v vVar = this.b;
        switch (i) {
            case 0:
                Function0<Unit> onDisplayed = vVar.getOnDisplayed();
                if (onDisplayed != null) {
                    onDisplayed.invoke();
                }
                break;
            default:
                Function0<Unit> onClick = vVar.getOnClick();
                if (onClick != null) {
                    onClick.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
