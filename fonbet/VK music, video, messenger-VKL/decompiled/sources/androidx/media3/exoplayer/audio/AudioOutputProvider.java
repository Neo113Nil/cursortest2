package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.cbl;
import xsna.dvf;
import xsna.nc4;

/* loaded from: classes12.dex */
public interface AudioOutputProvider {

    public static final class ConfigurationException extends Exception {
    }

    public static final class InitializationException extends Exception {
    }

    public static final class a {
        public final androidx.media3.common.a a;
        public final nc4 b;

        @Nullable
        public final AudioDeviceInfo c;
        public final boolean d;
        public final int e;
        public final int f;
        public final boolean g;
        public final int h;

        /* renamed from: androidx.media3.exoplayer.audio.AudioOutputProvider$a$a, reason: collision with other inner class name */
        public static final class C0047a {
            public final androidx.media3.common.a a;

            @Nullable
            public AudioDeviceInfo c;
            public boolean d;
            public boolean g;
            public nc4 b = nc4.c;
            public int e = 0;
            public int f = -1;
            public int h = -1;

            public C0047a(androidx.media3.common.a aVar) {
                this.a = aVar;
            }
        }

        public a(C0047a c0047a) {
            this.a = c0047a.a;
            this.b = c0047a.b;
            this.c = c0047a.c;
            this.d = c0047a.d;
            this.e = c0047a.e;
            this.f = c0047a.f;
            this.g = c0047a.g;
            this.h = c0047a.h;
        }
    }

    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final int d;

        public static final class a {
            public boolean a;
            public boolean b;
            public boolean c;
            public int d = 0;

            public final b a() {
                if (this.a || !(this.b || this.c)) {
                    return new b(this);
                }
                throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            }
        }

        static {
            new a().a();
        }

        public b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
        }
    }

    public interface c {
        void a();
    }

    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final nc4 g;
        public final int h;
        public final int i;
        public final boolean j;
        public final boolean k;

        public static final class a {
            public int a;
            public int b;
            public int c;
            public boolean d;
            public boolean e;
            public int f;
            public nc4 g;
            public int h;
            public int i;
            public boolean j;
            public boolean k;
        }

        public d(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
            this.k = aVar.k;
        }

        public final a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            return aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && this.k == dVar.k && this.g.equals(dVar.g);
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
        }
    }

    b d(a aVar);

    AudioTrackAudioOutput e(d dVar) throws InitializationException;

    void f(cbl cblVar);

    d g(a aVar) throws ConfigurationException;

    void release();

    default void c(dvf dvfVar) {
    }
}
