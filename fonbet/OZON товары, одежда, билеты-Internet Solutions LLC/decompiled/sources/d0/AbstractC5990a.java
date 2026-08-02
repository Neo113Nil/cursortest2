package d0;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Y0;
import com.google.android.gms.common.Scopes;
import d0.C5992c;
import java.util.Objects;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5990a implements InterfaceC6001l {

    /* renamed from: d0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0936a {
        @NonNull
        abstract AbstractC5990a a();

        @NonNull
        public final AbstractC5990a b() {
            AbstractC5990a a11 = a();
            if (Objects.equals(((C5992c) a11).a(), "audio/mp4a-latm") && a11.g() == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return a11;
        }

        @NonNull
        public abstract AbstractC0936a c(int i11);

        @NonNull
        public abstract AbstractC0936a d(int i11);

        @NonNull
        public abstract AbstractC0936a e(@NonNull Y0 y02);

        @NonNull
        public abstract AbstractC0936a f(@NonNull String str);

        @NonNull
        public abstract AbstractC0936a g(int i11);

        @NonNull
        public abstract AbstractC0936a h(int i11);
    }

    AbstractC5990a() {
    }

    @NonNull
    public static AbstractC0936a d() {
        C5992c.a aVar = new C5992c.a();
        aVar.g(-1);
        return aVar;
    }

    @Override // d0.InterfaceC6001l
    @NonNull
    public final MediaFormat c() {
        C5992c c5992c = (C5992c) this;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(c5992c.a(), h(), f());
        createAudioFormat.setInteger("bitrate", e());
        if (g() != -1) {
            if (c5992c.a().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", g());
                return createAudioFormat;
            }
            createAudioFormat.setInteger(Scopes.PROFILE, g());
        }
        return createAudioFormat;
    }

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
