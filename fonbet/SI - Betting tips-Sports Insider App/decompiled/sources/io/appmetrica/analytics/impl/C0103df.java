package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103df implements Q7 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final C0433qf f13592a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<C0077cf> f13593b;

    public C0103df(@NonNull C0433qf c0433qf, @NonNull List<C0077cf> list) {
        this.f13592a = c0433qf;
        this.f13593b = list;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    @NonNull
    public final List<C0077cf> a() {
        return this.f13593b;
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final Object b() {
        return this.f13592a;
    }

    public final C0433qf c() {
        return this.f13592a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb2.append(this.f13592a);
        sb2.append(", candidates=");
        return androidx.appcompat.widget.c1.p(sb2, this.f13593b, '}');
    }
}
