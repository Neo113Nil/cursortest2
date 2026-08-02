package Q0;

import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9188a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f9189b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f9190c;

    public b() {
        try {
            f9190c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f9189b == null) {
            synchronized (f9188a) {
                try {
                    if (f9189b == null) {
                        f9189b = new b();
                    }
                } finally {
                }
            }
        }
        return f9189b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f9190c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
