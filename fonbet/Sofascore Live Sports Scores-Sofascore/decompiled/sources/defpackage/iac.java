package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.mediarouter.app.d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iac extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final /* synthetic */ d e;

    public iac(d dVar) {
        this.e = dVar;
        MediaDescriptionCompat mediaDescriptionCompat = dVar.X;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        if (bitmap != null && bitmap.isRecycled()) {
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dVar.X;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(lowerCase) || U3.i.b.equals(lowerCase)) {
            openInputStream = this.e.k.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
            int i = d.r0;
            uRLConnection.setConnectTimeout(30000);
            uRLConnection.setReadTimeout(30000);
            openInputStream = uRLConnection.getInputStream();
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r3 != null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x001f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:32), block:B:59:0x001f */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        InputStream inputStream2 = null;
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            Uri uri = this.b;
            try {
                if (uri != null) {
                    try {
                        bufferedInputStream = a(uri);
                        try {
                            try {
                                if (bufferedInputStream == null) {
                                    Objects.toString(uri);
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStream.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStream.close();
                                            bufferedInputStream = a(uri);
                                            if (bufferedInputStream == null) {
                                                Objects.toString(uri);
                                                if (bufferedInputStream == null) {
                                                    return null;
                                                }
                                            }
                                        }
                                        options.inJustDecodeBounds = false;
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.e.l(options.outWidth, options.outHeight)));
                                        if (isCancelled()) {
                                            bufferedInputStream.close();
                                            return null;
                                        }
                                        bitmap = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                }
                                bufferedInputStream.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException unused4) {
                            Objects.toString(uri);
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused5) {
                                }
                            }
                            bitmap = null;
                            if (bitmap == null) {
                            }
                            if (bitmap != null) {
                                mbd mbdVar = new mbd(bitmap);
                                mbdVar.b = 1;
                                List list = (List) mbdVar.a().b;
                                this.c = Collections.unmodifiableList(list).isEmpty() ? 0 : ((i7e) Collections.unmodifiableList(list).get(0)).d;
                            }
                            return bitmap;
                        }
                    } catch (IOException unused6) {
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused7) {
                            }
                        }
                        throw th;
                    }
                }
                bitmap = null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        if (bitmap == null && bitmap.isRecycled()) {
            Objects.toString(bitmap);
            return null;
        }
        if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
            mbd mbdVar2 = new mbd(bitmap);
            mbdVar2.b = 1;
            List list2 = (List) mbdVar2.a().b;
            this.c = Collections.unmodifiableList(list2).isEmpty() ? 0 : ((i7e) Collections.unmodifiableList(list2).get(0)).d;
        }
        return bitmap;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        d dVar = this.e;
        dVar.Y = null;
        Bitmap bitmap2 = dVar.Z;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (equals && Objects.equals(dVar.a0, uri)) {
            return;
        }
        dVar.Z = bitmap3;
        dVar.c0 = bitmap;
        dVar.a0 = uri;
        dVar.d0 = this.c;
        dVar.b0 = true;
        dVar.q(SystemClock.uptimeMillis() - this.d > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        d dVar = this.e;
        dVar.b0 = false;
        dVar.c0 = null;
        dVar.d0 = 0;
    }
}
