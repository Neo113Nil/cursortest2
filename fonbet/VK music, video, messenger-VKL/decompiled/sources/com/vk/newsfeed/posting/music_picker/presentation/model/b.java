package com.vk.newsfeed.posting.music_picker.presentation.model;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import java.util.List;
import xsna.cc40;
import xsna.epx;
import xsna.fm50;
import xsna.h0u0;
import xsna.sr;
import xsna.tr;
import xsna.wow;
import xsna.yzt0;

/* compiled from: MusicPickerViewState.kt */
/* loaded from: classes4.dex */
public interface b extends fm50<MusicPickerState> {

    /* compiled from: MusicPickerViewState.kt */
    public static final class a implements b {
        public final yzt0<String> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;
        public final yzt0<Integer> d;
        public final yzt0<MusicPickerListItem.MusicTrackItem.PlayingState> e;
        public final yzt0<MusicTrack> f;
        public final yzt0<List<MusicDto>> g;
        public final yzt0<wow<MusicPickerListItem>> h;
        public final yzt0<Playlist> i;
        public final yzt0<cc40> j;
        public final yzt0<MusicPickerLoadingState> k;
        public final yzt0<Boolean> l;
        public final yzt0<Boolean> m;
        public final yzt0<Boolean> n;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
            this.k = h0u0Var11;
            this.l = h0u0Var12;
            this.m = h0u0Var13;
            this.n = h0u0Var14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n);
        }

        public final int hashCode() {
            return this.n.hashCode() + sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DefaultMusicPickerViewStateRender(title=");
            sb.append(this.a);
            sb.append(", shouldShowSearch=");
            sb.append(this.b);
            sb.append(", shouldShowSearchButton=");
            sb.append(this.c);
            sb.append(", backStackSize=");
            sb.append(this.d);
            sb.append(", playingState=");
            sb.append(this.e);
            sb.append(", currentPlayingTrack=");
            sb.append(this.f);
            sb.append(", selectedTracks=");
            sb.append(this.g);
            sb.append(", items=");
            sb.append(this.h);
            sb.append(", playlist=");
            sb.append(this.i);
            sb.append(", bottomPanelUiDto=");
            sb.append(this.j);
            sb.append(", loadingState=");
            sb.append(this.k);
            sb.append(", isMultiselectEnabled=");
            sb.append(this.l);
            sb.append(", hasNext=");
            sb.append(this.m);
            sb.append(", isPrivatePlaylist=");
            return tr.c(sb, this.n, ')');
        }
    }

    /* compiled from: MusicPickerViewState.kt */
    /* renamed from: com.vk.newsfeed.posting.music_picker.presentation.model.b$b, reason: collision with other inner class name */
    public static final class C1432b implements b {
        public static final C1432b a = new C1432b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1432b);
        }

        public final int hashCode() {
            return 1337413045;
        }

        public final String toString() {
            return "Initial";
        }
    }
}
