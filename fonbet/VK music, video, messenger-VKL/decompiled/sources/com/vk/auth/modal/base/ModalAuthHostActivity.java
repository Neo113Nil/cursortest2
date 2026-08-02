package com.vk.auth.modal.base;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import com.google.android.material.bottomsheet.c;
import com.vk.api.generated.auth.dto.AuthIndexedCodeDto;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bne0;
import xsna.cb0;
import xsna.dhr0;
import xsna.do50;
import xsna.dw20;
import xsna.e370;
import xsna.e43;
import xsna.foe0;
import xsna.fv20;
import xsna.gfx0;
import xsna.gsc;
import xsna.gzv;
import xsna.hb0;
import xsna.kv20;
import xsna.r9k;
import xsna.rhh0;
import xsna.rv20;
import xsna.tv20;
import xsna.xv20;

/* compiled from: ModalAuthHostActivity.kt */
/* loaded from: classes15.dex */
public final class ModalAuthHostActivity extends AppCompatActivity implements xv20 {
    public static final List<String> h = e43.l("modal_auth_fragment_tag", "qr_map_bottom_sheet", "consentFragment");
    public kv20 f;
    public final hb0<Intent> g = registerForActivityResult(new cb0(), new gsc(this, 1));

    @Override // xsna.xv20
    public final void A() {
        setResult(2);
    }

    @Override // xsna.xv20
    public final void H0() {
        setResult(-1);
    }

    public final void O1(Intent intent) {
        ModalAuthInfo modalAuthInfo;
        d bne0Var;
        kv20 rhh0Var;
        Bundle arguments;
        Parcelable parcelable;
        Object parcelable2;
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("close_required", false)) {
            finish();
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = extras.getParcelable("init_info", ModalAuthInfo.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = extras.getParcelable("init_info");
                if (!(parcelable3 instanceof ModalAuthInfo)) {
                    parcelable3 = null;
                }
                parcelable = (ModalAuthInfo) parcelable3;
            }
            modalAuthInfo = (ModalAuthInfo) parcelable;
        } else {
            modalAuthInfo = null;
        }
        if (modalAuthInfo != null) {
            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("confirmation_codes", AuthIndexedCodeDto.class) : intent.getParcelableArrayListExtra("confirmation_codes");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                int i = rv20.$EnumSwitchMapping$0[modalAuthInfo.b.ordinal()];
                if (i == 1) {
                    bne0Var = new bne0();
                    Bundle bundle = new Bundle(1);
                    bundle.putParcelable("info", modalAuthInfo);
                    bne0Var.setArguments(bundle);
                } else if (i == 2) {
                    bne0Var = new foe0();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putParcelable("info", modalAuthInfo);
                    bne0Var.setArguments(bundle2);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bne0Var = new do50();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putParcelable("info", modalAuthInfo);
                    bne0Var.setArguments(bundle3);
                }
                rhh0Var = new rhh0(bne0Var);
            } else {
                rhh0Var = new QrWithCodeAuthModal(modalAuthInfo, parcelableArrayListExtra);
            }
            kv20 kv20Var = this.f;
            if (kv20Var != null) {
                kv20Var.g();
            }
            this.f = null;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Iterator<T> it = h.iterator();
            while (it.hasNext()) {
                Fragment H = supportFragmentManager.H((String) it.next());
                if (H != null) {
                    fv20 fv20Var = H instanceof fv20 ? (fv20) H : null;
                    if (fv20Var != null && (arguments = fv20Var.getArguments()) != null) {
                        arguments.putBoolean("need_finish_activity", false);
                    }
                    dw20 dw20Var = H instanceof dw20 ? (dw20) H : null;
                    if (dw20Var != null) {
                        dw20Var.hide();
                    }
                    c cVar = H instanceof c ? (c) H : null;
                    if (cVar != null) {
                        cVar.dismiss();
                    }
                }
            }
            this.f = rhh0Var;
            rhh0Var.c(this);
        }
        if (intent.getBooleanExtra("open_camera", false)) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.h(permissionHelper, this, PermissionHelper.z, R.string.vk_permissions_camera_qr, R.string.vk_permissions_camera_qr_settings, new gzv(this, 11), new r9k(this, 27), 64);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        setTheme(dhr0.M() ? R.style.VkSuperappkit_Dark_Transparent : R.style.VkSuperappkit_Light_Transparent);
        super.onCreate(bundle);
        if (bundle == null) {
            O1(getIntent());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        O1(intent);
    }

    /* compiled from: ModalAuthHostActivity.kt */
    public static final class a implements tv20 {
        public a() {
        }

        @Override // xsna.tv20
        public final void a(Throwable th) {
            ModalAuthHostActivity.this.finish();
        }

        @Override // xsna.tv20
        public final void b() {
        }
    }
}
