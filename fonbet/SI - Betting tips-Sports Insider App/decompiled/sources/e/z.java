package e;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8455b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8454a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f8456c = new CopyOnWriteArrayList();

    public z(boolean z5) {
        this.f8455b = z5;
    }

    public abstract void b();

    public void c(a backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void d(a backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final void e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8456c;
        Iterator it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                com.appsflyer.internal.h.h((ExecutorService) autoCloseable);
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
            } else if (autoCloseable instanceof DrmManagerClient) {
                ((DrmManagerClient) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof ContentProviderClient)) {
                    throw new IllegalArgumentException();
                }
                ((ContentProviderClient) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.f8454a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((y) it2.next()).a();
        }
        arrayList.clear();
    }

    public final void f(boolean z5) {
        d2.f fVar;
        this.f8455b = z5;
        Iterator it = this.f8454a.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            boolean z7 = yVar.f8453g && z5;
            if (yVar.f8450d != z7) {
                yVar.f8450d = z7;
                d2.c cVar = yVar.f8451e;
                if (cVar != null && (fVar = cVar.f8083b) != null) {
                    fVar.b();
                }
            }
        }
    }

    public void a() {
    }
}
