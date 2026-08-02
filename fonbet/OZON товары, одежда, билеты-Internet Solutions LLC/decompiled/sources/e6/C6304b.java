package e6;

import T5.i;
import T5.k;
import V5.v;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import b5.C5544e;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p6.C8861a;
import p6.l;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6304b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f62017a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.b f62018b;

    /* renamed from: e6.b$a */
    /* loaded from: classes8.dex */
    private static final class a implements v<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final AnimatedImageDrawable f62019a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f62019a = animatedImageDrawable;
        }

        @Override // V5.v
        public final void a() {
            this.f62019a.stop();
            this.f62019a.clearAnimationCallbacks();
        }

        @Override // V5.v
        @NonNull
        public final Class<Drawable> b() {
            return Drawable.class;
        }

        @Override // V5.v
        @NonNull
        public final Drawable get() {
            return this.f62019a;
        }

        @Override // V5.v
        public final int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f62019a.getIntrinsicWidth();
            intrinsicHeight = this.f62019a.getIntrinsicHeight();
            return l.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
        }
    }

    /* renamed from: e6.b$b, reason: collision with other inner class name */
    private static final class C0972b implements k<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final C6304b f62020a;

        C0972b(C6304b c6304b) {
            this.f62020a = c6304b;
        }

        @Override // T5.k
        public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull i iVar) throws IOException {
            return this.f62020a.d(byteBuffer);
        }

        @Override // T5.k
        public final v<Drawable> b(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return C6304b.b(createSource, i11, i12, iVar);
        }
    }

    /* renamed from: e6.b$c */
    private static final class c implements k<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final C6304b f62021a;

        c(C6304b c6304b) {
            this.f62021a = c6304b;
        }

        @Override // T5.k
        public final boolean a(@NonNull InputStream inputStream, @NonNull i iVar) throws IOException {
            return this.f62021a.c(inputStream);
        }

        @Override // T5.k
        public final v<Drawable> b(@NonNull InputStream inputStream, int i11, int i12, @NonNull i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(C8861a.b(inputStream));
            return C6304b.b(createSource, i11, i12, iVar);
        }
    }

    private C6304b(ArrayList arrayList, W5.b bVar) {
        this.f62017a = arrayList;
        this.f62018b = bVar;
    }

    public static k a(ArrayList arrayList, W5.b bVar) {
        return new C0972b(new C6304b(arrayList, bVar));
    }

    static v b(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull i iVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new b6.h(i11, i12, iVar));
        if (C5544e.a(decodeDrawable)) {
            return new a(androidx.activity.v.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public static k e(ArrayList arrayList, W5.b bVar) {
        return new c(new C6304b(arrayList, bVar));
    }

    final boolean c(InputStream inputStream) throws IOException {
        ImageHeaderParser.ImageType d11 = com.bumptech.glide.load.c.d(this.f62017a, inputStream, this.f62018b);
        if (d11 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && d11 == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    final boolean d(ByteBuffer byteBuffer) throws IOException {
        ImageHeaderParser.ImageType e11 = com.bumptech.glide.load.c.e(this.f62017a, byteBuffer);
        if (e11 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && e11 == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
