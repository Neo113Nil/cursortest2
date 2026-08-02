package defpackage;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rlb implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ rlb(Context context, String str, String str2, int i) {
        this.a = i;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        plb plbVar;
        omb ombVar;
        plb plbVar2;
        Pair pair;
        omb h;
        File f;
        t9d t9dVar;
        switch (this.a) {
            case 0:
                Context context = this.b;
                String str = this.c;
                String str2 = this.d;
                dad dadVar = w3a.a;
                int i = 0;
                if (dadVar == null) {
                    synchronized (dad.class) {
                        try {
                            dadVar = w3a.a;
                            if (dadVar == null) {
                                Context applicationContext = context.getApplicationContext();
                                t9d t9dVar2 = w3a.b;
                                if (t9dVar2 == null) {
                                    synchronized (t9d.class) {
                                        t9dVar = w3a.b;
                                        if (t9dVar == null) {
                                            t9dVar = new t9d(new yf0(applicationContext));
                                            w3a.b = t9dVar;
                                        }
                                    }
                                    t9dVar2 = t9dVar;
                                }
                                dadVar = new dad(i, t9dVar2, new mx9());
                                w3a.a = dadVar;
                            }
                        } finally {
                        }
                    }
                }
                AutoCloseable autoCloseable = null;
                if (str2 != null) {
                    try {
                        f = ((t9d) dadVar.b).f(str);
                    } catch (FileNotFoundException unused) {
                    }
                    if (f != null) {
                        FileInputStream fileInputStream = new FileInputStream(f);
                        x08 x08Var = f.getAbsolutePath().endsWith(".zip") ? x08.ZIP : f.getAbsolutePath().endsWith(".gz") ? x08.GZIP : x08.JSON;
                        f.getAbsolutePath();
                        ajb.a();
                        pair = new Pair(x08Var, fileInputStream);
                        if (pair != null) {
                            x08 x08Var2 = (x08) pair.first;
                            InputStream inputStream = (InputStream) pair.second;
                            int ordinal = x08Var2.ordinal();
                            if (ordinal == 1) {
                                h = ulb.h(context, new ZipInputStream(inputStream), str2);
                            } else if (ordinal != 2) {
                                h = ulb.e(f6a.I(inputStream), str2);
                            } else {
                                try {
                                    h = ulb.e(f6a.I(new GZIPInputStream(inputStream)), str2);
                                } catch (IOException e) {
                                    h = new omb(e);
                                }
                            }
                            plbVar = h.a;
                            break;
                        }
                    }
                    pair = null;
                    if (pair != null) {
                    }
                }
                plbVar = null;
                if (plbVar != null) {
                    ombVar = new omb(plbVar);
                } else {
                    ajb.a();
                    ajb.a();
                    try {
                        try {
                            zq4 l = mx9.l(str);
                            HttpURLConnection httpURLConnection = (HttpURLConnection) l.b;
                            try {
                                if (httpURLConnection.getResponseCode() / 100 == 2) {
                                    i = 1;
                                }
                            } catch (IOException unused2) {
                            }
                            if (i != 0) {
                                ombVar = dadVar.v(context, str, httpURLConnection.getInputStream(), httpURLConnection.getContentType(), str2);
                                plb plbVar3 = ombVar.a;
                                ajb.a();
                            } else {
                                ombVar = new omb(new IllegalArgumentException(l.h()));
                            }
                            try {
                                l.close();
                            } catch (IOException unused3) {
                                ajb.c("LottieFetchResult close failed ");
                            }
                        } catch (Exception e2) {
                            omb ombVar2 = new omb(e2);
                            if (0 != 0) {
                                try {
                                    autoCloseable.close();
                                } catch (IOException unused4) {
                                    ajb.c("LottieFetchResult close failed ");
                                }
                            }
                            ombVar = ombVar2;
                        }
                    } finally {
                    }
                }
                if (str2 != null && (plbVar2 = ombVar.a) != null) {
                    qlb.b.a.d(str2, plbVar2);
                }
                return ombVar;
            default:
                return ulb.b(this.b, this.c, this.d);
        }
    }
}
