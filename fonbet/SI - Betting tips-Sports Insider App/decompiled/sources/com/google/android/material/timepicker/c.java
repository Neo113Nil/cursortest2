package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5985b;

    public /* synthetic */ c(int i5, Object obj) {
        this.f5984a = i5;
        this.f5985b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i5, boolean z5) {
        switch (this.f5984a) {
            case 0:
                ((TimePickerTextInputPresenter) this.f5985b).lambda$setupPeriodToggle$0(materialButtonToggleGroup, i5, z5);
                break;
            default:
                ((TimePickerView) this.f5985b).lambda$new$0(materialButtonToggleGroup, i5, z5);
                break;
        }
    }
}
