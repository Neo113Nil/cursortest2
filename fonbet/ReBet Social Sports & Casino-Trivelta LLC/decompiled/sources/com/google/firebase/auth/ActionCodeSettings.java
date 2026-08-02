package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kb.I;

/* loaded from: classes3.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new I();

    /* renamed from: a, reason: collision with root package name */
    public final String f37530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37531b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37532c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37533d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37534e;

    /* renamed from: f, reason: collision with root package name */
    public final String f37535f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37536g;

    /* renamed from: h, reason: collision with root package name */
    public String f37537h;

    /* renamed from: i, reason: collision with root package name */
    public int f37538i;

    /* renamed from: j, reason: collision with root package name */
    public String f37539j;

    /* renamed from: k, reason: collision with root package name */
    public final String f37540k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f37541a;

        /* renamed from: b, reason: collision with root package name */
        public String f37542b;

        /* renamed from: c, reason: collision with root package name */
        public String f37543c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f37544d;

        /* renamed from: e, reason: collision with root package name */
        public String f37545e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f37546f;

        /* renamed from: g, reason: collision with root package name */
        public String f37547g;

        /* renamed from: h, reason: collision with root package name */
        public String f37548h;

        public ActionCodeSettings a() {
            if (this.f37541a != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z10, String str2) {
            this.f37543c = str;
            this.f37544d = z10;
            this.f37545e = str2;
            return this;
        }

        public a c(boolean z10) {
            this.f37546f = z10;
            return this;
        }

        public a d(String str) {
            this.f37542b = str;
            return this;
        }

        public a e(String str) {
            this.f37548h = str;
            return this;
        }

        public a f(String str) {
            this.f37541a = str;
            return this;
        }

        public a() {
            this.f37546f = false;
        }
    }

    public static a N() {
        return new a();
    }

    public static ActionCodeSettings a0() {
        return new ActionCodeSettings(new a());
    }

    public final int O() {
        return this.f37538i;
    }

    public final void Y(int i10) {
        this.f37538i = i10;
    }

    public final void Z(String str) {
        this.f37537h = str;
    }

    public boolean g() {
        return this.f37536g;
    }

    public boolean h() {
        return this.f37534e;
    }

    public String i() {
        return this.f37535f;
    }

    public String j() {
        return this.f37533d;
    }

    public String k() {
        return this.f37531b;
    }

    public String l() {
        return this.f37540k;
    }

    public String m() {
        return this.f37530a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, m(), false);
        E9.b.F(parcel, 2, k(), false);
        E9.b.F(parcel, 3, this.f37532c, false);
        E9.b.F(parcel, 4, j(), false);
        E9.b.g(parcel, 5, h());
        E9.b.F(parcel, 6, i(), false);
        E9.b.g(parcel, 7, g());
        E9.b.F(parcel, 8, this.f37537h, false);
        E9.b.u(parcel, 9, this.f37538i);
        E9.b.F(parcel, 10, this.f37539j, false);
        E9.b.F(parcel, 11, l(), false);
        E9.b.b(parcel, a10);
    }

    public final String zzc() {
        return this.f37539j;
    }

    public final String zzd() {
        return this.f37532c;
    }

    public final String zze() {
        return this.f37537h;
    }

    public ActionCodeSettings(a aVar) {
        this.f37530a = aVar.f37541a;
        this.f37531b = aVar.f37542b;
        this.f37532c = null;
        this.f37533d = aVar.f37543c;
        this.f37534e = aVar.f37544d;
        this.f37535f = aVar.f37545e;
        this.f37536g = aVar.f37546f;
        this.f37539j = aVar.f37547g;
        this.f37540k = aVar.f37548h;
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7, String str8) {
        this.f37530a = str;
        this.f37531b = str2;
        this.f37532c = str3;
        this.f37533d = str4;
        this.f37534e = z10;
        this.f37535f = str5;
        this.f37536g = z11;
        this.f37537h = str6;
        this.f37538i = i10;
        this.f37539j = str7;
        this.f37540k = str8;
    }
}
