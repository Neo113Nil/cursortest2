package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class t<S> extends z<S> {

    /* renamed from: b, reason: collision with root package name */
    private int f58301b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5846d<S> f58302c;

    /* renamed from: d, reason: collision with root package name */
    private C5843a f58303d;

    final class a extends y<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.y
        public final void a(S s11) {
            Iterator<y<S>> it = t.this.f58326a.iterator();
            while (it.hasNext()) {
                it.next().a(s11);
            }
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f58301b = bundle.getInt("THEME_RES_ID_KEY");
        this.f58302c = (InterfaceC5846d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f58303d = (C5843a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f58301b));
        InterfaceC5846d<S> interfaceC5846d = this.f58302c;
        new a();
        return interfaceC5846d.X();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f58301b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f58302c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f58303d);
    }
}
