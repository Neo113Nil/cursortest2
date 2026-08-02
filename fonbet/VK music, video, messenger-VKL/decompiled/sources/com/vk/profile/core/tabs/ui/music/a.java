package com.vk.profile.core.tabs.ui.music;

import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.f;
import com.vk.profile.core.tabs.ui.music.a;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.epx;
import xsna.f870;
import xsna.iah0;
import xsna.jai;
import xsna.mut0;
import xsna.r8a0;
import xsna.u2b0;
import xsna.wh50;
import xsna.wzs;
import xsna.zoj0;

/* compiled from: ProfileContentAudioAdapter.kt */
/* loaded from: classes5.dex */
public final class a extends zoj0<MusicTrack, b> {
    public final u2b0 e;
    public final r8a0 f;
    public final wh50 g;
    public final com.vk.profile.core.tabs.ui.music.b h;

    /* compiled from: ProfileContentAudioAdapter.kt */
    /* renamed from: com.vk.profile.core.tabs.ui.music.a$a, reason: collision with other inner class name */
    public static final class C1648a extends m.e<MusicTrack> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(MusicTrack musicTrack, MusicTrack musicTrack2) {
            return musicTrack.equals(musicTrack2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(MusicTrack musicTrack, MusicTrack musicTrack2) {
            return musicTrack.b == musicTrack2.b;
        }
    }

    /* compiled from: ProfileContentAudioAdapter.kt */
    public final class b extends RecyclerView.e0 {
        public final ComposeView l;
        public MusicTrack m;

        public b(ComposeView composeView) {
            super(composeView);
            this.l = composeView;
        }
    }

    /* compiled from: ProfileContentAudioAdapter.kt */
    public static final class c {
        public final Integer a;
        public final boolean b;

        public c(boolean z, Integer num) {
            this.a = num;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            Integer num = this.a;
            return Boolean.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayingState(currentTrackAudioId=");
            sb.append(this.a);
            sb.append(", isPlaying=");
            return q0.a(sb, this.b, ')');
        }
    }

    public a(u2b0 u2b0Var, r8a0 r8a0Var) {
        super(new com.vk.lists.a(new C1648a()));
        MusicTrack f;
        this.e = u2b0Var;
        this.f = r8a0Var;
        f H = u2b0Var.H();
        this.g = k.b(new c(u2b0Var.h(), (H == null || (f = H.f()) == null) ? null : Integer.valueOf(f.b)));
        this.h = new com.vk.profile.core.tabs.ui.music.b(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        b bVar = (b) e0Var;
        final MusicTrack musicTrack = (MusicTrack) this.c.c(i);
        bVar.m = musicTrack;
        long j = musicTrack.f;
        final String obj = f870.q(j).toString();
        final String obj2 = f870.o(j, bVar.itemView.getContext()).toString();
        final String Kb = musicTrack.Kb(iah0.a(48));
        ComposeView composeView = bVar.l;
        final a aVar = a.this;
        composeView.setContent(new jai(-808712921, new wzs() { // from class: xsna.uud0
            @Override // xsna.wzs
            public final Object invoke(Object obj3, Object obj4) {
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-808712921, intValue, -1, "com.vk.profile.core.tabs.ui.music.ProfileContentAudioAdapter.MusicTrackViewHolder.bind.<anonymous> (ProfileContentAudioAdapter.kt:93)");
                    }
                    com.vk.profile.core.tabs.ui.music.a aVar3 = com.vk.profile.core.tabs.ui.music.a.this;
                    a.c cVar = (a.c) ((zak0) aVar3.g).getValue();
                    Integer num = cVar.a;
                    MusicTrack musicTrack2 = musicTrack;
                    rrv0.a(null, null, kai.c(2006913407, new vud0(musicTrack2, aVar3, Kb, obj, (num != null && num.intValue() == musicTrack2.b) ? Boolean.valueOf(cVar.b) : null, obj2), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            }
        }, true));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setId(R.id.community_profile_item_music_track_cell);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(mut0.c.a);
        return new b(composeView);
    }
}
