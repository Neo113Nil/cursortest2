package w8;

import T7.C1665e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import n.AbstractC5596a;
import u8.AbstractC6529a;
import z6.AbstractC6932b;

/* renamed from: w8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6723c extends AbstractC6724d {
    public C6723c(Context context) {
        super(context, null, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    @Override // w8.AbstractC6724d, g6.AbstractC4353m
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super.c(context, attributeSet, i10, i11);
        setCompoundDrawablesWithIntrinsicBounds(AbstractC5596a.b(getContext(), AbstractC6932b.f68598a), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // g6.AbstractC4353m
    public int getDefaultRequestCode() {
        return C1665e.c.Share.b();
    }

    @Override // g6.AbstractC4353m
    public int getDefaultStyleResource() {
        return AbstractC6529a.f66223b;
    }

    @Override // w8.AbstractC6724d
    public C6725e getDialog() {
        C6725e c6725e = getFragment() != null ? new C6725e(getFragment(), getRequestCode()) : getNativeFragment() != null ? new C6725e(getNativeFragment(), getRequestCode()) : new C6725e(getActivity(), getRequestCode());
        c6725e.l(getCallbackManager());
        return c6725e;
    }
}
