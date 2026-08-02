package D9;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* loaded from: classes2.dex */
public final class h extends zzf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1134b f2628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C1134b c1134b, Looper looper) {
        super(looper);
        this.f2628a = c1134b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1134b.g(this.f2628a, message);
    }
}
