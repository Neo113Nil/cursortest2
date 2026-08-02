package ru.ozon.app.android.scanit.scanit;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.activity.J;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.scanit.R$drawable;
import ru.ozon.app.android.feature.scanit.R$id;
import ru.ozon.app.android.feature.scanit.R$layout;

@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001>\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\u0003J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020!H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u0003R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItCaptureFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Lru/ozon/app/android/scanit/scanit/CloseAction;", "action", "", "pauseCamera", "(Lru/ozon/app/android/scanit/scanit/CloseAction;)V", "", "loadSoundState", "()Z", "state", "saveSoundState", "(Z)V", "beepEnabled", "enableBeep", "Landroid/view/MenuItem;", "item", "onSoundIconToggle", "(Landroid/view/MenuItem;)V", "newSoundState", "updateSoundState", "(Landroid/view/MenuItem;Z)V", "onFlashIconToggle", "", "id", "safeSetIcon", "(Landroid/view/MenuItem;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "onPrepareOptionsMenu", "(Landroid/view/Menu;)V", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "resumeScanning", "Lru/ozon/app/android/scanit/scanit/ManageableCaptureManager;", "capture", "Lru/ozon/app/android/scanit/scanit/ManageableCaptureManager;", "Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;", "barcodeScannerView", "Lcom/journeyapps/barcodescanner/DecoratedBarcodeView;", "isVolumeOn", "Z", "ru/ozon/app/android/scanit/scanit/ScanItCaptureFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lru/ozon/app/android/scanit/scanit/ScanItCaptureFragment$onBackPressedCallback$1;", "Companion", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScanItCaptureFragment extends ComponentCallbacksC5392m {
    private DecoratedBarcodeView barcodeScannerView;
    private ManageableCaptureManager capture;
    private boolean isVolumeOn;

    @NotNull
    private final ScanItCaptureFragment$onBackPressedCallback$1 onBackPressedCallback = new C() { // from class: ru.ozon.app.android.scanit.scanit.ScanItCaptureFragment$onBackPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            ScanItCaptureFragment.this.pauseCamera(CloseAction.BACK_PRESSED);
        }
    };

    private final void enableBeep(boolean beepEnabled) {
        ManageableCaptureManager manageableCaptureManager = this.capture;
        if (manageableCaptureManager == null) {
            Intrinsics.n("capture");
            throw null;
        }
        manageableCaptureManager.getBeepManager().c(beepEnabled);
        ManageableCaptureManager manageableCaptureManager2 = this.capture;
        if (manageableCaptureManager2 != null) {
            manageableCaptureManager2.getBeepManager().d(!beepEnabled);
        } else {
            Intrinsics.n("capture");
            throw null;
        }
    }

    private final boolean loadSoundState() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("soundPref", true);
    }

    private final void onFlashIconToggle(MenuItem item) {
        if (item.isChecked()) {
            safeSetIcon(item, R$drawable.ic_flash_off);
            DecoratedBarcodeView decoratedBarcodeView = this.barcodeScannerView;
            if (decoratedBarcodeView == null) {
                Intrinsics.n("barcodeScannerView");
                throw null;
            }
            decoratedBarcodeView.h();
            item.setChecked(false);
            return;
        }
        safeSetIcon(item, R$drawable.ic_flash_on);
        DecoratedBarcodeView decoratedBarcodeView2 = this.barcodeScannerView;
        if (decoratedBarcodeView2 == null) {
            Intrinsics.n("barcodeScannerView");
            throw null;
        }
        decoratedBarcodeView2.i();
        item.setChecked(true);
    }

    private final void onSoundIconToggle(MenuItem item) {
        updateSoundState(item, !item.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseCamera(CloseAction action) {
        ManageableCaptureManager manageableCaptureManager = this.capture;
        if (manageableCaptureManager == null) {
            Intrinsics.n("capture");
            throw null;
        }
        manageableCaptureManager.onPause();
        ManageableCaptureManager manageableCaptureManager2 = this.capture;
        if (manageableCaptureManager2 != null) {
            manageableCaptureManager2.setCloseAction(action);
        } else {
            Intrinsics.n("capture");
            throw null;
        }
    }

    private final void safeSetIcon(MenuItem item, int id2) {
        Context context = getContext();
        if (context != null) {
            item.setIcon(C7232a.a(context, id2));
        }
    }

    private final void saveSoundState(boolean state) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("soundPref", state).apply();
    }

    private final void updateSoundState(MenuItem item, boolean newSoundState) {
        safeSetIcon(item, newSoundState ? R$drawable.ic_volume_on : R$drawable.ic_volume_off);
        enableBeep(newSoundState);
        saveSoundState(newSoundState);
        item.setChecked(newSoundState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R$layout.fragment_scan_it, container, false);
        setHasOptionsMenu(true);
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        ManageableCaptureManager manageableCaptureManager = this.capture;
        if (manageableCaptureManager != null) {
            manageableCaptureManager.onDestroy();
        } else {
            Intrinsics.n("capture");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == R$id.menu_scan_it_info) {
            pauseCamera(CloseAction.OPEN_SCAN_INTRO);
            return true;
        }
        if (itemId == R$id.menu_flash) {
            onFlashIconToggle(item);
            return true;
        }
        if (itemId == R$id.menu_volume_on) {
            onSoundIconToggle(item);
            return true;
        }
        if (itemId != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        pauseCamera(CloseAction.BACK_PRESSED);
        return true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        super.onPause();
        ManageableCaptureManager manageableCaptureManager = this.capture;
        if (manageableCaptureManager != null) {
            manageableCaptureManager.onPause();
        } else {
            Intrinsics.n("capture");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R$id.menu_volume_on);
        Intrinsics.checkNotNullExpressionValue(findItem, "findItem(...)");
        updateSoundState(findItem, this.isVolumeOn);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        ManageableCaptureManager manageableCaptureManager = this.capture;
        if (manageableCaptureManager != null) {
            manageableCaptureManager.onResume();
        } else {
            Intrinsics.n("capture");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        ManageableCaptureManager manageableCaptureManager = this.capture;
        if (manageableCaptureManager != null) {
            manageableCaptureManager.onSaveInstanceState(outState);
        } else {
            Intrinsics.n("capture");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DecoratedBarcodeView decoratedBarcodeView = (DecoratedBarcodeView) view.findViewById(R$id.zxing_barcode_scanner);
        this.barcodeScannerView = decoratedBarcodeView;
        if (decoratedBarcodeView == null) {
            Intrinsics.n("barcodeScannerView");
            throw null;
        }
        decoratedBarcodeView.g("");
        r activity = getActivity();
        ComponentCallbacksC5392m parentFragment = getParentFragment();
        DecoratedBarcodeView decoratedBarcodeView2 = this.barcodeScannerView;
        if (decoratedBarcodeView2 == null) {
            Intrinsics.n("barcodeScannerView");
            throw null;
        }
        ManageableCaptureManager manageableCaptureManager = new ManageableCaptureManager(activity, parentFragment, decoratedBarcodeView2);
        this.capture = manageableCaptureManager;
        manageableCaptureManager.initializeFromIntent(requireActivity().getIntent(), savedInstanceState);
        ManageableCaptureManager manageableCaptureManager2 = this.capture;
        if (manageableCaptureManager2 == null) {
            Intrinsics.n("capture");
            throw null;
        }
        manageableCaptureManager2.decode();
        boolean loadSoundState = loadSoundState();
        this.isVolumeOn = loadSoundState;
        enableBeep(loadSoundState);
        J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.onBackPressedCallback);
    }

    public final void resumeScanning() {
        DecoratedBarcodeView decoratedBarcodeView = this.barcodeScannerView;
        if (decoratedBarcodeView == null) {
            Intrinsics.n("barcodeScannerView");
            throw null;
        }
        decoratedBarcodeView.f();
        ManageableCaptureManager manageableCaptureManager = this.capture;
        if (manageableCaptureManager != null) {
            manageableCaptureManager.decode();
        } else {
            Intrinsics.n("capture");
            throw null;
        }
    }
}
