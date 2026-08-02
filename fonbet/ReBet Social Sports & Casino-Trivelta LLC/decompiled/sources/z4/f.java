package z4;

import android.content.Context;
import java.io.File;
import z4.AbstractC6928d;

/* loaded from: classes2.dex */
public final class f extends AbstractC6928d {

    public class a implements AbstractC6928d.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f68575a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f68576b;

        public a(Context context, String str) {
            this.f68575a = context;
            this.f68576b = str;
        }

        @Override // z4.AbstractC6928d.a
        public File a() {
            File cacheDir = this.f68575a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f68576b != null ? new File(cacheDir, this.f68576b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
