package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public class e2 {
    private final Map a;
    private final com.applovin.impl.sdk.l b;

    public e2(Map map, com.applovin.impl.sdk.l lVar) {
        this.a = map == null ? Collections.emptyMap() : map;
        this.b = lVar;
    }

    public Drawable a() {
        Object obj = this.a.get("google_watermark");
        if (!a(obj)) {
            this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.b.Q().b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] decode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(com.applovin.impl.sdk.l.p().getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.b.Q().a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    public String b() {
        return "google watermark";
    }

    public boolean c() {
        return a(this.a.get("google_watermark"));
    }

    private boolean a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}
