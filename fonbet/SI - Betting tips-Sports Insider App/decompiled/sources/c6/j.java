package c6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.h0;
import io.sentry.android.core.w0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f3673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f3673b = cVar;
        this.f3672a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i5);
            w0.m("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = d.f3659a;
        c cVar = this.f3673b;
        Context context = this.f3672a;
        int b10 = cVar.b(context, i10);
        AtomicBoolean atomicBoolean = g.f3661a;
        if (b10 == 1 || b10 == 2 || b10 == 3 || b10 == 9) {
            Intent a7 = cVar.a(context, b10, "n");
            cVar.f(context, new ConnectionResult(b10, a7 == null ? null : PendingIntent.getActivity(context, 0, a7, 201326592), null));
        }
    }
}
