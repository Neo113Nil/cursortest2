package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Vi extends Rg {
    public Vi(@NonNull X4 x42) {
        super(x42);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        String str = p52.f12734h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f12818a.f13144c.j(str).b();
        return false;
    }
}
