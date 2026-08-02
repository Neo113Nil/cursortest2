package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.photo.Photo;

/* compiled from: NamedActionLink.kt */
/* loaded from: classes18.dex */
public final class NamedActionLink extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<NamedActionLink> CREATOR = new a();
    public final ActionOpenUrl b;
    public final String c;
    public final String d;
    public final Photo e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<NamedActionLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final NamedActionLink a(Serializer serializer) {
            ActionOpenUrl actionOpenUrl = (ActionOpenUrl) serializer.G(ActionOpenUrl.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            String str = H2 != null ? H2 : "";
            Photo photo = (Photo) serializer.G(Photo.class.getClassLoader());
            if (photo == null) {
                photo = new Photo(Image.d);
            }
            return new NamedActionLink(actionOpenUrl, H, str, photo);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NamedActionLink[i];
        }
    }

    public NamedActionLink(ActionOpenUrl actionOpenUrl, String str, String str2, Photo photo) {
        this.b = actionOpenUrl;
        this.c = str;
        this.d = str2;
        this.e = photo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
    }
}
