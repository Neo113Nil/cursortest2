package com.henninghall.date_picker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Dynamic;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class i extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public Tb.e f38566a;

    /* renamed from: b, reason: collision with root package name */
    public n f38567b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f38568c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f38569d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            iVar.measure(View.MeasureSpec.makeMeasureSpec(iVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i.this.getHeight(), 1073741824));
            i iVar2 = i.this;
            iVar2.layout(iVar2.getLeft(), i.this.getTop(), i.this.getRight(), i.this.getBottom());
        }
    }

    public i(ViewGroup.LayoutParams layoutParams) {
        super(c.f38475a);
        this.f38567b = new n();
        this.f38568c = new ArrayList();
        this.f38569d = new a();
        LinearLayout linearLayout = new LinearLayout(getContext());
        LayoutInflater.from(getContext()).inflate(this.f38567b.f38606o.d(), linearLayout);
        addView(linearLayout, layoutParams);
        this.f38566a = new Tb.e(this.f38567b, this);
    }

    public void a(Tb.d dVar) {
        this.f38566a.b(dVar);
    }

    public final boolean b(String... strArr) {
        for (String str : strArr) {
            if (this.f38568c.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        if (b("textColor")) {
            this.f38566a.j();
        }
        if (b("mode", "is24hourSource")) {
            this.f38566a.l();
        }
        if (b("mode", Constants.LOCALE, "is24hourSource")) {
            this.f38566a.k();
        }
        if (b("date", Constants.LOCALE, "maximumDate", "minimumDate", "minuteInterval", "mode", "timezoneOffsetInMinutes")) {
            this.f38566a.h();
        }
        if (b(Constants.LOCALE)) {
            Tb.a.a(this.f38567b.u());
        }
        if (b("dividerColor")) {
            this.f38566a.f(this.f38567b.p());
        }
        this.f38566a.g();
        this.f38568c = new ArrayList();
    }

    public void d(String str, Dynamic dynamic) {
        this.f38567b.F(str, dynamic);
        this.f38568c.add(str);
    }

    public String getDate() {
        return this.f38567b.f38606o.a();
    }

    public String getPickerId() {
        return this.f38567b.q();
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f38569d);
    }
}
