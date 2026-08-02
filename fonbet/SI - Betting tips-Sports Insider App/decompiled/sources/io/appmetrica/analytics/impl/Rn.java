package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Rn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fn f12830a;

    /* renamed from: b, reason: collision with root package name */
    public final W f12831b;

    /* renamed from: c, reason: collision with root package name */
    public final C0197h6 f12832c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f12833d;

    /* renamed from: e, reason: collision with root package name */
    public final He f12834e;

    /* renamed from: f, reason: collision with root package name */
    public final Ie f12835f;

    public Rn() {
        this(new Fn(), new W(new C0615xn()), new C0197h6(), new Bl(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 fromModel(@NonNull Qn qn) {
        V5 v5 = new V5();
        Gn gn = qn.f12784a;
        if (gn != null) {
            v5.f13020a = this.f12830a.fromModel(gn);
        }
        V v10 = qn.f12785b;
        if (v10 != null) {
            v5.f13021b = this.f12831b.fromModel(v10);
        }
        List<Dl> list = qn.f12786c;
        if (list != null) {
            v5.f13024e = this.f12833d.fromModel(list);
        }
        String str = qn.f12790g;
        if (str != null) {
            v5.f13022c = str;
        }
        v5.f13023d = this.f12832c.a(qn.f12791h);
        if (!TextUtils.isEmpty(qn.f12787d)) {
            v5.f13027h = this.f12834e.fromModel(qn.f12787d);
        }
        if (!TextUtils.isEmpty(qn.f12788e)) {
            v5.f13028i = qn.f12788e.getBytes();
        }
        if (!lo.a(qn.f12789f)) {
            v5.j = this.f12835f.fromModel(qn.f12789f);
        }
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Rn(Fn fn, W w10, C0197h6 c0197h6, Bl bl, He he2, Ie ie2) {
        this.f12831b = w10;
        this.f12830a = fn;
        this.f12832c = c0197h6;
        this.f12833d = bl;
        this.f12834e = he2;
        this.f12835f = ie2;
    }

    @NonNull
    public final Qn a(@NonNull V5 v5) {
        throw new UnsupportedOperationException();
    }
}
