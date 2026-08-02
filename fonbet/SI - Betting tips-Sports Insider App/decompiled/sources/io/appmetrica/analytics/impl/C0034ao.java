package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034ao extends Rg {
    public C0034ao(X4 x42) {
        super(x42);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        String j = this.f12818a.f13144c.j();
        String str = p52.f12734h;
        this.f12818a.f13144c.j(str).b();
        if (TextUtils.equals(j, str)) {
            return false;
        }
        this.f12818a.a(M3.o());
        return false;
    }
}
