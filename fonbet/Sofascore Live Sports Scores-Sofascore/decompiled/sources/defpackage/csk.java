package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class csk extends ContextWrapper {
    public LayoutInflater a;
    public LayoutInflater b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public csk(LayoutInflater layoutInflater, Fragment fragment) {
        super(r0);
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        nqf nqfVar = new nqf(this, 6);
        this.a = layoutInflater;
        fragment.getClass();
        fragment.getLifecycle().a(nqfVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.a;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.a = layoutInflater2;
        }
        LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
        this.b = cloneInContext;
        return cloneInContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csk(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        nqf nqfVar = new nqf(this, 6);
        this.a = null;
        fragment.getClass();
        fragment.getLifecycle().a(nqfVar);
    }
}
