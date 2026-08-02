package com.vk.newsfeed.api.data;

import android.text.TextUtils;
import com.vk.core.serialize.Serializer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class NewsfeedList extends Serializer.StreamParcelableAdapter {
    public int b;
    public String c;
    public String d;
    public static final AtomicInteger e = new AtomicInteger(-10);
    public static final Serializer.c<NewsfeedList> CREATOR = new a();

    public class a extends Serializer.c<NewsfeedList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewsfeedList a(Serializer serializer) {
            NewsfeedList newsfeedList = new NewsfeedList();
            int u = serializer.u();
            String H = serializer.H();
            newsfeedList.c = H;
            if (TextUtils.isEmpty(H)) {
                newsfeedList.b = u;
            } else {
                newsfeedList.b = NewsfeedList.e.getAndDecrement();
            }
            newsfeedList.d = serializer.H();
            return newsfeedList;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewsfeedList[i];
        }
    }

    public NewsfeedList() {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewsfeedList newsfeedList = (NewsfeedList) obj;
        return (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(newsfeedList.c)) ? this.b == newsfeedList.b : this.c.equals(newsfeedList.c);
    }

    public final String getTitle() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.c;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.b;
    }

    public NewsfeedList(int i, String str) {
        this.b = i;
        this.d = str;
    }
}
