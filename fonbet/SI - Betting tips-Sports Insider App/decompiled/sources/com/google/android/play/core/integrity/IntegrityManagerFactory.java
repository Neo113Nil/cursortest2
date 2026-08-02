package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static IntegrityManager create(Context context) {
        c cVar;
        synchronized (l.class) {
            try {
                if (l.f6048a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    l.f6048a = new c(context);
                }
                cVar = l.f6048a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (IntegrityManager) cVar.f6027a.a();
    }
}
