package androidx.credentials.playservices;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import e5.j;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.l;
import io.sentry.s6;
import io.sentry.u;
import io.sentry.v;
import io.sentry.w;
import java.io.File;
import java.util.concurrent.Executor;
import k2.x;
import t0.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements w7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1490e;

    public /* synthetic */ c(int i5, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1486a = i5;
        this.f1490e = obj;
        this.f1487b = obj2;
        this.f1488c = obj3;
        this.f1489d = obj4;
    }

    public void a() {
        int i5;
        int i10;
        ILogger iLogger = (ILogger) this.f1490e;
        String str = (String) this.f1487b;
        w wVar = (w) this.f1488c;
        File file = (File) this.f1489d;
        b5 b5Var = b5.DEBUG;
        int i11 = 1;
        int i12 = 0;
        iLogger.h(b5Var, "Started processing cached files from %s", str);
        s6 s6Var = wVar.f17229d;
        ILogger iLogger2 = wVar.f17227b;
        try {
            iLogger2.h(b5Var, "Processing dir. %s", file.getAbsolutePath());
            File[] listFiles = file.listFiles(new u(i12, wVar));
            if (listFiles != null) {
                iLogger2.h(b5Var, "Processing %d items from cache dir %s", Integer.valueOf(listFiles.length), file.getAbsolutePath());
                int length = listFiles.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    File file2 = listFiles[i13];
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!s6Var.contains(absolutePath)) {
                            j d10 = wVar.f17226a.d();
                            if (d10 != null && d10.k(l.All)) {
                                iLogger2.h(b5.INFO, "DirectoryProcessor, rate limiting active.", new Object[i12]);
                                break;
                            }
                            b5 b5Var2 = b5.DEBUG;
                            i5 = i12;
                            try {
                                Object[] objArr = new Object[i11];
                                objArr[i5] = absolutePath;
                                iLogger2.h(b5Var2, "Processing file: %s", objArr);
                                i10 = i13;
                                wVar.b(file2, x.k(new v(wVar.f17228c, wVar.f17227b, absolutePath, s6Var)));
                                Thread.sleep(100L);
                                i13 = i10 + 1;
                                i12 = i5;
                                i11 = 1;
                            } catch (Throwable th2) {
                                th = th2;
                                b5 b5Var3 = b5.ERROR;
                                i11 = 1;
                                Object[] objArr2 = new Object[1];
                                objArr2[i5] = file.getAbsolutePath();
                                iLogger2.b(b5Var3, th, "Failed processing '%s'", objArr2);
                                b5 b5Var4 = b5.DEBUG;
                                Object[] objArr3 = new Object[i11];
                                objArr3[i5] = str;
                                iLogger.h(b5Var4, "Finished processing cached files from %s", objArr3);
                            }
                        } else {
                            b5 b5Var5 = b5.DEBUG;
                            Object[] objArr4 = new Object[i11];
                            objArr4[i12] = absolutePath;
                            iLogger2.h(b5Var5, "File '%s' has already been processed so it will not be processed again.", objArr4);
                        }
                    } else {
                        b5 b5Var6 = b5.DEBUG;
                        Object[] objArr5 = new Object[i11];
                        objArr5[i12] = file2.getAbsolutePath();
                        iLogger2.h(b5Var6, "File %s is not a File.", objArr5);
                    }
                    i5 = i12;
                    i10 = i13;
                    i13 = i10 + 1;
                    i12 = i5;
                    i11 = 1;
                }
            } else {
                iLogger2.h(b5.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            }
            i5 = i12;
        } catch (Throwable th3) {
            th = th3;
            i5 = 0;
        }
        b5 b5Var42 = b5.DEBUG;
        Object[] objArr32 = new Object[i11];
        objArr32[i5] = str;
        iLogger.h(b5Var42, "Finished processing cached files from %s", objArr32);
    }

    @Override // w7.c
    public void c(Exception exc) {
        switch (this.f1486a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$4((CredentialProviderPlayServicesImpl) this.f1490e, (CancellationSignal) this.f1487b, (Executor) this.f1488c, (i) this.f1489d, exc);
                break;
            default:
                CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$1((CredentialProviderGetDigitalCredentialController) this.f1490e, (CancellationSignal) this.f1487b, (Executor) this.f1488c, (i) this.f1489d, exc);
                break;
        }
    }
}
