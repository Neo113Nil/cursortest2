package com.google.android.material.carousel;

import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5868b;

    public /* synthetic */ a(int i5, Object obj) {
        this.f5867a = i5;
        this.f5868b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f5867a) {
            case 0:
                ((CarouselLayoutManager) this.f5868b).lambda$new$0(view, i5, i10, i11, i12, i13, i14, i15, i16);
                break;
            default:
                ((NavigationBarItemView) this.f5868b).lambda$new$0(view, i5, i10, i11, i12, i13, i14, i15, i16);
                break;
        }
    }
}
