package com.vk.dto.polls;

import android.graphics.Color;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSize;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: PollBackgrounds.kt */
/* loaded from: classes18.dex */
public final class PollTile extends PollBackground {
    public static final Serializer.c<PollTile> CREATOR = new b();
    public final int d;
    public final int e;
    public final List<ImageSize> f;

    /* compiled from: PollBackgrounds.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static PollTile a(JSONObject jSONObject) {
            int i = jSONObject.getInt("id");
            int parseColor = Color.parseColor("#" + jSONObject.getString("color"));
            int i2 = jSONObject.getInt("width");
            int i3 = jSONObject.getInt("height");
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            EmptyList emptyList = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                    if (optJSONObject != null) {
                        arrayList.add(new ImageSize(optJSONObject, (String) (objArr2 == true ? 1 : 0), 2, (zcl) (objArr == true ? 1 : 0)));
                    }
                }
                emptyList = arrayList;
            }
            if (emptyList == null) {
                emptyList = EmptyList.b;
            }
            return new PollTile(i, parseColor, i2, i3, emptyList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PollTile> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PollTile a(Serializer serializer) {
            return new PollTile(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollTile[i];
        }
    }

    public PollTile(int i, int i2, int i3, int i4, List<ImageSize> list) {
        super(i, i2, null);
        this.d = i3;
        this.e = i4;
        this.f = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.W(this.f);
    }

    @Override // com.vk.dto.polls.PollBackground, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.f.iterator();
            while (it.hasNext()) {
                jSONArray.put(((ImageSize) it.next()).e5());
            }
            e5.put("width", this.d).put("height", this.e).put("images", jSONArray);
            return e5;
        } catch (JSONException e) {
            L.i(e);
            return e5;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PollTile(Serializer serializer) {
        this(r1, r2, r3, r4, r7 == null ? EmptyList.b : r7);
        int u = serializer.u();
        int u2 = serializer.u();
        int u3 = serializer.u();
        int u4 = serializer.u();
        List l = serializer.l(ImageSize.class.getClassLoader());
    }
}
