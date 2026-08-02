package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class V8 extends W8 {

    /* renamed from: a, reason: collision with root package name */
    public final List f13029a;

    public V8(List<Object> list) {
        this.f13029a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f13029a;
    }
}
