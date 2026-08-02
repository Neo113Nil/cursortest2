package com.vk.dto.polls;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
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
public final class PhotoPoll extends PollBackground {
    public static final Serializer.c<PhotoPoll> CREATOR = new b();
    public final List<ImageSize> d;
    public final Image e;
    public transient Bitmap f;
    public transient Bitmap g;

    /* compiled from: PollBackgrounds.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static PhotoPoll a(JSONObject jSONObject) {
            int i = jSONObject.getInt("id");
            int parseColor = Color.parseColor("#" + jSONObject.getString("color"));
            JSONArray jSONArray = jSONObject.getJSONArray("images");
            EmptyList emptyList = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        arrayList.add(new ImageSize(optJSONObject, (String) (objArr2 == true ? 1 : 0), 2, (zcl) (objArr == true ? 1 : 0)));
                    }
                }
                emptyList = arrayList;
            }
            if (emptyList == null) {
                emptyList = EmptyList.b;
            }
            return new PhotoPoll(i, parseColor, emptyList);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PhotoPoll> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoPoll a(Serializer serializer) {
            return new PhotoPoll(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoPoll[i];
        }
    }

    public PhotoPoll(int i, int i2, List<ImageSize> list) {
        super(i, i2, null);
        this.d = list;
        this.e = new Image(list);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.W(this.d);
    }

    @Override // com.vk.dto.polls.PollBackground, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.d.iterator();
            while (it.hasNext()) {
                jSONArray.put(((ImageSize) it.next()).e5());
            }
            e5.put("images", jSONArray);
            return e5;
        } catch (JSONException e) {
            L.i(e);
            return e5;
        }
    }

    @Override // com.vk.dto.polls.PollBackground
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return PhotoPoll.class.equals(obj != null ? obj.getClass() : null) && this.b == ((PhotoPoll) obj).b;
    }

    @Override // com.vk.dto.polls.PollBackground
    public final int hashCode() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotoPoll(Serializer serializer) {
        this(r0, r1, r4 == null ? EmptyList.b : r4);
        int u = serializer.u();
        int u2 = serializer.u();
        List l = serializer.l(ImageSize.class.getClassLoader());
    }
}
