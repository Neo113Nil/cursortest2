package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class h6b extends o8 implements rq4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (isAttachedToWindow()) {
            g6b t = qea.t(this);
            if (t != null) {
                t.a(this);
                j(t);
            }
        } else {
            addOnAttachStateChangeListener(new a16(this, 3, this));
        }
        g6b t2 = qea.t(this);
        if (t2 != null) {
            t2.a(new h6(t2, this, this, 4));
        }
    }

    public void j(g6b g6bVar) {
    }
}
