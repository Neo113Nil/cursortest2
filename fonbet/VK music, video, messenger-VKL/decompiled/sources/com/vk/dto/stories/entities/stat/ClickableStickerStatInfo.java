package com.vk.dto.stories.entities.stat;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.epx;
import xsna.ms9;
import xsna.q2z;
import xsna.urd0;

/* compiled from: ClickableStickerStatInfo.kt */
/* loaded from: classes18.dex */
public final class ClickableStickerStatInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClickableStickerStatInfo> CREATOR = new b();
    public final long b;
    public final String c;
    public final List<Pair<String, String>> d;
    public final List<Pair<String, Integer>> e;
    public final List<Pair<String, Long>> f;

    /* compiled from: ClickableStickerStatInfo.kt */
    public static final class a {
        public ArrayList<Pair<String, String>> a;
        public ArrayList<Pair<String, Integer>> b;
        public ArrayList<Pair<String, Long>> c;

        public final void a(Integer num, String str) {
            if (num == null) {
                return;
            }
            if (this.b == null) {
                this.b = new ArrayList<>();
            }
            ArrayList<Pair<String, Integer>> arrayList = this.b;
            if (arrayList != null) {
                arrayList.add(new Pair<>(str, num));
            }
        }

        public final void b(String str, String str2) {
            if (str2 == null) {
                return;
            }
            if (this.a == null) {
                this.a = new ArrayList<>();
            }
            ArrayList<Pair<String, String>> arrayList = this.a;
            if (arrayList != null) {
                q2z.a(str, str2, arrayList);
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClickableStickerStatInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableStickerStatInfo a(Serializer serializer) {
            return new ClickableStickerStatInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableStickerStatInfo[i];
        }
    }

    public ClickableStickerStatInfo(long j, String str, List<Pair<String, String>> list, List<Pair<String, Integer>> list2, List<Pair<String, Long>> list3) {
        this.b = j;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.j0(this.c);
        serializer.h0(this.d);
        serializer.h0(this.e);
        serializer.h0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableStickerStatInfo)) {
            return false;
        }
        ClickableStickerStatInfo clickableStickerStatInfo = (ClickableStickerStatInfo) obj;
        return this.b == clickableStickerStatInfo.b && epx.f(this.c, clickableStickerStatInfo.c) && epx.f(this.d, clickableStickerStatInfo.d) && epx.f(this.e, clickableStickerStatInfo.e) && epx.f(this.f, clickableStickerStatInfo.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.b) * 31, 31, this.c);
        List<Pair<String, String>> list = this.d;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Pair<String, Integer>> list2 = this.e;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Pair<String, Long>> list3 = this.f;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickableStickerStatInfo(id=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", stringParams=");
        sb.append(this.d);
        sb.append(", intParams=");
        sb.append(this.e);
        sb.append(", longParams=");
        return ms9.a(')', sb, this.f);
    }

    public final JSONObject zb() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b);
        jSONObject.put("type", this.c);
        List<Pair<String, String>> list = this.d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                jSONObject.put((String) pair.i(), pair.j());
            }
        }
        List<Pair<String, Integer>> list2 = this.e;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                jSONObject.put((String) pair2.i(), ((Number) pair2.j()).intValue());
            }
        }
        List<Pair<String, Long>> list3 = this.f;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                Pair pair3 = (Pair) it3.next();
                jSONObject.put((String) pair3.i(), ((Number) pair3.j()).longValue());
            }
        }
        return jSONObject;
    }

    public ClickableStickerStatInfo(Serializer serializer) {
        this(serializer.w(), serializer.H(), serializer.D(), serializer.D(), serializer.D());
    }
}
