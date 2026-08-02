package iF;

import android.view.View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

/* renamed from: iF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class RunnableC7028a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f66160b;

    public /* synthetic */ RunnableC7028a(View view, int i11) {
        this.f66159a = i11;
        this.f66160b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66159a) {
            case 0:
                ViewExtKt.gone(this.f66160b);
                break;
            default:
                this.f66160b.setVisibility(4);
                break;
        }
    }
}
