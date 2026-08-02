package p6;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f63081a;

    /* renamed from: b, reason: collision with root package name */
    public final File f63082b;

    /* renamed from: c, reason: collision with root package name */
    public final a f63083c;

    public interface a {
        void a(File file);
    }

    public k(String uriStr, File destFile, a onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f63081a = uriStr;
        this.f63082b = destFile;
        this.f63083c = onSuccess;
    }

    public Boolean a(String... args) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                URL url = new URL(this.f63081a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f63082b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public void b(boolean z10) {
        if (!Y7.a.d(this) && z10) {
            try {
                this.f63083c.a(this.f63082b);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            b(((Boolean) obj).booleanValue());
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
