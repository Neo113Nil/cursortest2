package com.github.luben.zstd.util;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.facebook.soloader.MinElf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.i5s;
import xsna.xe9;

/* loaded from: classes12.dex */
public enum Native {
    ;

    private static final String libname = "libzstd-jni-1.5.7-4";
    private static final String libnameShort = "zstd-jni-1.5.7-4";
    private static final String nativePathOverride = "ZstdNativePath";
    private static final String tempFolderOverride = "ZstdTempFolder";
    private static final String errorMsg = i5s.a(new StringBuilder("Unsupported OS/arch, cannot find "), resourceName(), " or load zstd-jni-1.5.7-4 from system libraries. Please try building from source the jar or providing libzstd-jni-1.5.7-4 in your system.");
    private static AtomicBoolean loaded = new AtomicBoolean(false);

    public static synchronized void assumeLoaded() {
        synchronized (Native.class) {
            loaded.set(true);
        }
    }

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (Native.class) {
            z = loaded.get();
        }
        return z;
    }

    private static String libExtension() {
        return (osName().contains("os_x") || osName().contains("darwin")) ? "dylib" : osName().contains("win") ? "dll" : "so";
    }

    public static synchronized void load() {
        synchronized (Native.class) {
            try {
                String property = System.getProperty(tempFolderOverride);
                if (property == null) {
                    load(null);
                } else {
                    load(new File(property));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void loadLibrary(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.1
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary(str);
                return null;
            }
        });
    }

    private static void loadLibraryFile(final String str) {
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: com.github.luben.zstd.util.Native.2
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.load(str);
                return null;
            }
        });
    }

    private static String osName() {
        String replace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        return replace.startsWith("win") ? "win" : replace.startsWith("mac") ? "darwin" : replace;
    }

    private static String resourceName() {
        String osName = osName();
        String property = System.getProperty("os.arch");
        if (osName.equals("darwin") && property.equals("amd64")) {
            property = MinElf.ISA.X86_64;
        }
        StringBuilder a = xe9.a(DomExceptionUtils.SEPARATOR, osName, DomExceptionUtils.SEPARATOR, property, "/libzstd-jni-1.5.7-4.");
        a.append(libExtension());
        return a.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[Catch: all -> 0x0026, IOException -> 0x00de, TryCatch #1 {, blocks: (B:4:0x0005, B:9:0x000f, B:11:0x001c, B:19:0x003a, B:96:0x0042, B:41:0x00cd, B:43:0x00d2, B:44:0x00d5, B:46:0x00db, B:71:0x014c, B:73:0x0151, B:75:0x0156, B:77:0x015c, B:78:0x015f, B:100:0x004f, B:101:0x0075, B:15:0x0029), top: B:3:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db A[Catch: all -> 0x0026, IOException -> 0x00de, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0005, B:9:0x000f, B:11:0x001c, B:19:0x003a, B:96:0x0042, B:41:0x00cd, B:43:0x00d2, B:44:0x00d5, B:46:0x00db, B:71:0x014c, B:73:0x0151, B:75:0x0156, B:77:0x015c, B:78:0x015f, B:100:0x004f, B:101:0x0075, B:15:0x0029), top: B:3:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151 A[Catch: all -> 0x0026, IOException -> 0x015f, TryCatch #1 {, blocks: (B:4:0x0005, B:9:0x000f, B:11:0x001c, B:19:0x003a, B:96:0x0042, B:41:0x00cd, B:43:0x00d2, B:44:0x00d5, B:46:0x00db, B:71:0x014c, B:73:0x0151, B:75:0x0156, B:77:0x015c, B:78:0x015f, B:100:0x004f, B:101:0x0075, B:15:0x0029), top: B:3:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156 A[Catch: all -> 0x0026, IOException -> 0x015f, TryCatch #1 {, blocks: (B:4:0x0005, B:9:0x000f, B:11:0x001c, B:19:0x003a, B:96:0x0042, B:41:0x00cd, B:43:0x00d2, B:44:0x00d5, B:46:0x00db, B:71:0x014c, B:73:0x0151, B:75:0x0156, B:77:0x015c, B:78:0x015f, B:100:0x004f, B:101:0x0075, B:15:0x0029), top: B:3:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[Catch: all -> 0x0026, SYNTHETIC, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0005, B:9:0x000f, B:11:0x001c, B:19:0x003a, B:96:0x0042, B:41:0x00cd, B:43:0x00d2, B:44:0x00d5, B:46:0x00db, B:71:0x014c, B:73:0x0151, B:75:0x0156, B:77:0x015c, B:78:0x015f, B:100:0x004f, B:101:0x0075, B:15:0x0029), top: B:3:0x0005, inners: #5, #11 }] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void load(File file) {
        ?? r0;
        Throwable th;
        FileOutputStream fileOutputStream;
        synchronized (Native.class) {
            if (loaded.get()) {
                return;
            }
            String resourceName = resourceName();
            String property = System.getProperty(nativePathOverride);
            if (property != null) {
                loadLibraryFile(property);
                loaded.set(true);
                return;
            }
            try {
                Class.forName("org.osgi.framework.BundleEvent");
                loadLibrary(libname);
                loaded.set(true);
            } catch (Throwable unused) {
                InputStream resourceAsStream = Native.class.getResourceAsStream(resourceName);
                if (resourceAsStream == null) {
                    try {
                        loadLibrary(libnameShort);
                        loaded.set(true);
                        return;
                    } catch (UnsatisfiedLinkError e) {
                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e.getMessage() + "\n" + errorMsg);
                        unsatisfiedLinkError.setStackTrace(e.getStackTrace());
                        throw unsatisfiedLinkError;
                    }
                }
                FileOutputStream fileOutputStream2 = null;
                try {
                    ?? createTempFile = File.createTempFile(libname, "." + libExtension(), file);
                    try {
                        createTempFile.deleteOnExit();
                        FileOutputStream fileOutputStream3 = new FileOutputStream((File) createTempFile);
                        try {
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = resourceAsStream.read(bArr);
                                    if (read == -1) {
                                        try {
                                            break;
                                        } catch (IOException unused2) {
                                            fileOutputStream2 = fileOutputStream3;
                                        }
                                    } else {
                                        fileOutputStream3.write(bArr, 0, read);
                                    }
                                }
                                fileOutputStream3.flush();
                                fileOutputStream3.close();
                                try {
                                    loadLibraryFile(createTempFile.getAbsolutePath());
                                } catch (UnsatisfiedLinkError e2) {
                                    try {
                                        loadLibrary(libnameShort);
                                        loaded.set(true);
                                        resourceAsStream.close();
                                        if (fileOutputStream2 != null) {
                                            fileOutputStream2.close();
                                        }
                                        if (createTempFile.exists()) {
                                            return;
                                        }
                                        createTempFile.delete();
                                        return;
                                    } catch (UnsatisfiedLinkError e3) {
                                        UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError(e2.getMessage() + "\n" + e3.getMessage() + "\n" + errorMsg);
                                        unsatisfiedLinkError2.setStackTrace(e3.getStackTrace());
                                        throw unsatisfiedLinkError2;
                                    }
                                }
                                loaded.set(true);
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream2 != null) {
                                    }
                                    if (createTempFile.exists()) {
                                    }
                                } catch (IOException unused3) {
                                }
                            } catch (IOException e4) {
                                fileOutputStream2 = createTempFile;
                                fileOutputStream = fileOutputStream3;
                                e = e4;
                                try {
                                    ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-4: " + e.getMessage());
                                    exceptionInInitializerError.setStackTrace(e.getStackTrace());
                                    throw exceptionInInitializerError;
                                } catch (Throwable th2) {
                                    FileOutputStream fileOutputStream4 = fileOutputStream2;
                                    th = th2;
                                    r0 = fileOutputStream4;
                                    try {
                                        resourceAsStream.close();
                                        if (fileOutputStream != null) {
                                        }
                                        if (r0 != 0) {
                                        }
                                    } catch (IOException unused4) {
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r0 = createTempFile;
                            fileOutputStream = fileOutputStream3;
                            resourceAsStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (r0 != 0) {
                                if (r0.exists()) {
                                    r0.delete();
                                    throw th;
                                }
                                throw th;
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        FileOutputStream fileOutputStream5 = fileOutputStream2;
                        fileOutputStream2 = createTempFile;
                        fileOutputStream = fileOutputStream5;
                        ExceptionInInitializerError exceptionInInitializerError2 = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-4: " + e.getMessage());
                        exceptionInInitializerError2.setStackTrace(e.getStackTrace());
                        throw exceptionInInitializerError2;
                    } catch (Throwable th4) {
                        r0 = createTempFile;
                        fileOutputStream = fileOutputStream2;
                        th = th4;
                        resourceAsStream.close();
                        if (fileOutputStream != null) {
                        }
                        if (r0 != 0) {
                        }
                    }
                } catch (IOException e6) {
                    e = e6;
                    fileOutputStream = null;
                } catch (Throwable th5) {
                    r0 = 0;
                    th = th5;
                    fileOutputStream = null;
                }
            }
        }
    }
}
