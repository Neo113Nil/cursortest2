package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;

/* compiled from: PageHistory.kt */
/* loaded from: classes18.dex */
public final class PageHistory extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<PageHistory> CREATOR = new b();
    public final List<String> b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;

    /* compiled from: PageHistory.kt */
    public static final class a {
        public static PageHistory a(List list, String str, String str2, long j, long j2) {
            ArrayList arrayList = new ArrayList(list.size());
            List list2 = list;
            if (list2 instanceof RandomAccess) {
                List list3 = list2;
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    String Ab = ((NewsEntry) list3.get(i)).Ab();
                    if (Ab != null) {
                        arrayList.add(Ab);
                    }
                }
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String Ab2 = ((NewsEntry) it.next()).Ab();
                    if (Ab2 != null) {
                        arrayList.add(Ab2);
                    }
                }
            }
            return new PageHistory(arrayList, str, str2, j, j2);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<PageHistory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PageHistory a(Serializer serializer) {
            return new PageHistory(serializer.h(), serializer.H(), serializer.H(), serializer.w(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PageHistory[i];
        }
    }

    public PageHistory(List<String> list, String str, String str2, long j, long j2) {
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.l0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.Y(this.e);
        serializer.Y(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.b;
        if ((list instanceof List) && (list instanceof RandomAccess)) {
            List<String> list2 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                jSONArray.put(list2.get(i));
            }
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        jSONObject.put("post_ids", jSONArray);
        String str = this.c;
        if (str == null) {
            str = "[null]";
        }
        jSONObject.put("start_from", str);
        String str2 = this.d;
        jSONObject.put("next_from", str2 != null ? str2 : "[null]");
        jSONObject.put("time_request", this.e);
        jSONObject.put("time_answer", this.f);
        return jSONObject;
    }
}
