package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import hi.InterfaceC4510a;
import java.util.Arrays;
import java.util.List;
import ji.AbstractC5137a;

/* loaded from: classes5.dex */
public class DefaultBadger implements InterfaceC4510a {
    @Override // hi.InterfaceC4510a
    public List a() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        AbstractC5137a.b(context, intent);
    }
}
