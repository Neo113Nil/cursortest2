package com.vk.music.offline.configs.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.music.reactions.Reaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: ReactionsConfig.kt */
/* loaded from: classes3.dex */
public final class ReactionsConfig implements Parcelable {
    public static final Parcelable.Creator<ReactionsConfig> CREATOR = new a();
    public final String b;
    public final String c;
    public final List<Reaction> d;

    /* compiled from: ReactionsConfig.kt */
    public static final class a implements Parcelable.Creator<ReactionsConfig> {
        @Override // android.os.Parcelable.Creator
        public final ReactionsConfig createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readValue(ReactionsConfig.class.getClassLoader()));
            }
            return new ReactionsConfig(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ReactionsConfig[] newArray(int i) {
            return new ReactionsConfig[i];
        }
    }

    public ReactionsConfig(String str, String str2, List<Reaction> list) {
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionsConfig)) {
            return false;
        }
        ReactionsConfig reactionsConfig = (ReactionsConfig) obj;
        return epx.f(this.b, reactionsConfig.b) && epx.f(this.c, reactionsConfig.c) && epx.f(this.d, reactionsConfig.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsConfig(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", reactions=");
        return ms9.a(')', sb, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeValue(a2.next());
        }
    }
}
