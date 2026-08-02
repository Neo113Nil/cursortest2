package com.journeyapps.barcodescanner;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.journeyapps.barcodescanner.c;
import h9.q;
import h9.r;
import h9.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private CaptureActivity f60305a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f60306b;

    /* renamed from: h, reason: collision with root package name */
    private m9.i f60312h;

    /* renamed from: i, reason: collision with root package name */
    private m9.e f60313i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f60314j;

    /* renamed from: m, reason: collision with root package name */
    private final c.e f60317m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f60318n;

    /* renamed from: c, reason: collision with root package name */
    private int f60307c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60308d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f60309e = true;

    /* renamed from: f, reason: collision with root package name */
    private String f60310f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f60311g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f60315k = false;

    /* renamed from: l, reason: collision with root package name */
    private N9.a f60316l = new a();

    final class a implements N9.a {
        a() {
        }

        @Override // N9.a
        public final void barcodeResult(final com.journeyapps.barcodescanner.a aVar) {
            g gVar = g.this;
            gVar.f60306b.d();
            gVar.f60313i.b();
            gVar.f60314j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.s(aVar);
                }
            });
        }

        @Override // N9.a
        public final void possibleResultPoints(List<s> list) {
        }
    }

    final class b implements c.e {
        b() {
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void cameraClosed() {
            g gVar = g.this;
            if (gVar.f60315k) {
                Log.d("g", "Camera closed; finishing activity");
                g.i(gVar);
            }
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void cameraError(Exception exc) {
            g gVar = g.this;
            gVar.l(gVar.f60305a.getString(R.string.zxing_msg_camera_framework_bug));
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void previewSized() {
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void previewStarted() {
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public final void previewStopped() {
        }
    }

    public g(CaptureActivity captureActivity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f60317m = bVar;
        this.f60318n = false;
        this.f60305a = captureActivity;
        this.f60306b = decoratedBarcodeView;
        ((BarcodeView) decoratedBarcodeView.findViewById(R.id.zxing_barcode_surface)).h(bVar);
        this.f60314j = new Handler();
        this.f60312h = new m9.i(captureActivity, new N9.c(this, 0));
        this.f60313i = new m9.e(captureActivity);
    }

    public static void a(g gVar) {
        gVar.f60305a.finish();
    }

    public static void b(g gVar) {
        gVar.f60305a.finish();
    }

    public static void c(g gVar) {
        gVar.getClass();
        Log.d("g", "Finishing due to inactivity");
        gVar.f60305a.finish();
    }

    static void i(g gVar) {
        gVar.f60305a.finish();
    }

    protected final void j() {
        DecoratedBarcodeView decoratedBarcodeView = this.f60306b;
        if (((BarcodeView) decoratedBarcodeView.findViewById(R.id.zxing_barcode_surface)).o()) {
            this.f60305a.finish();
        } else {
            this.f60315k = true;
        }
        decoratedBarcodeView.d();
        this.f60312h.c();
    }

    public final void k() {
        this.f60306b.b(this.f60316l);
    }

    protected final void l(String str) {
        CaptureActivity captureActivity = this.f60305a;
        if (captureActivity.isFinishing() || this.f60311g || this.f60315k) {
            return;
        }
        if (str.isEmpty()) {
            str = captureActivity.getString(R.string.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(captureActivity);
        builder.setTitle(captureActivity.getString(R.string.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: N9.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                com.journeyapps.barcodescanner.g.a(com.journeyapps.barcodescanner.g.this);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: N9.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.journeyapps.barcodescanner.g.b(com.journeyapps.barcodescanner.g.this);
            }
        });
        builder.show();
    }

    public final void m(Intent intent, Bundle bundle) {
        int i11;
        CaptureActivity captureActivity = this.f60305a;
        captureActivity.getWindow().addFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
        if (bundle != null) {
            this.f60307c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (this.f60307c == -1) {
                    int rotation = captureActivity.getWindowManager().getDefaultDisplay().getRotation();
                    int i12 = captureActivity.getResources().getConfiguration().orientation;
                    if (i12 == 2) {
                        if (rotation != 0 && rotation != 1) {
                            i11 = 8;
                            this.f60307c = i11;
                        }
                        i11 = 0;
                        this.f60307c = i11;
                    } else {
                        if (i12 == 1) {
                            i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
                            this.f60307c = i11;
                        }
                        i11 = 0;
                        this.f60307c = i11;
                    }
                }
                captureActivity.setRequestedOrientation(this.f60307c);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f60306b.c(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f60313i.c(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                this.f60309e = booleanExtra;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                this.f60310f = stringExtra;
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f60314j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.this.t();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f60308d = true;
            }
        }
    }

    public final void n() {
        this.f60311g = true;
        this.f60312h.c();
        this.f60314j.removeCallbacksAndMessages(null);
    }

    public final void o() {
        this.f60312h.c();
        this.f60306b.e();
    }

    public final void p(int[] iArr, int i11) {
        if (i11 == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f60306b.f();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            this.f60305a.setResult(0, intent);
            if (this.f60309e) {
                l(this.f60310f);
            } else {
                j();
            }
        }
    }

    public final void q() {
        CaptureActivity captureActivity = this.f60305a;
        if (androidx.core.content.a.checkSelfPermission(captureActivity, "android.permission.CAMERA") == 0) {
            this.f60306b.f();
        } else if (!this.f60318n) {
            androidx.core.app.b.e(captureActivity, new String[]{"android.permission.CAMERA"}, m.e.DEFAULT_SWIPE_ANIMATION_DURATION);
            this.f60318n = true;
        }
        this.f60312h.d();
    }

    public final void r(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f60307c);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void s(com.journeyapps.barcodescanner.a aVar) {
        String str;
        Intent intent;
        byte[] c11;
        Map<r, Object> d11;
        boolean z11 = this.f60308d;
        CaptureActivity captureActivity = this.f60305a;
        if (z11) {
            Bitmap b11 = aVar.f60269b.b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", captureActivity.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b11.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                str = createTempFile.getAbsolutePath();
            } catch (IOException e11) {
                Log.w("g", "Unable to create temporary file and store bitmap! " + e11);
            }
            intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.addFlags(524288);
            intent.putExtra("SCAN_RESULT", aVar.f60268a.f());
            q qVar = aVar.f60268a;
            intent.putExtra("SCAN_RESULT_FORMAT", qVar.b().toString());
            c11 = qVar.c();
            if (c11 != null && c11.length > 0) {
                intent.putExtra("SCAN_RESULT_BYTES", c11);
            }
            d11 = qVar.d();
            if (d11 != null) {
                r rVar = r.UPC_EAN_EXTENSION;
                if (d11.containsKey(rVar)) {
                    intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d11.get(rVar).toString());
                }
                Number number = (Number) d11.get(r.ORIENTATION);
                if (number != null) {
                    intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                }
                String str2 = (String) d11.get(r.ERROR_CORRECTION_LEVEL);
                if (str2 != null) {
                    intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
                }
                Iterable iterable = (Iterable) d11.get(r.BYTE_SEGMENTS);
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i11, (byte[]) it.next());
                        i11++;
                    }
                }
            }
            if (str != null) {
                intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
            }
            captureActivity.setResult(-1, intent);
            j();
        }
        str = null;
        intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", aVar.f60268a.f());
        q qVar2 = aVar.f60268a;
        intent.putExtra("SCAN_RESULT_FORMAT", qVar2.b().toString());
        c11 = qVar2.c();
        if (c11 != null) {
            intent.putExtra("SCAN_RESULT_BYTES", c11);
        }
        d11 = qVar2.d();
        if (d11 != null) {
        }
        if (str != null) {
        }
        captureActivity.setResult(-1, intent);
        j();
    }

    protected final void t() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f60305a.setResult(0, intent);
        j();
    }
}
