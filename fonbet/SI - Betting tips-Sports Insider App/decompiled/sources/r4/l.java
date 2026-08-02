package r4;

import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f22310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f22311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f22312c;

    public l(f fVar, ViewTreeObserver viewTreeObserver, m mVar) {
        this.f22310a = fVar;
        this.f22311b = viewTreeObserver;
        this.f22312c = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f22311b;
        boolean isAlive = viewTreeObserver.isAlive();
        m mVar = this.f22312c;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(mVar);
        } else {
            this.f22310a.f22297b.getViewTreeObserver().removeOnPreDrawListener(mVar);
        }
        return Unit.f19194a;
    }
}
