package com.google.android.gms.tapandpay.issuer;

import Nh.a;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.tapandpay.zzaq;
import g.C6594f;
import java.util.List;

/* loaded from: classes9.dex */
public final class PushProvisionResult {
    private final TokenResult zza;
    private final CardResult zzb;
    private final String zzc;
    private final List<ApiException> zzd;

    public enum CardResult {
        UNKNOWN,
        CARD,
        NO_CARD
    }

    public enum TokenResult {
        UNKNOWN,
        TOKEN,
        NO_TOKEN
    }

    public PushProvisionResult(@RecentlyNonNull TokenResult tokenResult, @RecentlyNonNull CardResult cardResult, String str, @RecentlyNonNull List<ApiException> list) {
        this.zza = tokenResult;
        this.zzb = cardResult;
        this.zzc = str;
        this.zzd = list;
    }

    @RecentlyNonNull
    public CardResult getCardResult() {
        return this.zzb;
    }

    @RecentlyNonNull
    public List<ApiException> getErrors() {
        return this.zzd;
    }

    @RecentlyNullable
    public String getIssuerTokenId() {
        return this.zzc;
    }

    @RecentlyNonNull
    public TokenResult getTokenResult() {
        return this.zza;
    }

    @RecentlyNonNull
    public String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String str = this.zzc;
        String valueOf3 = String.valueOf(this.zzd);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + String.valueOf(str).length() + valueOf3.length());
        a.h(sb2, "TokenResult = ", valueOf, ", CardResult = ", valueOf2);
        return C6594f.a(", issuerTokenId = ", str, valueOf3, sb2);
    }

    public PushProvisionResult(@RecentlyNonNull TokenResult tokenResult, @RecentlyNonNull CardResult cardResult, String str, @RecentlyNonNull ApiException apiException) {
        this(tokenResult, cardResult, str, zzaq.zzj(apiException));
    }
}
