package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a f104645a;

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InputConfiguration f104646a;

        a(@NonNull InputConfiguration inputConfiguration) {
            this.f104646a = inputConfiguration;
        }

        @Override // x.f.c
        public final InputConfiguration a() {
            return this.f104646a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f104646a, ((c) obj).a());
        }

        public final int hashCode() {
            return this.f104646a.hashCode();
        }

        @NonNull
        public final String toString() {
            return this.f104646a.toString();
        }
    }

    private static final class b extends a {
    }

    private interface c {
        InputConfiguration a();
    }

    private f(@NonNull a aVar) {
        this.f104645a = aVar;
    }

    public static f b(InputConfiguration inputConfiguration) {
        if (inputConfiguration == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new f(new b(inputConfiguration)) : new f(new a(inputConfiguration));
    }

    public final Object a() {
        return this.f104645a.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f104645a.equals(((f) obj).f104645a);
    }

    public final int hashCode() {
        return this.f104645a.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.f104645a.toString();
    }
}
