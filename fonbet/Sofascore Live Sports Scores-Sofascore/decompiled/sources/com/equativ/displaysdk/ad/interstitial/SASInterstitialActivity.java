package com.equativ.displaysdk.ad.interstitial;

import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.deg;
import defpackage.eeg;
import defpackage.feg;
import defpackage.xag;
import defpackage.zag;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/equativ/displaysdk/ad/interstitial/SASInterstitialActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Leeg;", "<init>", "()V", "smart-display-sdk_prodRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SASInterstitialActivity extends AppCompatActivity implements eeg {
    public static final HashMap j = new HashMap();
    public feg i;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        int i = extras.getInt("InterstitialViewId");
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = j;
        feg fegVar = (feg) hashMap.get(valueOf);
        if (fegVar != null) {
            this.i = fegVar;
            deg degVar = (deg) fegVar;
            degVar.setInterstitialViewHolderListener(this);
            setContentView(degVar.getInterstitialView());
            xag xagVar = degVar.g;
            if (xagVar != null) {
                ((zag) xagVar).e();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        xag xagVar;
        feg fegVar = this.i;
        if (fegVar != null && (xagVar = ((deg) fegVar).g) != null) {
            ((zag) xagVar).d();
        }
        feg fegVar2 = this.i;
        if (fegVar2 != null) {
            ((deg) fegVar2).setInterstitialViewHolderListener(null);
        }
        this.i = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                insetsController.setSystemBarsBehavior(2);
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(4614);
        }
        feg fegVar = this.i;
        if (fegVar != null) {
            deg degVar = (deg) fegVar;
            if (degVar.getShouldCloseOnClick() && degVar.getAdWasClicked()) {
                finish();
            }
        }
    }
}
