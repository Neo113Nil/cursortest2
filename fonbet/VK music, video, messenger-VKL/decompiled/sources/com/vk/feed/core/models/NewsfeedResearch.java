package com.vk.feed.core.models;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.dz5;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;

/* compiled from: NewsfeedResearch.kt */
/* loaded from: classes18.dex */
public final class NewsfeedResearch implements Serializer.StreamParcelable {
    public static final Serializer.c<NewsfeedResearch> CREATOR = new b();
    public final List<String> b;
    public final List<NewsfeedResearchEvent> c;

    /* compiled from: NewsfeedResearch.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
        public static NewsfeedResearch a(JSONObject jSONObject) {
            ?? r1;
            List H = dz5.H(jSONObject.optJSONArray("urls"));
            if (H == null) {
                H = EmptyList.b;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("events");
            Serializer.c<NewsfeedResearchEvent> cVar = NewsfeedResearchEvent.CREATOR;
            if (optJSONArray != null) {
                r1 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        r1.add(new NewsfeedResearchEvent(new UserId(optJSONObject.optLong("source_id")), optJSONObject.optString("item_id")));
                    }
                }
            } else {
                r1 = 0;
            }
            if (r1 == 0) {
                r1 = EmptyList.b;
            }
            return new NewsfeedResearch(H, r1);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<NewsfeedResearch> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsfeedResearch a(Serializer serializer) {
            ArrayList<String> h = serializer.h();
            List V = h != null ? j5g.V(h) : EmptyList.b;
            List k = serializer.k(NewsfeedResearchEvent.class);
            if (k == null) {
                k = EmptyList.b;
            }
            return new NewsfeedResearch(V, k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsfeedResearch[i];
        }
    }

    public NewsfeedResearch(List<String> list, List<NewsfeedResearchEvent> list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.b);
        serializer.W(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedResearch)) {
            return false;
        }
        NewsfeedResearch newsfeedResearch = (NewsfeedResearch) obj;
        return epx.f(this.b, newsfeedResearch.b) && epx.f(this.c, newsfeedResearch.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedResearch(urls=");
        sb.append(this.b);
        sb.append(", events=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
