package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import defpackage.aeh;
import defpackage.dh;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class d extends dh implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                MraidActivity mraidActivity = (MraidActivity) this.receiver;
                aeh aehVar = MraidActivity.h;
                mraidActivity.k((w) obj);
                break;
            default:
                FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) this.receiver;
                WeakReference weakReference = FullscreenWebviewActivity.j;
                fullscreenWebviewActivity.p((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b) obj);
                break;
        }
        return Unit.a;
    }
}
