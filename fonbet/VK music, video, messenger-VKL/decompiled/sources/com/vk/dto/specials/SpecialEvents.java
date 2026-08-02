package com.vk.dto.specials;

import android.graphics.Color;
import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.specials.SpecialEvent;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: SpecialEvents.kt */
/* loaded from: classes18.dex */
public final class SpecialEvents implements Serializer.StreamParcelable {
    public static final Serializer.c<SpecialEvents> CREATOR = new a();
    public final ArrayList<SpecialEvent> b;
    public final long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SpecialEvents> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SpecialEvents a(Serializer serializer) {
            return new SpecialEvents(serializer.j(SpecialEvent.CREATOR), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpecialEvents[i];
        }
    }

    public SpecialEvents() {
        this(null, 0L, 3, null);
    }

    public static final SpecialEvents e(JSONObject jSONObject) {
        int i;
        SpecialEvent.Animation animation;
        SpecialEvent.Markup markup;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                String optString = jSONObject2.optString("id");
                JSONObject optJSONObject = jSONObject2.optJSONObject("animation");
                if (optJSONObject != null) {
                    i = length;
                    animation = new SpecialEvent.Animation(optJSONObject.optString("url"), optJSONObject.optLong("duration"), optJSONObject.optInt("width", 231), optJSONObject.optInt("height", 204), optJSONObject.optLong("delay", 0L));
                } else {
                    i = length;
                    animation = null;
                }
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("popup");
                SpecialEvent.Popup popup = optJSONObject2 != null ? new SpecialEvent.Popup(optJSONObject2.optLong("delay")) : null;
                JSONObject optJSONObject3 = jSONObject2.optJSONObject("markup");
                if (optJSONObject3 != null) {
                    JSONArray optJSONArray2 = optJSONObject3.optJSONArray("colors");
                    int length2 = optJSONArray2 != null ? optJSONArray2.length() : 0;
                    int[] iArr = new int[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        try {
                            iArr[i3] = Color.parseColor(optJSONArray2.optString(i3));
                        } catch (Throwable unused) {
                            iArr[i3] = -16711936;
                        }
                    }
                    markup = new SpecialEvent.Markup(iArr);
                } else {
                    markup = null;
                }
                arrayList.add(new SpecialEvent(optString, animation, popup, markup));
                i2++;
                length = i;
            }
        }
        return new SpecialEvents(arrayList, jSONObject.optLong("delay", 3600000L));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.Y(this.c);
    }

    public final ArrayList<SpecialEvent> d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public SpecialEvents(ArrayList<SpecialEvent> arrayList, long j) {
        this.b = arrayList;
        this.c = j;
    }

    public /* synthetic */ SpecialEvents(ArrayList arrayList, long j, int i, zcl zclVar) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? 3600000L : j);
    }
}
