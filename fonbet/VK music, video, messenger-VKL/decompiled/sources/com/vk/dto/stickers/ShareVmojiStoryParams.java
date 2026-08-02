package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.StoryBackground;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;

/* compiled from: ShareVmojiStoryParams.kt */
/* loaded from: classes18.dex */
public final class ShareVmojiStoryParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ShareVmojiStoryParams> CREATOR = new a();
    public final List<StickerRender> b;
    public final List<StoryBackground> c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ShareVmojiStoryParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ShareVmojiStoryParams a(Serializer serializer) {
            List k = serializer.k(StickerRender.class);
            if (k == null) {
                k = EmptyList.b;
            }
            List k2 = serializer.k(StoryBackground.class);
            if (k2 == null) {
                k2 = EmptyList.b;
            }
            return new ShareVmojiStoryParams(k, k2, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShareVmojiStoryParams[i];
        }
    }

    public ShareVmojiStoryParams(List<StickerRender> list, List<StoryBackground> list2, String str) {
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.W(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareVmojiStoryParams)) {
            return false;
        }
        ShareVmojiStoryParams shareVmojiStoryParams = (ShareVmojiStoryParams) obj;
        return epx.f(this.b, shareVmojiStoryParams.b) && epx.f(this.c, shareVmojiStoryParams.c) && epx.f(this.d, shareVmojiStoryParams.d);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareVmojiStoryParams(stickersRenders=");
        sb.append(this.b);
        sb.append(", backgrounds=");
        sb.append(this.c);
        sb.append(", message=");
        return ho8.a(sb, this.d, ')');
    }
}
