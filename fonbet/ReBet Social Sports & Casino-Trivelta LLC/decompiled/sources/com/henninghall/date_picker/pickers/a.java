package com.henninghall.date_picker.pickers;

import android.graphics.Paint;
import android.view.View;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: com.henninghall.date_picker.pickers.a$a, reason: collision with other inner class name */
    public interface InterfaceC0537a {
        void a();

        void b();
    }

    public interface b {
        void a(a aVar, int i10, int i11);
    }

    void a(int i10, boolean z10);

    void b(int i10);

    boolean c();

    int getValue();

    View getView();

    void setDisplayedValues(String[] strArr);

    void setDividerColor(String str);

    void setMaxValue(int i10);

    void setMinValue(int i10);

    void setOnValueChangeListenerInScrolling(b bVar);

    void setOnValueChangedListener(InterfaceC0537a interfaceC0537a);

    void setTextAlign(Paint.Align align);

    void setTextColor(String str);

    void setValue(int i10);

    void setVisibility(int i10);

    void setWrapSelectorWheel(boolean z10);
}
