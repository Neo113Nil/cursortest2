package com.vk.media.entities;

import com.vk.core.serialize.Serializer;
import java.io.File;
import java.util.List;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.rl3;

/* compiled from: CameraPhotoParameters.kt */
/* loaded from: classes3.dex */
public final class CameraPhotoParameters extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CameraPhotoParameters> CREATOR = new a();
    public final File b;
    public final List<Long> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CameraPhotoParameters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CameraPhotoParameters a(Serializer serializer) {
            return new CameraPhotoParameters(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CameraPhotoParameters[i];
        }
    }

    public CameraPhotoParameters(File file, List<Long> list) {
        this.b = file;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.Z(j5g.P0(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPhotoParameters)) {
            return false;
        }
        CameraPhotoParameters cameraPhotoParameters = (CameraPhotoParameters) obj;
        return epx.f(this.b, cameraPhotoParameters.b) && epx.f(this.c, cameraPhotoParameters.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraPhotoParameters(photo=");
        sb.append(this.b);
        sb.append(", selectedPeerIds=");
        return ms9.a(')', sb, this.c);
    }

    public CameraPhotoParameters(Serializer serializer) {
        this((File) serializer.C(), rl3.t0(serializer.e()));
    }
}
