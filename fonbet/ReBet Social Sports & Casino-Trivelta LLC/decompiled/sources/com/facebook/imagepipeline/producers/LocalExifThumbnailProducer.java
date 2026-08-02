package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.JfifUtil;
import com.facebook.soloader.InterfaceC3115g;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import u7.C6528b;

/* loaded from: classes2.dex */
public class LocalExifThumbnailProducer implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f30666a;

    /* renamed from: b, reason: collision with root package name */
    public final G6.i f30667b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f30668c;

    @InterfaceC3115g
    public class Api24Utils {
        public ExifInterface a(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }

        public Api24Utils() {
        }
    }

    public class a extends m0 {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.facebook.imagepipeline.request.b f30670f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3030n interfaceC3030n, g0 g0Var, e0 e0Var, String str, com.facebook.imagepipeline.request.b bVar) {
            super(interfaceC3030n, g0Var, e0Var, str);
            this.f30670f = bVar;
        }

        @Override // B6.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(H7.k kVar) {
            H7.k.r(kVar);
        }

        @Override // com.facebook.imagepipeline.producers.m0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(H7.k kVar) {
            return D6.g.of("createdThumbnail", Boolean.toString(kVar != null));
        }

        @Override // B6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public H7.k c() {
            ExifInterface g10 = LocalExifThumbnailProducer.this.g(this.f30670f.getSourceUri());
            if (g10 == null || !g10.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f30667b.d((byte[]) D6.k.g(g10.getThumbnail())), g10);
        }
    }

    public class b extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f30672a;

        public b(m0 m0Var) {
            this.f30672a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f30672a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, G6.i iVar, ContentResolver contentResolver) {
        this.f30666a = executor;
        this.f30667b = iVar;
        this.f30668c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean a(B7.g gVar) {
        return v0.b(512, 512, gVar);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        g0 z02 = e0Var.z0();
        com.facebook.imagepipeline.request.b D02 = e0Var.D0();
        e0Var.B("local", "exif");
        a aVar = new a(interfaceC3030n, z02, e0Var, "LocalExifThumbnailProducer", D02);
        e0Var.k(new b(aVar));
        this.f30666a.execute(aVar);
    }

    public final H7.k e(G6.h hVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> decodeDimensions = BitmapUtil.decodeDimensions(new G6.j(hVar));
        int h10 = h(exifInterface);
        int intValue = decodeDimensions != null ? ((Integer) decodeDimensions.first).intValue() : -1;
        int intValue2 = decodeDimensions != null ? ((Integer) decodeDimensions.second).intValue() : -1;
        H6.a D02 = H6.a.D0(hVar);
        try {
            H7.k kVar = new H7.k(D02);
            H6.a.U(D02);
            kVar.j2(C6528b.f66196b);
            kVar.k2(h10);
            kVar.n2(intValue);
            kVar.i2(intValue2);
            return kVar;
        } catch (Throwable th2) {
            H6.a.U(D02);
            throw th2;
        }
    }

    public boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    public ExifInterface g(Uri uri) {
        String e10 = com.facebook.common.util.f.e(this.f30668c, uri);
        if (e10 == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            E6.a.i(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(e10)) {
            return new ExifInterface(e10);
        }
        AssetFileDescriptor a10 = com.facebook.common.util.f.a(this.f30668c, uri);
        if (a10 != null) {
            ExifInterface a11 = new Api24Utils().a(a10.getFileDescriptor());
            a10.close();
            return a11;
        }
        return null;
    }

    public final int h(ExifInterface exifInterface) {
        return JfifUtil.getAutoRotateAngleFromOrientation(Integer.parseInt((String) D6.k.g(exifInterface.getAttribute("Orientation"))));
    }
}
