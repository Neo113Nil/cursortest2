package defpackage;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w08 extends AsyncTask {
    public final String a;
    public final File b;
    public final v08 c;

    public w08(String str, File file, v08 v08Var) {
        str.getClass();
        this.a = str;
        this.b = file;
        this.c = v08Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean] */
    public final Boolean a(String... strArr) {
        Set set = cw3.a;
        if (!set.contains(this)) {
            try {
                if (!set.contains(this)) {
                    try {
                        strArr.getClass();
                        try {
                            URL url = new URL(this.a);
                            int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                            DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                            byte[] bArr = new byte[contentLength];
                            dataInputStream.readFully(bArr);
                            dataInputStream.close();
                            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            this = Boolean.TRUE;
                            return this;
                        } catch (Exception unused) {
                            return Boolean.FALSE;
                        }
                    } catch (Throwable th) {
                        cw3.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                cw3.a(this, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Boolean, java.lang.Object] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = cw3.a;
        if (!set.contains(this)) {
            try {
                if (!set.contains(this)) {
                    try {
                        this = a((String[]) objArr);
                        return this;
                    } catch (Throwable th) {
                        cw3.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                cw3.a(this, th2);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = cw3.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (set.contains(this)) {
                    return;
                }
                try {
                    if (!set.contains(this) && booleanValue) {
                        try {
                            this.c.c(this.b);
                        } catch (Throwable th) {
                            cw3.a(this, th);
                        }
                    }
                } catch (Throwable th2) {
                    cw3.a(this, th2);
                }
            } catch (Throwable th3) {
                cw3.a(this, th3);
            }
        } catch (Throwable th4) {
            cw3.a(this, th4);
        }
    }
}
