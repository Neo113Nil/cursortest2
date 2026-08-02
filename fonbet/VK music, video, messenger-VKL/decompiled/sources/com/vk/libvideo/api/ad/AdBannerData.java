package com.vk.libvideo.api.ad;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;

/* compiled from: AdBannerData.kt */
/* loaded from: classes2.dex */
public interface AdBannerData {

    /* compiled from: AdBannerData.kt */
    public static final class AdRedirectData implements Serializer.StreamParcelable {
        public static final Serializer.c<AdRedirectData> CREATOR = new a();
        public final String b;
        public final Integer c;
        public final Integer d;
        public final String e;
        public final String f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<AdRedirectData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final AdRedirectData a(Serializer serializer) {
                return new AdRedirectData(serializer.H(), Integer.valueOf(serializer.u()), Integer.valueOf(serializer.u()), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdRedirectData[i];
            }
        }

        public AdRedirectData(String str, Integer num, Integer num2, String str2, String str3) {
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
            if (!(obj instanceof AdRedirectData)) {
                return false;
            }
            AdRedirectData adRedirectData = (AdRedirectData) obj;
            return epx.f(this.b, adRedirectData.b) && epx.f(this.c, adRedirectData.c) && epx.f(this.d, adRedirectData.d) && epx.f(this.e, adRedirectData.e) && epx.f(this.f, adRedirectData.f);
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
            StringBuilder sb = new StringBuilder("AdRedirectData(btnText=");
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

    /* compiled from: AdBannerData.kt */
    public static final class a implements AdBannerData {
        public final String a;
        public final boolean b;
        public final int c;
        public final int d;
        public final float e;
        public final boolean f;
        public final AdRedirectData g;
        public final boolean h;
        public final int i;
        public final ArrayList j;

        public a(String str, boolean z, int i, int i2, float f, boolean z2, AdRedirectData adRedirectData, boolean z3, int i3, ArrayList arrayList) {
            this.a = str;
            this.b = z;
            this.c = i;
            this.d = i2;
            this.e = f;
            this.f = z2;
            this.g = adRedirectData;
            this.h = z3;
            this.i = i3;
            this.j = arrayList;
        }

        @Override // com.vk.libvideo.api.ad.AdBannerData
        public final boolean a() {
            return this.b;
        }

        @Override // com.vk.libvideo.api.ad.AdBannerData
        public final AdRedirectData b() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && Float.compare(this.e, aVar.e) == 0 && this.f == aVar.f && this.g.equals(aVar.g) && this.h == aVar.h && this.i == aVar.i && this.j.equals(aVar.j);
        }

        @Override // com.vk.libvideo.api.ad.AdBannerData
        public final int getHeight() {
            return this.d;
        }

        @Override // com.vk.libvideo.api.ad.AdBannerData
        public final String getId() {
            return this.a;
        }

        @Override // com.vk.libvideo.api.ad.AdBannerData
        public final int getWidth() {
            return this.c;
        }

        public final int hashCode() {
            return this.j.hashCode() + shy.a(this.i, qoy.b((this.g.hashCode() + qoy.b(b.a(this.e, shy.a(this.d, shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f)) * 31, 31, this.h), 31);
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

    AdRedirectData b();

    int getHeight();

    String getId();

    int getWidth();
}
