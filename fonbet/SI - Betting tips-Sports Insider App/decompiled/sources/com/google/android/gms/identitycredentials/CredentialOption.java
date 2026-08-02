package com.google.android.gms.identitycredentials;

import a3.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import h8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialOption extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<CredentialOption> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f4834a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f4835b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f4836c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4837d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4838e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4839f;

    public CredentialOption(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialRetrievalData, "credentialRetrievalData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(requestMatcher, "requestMatcher");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.f4834a = type;
        this.f4835b = credentialRetrievalData;
        this.f4836c = candidateQueryData;
        this.f4837d = requestMatcher;
        this.f4838e = requestType;
        this.f4839f = protocolType;
        boolean z5 = (StringsKt.H(requestType) || StringsKt.H(protocolType)) ? false : true;
        boolean z7 = !StringsKt.H(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (!z5 && !z7) {
            throw new IllegalArgumentException(e.l(k.q("Either type: ", type, ", or requestType: ", requestType, " and protocolType: "), protocolType, " must be specified, but at least one contains an invalid blank value."));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int V = b.V(dest, 20293);
        b.O(dest, 1, this.f4834a, false);
        b.F(dest, 2, this.f4835b);
        b.F(dest, 3, this.f4836c);
        b.O(dest, 4, this.f4837d, false);
        b.O(dest, 5, this.f4838e, false);
        b.O(dest, 6, this.f4839f, false);
        b.W(dest, V);
    }
}
