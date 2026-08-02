package M4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.m;

/* loaded from: classes2.dex */
public final class h extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final Handler f7481e = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: d, reason: collision with root package name */
    public final m f7482d;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((h) message.obj).f();
            return true;
        }
    }

    public h(m mVar, int i10, int i11) {
        super(i10, i11);
        this.f7482d = mVar;
    }

    public static h k(m mVar, int i10, int i11) {
        return new h(mVar, i10, i11);
    }

    public void f() {
        this.f7482d.p(this);
    }

    @Override // M4.j
    public void m(Object obj, N4.d dVar) {
        L4.d c10 = c();
        if (c10 == null || !c10.isComplete()) {
            return;
        }
        f7481e.obtainMessage(1, this).sendToTarget();
    }

    @Override // M4.j
    public void j(Drawable drawable) {
    }
}
