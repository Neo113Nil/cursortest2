package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oyc implements h7a {
    public static final f8h j = new f8h(28);
    public final CoroutineContext a;
    public final File b;
    public final sn2 c;
    public final String d;
    public final String e;
    public final String f;
    public final j2d g;
    public final mqi h;
    public final mqi i;

    public oyc(CoroutineContext coroutineContext, File file) {
        coroutineContext.getClass();
        this.a = coroutineContext;
        this.b = file;
        Object obj = xyc.b;
        this.c = yso.r(new j8c(file, null, 8));
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new j2d();
        final int i = 0;
        this.h = ypa.b(new Function0(this) { // from class: jyc
            public final /* synthetic */ oyc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptor;
                int i2 = i;
                oyc oycVar = this.b;
                switch (i2) {
                    case 0:
                        File file2 = new File(oycVar.b.getAbsolutePath() + oycVar.d);
                        oyc.f(file2);
                        return file2;
                    default:
                        udh.a.getClass();
                        File file3 = new File(oycVar.b.getAbsolutePath() + oycVar.e);
                        oyc.f(file3);
                        tdh tdhVar = null;
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptor.getClass();
                                NativeSharedCounter nativeSharedCounter = sdh.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptor.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (nativeCreateSharedCounter >= 0) {
                                            tdhVar = new tdh(nativeSharedCounter, nativeCreateSharedCounter);
                                        } else {
                                            is8.e("Failed to mmap counter file");
                                        }
                                    } else {
                                        is8.e("Failed to truncate counter file");
                                    }
                                } else {
                                    a70.r("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptor.close();
                                return tdhVar;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
        final int i2 = 1;
        this.i = ypa.b(new Function0(this) { // from class: jyc
            public final /* synthetic */ oyc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptor;
                int i22 = i2;
                oyc oycVar = this.b;
                switch (i22) {
                    case 0:
                        File file2 = new File(oycVar.b.getAbsolutePath() + oycVar.d);
                        oyc.f(file2);
                        return file2;
                    default:
                        udh.a.getClass();
                        File file3 = new File(oycVar.b.getAbsolutePath() + oycVar.e);
                        oyc.f(file3);
                        tdh tdhVar = null;
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptor.getClass();
                                NativeSharedCounter nativeSharedCounter = sdh.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptor.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (nativeCreateSharedCounter >= 0) {
                                            tdhVar = new tdh(nativeSharedCounter, nativeCreateSharedCounter);
                                        } else {
                                            is8.e("Failed to mmap counter file");
                                        }
                                    } else {
                                        is8.e("Failed to truncate counter file");
                                    }
                                } else {
                                    a70.r("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptor.close();
                                return tdhVar;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                is8.e(fc6.k(file, "Unable to create parent directories of "));
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // defpackage.h7a
    public final Object a(pf4 pf4Var) {
        mqi mqiVar = this.i;
        if (mqiVar.isInitialized()) {
            tdh tdhVar = (tdh) ((udh) mqiVar.getValue());
            return new Integer(tdhVar.b.nativeIncrementAndGetCounterValue(tdhVar.c));
        }
        return xw3.R(this.a, new lyc(this, null, 1), pf4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dc A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:15:0x00dc, B:31:0x00f7, B:32:0x00fa), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:15:0x00dc, B:31:0x00f7, B:32:0x00fa), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r19v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, nyc] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [h2d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.lang.Object, lu3] */
    @Override // defpackage.h7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function2 function2, sq3 sq3Var) {
        ?? r3;
        ?? r4;
        int i;
        ?? r1;
        j2d j2dVar;
        String message;
        FileLock fileLock;
        FileLock fileLock2;
        FileInputStream fileInputStream;
        boolean z;
        try {
            if (sq3Var instanceof nyc) {
                nyc nycVar = (nyc) sq3Var;
                int i2 = nycVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nycVar.x = i2 - Integer.MIN_VALUE;
                    r3 = nycVar;
                    Object obj = r3.v;
                    r4 = lu3.a;
                    i = r3.x;
                    if (i == 0) {
                        if (i == 1) {
                            r1 = r3.u;
                            j2dVar = r3.r;
                            try {
                                y6a.M(obj);
                                z = r1;
                                if (z) {
                                    j2dVar.f(null);
                                }
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                if (r1 != 0) {
                                }
                                throw th;
                            }
                        }
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = r3.u;
                        fileLock2 = r3.t;
                        fileInputStream = r3.s;
                        j2d j2dVar2 = r3.r;
                        try {
                            y6a.M(obj);
                            r1 = z2;
                            r3 = j2dVar2;
                            if (fileLock2 != null) {
                                fileLock2.release();
                            }
                            try {
                                n4o.x(fileInputStream, null);
                                if (r1 != 0) {
                                    r3.f(null);
                                }
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                j2dVar = r3;
                                if (r1 != 0) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (fileLock2 != null) {
                            }
                            throw th;
                        }
                    }
                    y6a.M(obj);
                    j2d j2dVar3 = this.g;
                    boolean g = j2dVar3.g();
                    try {
                        if (g) {
                            FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                            try {
                                try {
                                    fileLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileLock2 = null;
                                    if (fileLock2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (IOException e) {
                                String message2 = e.getMessage();
                                if ((message2 == null || !c.v(message2, this.f, false)) && ((message = e.getMessage()) == null || !c.v(message, "Resource deadlock would occur", false))) {
                                    throw e;
                                }
                                fileLock = null;
                            }
                            try {
                                Boolean valueOf = Boolean.valueOf(fileLock != null);
                                r3.r = j2dVar3;
                                r3.s = fileInputStream2;
                                r3.t = fileLock;
                                r3.u = g;
                                r3.x = 2;
                                obj = function2.invoke(valueOf, r3);
                                if (obj != r4) {
                                    fileLock2 = fileLock;
                                    r3 = j2dVar3;
                                    r1 = g;
                                    fileInputStream = fileInputStream2;
                                    if (fileLock2 != null) {
                                    }
                                    n4o.x(fileInputStream, null);
                                    if (r1 != 0) {
                                    }
                                    return obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileLock2 = fileLock;
                                if (fileLock2 != null) {
                                    fileLock2.release();
                                }
                                throw th;
                            }
                        } else {
                            Boolean bool = Boolean.FALSE;
                            r3.r = j2dVar3;
                            r3.u = g;
                            r3.x = 1;
                            obj = function2.invoke(bool, r3);
                            if (obj != r4) {
                                j2dVar = j2dVar3;
                                z = g;
                                if (z) {
                                }
                                return obj;
                            }
                        }
                        return r4;
                    } catch (Throwable th6) {
                        th = th6;
                        j2dVar = j2dVar3;
                        r1 = g;
                        if (r1 != 0) {
                            j2dVar.f(null);
                        }
                        throw th;
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    n4o.x(r4, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                    j2dVar = r3;
                    if (r1 != 0) {
                    }
                    throw th;
                }
            }
        }
        r3 = new nyc(this, sq3Var);
        Object obj2 = r3.v;
        r4 = lu3.a;
        i = r3.x;
    }

    @Override // defpackage.h7a
    public final z88 c() {
        return this.c;
    }

    @Override // defpackage.h7a
    public final Object d(sq3 sq3Var) {
        mqi mqiVar = this.i;
        if (mqiVar.isInitialized()) {
            tdh tdhVar = (tdh) ((udh) mqiVar.getValue());
            return new Integer(tdhVar.b.nativeGetCounterValue(tdhVar.c));
        }
        return xw3.R(this.a, new lyc(this, null, 0), sq3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0077, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5 A[Catch: all -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b9, blocks: (B:16:0x00b5, B:30:0x00d3, B:31:0x00d6), top: B:7:0x0022, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #4 {all -> 0x00b9, blocks: (B:16:0x00b5, B:30:0x00d3, B:31:0x00d6), top: B:7:0x0022, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [h2d] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Function1 function1, sq3 sq3Var) {
        myc mycVar;
        ?? r10;
        lu3 lu3Var;
        int i;
        Function1 function12;
        Throwable th;
        Object m;
        Object obj;
        h2d h2dVar;
        Function1 function13;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object invoke;
        h2d h2dVar2;
        Object obj2;
        try {
            try {
                try {
                    if (sq3Var instanceof myc) {
                        mycVar = (myc) sq3Var;
                        int i2 = mycVar.w;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            mycVar.w = i2 - Integer.MIN_VALUE;
                            r10 = mycVar.u;
                            lu3Var = lu3.a;
                            i = mycVar.w;
                            if (i != 0) {
                                y6a.M(r10);
                                mycVar.r = function1;
                                j2d j2dVar = this.g;
                                mycVar.s = j2dVar;
                                mycVar.w = 1;
                                Object e = j2dVar.e(mycVar);
                                function12 = function1;
                                r10 = j2dVar;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            a70.r("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        fileLock = (FileLock) mycVar.t;
                                        closeable = (Closeable) mycVar.s;
                                        h2dVar2 = (h2d) mycVar.r;
                                        try {
                                            y6a.M(r10);
                                            obj2 = r10;
                                            if (fileLock != null) {
                                                fileLock.release();
                                            }
                                            try {
                                                n4o.x(closeable, null);
                                                h2dVar2.f(null);
                                                return obj2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r10 = h2dVar2;
                                                r10.f(null);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (fileLock != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    closeable = (Closeable) mycVar.t;
                                    h2dVar = (h2d) mycVar.s;
                                    function13 = (Function1) mycVar.r;
                                    try {
                                        y6a.M(r10);
                                        obj = r10;
                                        fileLock2 = (FileLock) obj;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fileLock = null;
                                        if (fileLock != null) {
                                            fileLock.release();
                                        }
                                        throw th;
                                    }
                                    try {
                                        mycVar.r = h2dVar;
                                        mycVar.s = closeable;
                                        mycVar.t = fileLock2;
                                        mycVar.w = 3;
                                        invoke = function13.invoke(mycVar);
                                        if (invoke != lu3Var) {
                                            h2dVar2 = h2dVar;
                                            fileLock = fileLock2;
                                            obj2 = invoke;
                                            if (fileLock != null) {
                                            }
                                            n4o.x(closeable, null);
                                            h2dVar2.f(null);
                                            return obj2;
                                        }
                                        return lu3Var;
                                    } catch (Throwable th5) {
                                        fileLock = fileLock2;
                                        th = th5;
                                        if (fileLock != null) {
                                        }
                                        throw th;
                                    }
                                }
                                h2d h2dVar3 = (h2d) mycVar.s;
                                Function1 function14 = (Function1) mycVar.r;
                                y6a.M(r10);
                                r10 = h2dVar3;
                                function12 = function14;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream((File) this.h.getValue());
                            f8h f8hVar = j;
                            mycVar.r = function12;
                            mycVar.s = r10;
                            mycVar.t = fileOutputStream;
                            mycVar.w = 2;
                            m = f8hVar.m(fileOutputStream, mycVar);
                            if (m != lu3Var) {
                                h2d h2dVar4 = r10;
                                obj = m;
                                h2dVar = h2dVar4;
                                function13 = function12;
                                closeable = fileOutputStream;
                                fileLock2 = (FileLock) obj;
                                mycVar.r = h2dVar;
                                mycVar.s = closeable;
                                mycVar.t = fileLock2;
                                mycVar.w = 3;
                                invoke = function13.invoke(mycVar);
                                if (invoke != lu3Var) {
                                }
                            }
                            return lu3Var;
                        }
                    }
                    f8h f8hVar2 = j;
                    mycVar.r = function12;
                    mycVar.s = r10;
                    mycVar.t = fileOutputStream;
                    mycVar.w = 2;
                    m = f8hVar2.m(fileOutputStream, mycVar);
                    if (m != lu3Var) {
                    }
                    return lu3Var;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                    }
                    throw th;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r10.f(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th8) {
            r10 = mycVar;
            try {
                throw th8;
            } catch (Throwable th9) {
                n4o.x(function1, th8);
                throw th9;
            }
        }
        mycVar = new myc(this, sq3Var);
        r10 = mycVar.u;
        lu3Var = lu3.a;
        i = mycVar.w;
    }
}
