package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import z9.n;

/* loaded from: classes2.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f32157a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32158b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32159c;

    /* renamed from: d, reason: collision with root package name */
    public final List f32160d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32162f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public PendingIntent f32163a;

        /* renamed from: b, reason: collision with root package name */
        public String f32164b;

        /* renamed from: c, reason: collision with root package name */
        public String f32165c;

        /* renamed from: d, reason: collision with root package name */
        public List f32166d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public String f32167e;

        /* renamed from: f, reason: collision with root package name */
        public int f32168f;

        public SaveAccountLinkingTokenRequest a() {
            AbstractC3191o.b(this.f32163a != null, "Consent PendingIntent cannot be null");
            AbstractC3191o.b("auth_code".equals(this.f32164b), "Invalid tokenType");
            AbstractC3191o.b(!TextUtils.isEmpty(this.f32165c), "serviceId cannot be null or empty");
            AbstractC3191o.b(this.f32166d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f32163a, this.f32164b, this.f32165c, this.f32166d, this.f32167e, this.f32168f);
        }

        public a b(PendingIntent pendingIntent) {
            this.f32163a = pendingIntent;
            return this;
        }

        public a c(List list) {
            this.f32166d = list;
            return this;
        }

        public a d(String str) {
            this.f32165c = str;
            return this;
        }

        public a e(String str) {
            this.f32164b = str;
            return this;
        }

        public final a f(String str) {
            this.f32167e = str;
            return this;
        }

        public final a g(int i10) {
            this.f32168f = i10;
            return this;
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f32157a = pendingIntent;
        this.f32158b = str;
        this.f32159c = str2;
        this.f32160d = list;
        this.f32161e = str3;
        this.f32162f = i10;
    }

    public static a g() {
        return new a();
    }

    public static a l(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC3191o.m(saveAccountLinkingTokenRequest);
        a g10 = g();
        g10.c(saveAccountLinkingTokenRequest.i());
        g10.d(saveAccountLinkingTokenRequest.j());
        g10.b(saveAccountLinkingTokenRequest.h());
        g10.e(saveAccountLinkingTokenRequest.k());
        g10.g(saveAccountLinkingTokenRequest.f32162f);
        String str = saveAccountLinkingTokenRequest.f32161e;
        if (!TextUtils.isEmpty(str)) {
            g10.f(str);
        }
        return g10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.f32160d;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.f32160d;
        return size == list2.size() && list.containsAll(list2) && AbstractC3189m.b(this.f32157a, saveAccountLinkingTokenRequest.f32157a) && AbstractC3189m.b(this.f32158b, saveAccountLinkingTokenRequest.f32158b) && AbstractC3189m.b(this.f32159c, saveAccountLinkingTokenRequest.f32159c) && AbstractC3189m.b(this.f32161e, saveAccountLinkingTokenRequest.f32161e) && this.f32162f == saveAccountLinkingTokenRequest.f32162f;
    }

    public PendingIntent h() {
        return this.f32157a;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32157a, this.f32158b, this.f32159c, this.f32160d, this.f32161e);
    }

    public List i() {
        return this.f32160d;
    }

    public String j() {
        return this.f32159c;
    }

    public String k() {
        return this.f32158b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, h(), i10, false);
        E9.b.F(parcel, 2, k(), false);
        E9.b.F(parcel, 3, j(), false);
        E9.b.H(parcel, 4, i(), false);
        E9.b.F(parcel, 5, this.f32161e, false);
        E9.b.u(parcel, 6, this.f32162f);
        E9.b.b(parcel, a10);
    }
}
