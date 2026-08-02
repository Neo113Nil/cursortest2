package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDatePicker f5905b;

    public /* synthetic */ e(MaterialDatePicker materialDatePicker, int i5) {
        this.f5904a = i5;
        this.f5905b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5904a) {
            case 0:
                this.f5905b.lambda$initHeaderToggle$0(view);
                break;
            case 1:
                this.f5905b.onPositiveButtonClick(view);
                break;
            default:
                this.f5905b.onNegativeButtonClick(view);
                break;
        }
    }
}
