package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.j6o;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001YBS\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rBc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJC\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b%\u0010$J+\u0010&\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\"J\u0017\u0010'\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\u0000H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b*\u0010)J-\u0010-\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\tH\u0007¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b0\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010<R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8GX\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020@8G¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100@8G¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u001e\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0@8Ç\u0002¢\u0006\u0006\u001a\u0004\bE\u0010BR\u0011\u0010F\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bH\u0010GR\u0011\u0010I\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0011\u0010J\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bJ\u0010GR\u0011\u0010K\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bK\u0010GR\u001e\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0@8Ç\u0002¢\u0006\u0006\u001a\u0004\bL\u0010BR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\bM\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\bN\u0010<R\u0017\u0010\u000e\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\bP\u0010QR\u0011\u0010S\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\bR\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bT\u0010QR\u0011\u0010X\u001a\u00020U8G¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "uid", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "attributionTag", "listenerId", "", "Lcom/google/android/gms/common/Feature;", "clientFeatures", "impersonator", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "pid", "clientSdkVersion", "Lcom/google/android/gms/libs/identity/ClientType;", "clientType", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/libs/identity/Impersonator;", "asImpersonator", "(Landroid/content/Context;)Lcom/google/android/gms/libs/identity/Impersonator;", "", "permissions", "", "checkAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkPermissions", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "", "enforceAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)V", "enforceFirstParty", "(Landroid/content/Context;)V", "enforcePackageName", "enforcePermissions", "enforceZeroParty", "forAggregation", "()Lcom/google/android/gms/libs/identity/ClientIdentity;", "getImpersonator", "impersonatee", "impersonateeListenerId", "impersonate", "(Landroid/content/Context;Lcom/google/android/gms/libs/identity/ClientIdentity;Ljava/lang/String;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "feature", "supportsFeature", "(Lcom/google/android/gms/common/Feature;)Z", "name", "", "version", "(Ljava/lang/String;J)Z", "_clientSdkVersion", "Ljava/lang/Integer;", "_clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "Ljava/lang/String;", "getAttributionTag", "()Ljava/lang/String;", "Ljava/util/List;", "getClientFeatures", "()Ljava/util/List;", "Lkotlin/Function1;", "getClientSdkVersion", "()Lkotlin/jvm/functions/Function1;", "getClientType", "Lcom/google/android/gms/libs/identity/ClientIdentity;", "isFirstParty", "isImpersonatedIdentity", "()Z", "isMyProcess", "isMyUid", "isMyUser", "isSystemServer", "isZeroParty", "getListenerId", "getPackageName", "I", "getPid", "()I", "getRealIdentity", "realIdentity", "getUid", "Landroid/os/UserHandle;", "getUserHandle", "()Landroid/os/UserHandle;", "userHandle", "Companion", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.location.zze, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class ClientIdentity extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zzf();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final zzex e;
    public final ClientIdentity f;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.google.android.gms.internal.location.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public ClientIdentity(int i, String str, String str2, String str3, ArrayList arrayList, ClientIdentity clientIdentity) {
        str.getClass();
        if (clientIdentity != null && clientIdentity.f != null) {
            a70.p("Failed requirement.");
            throw null;
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? clientIdentity != null ? clientIdentity.d : null : str3;
        if (arrayList == 0) {
            arrayList = clientIdentity != null ? clientIdentity.e : 0;
            if (arrayList == 0) {
                j6o j6oVar = zzex.b;
                arrayList = a.e;
                arrayList.getClass();
            }
        }
        zzex t = zzex.t(arrayList);
        t.getClass();
        this.e = t;
        this.f = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return this.a == clientIdentity.a && Intrinsics.c(this.b, clientIdentity.b) && Intrinsics.c(this.c, clientIdentity.c) && Intrinsics.c(this.d, clientIdentity.d) && Intrinsics.c(this.f, clientIdentity.f) && Intrinsics.c(this.e, clientIdentity.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append(U3.j.d);
            if (c.v(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append(U3.j.e);
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 6, this.d, false);
        SafeParcelWriter.l(parcel, 7, this.f, i, false);
        SafeParcelWriter.q(parcel, 8, this.e, false);
        SafeParcelWriter.t(parcel, s);
    }
}
