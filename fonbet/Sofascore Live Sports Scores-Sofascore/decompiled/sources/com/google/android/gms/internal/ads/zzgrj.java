package com.google.android.gms.internal.ads;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzgrj {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static Intent a(Intent intent, int i) {
        boolean b = b(0, 17);
        boolean b2 = b(0, 9);
        boolean b3 = b(0, 5);
        boolean b4 = b(0, 3);
        zzguk.b("Must set component on Intent.", intent.getComponent() != null);
        if (b(0, 1)) {
            zzguk.b("Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.", !b(i, 67108864));
        } else {
            zzguk.b("Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.", b(i, 67108864));
        }
        Intent intent2 = new Intent(intent);
        if (!b(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b4 && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b2 && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b3 && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b && intent2.getClipData() == null) {
                intent2.setClipData(a);
            }
        }
        return intent2;
    }

    public static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
