package com.vk.auth;

import com.vk.core.serialize.Serializer;
import com.vk.registration.funnels.TrackingElement;
import xsna.epx;
import xsna.ho8;

/* compiled from: RegistrationTrackingElement.kt */
/* loaded from: classes15.dex */
public final class RegistrationTrackingElement extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<RegistrationTrackingElement> CREATOR = new a();
    public final TrackingElement.Registration b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RegistrationTrackingElement> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RegistrationTrackingElement a(Serializer serializer) {
            return new RegistrationTrackingElement(TrackingElement.Registration.values()[serializer.u()], serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RegistrationTrackingElement[i];
        }
    }

    public RegistrationTrackingElement(TrackingElement.Registration registration, String str) {
        this.b = registration;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistrationTrackingElement)) {
            return false;
        }
        RegistrationTrackingElement registrationTrackingElement = (RegistrationTrackingElement) obj;
        return this.b == registrationTrackingElement.b && epx.f(this.c, registrationTrackingElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationTrackingElement(name=");
        sb.append(this.b);
        sb.append(", value=");
        return ho8.a(sb, this.c, ')');
    }

    public final TrackingElement.Registration zb() {
        return this.b;
    }
}
