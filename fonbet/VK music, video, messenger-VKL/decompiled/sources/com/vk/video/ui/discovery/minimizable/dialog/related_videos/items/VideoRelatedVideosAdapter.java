package com.vk.video.ui.discovery.minimizable.dialog.related_videos.items;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.VideoRelatedErrorItem;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.recycler.RelatedVideosRecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.asp;
import xsna.b25;
import xsna.b8j0;
import xsna.bt8;
import xsna.cqr0;
import xsna.e43;
import xsna.e9i0;
import xsna.exi0;
import xsna.f4m;
import xsna.hfz;
import xsna.j8n0;
import xsna.jbt0;
import xsna.kbt0;
import xsna.mbt0;
import xsna.n6s;
import xsna.pbt0;
import xsna.qbt0;
import xsna.qoy;
import xsna.uho0;
import xsna.vic;
import xsna.wx3;
import xsna.x6s;
import xsna.zrp;

/* compiled from: VideoRelatedVideosAdapter.kt */
/* loaded from: classes7.dex */
public final class VideoRelatedVideosAdapter extends wx3 implements vic {
    public final b25 j;
    public final DonutVideoComponent k;
    public final View l;
    public final View m;
    public final View n;
    public final j8n0 o;
    public State p;

    /* compiled from: VideoRelatedVideosAdapter.kt */
    public static final class State {
        public final boolean a;
        public final boolean b;
        public final FooterHeader c;
        public final FooterHeader d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoRelatedVideosAdapter.kt */
        public static final class FooterHeader {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ FooterHeader[] $VALUES;
            public static final FooterHeader Error;
            public static final FooterHeader Invisible;
            public static final FooterHeader Loading;

            static {
                FooterHeader footerHeader = new FooterHeader("Loading", 0);
                Loading = footerHeader;
                FooterHeader footerHeader2 = new FooterHeader("Error", 1);
                Error = footerHeader2;
                FooterHeader footerHeader3 = new FooterHeader("Invisible", 2);
                Invisible = footerHeader3;
                FooterHeader[] footerHeaderArr = {footerHeader, footerHeader2, footerHeader3};
                $VALUES = footerHeaderArr;
                $ENTRIES = new asp(footerHeaderArr);
            }

            public FooterHeader() {
                throw null;
            }

            public static FooterHeader valueOf(String str) {
                return (FooterHeader) Enum.valueOf(FooterHeader.class, str);
            }

            public static FooterHeader[] values() {
                return (FooterHeader[]) $VALUES.clone();
            }
        }

        public State() {
            this(0);
        }

        public static State a(State state, boolean z, boolean z2, FooterHeader footerHeader, FooterHeader footerHeader2, int i) {
            if ((i & 1) != 0) {
                z = state.a;
            }
            if ((i & 2) != 0) {
                z2 = state.b;
            }
            if ((i & 4) != 0) {
                footerHeader = state.c;
            }
            if ((i & 8) != 0) {
                footerHeader2 = state.d;
            }
            state.getClass();
            return new State(z, z2, footerHeader, footerHeader2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.a == state.a && this.b == state.b && this.c == state.c && this.d == state.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "State(isLoadingVisible=" + this.a + ", isErrorVisible=" + this.b + ", headerState=" + this.c + ", footerState=" + this.d + ')';
        }

        public State(boolean z, boolean z2, FooterHeader footerHeader, FooterHeader footerHeader2) {
            this.a = z;
            this.b = z2;
            this.c = footerHeader;
            this.d = footerHeader2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ State(int i) {
            this(false, false, r0, r0);
            FooterHeader footerHeader = FooterHeader.Invisible;
        }
    }

    /* compiled from: VideoRelatedVideosAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.FooterHeader.values().length];
            try {
                iArr[State.FooterHeader.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.FooterHeader.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.FooterHeader.Invisible.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoRelatedVideosAdapter(b25 b25Var, DonutVideoComponent donutVideoComponent, RelatedVideosRecyclerView relatedVideosRecyclerView, View view, View view2, j8n0 j8n0Var, cqr0 cqr0Var, uho0 uho0Var, b8j0 b8j0Var, e9i0 e9i0Var, exi0 exi0Var) {
        super(new qbt0());
        n6s.a aVar = n6s.a;
        x6s.a aVar2 = x6s.a;
        this.j = b25Var;
        this.k = donutVideoComponent;
        this.l = relatedVideosRecyclerView;
        this.m = view;
        this.n = view2;
        this.o = j8n0Var;
        this.p = new State(0);
        y0(new pbt0(b25Var, donutVideoComponent, b8j0Var, e9i0Var, exi0Var));
        y0(new kbt0(aVar2));
        y0(new com.vk.video.ui.discovery.minimizable.dialog.related_videos.items.a(aVar, uho0Var, cqr0Var));
        ((VkButton) view.findViewById(R.id.error_retry)).setOnClickListener(new bt8(this, 7));
    }

    public static void K0(ListBuilder listBuilder, State.FooterHeader footerHeader, VideoRelatedErrorItem.ChunkType chunkType) {
        int i = a.$EnumSwitchMapping$0[footerHeader.ordinal()];
        if (i == 1) {
            listBuilder.add(jbt0.b);
        } else if (i == 2) {
            listBuilder.add(new VideoRelatedErrorItem(chunkType));
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void L0(State state) {
        this.p = state;
        List<hfz> list = this.h.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof mbt0) {
                arrayList.add(obj);
            }
        }
        State state2 = this.p;
        boolean z = state2.a;
        View view = this.l;
        View view2 = this.m;
        View view3 = this.n;
        if (z) {
            view3.setVisibility(0);
            f4m.j(view2);
            f4m.j(view);
        } else {
            if (state2.b) {
                f4m.j(view3);
                view2.setVisibility(0);
                f4m.j(view);
                return;
            }
            f4m.j(view3);
            f4m.j(view2);
            view.setVisibility(0);
            ListBuilder e = e43.e();
            K0(e, this.p.c, VideoRelatedErrorItem.ChunkType.Previous);
            e.addAll(arrayList);
            K0(e, this.p.d, VideoRelatedErrorItem.ChunkType.Next);
            setItems(e.g());
        }
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        setItems(EmptyList.b);
    }
}
