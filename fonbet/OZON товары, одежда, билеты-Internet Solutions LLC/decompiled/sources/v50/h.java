package v50;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f102338b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f102337a = i11;
        this.f102338b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102337a) {
            case 0:
                return j.h((j) this.f102338b, (MotionEvent) obj);
            default:
                return z90.e.j0((z90.e) this.f102338b);
        }
    }
}
