package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import hi.InterfaceC4510a;
import java.util.Arrays;
import java.util.List;
import ji.AbstractC5137a;

/* loaded from: classes5.dex */
public class AdwHomeBadger implements InterfaceC4510a {
    @Override // hi.InterfaceC4510a
    public List a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i10);
        AbstractC5137a.c(context, intent);
    }
}
