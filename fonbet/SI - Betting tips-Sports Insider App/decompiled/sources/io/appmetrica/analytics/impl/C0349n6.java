package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349n6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0020aa f14297a;

    /* renamed from: b, reason: collision with root package name */
    public final C0145f6 f14298b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f14299c;

    /* renamed from: d, reason: collision with root package name */
    public final Z9 f14300d;

    public C0349n6(Context context) {
        this(context, new C0020aa(), new C0145f6(), Z9.a(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(5:(10:5|(2:7|(1:9)(1:13))|14|15|16|18|19|20|98|25)(1:34)|18|19|20|98)|(1:11)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0559vh c0559vh) {
        boolean mkdir;
        String str;
        C0601x9 b10;
        PrintWriter printWriter;
        Z9 z92;
        File crashesDirectory = FileUtils.getCrashesDirectory(this.f14299c);
        this.f14298b.getClass();
        if (crashesDirectory == null) {
            return;
        }
        try {
            if (crashesDirectory.exists()) {
                if (!crashesDirectory.isDirectory()) {
                    if (!crashesDirectory.delete()) {
                        return;
                    } else {
                        mkdir = crashesDirectory.mkdir();
                    }
                }
                Bf bf2 = c0559vh.f14798e.f12300a;
                str = bf2.f12060a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + bf2.f12060a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
                b10 = this.f14300d.b(str);
                b10.f14914a.lock();
                b10.f14915b.a();
                this.f14297a.getClass();
                printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
                printWriter.write(new C0253jb(c0559vh.f14794a, c0559vh.f14798e, c0559vh.f14797d).k());
                lo.a((Closeable) printWriter);
                b10.c();
                z92 = this.f14300d;
                synchronized (z92) {
                    z92.f13283b.remove(str);
                }
                return;
            }
            mkdir = crashesDirectory.mkdir();
            printWriter.write(new C0253jb(c0559vh.f14794a, c0559vh.f14798e, c0559vh.f14797d).k());
            lo.a((Closeable) printWriter);
            b10.c();
            z92 = this.f14300d;
            synchronized (z92) {
            }
        } catch (Throwable unused) {
            lo.a((Closeable) printWriter);
            b10.c();
            this.f14300d.a(str);
            return;
        }
        if (!mkdir) {
            return;
        }
        Bf bf22 = c0559vh.f14798e.f12300a;
        str = bf22.f12060a.getAsInteger("PROCESS_CFG_PROCESS_ID") + "-" + bf22.f12060a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
        b10 = this.f14300d.b(str);
        b10.f14914a.lock();
        b10.f14915b.a();
        this.f14297a.getClass();
        printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(crashesDirectory, str))));
    }

    public C0349n6(Context context, C0020aa c0020aa, C0145f6 c0145f6, Z9 z92) {
        this.f14299c = context;
        this.f14297a = c0020aa;
        this.f14298b = c0145f6;
        this.f14300d = z92;
    }
}
