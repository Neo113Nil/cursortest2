package T7;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import g6.C4331C;
import g6.C4357q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f10999a = new K();

    /* renamed from: b, reason: collision with root package name */
    public static final String f11000b = K.class.getName();

    /* renamed from: c, reason: collision with root package name */
    public static File f11001c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f11002a;

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f11003b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f11004c;

        /* renamed from: d, reason: collision with root package name */
        public final String f11005d;

        /* renamed from: e, reason: collision with root package name */
        public final String f11006e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f11007f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f11008g;

        public a(UUID callId, Bitmap bitmap, Uri uri) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            this.f11002a = callId;
            this.f11003b = bitmap;
            this.f11004c = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (StringsKt.equals("content", scheme, true)) {
                    this.f11007f = true;
                    String authority = uri.getAuthority();
                    this.f11008g = (authority == null || StringsKt.startsWith$default(authority, "media", false, 2, (Object) null)) ? false : true;
                } else if (StringsKt.equals("file", uri.getScheme(), true)) {
                    this.f11008g = true;
                } else if (!Y.f0(uri)) {
                    throw new C4357q(Intrinsics.stringPlus("Unsupported scheme for media Uri : ", scheme));
                }
            } else {
                if (bitmap == null) {
                    throw new C4357q("Cannot share media without a bitmap or Uri set");
                }
                this.f11008g = true;
            }
            String uuid = this.f11008g ? UUID.randomUUID().toString() : null;
            this.f11006e = uuid;
            this.f11005d = !this.f11008g ? String.valueOf(uri) : FacebookContentProvider.INSTANCE.a(C4331C.m(), callId, uuid);
        }

        public final String a() {
            return this.f11006e;
        }

        public final String b() {
            return this.f11005d;
        }

        public final Bitmap c() {
            return this.f11003b;
        }

        public final UUID d() {
            return this.f11002a;
        }

        public final Uri e() {
            return this.f11004c;
        }

        public final boolean f() {
            return this.f11008g;
        }

        public final boolean g() {
            return this.f11007f;
        }
    }

    public static final void a(Collection collection) {
        File g10;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        if (f11001c == null) {
            b();
        }
        f();
        ArrayList<File> arrayList = new ArrayList();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f() && (g10 = g(aVar.d(), aVar.a(), true)) != null) {
                    arrayList.add(g10);
                    if (aVar.c() != null) {
                        f10999a.k(aVar.c(), g10);
                    } else if (aVar.e() != null) {
                        f10999a.l(aVar.e(), aVar.g(), g10);
                    }
                }
            }
        } catch (IOException e10) {
            Log.e(f11000b, Intrinsics.stringPlus("Got unexpected exception:", e10));
            for (File file : arrayList) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new C4357q(e10);
        }
    }

    public static final void b() {
        File h10 = h();
        if (h10 == null) {
            return;
        }
        FilesKt.deleteRecursively(h10);
    }

    public static final void c(UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File i10 = i(callId, false);
        if (i10 == null) {
            return;
        }
        FilesKt.deleteRecursively(i10);
    }

    public static final a d(UUID callId, Bitmap attachmentBitmap) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentBitmap, "attachmentBitmap");
        return new a(callId, attachmentBitmap, null);
    }

    public static final a e(UUID callId, Uri attachmentUri) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentUri, "attachmentUri");
        return new a(callId, null, attachmentUri);
    }

    public static final File f() {
        File h10 = h();
        if (h10 == null) {
            return h10;
        }
        h10.mkdirs();
        return h10;
    }

    public static final File g(UUID callId, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File i10 = i(callId, z10);
        if (i10 == null) {
            return null;
        }
        try {
            return new File(i10, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File h() {
        File file;
        synchronized (K.class) {
            try {
                if (f11001c == null) {
                    f11001c = new File(C4331C.l().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
                }
                file = f11001c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return file;
    }

    public static final File i(UUID callId, boolean z10) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        if (f11001c == null) {
            return null;
        }
        File file = new File(f11001c, callId.toString());
        if (z10 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final File j(UUID uuid, String str) {
        if (Y.d0(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return g(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    public final void k(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            Y.j(fileOutputStream);
        }
    }

    public final void l(Uri uri, boolean z10, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Y.p(!z10 ? new FileInputStream(uri.getPath()) : C4331C.l().getContentResolver().openInputStream(uri), fileOutputStream);
            Y.j(fileOutputStream);
        } catch (Throwable th2) {
            Y.j(fileOutputStream);
            throw th2;
        }
    }
}
