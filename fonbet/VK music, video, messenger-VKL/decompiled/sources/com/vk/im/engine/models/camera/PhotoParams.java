package com.vk.im.engine.models.camera;

import com.vk.core.serialize.Serializer;
import java.io.File;
import xsna.epx;

/* compiled from: PhotoParams.kt */
/* loaded from: classes2.dex */
public final class PhotoParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PhotoParams> CREATOR = new a();
    public final File b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PhotoParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoParams a(Serializer serializer) {
            return new PhotoParams((File) serializer.C());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoParams[i];
        }
    }

    public PhotoParams(File file) {
        this.b = file;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotoParams) && epx.f(this.b, ((PhotoParams) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PhotoParams(localFile=" + this.b + ')';
    }
}
