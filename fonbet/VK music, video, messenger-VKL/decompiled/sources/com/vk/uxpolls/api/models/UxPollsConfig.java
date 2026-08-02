package com.vk.uxpolls.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UxPollsModels.kt */
/* loaded from: classes6.dex */
public final class UxPollsConfig implements Parcelable {
    public static final Parcelable.Creator<UxPollsConfig> CREATOR = new a();

    @pmi0("webapp_translations")
    private final List<BaseRequestParam> webappTranslations;

    @pmi0("webapp_url")
    private final String webappUrl;

    /* compiled from: UxPollsModels.kt */
    public static final class a implements Parcelable.Creator<UxPollsConfig> {
        @Override // android.os.Parcelable.Creator
        public final UxPollsConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseRequestParam.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UxPollsConfig(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollsConfig[] newArray(int i) {
            return new UxPollsConfig[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UxPollsConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<BaseRequestParam> d() {
        return this.webappTranslations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.webappUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollsConfig)) {
            return false;
        }
        UxPollsConfig uxPollsConfig = (UxPollsConfig) obj;
        return epx.f(this.webappUrl, uxPollsConfig.webappUrl) && epx.f(this.webappTranslations, uxPollsConfig.webappTranslations);
    }

    public final int hashCode() {
        String str = this.webappUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseRequestParam> list = this.webappTranslations;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollsConfig(webappUrl=");
        sb.append(this.webappUrl);
        sb.append(", webappTranslations=");
        return ms9.a(')', sb, this.webappTranslations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.webappUrl);
        List<BaseRequestParam> list = this.webappTranslations;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseRequestParam) f.next()).writeToParcel(parcel, i);
        }
    }

    public UxPollsConfig(String str, List<BaseRequestParam> list) {
        this.webappUrl = str;
        this.webappTranslations = list;
    }

    public /* synthetic */ UxPollsConfig(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
