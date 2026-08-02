package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import xsna.cl3;
import xsna.du8;
import xsna.nr2;
import xsna.rif0;
import xsna.wn00;

/* compiled from: ImageReader.java */
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: ImageReader.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b, reason: collision with other inner class name */
    public static final class C0101b implements b {
        public final com.bumptech.glide.load.data.c a;
        public final cl3 b;
        public final List<ImageHeaderParser> c;

        public C0101b(wn00 wn00Var, ArrayList arrayList, cl3 cl3Var) {
            nr2.r(cl3Var, "Argument must not be null");
            this.b = cl3Var;
            nr2.r(arrayList, "Argument must not be null");
            this.c = arrayList;
            this.a = new com.bumptech.glide.load.data.c(wn00Var, cl3Var);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final void a() {
            rif0 rif0Var = this.a.a;
            synchronized (rif0Var) {
                rif0Var.d = rif0Var.b.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            rif0 rif0Var = this.a.a;
            rif0Var.reset();
            return BitmapFactory.decodeStream(rif0Var, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final int c() throws IOException {
            rif0 rif0Var = this.a.a;
            rif0Var.reset();
            return com.bumptech.glide.load.a.a(this.c, rif0Var, this.b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final ImageHeaderParser.ImageType d() throws IOException {
            rif0 rif0Var = this.a.a;
            rif0Var.reset();
            return com.bumptech.glide.load.a.b(this.c, rif0Var, this.b);
        }
    }

    void a();

    @Nullable
    Bitmap b(BitmapFactory.Options options) throws IOException;

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;

    /* compiled from: ImageReader.java */
    public static final class a implements b {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;
        public final cl3 c;

        public a(ByteBuffer byteBuffer, ArrayList arrayList, cl3 cl3Var) {
            this.a = byteBuffer;
            this.b = arrayList;
            this.c = cl3Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new du8.a(du8.c(this.a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final int c() throws IOException {
            ByteBuffer c = du8.c(this.a);
            cl3 cl3Var = this.c;
            if (c != null) {
                List<ImageHeaderParser> list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int b = list.get(i).b(c, cl3Var);
                        if (b != -1) {
                            return b;
                        }
                    } finally {
                        du8.c(c);
                    }
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.a.c(this.b, du8.c(this.a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final void a() {
        }
    }

    /* compiled from: ImageReader.java */
    public static final class c implements b {
        public final cl3 a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, cl3 cl3Var) {
            nr2.r(cl3Var, "Argument must not be null");
            this.a = cl3Var;
            nr2.r(arrayList, "Argument must not be null");
            this.b = arrayList;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        @Nullable
        public final Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.c().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final int c() throws IOException {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            cl3 cl3Var = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                rif0 rif0Var = null;
                try {
                    rif0 rif0Var2 = new rif0(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), cl3Var);
                    try {
                        int a = imageHeaderParser.a(rif0Var2, cl3Var);
                        rif0Var2.m();
                        parcelFileDescriptorRewinder.c();
                        if (a != -1) {
                            return a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        rif0Var = rif0Var2;
                        if (rif0Var != null) {
                            rif0Var.m();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final ImageHeaderParser.ImageType d() throws IOException {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            cl3 cl3Var = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                rif0 rif0Var = null;
                try {
                    rif0 rif0Var2 = new rif0(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), cl3Var);
                    try {
                        ImageHeaderParser.ImageType d = imageHeaderParser.d(rif0Var2);
                        rif0Var2.m();
                        parcelFileDescriptorRewinder.c();
                        if (d != ImageHeaderParser.ImageType.UNKNOWN) {
                            return d;
                        }
                    } catch (Throwable th) {
                        th = th;
                        rif0Var = rif0Var2;
                        if (rif0Var != null) {
                            rif0Var.m();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.b
        public final void a() {
        }
    }
}
