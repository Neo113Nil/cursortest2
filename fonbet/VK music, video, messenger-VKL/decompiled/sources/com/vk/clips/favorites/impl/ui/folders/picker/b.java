package com.vk.clips.favorites.impl.ui.folders.picker;

import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerState;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.clips.favorites.impl.ui.folders.picker.c;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.observable.k;
import com.vk.movika.sdk.base.observable.m;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a5e;
import xsna.a7f0;
import xsna.c5e;
import xsna.d4e;
import xsna.e4e;
import xsna.epx;
import xsna.f4z;
import xsna.i8;
import xsna.kb;
import xsna.mb;
import xsna.mh;
import xsna.pu;
import xsna.q8;
import xsna.s5e;
import xsna.t4e;
import xsna.u24;
import xsna.u2e;
import xsna.u5e;
import xsna.ul1;
import xsna.uzp;
import xsna.wk50;
import xsna.z4e;

/* compiled from: ClipsFavoritesFoldersPickerFeature.kt */
/* loaded from: classes16.dex */
public final class b extends wk50<f, ClipsFavoritesFoldersPickerState, com.vk.clips.favorites.impl.ui.folders.picker.a, c> {
    public final ClipsFavoritesFoldersPickerParams f;
    public final c5e g;
    public final s5e h;
    public final d4e i;
    public final u5e j;
    public final f4z<z4e> k;
    public final f4z<a5e> l;

    /* compiled from: ClipsFavoritesFoldersPickerFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsFavoritesFoldersPickerState.BottomSheetVisibility.values().length];
            try {
                iArr[ClipsFavoritesFoldersPickerState.BottomSheetVisibility.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsFavoritesFoldersPickerState.BottomSheetVisibility.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(e eVar, ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams, c5e c5eVar, s5e s5eVar, e4e e4eVar, u5e u5eVar) {
        super(a.d.b, eVar);
        this.f = clipsFavoritesFoldersPickerParams;
        this.g = c5eVar;
        this.h = s5eVar;
        this.i = e4eVar;
        this.j = u5eVar;
        this.k = new f4z<>();
        this.l = new f4z<>();
    }

    public static final void U(b bVar) {
        f4z<z4e> f4zVar = bVar.k;
        f4zVar.b(z4e.b.a);
        f4zVar.b(new z4e.a(false));
    }

    @Override // xsna.wk50
    public final void N(ClipsFavoritesFoldersPickerState clipsFavoritesFoldersPickerState, com.vk.clips.favorites.impl.ui.folders.picker.a aVar) {
        ClipsFavoritesFoldersPickerState clipsFavoritesFoldersPickerState2 = clipsFavoritesFoldersPickerState;
        com.vk.clips.favorites.impl.ui.folders.picker.a aVar2 = aVar;
        if (aVar2 instanceof a.d) {
            a7f0.a.e(this, this.i.f(), null, new ul1(this, 24), null, null, 13);
            V();
            return;
        }
        if (aVar2 instanceof a.e) {
            V();
            return;
        }
        boolean z = aVar2 instanceof a.C0604a;
        c5e c5eVar = this.g;
        ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams = this.f;
        Object obj = null;
        f4z<z4e> f4zVar = this.k;
        if (z) {
            if ((clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content) && (clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo)) {
                T(c.b.a.b);
                Set<FavoriteFolderId> set = ((ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2).d;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        if (epx.f((FavoriteFolderId) it.next(), FavoriteFolderId.Alias.AllClips.c)) {
                            ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo pickFolderToAddVideo = (ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) clipsFavoritesFoldersPickerParams;
                            c5eVar.e(pickFolderToAddVideo.c, pickFolderToAddVideo.d, null);
                            break;
                        }
                    }
                }
                ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo pickFolderToAddVideo2 = (ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) clipsFavoritesFoldersPickerParams;
                c5eVar.d(pickFolderToAddVideo2.c, pickFolderToAddVideo2.d, null);
                f4zVar.b(new z4e.a(true));
                return;
            }
            return;
        }
        boolean z2 = false;
        if (!(aVar2 instanceof a.f)) {
            if (aVar2 instanceof a.c) {
                T(c.a.b.b);
                return;
            }
            if (!(aVar2 instanceof a.b)) {
                if (!(aVar2 instanceof a.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new z4e.a(false));
                return;
            }
            if (clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.a) {
                U(this);
                return;
            }
            if (clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.b) {
                U(this);
                return;
            }
            if (!(clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = a.$EnumSwitchMapping$0[((ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2).b.ordinal()];
            if (i == 1) {
                f4zVar.b(z4e.b.a);
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                U(this);
                return;
            }
        }
        a.f fVar = (a.f) aVar2;
        if (clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content) {
            if (fVar instanceof a.f.C0605a) {
                f4zVar.b(z4e.c.a);
                T(c.a.C0607a.b);
                return;
            }
            if (fVar instanceof a.f.b) {
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.a(new mh(this, 28));
                return;
            }
            if (!(fVar instanceof a.f.d)) {
                if (fVar instanceof a.f.c) {
                    ExecutorService executorService2 = com.vk.mvi.core.internal.executors.a.a;
                    com.vk.mvi.core.internal.executors.a.a(new pu(this, 26));
                    return;
                }
                if (!(fVar instanceof a.f.C0606f) && !(fVar instanceof a.f.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsFavoritesFoldersPickerState.Content content = (ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2;
                ClipsFavoritesFoldersPickerState.Content.a aVar3 = content.f;
                if (aVar3 instanceof ClipsFavoritesFoldersPickerState.Content.a.b) {
                    ClipsFavoritesFoldersPickerState.Content.ListLoadingState listLoadingState = content.g;
                    if (listLoadingState == ClipsFavoritesFoldersPickerState.Content.ListLoadingState.NONE || listLoadingState == ClipsFavoritesFoldersPickerState.Content.ListLoadingState.ERROR) {
                        c.e.b bVar = c.e.b.b;
                        T(bVar);
                        String str = ((ClipsFavoritesFoldersPickerState.Content.a.b) aVar3).a;
                        T(bVar);
                        a7f0.a.f(this, s5e.d(this.h, clipsFavoritesFoldersPickerParams.q(), null, null, str, 0, 22), new mb(this, 29), new m(this, 27), 1);
                        return;
                    }
                    return;
                }
                return;
            }
            ClipsFavoritesFoldersPickerState.Content content2 = (ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2;
            a.f.d dVar = (a.f.d) fVar;
            FavoriteFolderId favoriteFolderId = dVar.b;
            Iterator<T> it2 = content2.e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(((u2e) next).a, favoriteFolderId)) {
                    obj = next;
                    break;
                }
            }
            u2e u2eVar = (u2e) obj;
            if (u2eVar == null) {
                return;
            }
            FavoriteFolderId favoriteFolderId2 = u2eVar.a;
            Set<FavoriteFolderId> set2 = content2.d;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it3 = set2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (epx.f((FavoriteFolderId) it3.next(), favoriteFolderId2)) {
                        z2 = true;
                        break;
                    }
                }
            }
            T(new c.b.C0608b(!z2, favoriteFolderId));
            if (clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) {
                if (z2) {
                    ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo pickFolderToAddVideo3 = (ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) clipsFavoritesFoldersPickerParams;
                    c5eVar.a(favoriteFolderId2, pickFolderToAddVideo3.c, u2eVar.d, Collections.singletonList(pickFolderToAddVideo3.d));
                } else {
                    ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo pickFolderToAddVideo4 = (ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) clipsFavoritesFoldersPickerParams;
                    this.g.b(pickFolderToAddVideo4.c, u2eVar.a, u2eVar.d, Collections.singletonList(pickFolderToAddVideo4.d), (r11 & 16) != 0);
                }
            } else {
                if (!(clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos pickFolderToMoveVideos = (ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos) clipsFavoritesFoldersPickerParams;
                FavoriteFolderId favoriteFolderId3 = pickFolderToMoveVideos.d;
                List<VideoFile> list = pickFolderToMoveVideos.e;
                UserId userId = pickFolderToMoveVideos.c;
                if (favoriteFolderId3 instanceof FavoriteFolderId.Id) {
                    this.g.c(userId, favoriteFolderId3, dVar.b, dVar.c, list);
                } else {
                    this.g.b(userId, dVar.b, dVar.c, list, (r11 & 16) != 0);
                }
            }
            f4zVar.b(new z4e.a(true));
        }
    }

    public final void V() {
        x k;
        T(c.d.b.b);
        ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams = this.f;
        y l = s5e.d(this.h, clipsFavoritesFoldersPickerParams.q(), Collections.singletonList(FavoriteFolderId.Alias.AllClips.c), null, null, 1, 12).l(new kb(new i8(19), 16));
        if (clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) {
            ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo pickFolderToAddVideo = (ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) clipsFavoritesFoldersPickerParams;
            k = s5e.d(this.h, pickFolderToAddVideo.c, null, pickFolderToAddVideo.d.a1(), null, 100, 10).l(new u24(t4e.b, 1));
        } else {
            if (!(clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos)) {
                throw new NoWhenBranchMatchedException();
            }
            k = x.k(EmptyList.b);
        }
        a7f0.a.f(this, x.A(l, k, s5e.d(this.h, clipsFavoritesFoldersPickerParams.q(), null, null, null, 0, 30), new uzp()), new q8(1, this, b.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0, 3), new k(this, 21), 1);
    }
}
