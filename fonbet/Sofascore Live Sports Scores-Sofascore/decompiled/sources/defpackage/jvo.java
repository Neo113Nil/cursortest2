package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jvo extends qvo {
    public final uno b;
    public final utn c;

    public jvo(Context context, Executor executor, lto ltoVar) {
        uno unoVar = new uno(context, executor, ltoVar);
        this.b = unoVar;
        this.c = new utn(unoVar);
    }

    @Override // defpackage.svo
    public final String R(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, IObjectWrapper iObjectWrapper4) {
        return this.b.d((Context) ObjectWrapper.Z1(iObjectWrapper), (String) ObjectWrapper.Z1(iObjectWrapper2), (View) ObjectWrapper.Z1(iObjectWrapper3), (Activity) ObjectWrapper.Z1(iObjectWrapper4));
    }

    public final ObjectWrapper S1(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, boolean z) {
        Uri f;
        try {
            Uri uri = (Uri) ObjectWrapper.Z1(iObjectWrapper);
            Context context = (Context) ObjectWrapper.Z1(iObjectWrapper2);
            utn utnVar = this.c;
            if (z) {
                f = utn.f(uri, ((uno) utnVar.e).zzl(context));
            } else {
                utnVar.getClass();
                try {
                    f = utn.f(uri, ((uno) utnVar.e).d(context, uri.getQueryParameter("ai"), null, null));
                } catch (UnsupportedOperationException unused) {
                    throw new coo("Provided Uri is not in a valid state");
                }
            }
            return new ObjectWrapper(f);
        } catch (coo unused2) {
            return null;
        }
    }

    @Override // defpackage.svo
    public final String q0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return this.b.a((Context) ObjectWrapper.Z1(iObjectWrapper), (View) ObjectWrapper.Z1(iObjectWrapper2), (Activity) ObjectWrapper.Z1(iObjectWrapper3));
    }

    @Override // defpackage.svo
    public final String s(IObjectWrapper iObjectWrapper) {
        return this.b.zzl((Context) ObjectWrapper.Z1(iObjectWrapper));
    }

    @Override // defpackage.svo
    public final void t(IObjectWrapper iObjectWrapper) {
        ((uno) this.c.e).b((MotionEvent) ObjectWrapper.Z1(iObjectWrapper));
    }
}
