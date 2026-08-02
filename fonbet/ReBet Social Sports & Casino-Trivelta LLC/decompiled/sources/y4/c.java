package y4;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class c implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f68269a;

    /* renamed from: b, reason: collision with root package name */
    public final e f68270b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f68271c;

    public static class a implements d {
        private static final String[] PATH_PROJECTION = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f68272a;

        public a(ContentResolver contentResolver) {
            this.f68272a = contentResolver;
        }

        @Override // y4.d
        public Cursor a(Uri uri) {
            return this.f68272a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class b implements d {
        private static final String[] PATH_PROJECTION = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f68273a;

        public b(ContentResolver contentResolver) {
            this.f68273a = contentResolver;
        }

        @Override // y4.d
        public Cursor a(Uri uri) {
            return this.f68273a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, PATH_PROJECTION, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public c(Uri uri, e eVar) {
        this.f68269a = uri;
        this.f68270b = eVar;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.d(context).k().g(), dVar, com.bumptech.glide.c.d(context).f(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f68271c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(h hVar, d.a aVar) {
        try {
            InputStream h10 = h();
            this.f68271c = h10;
            aVar.f(h10);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e10);
        }
    }

    public final InputStream h() {
        InputStream d10 = this.f68270b.d(this.f68269a);
        int a10 = d10 != null ? this.f68270b.a(this.f68269a) : -1;
        return a10 != -1 ? new g(d10, a10) : d10;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
