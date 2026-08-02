package com.vk.dto.newsfeed.activities;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;

/* compiled from: EventActivity.kt */
/* loaded from: classes18.dex */
public final class EventActivity extends Activity {
    public static final Serializer.c<EventActivity> CREATOR = new a();
    public final int d;
    public final String e;
    public int f;
    public final String g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<EventActivity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EventActivity a(Serializer serializer) {
            return new EventActivity(serializer.u(), serializer.H(), serializer.u(), serializer.H(), serializer.H(), serializer.h());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EventActivity[i];
        }
    }

    public EventActivity(int i, String str, int i2, String str2, String str3, ArrayList<String> arrayList) {
        super(3, arrayList);
        this.d = i;
        this.e = str;
        this.f = i2;
        this.g = str2;
        this.h = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.l0(this.c);
    }
}
