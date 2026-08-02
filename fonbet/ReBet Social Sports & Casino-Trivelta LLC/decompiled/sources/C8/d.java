package C8;

import C8.c;
import D8.i;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f1501a;

    /* renamed from: b, reason: collision with root package name */
    public final c.b f1502b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f1503c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1504d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1505e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1507b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f1508c;

        public a(Context context, String str, String str2, c.InterfaceC0035c interfaceC0035c) {
            this.f1506a = context;
            this.f1507b = str;
            this.f1508c = str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            try {
                d.this.g(this.f1506a, this.f1507b, this.f1508c);
                throw null;
            } catch (C8.b unused) {
                throw null;
            } catch (UnsatisfiedLinkError unused2) {
                throw null;
            }
        }
    }

    public class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1510a;

        public b(String str) {
            this.f1510a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f1510a);
        }
    }

    public d() {
        this(new e(), new C8.a());
    }

    public void b(Context context, String str, String str2) {
        File c10 = c(context);
        File d10 = d(context, str, str2);
        File[] listFiles = c10.listFiles(new b(this.f1502b.b(str)));
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (this.f1504d || !file.getAbsolutePath().equals(d10.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public File c(Context context) {
        return context.getDir("lib", 0);
    }

    public File d(Context context, String str, String str2) {
        String b10 = this.f1502b.b(str);
        if (f.a(str2)) {
            return new File(c(context), b10);
        }
        return new File(c(context), b10 + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0035c interfaceC0035c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0035c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0035c)).start();
        }
    }

    public final void g(Context context, String str, String str2) {
        d dVar;
        Context context2;
        i iVar;
        if (this.f1501a.contains(str) && !this.f1504d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f1502b.a(str);
            this.f1501a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File d10 = d(context, str, str2);
            if (!d10.exists() || this.f1504d) {
                if (this.f1504d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                dVar = this;
                context2 = context;
                this.f1503c.a(context2, this.f1502b.d(), this.f1502b.b(str), d10, dVar);
            } else {
                dVar = this;
                context2 = context;
            }
            try {
                if (dVar.f1505e) {
                    try {
                        iVar = new i(d10);
                        try {
                            List r10 = iVar.r();
                            iVar.close();
                            Iterator it = r10.iterator();
                            while (it.hasNext()) {
                                e(context2, dVar.f1502b.c((String) it.next()));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            if (iVar == null) {
                                throw th3;
                            }
                            iVar.close();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iVar = null;
                    }
                }
            } catch (IOException unused) {
            }
            dVar.f1502b.e(d10.getAbsolutePath());
            dVar.f1501a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    public d(c.b bVar, c.a aVar) {
        this.f1501a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f1502b = bVar;
        this.f1503c = aVar;
    }

    public void h(String str) {
    }
}
