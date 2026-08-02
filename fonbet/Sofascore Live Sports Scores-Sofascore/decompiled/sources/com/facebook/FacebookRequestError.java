package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt3;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "com/facebook/b", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookRequestError implements Parcelable {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final Object g;
    public final String h;
    public final q i;
    public static final b j = new b(5);

    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new a(4);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r0.contains(java.lang.Integer.valueOf(r3)) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, q qVar, boolean z) {
        Set set;
        Set set2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str3;
        this.f = str4;
        this.g = obj;
        this.h = str2;
        b bVar = j;
        int i4 = 2;
        if (qVar != null) {
            this.i = qVar;
        } else {
            this.i = new x(this, a());
            com.facebook.internal.k h = bVar.h();
            Map map = h.b;
            Map map2 = h.c;
            Map map3 = h.a;
            if (!z) {
                if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set2 = (Set) map3.get(Integer.valueOf(i2))) != null && !set2.contains(Integer.valueOf(i3)))) {
                    if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set = (Set) map2.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
                        i4 = 1;
                    } else if (map != null) {
                        if (map.containsKey(Integer.valueOf(i2))) {
                            Set set3 = (Set) map.get(Integer.valueOf(i2));
                            if (set3 != null) {
                            }
                        }
                    }
                }
            }
            i4 = 3;
        }
        bVar.h();
        int i5 = com.facebook.internal.j.a[wt3.C(i4)];
    }

    public final String a() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        q qVar = this.i;
        if (qVar != null) {
            return qVar.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "{HttpStatus: " + this.a + ", errorCode: " + this.b + ", subErrorCode: " + this.c + ", errorType: " + this.d + ", errorMessage: " + a() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(a());
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof q ? (q) exc : new q(exc), false);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, false);
    }
}
