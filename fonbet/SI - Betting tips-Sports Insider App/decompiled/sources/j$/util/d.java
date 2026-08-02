package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements java.util.Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f17698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17699c;

    public /* synthetic */ d(java.util.Comparator comparator, Object obj, int i5) {
        this.f17697a = i5;
        this.f17698b = comparator;
        this.f17699c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17697a) {
            case 0:
                java.util.Comparator comparator = this.f17698b;
                java.util.Comparator comparator2 = (java.util.Comparator) this.f17699c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                java.util.Comparator comparator3 = this.f17698b;
                Function function = (Function) this.f17699c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
