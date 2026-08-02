package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477sa extends C2 {
    public C0477sa(int i5) {
        super(i5);
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0502ta
    @NonNull
    public final Mn a(String str) {
        int i5 = 0;
        if (str != null) {
            int length = str.length();
            int i10 = this.f12097a;
            if (length > i10) {
                String substring = str.substring(0, i10);
                i5 = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new Mn(str, new C0013a3(i5));
    }
}
