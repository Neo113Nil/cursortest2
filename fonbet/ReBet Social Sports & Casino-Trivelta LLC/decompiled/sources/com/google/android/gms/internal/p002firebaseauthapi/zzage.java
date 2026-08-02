package com.google.android.gms.internal.p002firebaseauthapi;

import G9.a;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzage implements OnFailureListener {
    public zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        a aVar;
        aVar = zzagc.zza;
        aVar.c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
