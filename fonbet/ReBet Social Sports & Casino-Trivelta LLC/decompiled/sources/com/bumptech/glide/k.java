package com.bumptech.glide;

import B4.a;
import B4.b;
import B4.d;
import B4.e;
import B4.g;
import B4.l;
import B4.s;
import B4.t;
import B4.v;
import B4.w;
import B4.x;
import B4.y;
import C4.a;
import C4.b;
import C4.c;
import C4.d;
import C4.g;
import E4.a;
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
import com.bumptech.glide.d;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.C;
import com.bumptech.glide.load.resource.bitmap.C2997a;
import com.bumptech.glide.load.resource.bitmap.C2998b;
import com.bumptech.glide.load.resource.bitmap.C2999c;
import com.bumptech.glide.load.resource.bitmap.C3005i;
import com.bumptech.glide.load.resource.bitmap.C3007k;
import com.bumptech.glide.load.resource.bitmap.E;
import com.bumptech.glide.load.resource.bitmap.G;
import com.bumptech.glide.load.resource.bitmap.I;
import com.bumptech.glide.load.resource.bitmap.K;
import com.bumptech.glide.load.resource.bitmap.M;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.util.f;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f29632a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f29633b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f29634c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ J4.a f29635d;

        public a(c cVar, List list, J4.a aVar) {
            this.f29633b = cVar;
            this.f29634c = list;
            this.f29635d = aVar;
        }

        @Override // com.bumptech.glide.util.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j get() {
            if (this.f29632a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            K2.a.c("Glide registry");
            this.f29632a = true;
            try {
                return k.a(this.f29633b, this.f29634c, this.f29635d);
            } finally {
                this.f29632a = false;
                K2.a.f();
            }
        }
    }

    public static j a(c cVar, List list, J4.a aVar) {
        com.bumptech.glide.load.engine.bitmap_recycle.d g10 = cVar.g();
        com.bumptech.glide.load.engine.bitmap_recycle.b f10 = cVar.f();
        Context applicationContext = cVar.j().getApplicationContext();
        f g11 = cVar.j().g();
        j jVar = new j();
        b(applicationContext, jVar, g10, f10, g11);
        c(applicationContext, cVar, jVar, list, aVar);
        return jVar;
    }

    public static void b(Context context, j jVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, f fVar) {
        com.bumptech.glide.load.l c3005i;
        com.bumptech.glide.load.l i10;
        String str;
        j jVar2;
        jVar.o(new o());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 27) {
            jVar.o(new x());
        }
        Resources resources = context.getResources();
        List g10 = jVar.g();
        H4.a aVar = new H4.a(context, g10, dVar, bVar);
        com.bumptech.glide.load.l m10 = M.m(dVar);
        u uVar = new u(jVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i11 < 28 || !fVar.a(d.b.class)) {
            c3005i = new C3005i(uVar);
            i10 = new I(uVar, bVar);
        } else {
            i10 = new C();
            c3005i = new C3007k();
        }
        if (i11 >= 28) {
            jVar.e("Animation", InputStream.class, Drawable.class, F4.h.f(g10, bVar));
            jVar.e("Animation", ByteBuffer.class, Drawable.class, F4.h.a(g10, bVar));
        }
        F4.m mVar = new F4.m(context);
        C2999c c2999c = new C2999c(bVar);
        I4.a aVar2 = new I4.a();
        I4.d dVar2 = new I4.d();
        ContentResolver contentResolver = context.getContentResolver();
        jVar.a(ByteBuffer.class, new B4.c()).a(InputStream.class, new B4.u(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, c3005i).e("Bitmap", InputStream.class, Bitmap.class, i10);
        if (ParcelFileDescriptorRewinder.c()) {
            str = "Animation";
            jVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new E(uVar));
        } else {
            str = "Animation";
        }
        jVar.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, M.c(dVar));
        String str2 = str;
        jVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m10).c(Bitmap.class, Bitmap.class, w.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new K()).b(Bitmap.class, c2999c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2997a(resources, c3005i)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2997a(resources, i10)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C2997a(resources, m10)).b(BitmapDrawable.class, new C2998b(dVar, c2999c)).e(str2, InputStream.class, H4.c.class, new H4.j(g10, aVar, bVar)).e(str2, ByteBuffer.class, H4.c.class, aVar).b(H4.c.class, new H4.d()).c(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, w.a.a()).e("Bitmap", com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new H4.h(dVar)).d(Uri.class, Drawable.class, mVar).d(Uri.class, Bitmap.class, new G(mVar, dVar)).p(new a.C0067a()).c(File.class, ByteBuffer.class, new d.b()).c(File.class, InputStream.class, new g.e()).d(File.class, File.class, new G4.a()).c(File.class, ParcelFileDescriptor.class, new g.b()).c(File.class, File.class, w.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            jVar2 = jVar;
            jVar2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            jVar2 = jVar;
        }
        B4.o g11 = B4.f.g(context);
        B4.o c10 = B4.f.c(context);
        B4.o e10 = B4.f.e(context);
        Class cls = Integer.TYPE;
        jVar2.c(cls, InputStream.class, g11).c(Integer.class, InputStream.class, g11).c(cls, AssetFileDescriptor.class, c10).c(Integer.class, AssetFileDescriptor.class, c10).c(cls, Drawable.class, e10).c(Integer.class, Drawable.class, e10).c(Uri.class, InputStream.class, t.f(context)).c(Uri.class, AssetFileDescriptor.class, t.e(context));
        s.c cVar = new s.c(resources);
        s.a aVar3 = new s.a(resources);
        s.b bVar2 = new s.b(resources);
        jVar2.c(Integer.class, Uri.class, cVar).c(cls, Uri.class, cVar).c(Integer.class, AssetFileDescriptor.class, aVar3).c(cls, AssetFileDescriptor.class, aVar3).c(Integer.class, InputStream.class, bVar2).c(cls, InputStream.class, bVar2);
        jVar2.c(String.class, InputStream.class, new e.c()).c(Uri.class, InputStream.class, new e.c()).c(String.class, InputStream.class, new v.c()).c(String.class, ParcelFileDescriptor.class, new v.b()).c(String.class, AssetFileDescriptor.class, new v.a()).c(Uri.class, InputStream.class, new a.c(context.getAssets())).c(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).c(Uri.class, InputStream.class, new b.a(context)).c(Uri.class, InputStream.class, new c.a(context));
        if (i11 >= 29) {
            jVar2.c(Uri.class, InputStream.class, new d.c(context));
            jVar2.c(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        jVar2.c(Uri.class, InputStream.class, new x.d(contentResolver)).c(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver)).c(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver)).c(Uri.class, InputStream.class, new y.a()).c(URL.class, InputStream.class, new g.a()).c(Uri.class, File.class, new l.a(context)).c(B4.h.class, InputStream.class, new a.C0029a()).c(byte[].class, ByteBuffer.class, new b.a()).c(byte[].class, InputStream.class, new b.d()).c(Uri.class, Uri.class, w.a.a()).c(Drawable.class, Drawable.class, w.a.a()).d(Drawable.class, Drawable.class, new F4.n()).q(Bitmap.class, BitmapDrawable.class, new I4.b(resources)).q(Bitmap.class, byte[].class, aVar2).q(Drawable.class, byte[].class, new I4.c(dVar, aVar2, dVar2)).q(H4.c.class, byte[].class, dVar2);
        com.bumptech.glide.load.l d10 = M.d(dVar);
        jVar2.d(ByteBuffer.class, Bitmap.class, d10);
        jVar2.d(ByteBuffer.class, BitmapDrawable.class, new C2997a(resources, d10));
    }

    public static void c(Context context, c cVar, j jVar, List list, J4.a aVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J4.b bVar = (J4.b) it.next();
            try {
                bVar.b(context, cVar, jVar);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar.getClass().getName(), e10);
            }
        }
        if (aVar != null) {
            aVar.a(context, cVar, jVar);
        }
    }

    public static f.b d(c cVar, List list, J4.a aVar) {
        return new a(cVar, list, aVar);
    }
}
