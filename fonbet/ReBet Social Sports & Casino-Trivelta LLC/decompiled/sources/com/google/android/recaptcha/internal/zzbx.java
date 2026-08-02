package com.google.android.recaptcha.internal;

import Ph.AbstractC1488z;
import Ph.C0;
import Ph.InterfaceC1484x;
import Ph.X;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzbx {
    @NotNull
    public static final X zza(@NotNull Task task) {
        final InterfaceC1484x b10 = AbstractC1488z.b(null, 1, null);
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                InterfaceC1484x interfaceC1484x = InterfaceC1484x.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    interfaceC1484x.k(exception);
                } else if (task2.isCanceled()) {
                    C0.a.b(interfaceC1484x, null, 1, null);
                } else {
                    interfaceC1484x.A0(task2.getResult());
                }
            }
        });
        return new zzbw(b10);
    }
}
