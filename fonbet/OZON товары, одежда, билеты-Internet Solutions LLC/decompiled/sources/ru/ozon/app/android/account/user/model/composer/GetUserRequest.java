package ru.ozon.app.android.account.user.model.composer;

import Kk.C3532b;
import Lh.a;
import Pk0.f;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/account/user/model/composer/GetUserRequest;", "", Scopes.EMAIL, "", "phone", "public", Scopes.PROFILE, "contacts", "<init>", "(ZZZZZ)V", "getEmail", "()Z", "getPhone", "getPublic", "getProfile", "getContacts", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GetUserRequest {
    private final boolean contacts;
    private final boolean email;
    private final boolean phone;
    private final boolean profile;
    private final boolean public;

    public GetUserRequest() {
        this(false, false, false, false, false, 31, null);
    }

    public static /* synthetic */ GetUserRequest copy$default(GetUserRequest getUserRequest, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = getUserRequest.email;
        }
        if ((i11 & 2) != 0) {
            z12 = getUserRequest.phone;
        }
        if ((i11 & 4) != 0) {
            z13 = getUserRequest.public;
        }
        if ((i11 & 8) != 0) {
            z14 = getUserRequest.profile;
        }
        if ((i11 & 16) != 0) {
            z15 = getUserRequest.contacts;
        }
        boolean z16 = z15;
        boolean z17 = z13;
        return getUserRequest.copy(z11, z12, z17, z14, z16);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPhone() {
        return this.phone;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPublic() {
        return this.public;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getProfile() {
        return this.profile;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getContacts() {
        return this.contacts;
    }

    @NotNull
    public final GetUserRequest copy(boolean email, boolean phone, boolean r92, boolean profile, boolean contacts) {
        return new GetUserRequest(email, phone, r92, profile, contacts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetUserRequest)) {
            return false;
        }
        GetUserRequest getUserRequest = (GetUserRequest) other;
        return this.email == getUserRequest.email && this.phone == getUserRequest.phone && this.public == getUserRequest.public && this.profile == getUserRequest.profile && this.contacts == getUserRequest.contacts;
    }

    public final boolean getContacts() {
        return this.contacts;
    }

    public final boolean getEmail() {
        return this.email;
    }

    public final boolean getPhone() {
        return this.phone;
    }

    public final boolean getProfile() {
        return this.profile;
    }

    public final boolean getPublic() {
        return this.public;
    }

    public int hashCode() {
        return Boolean.hashCode(this.contacts) + C3532b.a(C3532b.a(C3532b.a(Boolean.hashCode(this.email) * 31, 31, this.phone), 31, this.public), 31, this.profile);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.email;
        boolean z12 = this.phone;
        boolean z13 = this.public;
        boolean z14 = this.profile;
        boolean z15 = this.contacts;
        StringBuilder d11 = a.d("GetUserRequest(email=", ", phone=", ", public=", z11, z12);
        f.c(", profile=", ", contacts=", d11, z13, z14);
        return Pk0.a.a(")", d11, z15);
    }

    public GetUserRequest(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.email = z11;
        this.phone = z12;
        this.public = z13;
        this.profile = z14;
        this.contacts = z15;
    }

    public /* synthetic */ GetUserRequest(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15);
    }
}
