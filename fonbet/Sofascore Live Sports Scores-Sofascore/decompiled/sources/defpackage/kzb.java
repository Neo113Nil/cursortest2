package defpackage;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kzb extends pqd {
    public final /* synthetic */ MaterialDatePicker a;

    public kzb(MaterialDatePicker materialDatePicker) {
        this.a = materialDatePicker;
    }

    @Override // defpackage.pqd
    public final void a() {
        this.a.P.setEnabled(false);
    }

    @Override // defpackage.pqd
    public final void b(Object obj) {
        MaterialDatePicker materialDatePicker = this.a;
        materialDatePicker.v(materialDatePicker.r());
        materialDatePicker.P.setEnabled(((SingleDateSelector) materialDatePicker.q()).a != null);
    }
}
