package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p<S> extends t {

    /* renamed from: n, reason: collision with root package name */
    public int f35415n;

    /* renamed from: o, reason: collision with root package name */
    public DateSelector f35416o;

    /* renamed from: p, reason: collision with root package name */
    public CalendarConstraints f35417p;

    public class a extends s {
        public a() {
        }

        @Override // com.google.android.material.datepicker.s
        public void a() {
            Iterator it = p.this.f35434m.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a();
            }
        }

        @Override // com.google.android.material.datepicker.s
        public void b(Object obj) {
            Iterator it = p.this.f35434m.iterator();
            while (it.hasNext()) {
                ((s) it.next()).b(obj);
            }
        }
    }

    public static p f0(DateSelector dateSelector, int i10, CalendarConstraints calendarConstraints) {
        p pVar = new p();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        pVar.setArguments(bundle);
        return pVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f35415n = bundle.getInt("THEME_RES_ID_KEY");
        this.f35416o = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f35417p = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f35416o.P(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f35415n)), viewGroup, bundle, this.f35417p, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f35415n);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f35416o);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f35417p);
    }
}
