package M9;

import android.content.Context;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f7571b = new e();

    /* renamed from: a, reason: collision with root package name */
    public d f7572a = null;

    public static d a(Context context) {
        return f7571b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f7572a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f7572a = new d(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7572a;
    }
}
