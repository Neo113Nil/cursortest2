package com.google.android.material.textfield;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f5970b;

    public /* synthetic */ a(EndIconDelegate endIconDelegate, int i5) {
        this.f5969a = i5;
        this.f5970b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5969a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f5970b).lambda$new$0(view);
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f5970b).lambda$new$0(view);
                break;
            default:
                ((PasswordToggleEndIconDelegate) this.f5970b).lambda$new$0(view);
                break;
        }
    }
}
