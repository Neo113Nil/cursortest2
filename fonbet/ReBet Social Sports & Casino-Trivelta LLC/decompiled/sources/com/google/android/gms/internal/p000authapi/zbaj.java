package com.google.android.gms.internal.p000authapi;

import E9.c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import z9.InterfaceC6947a;
import z9.j;

/* loaded from: classes2.dex */
public final class zbaj extends e implements InterfaceC6947a {
    private static final C3117a.g zba;
    private static final C3117a.AbstractC0488a zbb;
    private static final C3117a zbc;
    private final String zbd;

    static {
        C3117a.g gVar = new C3117a.g();
        zba = gVar;
        zbae zbaeVar = new zbae();
        zbb = zbaeVar;
        zbc = new C3117a("Auth.Api.Identity.CredentialSaving.API", zbaeVar, gVar);
    }

    public zbaj(@NonNull Activity activity, @NonNull j jVar) {
        super(activity, zbc, (C3117a.d) jVar, e.a.f32290c);
        this.zbd = zbaw.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return Status.f32277h;
        }
        Status status = (Status) c.b(intent, "status", Status.CREATOR);
        return status == null ? Status.f32277h : status;
    }

    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC3191o.m(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a l10 = SaveAccountLinkingTokenRequest.l(saveAccountLinkingTokenRequest);
        l10.f(this.zbd);
        final SaveAccountLinkingTokenRequest a10 = l10.a();
        return doRead(AbstractC3163x.a().d(zbav.zbh).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbg zbgVar = (zbg) obj;
                ((zbm) zbgVar.getService()).zbc(new zbaf(zbaj.this, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) AbstractC3191o.m(a10), zbba.zba(zbgVar.getContext()));
            }
        }).c(false).e(1535).a());
    }

    @Override // z9.InterfaceC6947a
    public final Task<SavePasswordResult> savePassword(@NonNull SavePasswordRequest savePasswordRequest) {
        AbstractC3191o.m(savePasswordRequest);
        SavePasswordRequest.a i10 = SavePasswordRequest.i(savePasswordRequest);
        i10.d(this.zbd);
        final SavePasswordRequest a10 = i10.a();
        return doRead(AbstractC3163x.a().d(zbav.zbf).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbg zbgVar = (zbg) obj;
                ((zbm) zbgVar.getService()).zbd(new zbag(zbaj.this, (TaskCompletionSource) obj2), (SavePasswordRequest) AbstractC3191o.m(a10), zbba.zba(zbgVar.getContext()));
            }
        }).c(false).e(1536).a());
    }

    public zbaj(@NonNull Context context, @NonNull j jVar) {
        super(context, zbc, jVar, e.a.f32290c);
        this.zbd = zbaw.zba();
    }
}
