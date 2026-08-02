package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public interface B {

    public static final class a implements B {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f29979a;

        /* renamed from: b, reason: collision with root package name */
        public final List f29980b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f29981c;

        public a(ByteBuffer byteBuffer, List list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29979a = byteBuffer;
            this.f29980b = list;
            this.f29981c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public int c() {
            return com.bumptech.glide.load.f.c(this.f29980b, com.bumptech.glide.util.a.d(this.f29979a), this.f29981c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.f.g(this.f29980b, com.bumptech.glide.util.a.d(this.f29979a));
        }

        public final InputStream e() {
            return com.bumptech.glide.util.a.g(com.bumptech.glide.util.a.d(this.f29979a));
        }
    }

    public static final class b implements B {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.data.k f29982a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f29983b;

        /* renamed from: c, reason: collision with root package name */
        public final List f29984c;

        public b(InputStream inputStream, List list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29983b = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar);
            this.f29984c = (List) com.bumptech.glide.util.k.d(list);
            this.f29982a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f29982a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public void b() {
            this.f29982a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public int c() {
            return com.bumptech.glide.load.f.b(this.f29984c, this.f29982a.a(), this.f29983b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.f.f(this.f29984c, this.f29982a.a(), this.f29983b);
        }
    }

    public static final class c implements B {

        /* renamed from: a, reason: collision with root package name */
        public final com.bumptech.glide.load.engine.bitmap_recycle.b f29985a;

        /* renamed from: b, reason: collision with root package name */
        public final List f29986b;

        /* renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f29987c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29985a = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.k.d(bVar);
            this.f29986b = (List) com.bumptech.glide.util.k.d(list);
            this.f29987c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f29987c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public int c() {
            return com.bumptech.glide.load.f.a(this.f29986b, this.f29987c, this.f29985a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.f.e(this.f29986b, this.f29987c, this.f29985a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
