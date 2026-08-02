package com.vk.clips.viewer.api.routing.models;

import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import kotlin.random.Random;
import xsna.epx;
import xsna.io2;
import xsna.iq;
import xsna.kwc;
import xsna.u4q0;
import xsna.wp50;
import xsna.zik0;

/* compiled from: ClipFeedTransientArgumentsContainer.kt */
/* loaded from: classes17.dex */
public final class ClipFeedTransientArgumentsContainer extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ClipFeedTransientArgumentsContainer> CREATOR = new b();
    public final kwc b;
    public final io2 c;
    public final wp50 d;

    /* compiled from: ClipFeedTransientArgumentsContainer.kt */
    public static final class a {
        public static final SparseArray<ClipFeedTransientArgumentsContainer> a = new SparseArray<>(1);
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipFeedTransientArgumentsContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipFeedTransientArgumentsContainer a(Serializer serializer) {
            SparseArray<ClipFeedTransientArgumentsContainer> sparseArray = a.a;
            int u = serializer.u();
            SparseArray<ClipFeedTransientArgumentsContainer> sparseArray2 = a.a;
            u4q0 u4q0Var = zik0.a;
            ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = sparseArray2.get(u);
            sparseArray2.remove(u);
            return clipFeedTransientArgumentsContainer == null ? new ClipFeedTransientArgumentsContainer(null, null, null) : clipFeedTransientArgumentsContainer;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipFeedTransientArgumentsContainer[i];
        }
    }

    public ClipFeedTransientArgumentsContainer(kwc kwcVar, io2 io2Var, wp50 wp50Var) {
        this.b = kwcVar;
        this.c = io2Var;
        this.d = wp50Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Random.b.getClass();
        int j = Random.c.j();
        serializer.S(j);
        a.a.put(j, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipFeedTransientArgumentsContainer)) {
            return false;
        }
        ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = (ClipFeedTransientArgumentsContainer) obj;
        return epx.f(this.b, clipFeedTransientArgumentsContainer.b) && epx.f(this.c, clipFeedTransientArgumentsContainer.c) && epx.f(this.d, clipFeedTransientArgumentsContainer.d);
    }

    public final int hashCode() {
        kwc kwcVar = this.b;
        int hashCode = (kwcVar == null ? 0 : kwcVar.hashCode()) * 31;
        io2 io2Var = this.c;
        int hashCode2 = (hashCode + (io2Var == null ? 0 : io2Var.hashCode())) * 31;
        wp50 wp50Var = this.d;
        return hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipFeedTransientArgumentsContainer(initialData=");
        sb.append(this.b);
        sb.append(", animationCallback=");
        sb.append(this.c);
        sb.append(", myTargetFacade=");
        return iq.c(sb, this.d, ')');
    }

    public final io2 zb() {
        return this.c;
    }
}
