package ru.ozon.app.android.scanit.scanit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.c;
import com.journeyapps.barcodescanner.g;
import h9.s;
import java.util.List;
import m9.e;
import m9.i;
import ru.ozon.app.android.R;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.uikit.text.StringProvider;

/* loaded from: classes13.dex */
public class ManageableCaptureManager {
    private static final String TAG = g.class.getSimpleName();
    private final Activity activity;
    private final DecoratedBarcodeView barcodeView;
    private final e beepManager;
    private final i inactivityTimer;
    private final ComponentCallbacksC5392m parentFragment;
    private final N9.a callback = new N9.a() { // from class: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager.1
        @Override // N9.a
        public void barcodeResult(final com.journeyapps.barcodescanner.a aVar) {
            ManageableCaptureManager.this.barcodeView.d();
            ManageableCaptureManager.this.beepManager.b();
            ManageableCaptureManager.this.handler.post(new Runnable() { // from class: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager.1.1
                @Override // java.lang.Runnable
                public void run() {
                    ManageableCaptureManager.this.returnResult(aVar);
                }
            });
        }

        @Override // N9.a
        public void possibleResultPoints(List<s> list) {
        }
    };
    private int orientationLock = -1;
    private boolean destroyed = false;
    private boolean askedPermission = false;
    private boolean isPaused = false;
    private CloseAction closeAction = CloseAction.NONE;
    private c.e stateListener = new c.e() { // from class: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager.2
        @Override // com.journeyapps.barcodescanner.c.e
        public void cameraClosed() {
            int i11 = AnonymousClass7.$SwitchMap$ru$ozon$app$android$scanit$scanit$CloseAction[ManageableCaptureManager.this.closeAction.ordinal()];
            if (i11 == 1) {
                ManageableCaptureManager.this.finish();
            } else if (i11 == 2) {
                ((ScanItFragment) ManageableCaptureManager.this.parentFragment).openScanItIntro();
            }
            ManageableCaptureManager.this.stateListener = null;
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public void cameraError(Exception exc) {
            ManageableCaptureManager.this.displayFrameworkBugMessageAndExit();
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public void previewSized() {
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public void previewStarted() {
        }

        @Override // com.journeyapps.barcodescanner.c.e
        public void previewStopped() {
        }
    };
    private final Handler handler = new Handler();

    /* renamed from: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$ru$ozon$app$android$scanit$scanit$CloseAction;

        static {
            int[] iArr = new int[CloseAction.values().length];
            $SwitchMap$ru$ozon$app$android$scanit$scanit$CloseAction = iArr;
            try {
                iArr[CloseAction.BACK_PRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ozon$app$android$scanit$scanit$CloseAction[CloseAction.OPEN_SCAN_INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ManageableCaptureManager(Activity activity, ComponentCallbacksC5392m componentCallbacksC5392m, DecoratedBarcodeView decoratedBarcodeView) {
        this.activity = activity;
        this.parentFragment = componentCallbacksC5392m;
        this.barcodeView = decoratedBarcodeView;
        this.beepManager = new e(activity);
        this.inactivityTimer = new i(activity, new Runnable() { // from class: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager.3
            @Override // java.lang.Runnable
            public void run() {
                Lm0.a.f17149a.d(ManageableCaptureManager.TAG, "Finishing due to inactivity");
                ManageableCaptureManager.this.finish();
            }
        });
        ((BarcodeView) decoratedBarcodeView.findViewById(R.id.zxing_barcode_surface)).h(this.stateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finish() {
        ((ScanItFragment) this.parentFragment).close();
    }

    private void openCameraWithPermission() {
        if (PermissionExtensionsKt.isPermissionGranted(this.activity, "android.permission.CAMERA")) {
            this.barcodeView.f();
        } else {
            if (this.askedPermission) {
                return;
            }
            androidx.core.app.b.e(this.activity, new String[]{"android.permission.CAMERA"}, m.e.DEFAULT_SWIPE_ANIMATION_DURATION);
            this.askedPermission = true;
        }
    }

    public void decode() {
        this.barcodeView.b(this.callback);
    }

    protected void displayFrameworkBugMessageAndExit() {
        if (this.activity.isFinishing() || this.destroyed) {
            return;
        }
        new AlertDialog.Builder(this.activity).setTitle(StringProvider.getString(R.string.zxing_app_name)).setMessage(StringProvider.getString(R.string.zxing_msg_camera_framework_bug)).setPositiveButton(R.string.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                ManageableCaptureManager.this.finish();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                ManageableCaptureManager.this.finish();
            }
        }).show();
    }

    public e getBeepManager() {
        return this.beepManager;
    }

    public void initializeFromIntent(Intent intent, Bundle bundle) {
        this.activity.getWindow().addFlags(UserVerificationMethods.USER_VERIFY_PATTERN);
        if (bundle != null) {
            this.orientationLock = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                lockOrientation();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.barcodeView.c(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.beepManager.c(false);
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.handler.postDelayed(new Runnable() { // from class: ru.ozon.app.android.scanit.scanit.ManageableCaptureManager.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ManageableCaptureManager.this.returnResultTimeout();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
        }
    }

    protected void lockOrientation() {
        if (this.orientationLock == -1) {
            int rotation = this.activity.getWindowManager().getDefaultDisplay().getRotation();
            int i11 = this.activity.getResources().getConfiguration().orientation;
            int i12 = 0;
            if (i11 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i12 = 8;
                }
            } else if (i11 == 1) {
                i12 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.orientationLock = i12;
        }
        this.activity.setRequestedOrientation(this.orientationLock);
    }

    public void onDestroy() {
        this.destroyed = true;
        this.inactivityTimer.c();
    }

    public void onPause() {
        if (this.isPaused) {
            return;
        }
        this.barcodeView.d();
        this.inactivityTimer.c();
        this.isPaused = true;
    }

    public void onResume() {
        openCameraWithPermission();
        this.inactivityTimer.d();
        this.isPaused = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.orientationLock);
    }

    protected void returnResult(com.journeyapps.barcodescanner.a aVar) {
        ((ScanItFragment) this.parentFragment).provideBarcode(new Intent().putExtra("SCAN_RESULT", aVar.a().f()));
    }

    protected void returnResultTimeout() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        ((ScanItFragment) this.parentFragment).setResult(0, intent);
        finish();
    }

    public void setCloseAction(CloseAction closeAction) {
        this.closeAction = closeAction;
    }
}
