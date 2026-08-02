package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Fn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f12240a;

    public Fn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0042b6 fromModel(@NonNull Gn gn) {
        C0042b6 c0042b6 = new C0042b6();
        c0042b6.f13396a = (String) WrapUtils.getOrDefault(gn.f12286a, "");
        c0042b6.f13397b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(gn.f12287b, ""));
        List<Dl> list = gn.f12288c;
        if (list != null) {
            c0042b6.f13398c = this.f12240a.fromModel(list);
        }
        Gn gn2 = gn.f12289d;
        if (gn2 != null) {
            c0042b6.f13399d = fromModel(gn2);
        }
        List list2 = gn.f12290e;
        int i5 = 0;
        if (list2 == null) {
            c0042b6.f13400e = new C0042b6[0];
            return c0042b6;
        }
        c0042b6.f13400e = new C0042b6[list2.size()];
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            c0042b6.f13400e[i5] = fromModel((Gn) it.next());
            i5++;
        }
        return c0042b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Fn(Bl bl) {
        this.f12240a = bl;
    }

    @NonNull
    public final Gn a(@NonNull C0042b6 c0042b6) {
        throw new UnsupportedOperationException();
    }
}
