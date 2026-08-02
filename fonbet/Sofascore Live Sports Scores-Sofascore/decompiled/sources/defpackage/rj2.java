package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.b0;
import com.facebook.d0;
import com.facebook.internal.k0;
import com.facebook.w;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.internal.publisher.h0;
import java.io.FilterOutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rj2 implements b0 {
    public boolean a;
    public boolean b;
    public Object c;

    @Override // com.facebook.b0
    public void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        d(str, null, null);
        g("%s", str2);
        i();
        synchronized (w.b) {
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.b = true;
                li3 li3Var = (li3) this.c;
                if (li3Var != null) {
                    try {
                        Runnable runnable = (Runnable) li3Var.b;
                        xwj xwjVar = (xwj) li3Var.c;
                        Runnable runnable2 = (Runnable) li3Var.d;
                        if (runnable == null) {
                            xwjVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.b = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.b = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void c(String str, Object... objArr) {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.c;
        if (this.b) {
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String encode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)), C.UTF8_NAME);
            encode.getClass();
            byte[] bytes = encode.getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        if (this.a) {
            Charset charset = Charsets.UTF_8;
            byte[] bytes2 = "--".getBytes(charset);
            bytes2.getClass();
            filterOutputStream.write(bytes2);
            byte[] bytes3 = d0.j.getBytes(charset);
            bytes3.getClass();
            filterOutputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            bytes4.getClass();
            filterOutputStream.write(bytes4);
            this.a = false;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
        byte[] bytes5 = String.format(str, Arrays.copyOf(copyOf2, copyOf2.length)).getBytes(Charsets.UTF_8);
        bytes5.getClass();
        filterOutputStream.write(bytes5);
    }

    public void d(String str, String str2, String str3) {
        if (this.b) {
            FilterOutputStream filterOutputStream = (FilterOutputStream) this.c;
            byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        c("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            c("; filename=\"%s\"", str2);
        }
        g("", new Object[0]);
        if (str3 != null) {
            g("%s: %s", "Content-Type", str3);
        }
        g("", new Object[0]);
    }

    public void e(Uri uri, String str, String str2) {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.c;
        str.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        d(str, str, str2);
        int i = k0.i(w.a().getContentResolver().openInputStream(uri), filterOutputStream);
        g("", new Object[0]);
        i();
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        synchronized (w.b) {
        }
    }

    public void f(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.c;
        str.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        d(str, str, str2);
        int i = k0.i(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), filterOutputStream);
        g("", new Object[0]);
        i();
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        synchronized (w.b) {
        }
    }

    public void g(String str, Object... objArr) {
        c(str, Arrays.copyOf(objArr, objArr.length));
        if (this.b) {
            return;
        }
        c("\r\n", new Object[0]);
    }

    public void h(String str, Object obj, d0 d0Var) {
        str.getClass();
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.c;
        String str2 = d0.j;
        if (h0.A(obj)) {
            a(str, h0.D(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            d(str, str, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            g("", new Object[0]);
            i();
            synchronized (w.b) {
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            d(str, str, "content/unknown");
            filterOutputStream.write(bArr);
            g("", new Object[0]);
            i();
            String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            synchronized (w.b) {
            }
            return;
        }
        if (obj instanceof Uri) {
            e((Uri) obj, str, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            f(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof GraphRequest$ParcelableResourceWithMimeType)) {
            a70.p("value is not a supported type.");
            return;
        }
        GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = (GraphRequest$ParcelableResourceWithMimeType) obj;
        Parcelable parcelable = graphRequest$ParcelableResourceWithMimeType.b;
        String str3 = graphRequest$ParcelableResourceWithMimeType.a;
        if (parcelable instanceof ParcelFileDescriptor) {
            f(str, (ParcelFileDescriptor) parcelable, str3);
        } else if (parcelable instanceof Uri) {
            e((Uri) parcelable, str, str3);
        } else {
            a70.p("value is not a supported type.");
        }
    }

    public void i() {
        if (!this.b) {
            g("--%s", d0.j);
            return;
        }
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.c;
        byte[] bytes = U3.j.c.getBytes(Charsets.UTF_8);
        bytes.getClass();
        filterOutputStream.write(bytes);
    }
}
