package com.playtika.pras.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes2.dex */
public abstract class d extends Fragment implements e {
    public String b;
    public b a = null;
    public boolean c = true;

    public void browserSwitch(int i, String str) {
        f fVar = new f();
        fVar.b = i;
        fVar.c = Uri.parse(str);
        this.a.a(fVar, this);
    }

    public String getReturnUrlScheme() {
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.b = context.getApplicationContext().getPackageName().toLowerCase().replace("_", "") + ".browserswitch";
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new b(new c(this.c), new a(), getReturnUrlScheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        i iVar;
        Uri uri;
        super.onResume();
        this.a.getClass();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new IllegalStateException("Fragment must be attached to an activity.");
        }
        Context applicationContext = activity.getApplicationContext();
        h a = g.a(applicationContext);
        if (a != null) {
            l.a(applicationContext);
            int i = a.c;
            if (a.b.equalsIgnoreCase("SUCCESS")) {
                uri = a.a;
                iVar = new i(1);
            } else {
                iVar = new i(2);
                uri = null;
            }
            onBrowserSwitchResult(i, iVar, uri);
        }
    }

    public void browserSwitch(int i, Intent intent) {
        f fVar = new f();
        fVar.a = intent;
        fVar.b = i;
        this.a.a(fVar, this);
    }

    public void browserSwitch(f fVar) {
        this.a.a(fVar, this);
    }
}
