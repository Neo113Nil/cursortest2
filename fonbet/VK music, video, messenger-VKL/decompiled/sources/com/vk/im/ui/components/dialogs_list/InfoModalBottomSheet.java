package com.vk.im.ui.components.dialogs_list;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Pair;
import xsna.dw20;
import xsna.epx;
import xsna.gd4;
import xsna.ho8;
import xsna.kai;
import xsna.rrv0;
import xsna.tzp0;
import xsna.urd0;
import xsna.vpi;
import xsna.wpi;
import xsna.yfb;
import xsna.zjm;

/* compiled from: InfoModalBottomSheet.kt */
/* loaded from: classes2.dex */
public final class InfoModalBottomSheet extends vpi {
    public static final /* synthetic */ int g1 = 0;

    /* compiled from: InfoModalBottomSheet.kt */
    public static final class Params implements Parcelable {
        public static final Parcelable.Creator<Params> CREATOR = new a();
        public final int b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: InfoModalBottomSheet.kt */
        public static final class a implements Parcelable.Creator<Params> {
            @Override // android.os.Parcelable.Creator
            public final Params createFromParcel(Parcel parcel) {
                return new Params(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Params[] newArray(int i) {
                return new Params[i];
            }
        }

        public Params(int i, String str, String str2, String str3) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.b == params.b && epx.f(this.c, params.c) && epx.f(this.d, params.d) && epx.f(this.e, params.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(iconId=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", body=");
            sb.append(this.d);
            sb.append(", okButton=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    /* compiled from: InfoModalBottomSheet.kt */
    public static final class a extends wpi {
        public final Params g;

        public a(Context context, Params params) {
            super(context, tzp0.a(null, 3));
            this.g = params;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            InfoModalBottomSheet infoModalBottomSheet = new InfoModalBottomSheet();
            infoModalBottomSheet.setArguments(yfb.b(new Pair(Params.class.getSimpleName(), this.g)));
            return infoModalBottomSheet;
        }
    }

    /* compiled from: InfoModalBottomSheet.kt */
    public static final class b {
        public static void a(Context context, Params params) {
            new a(context, params).I0(null);
        }
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        Parcelable parcelable;
        Object parcelable2;
        androidx.compose.runtime.a M = aVar.M(1812709739);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1812709739, i2, -1, "com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet.Content (InfoModalBottomSheet.kt:34)");
            }
            Bundle requireArguments = requireArguments();
            String simpleName = Params.class.getSimpleName();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = requireArguments.getParcelable(simpleName, Params.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = requireArguments.getParcelable(simpleName);
                if (!(parcelable3 instanceof Params)) {
                    parcelable3 = null;
                }
                parcelable = (Params) parcelable3;
            }
            if (parcelable == null) {
                throw new IllegalStateException("Required value was null.");
            }
            rrv0.d(null, null, null, null, kai.c(-1868329498, new zjm(3, (Params) parcelable, this), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gd4(this, i, 5);
        }
    }
}
