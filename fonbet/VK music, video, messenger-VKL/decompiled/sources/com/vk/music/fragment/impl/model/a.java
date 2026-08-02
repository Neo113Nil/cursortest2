package com.vk.music.fragment.impl.model;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.ReorderAudioAction;
import com.vk.dto.music.Thumb;
import com.vk.dto.photo.Photo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.container.MusicEditPlaylistDataContainer;
import com.vk.music.track.MusicTrackId;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import xsna.ad0;
import xsna.asu0;
import xsna.bn40;
import xsna.bx4;
import xsna.cvk;
import xsna.cx4;
import xsna.e43;
import xsna.f0p;
import xsna.g5j;
import xsna.hx2;
import xsna.hx4;
import xsna.i0p;
import xsna.i5g;
import xsna.i8b0;
import xsna.ix4;
import xsna.j5g;
import xsna.jx2;
import xsna.k840;
import xsna.mzp0;
import xsna.o0p;
import xsna.om1;
import xsna.or;
import xsna.ozg0;
import xsna.pr;
import xsna.pz40;
import xsna.qeb0;
import xsna.reb0;
import xsna.rli0;
import xsna.rsg0;
import xsna.sp;
import xsna.sr;
import xsna.tfx;
import xsna.tm4;
import xsna.tq70;
import xsna.tr;
import xsna.u2b0;
import xsna.u8b0;
import xsna.vr;
import xsna.wmi0;
import xsna.wr;
import xsna.xx1;
import xsna.yfb;
import xsna.ysg0;

/* compiled from: EditPlaylistModelImpl.java */
/* loaded from: classes3.dex */
public final class a extends tq70<i0p.a> implements i0p {
    public c f;
    public c g;
    public c h;
    public c i;
    public final u2b0 j;
    public final UserId k;
    public final long m;
    public boolean n;
    public final String o;

    @Nullable
    public final mzp0 p;
    public final sp d = new sp(15);
    public MusicEditPlaylistDataContainer e = new MusicEditPlaylistDataContainer();
    public boolean l = false;

    /* compiled from: EditPlaylistModelImpl.java */
    /* renamed from: com.vk.music.fragment.impl.model.a$a, reason: collision with other inner class name */
    public class C1323a implements hx2<Playlist> {
        public C1323a() {
        }

        @Override // xsna.hx2
        public final void b(Playlist playlist) {
            final Playlist playlist2 = playlist;
            bn40.g(bx4.class.getSimpleName(), playlist2);
            final a aVar = a.this;
            aVar.G(aVar.e.c, playlist2);
            aVar.g = null;
            if (!aVar.l && aVar.e.m == null) {
                k840.a.h.b(aVar.f0() ? new i8b0(playlist2) : new u8b0(playlist2));
                if (!aVar.e.j.isEmpty()) {
                    k840.a.h.b(new reb0(playlist2, aVar.e.h));
                }
                aVar.y(new o0p(this, playlist2));
                return;
            }
            if (aVar.e.m == null) {
                c cVar = aVar.h;
                if (cVar != null) {
                    cVar.dispose();
                }
                UserId userId = playlist2.c;
                int i = playlist2.b;
                tm4 tm4Var = new tm4("audio.deletePlaylistCoverPhoto");
                tm4Var.F(userId, "owner_id");
                tm4Var.C(i, "playlist_id");
                aVar.h = rsg0.y0(tm4Var, null, null, 3).subscribe(new f() { // from class: xsna.k0p
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        List<MusicTrack> list;
                        com.vk.music.fragment.impl.model.a aVar2 = com.vk.music.fragment.impl.model.a.this;
                        aVar2.h = null;
                        Playlist f = xx1.f(playlist2);
                        f.m = null;
                        if (aVar2.e.h == null) {
                            list = Collections.EMPTY_LIST;
                        } else {
                            ArrayList arrayList = new ArrayList(aVar2.e.h);
                            arrayList.removeAll(aVar2.e.i);
                            list = arrayList;
                        }
                        List<Thumb> I = aVar2.I(list);
                        f.p = I.isEmpty() ? null : I;
                        k840.a.h.b(new u8b0(f));
                        aVar2.y(new n0p(0, aVar2, f));
                    }
                }, new om1(aVar, 15));
                return;
            }
            c cVar2 = aVar.i;
            if (cVar2 != null) {
                cVar2.dispose();
                aVar.i = null;
            }
            String str = aVar.e.m;
            if (str == null) {
                return;
            }
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            com.vk.movika.sdk.base.flow.binding.c cVar3 = new com.vk.movika.sdk.base.flow.binding.c(aVar, 17);
            fVar.getClass();
            aVar.i = new i0(fVar, cVar3).a0(asu0.a.d()).subscribe(new f() { // from class: xsna.j0p
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    boolean z = obj instanceof abq0;
                    final com.vk.music.fragment.impl.model.a aVar2 = com.vk.music.fragment.impl.model.a.this;
                    if (z) {
                        abq0 abq0Var = (abq0) obj;
                        final int i2 = abq0Var.b;
                        final String str2 = abq0Var.c;
                        if (str2 == null) {
                            str2 = "Unknown exception";
                        }
                        aVar2.y(new tq70.b(aVar2, i2, str2) { // from class: xsna.m0p
                            public final /* synthetic */ int b;
                            public final /* synthetic */ String c;

                            {
                                this.b = i2;
                                this.c = str2;
                            }

                            @Override // xsna.tq70.b
                            public final void accept(Object obj2) {
                                ((i0p.a) obj2).a(new VKApiExecutionException(this.b, "audio.setPlaylistCoverPhoto", false, this.c));
                            }
                        });
                        return;
                    }
                    if (obj instanceof paq0) {
                        Parcelable parcelable = ((paq0) obj).b;
                        Thumb thumb = null;
                        Photo photo = parcelable instanceof Photo ? (Photo) parcelable : null;
                        if (photo != null) {
                            Image image = photo.y;
                            if (!image.b.isEmpty()) {
                                thumb = new Thumb(image);
                            }
                        }
                        final Playlist f = xx1.f(playlist2);
                        f.m = thumb;
                        k840.a.h.b(new u8b0(f));
                        aVar2.y(new tq70.b() { // from class: xsna.l0p
                            @Override // xsna.tq70.b
                            public final void accept(Object obj2) {
                                ((i0p.a) obj2).o(com.vk.music.fragment.impl.model.a.this, f);
                            }
                        });
                    }
                }
            });
            ozg0.a().u(playlist2.b, playlist2.c, str);
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            a aVar = a.this;
            aVar.g = null;
            bn40.c(vKApiExecutionException, new Object[0]);
            aVar.y(new com.vk.movika.sdk.base.hooks.f(this, vKApiExecutionException));
        }
    }

    /* compiled from: EditPlaylistModelImpl.java */
    public class b implements f<MusicEditPlaylistDataContainer> {
        public b() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(MusicEditPlaylistDataContainer musicEditPlaylistDataContainer) throws Throwable {
            MusicEditPlaylistDataContainer musicEditPlaylistDataContainer2 = musicEditPlaylistDataContainer;
            a aVar = a.this;
            aVar.e = musicEditPlaylistDataContainer2;
            if (ad0.u(musicEditPlaylistDataContainer2.k)) {
                return;
            }
            Iterator<ReorderAudioAction> it = aVar.e.k.iterator();
            while (it.hasNext()) {
                ReorderAudioAction next = it.next();
                int i = next.e;
                int i2 = next.f;
                if (aVar.E(i, i2)) {
                    Collections.swap(aVar.e.h, i, i2);
                }
            }
        }
    }

    public a(@Nullable Playlist playlist, @Nullable ArrayList<MusicTrack> arrayList, @Nullable MusicPlaybackLaunchContext musicPlaybackLaunchContext, @Nullable mzp0 mzp0Var, u2b0 u2b0Var, UserId userId, long j, String str) {
        this.k = UserId.d;
        this.p = mzp0Var;
        if (playlist != null && xx1.e(playlist) && !xx1.u(playlist)) {
            userId = playlist.c;
        }
        this.k = userId;
        this.m = j;
        this.o = str;
        this.e.g = playlist;
        if (musicPlaybackLaunchContext == null) {
            HashMap hashMap = MusicPlaybackLaunchContext.c;
        }
        this.j = u2b0Var;
        this.n = playlist == null || playlist.E;
        G(0, playlist);
        if (ad0.y(arrayList)) {
            K1(arrayList);
        }
    }

    @Override // xsna.i0p
    public final String A() {
        Playlist playlist = this.e.g;
        return playlist == null ? this.o : playlist.i;
    }

    @Override // xsna.i0p
    public final void D1() {
        MusicEditPlaylistDataContainer musicEditPlaylistDataContainer = this.e;
        if (musicEditPlaylistDataContainer.m != null) {
            musicEditPlaylistDataContainer.m = null;
        } else {
            musicEditPlaylistDataContainer.f = null;
            this.l = true;
        }
    }

    public final boolean E(int i, int i2) {
        ArrayList<MusicTrack> arrayList = this.e.h;
        return arrayList != null && i >= 0 && i < arrayList.size() && i2 >= 0 && i2 < this.e.h.size();
    }

    public final void F(int i) {
        bn40.f("audio offset: ", Integer.valueOf(i), ", audioCount: ", 100);
        if (this.f == null && this.e.g != null) {
            mzp0 mzp0Var = this.p;
            if (mzp0Var != null) {
                mzp0Var.a();
            }
            ix4 ix4Var = new ix4();
            Playlist playlist = this.e.g;
            this.f = new jx2(yfb.x(ix4Var.q(playlist.c, Integer.valueOf(playlist.b), Integer.valueOf(i), 100, Boolean.TRUE, this.e.g.x, null)), new com.vk.music.fragment.impl.model.b(this, i)).a();
        }
    }

    @Override // xsna.i0p
    public final void F1(boolean z) {
        this.n = z;
    }

    public final void G(int i, @Nullable Playlist playlist) {
        MusicEditPlaylistDataContainer musicEditPlaylistDataContainer = this.e;
        musicEditPlaylistDataContainer.g = playlist;
        musicEditPlaylistDataContainer.c = i;
        if (playlist != null) {
            musicEditPlaylistDataContainer.d = playlist.h;
            musicEditPlaylistDataContainer.e = playlist.j;
            musicEditPlaylistDataContainer.f = playlist.m;
        } else {
            musicEditPlaylistDataContainer.d = "";
            musicEditPlaylistDataContainer.e = "";
            musicEditPlaylistDataContainer.h = null;
            musicEditPlaylistDataContainer.b = false;
        }
    }

    @Override // xsna.i0p
    public final List<Thumb> I(List<MusicTrack> list) {
        Thumb thumb = this.e.f;
        if (thumb != null) {
            return Collections.singletonList(thumb);
        }
        this.d.getClass();
        return j5g.H0(j5g.O0(rli0.C(rli0.t(new i5g(list), pz40.b))), 4);
    }

    @Override // xsna.i0p
    public final void K(@NonNull MusicTrack musicTrack) {
        bn40.f("MusicTrack: ", musicTrack);
        if (ad0.u(this.e.j)) {
            return;
        }
        MusicEditPlaylistDataContainer musicEditPlaylistDataContainer = this.e;
        if (musicEditPlaylistDataContainer.h == null || !musicEditPlaylistDataContainer.j.remove(musicTrack)) {
            return;
        }
        ReorderAudioAction reorderAudioAction = new ReorderAudioAction(musicTrack, this.e.h.indexOf(musicTrack), -1);
        this.e.h.remove(musicTrack);
        this.e.k.remove(reorderAudioAction);
    }

    @Override // xsna.i0p
    public final void K1(@NonNull ArrayList arrayList) {
        bn40.f("AttachedMusicTracks: ", arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        if (this.e.h == null) {
            if (!f0()) {
                return;
            }
            this.e.h = new ArrayList<>();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MusicTrack musicTrack = (MusicTrack) it.next();
            if (this.e.i.contains(musicTrack)) {
                e0(musicTrack);
            } else if (!this.e.j.contains(musicTrack)) {
                this.e.j.add(0, musicTrack);
                this.e.h.add(0, musicTrack);
                this.e.k.add(new ReorderAudioAction(musicTrack, -1, 0));
            }
        }
    }

    @Override // xsna.i0p
    @NonNull
    public final ArrayList L() {
        return this.e.i;
    }

    @Override // xsna.i0p
    @Nullable
    public final String O0() {
        return this.e.m;
    }

    @Override // xsna.i0p
    @Nullable
    public final MusicTrack Q0(@NonNull MusicTrackId musicTrackId) {
        Iterator<MusicTrack> it = this.e.j.iterator();
        while (it.hasNext()) {
            MusicTrack next = it.next();
            musicTrackId.getClass();
            if (next.c.b == musicTrackId.b && next.b == musicTrackId.c) {
                return next;
            }
        }
        return null;
    }

    @Override // xsna.i0p
    public final void S(int i, int i2) {
        bn40.f("from: ", Integer.valueOf(i), " to ", Integer.valueOf(i2));
        if (E(i, i2)) {
            this.e.k.add(new ReorderAudioAction(this.e.h.get(i), i, i2));
            ArrayList<MusicTrack> arrayList = this.e.h;
            arrayList.add(i2, arrayList.remove(i));
        }
    }

    @Override // xsna.i0p
    public final boolean T(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        boolean z = f0() && !(TextUtils.isEmpty(str) && TextUtils.isEmpty(str2));
        Playlist playlist = this.e.g;
        return z || (playlist != null && (!str.equals(playlist.h) || !str2.equals(this.e.g.j))) || !ad0.u(this.e.k) || (this.l || this.e.m != null);
    }

    @Override // xsna.i0p
    @NonNull
    public final ArrayList X() {
        return this.e.j;
    }

    @Override // xsna.i0p
    @Nullable
    public final ArrayList Z() {
        return this.e.h;
    }

    @Override // xsna.i0p
    @Nullable
    public final Playlist Z0() {
        return this.e.g;
    }

    @Override // xsna.i0p
    public final boolean a() {
        return this.e.b;
    }

    @Override // xsna.i0p
    public final void a0(@NonNull f0p f0pVar) {
        LinkedList linkedList = this.c;
        if (linkedList != null) {
            linkedList.remove(f0pVar);
        }
    }

    @Override // xsna.i0p
    public final void c() {
        F(this.e.c);
    }

    @Override // xsna.i80
    @NonNull
    public final Bundle e() {
        wmi0.a.a("EditPlaylistModelImpl.cache", this.e);
        return Bundle.EMPTY;
    }

    @Override // xsna.i0p
    public final void e0(@NonNull MusicTrack musicTrack) {
        ArrayList<MusicTrack> arrayList = this.e.h;
        if (arrayList == null) {
            return;
        }
        ReorderAudioAction reorderAudioAction = new ReorderAudioAction(musicTrack, arrayList.indexOf(musicTrack), -1);
        if (this.e.i.contains(musicTrack)) {
            this.e.i.remove(musicTrack);
            this.e.k.remove(reorderAudioAction);
        } else {
            this.e.i.add(musicTrack);
            this.e.k.add(reorderAudioAction);
        }
    }

    @Override // xsna.i0p
    public final boolean f0() {
        return this.e.g == null;
    }

    @Override // xsna.i0p
    public final boolean g0() {
        Playlist playlist = this.e.g;
        return (playlist != null && playlist.d == 5) || com.vk.dto.common.b.a(this.m);
    }

    @Override // xsna.i0p
    public final boolean g1() {
        return this.n;
    }

    @Override // xsna.i0p
    @NonNull
    public final String getDescription() {
        String str = this.e.e;
        return str == null ? "" : str;
    }

    @Override // xsna.i0p
    @NonNull
    public final String getTitle() {
        String str = this.e.d;
        return str == null ? "" : str;
    }

    @Override // xsna.i0p
    public final void k0(@NonNull MusicTrackId musicTrackId) {
        ArrayList<MusicTrack> arrayList = this.e.h;
        if (arrayList == null) {
            return;
        }
        Iterator<MusicTrack> it = arrayList.iterator();
        while (it.hasNext()) {
            MusicTrack next = it.next();
            musicTrackId.getClass();
            if (next.c.b == musicTrackId.b && next.b == musicTrackId.c) {
                e0(next);
                return;
            }
        }
    }

    @Override // xsna.i0p
    public final void load() {
        F(0);
    }

    @Override // xsna.i0p
    public final void m(@NonNull String str) {
        this.e.d = str;
    }

    @Override // xsna.i0p
    public final UserId q() {
        return this.k;
    }

    @Override // xsna.i0p
    public final u2b0 r() {
        return this.j;
    }

    @Override // xsna.i80
    public final void release() {
        c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
            this.i = null;
        }
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        c cVar3 = this.h;
        if (cVar3 != null) {
            cVar3.dispose();
        }
    }

    @Override // xsna.i0p
    public final void s1(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (com.vk.core.files.a.i(e43.a, Uri.parse(str)).exists()) {
                    this.e.m = str;
                    return;
                }
            }
        } catch (Exception e) {
            bn40.c(e, new Object[0]);
        }
        cvk.u(R.string.music_cover_image_not_found_on_device, true);
    }

    @Override // xsna.i0p
    public final void setDescription(@NonNull String str) {
        this.e.e = str;
    }

    @Override // xsna.i80
    @SuppressLint({"CheckResult"})
    public final void u(@NonNull Bundle bundle) {
        wmi0.a.i("EditPlaylistModelImpl.cache", true).subscribe(new b());
    }

    @Override // xsna.i0p
    public final boolean v(@NonNull MusicTrack musicTrack) {
        return this.e.j.contains(musicTrack);
    }

    @Override // xsna.i0p
    public final void w() {
        bn40.f(new Object[0]);
        if (this.g != null) {
            return;
        }
        cx4 cx4Var = new cx4();
        cx4Var.a = UserId.d;
        cx4Var.e = true;
        Playlist playlist = this.e.g;
        if (playlist != null) {
            playlist = xx1.m(playlist);
        }
        boolean f0 = f0();
        long j = this.m;
        if (f0) {
            if (j != 0) {
                cx4Var.d = j;
            } else {
                cx4Var.a = this.k;
            }
            if (!ad0.u(this.e.h)) {
                Iterator<MusicTrack> it = this.e.h.iterator();
                while (it.hasNext()) {
                    MusicTrack next = it.next();
                    if (cx4Var.h == null) {
                        cx4Var.h = new ArrayList();
                    }
                    cx4Var.h.add(next.Ib());
                }
            }
        } else if (playlist != null) {
            cx4Var.a = playlist.c;
            cx4Var.b = playlist.b;
            cx4Var.c = playlist.x;
            if (!ad0.u(this.e.k)) {
                for (int i = 0; i < this.e.k.size(); i++) {
                    if (this.e.k.get(i).f == -1) {
                        for (int i2 = i + 1; i2 < this.e.k.size(); i2++) {
                            ReorderAudioAction reorderAudioAction = this.e.k.get(i2);
                            if (reorderAudioAction.f != -1 && reorderAudioAction.e != -1) {
                                if (this.e.k.get(i2).e > this.e.k.get(i).e) {
                                    ReorderAudioAction reorderAudioAction2 = this.e.k.get(i2);
                                    int i3 = this.e.k.get(i2).e - 1;
                                    reorderAudioAction2.getClass();
                                    reorderAudioAction2.e = Math.max(-1, i3);
                                }
                                if (this.e.k.get(i2).f > this.e.k.get(i).e) {
                                    ReorderAudioAction reorderAudioAction3 = this.e.k.get(i2);
                                    int i4 = this.e.k.get(i2).f - 1;
                                    reorderAudioAction3.getClass();
                                    reorderAudioAction3.f = Math.max(-1, i4);
                                }
                            }
                        }
                        k840.a.h.b(new qeb0(new MusicTrack(this.e.k.get(i).c, this.e.k.get(i).b), this.e.g));
                    }
                }
                Iterator<ReorderAudioAction> it2 = this.e.k.iterator();
                while (it2.hasNext()) {
                    ReorderAudioAction next2 = it2.next();
                    if (cx4Var.i == null) {
                        cx4Var.i = new ArrayList();
                    }
                    cx4Var.i.add(next2);
                }
            }
        }
        MusicEditPlaylistDataContainer musicEditPlaylistDataContainer = this.e;
        cx4Var.f = musicEditPlaylistDataContainer.d;
        cx4Var.g = musicEditPlaylistDataContainer.e;
        cx4Var.e = j != 0 || this.n;
        AudioPlaylistDto audioPlaylistDto = cx4.j;
        rsg0 g5jVar = new g5j(audioPlaylistDto);
        rsg0 g5jVar2 = new g5j(audioPlaylistDto);
        rsg0 g5jVar3 = new g5j(BaseOkResponseDto.OK);
        rsg0 g5jVar4 = new g5j(Collections.singletonList(cx4.k));
        rsg0 g5jVar5 = new g5j(BaseBoolIntDto.NO);
        long j2 = cx4Var.d;
        if (j2 == 0 || cx4Var.b != 0) {
            int i5 = cx4Var.b;
            if (i5 == 0) {
                ix4 ix4Var = new ix4();
                UserId userId = cx4Var.a;
                String str = cx4Var.f;
                String str2 = str == null ? "" : str;
                String str3 = cx4Var.g;
                ArrayList arrayList = cx4Var.h;
                g5jVar2 = yfb.x(hx4.v(ix4Var, userId, str2, str3, arrayList != null ? j5g.V(arrayList) : null, Boolean.valueOf(true ^ cx4Var.e), 16));
            } else {
                UserId userId2 = cx4Var.a;
                String str4 = cx4Var.f;
                String str5 = cx4Var.g;
                boolean z = true ^ cx4Var.e;
                tfx tfxVar = new tfx("audio.editPlaylist", new or(3), new pr(3));
                tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
                tfx.l(tfxVar, "playlist_id", i5, 0, 0, 8);
                if (str4 != null) {
                    tfx.o(tfxVar, "title", str4, 0, 1024, 4);
                }
                if (str5 != null) {
                    tfx.o(tfxVar, "description", str5, 0, 1024, 4);
                }
                tfxVar.j("no_discover", z);
                g5jVar3 = yfb.x(tfxVar);
                ArrayList arrayList2 = cx4Var.h;
                if (arrayList2 != null) {
                    g5jVar4 = yfb.x(new ix4().i(cx4Var.a, cx4Var.b, j5g.V(arrayList2)));
                }
                ArrayList arrayList3 = cx4Var.i;
                if (arrayList3 != null) {
                    UserId userId3 = cx4Var.a;
                    int i6 = cx4Var.b;
                    JSONArray jSONArray = new JSONArray();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ReorderAudioAction reorderAudioAction4 = (ReorderAudioAction) it3.next();
                        jSONArray.put(new JSONArray().put(reorderAudioAction4.b).put(reorderAudioAction4.c).put(reorderAudioAction4.f));
                    }
                    String jSONArray2 = jSONArray.toString();
                    tfx tfxVar2 = new tfx("audio.reorderInPlaylist", new vr(5), new wr(6));
                    tfx.n(tfxVar2, "owner_id", userId3, 0L, 0L, 12);
                    tfx.l(tfxVar2, "playlist_id", i6, 0, 0, 12);
                    tfx.o(tfxVar2, "actions", jSONArray2, 0, 0, 12);
                    g5jVar5 = yfb.x(tfxVar2);
                }
            }
        } else {
            int i7 = (int) j2;
            String str6 = cx4Var.f;
            String str7 = str6 != null ? str6 : "";
            String str8 = cx4Var.g;
            ArrayList arrayList4 = cx4Var.h;
            List V = arrayList4 != null ? j5g.V(arrayList4) : null;
            tfx tfxVar3 = new tfx("audio.createChatPlaylist", new sr(5), new tr(3));
            tfx.l(tfxVar3, "chat_id", i7, 0, 0, 12);
            tfx.o(tfxVar3, "title", str7, 0, 1024, 4);
            if (str8 != null) {
                tfx.o(tfxVar3, "description", str8, 0, 1024, 4);
            }
            if (V != null) {
                tfxVar3.i("audio_ids", V);
            }
            g5jVar = yfb.x(tfxVar3);
        }
        this.g = new jx2(new bx4(g5jVar, g5jVar2, g5jVar3, g5jVar4, g5jVar5, cx4Var), new C1323a()).a();
    }

    @Override // xsna.i0p
    @Nullable
    public final Thumb x() {
        return this.e.f;
    }
}
