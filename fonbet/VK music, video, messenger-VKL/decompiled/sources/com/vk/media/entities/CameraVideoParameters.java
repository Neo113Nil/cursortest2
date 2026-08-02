package com.vk.media.entities;

import com.vk.core.serialize.Serializer;
import com.vk.media.model.CameraVideoEncoderParameters;
import java.util.List;
import xsna.epx;
import xsna.j5g;
import xsna.ms9;
import xsna.rl3;

/* compiled from: CameraVideoParameters.kt */
/* loaded from: classes3.dex */
public final class CameraVideoParameters extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CameraVideoParameters> CREATOR = new a();
    public final CameraVideoEncoderParameters b;
    public final List<Long> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CameraVideoParameters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CameraVideoParameters a(Serializer serializer) {
            return new CameraVideoParameters(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CameraVideoParameters[i];
        }
    }

    public CameraVideoParameters(CameraVideoEncoderParameters cameraVideoEncoderParameters, List<Long> list) {
        this.b = cameraVideoEncoderParameters;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.Z(j5g.P0(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraVideoParameters)) {
            return false;
        }
        CameraVideoParameters cameraVideoParameters = (CameraVideoParameters) obj;
        return epx.f(this.b, cameraVideoParameters.b) && epx.f(this.c, cameraVideoParameters.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraVideoParameters(encoderParams=");
        sb.append(this.b);
        sb.append(", selectedPeerIds=");
        return ms9.a(')', sb, this.c);
    }

    public CameraVideoParameters(Serializer serializer) {
        this((CameraVideoEncoderParameters) serializer.G(CameraVideoEncoderParameters.class.getClassLoader()), rl3.t0(serializer.e()));
    }
}
