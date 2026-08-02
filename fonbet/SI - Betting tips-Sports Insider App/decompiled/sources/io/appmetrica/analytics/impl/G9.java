package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class G9 {
    public static final A9 a(int i5, String str) {
        byte[] bArr;
        A9 a92 = new A9();
        a92.f11982a = i5;
        if (str == null || (bArr = str.getBytes(Charsets.UTF_8)) == null) {
            bArr = a92.f11983b;
        }
        a92.f11983b = bArr;
        return a92;
    }
}
