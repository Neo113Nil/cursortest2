package com.google.android.material.textfield;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f5972b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i5) {
        this.f5971a = i5;
        this.f5972b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        switch (this.f5971a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f5972b).lambda$new$1(view, z5);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f5972b).lambda$new$1(view, z5);
                break;
        }
    }
}
