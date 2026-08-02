package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.F;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f {

    public class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f29952a;

        public a(InputStream inputStream) {
            this.f29952a = inputStream;
        }

        @Override // com.bumptech.glide.load.f.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f29952a);
            } finally {
                this.f29952a.reset();
            }
        }
    }

    public class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f29953a;

        public b(ByteBuffer byteBuffer) {
            this.f29953a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.f.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f29953a);
            } finally {
                com.bumptech.glide.util.a.d(this.f29953a);
            }
        }
    }

    public class c implements h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f29954a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f29955b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29954a = parcelFileDescriptorRewinder;
            this.f29955b = bVar;
        }

        @Override // com.bumptech.glide.load.f.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            F f10 = null;
            try {
                F f11 = new F(new FileInputStream(this.f29954a.a().getFileDescriptor()), this.f29955b);
                try {
                    ImageHeaderParser.ImageType c10 = imageHeaderParser.c(f11);
                    f11.r();
                    this.f29954a.a();
                    return c10;
                } catch (Throwable th2) {
                    th = th2;
                    f10 = f11;
                    if (f10 != null) {
                        f10.r();
                    }
                    this.f29954a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f29956a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f29957b;

        public d(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29956a = byteBuffer;
            this.f29957b = bVar;
        }

        @Override // com.bumptech.glide.load.f.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f29956a, this.f29957b);
            } finally {
                com.bumptech.glide.util.a.d(this.f29956a);
            }
        }
    }

    public class e implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f29958a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f29959b;

        public e(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29958a = inputStream;
            this.f29959b = bVar;
        }

        @Override // com.bumptech.glide.load.f.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f29958a, this.f29959b);
            } finally {
                this.f29958a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$f, reason: collision with other inner class name */
    public class C0472f implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptorRewinder f29960a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f29961b;

        public C0472f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f29960a = parcelFileDescriptorRewinder;
            this.f29961b = bVar;
        }

        @Override // com.bumptech.glide.load.f.g
        public int a(ImageHeaderParser imageHeaderParser) {
            F f10 = null;
            try {
                F f11 = new F(new FileInputStream(this.f29960a.a().getFileDescriptor()), this.f29961b);
                try {
                    int d10 = imageHeaderParser.d(f11, this.f29961b);
                    f11.r();
                    this.f29960a.a();
                    return d10;
                } catch (Throwable th2) {
                    th = th2;
                    f10 = f11;
                    if (f10 != null) {
                        f10.r();
                    }
                    this.f29960a.a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return d(list, new C0472f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new F(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    public static int d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = gVar.a((ImageHeaderParser) list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new F(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    public static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = hVar.a((ImageHeaderParser) list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
