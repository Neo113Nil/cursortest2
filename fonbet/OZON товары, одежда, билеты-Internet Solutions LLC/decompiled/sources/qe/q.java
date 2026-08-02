package qe;

import kotlin.jvm.internal.Intrinsics;
import qe.AbstractC9030a;

/* loaded from: classes10.dex */
public final class q<K, V, T extends V> extends AbstractC9030a.AbstractC1384a<K, V, T> implements id.e<AbstractC9030a<K, V>, V> {
    @Override // id.e
    public final Object getValue(Object obj, kotlin.reflect.m property) {
        AbstractC9030a<K, V> thisRef = (AbstractC9030a) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return a(thisRef);
    }
}
