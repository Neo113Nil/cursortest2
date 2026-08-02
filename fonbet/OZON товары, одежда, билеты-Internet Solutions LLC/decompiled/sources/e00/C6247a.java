package e00;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import b20.C5521a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3ViewHolder;

/* renamed from: e00.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6247a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61733b;

    public /* synthetic */ C6247a(Object obj, int i11) {
        this.f61732a = i11;
        this.f61733b = obj;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a event) {
        switch (this.f61732a) {
            case 0:
                Intrinsics.checkNotNullParameter(j11, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                C5521a.c(((c) this.f61733b).getHolder(), event.a());
                break;
            default:
                TotalV3ViewHolder.lifecycleObserver$lambda$0((TotalV3ViewHolder) this.f61733b, j11, event);
                break;
        }
    }
}
