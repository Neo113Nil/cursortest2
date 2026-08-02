package com.vk.libvideo.design.view.ad.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;

/* compiled from: AdLayoutBannerData.kt */
/* loaded from: classes2.dex */
public interface AdLayoutBannerData {

    /* compiled from: AdLayoutBannerData.kt */
    public static final class AdLayoutRedirectData implements Serializer.StreamParcelable {
        public static final Serializer.c<AdLayoutRedirectData> CREATOR = new a();
        public final String b;
        public final Integer c;
        public final Integer d;
        public final String e;
        public final String f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<AdLayoutRedirectData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final AdLayoutRedirectData a(Serializer serializer) {
                return new AdLayoutRedirectData(serializer.H(), Integer.valueOf(serializer.u()), Integer.valueOf(serializer.u()), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdLayoutRedirectData[i];
            }
        }

        public AdLayoutRedirectData(String str, Integer num, Integer num2, String str2, String str3) {
            this.b = str;
            this.c = num;
            this.d = num2;
            this.e = str2;
            this.f = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.V(this.c);
            serializer.V(this.d);
            serializer.m0(this.e);
            serializer.m0(this.f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdLayoutRedirectData)) {
                return false;
            }
            AdLayoutRedirectData adLayoutRedirectData = (AdLayoutRedirectData) obj;
            return epx.f(this.b, adLayoutRedirectData.b) && epx.f(this.c, adLayoutRedirectData.c) && epx.f(this.d, adLayoutRedirectData.d) && epx.f(this.e, adLayoutRedirectData.e) && epx.f(this.f, adLayoutRedirectData.f);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.e;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdLayoutRedirectData(btnText=");
            sb.append(this.b);
            sb.append(", btnColor=");
            sb.append(this.c);
            sb.append(", btnTextColor=");
            sb.append(this.d);
            sb.append(", urlText=");
            sb.append(this.e);
            sb.append(", urlIcon=");
            return ho8.a(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: AdLayoutBannerData.kt */
    public static final class a implements AdLayoutBannerData {
    }

    /* compiled from: AdLayoutBannerData.kt */
    public static final class b implements AdLayoutBannerData {
        public final String a;
        public final boolean b;
        public final int c;
        public final int d;
        public final float e;
        public final boolean f;
        public final AdLayoutRedirectData g;
        public final boolean h;
        public final int i;
        public final ArrayList j;

        public b(String str, boolean z, int i, int i2, float f, boolean z2, AdLayoutRedirectData adLayoutRedirectData, boolean z3, int i3, ArrayList arrayList) {
            this.a = str;
            this.b = z;
            this.c = i;
            this.d = i2;
            this.e = f;
            this.f = z2;
            this.g = adLayoutRedirectData;
            this.h = z3;
            this.i = i3;
            this.j = arrayList;
        }

        @Override // com.vk.libvideo.design.view.ad.data.AdLayoutBannerData
        public final boolean a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && Float.compare(this.e, bVar.e) == 0 && this.f == bVar.f && this.g.equals(bVar.g) && this.h == bVar.h && this.i == bVar.i && this.j.equals(bVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + shy.a(this.i, qoy.b((this.g.hashCode() + qoy.b(io.reactivex.rxjava3.subjects.b.a(this.e, shy.a(this.d, shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f)) * 31, 31, this.h), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Old(id=");
            sb.append(this.a);
            sb.append(", hasShoppable=");
            sb.append(this.b);
            sb.append(", width=");
            sb.append(this.c);
            sb.append(", height=");
            sb.append(this.d);
            sb.append(", duration=");
            sb.append(this.e);
            sb.append(", hasAdChoice=");
            sb.append(this.f);
            sb.append(", redirectData=");
            sb.append(this.g);
            sb.append(", allowClose=");
            sb.append(this.h);
            sb.append(", allowCloseDelay=");
            sb.append(this.i);
            sb.append(", products=");
            return j.b(')', sb, this.j);
        }
    }

    boolean a();
}
