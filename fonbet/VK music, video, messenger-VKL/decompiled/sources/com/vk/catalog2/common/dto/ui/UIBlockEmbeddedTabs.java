package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.j5g;
import xsna.mcl0;
import xsna.qjg;
import xsna.zrp;

/* compiled from: UIBlockEmbeddedTabs.kt */
/* loaded from: classes16.dex */
public final class UIBlockEmbeddedTabs extends UIBlock {
    public static final Serializer.c<UIBlockEmbeddedTabs> CREATOR = new a();
    public final UIBlockCatalog y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockEmbeddedTabs> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockEmbeddedTabs a(Serializer serializer) {
            return new UIBlockEmbeddedTabs(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockEmbeddedTabs[i];
        }
    }

    public UIBlockEmbeddedTabs(com.vk.catalog2.common.dto.api.ui.a aVar, UIBlockCatalog uIBlockCatalog) {
        super(aVar);
        this.y = uIBlockCatalog;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b + '_' + this.y.k;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.e0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockEmbeddedTabs) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockEmbeddedTabs) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('[');
        return ho8.a(sb, j5g.g0(this.y.A, null, null, null, 0, new mcl0(8), 31), ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockEmbeddedTabs(Ab(), this.y.zb());
    }

    public UIBlockEmbeddedTabs(Serializer serializer) {
        super(serializer);
        this.y = (UIBlockCatalog) serializer.A(UIBlockCatalog.class.getClassLoader());
    }

    /* compiled from: UIBlockEmbeddedTabs.kt */
    public static final class End extends UIBlock {
        public static final Serializer.c<End> CREATOR = new a();
        public final String A;
        public final State y;
        public final String z;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UIBlockEmbeddedTabs.kt */
        public static final class State {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final State EMPTY_BANNER;
            public static final State HIDDEN;
            public static final State SHOW_MORE;

            static {
                State state = new State("HIDDEN", 0);
                HIDDEN = state;
                State state2 = new State("SHOW_MORE", 1);
                SHOW_MORE = state2;
                State state3 = new State("EMPTY_BANNER", 2);
                EMPTY_BANNER = state3;
                State[] stateArr = {state, state2, state3};
                $VALUES = stateArr;
                $ENTRIES = new asp(stateArr);
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<End> {
            @Override // com.vk.core.serialize.Serializer.c
            public final End a(Serializer serializer) {
                return new End(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new End[i];
            }
        }

        public End(com.vk.catalog2.common.dto.api.ui.a aVar, State state, String str, String str2) {
            super(aVar);
            this.y = state;
            this.z = str;
            this.A = str2;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.b + '_' + this.k;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.j0(this.y.name());
            serializer.j0(this.z);
            serializer.j0(this.A);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof End) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            End end = (End) obj;
            return this.y == end.y && epx.f(this.z, end.z) && epx.f(this.A, end.A);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(qjg.a(this));
            sb.append('<');
            sb.append(this.y);
            sb.append(", ");
            return ho8.a(sb, this.z, '>');
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            return new End(Ab(), this.y, this.z, this.A);
        }

        public End(Serializer serializer) {
            super(serializer);
            this.y = State.valueOf(serializer.H());
            this.z = serializer.H();
            this.A = serializer.H();
        }
    }
}
