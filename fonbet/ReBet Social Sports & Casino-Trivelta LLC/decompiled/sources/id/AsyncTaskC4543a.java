package id;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import gd.InterfaceC4376a;
import hd.C4503a;
import hd.C4504b;
import hd.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import jd.AbstractC5130a;
import jd.e;
import jd.f;

/* renamed from: id.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class AsyncTaskC4543a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f49100a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f49101b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f49102c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f49103d;

    /* renamed from: e, reason: collision with root package name */
    public float f49104e;

    /* renamed from: f, reason: collision with root package name */
    public float f49105f;

    /* renamed from: g, reason: collision with root package name */
    public final int f49106g;

    /* renamed from: h, reason: collision with root package name */
    public final int f49107h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap.CompressFormat f49108i;

    /* renamed from: j, reason: collision with root package name */
    public final int f49109j;

    /* renamed from: k, reason: collision with root package name */
    public final String f49110k;

    /* renamed from: l, reason: collision with root package name */
    public final String f49111l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f49112m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f49113n;

    /* renamed from: o, reason: collision with root package name */
    public final C4504b f49114o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC4376a f49115p;

    /* renamed from: q, reason: collision with root package name */
    public int f49116q;

    /* renamed from: r, reason: collision with root package name */
    public int f49117r;

    /* renamed from: s, reason: collision with root package name */
    public int f49118s;

    /* renamed from: t, reason: collision with root package name */
    public int f49119t;

    public AsyncTaskC4543a(Context context, Bitmap bitmap, c cVar, C4503a c4503a, InterfaceC4376a interfaceC4376a) {
        this.f49100a = new WeakReference(context);
        this.f49101b = bitmap;
        this.f49102c = cVar.a();
        this.f49103d = cVar.c();
        this.f49104e = cVar.d();
        this.f49105f = cVar.b();
        this.f49106g = c4503a.h();
        this.f49107h = c4503a.i();
        this.f49108i = c4503a.a();
        this.f49109j = c4503a.b();
        this.f49110k = c4503a.f();
        this.f49111l = c4503a.g();
        this.f49112m = c4503a.c();
        this.f49113n = c4503a.d();
        this.f49114o = c4503a.e();
        this.f49115p = interfaceC4376a;
    }

    public final void a(Context context) {
        boolean h10 = AbstractC5130a.h(this.f49112m);
        boolean h11 = AbstractC5130a.h(this.f49113n);
        if (h10 && h11) {
            f.b(context, this.f49116q, this.f49117r, this.f49112m, this.f49113n);
            return;
        }
        if (h10) {
            f.c(context, this.f49116q, this.f49117r, this.f49112m, this.f49111l);
        } else if (h11) {
            f.d(context, new androidx.exifinterface.media.a(this.f49110k), this.f49116q, this.f49117r, this.f49113n);
        } else {
            f.e(new androidx.exifinterface.media.a(this.f49110k), this.f49116q, this.f49117r, this.f49111l);
        }
    }

    public final boolean b() {
        Context context = (Context) this.f49100a.get();
        if (context == null) {
            return false;
        }
        if (this.f49106g > 0 && this.f49107h > 0) {
            float width = this.f49102c.width() / this.f49104e;
            float height = this.f49102c.height() / this.f49104e;
            int i10 = this.f49106g;
            if (width > i10 || height > this.f49107h) {
                float min = Math.min(i10 / width, this.f49107h / height);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f49101b, Math.round(r3.getWidth() * min), Math.round(this.f49101b.getHeight() * min), false);
                Bitmap bitmap = this.f49101b;
                if (bitmap != createScaledBitmap) {
                    bitmap.recycle();
                }
                this.f49101b = createScaledBitmap;
                this.f49104e /= min;
            }
        }
        if (this.f49105f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f49105f, this.f49101b.getWidth() / 2, this.f49101b.getHeight() / 2);
            Bitmap bitmap2 = this.f49101b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f49101b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.f49101b;
            if (bitmap3 != createBitmap) {
                bitmap3.recycle();
            }
            this.f49101b = createBitmap;
        }
        this.f49118s = Math.round((this.f49102c.left - this.f49103d.left) / this.f49104e);
        this.f49119t = Math.round((this.f49102c.top - this.f49103d.top) / this.f49104e);
        this.f49116q = Math.round(this.f49102c.width() / this.f49104e);
        int round = Math.round(this.f49102c.height() / this.f49104e);
        this.f49117r = round;
        boolean f10 = f(this.f49116q, round);
        Log.i("BitmapCropTask", "Should crop: " + f10);
        if (!f10) {
            e.a(context, this.f49112m, this.f49113n);
            return false;
        }
        e(Bitmap.createBitmap(this.f49101b, this.f49118s, this.f49119t, this.f49116q, this.f49117r));
        if (!this.f49108i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        a(context);
        return true;
    }

    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f49101b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f49103d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f49113n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            b();
            this.f49101b = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th2) {
        InterfaceC4376a interfaceC4376a = this.f49115p;
        if (interfaceC4376a != null) {
            if (th2 == null) {
                this.f49115p.a(AbstractC5130a.h(this.f49113n) ? this.f49113n : Uri.fromFile(new File(this.f49111l)), this.f49118s, this.f49119t, this.f49116q, this.f49117r);
            } else {
                interfaceC4376a.b(th2);
            }
        }
    }

    public final void e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        Context context = (Context) this.f49100a.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(this.f49113n, "rwt");
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(this.f49108i, this.f49109j, byteArrayOutputStream);
                    openOutputStream.write(byteArrayOutputStream.toByteArray());
                    bitmap.recycle();
                    AbstractC5130a.c(openOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = openOutputStream;
                    try {
                        Log.e("BitmapCropTask", e.getLocalizedMessage());
                        AbstractC5130a.c(outputStream);
                        AbstractC5130a.c(byteArrayOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC5130a.c(outputStream);
                        AbstractC5130a.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = openOutputStream;
                    AbstractC5130a.c(outputStream);
                    AbstractC5130a.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
        AbstractC5130a.c(byteArrayOutputStream);
    }

    public final boolean f(int i10, int i11) {
        int round = Math.round(Math.max(i10, i11) / 1000.0f) + 1;
        if (this.f49106g <= 0 || this.f49107h <= 0) {
            float f10 = round;
            if (Math.abs(this.f49102c.left - this.f49103d.left) <= f10 && Math.abs(this.f49102c.top - this.f49103d.top) <= f10 && Math.abs(this.f49102c.bottom - this.f49103d.bottom) <= f10 && Math.abs(this.f49102c.right - this.f49103d.right) <= f10 && this.f49105f == 0.0f) {
                return false;
            }
        }
        return true;
    }
}
