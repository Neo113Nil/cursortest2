package io.appmetrica.analytics.impl;

import android.content.Context;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432qe implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public final File f14511a;

    /* renamed from: b, reason: collision with root package name */
    public final Jg f14512b;

    public C0432qe(@NotNull File file, @NotNull Jg jg2) {
        this.f14511a = file;
        this.f14512b = jg2;
    }

    @Override // io.appmetrica.analytics.impl.I6
    @NotNull
    public final File a(@NotNull Context context, @NotNull String str) {
        return new File(this.f14511a, this.f14512b.a(str));
    }
}
