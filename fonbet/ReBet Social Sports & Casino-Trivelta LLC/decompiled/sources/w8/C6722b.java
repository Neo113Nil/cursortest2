package w8;

import T7.C1665e;
import android.content.Context;
import u8.AbstractC6529a;

/* renamed from: w8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6722b extends AbstractC6724d {
    public C6722b(Context context) {
        super(context, null, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    @Override // g6.AbstractC4353m
    public int getDefaultRequestCode() {
        return C1665e.c.Message.b();
    }

    @Override // g6.AbstractC4353m
    public int getDefaultStyleResource() {
        return AbstractC6529a.f66222a;
    }

    @Override // w8.AbstractC6724d
    public C6725e getDialog() {
        C6721a c6721a = getFragment() != null ? new C6721a(getFragment(), getRequestCode()) : getNativeFragment() != null ? new C6721a(getNativeFragment(), getRequestCode()) : new C6721a(getActivity(), getRequestCode());
        c6721a.l(getCallbackManager());
        return c6721a;
    }
}
