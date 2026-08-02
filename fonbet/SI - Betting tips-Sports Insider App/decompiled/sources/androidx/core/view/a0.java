package androidx.core.view;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f1280a;

    public a0(NestedScrollView nestedScrollView) {
        this.f1280a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // androidx.core.view.b0
    public final void onScrollLimit(int i5, int i10, int i11, boolean z5) {
        this.f1280a.onScrollLimit(i5, i10, i11, z5);
    }

    @Override // androidx.core.view.b0
    public final void onScrollProgress(int i5, int i10, int i11, int i12) {
        this.f1280a.onScrollProgress(i5, i10, i11, i12);
    }
}
