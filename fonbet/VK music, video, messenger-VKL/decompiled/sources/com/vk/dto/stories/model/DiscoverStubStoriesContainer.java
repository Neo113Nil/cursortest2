package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DiscoverStubStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class DiscoverStubStoriesContainer extends StoriesContainer {
    public static final Serializer.c<DiscoverStubStoriesContainer> CREATOR = new a();
    public final String o;
    public State p;
    public final boolean q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DiscoverStubStoriesContainer.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NO_GRID_LOADER;
        public static final State NO_MORE_STORIES_AVAILABLE_STEP1;
        public static final State NO_MORE_STORIES_AVAILABLE_STEP2;

        static {
            State state = new State("NO_MORE_STORIES_AVAILABLE_STEP1", 0);
            NO_MORE_STORIES_AVAILABLE_STEP1 = state;
            State state2 = new State("NO_MORE_STORIES_AVAILABLE_STEP2", 1);
            NO_MORE_STORIES_AVAILABLE_STEP2 = state2;
            State state3 = new State("NO_GRID_LOADER", 2);
            NO_GRID_LOADER = state3;
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
    public static final class a extends Serializer.c<DiscoverStubStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverStubStoriesContainer a(Serializer serializer) {
            return new DiscoverStubStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverStubStoriesContainer[i];
        }
    }

    public DiscoverStubStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.o = "";
        this.p = State.NO_MORE_STORIES_AVAILABLE_STEP1;
        this.q = true;
        String H = serializer.H();
        this.o = H != null ? H : "";
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Cb() {
        return this.g.isEmpty() ? this.e : super.Cb();
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Eb() {
        return this.q;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.o);
    }

    public DiscoverStubStoriesContainer(String str, boolean z, String str2) {
        super(null, EmptyList.b, str2, z);
        this.o = "";
        this.p = State.NO_MORE_STORIES_AVAILABLE_STEP1;
        this.q = true;
        this.o = str;
    }
}
