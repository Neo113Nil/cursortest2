package G2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0082a f3848e = new C0082a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final Map f3849f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3850a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3851b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f3852c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f3853d;

    /* renamed from: G2.a$a, reason: collision with other inner class name */
    public static final class C0082a {
        public /* synthetic */ C0082a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Lock b(String str) {
            Lock lock;
            synchronized (a.f3849f) {
                try {
                    Map map = a.f3849f;
                    Object obj = map.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lock;
        }

        public C0082a() {
        }
    }

    public a(String name, File file, boolean z10) {
        File file2;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f3850a = z10;
        if (file != null) {
            file2 = new File(file, name + ".lck");
        } else {
            file2 = null;
        }
        this.f3851b = file2;
        this.f3852c = f3848e.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f3850a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f3852c.lock();
        if (z10) {
            try {
                File file = this.f3851b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f3851b).getChannel();
                channel.lock();
                this.f3853d = channel;
            } catch (IOException e10) {
                this.f3853d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f3853d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f3852c.unlock();
    }
}
