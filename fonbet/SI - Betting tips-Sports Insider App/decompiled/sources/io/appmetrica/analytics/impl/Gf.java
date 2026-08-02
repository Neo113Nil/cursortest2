package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Gf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0481se f12265a;

    /* renamed from: b, reason: collision with root package name */
    public final C0607xf f12266b;

    /* renamed from: c, reason: collision with root package name */
    public final C0296l3 f12267c;

    /* renamed from: d, reason: collision with root package name */
    public final If f12268d;

    /* renamed from: e, reason: collision with root package name */
    public final C0477sa f12269e;

    /* renamed from: f, reason: collision with root package name */
    public final C0477sa f12270f;

    public Gf() {
        this(new C0481se(), new C0607xf(), new C0296l3(), new If(), new C0477sa(100), new C0477sa(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull Hf hf2) {
        Di di2;
        Di di3;
        Di di4;
        Di di5;
        C0351n8 c0351n8 = new C0351n8();
        Mn a7 = this.f12269e.a(hf2.f12311a);
        c0351n8.f14312a = StringUtils.getUTF8Bytes((String) a7.f12615a);
        Mn a10 = this.f12270f.a(hf2.f12312b);
        c0351n8.f14313b = StringUtils.getUTF8Bytes((String) a10.f12615a);
        List<String> list = hf2.f12313c;
        Di di6 = null;
        if (list != null) {
            di2 = this.f12267c.fromModel(list);
            c0351n8.f14314c = (C0147f8) di2.f12148a;
        } else {
            di2 = null;
        }
        Map<String, String> map = hf2.f12314d;
        if (map != null) {
            di3 = this.f12265a.fromModel(map);
            c0351n8.f14315d = (C0301l8) di3.f12148a;
        } else {
            di3 = null;
        }
        C0657zf c0657zf = hf2.f12315e;
        if (c0657zf != null) {
            di4 = this.f12266b.fromModel(c0657zf);
            c0351n8.f14316e = (C0326m8) di4.f12148a;
        } else {
            di4 = null;
        }
        C0657zf c0657zf2 = hf2.f12316f;
        if (c0657zf2 != null) {
            di5 = this.f12266b.fromModel(c0657zf2);
            c0351n8.f14317f = (C0326m8) di5.f12148a;
        } else {
            di5 = null;
        }
        List<String> list2 = hf2.f12317g;
        if (list2 != null) {
            di6 = this.f12268d.fromModel(list2);
            c0351n8.f14318g = (C0376o8[]) di6.f12148a;
        }
        return new Di(c0351n8, new C0013a3(C0013a3.b(a7, a10, di2, di3, di4, di5, di6)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Gf(C0481se c0481se, C0607xf c0607xf, C0296l3 c0296l3, If r42, C0477sa c0477sa, C0477sa c0477sa2) {
        this.f12265a = c0481se;
        this.f12266b = c0607xf;
        this.f12267c = c0296l3;
        this.f12268d = r42;
        this.f12269e = c0477sa;
        this.f12270f = c0477sa2;
    }

    @NonNull
    public final Hf a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
