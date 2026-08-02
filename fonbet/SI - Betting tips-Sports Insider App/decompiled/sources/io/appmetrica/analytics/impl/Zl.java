package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zl extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f13316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13317b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f13318c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13319d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f13320e;

    public Zl(@NonNull H3 h32) {
        this(h32.a().c(), h32.a().d(), h32.a().a(), h32.a().h(), h32.a().b());
    }

    public final boolean a(@NonNull Zl zl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Zl mergeFrom(@NonNull Zl zl) {
        return new Zl((String) WrapUtils.getOrDefaultNullable(this.f13316a, zl.f13316a), (String) WrapUtils.getOrDefaultNullable(this.f13317b, zl.f13317b), (Map) WrapUtils.getOrDefaultNullable(this.f13318c, zl.f13318c), this.f13319d || zl.f13319d, zl.f13319d ? zl.f13320e : this.f13320e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Arguments{distributionReferrer='");
        sb2.append(this.f13316a);
        sb2.append("', installReferrerSource='");
        sb2.append(this.f13317b);
        sb2.append("', clientClids=");
        sb2.append(this.f13318c);
        sb2.append(", hasNewCustomHosts=");
        sb2.append(this.f13319d);
        sb2.append(", newCustomHosts=");
        return androidx.appcompat.widget.c1.p(sb2, this.f13320e, '}');
    }

    public Zl(String str, String str2, Map<String, String> map, boolean z5, List<String> list) {
        this.f13316a = str;
        this.f13317b = str2;
        this.f13318c = map;
        this.f13319d = z5;
        this.f13320e = list;
    }

    public Zl() {
        this(null, null, null, false, null);
    }
}
