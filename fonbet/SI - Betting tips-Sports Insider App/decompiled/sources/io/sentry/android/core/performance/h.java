package io.sentry.android.core.performance;

import android.view.Window;
import com.appsflyer.internal.o;
import io.sentry.android.core.internal.gestures.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: b, reason: collision with root package name */
    public final o f15816b;

    public h(Window.Callback callback, o oVar) {
        super(callback);
        this.f15816b = oVar;
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.f15816b.run();
    }
}
