package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3780td implements InterfaceC3636no {
    public final C3532jo a;
    public final Pe b;

    public C3780td(C3532jo c3532jo, Pe pe) {
        c3532jo.getClass();
        pe.getClass();
        this.a = c3532jo;
        this.b = pe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (((r2 == null || !r4.b) ? false : com.inmobi.media.AbstractC3817uo.a(r2, r4.c)) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r6 != false) goto L29;
     */
    @Override // com.inmobi.media.InterfaceC3636no
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC3610mo a() {
        ViewGroup viewGroup = this.b.a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC3610mo.HIDDEN;
        }
        Pe pe = this.b;
        Te te = pe.e;
        if (te.b.a || te.a.a) {
            Vn vn = te.a;
            ImageView imageView = pe.b;
            boolean z = false;
            if (vn.a) {
            }
            Vn vn2 = te.b;
            MediaView mediaView = this.b.c;
            if (vn2.a) {
                if (mediaView != null && vn2.b) {
                    z = AbstractC3817uo.a(mediaView, vn2.c);
                }
            }
            return EnumC3610mo.HIDDEN;
        }
        C3532jo c3532jo = this.a;
        if (AbstractC3817uo.a(viewGroup, rect, c3532jo.a, c3532jo.b) && AbstractC3817uo.a(viewGroup, rect, this.a.a, this.b.d)) {
            return EnumC3610mo.VISIBLE;
        }
        return EnumC3610mo.HIDDEN;
    }
}
