package com.vk.dto.stories.entities.stat;

import com.vk.core.serialize.Serializer;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;

/* compiled from: StoryStatContainer.kt */
/* loaded from: classes18.dex */
public final class StoryStatContainer extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryStatContainer> CREATOR = new b();
    public final List<TextStatInfo> b;
    public final List<StickersStatInfo> c;
    public final List<DrawingStatInfo> d;
    public final List<String> e;
    public final List<ClickableStickerStatInfo> f;
    public final BackgroundInfo g;

    /* compiled from: StoryStatContainer.kt */
    public static final class a {
        public static JSONArray a(List list) {
            if (list.isEmpty()) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((ClickableStickerStatInfo) it.next()).zb());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONArray.put((JSONObject) it2.next());
            }
            return jSONArray;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<StoryStatContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryStatContainer a(Serializer serializer) {
            List list;
            List list2;
            List list3;
            List list4;
            ArrayList l = serializer.l(TextStatInfo.class.getClassLoader());
            if (l == null || (list = j5g.O0(l)) == null) {
                list = EmptyList.b;
            }
            ArrayList l2 = serializer.l(StickersStatInfo.class.getClassLoader());
            if (l2 == null || (list2 = j5g.O0(l2)) == null) {
                list2 = EmptyList.b;
            }
            ArrayList l3 = serializer.l(DrawingStatInfo.class.getClassLoader());
            if (l3 == null || (list3 = j5g.O0(l3)) == null) {
                list3 = EmptyList.b;
            }
            ArrayList<String> h = serializer.h();
            ArrayList l4 = serializer.l(ClickableStickerStatInfo.class.getClassLoader());
            if (l4 == null || (list4 = j5g.O0(l4)) == null) {
                list4 = EmptyList.b;
            }
            return new StoryStatContainer(list, list2, list3, h, list4, (BackgroundInfo) serializer.G(BackgroundInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryStatContainer[i];
        }
    }

    public StoryStatContainer(List<TextStatInfo> list, List<StickersStatInfo> list2, List<DrawingStatInfo> list3, List<String> list4, List<ClickableStickerStatInfo> list5, BackgroundInfo backgroundInfo) {
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = backgroundInfo;
    }

    public final JSONArray Ab() {
        List<TextStatInfo> list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        List<TextStatInfo> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (TextStatInfo textStatInfo : list2) {
            textStatInfo.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", textStatInfo.b);
            jSONObject.put("font", textStatInfo.c);
            jSONObject.put("size", textStatInfo.d);
            jSONObject.put("color", textStatInfo.e);
            jSONObject.put(L2.g, textStatInfo.f);
            jSONObject.put("align", textStatInfo.g);
            arrayList.add(jSONObject);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        return jSONArray;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.W(this.c);
        serializer.W(this.d);
        serializer.l0(this.e);
        serializer.W(this.f);
        serializer.i0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryStatContainer)) {
            return false;
        }
        StoryStatContainer storyStatContainer = (StoryStatContainer) obj;
        return epx.f(this.b, storyStatContainer.b) && epx.f(this.c, storyStatContainer.c) && epx.f(this.d, storyStatContainer.d) && epx.f(this.e, storyStatContainer.e) && epx.f(this.f, storyStatContainer.f) && epx.f(this.g, storyStatContainer.g);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        BackgroundInfo backgroundInfo = this.g;
        return a2 + (backgroundInfo == null ? 0 : backgroundInfo.hashCode());
    }

    public final String toString() {
        return "StoryStatContainer(textStickerInfo=" + this.b + ", stickerStatInfo=" + this.c + ", drawingStatInfo=" + this.d + ", emojiStatInfo=" + this.e + ", clickableStickerStatInfo=" + this.f + ", backgroundInfo=" + this.g + ')';
    }

    public final List<StickersStatInfo> zb() {
        return this.c;
    }
}
