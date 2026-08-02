package com.vk.contacts;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.movika.sdk.base.observable.g;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.h7u0;
import xsna.o25;
import xsna.r5i;
import xsna.s15;

/* compiled from: ContactsSyncActivity.kt */
/* loaded from: classes.dex */
public final class ContactsSyncActivity extends AppCompatActivity {
    public static final /* synthetic */ int f = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(dhr0.C().c);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().setBackgroundDrawableResource(R.drawable.transparent);
        setContentView(new View(this));
        if (o25.a().b()) {
            if (!d.a.H0()) {
                ContactsManager.R0(d.a, this, false, null, new g(this, 29), new r5i(this, 1), 12);
                return;
            }
            h7u0.a aVar = new h7u0.a(this);
            aVar.U(R.string.sync_dialog_sync_enabled);
            aVar.c0(R.string.ok, new s15(this, 1));
            aVar.m();
        }
    }
}
