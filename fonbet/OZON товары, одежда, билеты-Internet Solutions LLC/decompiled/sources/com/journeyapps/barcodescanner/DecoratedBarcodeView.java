package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import h9.EnumC6876a;
import h9.k;
import h9.s;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private BarcodeView f60251a;

    /* renamed from: b, reason: collision with root package name */
    private ViewfinderView f60252b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f60253c;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements N9.a {

        /* renamed from: a, reason: collision with root package name */
        private N9.a f60254a;

        public a(N9.a aVar) {
            this.f60254a = aVar;
        }

        @Override // N9.a
        public final void barcodeResult(com.journeyapps.barcodescanner.a aVar) {
            this.f60254a.barcodeResult(aVar);
        }

        @Override // N9.a
        public final void possibleResultPoints(List<s> list) {
            for (s sVar : list) {
                ViewfinderView viewfinderView = DecoratedBarcodeView.this.f60252b;
                if (viewfinderView.f60263g.size() < 20) {
                    viewfinderView.f60263g.add(sVar);
                }
            }
            this.f60254a.possibleResultPoints(list);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m9.j.f74668c);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f60251a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.m(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.f60252b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        BarcodeView barcodeView2 = this.f60251a;
        viewfinderView.f60265i = barcodeView2;
        barcodeView2.h(new j(viewfinderView));
        this.f60253c = (TextView) findViewById(R.id.zxing_status_view);
    }

    public final void b(N9.a aVar) {
        this.f60251a.B(new a(aVar));
    }

    public final void c(Intent intent) {
        EnumMap enumMap;
        int intExtra;
        Set<EnumC6876a> a11 = m9.f.a(intent);
        int i11 = m9.g.f74656a;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            enumMap = null;
        } else {
            enumMap = new EnumMap(h9.e.class);
            for (h9.e eVar : h9.e.values()) {
                if (eVar != h9.e.CHARACTER_SET && eVar != h9.e.NEED_RESULT_POINT_CALLBACK && eVar != h9.e.POSSIBLE_FORMATS) {
                    String name = eVar.name();
                    if (extras.containsKey(name)) {
                        if (eVar.a().equals(Void.class)) {
                            enumMap.put((EnumMap) eVar, (h9.e) Boolean.TRUE);
                        } else {
                            Object obj = extras.get(name);
                            if (eVar.a().isInstance(obj)) {
                                enumMap.put((EnumMap) eVar, (h9.e) obj);
                            } else {
                                Log.w("g", "Ignoring hint " + eVar + " because it is not assignable from " + obj);
                            }
                        }
                    }
                }
            }
            Log.i("g", "Hints from the Intent: " + enumMap);
        }
        O9.g gVar = new O9.g();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            gVar.c(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            g(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new k().e(enumMap);
        this.f60251a.u(gVar);
        this.f60251a.C(new N9.h(a11, enumMap, stringExtra2, intExtra2));
    }

    public final void d() {
        this.f60251a.q();
    }

    public final void e() {
        this.f60251a.r();
    }

    public final void f() {
        this.f60251a.t();
    }

    public final void g(String str) {
        TextView textView = this.f60253c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void h() {
        this.f60251a.v(false);
    }

    public final void i() {
        this.f60251a.v(true);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 == 24) {
            i();
            return true;
        }
        if (i11 == 25) {
            h();
            return true;
        }
        if (i11 == 27 || i11 == 80) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }
}
