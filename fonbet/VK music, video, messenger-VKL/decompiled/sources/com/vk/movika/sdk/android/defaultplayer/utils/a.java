package com.vk.movika.sdk.android.defaultplayer.utils;

import android.graphics.Color;
import kotlin.text.Regex;
import xsna.an10;
import xsna.drm0;
import xsna.n8g;

/* loaded from: classes3.dex */
public final class a {
    public static final int a(String str, Double d) {
        if (!new Regex("^#[a-fA-F0-9]{6}$").a(str)) {
            str = new Regex("^#[a-fA-F0-9]{3}$").a(str) ? str.concat(drm0.g0(str, "#", str)) : "#000000";
        }
        return n8g.l(Color.parseColor(str), an10.a(d.doubleValue() * 255.0d));
    }
}
