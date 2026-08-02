package di;

import Zh.InterfaceC1901b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4122x extends AbstractC4120w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4122x(InterfaceC1901b element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // di.AbstractC4077a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Iterator e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // di.AbstractC4077a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int f(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }
}
