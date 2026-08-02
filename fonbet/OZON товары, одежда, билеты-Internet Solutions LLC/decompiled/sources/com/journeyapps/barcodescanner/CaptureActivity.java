package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public class CaptureActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private g f60249a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f60250b;

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.f60250b = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        g gVar = new g(this, this.f60250b);
        this.f60249a = gVar;
        gVar.m(getIntent(), bundle);
        this.f60249a.k();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        this.f60249a.n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.f60250b.onKeyDown(i11, keyEvent) || super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.f60249a.o();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.f60249a.p(iArr, i11);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        this.f60249a.q();
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f60249a.r(bundle);
    }
}
