package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.util.AtomicFile;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.f6;
import com.applovin.impl.i2;
import com.applovin.impl.j2;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.AppLovinFilesBridge;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class n {
    private final l b;
    private final p c;
    private final boolean f;
    private final String a = "FileManager";
    private final Object d = new Object();
    private final Set e = new HashSet();
    private final i2 g = a();

    n(l lVar) {
        this.b = lVar;
        this.c = lVar.Q();
        this.f = ((Boolean) lVar.a(z4.V0)).booleanValue();
    }

    private i2 a() {
        if (((Boolean) this.b.a(z4.x3)).booleanValue()) {
            try {
                return new f4(this.b);
            } catch (Throwable th) {
                if (p.a()) {
                    this.c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.b.E().a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new j2(this.b);
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (this.e.contains(absolutePath)) {
                return false;
            }
            d(file);
            return true;
        }
    }

    private boolean g(File file) {
        if (p.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean delete = file.delete();
            if (!delete) {
                HashMap<String, String> hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                hashMap.put("details", b(file));
                this.b.E().a(f2.Z0, "removeFile", hashMap);
            }
            return delete;
        } catch (Throwable th) {
            try {
                if (p.a()) {
                    this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.b.E().a("FileManager", "removeFile", th);
                h(file);
                return false;
            } finally {
                h(file);
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (!this.e.remove(absolutePath)) {
                this.b.E().a(f2.Z0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
            }
            this.d.notifyAll();
        }
    }

    public void b(Context context) {
        if (this.b.G0()) {
            if (p.a()) {
                this.c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.b.s0().a((k5) new u6(this.b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                n.this.a(bVar, context);
            }
        }), f6.b.CACHING);
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.b.s0().a((k5) new u6(this.b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                n.this.b(bVar, context);
            }
        }), f6.b.CACHING);
    }

    public String f(File file) {
        if (file == null) {
            return null;
        }
        if (p.a()) {
            this.c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z = true;
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String a = a(fileInputStream);
                            boolean z2 = a == null;
                            fileInputStream.close();
                            if (z2 && ((Boolean) this.b.a(z4.N0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return a;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        if (p.a()) {
                            this.c.a("FileManager", "Failed to read file: " + file.getName() + e);
                        }
                        this.c.a("FileManager", e);
                        this.b.E().a("FileManager", "readFileIO", e);
                        if (((Boolean) this.b.a(z4.N0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                    if (z && ((Boolean) this.b.a(z4.N0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                if (p.a()) {
                    this.c.d("FileManager", "File not found. " + e2);
                }
                this.c.a("FileManager", e2);
                this.b.E().a("FileManager", "readFileNotFound", e2);
                if (0 != 0 && ((Boolean) this.b.a(z4.N0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            } catch (Throwable th4) {
                if (p.a()) {
                    this.c.a("FileManager", "Unknown failure to read file.", th4);
                }
                this.c.a("FileManager", th4);
                this.b.E().a("FileManager", "readFile", th4);
                if (((Boolean) this.b.a(z4.N0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private boolean c(File file) {
        boolean contains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            contains = this.e.contains(absolutePath);
        }
        return contains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            boolean add = this.e.add(absolutePath);
            while (!add) {
                try {
                    this.d.wait();
                    add = this.e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (p.a()) {
                        this.c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.n0() == null) {
            return;
        }
        g(a(bVar.n0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] listFiles;
        File d = d(context);
        if (d.isDirectory() && (listFiles = d.listFiles()) != null) {
            return Arrays.asList(listFiles);
        }
        return Collections.emptyList();
    }

    private String b(File file) {
        try {
            boolean exists = file.exists();
            boolean isDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z = true;
            boolean z2 = isDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z3 = parentFile != null && parentFile.exists();
            if (!z3 || !parentFile.canWrite()) {
                z = false;
            }
            return "fileExists: " + exists + "\nisDirectory: " + isDirectory + "\nisEmptyDirectory: " + z2 + "\nparentDirectoryExists: " + z3 + "\nisParentDirectoryWritable: " + z;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (p.a()) {
                this.c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (p.a()) {
                this.c.b("FileManager", "Failed to create .nomedia file");
            }
            this.b.E().a(f2.Z0, "createNoMediaFile");
        } catch (IOException e) {
            if (p.a()) {
                this.c.a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (p.a()) {
            this.c.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File d = d(context);
        File file = new File(d, str);
        if (!z) {
            return file;
        }
        try {
            d.mkdirs();
            return file;
        } catch (Throwable th) {
            if (p.a()) {
                this.c.a("FileManager", "Unable to make cache directory at " + d, th);
            }
            this.b.E().a("FileManager", "createCacheDir", th);
            return null;
        }
    }

    public boolean c(String str, Context context) {
        if (this.f) {
            return b(str, context);
        }
        boolean z = false;
        File a = a(str, false, context);
        if (!e(a)) {
            return false;
        }
        if (a.exists() && !a.isDirectory()) {
            z = true;
        }
        h(a);
        return z;
    }

    private long b() {
        long longValue = ((Long) this.b.a(z4.C0)).longValue();
        if (longValue >= 0) {
            return longValue;
        }
        return -1L;
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(C.UTF8_NAME);
                        byteArrayOutputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.c.a("FileManager", th);
            this.b.E().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    public boolean a(InputStream inputStream, File file, boolean z) {
        return a(inputStream, file, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x02f3 A[Catch: all -> 0x033c, TRY_LEAVE, TryCatch #19 {all -> 0x033c, blocks: (B:199:0x02ed, B:201:0x02f3), top: B:198:0x02ed }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x031b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b A[Catch: all -> 0x0199, TryCatch #17 {all -> 0x0199, blocks: (B:59:0x0145, B:61:0x014b, B:62:0x0150), top: B:58:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(InputStream inputStream, File file, boolean z, boolean z2) {
        AtomicFile atomicFile;
        FileOutputStream fileOutputStream;
        boolean z3;
        Throwable th;
        boolean z4;
        Throwable th2;
        Throwable th3;
        if (p.a()) {
            this.c.a("FileManager", "Writing resource to filesystem: " + file.getName());
        }
        if (!this.f) {
            if (!z2) {
                d(file);
            }
            if (((Boolean) this.b.a(z4.R0)).booleanValue() && !z && file.exists()) {
                if (p.a()) {
                    this.c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                }
                this.b.E().a(f2.Z0, "cacheResourceOverwriteAttempted", CollectionUtils.hashMap("path", file.getAbsolutePath()));
                return true;
            }
            try {
                FileOutputStream fileOutputStreamCtor = AppLovinFilesBridge.fileOutputStreamCtor(file);
                int i = 8192;
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr, 0, i);
                        if (read < 0) {
                            break;
                        }
                        try {
                            fileOutputStreamCtor.write(bArr, 0, read);
                            i = 8192;
                        } catch (Throwable th4) {
                            if (p.a()) {
                                this.c.a("FileManager", "Failed to write next buffer to file", th4);
                            }
                            try {
                                this.b.E().a("FileManager", "writeResourceStream", th4);
                                try {
                                    fileOutputStreamCtor.close();
                                    a(file, "removeFileAfterCacheFail");
                                    if (!z2) {
                                        h(file);
                                    }
                                    if (!((Boolean) this.b.a(z4.w3)).booleanValue()) {
                                        return false;
                                    }
                                    try {
                                        inputStream.close();
                                        return false;
                                    } catch (Throwable th5) {
                                        if (p.a()) {
                                            this.c.a("FileManager", "Unable to close resourceStream.", th5);
                                        }
                                        this.b.E().a("FileManager", "closeResourceStream", th5);
                                        return false;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    z4 = true;
                                    try {
                                        if (p.a()) {
                                        }
                                        this.c.a("FileManager", th);
                                        try {
                                            this.b.E().a("FileManager", "writeResource", th);
                                            a(file, "removeFileAfterCacheFail");
                                            if (!z2) {
                                            }
                                            if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                                            }
                                        } catch (Throwable th7) {
                                            th2 = th7;
                                            z4 = true;
                                            if (z4) {
                                                a(file, "removeFileAfterCacheFail");
                                            }
                                            if (!z2) {
                                                h(file);
                                            }
                                            if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                                                try {
                                                    inputStream.close();
                                                    throw th2;
                                                } catch (Throwable th8) {
                                                    if (p.a()) {
                                                        this.c.a("FileManager", "Unable to close resourceStream.", th8);
                                                    }
                                                    this.b.E().a("FileManager", "closeResourceStream", th8);
                                                    throw th2;
                                                }
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                    }
                                }
                            } catch (Throwable th10) {
                                th3 = th10;
                                z4 = true;
                                try {
                                    try {
                                        fileOutputStreamCtor.close();
                                        throw th3;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        if (p.a()) {
                                            this.c.a("FileManager", "Unknown failure to write file.", th);
                                        }
                                        this.c.a("FileManager", th);
                                        this.b.E().a("FileManager", "writeResource", th);
                                        a(file, "removeFileAfterCacheFail");
                                        if (!z2) {
                                            h(file);
                                        }
                                        if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                                            return false;
                                        }
                                        try {
                                            inputStream.close();
                                            return false;
                                        } catch (Throwable th12) {
                                            if (p.a()) {
                                                this.c.a("FileManager", "Unable to close resourceStream.", th12);
                                            }
                                            this.b.E().a("FileManager", "closeResourceStream", th12);
                                            return false;
                                        }
                                    }
                                } catch (Throwable th13) {
                                    th3.addSuppressed(th13);
                                    throw th3;
                                }
                            }
                        }
                    }
                    fileOutputStreamCtor.close();
                    if (!z2) {
                        h(file);
                    }
                    if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                        try {
                            inputStream.close();
                        } catch (Throwable th14) {
                            if (p.a()) {
                                this.c.a("FileManager", "Unable to close resourceStream.", th14);
                            }
                            this.b.E().a("FileManager", "closeResourceStream", th14);
                        }
                    }
                    return true;
                } catch (Throwable th15) {
                    th3 = th15;
                    z4 = false;
                    fileOutputStreamCtor.close();
                    throw th3;
                }
            } catch (Throwable th16) {
                th = th16;
                z4 = false;
            }
        } else {
            if (!z2) {
                try {
                    d(file);
                } catch (Throwable th17) {
                    th = th17;
                    atomicFile = null;
                    fileOutputStream = null;
                    z3 = false;
                    try {
                        if (p.a()) {
                        }
                        try {
                            this.b.E().a("FileManager", "writeResource", th);
                            if (atomicFile != null) {
                            }
                            if (!z2) {
                            }
                            if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            z3 = true;
                            if (atomicFile != null) {
                                if (z3) {
                                    atomicFile.failWrite(fileOutputStream);
                                } else {
                                    atomicFile.finishWrite(fileOutputStream);
                                }
                            }
                            if (!z2) {
                                h(file);
                            }
                            if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                                try {
                                    inputStream.close();
                                    throw th;
                                } catch (Throwable th19) {
                                    if (p.a()) {
                                        this.c.a("FileManager", "Unable to close resourceStream.", th19);
                                    }
                                    this.b.E().a("FileManager", "closeResourceStream", th19);
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th20) {
                        th = th20;
                    }
                }
            }
            if (((Boolean) this.b.a(z4.R0)).booleanValue() && !z && file.exists()) {
                if (p.a()) {
                    this.c.a("FileManager", "Overwrite not allowed for local resource: " + file.getName() + " - aborting write.");
                }
                this.b.E().a(f2.Z0, "cacheResourceOverwriteAttempted", CollectionUtils.hashMap("path", file.getAbsolutePath()));
                if (!z2) {
                    h(file);
                }
                if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                    try {
                        inputStream.close();
                        return true;
                    } catch (Throwable th21) {
                        if (p.a()) {
                            this.c.a("FileManager", "Unable to close resourceStream.", th21);
                        }
                        this.b.E().a("FileManager", "closeResourceStream", th21);
                    }
                }
                return true;
            }
            atomicFile = new AtomicFile(file);
            try {
                fileOutputStream = atomicFile.startWrite();
                try {
                    byte[] bArr2 = new byte[8192];
                    while (true) {
                        int read2 = inputStream.read(bArr2, 0, 8192);
                        if (read2 < 0) {
                            break;
                        }
                        try {
                            fileOutputStream.write(bArr2, 0, read2);
                        } catch (Throwable th22) {
                            if (p.a()) {
                                this.c.a("FileManager", "Failed to write next buffer to file", th22);
                            }
                            try {
                                this.b.E().a("FileManager", "writeResourceStream", th22);
                                atomicFile.failWrite(fileOutputStream);
                                if (!z2) {
                                    h(file);
                                }
                                if (!((Boolean) this.b.a(z4.w3)).booleanValue()) {
                                    return false;
                                }
                                try {
                                    inputStream.close();
                                    return false;
                                } catch (Throwable th23) {
                                    if (p.a()) {
                                        this.c.a("FileManager", "Unable to close resourceStream.", th23);
                                    }
                                    this.b.E().a("FileManager", "closeResourceStream", th23);
                                    return false;
                                }
                            } catch (Throwable th24) {
                                th = th24;
                                z3 = true;
                                if (p.a()) {
                                }
                                this.b.E().a("FileManager", "writeResource", th);
                                if (atomicFile != null) {
                                }
                                if (!z2) {
                                }
                                if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                                }
                            }
                        }
                    }
                    atomicFile.finishWrite(fileOutputStream);
                    if (!z2) {
                        h(file);
                    }
                    if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                        try {
                            inputStream.close();
                        } catch (Throwable th25) {
                            if (p.a()) {
                                this.c.a("FileManager", "Unable to close resourceStream.", th25);
                            }
                            this.b.E().a("FileManager", "closeResourceStream", th25);
                        }
                    }
                    return true;
                } catch (Throwable th26) {
                    th = th26;
                    z3 = false;
                    if (p.a()) {
                        this.c.a("FileManager", "Unknown failure to write file.", th);
                    }
                    this.b.E().a("FileManager", "writeResource", th);
                    if (atomicFile != null) {
                        atomicFile.failWrite(fileOutputStream);
                    }
                    if (!z2) {
                        h(file);
                    }
                    if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                        return false;
                    }
                    try {
                        inputStream.close();
                        return false;
                    } catch (Throwable th27) {
                        if (p.a()) {
                            this.c.a("FileManager", "Unable to close resourceStream.", th27);
                        }
                        this.b.E().a("FileManager", "closeResourceStream", th27);
                        return false;
                    }
                }
            } catch (Throwable th28) {
                th = th28;
                fileOutputStream = null;
                z3 = false;
                if (p.a()) {
                }
                this.b.E().a("FileManager", "writeResource", th);
                if (atomicFile != null) {
                }
                if (!z2) {
                }
                if (((Boolean) this.b.a(z4.w3)).booleanValue()) {
                }
            }
        }
    }

    public boolean a(File file, String str, List list, int i, String str2, Map map) {
        return a(file, str, list, true, i, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z, int i, String str2, Map map) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        hashMap.putAll(map2);
        this.b.g().d(f2.M, hashMap);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = 1;
        while (i2 <= i) {
            if (a(file, str, list, z, str2, map2)) {
                a(true, str, i2, elapsedRealtime, map);
                return true;
            }
            i2++;
            map2 = map;
        }
        a(false, str, i, elapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z, String str2, Map map) {
        Boolean bool = (Boolean) this.b.a(z4.W0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (p.a()) {
                this.c.a("FileManager", "File exists for " + str);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("url", str);
            hashMap.putAll(map);
            this.b.g().d(f2.N, hashMap);
            if (((Boolean) this.b.a(z4.Y0)).booleanValue() && !file.setLastModified(System.currentTimeMillis())) {
                if (p.a()) {
                    this.c.b("FileManager", "Failed to refresh cache TTL for " + file.getName());
                }
                this.b.E().a(f2.Z0, "setLastModifiedFailed", hashMap);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream a = a(str, list, z, map);
            try {
                if (p.a()) {
                    this.c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean a2 = a(a, file, false, bool.booleanValue());
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (a2) {
                    if (p.a()) {
                        this.c.a("FileManager", "Caching completed for " + file);
                    }
                    double d = q7.d(elapsedRealtime2);
                    double c = q7.c(file.length());
                    long j = (long) (c / d);
                    Map a3 = a(file, str, elapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j), a3);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(c), a3);
                    this.b.g().d(f2.S, a3);
                    this.b.f0().b(j, str, str2);
                } else {
                    if (p.a()) {
                        this.c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.b.g().d(f2.T, a(file, str, elapsedRealtime2, map));
                }
                if (a != null) {
                    a.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return a2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.c.a("FileManager", th);
                this.b.E().a("FileManager", "loadAndCacheResource", th);
                if (bool.booleanValue()) {
                    h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j, Map map) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, hashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j), hashMap);
        hashMap.putAll(map);
        return hashMap;
    }

    private void a(boolean z, String str, int i, long j, Map map) {
        f2 f2Var = z ? f2.O : f2.P;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        HashMap hashMap = new HashMap(3);
        hashMap.put("attempt_number", Integer.toString(i));
        hashMap.put("url", str);
        hashMap.put("duration_ms", String.valueOf(elapsedRealtime));
        hashMap.putAll(map);
        this.b.g().d(f2Var, hashMap);
    }

    public InputStream a(String str, List list, boolean z, Map map) {
        if (z && !q7.a(str, list)) {
            if (p.a()) {
                this.c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (p.a()) {
            this.c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> hashMap = CollectionUtils.hashMap("url", httpsString);
        hashMap.putAll(map);
        this.b.g().d(f2.Q, hashMap);
        try {
            return this.g.a(httpsString, map);
        } catch (Throwable th) {
            if (p.a()) {
                this.c.a("FileManager", "Error loading " + httpsString, th);
            }
            this.b.E().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List W = bVar.W();
        if (bVar.M0() || W.contains(str)) {
            return bVar.C();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z, int i, String str3, Map map) {
        return a(context, str, str2, list, z, false, i, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z, boolean z2, int i, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.b.E().a(f2.Z0, "cacheResource");
            return null;
        }
        String a = q7.a(Uri.parse(str), str2, this.b);
        File a2 = a(a, context);
        if (!a(a2, str, list, z, i, str3, map)) {
            return null;
        }
        if (p.a()) {
            this.c.a("FileManager", "Caching succeeded for file " + a);
        }
        return z2 ? Uri.fromFile(a2).toString() : a;
    }

    private long a(Context context) {
        boolean z;
        long b = b();
        boolean z2 = b != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List c = this.b.c(z4.H0);
        long j = 0;
        for (File file : c(context)) {
            if (!z2 || c.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= b) {
                z = false;
            } else {
                if (p.a()) {
                    this.c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                z = g(file);
            }
            if (!z) {
                j += file.length();
            }
        }
        return j;
    }

    private void a(long j, Context context) {
        long intValue = ((Integer) this.b.a(z4.D0)).intValue();
        if (intValue == -1) {
            if (p.a()) {
                this.c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j) > intValue) {
                if (p.a()) {
                    this.c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (p.a()) {
                this.c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.m().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri n0 = bVar.n0();
        if (n0 != null) {
            g(a(n0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (p.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            hashMap.put("details", b(file));
            this.b.E().a(f2.Z0, str, hashMap);
        } catch (Throwable th) {
            if (p.a()) {
                this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.b.E().a("FileManager", str, th);
        }
    }

    private long a(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
