package com.vk.voip.ui.qr.ui;

import androidx.lifecycle.f;
import com.vkontakte.android.FragmentWrapperActivity;
import java.util.List;
import xsna.nht;
import xsna.tvo;

/* compiled from: VoipQrCodeScannerActivity.kt */
/* loaded from: classes7.dex */
public final class VoipQrCodeScannerActivity extends FragmentWrapperActivity {
    @Override // com.vk.navigation.NavigationDelegateActivity, xsna.nht
    public final void K0(int i, String[] strArr) {
        f u = Y().u();
        nht nhtVar = u instanceof nht ? (nht) u : null;
        if (nhtVar != null) {
            nhtVar.K0(i, strArr);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        f u = Y().u();
        tvo.a aVar = u instanceof tvo.a ? (tvo.a) u : null;
        if (aVar != null) {
            aVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, xsna.tvo.a
    public final void pc(int i, List<String> list) {
        f u = Y().u();
        tvo.a aVar = u instanceof tvo.a ? (tvo.a) u : null;
        if (aVar != null) {
            aVar.pc(i, list);
        }
    }

    @Override // com.vk.navigation.NavigationDelegateActivity, xsna.tvo.a
    public final void wi(int i, List<String> list) {
        f u = Y().u();
        tvo.a aVar = u instanceof tvo.a ? (tvo.a) u : null;
        if (aVar != null) {
            aVar.wi(i, list);
        }
    }
}
