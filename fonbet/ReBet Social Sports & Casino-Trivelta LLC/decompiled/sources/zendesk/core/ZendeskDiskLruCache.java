package zendesk.core;

import Xb.a;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import ld.AbstractC5459a;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import ti.E;
import ti.G;
import ti.InterfaceC6479i;
import ti.InterfaceC6480j;
import ti.t;

/* loaded from: classes5.dex */
class ZendeskDiskLruCache implements BaseStorage {
    private static final int CACHE_INDEX = 0;
    private static final int ITEMS_PER_KEY = 1;
    private static final String LOG_TAG = "DiskLruStorage";
    private static final int VERSION_ONE = 1;
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private Xb.a storage;

    public ZendeskDiskLruCache(File file, Serializer serializer, int i10) {
        this.directory = file;
        long j10 = i10;
        this.maxSize = j10;
        this.storage = openCache(file, j10);
        this.serializer = serializer;
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [zendesk.core.ZendeskDiskLruCache] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v11, types: [ti.G] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v8 */
    private String getString(String str, int i10) {
        Throwable th2;
        InterfaceC6480j interfaceC6480j;
        String str2;
        Closeable closeable = null;
        try {
            try {
                a.e Z12 = this.storage.Z1(key(str));
                if (Z12 != null) {
                    str = t.k(Z12.d(i10));
                    try {
                        interfaceC6480j = t.d(str);
                        try {
                            closeable = str;
                            str2 = interfaceC6480j.G1();
                        } catch (IOException e10) {
                            e = e10;
                            AbstractC5459a.h(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                            close(str);
                            close(interfaceC6480j);
                            return null;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        interfaceC6480j = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = 0;
                        close(str);
                        close(i10);
                        throw th2;
                    }
                } else {
                    str2 = null;
                    interfaceC6480j = null;
                }
                close(closeable);
                close(interfaceC6480j);
                return str2;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (IOException e12) {
            e = e12;
            str = 0;
            interfaceC6480j = null;
        } catch (Throwable th5) {
            i10 = 0;
            th2 = th5;
            str = 0;
        }
    }

    private String key(String str) {
        return com.zendesk.util.b.c(str);
    }

    private String keyMediaType(String str) {
        return key(String.format(Locale.US, "%s_content_type", str));
    }

    private Xb.a openCache(File file, long j10) {
        try {
            return Xb.a.c2(file, 1, 1, j10);
        } catch (IOException unused) {
            AbstractC5459a.i(LOG_TAG, "Unable to open cache", new Object[0]);
            return null;
        }
    }

    private void putString(String str, int i10, String str2) {
        try {
            write(str, i10, t.k(new ByteArrayInputStream(str2.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException e10) {
            AbstractC5459a.h(LOG_TAG, "Unable to encode string", e10, new Object[0]);
        }
    }

    private void write(String str, int i10, G g10) {
        E e10;
        a.c T12;
        InterfaceC6479i interfaceC6479i = null;
        try {
            synchronized (this.directory) {
                T12 = this.storage.T1(key(str));
            }
            if (T12 != null) {
                e10 = t.g(T12.f(i10));
                try {
                    try {
                        interfaceC6479i = t.c(e10);
                        interfaceC6479i.Y(g10);
                        interfaceC6479i.flush();
                        T12.e();
                    } catch (IOException e11) {
                        e = e11;
                        AbstractC5459a.h(LOG_TAG, "Unable to cache data", e, new Object[0]);
                        close(interfaceC6479i);
                        close(e10);
                        close(g10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    close(interfaceC6479i);
                    close(e10);
                    close(g10);
                    throw th;
                }
            } else {
                e10 = null;
            }
        } catch (IOException e12) {
            e = e12;
            e10 = null;
        } catch (Throwable th3) {
            th = th3;
            e10 = null;
            close(interfaceC6479i);
            close(e10);
            close(g10);
            throw th;
        }
        close(interfaceC6479i);
        close(e10);
        close(g10);
    }

    @Override // zendesk.core.BaseStorage
    public void clear() {
        Xb.a aVar = this.storage;
        if (aVar == null) {
            return;
        }
        try {
            try {
                if (aVar.a2() != null && this.storage.a2().exists() && com.zendesk.util.a.g(this.storage.a2().listFiles())) {
                    this.storage.n1();
                } else {
                    this.storage.close();
                }
            } catch (IOException e10) {
                AbstractC5459a.b(LOG_TAG, "Error clearing cache. Error: %s", e10.getMessage());
            }
            this.storage = openCache(this.directory, this.maxSize);
        } catch (Throwable th2) {
            this.storage = openCache(this.directory, this.maxSize);
            throw th2;
        }
    }

    @Override // zendesk.core.BaseStorage
    public String get(@NonNull String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    @Override // zendesk.core.BaseStorage
    public void put(@NonNull String str, String str2) {
        if (this.storage == null || com.zendesk.util.d.c(str2)) {
            return;
        }
        putString(str, 0, str2);
    }

    @Override // zendesk.core.BaseStorage
    public void remove(@NonNull String str) {
    }

    @Override // zendesk.core.BaseStorage
    public <E> E get(@NonNull String str, @NonNull Class<E> cls) {
        if (this.storage == null) {
            return null;
        }
        if (cls.equals(ResponseBody.class)) {
            try {
                a.e Z12 = this.storage.Z1(key(str));
                if (Z12 == null) {
                    return null;
                }
                G k10 = t.k(Z12.d(0));
                long k11 = Z12.k(0);
                String string = getString(keyMediaType(str), 0);
                return (E) ResponseBody.create(com.zendesk.util.d.a(string) ? MediaType.parse(string) : null, k11, t.d(k10));
            } catch (IOException e10) {
                AbstractC5459a.h(LOG_TAG, "Unable to read from cache", e10, new Object[0]);
                return null;
            }
        }
        return (E) this.serializer.deserialize(getString(str, 0), cls);
    }

    @Override // zendesk.core.BaseStorage
    public void put(@NonNull String str, Object obj) {
        if (this.storage == null) {
            return;
        }
        if (obj instanceof ResponseBody) {
            ResponseBody responseBody = (ResponseBody) obj;
            write(str, 0, responseBody.getBodySource());
            putString(keyMediaType(str), 0, responseBody.get$contentType().getMediaType());
            return;
        }
        put(str, obj != null ? this.serializer.serialize(obj) : null);
    }

    public ZendeskDiskLruCache(File file, long j10, Xb.a aVar, Serializer serializer) {
        this.directory = file;
        this.maxSize = j10;
        this.storage = aVar;
        this.serializer = serializer;
    }
}
