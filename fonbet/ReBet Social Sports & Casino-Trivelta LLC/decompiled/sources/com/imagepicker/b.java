package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class b extends g {
    public b(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                String h10 = new androidx.exifinterface.media.a(openInputStream).h("DateTime");
                if (h10 != null) {
                    this.f39021a = a(h10, "yyyy:MM:dd HH:mm:ss");
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } finally {
            }
        } catch (Exception e10) {
            Log.e("RNIP", "Could not load image metadata: " + e10.getMessage());
        }
    }

    public String b() {
        return this.f39021a;
    }
}
