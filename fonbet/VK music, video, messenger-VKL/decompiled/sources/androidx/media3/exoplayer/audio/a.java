package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;

/* compiled from: AudioOffloadSupport.java */
/* loaded from: classes12.dex */
public final class a {
    public static final a d = new C0048a().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* compiled from: AudioOffloadSupport.java */
    /* renamed from: androidx.media3.exoplayer.audio.a$a, reason: collision with other inner class name */
    public static final class C0048a {
        public boolean a;
        public boolean b;
        public boolean c;

        public final a a() {
            if (this.a || !(this.b || this.c)) {
                return new a(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public a(C0048a c0048a) {
        this.a = c0048a.a;
        this.b = c0048a.b;
        this.c = c0048a.c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
