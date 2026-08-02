package bo.app;

import bo.app.ng;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ng {

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator f25837b = new Comparator() { // from class: c3.V6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ng.a((bo.app.y9) obj, (bo.app.y9) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final PriorityQueue f25838a;

    public ng(ArrayList fallbackActions) {
        Intrinsics.checkNotNullParameter(fallbackActions, "fallbackActions");
        PriorityQueue priorityQueue = new PriorityQueue(12, f25837b);
        this.f25838a = priorityQueue;
        priorityQueue.addAll(fallbackActions);
    }

    public static final int a(y9 actionA, y9 actionB) {
        Intrinsics.checkNotNullParameter(actionA, "actionA");
        Intrinsics.checkNotNullParameter(actionB, "actionB");
        rg rgVar = (rg) actionA;
        int i10 = rgVar.f26029b.f25828c;
        rg rgVar2 = (rg) actionB;
        int i11 = rgVar2.f26029b.f25828c;
        if (i10 > i11) {
            return -1;
        }
        if (i10 < i11) {
            return 1;
        }
        return rgVar.f26028a.compareTo(rgVar2.f26028a);
    }
}
