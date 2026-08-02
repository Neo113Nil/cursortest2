package com.braze.events.internal.dispatchmanager;

import com.braze.models.q;
import com.braze.requests.o;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class c {
    public static final a e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f518a;
    public final List b;
    public final q c;
    public final o d;

    public c(b commandType, List brazeEvents, q qVar, com.braze.requests.b bVar, int i) {
        brazeEvents = (i & 2) != 0 ? CollectionsKt.emptyList() : brazeEvents;
        qVar = (i & 4) != 0 ? null : qVar;
        bVar = (i & 8) != 0 ? null : bVar;
        Intrinsics.checkNotNullParameter(commandType, "commandType");
        Intrinsics.checkNotNullParameter(brazeEvents, "brazeEvents");
        this.f518a = commandType;
        this.b = brazeEvents;
        this.c = qVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f518a == cVar.f518a && Intrinsics.areEqual(this.b, cVar.b) && Intrinsics.areEqual(this.c, cVar.c) && Intrinsics.areEqual(this.d, cVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.f518a.hashCode() * 31)) * 31;
        q qVar = this.c;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.f648a.hashCode())) * 31;
        o oVar = this.d;
        return hashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "DispatchCommandEvent(commandType=" + this.f518a + ", brazeEvents=" + this.b + ", sessionId=" + this.c + ", brazeRequest=" + this.d + ")";
    }
}
