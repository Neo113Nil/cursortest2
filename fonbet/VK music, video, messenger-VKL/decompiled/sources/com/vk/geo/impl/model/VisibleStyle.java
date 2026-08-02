package com.vk.geo.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import xsna.epx;
import xsna.h5s;
import xsna.t33;
import xsna.vby;

/* compiled from: VisibleStyle.kt */
@vby
/* loaded from: classes2.dex */
public final class VisibleStyle implements Comparable<VisibleStyle>, Parcelable {
    public static final Parcelable.Creator<VisibleStyle> CREATOR = new b();
    public final int b;

    /* compiled from: VisibleStyle.kt */
    public static final class a {
    }

    /* compiled from: VisibleStyle.kt */
    public static final class b implements Parcelable.Creator<VisibleStyle> {
        @Override // android.os.Parcelable.Creator
        public final VisibleStyle createFromParcel(Parcel parcel) {
            return new VisibleStyle(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VisibleStyle[] newArray(int i) {
            return new VisibleStyle[i];
        }
    }

    public /* synthetic */ VisibleStyle(int i) {
        this.b = i;
    }

    public static final boolean B(int i) {
        return C(i) || l(i) || D(i);
    }

    public static final boolean C(int i) {
        return (i & 8) != 0;
    }

    public static final boolean D(int i) {
        return (i & 1073741824) != 0;
    }

    public static final float F(int i) {
        boolean z = p(i) || l(i);
        boolean D = D(i);
        return z ? D ? 1.95f : 1.0f : D ? 1.5f : 1.0f;
    }

    public static final int G(int i) {
        if (D(i)) {
            return i;
        }
        if (!u(i)) {
            return i | 1073741824;
        }
        int G = G(67108868);
        return (G & 2048) != 0 ? G : G | 2048;
    }

    public static String K(int i) {
        StringBuilder a2 = t33.a("VisibleStyle(type=", i(i), ",selected=");
        a2.append(D(i));
        a2.append(',');
        if (n(i)) {
            a2.append("darktheme!,");
        }
        a2.append("wasHidden=");
        int i2 = 1;
        int i3 = 0;
        a2.append((i & 2048) != 0);
        a2.append(",title=");
        a2.append(f(i));
        a2.append(",subtitle=");
        a2.append(e(i));
        a2.append(",subtitle_changed=");
        a2.append((i & 8192) != 0);
        a2.append(",postsCount=");
        a2.append(!C(i) ? 0 : (i & 512) != 0 ? 3 : (i & 256) != 0 ? 2 : 1);
        a2.append(",zIndex=");
        a2.append(k(i));
        a2.append(",weight=");
        if (!u(i)) {
            int i4 = D(i) ? 10000 : 0;
            if (p(i)) {
                i4 += 10;
            }
            if (l(i)) {
                i4 += 100;
            }
            if (C(i)) {
                int i5 = i4 + 1000;
                if (!C(i)) {
                    i2 = 0;
                } else if ((i & 512) != 0) {
                    i2 = 3;
                } else if ((i & 256) != 0) {
                    i2 = 2;
                }
                i3 = i2 + i5;
            } else {
                i3 = i4;
            }
        }
        return h5s.c(i3, ",)", a2);
    }

    public static final int M(int i) {
        return (f(i) && e(i)) ? i : i | 160;
    }

    public static final int R(int i) {
        return D(i) ? a(i) : G(i);
    }

    public static final int a(int i) {
        if ((i & 2048) != 0) {
            return 1;
        }
        return i & (-1073741825);
    }

    public static final boolean b(int i) {
        return (f(i) || e(i)) ? false : true;
    }

    public static final boolean d(int i) {
        return f(i) && !e(i);
    }

    public static final boolean e(int i) {
        return (i & 128) != 0;
    }

    public static final boolean f(int i) {
        return (i & 32) != 0;
    }

    public static final boolean g(int i) {
        return f(i) || e(i);
    }

    public static final String i(int i) {
        String str = p(i) ? "dot" : C(i) ? "post" : l(i) ? "category" : o(i) ? "district" : (i & 16) != 0 ? "userLocation" : "";
        return u(i) ? str.concat("-hidden") : str;
    }

    public static final int j(int i) {
        if (u(i)) {
            return 1;
        }
        if (p(i)) {
            return 2;
        }
        if (C(i)) {
            return 8;
        }
        if (l(i)) {
            return 4;
        }
        if (o(i)) {
            return 1024;
        }
        return (i & 16) != 0 ? 16 : 0;
    }

    public static final float k(int i) {
        boolean g = g(i);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = g ? 5000.0f : 0.0f;
        if (!u(i)) {
            if (D(i)) {
                f = Float.MAX_VALUE;
            } else if (o(i)) {
                f = 9000.0f;
            } else if (C(i)) {
                f = 1000.0f;
            } else if (l(i)) {
                f = 100.0f;
            } else if (p(i)) {
                f = 10.0f;
            } else if ((i & 16) != 0) {
                f = 5.0f;
            }
        }
        return f2 + f;
    }

    public static final boolean l(int i) {
        return (i & 4) != 0;
    }

    public static final boolean n(int i) {
        return (i & 4096) != 0;
    }

    public static final boolean o(int i) {
        return (i & 1024) != 0;
    }

    public static final boolean p(int i) {
        return (i & 2) != 0;
    }

    public static final boolean u(int i) {
        return (i & 1) != 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(VisibleStyle visibleStyle) {
        return epx.g(this.b, visibleStyle.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VisibleStyle) {
            return this.b == ((VisibleStyle) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return K(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
