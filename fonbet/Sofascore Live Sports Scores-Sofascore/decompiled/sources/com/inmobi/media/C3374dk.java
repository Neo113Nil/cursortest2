package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.wv8;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.dk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3374dk implements N0 {
    public final byte[] a;
    public final String b;

    public C3374dk(String str, byte[] bArr) {
        bArr.getClass();
        str.getClass();
        this.a = bArr;
        this.b = str;
    }

    public final String a(Bitmap bitmap) {
        String y = dmi.y(fc6.C(), ".jpg");
        File file = new File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(new File(wv8.i(this.b, "/", y))));
        return wv8.i(this.b, "/", y);
    }

    @Override // com.inmobi.media.N0
    public final Object a() {
        byte[] bArr = this.a;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        decodeByteArray.getClass();
        return a(decodeByteArray);
    }
}
