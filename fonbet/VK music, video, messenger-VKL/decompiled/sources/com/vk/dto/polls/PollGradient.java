package com.vk.dto.polls;

import android.graphics.Color;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.f370;

/* compiled from: PollBackgrounds.kt */
/* loaded from: classes18.dex */
public final class PollGradient extends PollBackground {
    public static final Serializer.c<PollGradient> CREATOR = new b();
    public final int d;
    public final List<GradientPoint> e;
    public final String f;

    /* compiled from: PollBackgrounds.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
        public static PollGradient a(JSONObject jSONObject) {
            List list;
            int i = jSONObject.getInt("id");
            int parseColor = Color.parseColor("#" + jSONObject.getString("color"));
            int i2 = jSONObject.getInt("angle");
            JSONArray jSONArray = jSONObject.getJSONArray("points");
            if (jSONArray != null) {
                list = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                    if (optJSONObject != null) {
                        list.add(new GradientPoint(optJSONObject));
                    }
                }
            } else {
                list = 0;
            }
            if (list == 0) {
                list = EmptyList.b;
            }
            return new PollGradient(i, parseColor, i2, list, f370.D(jSONObject, "name"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PollGradient> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PollGradient a(Serializer serializer) {
            return new PollGradient(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PollGradient[i];
        }
    }

    public PollGradient(int i, int i2, int i3, List<GradientPoint> list, String str) {
        super(i, i2, null);
        this.d = i3;
        this.e = list;
        this.f = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.W(this.e);
        serializer.j0(this.f);
    }

    @Override // com.vk.dto.polls.PollBackground, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((GradientPoint) it.next()).e5());
            }
            e5.put("angle", this.d).put("points", jSONArray).put("name", this.f);
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
    public PollGradient(Serializer serializer) {
        this(r1, r2, r3, r0 == null ? EmptyList.b : r0, serializer.H());
        int u = serializer.u();
        int u2 = serializer.u();
        int u3 = serializer.u();
        List l = serializer.l(GradientPoint.class.getClassLoader());
    }
}
