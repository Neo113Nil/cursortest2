package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p000authapi.zbbj;
import java.util.List;
import z9.m;

/* loaded from: classes2.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final zbbj f32151a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f32152b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32153c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public zbbj f32154a;

        /* renamed from: b, reason: collision with root package name */
        public Account f32155b;

        /* renamed from: c, reason: collision with root package name */
        public String f32156c;

        public /* synthetic */ a(RevokeAccessRequest revokeAccessRequest, byte[] bArr) {
            this.f32154a = revokeAccessRequest.i();
            this.f32155b = revokeAccessRequest.j();
            this.f32156c = revokeAccessRequest.k();
        }

        public RevokeAccessRequest a() {
            return new RevokeAccessRequest(this.f32154a, this.f32155b, this.f32156c);
        }

        public final a b(String str) {
            this.f32156c = str;
            return this;
        }
    }

    public RevokeAccessRequest(List list, Account account, String str) {
        this.f32151a = zbbj.zbi(list);
        this.f32152b = account;
        this.f32153c = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbj zbbjVar = this.f32151a;
            int size = zbbjVar.size();
            zbbj zbbjVar2 = revokeAccessRequest.f32151a;
            if (size == zbbjVar2.size() && zbbjVar.containsAll(zbbjVar2) && AbstractC3189m.b(this.f32152b, revokeAccessRequest.f32152b) && AbstractC3189m.b(this.f32153c, revokeAccessRequest.f32153c)) {
                return true;
            }
        }
        return false;
    }

    public List g() {
        return this.f32151a;
    }

    public Account getAccount() {
        return this.f32152b;
    }

    public final a h() {
        return new a(this, null);
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32151a, this.f32152b, this.f32153c);
    }

    public final /* synthetic */ zbbj i() {
        return this.f32151a;
    }

    public final /* synthetic */ Account j() {
        return this.f32152b;
    }

    public final /* synthetic */ String k() {
        return this.f32153c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.J(parcel, 1, g(), false);
        E9.b.D(parcel, 2, getAccount(), i10, false);
        E9.b.F(parcel, 3, this.f32153c, false);
        E9.b.b(parcel, a10);
    }
}
