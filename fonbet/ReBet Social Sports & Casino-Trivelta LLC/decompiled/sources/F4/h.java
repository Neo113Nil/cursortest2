package F4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f3556a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f3557b;

    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final AnimatedImageDrawable f3558a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f3558a = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.v
        public Class a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f3558a;
        }

        @Override // com.bumptech.glide.load.engine.v
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f3558a.getIntrinsicWidth();
            intrinsicHeight = this.f3558a.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * com.bumptech.glide.util.l.j(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // com.bumptech.glide.load.engine.v
        public void recycle() {
            this.f3558a.stop();
            this.f3558a.clearAnimationCallbacks();
        }
    }

    public static final class b implements com.bumptech.glide.load.l {

        /* renamed from: a, reason: collision with root package name */
        public final h f3559a;

        public b(h hVar) {
            this.f3559a = hVar;
        }

        @Override // com.bumptech.glide.load.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v b(ByteBuffer byteBuffer, int i10, int i11, com.bumptech.glide.load.j jVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f3559a.b(createSource, i10, i11, jVar);
        }

        @Override // com.bumptech.glide.load.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.j jVar) {
            return this.f3559a.d(byteBuffer);
        }
    }

    public static final class c implements com.bumptech.glide.load.l {

        /* renamed from: a, reason: collision with root package name */
        public final h f3560a;

        public c(h hVar) {
            this.f3560a = hVar;
        }

        @Override // com.bumptech.glide.load.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public v b(InputStream inputStream, int i10, int i11, com.bumptech.glide.load.j jVar) {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
            return this.f3560a.b(createSource, i10, i11, jVar);
        }

        @Override // com.bumptech.glide.load.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(InputStream inputStream, com.bumptech.glide.load.j jVar) {
            return this.f3560a.c(inputStream);
        }
    }

    public h(List list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f3556a = list;
        this.f3557b = bVar;
    }

    public static com.bumptech.glide.load.l a(List list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new b(new h(list, bVar));
    }

    public static com.bumptech.glide.load.l f(List list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new c(new h(list, bVar));
    }

    public v b(ImageDecoder.Source source, int i10, int i11, com.bumptech.glide.load.j jVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new D4.j(i10, i11, jVar));
        if (F4.b.a(decodeDrawable)) {
            return new a(F4.c.a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.f.f(this.f3556a, inputStream, this.f3557b));
    }

    public boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.f.g(this.f3556a, byteBuffer));
    }

    public final boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
