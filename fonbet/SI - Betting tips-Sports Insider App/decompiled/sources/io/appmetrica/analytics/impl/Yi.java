package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yi implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0481se f13231a;

    /* renamed from: b, reason: collision with root package name */
    public final C0296l3 f13232b;

    /* renamed from: c, reason: collision with root package name */
    public final C0477sa f13233c;

    /* renamed from: d, reason: collision with root package name */
    public final C0477sa f13234d;

    public Yi() {
        this(new C0481se(), new C0296l3(), new C0477sa(100), new C0477sa(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull C0081cj c0081cj) {
        Di di2;
        C0426q8 c0426q8 = new C0426q8();
        Mn a7 = this.f13233c.a(c0081cj.f13529a);
        c0426q8.f14505a = StringUtils.getUTF8Bytes((String) a7.f12615a);
        List<String> list = c0081cj.f13530b;
        Di di3 = null;
        if (list != null) {
            di2 = this.f13232b.fromModel(list);
            c0426q8.f14506b = (C0147f8) di2.f12148a;
        } else {
            di2 = null;
        }
        Mn a10 = this.f13234d.a(c0081cj.f13531c);
        c0426q8.f14507c = StringUtils.getUTF8Bytes((String) a10.f12615a);
        Map<String, String> map = c0081cj.f13532d;
        if (map != null) {
            di3 = this.f13231a.fromModel(map);
            c0426q8.f14508d = (C0301l8) di3.f12148a;
        }
        return new Di(c0426q8, new C0013a3(C0013a3.b(a7, di2, a10, di3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Yi(C0481se c0481se, C0296l3 c0296l3, C0477sa c0477sa, C0477sa c0477sa2) {
        this.f13231a = c0481se;
        this.f13232b = c0296l3;
        this.f13233c = c0477sa;
        this.f13234d = c0477sa2;
    }

    @NonNull
    public final C0081cj a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
