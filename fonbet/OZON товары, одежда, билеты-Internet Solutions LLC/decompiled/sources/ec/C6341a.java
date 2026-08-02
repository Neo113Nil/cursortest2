package ec;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import bc.AbstractC5640p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Set;
import pl.droidsonroids.gif.GifDrawable;

/* renamed from: ec.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6341a extends AbstractC5640p {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f62107a = true;

    protected C6341a() {
        if (!AbstractC6342b.a()) {
            throw new IllegalStateException("`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder");
        }
    }

    @NonNull
    public static C6341a b() {
        return new C6341a();
    }

    @NonNull
    protected static GifDrawable c(@NonNull byte[] bArr) throws IOException {
        return new GifDrawable(bArr);
    }

    @Override // bc.AbstractC5640p
    @NonNull
    public final Drawable a(@NonNull InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            try {
                GifDrawable c11 = c(byteArrayOutputStream.toByteArray());
                if (!this.f62107a) {
                    c11.pause();
                }
                return c11;
            } catch (IOException e11) {
                throw new IllegalStateException("Exception creating GifDrawable", e11);
            }
        } catch (IOException e12) {
            throw new IllegalStateException("Cannot read GIF input-stream", e12);
        }
    }

    @NonNull
    public final Set d() {
        return Collections.singleton("image/gif");
    }
}
