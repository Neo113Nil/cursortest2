package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import hi.InterfaceC4510a;
import java.util.Arrays;
import java.util.List;
import ji.AbstractC5137a;

/* loaded from: classes5.dex */
public class ApexHomeBadger implements InterfaceC4510a {
    @Override // hi.InterfaceC4510a
    public List a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", componentName.getClassName());
        AbstractC5137a.c(context, intent);
    }
}
