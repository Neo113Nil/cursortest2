package com.google.android.material.search;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f5940b;

    public /* synthetic */ h(SearchView searchView, int i5) {
        this.f5939a = i5;
        this.f5940b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5939a) {
            case 0:
                this.f5940b.lambda$setUpClearButton$2(view);
                break;
            case 1:
                this.f5940b.lambda$setupWithSearchBar$7(view);
                break;
            default:
                this.f5940b.lambda$setUpBackButton$1(view);
                break;
        }
    }
}
