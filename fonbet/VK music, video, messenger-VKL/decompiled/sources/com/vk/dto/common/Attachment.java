package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vkontakte.android.R;

/* compiled from: Attachment.kt */
/* loaded from: classes18.dex */
public abstract class Attachment extends Serializer.StreamParcelableAdapter implements Comparable<Attachment> {
    public transient boolean b;
    public volatile int c;
    public final int d = Integer.MAX_VALUE;
    public final int e = -1;

    public int Ab() {
        return this.e;
    }

    public int Bb() {
        return this.d;
    }

    public final void Cb() {
        this.b = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Attachment attachment) {
        return Bb() - attachment.Bb();
    }

    public int zb() {
        return R.string.attachment;
    }
}
