package com.vk.dto.posting;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;

/* compiled from: DonutPostingSettings.kt */
/* loaded from: classes18.dex */
public final class DonutPostingSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<DonutPostingSettings> CREATOR = new a();
    public final List<Duration> b;

    /* compiled from: DonutPostingSettings.kt */
    public static final class Duration extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Duration> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Duration> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Duration a(Serializer serializer) {
                return new Duration(serializer.u(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Duration[i];
            }
        }

        public Duration(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Duration)) {
                return false;
            }
            Duration duration = (Duration) obj;
            return this.b == duration.b && epx.f(this.c, duration.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Duration(id=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DonutPostingSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DonutPostingSettings a(Serializer serializer) {
            return new DonutPostingSettings(serializer.j(Duration.CREATOR));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DonutPostingSettings[i];
        }
    }

    public DonutPostingSettings(List<Duration> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DonutPostingSettings) && epx.f(this.b, ((DonutPostingSettings) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("DonutPostingSettings(durations="), this.b);
    }
}
