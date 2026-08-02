package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081cj {

    /* renamed from: a, reason: collision with root package name */
    public final String f13529a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13530b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13531c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f13532d;

    public C0081cj(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), eCommerceScreen.getSearchQuery(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public final String toString() {
        return "ScreenWrapper{name='" + this.f13529a + "', categoriesPath=" + this.f13530b + ", searchQuery='" + this.f13531c + "', payload=" + this.f13532d + '}';
    }

    public C0081cj(String str, String str2, List list, Map map) {
        this.f13529a = str;
        this.f13530b = list;
        this.f13531c = str2;
        this.f13532d = map;
    }
}
