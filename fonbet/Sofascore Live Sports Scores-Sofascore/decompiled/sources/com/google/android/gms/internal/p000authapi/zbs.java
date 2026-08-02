package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.f3n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zbs extends zbb implements zbt {
    public zbs() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.a(parcel, Status.CREATOR);
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) zbc.a(parcel, SaveAccountLinkingTokenResult.CREATOR);
        zbc.b(parcel);
        boolean Y0 = status.Y0();
        TaskCompletionSource taskCompletionSource = ((f3n) this).a;
        if (Y0) {
            taskCompletionSource.setResult(saveAccountLinkingTokenResult);
            return true;
        }
        taskCompletionSource.setException(ApiExceptionUtil.a(status));
        return true;
    }
}
