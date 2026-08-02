package com.vk.catalog2.common.ui.mvp.auto;

import android.content.Context;
import android.support.v4.media.MediaDescriptionCompat;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ho8;
import xsna.izs;
import xsna.k8u0;
import xsna.r22;
import xsna.s22;

/* compiled from: AndroidAutoPlaybackQueueManager.kt */
/* loaded from: classes16.dex */
public final class b {
    public final Context a;
    public final r22 b;
    public final k8u0 c;
    public final String d;
    public Object e = EmptyList.b;
    public final List<izs<a, MediaDescriptionCompat>> f = Collections.singletonList(new c(1, this, b.class, "createShuffleQueueItem", "createShuffleQueueItem(Lcom/vk/catalog2/common/ui/mvp/auto/AndroidAutoPlaybackQueueManager$LastPlayContext;)Landroid/support/v4/media/MediaDescriptionCompat;", 0));

    /* compiled from: AndroidAutoPlaybackQueueManager.kt */
    public static final class a {
        public final MusicPlaybackLaunchContext a;
        public final String b;

        public a(MusicPlaybackLaunchContext musicPlaybackLaunchContext, String str) {
            this.a = musicPlaybackLaunchContext;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LastPlayContext(launchContext=");
            sb.append(this.a);
            sb.append(", blockId=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public b(Context context, s22 s22Var, k8u0 k8u0Var) {
        this.a = context;
        this.b = s22Var;
        this.c = k8u0Var;
        this.d = context.getString(R.string.android_auto_queue_title);
    }
}
