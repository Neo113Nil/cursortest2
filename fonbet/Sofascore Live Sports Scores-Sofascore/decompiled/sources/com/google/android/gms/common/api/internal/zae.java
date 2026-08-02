package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import defpackage.b3n;
import defpackage.wt3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zae extends zai {
    public final BaseImplementation.ApiMethodImpl b;

    public zae(int i, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i);
        this.b = apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        try {
            this.b.o(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.o(new Status(10, wt3.m(simpleName, ": ", new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), localizedMessage), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zaaa zaaaVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = zaaaVar.a;
        BaseImplementation.ApiMethodImpl apiMethodImpl = this.b;
        map.put(apiMethodImpl, valueOf);
        apiMethodImpl.c(new b3n(zaaaVar, apiMethodImpl));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zabk zabkVar) {
        try {
            BaseImplementation.ApiMethodImpl apiMethodImpl = this.b;
            try {
                try {
                    apiMethodImpl.n(zabkVar.b);
                } catch (DeadObjectException e) {
                    apiMethodImpl.o(new Status(8, e.getLocalizedMessage(), null, null));
                    throw e;
                }
            } catch (RemoteException e2) {
                apiMethodImpl.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
