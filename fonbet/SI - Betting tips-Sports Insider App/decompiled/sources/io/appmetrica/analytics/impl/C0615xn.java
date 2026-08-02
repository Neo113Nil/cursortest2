package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615xn implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Bl f14933a;

    public C0615xn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0016a6 fromModel(@NonNull C0590wn c0590wn) {
        C0016a6 c0016a6 = new C0016a6();
        Integer num = c0590wn.f14880e;
        c0016a6.f13346e = num == null ? -1 : num.intValue();
        c0016a6.f13345d = c0590wn.f14879d;
        c0016a6.f13343b = c0590wn.f14877b;
        c0016a6.f13342a = c0590wn.f14876a;
        c0016a6.f13344c = c0590wn.f14878c;
        Bl bl = this.f14933a;
        List list = c0590wn.f14881f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dl((StackTraceElement) it.next()));
        }
        c0016a6.f13347f = bl.fromModel(arrayList);
        return c0016a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0615xn(Bl bl) {
        this.f14933a = bl;
    }

    @NonNull
    public final C0590wn a(@NonNull C0016a6 c0016a6) {
        throw new UnsupportedOperationException();
    }
}
