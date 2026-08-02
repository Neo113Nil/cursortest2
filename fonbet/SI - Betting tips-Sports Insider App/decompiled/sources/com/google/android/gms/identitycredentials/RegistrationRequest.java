package com.google.android.gms.identitycredentials;

import a3.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/android/gms/identitycredentials/RegistrationRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegistrationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegistrationRequest.kt\ncom/google/android/gms/identitycredentials/RegistrationRequest\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1734#2,3:67\n*S KotlinDebug\n*F\n+ 1 RegistrationRequest.kt\ncom/google/android/gms/identitycredentials/RegistrationRequest\n*L\n47#1:67,3\n*E\n"})
/* loaded from: classes.dex */
public final class RegistrationRequest extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<RegistrationRequest> CREATOR = new a(10);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4847a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4848b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4849c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4850d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4851e;

    public RegistrationRequest(byte[] credentials, byte[] matcher, String type, String requestType, List protocolTypes) {
        boolean z5;
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolTypes, "protocolTypes");
        this.f4847a = credentials;
        this.f4848b = matcher;
        this.f4849c = type;
        this.f4850d = requestType;
        this.f4851e = protocolTypes;
        if (!StringsKt.H(requestType) && !protocolTypes.isEmpty() && !protocolTypes.isEmpty()) {
            Iterator it = protocolTypes.iterator();
            while (it.hasNext()) {
                if (!StringsKt.H((String) it.next())) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        boolean z7 = !StringsKt.H(this.f4849c) && this.f4850d.length() == 0 && this.f4851e.isEmpty();
        if (z5 || z7) {
            return;
        }
        String str = this.f4849c;
        String str2 = this.f4850d;
        List list = this.f4851e;
        StringBuilder q = k.q("Either type: ", str, ", or requestType: ", str2, " and protocolTypes: ");
        q.append(list);
        q.append(" must be specified, but all were blank, or for protocolTypes, empty or full of blank elements.");
        throw new IllegalArgumentException(q.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i5) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int V = b.V(dest, 20293);
        b.G(dest, 1, this.f4847a, false);
        b.G(dest, 2, this.f4848b, false);
        b.O(dest, 3, this.f4849c, false);
        b.O(dest, 4, this.f4850d, false);
        b.P(dest, 5, this.f4851e);
        b.W(dest, V);
    }
}
