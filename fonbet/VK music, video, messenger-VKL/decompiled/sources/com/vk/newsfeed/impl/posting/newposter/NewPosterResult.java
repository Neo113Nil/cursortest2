package com.vk.newsfeed.impl.posting.newposter;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSize;

/* compiled from: NewPosterResult.kt */
/* loaded from: classes4.dex */
public final class NewPosterResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NewPosterResult> CREATOR = new a();
    public final int b;
    public final ImageSize c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NewPosterResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NewPosterResult a(Serializer serializer) {
            return new NewPosterResult(serializer.u(), (ImageSize) serializer.G(ImageSize.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewPosterResult[i];
        }
    }

    public NewPosterResult(int i, ImageSize imageSize) {
        this.b = i;
        this.c = imageSize;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.i0(this.c);
    }
}
