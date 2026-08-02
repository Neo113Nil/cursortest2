package com.vk.video.ui.upload.impl.publish.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.data.PrivacySetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.g5g;
import xsna.ho8;
import xsna.zcl;

/* compiled from: PrivacyDo.kt */
/* loaded from: classes7.dex */
public final class PrivacyDo implements Parcelable {
    public static final Parcelable.Creator<PrivacyDo> CREATOR = new a();
    public final List<PrivacySetting.PrivacyRule> b;
    public final List<String> c;
    public final String d;

    /* compiled from: PrivacyDo.kt */
    public static final class a implements Parcelable.Creator<PrivacyDo> {
        @Override // android.os.Parcelable.Creator
        public final PrivacyDo createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(PrivacyDo.class, parcel, arrayList, i, 1);
            }
            return new PrivacyDo(arrayList, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacyDo[] newArray(int i) {
            return new PrivacyDo[i];
        }
    }

    public PrivacyDo() {
        this(null, null, null, 7, null);
    }

    public static PrivacyDo a(PrivacyDo privacyDo, List list, List list2, String str, int i) {
        if ((i & 2) != 0) {
            list2 = privacyDo.c;
        }
        if ((i & 4) != 0) {
            str = privacyDo.d;
        }
        privacyDo.getClass();
        return new PrivacyDo(list, list2, str);
    }

    public final ArrayList d() {
        List<PrivacySetting.PrivacyRule> list = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((PrivacySetting.PrivacyRule) it.next()).zb(), arrayList);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDo)) {
            return false;
        }
        PrivacyDo privacyDo = (PrivacyDo) obj;
        return epx.f(this.b, privacyDo.b) && epx.f(this.c, privacyDo.c) && epx.f(this.d, privacyDo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyDo(value=");
        sb.append(this.b);
        sb.append(", possibleRules=");
        sb.append(this.c);
        sb.append(", displayValue=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyDo(List<? extends PrivacySetting.PrivacyRule> list, List<String> list2, String str) {
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    public PrivacyDo(List list, List list2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? EmptyList.b : list2, (i & 4) != 0 ? "" : str);
    }
}
