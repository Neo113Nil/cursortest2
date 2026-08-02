package defpackage;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.datepicker.c;
import com.google.android.material.datepicker.i;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vhh extends c {
    public final /* synthetic */ i i;
    public final /* synthetic */ TextInputLayout j;
    public final /* synthetic */ SingleDateSelector k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhh(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, i iVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.k = singleDateSelector;
        this.i = iVar;
        this.j = textInputLayout2;
    }
}
