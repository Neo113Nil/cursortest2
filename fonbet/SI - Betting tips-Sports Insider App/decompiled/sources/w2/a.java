package w2;

import io.sentry.android.core.w0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f24953e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24954a;

    /* renamed from: b, reason: collision with root package name */
    public final File f24955b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f24956c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f24957d;

    public a(String name, File file, boolean z5) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f24954a = z5;
        this.f24955b = file != null ? new File(file, k.l(name, ".lck")) : null;
        HashMap hashMap = f24953e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(name);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(name, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f24956c = lock;
    }

    public final void a(boolean z5) {
        this.f24956c.lock();
        if (z5) {
            File file = this.f24955b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = a.a.i(new FileOutputStream(file), file).getChannel();
                channel.lock();
                this.f24957d = channel;
            } catch (IOException e7) {
                this.f24957d = null;
                w0.n("SupportSQLiteLock", "Unable to grab file lock.", e7);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f24957d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f24956c.unlock();
    }
}
