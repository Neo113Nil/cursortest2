package com.usercentrics.tcf.core.model;

import io.ktor.http.LinkHeader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\t\u0010\n\u001a\u00020\u0004H\u0096\u0002J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096\u0002R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"com/usercentrics/tcf/core/model/Vector$iterator$1", "", "Lkotlin/Pair;", "", "", "i", "getI", "()I", "setI", "(I)V", "hasNext", LinkHeader.Rel.Next, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Vector$iterator$1 implements Iterator<Pair<? extends Integer, ? extends Boolean>>, KMappedMarker {
    private int i = 1;
    final /* synthetic */ Vector this$0;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    Vector$iterator$1(Vector vector) {
        this.this$0 = vector;
    }

    public final int getI() {
        return this.i;
    }

    public final void setI(int i) {
        this.i = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2 = this.i;
        i = this.this$0.maxId_;
        return i2 <= i;
    }

    @Override // java.util.Iterator
    public Pair<? extends Integer, ? extends Boolean> next() {
        int i = this.i;
        this.i = i + 1;
        return TuplesKt.to(Integer.valueOf(i), Boolean.valueOf(this.this$0.has(i)));
    }
}
