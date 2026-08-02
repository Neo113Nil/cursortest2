package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Eg implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fn f12197a;

    /* renamed from: b, reason: collision with root package name */
    public final W f12198b;

    /* renamed from: c, reason: collision with root package name */
    public final C0197h6 f12199c;

    /* renamed from: d, reason: collision with root package name */
    public final Bl f12200d;

    /* renamed from: e, reason: collision with root package name */
    public final He f12201e;

    /* renamed from: f, reason: collision with root package name */
    public final Ie f12202f;

    public Eg() {
        this(new Fn(), new W(new C0615xn()), new C0197h6(), new Bl(), new He(), new Ie());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 fromModel(@NonNull Dg dg2) {
        X5 x52 = new X5();
        x52.f13172f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(dg2.f12144a, x52.f13172f));
        Qn qn = dg2.f12145b;
        if (qn != null) {
            Gn gn = qn.f12784a;
            if (gn != null) {
                x52.f13167a = this.f12197a.fromModel(gn);
            }
            V v5 = qn.f12785b;
            if (v5 != null) {
                x52.f13168b = this.f12198b.fromModel(v5);
            }
            List<Dl> list = qn.f12786c;
            if (list != null) {
                x52.f13171e = this.f12200d.fromModel(list);
            }
            x52.f13169c = (String) WrapUtils.getOrDefault(qn.f12790g, x52.f13169c);
            x52.f13170d = this.f12199c.a(qn.f12791h);
            if (!TextUtils.isEmpty(qn.f12787d)) {
                x52.f13175i = this.f12201e.fromModel(qn.f12787d);
            }
            if (!TextUtils.isEmpty(qn.f12788e)) {
                x52.j = qn.f12788e.getBytes();
            }
            if (!lo.a(qn.f12789f)) {
                x52.f13176k = this.f12202f.fromModel(qn.f12789f);
            }
        }
        return x52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Eg(Fn fn, W w10, C0197h6 c0197h6, Bl bl, He he2, Ie ie2) {
        this.f12197a = fn;
        this.f12198b = w10;
        this.f12199c = c0197h6;
        this.f12200d = bl;
        this.f12201e = he2;
        this.f12202f = ie2;
    }

    @NonNull
    public final Dg a(@NonNull X5 x52) {
        throw new UnsupportedOperationException();
    }
}
