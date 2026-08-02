package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Td implements InterfaceC3636no {
    public final C3532jo a;
    public final Pe b;

    public Td(C3532jo c3532jo, Pe pe) {
        c3532jo.getClass();
        pe.getClass();
        this.a = c3532jo;
        this.b = pe;
    }

    @Override // com.inmobi.media.InterfaceC3636no
    public final EnumC3610mo a() {
        boolean z;
        ViewGroup viewGroup = this.b.a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return EnumC3610mo.HIDDEN;
        }
        Pe pe = this.b;
        Te te = pe.e;
        Vn vn = te.b;
        if (vn.a) {
            MediaView mediaView = pe.c;
            if (mediaView != null && vn.b) {
                z = AbstractC3817uo.a(mediaView, vn.c);
            }
            z = false;
        } else {
            Vn vn2 = te.a;
            if (vn2.a) {
                ImageView imageView = pe.b;
                if (imageView != null && vn2.b) {
                    z = AbstractC3817uo.a(imageView, vn2.c);
                }
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            C3532jo c3532jo = this.a;
            if (AbstractC3817uo.a(viewGroup, rect, c3532jo.a, c3532jo.b) && AbstractC3817uo.a(viewGroup, rect, this.a.a, this.b.d)) {
                return EnumC3610mo.VISIBLE;
            }
        }
        return EnumC3610mo.HIDDEN;
    }
}
