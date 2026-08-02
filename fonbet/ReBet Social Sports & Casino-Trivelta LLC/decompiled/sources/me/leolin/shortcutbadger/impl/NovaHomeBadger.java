package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import hi.InterfaceC4510a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public class NovaHomeBadger implements InterfaceC4510a {
    @Override // hi.InterfaceC4510a
    public List a() {
        return Arrays.asList("com.teslacoilsw.launcher");
    }

    @Override // hi.InterfaceC4510a
    public void b(Context context, ComponentName componentName, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i10));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
