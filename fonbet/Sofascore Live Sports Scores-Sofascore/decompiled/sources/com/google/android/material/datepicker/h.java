package com.google.android.material.datepicker;

import android.os.Bundle;
import com.sofascore.results.R;
import defpackage.lhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h {
    public final SingleDateSelector a;
    public CalendarConstraints b;
    public int c = 0;
    public Long d = null;

    public h(SingleDateSelector singleDateSelector) {
        this.a = singleDateSelector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r2.compareTo(r3.b) <= 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MaterialDatePicker a() {
        Month month;
        if (this.b == null) {
            this.b = new b().a();
        }
        if (this.c == 0) {
            this.c = R.string.mtrl_picker_date_header_title;
        }
        Long l = this.d;
        SingleDateSelector singleDateSelector = this.a;
        if (l != null) {
            singleDateSelector.a = Long.valueOf(lhk.a(l.longValue()));
        }
        CalendarConstraints calendarConstraints = this.b;
        if (calendarConstraints.d == null) {
            if (!singleDateSelector.a().isEmpty()) {
                month = Month.c(((Long) singleDateSelector.a().iterator().next()).longValue());
                CalendarConstraints calendarConstraints2 = this.b;
                if (month.compareTo(calendarConstraints2.a) >= 0) {
                }
            }
            month = new Month(lhk.d());
            CalendarConstraints calendarConstraints3 = this.b;
            if (month.compareTo(calendarConstraints3.a) < 0 || month.compareTo(calendarConstraints3.b) > 0) {
                month = this.b.a;
            }
            calendarConstraints.d = month;
        }
        MaterialDatePicker materialDatePicker = new MaterialDatePicker();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", 0);
        bundle.putParcelable("DATE_SELECTOR_KEY", singleDateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.c);
        bundle.putCharSequence("TITLE_TEXT_KEY", null);
        bundle.putInt("INPUT_MODE_KEY", 0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }
}
