package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.List;
import xsna.arz0;
import xsna.exc0;
import xsna.f5o0;
import xsna.ouf0;
import xsna.pdk;
import xsna.pzg0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class zbag extends b implements pdk {
    private static final a.g zba;
    private static final a.AbstractC0111a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbadVar, gVar);
    }

    public zbag(@NonNull Activity activity, @NonNull arz0 arz0Var) {
        super(activity, (a<arz0>) zbc, arz0Var, b.a.c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(@Nullable Intent intent) {
        if (intent == null) {
            return Status.h;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : pzg0.a(byteArrayExtra, creator));
        return status == null ? Status.h : status;
    }

    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        exc0.i(saveAccountLinkingTokenRequest);
        new ArrayList();
        List list = saveAccountLinkingTokenRequest.e;
        String str = saveAccountLinkingTokenRequest.d;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.b;
        String str2 = saveAccountLinkingTokenRequest.c;
        int i = saveAccountLinkingTokenRequest.g;
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f);
        String str3 = this.zbd;
        exc0.a("Consent PendingIntent cannot be null", pendingIntent != null);
        exc0.a("Invalid tokenType", "auth_code".equals(str2));
        exc0.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str));
        exc0.a("scopes cannot be null", list != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i);
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zbas.zbg};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api.zbab
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zbae zbaeVar = new zbae(zbag.this, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                exc0.i(saveAccountLinkingTokenRequest3);
                zbnVar.zbc(zbaeVar, saveAccountLinkingTokenRequest3);
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1535;
        return doRead(a.a());
    }

    @Override // xsna.pdk
    public final Task<SavePasswordResult> savePassword(@NonNull SavePasswordRequest savePasswordRequest) {
        exc0.i(savePasswordRequest);
        final SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.b, this.zbd, savePasswordRequest.d);
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zbas.zbe};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api.zbac
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zbaf zbafVar = new zbaf(zbag.this, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SavePasswordRequest savePasswordRequest3 = savePasswordRequest2;
                exc0.i(savePasswordRequest3);
                zbnVar.zbd(zbafVar, savePasswordRequest3);
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1536;
        return doRead(a.a());
    }

    public zbag(@NonNull Context context, @NonNull arz0 arz0Var) {
        super(context, (a<arz0>) zbc, arz0Var, b.a.c);
        this.zbd = zbat.zba();
    }
}
