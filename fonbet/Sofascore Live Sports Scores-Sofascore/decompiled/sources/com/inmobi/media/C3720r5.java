package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.C3720r5;
import defpackage.joa;
import defpackage.lnb;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.r5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3720r5 extends ImageView {
    public final byte a;
    public final InterfaceC3880x9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3720r5(Context context, byte b, InterfaceC3880x9 interfaceC3880x9) {
        super(context);
        Integer a;
        context.getClass();
        this.a = b;
        this.b = interfaceC3880x9;
        int i = b == 0 ? 15 : (b == 2 || b == 3 || b == 4 || b == 5 || b == 6) ? 30 : 0;
        try {
            a = a(b);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (a == null) {
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).b("CustomView", "null drawable id while creating button - " + ((int) b));
                    return;
                }
                return;
            }
            a(a.intValue(), i, i, i, i);
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).c("CustomView", "new customView - " + ((int) b) + " created");
            }
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("CustomView", "exception while building customView", exc);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(exc);
        }
    }

    public static Integer a(byte b) {
        if (b == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    public final void a(int i, final int i2, final int i3, final int i4, final int i5) {
        F5.a.getClass();
        if (F5.y()) {
            Icon.createWithResource(getContext(), i).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: cvm
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C3720r5.a(C3720r5.this, i2, i3, i4, i5, drawable);
                }
            }, ((ExecutorC3520jc) AbstractC3851w6.e.getValue()).a);
        } else {
            xw3.L(L9.d, null, null, new C3695q5(this, i, i2, i3, i4, i5, null), 3);
        }
    }

    public static final void a(C3720r5 c3720r5, int i, int i2, int i3, int i4, Drawable drawable) {
        if (drawable == null) {
            InterfaceC3880x9 interfaceC3880x9 = c3720r5.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("CustomView", lnb.k(c3720r5.a, "drawable for ", " is null"));
                return;
            }
            return;
        }
        c3720r5.setImageDrawable(drawable);
        c3720r5.setPadding(i, i2, i3, i4);
    }

    public final void a(final Drawable drawable, final int i, final int i2, final int i3, final int i4) {
        post(new Runnable() { // from class: dvm
            @Override // java.lang.Runnable
            public final void run() {
                C3720r5.a(C3720r5.this, drawable, i, i2, i3, i4);
            }
        });
    }

    public static final void a(C3720r5 c3720r5, Drawable drawable, int i, int i2, int i3, int i4) {
        c3720r5.setImageDrawable(drawable);
        c3720r5.setPadding(i, i2, i3, i4);
    }
}
