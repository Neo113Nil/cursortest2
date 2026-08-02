package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import hi.InterfaceC4510a;
import hi.b;
import java.util.Collections;
import java.util.List;
import ji.AbstractC5137a;

/* loaded from: classes5.dex */
public class NewHtcHomeBadger implements InterfaceC4510a {
    @Override // hi.InterfaceC4510a
    public List a() {
        return Collections.singletonList("com.htc.launcher");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        boolean z10;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i10);
        boolean z11 = false;
        try {
            AbstractC5137a.c(context, intent);
            z10 = true;
        } catch (b unused) {
            z10 = false;
        }
        try {
            AbstractC5137a.c(context, intent2);
            z11 = true;
        } catch (b unused2) {
        }
        if (z10 || z11) {
            return;
        }
        throw new b("unable to resolve intent: " + intent2.toString());
    }
}
