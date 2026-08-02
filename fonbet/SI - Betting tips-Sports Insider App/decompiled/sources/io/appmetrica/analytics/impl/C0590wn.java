package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590wn {

    /* renamed from: a, reason: collision with root package name */
    public final String f14876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14877b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14878c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14879d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f14880e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14881f;

    public C0590wn(String str, int i5, long j, String str2, Integer num, List list) {
        this.f14876a = str;
        this.f14877b = i5;
        this.f14878c = j;
        this.f14879d = str2;
        this.f14880e = num;
        this.f14881f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}
