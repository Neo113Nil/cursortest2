package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.entries.Poster;
import java.util.List;
import kotlin.Pair;
import xsna.drm0;

/* compiled from: SaveCustomPosterResponse.kt */
/* loaded from: classes18.dex */
public final class SaveCustomPosterResponse extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SaveCustomPosterResponse> CREATOR = new a();
    public final ImageSize b;
    public final String c;
    public final String d;
    public final transient int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SaveCustomPosterResponse> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SaveCustomPosterResponse a(Serializer serializer) {
            ImageSize imageSize = (ImageSize) serializer.G(ImageSize.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new SaveCustomPosterResponse(imageSize, H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SaveCustomPosterResponse[i];
        }
    }

    public SaveCustomPosterResponse(ImageSize imageSize, String str, String str2) {
        int i;
        this.b = imageSize;
        this.c = str;
        this.d = str2;
        Serializer.c<Poster> cVar = Poster.CREATOR;
        int i2 = 0;
        try {
            List b0 = drm0.b0(str == null ? "" : str, new char[]{'_'}, 0, 6);
            i = Integer.parseInt((String) b0.get(0));
            try {
                i2 = Integer.parseInt((String) b0.get(1));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            i = 0;
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        ((Number) pair.i()).intValue();
        this.e = ((Number) pair.j()).intValue();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }
}
