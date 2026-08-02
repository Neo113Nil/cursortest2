package com.vk.catalog2.common.dto.ui.profile;

import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.e43;
import xsna.rl3;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogProfileLocalState.kt */
/* loaded from: classes16.dex */
public final class CatalogProfileLocalState extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogProfileLocalState> CREATOR = new a();
    public FollowSource b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogProfileLocalState.kt */
    public static final class FollowSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FollowSource[] $VALUES;
        public static final a Companion;
        public static final FollowSource External;
        public static final FollowSource Internal;
        public static final FollowSource InternalPending;
        public static final FollowSource None;

        /* compiled from: CatalogProfileLocalState.kt */
        public static final class a {
        }

        static {
            FollowSource followSource = new FollowSource("External", 0);
            External = followSource;
            FollowSource followSource2 = new FollowSource("Internal", 1);
            Internal = followSource2;
            FollowSource followSource3 = new FollowSource("InternalPending", 2);
            InternalPending = followSource3;
            FollowSource followSource4 = new FollowSource("None", 3);
            None = followSource4;
            FollowSource[] followSourceArr = {followSource, followSource2, followSource3, followSource4};
            $VALUES = followSourceArr;
            $ENTRIES = new asp(followSourceArr);
            Companion = new a();
        }

        public FollowSource() {
            throw null;
        }

        public static FollowSource valueOf(String str) {
            return (FollowSource) Enum.valueOf(FollowSource.class, str);
        }

        public static FollowSource[] values() {
            return (FollowSource[]) $VALUES.clone();
        }

        public final boolean h() {
            return e43.l(Internal, InternalPending).contains(this);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogProfileLocalState> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogProfileLocalState a(Serializer serializer) {
            return new CatalogProfileLocalState(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogProfileLocalState[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogProfileLocalState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static CatalogProfileLocalState zb(CatalogProfileLocalState catalogProfileLocalState) {
        FollowSource followSource = catalogProfileLocalState.b;
        catalogProfileLocalState.getClass();
        return new CatalogProfileLocalState(followSource);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogProfileLocalState) && this.b == ((CatalogProfileLocalState) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CatalogProfileLocalState(followSource=" + this.b + ')';
    }

    public /* synthetic */ CatalogProfileLocalState(FollowSource followSource, int i, zcl zclVar) {
        this((i & 1) != 0 ? FollowSource.None : followSource);
    }

    public CatalogProfileLocalState(FollowSource followSource) {
        this.b = followSource;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogProfileLocalState(Serializer serializer) {
        this(r2 == null ? FollowSource.None : r2);
        FollowSource.a aVar = FollowSource.Companion;
        int u = serializer.u();
        aVar.getClass();
        FollowSource followSource = (FollowSource) rl3.S(u, FollowSource.values());
    }
}
