package com.vk.auth.main;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.SignUpParams;
import com.vk.superapp.core.api.models.VkGender;
import com.vk.superapp.multiaccount.api.SimpleDate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import xsna.j5g;
import xsna.qxm0;

/* compiled from: SignUpDataHolder.kt */
/* loaded from: classes.dex */
public final class SignUpDataHolder implements Parcelable {
    public static final Parcelable.Creator<SignUpDataHolder> CREATOR = new a();
    public String A;
    public String B;
    public boolean C;
    public boolean D;
    public SignUpAgreementInfo E;
    public boolean F;
    public boolean G;
    public VkAuthMetaInfo H;
    public VkAuthMetaInfo I;
    public SignUpParams J;
    public Bundle K;
    public String L;
    public Country b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public Bundle g;
    public Uri h;
    public String i;
    public String j;
    public String k;
    public VkGender l = VkGender.UNDEFINED;
    public SimpleDate m;
    public String n;
    public String o;
    public String p;
    public List<? extends SignUpField> q;
    public List<? extends SignUpField> r;
    public final ArrayList s;
    public final ArrayList t;
    public boolean u;
    public boolean v;
    public SignUpIncompleteFieldsModel w;
    public String x;
    public String y;
    public boolean z;

    /* compiled from: SignUpDataHolder.kt */
    public static final class a implements Parcelable.Creator<SignUpDataHolder> {
        @Override // android.os.Parcelable.Creator
        public final SignUpDataHolder createFromParcel(Parcel parcel) {
            Object obj;
            SignUpDataHolder signUpDataHolder = new SignUpDataHolder();
            signUpDataHolder.b = (Country) parcel.readParcelable(Country.class.getClassLoader());
            signUpDataHolder.c = parcel.readString();
            signUpDataHolder.d = parcel.readString();
            signUpDataHolder.e = parcel.readString();
            signUpDataHolder.f = parcel.readInt() == 1;
            signUpDataHolder.h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
            signUpDataHolder.i = parcel.readString();
            signUpDataHolder.j = parcel.readString();
            signUpDataHolder.k = parcel.readString();
            String readString = parcel.readString();
            Object obj2 = VkGender.UNDEFINED;
            if (readString != null) {
                try {
                    obj = Enum.valueOf(VkGender.class, readString.toUpperCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                if (obj != null) {
                    obj2 = obj;
                }
            }
            signUpDataHolder.l = (VkGender) obj2;
            signUpDataHolder.m = (SimpleDate) parcel.readParcelable(SimpleDate.class.getClassLoader());
            signUpDataHolder.n = parcel.readString();
            signUpDataHolder.o = parcel.readString();
            signUpDataHolder.q = b.a(parcel);
            signUpDataHolder.t.addAll(b.a(parcel));
            signUpDataHolder.v = parcel.readInt() == 1;
            signUpDataHolder.w = (SignUpIncompleteFieldsModel) parcel.readParcelable(SignUpIncompleteFieldsModel.class.getClassLoader());
            signUpDataHolder.x = parcel.readString();
            VkAuthMetaInfo vkAuthMetaInfo = (VkAuthMetaInfo) parcel.readParcelable(VkAuthMetaInfo.class.getClassLoader());
            if (vkAuthMetaInfo == null) {
                vkAuthMetaInfo = VkAuthMetaInfo.h;
            }
            signUpDataHolder.H = vkAuthMetaInfo;
            signUpDataHolder.I = vkAuthMetaInfo;
            VkAuthMetaInfo vkAuthMetaInfo2 = (VkAuthMetaInfo) parcel.readParcelable(VkAuthMetaInfo.class.getClassLoader());
            if (vkAuthMetaInfo2 == null) {
                vkAuthMetaInfo2 = VkAuthMetaInfo.h;
            }
            signUpDataHolder.I = vkAuthMetaInfo2;
            signUpDataHolder.C = parcel.readInt() == 1;
            signUpDataHolder.y = parcel.readString();
            signUpDataHolder.J = (SignUpParams) parcel.readParcelable(SignUpParams.class.getClassLoader());
            signUpDataHolder.g = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
            signUpDataHolder.r = b.a(parcel);
            signUpDataHolder.s.addAll(b.a(parcel));
            signUpDataHolder.z = qxm0.v(parcel);
            signUpDataHolder.p = parcel.readString();
            signUpDataHolder.B = parcel.readString();
            signUpDataHolder.L = parcel.readString();
            return signUpDataHolder;
        }

        @Override // android.os.Parcelable.Creator
        public final SignUpDataHolder[] newArray(int i) {
            return new SignUpDataHolder[i];
        }
    }

    /* compiled from: SignUpDataHolder.kt */
    public static final class b {
        public static final ArrayList a(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return arrayList;
        }

        public static final void b(Parcel parcel, List list) {
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeSerializable((Serializable) it.next());
            }
        }
    }

    public SignUpDataHolder() {
        List<? extends SignUpField> list;
        SignUpField.Companion.getClass();
        list = SignUpField.DEFAULT;
        this.q = list;
        this.r = EmptyList.b;
        this.s = new ArrayList();
        this.t = new ArrayList();
        VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
        this.H = vkAuthMetaInfo;
        this.I = vkAuthMetaInfo;
    }

    public final List<SignUpField> d() {
        return j5g.t0(j5g.t0(j5g.u0(this.r, this.q), this.t), this.s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l.name());
        parcel.writeParcelable(this.m, 0);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        b.b(parcel, this.q);
        b.b(parcel, this.t);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeParcelable(this.w, 0);
        parcel.writeString(this.x);
        parcel.writeParcelable(this.H, 0);
        parcel.writeParcelable(this.I, 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeString(this.y);
        parcel.writeParcelable(this.J, 0);
        parcel.writeParcelable(this.g, 0);
        b.b(parcel, this.r);
        b.b(parcel, this.s);
        qxm0.C(parcel, this.z);
        parcel.writeString(this.p);
        parcel.writeString(this.B);
        parcel.writeString(this.L);
    }
}
