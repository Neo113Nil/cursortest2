package c6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p6.C8861a;

/* loaded from: classes.dex */
interface u {

    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f56596a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f56597b;

        /* renamed from: c, reason: collision with root package name */
        private final W5.b f56598c;

        a(ByteBuffer byteBuffer, ArrayList arrayList, W5.b bVar) {
            this.f56596a = byteBuffer;
            this.f56597b = arrayList;
            this.f56598c = bVar;
        }

        @Override // c6.u
        public final void a() {
        }

        @Override // c6.u
        public final int b() throws IOException {
            ByteBuffer c11 = C8861a.c(this.f56596a);
            W5.b bVar = this.f56598c;
            if (c11 != null) {
                ArrayList arrayList = this.f56597b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    try {
                        int a11 = ((ImageHeaderParser) arrayList.get(i11)).a(c11, bVar);
                        if (a11 != -1) {
                            return a11;
                        }
                    } finally {
                    }
                }
            }
            return -1;
        }

        @Override // c6.u
        public final Bitmap c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(C8861a.f(C8861a.c(this.f56596a)), null, options);
        }

        @Override // c6.u
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.c.e(this.f56597b, C8861a.c(this.f56596a));
        }
    }

    /* loaded from: classes8.dex */
    public static final class b implements u {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f56599a;

        /* renamed from: b, reason: collision with root package name */
        private final W5.b f56600b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f56601c;

        b(p6.i iVar, ArrayList arrayList, W5.b bVar) {
            p6.k.c(bVar, "Argument must not be null");
            this.f56600b = bVar;
            p6.k.c(arrayList, "Argument must not be null");
            this.f56601c = arrayList;
            this.f56599a = new com.bumptech.glide.load.data.k(iVar, bVar);
        }

        @Override // c6.u
        public final void a() {
            this.f56599a.b();
        }

        @Override // c6.u
        public final int b() throws IOException {
            return com.bumptech.glide.load.c.b(this.f56601c, this.f56599a.c(), this.f56600b);
        }

        @Override // c6.u
        public final Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f56599a.c(), null, options);
        }

        @Override // c6.u
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.c.d(this.f56601c, this.f56599a.c(), this.f56600b);
        }
    }

    /* loaded from: classes8.dex */
    public static final class c implements u {

        /* renamed from: a, reason: collision with root package name */
        private final W5.b f56602a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f56603b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f56604c;

        c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, W5.b bVar) {
            p6.k.c(bVar, "Argument must not be null");
            this.f56602a = bVar;
            p6.k.c(arrayList, "Argument must not be null");
            this.f56603b = arrayList;
            this.f56604c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // c6.u
        public final void a() {
        }

        @Override // c6.u
        public final int b() throws IOException {
            return com.bumptech.glide.load.c.a(this.f56603b, this.f56604c, this.f56602a);
        }

        @Override // c6.u
        public final Bitmap c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f56604c.b().getFileDescriptor(), null, options);
        }

        @Override // c6.u
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.c.c(this.f56603b, this.f56604c, this.f56602a);
        }
    }

    void a();

    int b() throws IOException;

    Bitmap c(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
