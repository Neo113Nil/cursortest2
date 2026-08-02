package com.vk.dto.newsfeed.activities;

import com.vk.core.serialize.Serializer;

/* compiled from: RepostToStoryActivity.kt */
/* loaded from: classes18.dex */
public final class RepostToStoryActivity extends Activity {
    public static final Serializer.c<RepostToStoryActivity> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RepostToStoryActivity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RepostToStoryActivity a(Serializer serializer) {
            return new RepostToStoryActivity();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RepostToStoryActivity[i];
        }
    }

    public RepostToStoryActivity() {
        super(4, null, 2, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
