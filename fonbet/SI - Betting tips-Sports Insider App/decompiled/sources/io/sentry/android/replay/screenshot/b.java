package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f16075b;

    public /* synthetic */ b(d dVar, int i5) {
        this.f16074a = i5;
        this.f16075b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16074a) {
            case 0:
                d.d(this.f16075b);
                return;
            default:
                d dVar = this.f16075b;
                Bitmap bitmap = dVar.f16081e;
                if (bitmap != null) {
                    synchronized (bitmap) {
                        try {
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            Unit unit = Unit.f19194a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                dVar.f16088m.release();
                dVar.f16087l.release();
                return;
        }
    }
}
