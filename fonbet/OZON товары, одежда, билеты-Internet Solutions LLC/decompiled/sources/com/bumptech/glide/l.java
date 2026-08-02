package com.bumptech.glide;

import Z5.A;
import Z5.C4897a;
import Z5.b;
import Z5.d;
import Z5.e;
import Z5.g;
import Z5.l;
import Z5.q;
import Z5.u;
import Z5.w;
import Z5.x;
import Z5.y;
import Z5.z;
import a6.C4953a;
import a6.C4954b;
import a6.c;
import a6.d;
import a6.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import c6.B;
import c6.C5749a;
import c6.C5750b;
import c6.C5751c;
import c6.C5755g;
import c6.D;
import c6.F;
import c6.r;
import c6.v;
import c6.x;
import c6.z;
import com.bumptech.glide.d;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import d6.C6094a;
import e6.C6304b;
import e6.C6309g;
import e6.C6310h;
import f6.C6439a;
import g6.C6653a;
import h6.C6813a;
import h6.C6814b;
import h6.C6815c;
import h6.C6816d;
import j6.AbstractC7287a;
import j6.InterfaceC7288b;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class l {
    static j a(c cVar, List<InterfaceC7288b> list, AbstractC7287a abstractC7287a) {
        T5.k c5755g;
        T5.k b11;
        String str;
        W5.d c11 = cVar.c();
        W5.b b12 = cVar.b();
        Context applicationContext = cVar.f().getApplicationContext();
        g g10 = cVar.f().g();
        j jVar = new j();
        jVar.o(new c6.m());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            jVar.o(new r());
        }
        Resources resources = applicationContext.getResources();
        ArrayList e11 = jVar.e();
        C6653a c6653a = new C6653a(applicationContext, e11, c11, b12);
        T5.k f7 = F.f(c11);
        c6.o oVar = new c6.o(jVar.e(), resources.getDisplayMetrics(), c11, b12);
        if (i11 < 28 || !g10.a(d.b.class)) {
            c5755g = new C5755g(oVar);
            b11 = new B(oVar, b12);
        } else {
            b11 = new v();
            c5755g = new c6.i();
        }
        if (i11 >= 28) {
            jVar.a(C6304b.e(e11, b12), InputStream.class, Drawable.class, "Animation");
            jVar.a(C6304b.a(e11, b12), ByteBuffer.class, Drawable.class, "Animation");
        }
        C6309g c6309g = new C6309g(applicationContext);
        C5751c c5751c = new C5751c(b12);
        C6813a c6813a = new C6813a();
        C6816d c6816d = new C6816d();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        jVar.b(ByteBuffer.class, new Z5.c());
        jVar.b(InputStream.class, new w(b12));
        jVar.a(c5755g, ByteBuffer.class, Bitmap.class, "Bitmap");
        jVar.a(b11, InputStream.class, Bitmap.class, "Bitmap");
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = "robolectric";
        } else {
            str = "robolectric";
            jVar.a(new x(oVar), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        }
        jVar.a(F.c(c11), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        jVar.a(f7, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        jVar.d(Bitmap.class, Bitmap.class, y.a.a());
        jVar.a(new D(), Bitmap.class, Bitmap.class, "Bitmap");
        jVar.c(Bitmap.class, c5751c);
        jVar.a(new C5749a(resources, c5755g), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.a(new C5749a(resources, b11), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.a(new C5749a(resources, f7), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.c(BitmapDrawable.class, new C5750b(c11, c5751c));
        jVar.a(new g6.j(e11, c6653a, b12), InputStream.class, g6.c.class, "Animation");
        jVar.a(c6653a, ByteBuffer.class, g6.c.class, "Animation");
        jVar.c(g6.c.class, new g6.d());
        jVar.d(R5.a.class, R5.a.class, y.a.a());
        jVar.a(new g6.h(c11), R5.a.class, Bitmap.class, "Bitmap");
        jVar.a(c6309g, Uri.class, Drawable.class, "legacy_append");
        jVar.a(new z(c6309g, c11), Uri.class, Bitmap.class, "legacy_append");
        jVar.p(new C6094a.C0946a());
        jVar.d(File.class, ByteBuffer.class, new d.b());
        jVar.d(File.class, InputStream.class, new g.e());
        jVar.a(new C6439a(), File.class, File.class, "legacy_append");
        jVar.d(File.class, ParcelFileDescriptor.class, new g.b());
        jVar.d(File.class, File.class, y.a.a());
        jVar.p(new k.a(b12));
        if (!str.equals(str2)) {
            jVar.p(new ParcelFileDescriptorRewinder.a());
        }
        q c12 = Z5.f.c(applicationContext);
        q a11 = Z5.f.a(applicationContext);
        q b13 = Z5.f.b(applicationContext);
        Class cls = Integer.TYPE;
        jVar.d(cls, InputStream.class, c12);
        jVar.d(Integer.class, InputStream.class, c12);
        jVar.d(cls, AssetFileDescriptor.class, a11);
        jVar.d(Integer.class, AssetFileDescriptor.class, a11);
        jVar.d(cls, Drawable.class, b13);
        jVar.d(Integer.class, Drawable.class, b13);
        jVar.d(Uri.class, InputStream.class, Z5.v.b(applicationContext));
        jVar.d(Uri.class, AssetFileDescriptor.class, Z5.v.a(applicationContext));
        q cVar2 = new u.c(resources);
        q aVar = new u.a(resources);
        q bVar = new u.b(resources);
        jVar.d(Integer.class, Uri.class, cVar2);
        jVar.d(cls, Uri.class, cVar2);
        jVar.d(Integer.class, AssetFileDescriptor.class, aVar);
        jVar.d(cls, AssetFileDescriptor.class, aVar);
        jVar.d(Integer.class, InputStream.class, bVar);
        jVar.d(cls, InputStream.class, bVar);
        jVar.d(String.class, InputStream.class, new e.c());
        jVar.d(Uri.class, InputStream.class, new e.c());
        jVar.d(String.class, InputStream.class, new x.c());
        jVar.d(String.class, ParcelFileDescriptor.class, new x.b());
        jVar.d(String.class, AssetFileDescriptor.class, new x.a());
        jVar.d(Uri.class, InputStream.class, new C4897a.c(applicationContext.getAssets()));
        jVar.d(Uri.class, AssetFileDescriptor.class, new C4897a.b(applicationContext.getAssets()));
        jVar.d(Uri.class, InputStream.class, new C4954b.a(applicationContext));
        jVar.d(Uri.class, InputStream.class, new c.a(applicationContext));
        if (i11 >= 29) {
            jVar.d(Uri.class, InputStream.class, new d.c(applicationContext));
            jVar.d(Uri.class, ParcelFileDescriptor.class, new d.b(applicationContext));
        }
        jVar.d(Uri.class, InputStream.class, new z.d(contentResolver));
        jVar.d(Uri.class, ParcelFileDescriptor.class, new z.b(contentResolver));
        jVar.d(Uri.class, AssetFileDescriptor.class, new z.a(contentResolver));
        jVar.d(Uri.class, InputStream.class, new A.a());
        jVar.d(URL.class, InputStream.class, new g.a());
        jVar.d(Uri.class, File.class, new l.a(applicationContext));
        jVar.d(Z5.h.class, InputStream.class, new C4953a.C0697a());
        jVar.d(byte[].class, ByteBuffer.class, new b.a());
        jVar.d(byte[].class, InputStream.class, new b.d());
        jVar.d(Uri.class, Uri.class, y.a.a());
        jVar.d(Drawable.class, Drawable.class, y.a.a());
        jVar.a(new C6310h(), Drawable.class, Drawable.class, "legacy_append");
        jVar.q(Bitmap.class, BitmapDrawable.class, new C6814b(resources));
        jVar.q(Bitmap.class, byte[].class, c6813a);
        jVar.q(Drawable.class, byte[].class, new C6815c(c11, c6813a, c6816d));
        jVar.q(g6.c.class, byte[].class, c6816d);
        T5.k d11 = F.d(c11);
        jVar.a(d11, ByteBuffer.class, Bitmap.class, "legacy_append");
        jVar.a(new C5749a(resources, d11), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        for (InterfaceC7288b interfaceC7288b : list) {
            try {
                interfaceC7288b.a(applicationContext, cVar, jVar);
            } catch (AbstractMethodError e12) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(interfaceC7288b.getClass().getName()), e12);
            }
        }
        if (abstractC7287a != null) {
            abstractC7287a.registerComponents(applicationContext, cVar, jVar);
        }
        return jVar;
    }
}
