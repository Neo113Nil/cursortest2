package io.sentry.featureflags;

import io.sentry.protocol.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public volatile CopyOnWriteArrayList f16416a;

    @Override // io.sentry.featureflags.b
    public final h j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f16416a.iterator();
        if (!it.hasNext()) {
            return new h(arrayList);
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // io.sentry.featureflags.b
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final b m104clone() {
        a aVar = new a();
        new io.sentry.util.a();
        aVar.f16416a = new CopyOnWriteArrayList(this.f16416a);
        return aVar;
    }
}
