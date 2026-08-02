package com.vk.auth.main;

import android.content.Intent;
import com.ironsource.O6;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.main.a;
import com.vk.auth.main.i;
import xsna.bpn0;

/* compiled from: VkClientAuthActivity.kt */
/* loaded from: classes15.dex */
public class VkClientAuthActivity extends DefaultAuthActivity {
    public Country V;
    public String W;
    public String X;
    public boolean Y;

    /* compiled from: VkClientAuthActivity.kt */
    public static final class OauthActivity extends VkClientAuthActivity {
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public final a Q1(a.C0403a c0403a) {
        Intent intent = getIntent();
        new g(this, getSupportFragmentManager(), intent != null ? intent.getBooleanExtra("disableEnterPhone", false) : false);
        new i.a();
        bpn0 bpn0Var = f.a;
        throw null;
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public void R1(Intent intent) {
        super.R1(intent);
        this.V = intent != null ? (Country) intent.getParcelableExtra("preFillCountry") : null;
        this.W = intent != null ? intent.getStringExtra("preFillPhoneWithoutCode") : null;
        this.X = intent != null ? intent.getStringExtra(O6.e1) : null;
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("force_sid_saving", false)) {
            z = true;
        }
        this.Y = z;
    }

    @Override // com.vk.auth.DefaultAuthActivity
    public void Y1() {
        a aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        e eVar = aVar.c;
        String str = this.X;
        Country country = this.V;
        String str2 = this.W;
        eVar.b.G = this.Y;
        SignUpRouter.a.a(eVar.c, str, country, str2, null, 8);
    }
}
