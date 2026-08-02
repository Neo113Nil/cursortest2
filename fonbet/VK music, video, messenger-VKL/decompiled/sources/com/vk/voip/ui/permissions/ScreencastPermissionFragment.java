package com.vk.voip.ui.permissions;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.vk.core.fragments.FragmentImpl;
import com.vk.voip.ui.permissions.ScreencastPermissionFragment;
import xsna.cb0;
import xsna.hb0;
import xsna.qqt0;
import xsna.ua0;
import xsna.yu1;

/* compiled from: ScreencastPermissionFragment.kt */
/* loaded from: classes7.dex */
public final class ScreencastPermissionFragment extends FragmentImpl {
    public static final /* synthetic */ int Q = 0;
    public yu1 N;
    public qqt0 O;
    public hb0<Intent> P;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 61832) {
            if (i2 == -1) {
                yu1 yu1Var = this.N;
                if (yu1Var != null) {
                    yu1Var.invoke(intent);
                }
            } else {
                qqt0 qqt0Var = this.O;
                if (qqt0Var != null) {
                    qqt0Var.invoke();
                }
            }
        }
        tn();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.P = registerForActivityResult(new cb0(), new ua0() { // from class: xsna.odh0
            @Override // xsna.ua0
            public final void onActivityResult(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i = ScreencastPermissionFragment.Q;
                int i2 = activityResult.b;
                ScreencastPermissionFragment screencastPermissionFragment = ScreencastPermissionFragment.this;
                if (i2 == -1) {
                    yu1 yu1Var = screencastPermissionFragment.N;
                    if (yu1Var != null) {
                        yu1Var.invoke(activityResult.c);
                    }
                } else {
                    qqt0 qqt0Var = screencastPermissionFragment.O;
                    if (qqt0Var != null) {
                        qqt0Var.invoke();
                    }
                }
                screencastPermissionFragment.tn();
            }
        });
    }
}
