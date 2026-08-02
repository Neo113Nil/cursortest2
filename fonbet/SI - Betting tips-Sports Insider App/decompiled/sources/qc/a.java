package qc;

import c0.h0;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.domain.service.PreviewLastDayService;
import eg.x;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewLastDayService f22094b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(PreviewLastDayService previewLastDayService) {
        super(r0);
        x xVar = x.f9236a;
        this.f22094b = previewLastDayService;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void W(Throwable th2, CoroutineContext coroutineContext) {
        WeakReference weakReference = new WeakReference(null);
        PreviewLastDayService previewLastDayService = this.f22094b;
        int i5 = previewLastDayService.f6878b;
        try {
            if (((h0) weakReference.get()) == null) {
                weakReference = new WeakReference((h0) y3.m(h0.class, null, 6));
            }
            Object obj = weakReference.get();
            Intrinsics.checkNotNull(obj);
            ((h0) obj).f3273b.cancel(null, i5);
        } catch (Exception unused) {
        }
        previewLastDayService.jobFinished(previewLastDayService.f6877a, false);
    }
}
