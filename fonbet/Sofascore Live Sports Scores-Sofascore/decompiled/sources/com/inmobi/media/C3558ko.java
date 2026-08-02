package com.inmobi.media;

import android.graphics.Rect;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ko, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3558ko implements InterfaceC3636no {
    public final C3532jo a;
    public final C3942zj b;

    public C3558ko(C3532jo c3532jo, C3942zj c3942zj) {
        c3532jo.getClass();
        c3942zj.getClass();
        this.a = c3532jo;
        this.b = c3942zj;
    }

    @Override // com.inmobi.media.InterfaceC3636no
    public final EnumC3610mo a() {
        C3669p5 c3669p5 = this.b.a;
        Rect rect = new Rect();
        if (!c3669p5.getGlobalVisibleRect(rect)) {
            return EnumC3610mo.HIDDEN;
        }
        C3532jo c3532jo = this.a;
        return (AbstractC3817uo.a(c3669p5, rect, c3532jo.a, c3532jo.b) && AbstractC3817uo.a(c3669p5, rect, this.a.a, this.b.b)) ? EnumC3610mo.VISIBLE : EnumC3610mo.HIDDEN;
    }
}
