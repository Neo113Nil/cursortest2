package com.vk.clips.favorites.impl.ui.folders.list;

import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListState;
import com.vk.clips.favorites.impl.ui.folders.list.a;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.x;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a4e;
import xsna.a7f0;
import xsna.b4e;
import xsna.d4e;
import xsna.e4e;
import xsna.f4z;
import xsna.ix2;
import xsna.iz0;
import xsna.izs;
import xsna.j5;
import xsna.lz0;
import xsna.po1;
import xsna.s3q0;
import xsna.s5e;
import xsna.u2e;
import xsna.u5e;
import xsna.ur0;
import xsna.wk50;
import xsna.x34;

/* compiled from: ClipsFavoriteFoldersListFeature.kt */
/* loaded from: classes16.dex */
public final class b extends wk50<e, ClipsFavoriteFoldersListState, com.vk.clips.favorites.impl.ui.folders.list.a, c> {
    public final UserId f;
    public final s5e g;
    public final d4e h;
    public final u5e i;
    public final f4z<a4e> j;

    /* compiled from: Singles.kt */
    public static final class a<T1, T2, R> implements io.reactivex.rxjava3.functions.c<u2e, b4e, R> {
        @Override // io.reactivex.rxjava3.functions.c
        public final R apply(u2e u2eVar, b4e b4eVar) {
            return (R) new c.d.g(u2eVar, b4eVar);
        }
    }

    /* compiled from: ClipsFavoriteFoldersListFeature.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0599b extends FunctionReferenceImpl implements izs<c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(c cVar) {
            ((b) this.receiver).T(cVar);
            return s3q0.a;
        }
    }

    public b(UserId userId, s5e s5eVar, e4e e4eVar, u5e u5eVar, d dVar) {
        super(a.C0596a.b, dVar);
        this.f = userId;
        this.g = s5eVar;
        this.h = e4eVar;
        this.i = u5eVar;
        this.j = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(ClipsFavoriteFoldersListState clipsFavoriteFoldersListState, com.vk.clips.favorites.impl.ui.folders.list.a aVar) {
        ClipsFavoriteFoldersListState clipsFavoriteFoldersListState2 = clipsFavoriteFoldersListState;
        com.vk.clips.favorites.impl.ui.folders.list.a aVar2 = aVar;
        boolean z = aVar2 instanceof a.C0596a;
        c.d.f fVar = c.d.f.b;
        if (z) {
            d4e d4eVar = this.h;
            a7f0.a.e(this, d4eVar.a(), null, new iz0(this, 11), null, null, 13);
            a7f0.a.e(this, d4eVar.f(), null, new j5(this, 24), null, null, 13);
            a7f0.a.e(this, d4eVar.b(), null, new lz0(this, 20), null, null, 13);
            T(fVar);
            V();
            return;
        }
        if (aVar2 instanceof a.d) {
            T(fVar);
            V();
            return;
        }
        if (aVar2 instanceof a.c) {
            if (!(clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content) || ((ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2).e == ClipsFavoriteFoldersListState.Content.LoadingState.REFRESHING) {
                return;
            }
            T(c.d.e.b);
            V();
            return;
        }
        if ((aVar2 instanceof a.e) || (aVar2 instanceof a.f)) {
            if (clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content) {
                ClipsFavoriteFoldersListState.Content content = (ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2;
                ClipsFavoriteFoldersListState.Content.a aVar3 = content.d;
                if (aVar3 instanceof ClipsFavoriteFoldersListState.Content.a.b) {
                    ClipsFavoriteFoldersListState.Content.LoadingState loadingState = content.e;
                    if (loadingState == ClipsFavoriteFoldersListState.Content.LoadingState.NONE || loadingState == ClipsFavoriteFoldersListState.Content.LoadingState.ERROR_NEXT) {
                        T(c.d.C0601c.b);
                        a7f0.a.f(this, s5e.d(this.g, this.f, null, null, ((ClipsFavoriteFoldersListState.Content.a.b) aVar3).a, 0, 22), new po1(this, 19), new ix2(this, 23), 1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!(aVar2 instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar2;
        boolean z2 = bVar instanceof a.b.C0597a;
        f4z<a4e> f4zVar = this.j;
        if (z2) {
            f4zVar.b(new a4e.a(this.f));
            return;
        }
        if (bVar instanceof a.b.C0598b) {
            ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
            com.vk.mvi.core.internal.executors.a.a(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 29));
        } else {
            if (!(bVar instanceof a.b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b.c cVar = (a.b.c) bVar;
            f4zVar.b(new a4e.b(cVar.b, cVar.c, cVar.d));
        }
    }

    public final f4z<a4e> U() {
        return this.j;
    }

    public final void V() {
        a7f0.a.f(this, x.B(s5e.d(this.g, this.f, Collections.singletonList(FavoriteFolderId.Alias.AllClips.c), null, null, 1, 12).l(new x34(new ur0(8), 7)), s5e.d(this.g, this.f, null, null, null, 0, 30), new a()), new C0599b(1, this, b.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 20), 1);
    }
}
