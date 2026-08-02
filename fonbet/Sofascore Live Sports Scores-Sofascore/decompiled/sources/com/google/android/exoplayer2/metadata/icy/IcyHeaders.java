package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.lik;
import defpackage.m6k;
import defpackage.n6c;
import defpackage.qx9;
import defpackage.wd;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new wd(26);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public IcyHeaders(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        int i = lik.a;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IcyHeaders a(Map map) {
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i2;
        List list6 = (List) map.get("icy-br");
        boolean z3 = true;
        int i3 = -1;
        if (list6 != null) {
            try {
                i2 = Integer.parseInt((String) list6.get(0)) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        m6k.f0();
                        z = false;
                        i2 = -1;
                    } catch (NumberFormatException unused) {
                        m6k.f0();
                        i = i2;
                        z = false;
                        list = (List) map.get("icy-genre");
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        if (z) {
                        }
                    }
                }
                i = i2;
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
        } else {
            z = false;
            i = -1;
        }
        list = (List) map.get("icy-genre");
        if (list == null) {
            str = (String) list.get(0);
            z = true;
        } else {
            str = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str2 = (String) list2.get(0);
            z = true;
        } else {
            str2 = null;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str3 = (String) list3.get(0);
            z = true;
        } else {
            str3 = null;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z2 = ((String) list4.get(0)).equals("1");
            z = true;
        } else {
            z2 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            try {
                int parseInt = Integer.parseInt((String) list5.get(0));
                if (parseInt > 0) {
                    i3 = parseInt;
                } else {
                    try {
                        m6k.f0();
                        z3 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = parseInt;
                        m6k.f0();
                        if (z) {
                        }
                    }
                }
                z = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new IcyHeaders(i, i3, str, str2, str3, z2);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void e(n6c n6cVar) {
        String str = this.c;
        if (str != null) {
            n6cVar.D = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            n6cVar.B = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.a == icyHeaders.a && lik.a(this.b, icyHeaders.b) && lik.a(this.c, icyHeaders.c) && lik.a(this.d, icyHeaders.d) && this.e == icyHeaders.e && this.f == icyHeaders.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        int i2 = lik.a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    public IcyHeaders(int i, int i2, String str, String str2, String str3, boolean z) {
        qx9.r(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }
}
