package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0590wn f12994a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12995b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12996c;

    public V(C0590wn c0590wn, ArrayList arrayList, String str) {
        this.f12994a = c0590wn;
        this.f12995b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f12996c = str;
    }
}
