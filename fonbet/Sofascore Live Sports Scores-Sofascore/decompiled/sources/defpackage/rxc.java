package defpackage;

import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class rxc {
    public static final HashSet a = new HashSet();
    public static final boolean b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        b = z;
    }

    public static void a(x0 x0Var) {
        File file = new File(x0Var.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024 A[Catch: all -> 0x000d, DONT_GENERATE, TRY_LEAVE, TryCatch #7 {all -> 0x000d, blocks: (B:4:0x0005, B:6:0x000b, B:9:0x000f, B:12:0x0018, B:13:0x001c, B:17:0x0024, B:21:0x0029, B:23:0x0030, B:24:0x0040, B:32:0x0063, B:34:0x006a, B:36:0x006c, B:44:0x006e, B:45:0x0071, B:49:0x0034, B:27:0x004e, B:29:0x0052, B:40:0x005a), top: B:3:0x0005, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(x0 x0Var, File file, File file2) {
        ClassLoader classLoader;
        HashSet hashSet = a;
        synchronized (hashSet) {
            try {
                if (hashSet.contains(file)) {
                    return;
                }
                hashSet.add(file);
                System.getProperty("java.vm.version");
                IOException e = null;
                try {
                    classLoader = x0Var.getClassLoader();
                } catch (RuntimeException unused) {
                }
                if (classLoader instanceof BaseDexClassLoader) {
                    if (classLoader != null) {
                        return;
                    }
                    try {
                        a(x0Var);
                    } catch (Throwable unused2) {
                    }
                    File file3 = new File(file2, "code_cache");
                    try {
                        e(file3);
                    } catch (IOException unused3) {
                        file3 = new File(x0Var.getFilesDir(), "code_cache");
                        e(file3);
                    }
                    File file4 = new File(file3, "secondary-dexes");
                    e(file4);
                    uxc uxcVar = new uxc(file, file4);
                    try {
                        try {
                            d((BaseDexClassLoader) classLoader, file4, uxcVar.g(x0Var, false));
                        } catch (IOException unused4) {
                            d((BaseDexClassLoader) classLoader, file4, uxcVar.g(x0Var, true));
                        }
                        try {
                        } catch (IOException e2) {
                            e = e2;
                        }
                        if (e != null) {
                            throw e;
                        }
                        return;
                    } finally {
                        try {
                            uxcVar.close();
                        } catch (IOException unused5) {
                        }
                    }
                }
                classLoader = null;
                if (classLoader != null) {
                }
            } finally {
            }
        }
    }

    public static Field c(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder q = wt3.q("Field ", str, " not found in ");
        q.append(obj.getClass());
        throw new NoSuchFieldException(q.toString());
    }

    public static void d(BaseDexClassLoader baseDexClassLoader, File file, ArrayList arrayList) {
        IOException[] iOExceptionArr;
        if (arrayList.isEmpty()) {
            return;
        }
        Object obj = c(baseDexClassLoader, "pathList").get(baseDexClassLoader);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                Object[] objArr = (Object[]) declaredMethod.invoke(obj, arrayList3, file, arrayList2);
                Field c = c(obj, "dexElements");
                Object[] objArr2 = (Object[]) c.get(obj);
                Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                c.set(obj, objArr3);
                if (arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    Field c2 = c(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) c2.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                    } else {
                        IOException[] iOExceptionArr3 = new IOException[arrayList2.size() + iOExceptionArr2.length];
                        arrayList2.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    c2.set(obj, iOExceptionArr);
                    IOException iOException = new IOException("I/O exception during makeDexElement");
                    iOException.initCause((Throwable) arrayList2.get(0));
                    throw iOException;
                }
                return;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder sb = new StringBuilder("Method makeDexElements with parameters ");
        sb.append(Arrays.asList(clsArr));
        Class<?> cls2 = obj.getClass();
        sb.append(" not found in ");
        sb.append(cls2);
        throw new NoSuchMethodException(sb.toString());
    }

    public static void e(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        pvd.q(file.getPath(), "Failed to create directory ");
    }
}
