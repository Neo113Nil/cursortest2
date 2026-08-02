package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zd implements so {

    /* renamed from: a, reason: collision with root package name */
    public final String f13292a;

    public Zd(@NonNull String str) {
        this.f13292a = str;
    }

    @Override // io.appmetrica.analytics.impl.so
    public final qo a(String str) {
        return TextUtils.isEmpty(str) ? new qo(this, false, d9.e.l(new StringBuilder(), this.f13292a, " is empty.")) : new qo(this, true, "");
    }
}
