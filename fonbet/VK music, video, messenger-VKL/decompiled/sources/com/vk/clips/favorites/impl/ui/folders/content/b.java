package com.vk.clips.favorites.impl.ui.folders.content;

import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.favorites.impl.ui.folders.content.c;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.c5e;
import xsna.c5g;
import xsna.d4e;
import xsna.e43;
import xsna.e4e;
import xsna.eaa;
import xsna.epx;
import xsna.f4z;
import xsna.g6;
import xsna.h3e;
import xsna.j5g;
import xsna.s2f;
import xsna.s5e;
import xsna.t40;
import xsna.t9;
import xsna.tlo0;
import xsna.tq;
import xsna.v9;
import xsna.wk50;
import xsna.x2e;

/* compiled from: ClipsFavoriteFolderContentListFeature.kt */
/* loaded from: classes16.dex */
public final class b extends wk50<ClipsFavoriteFolderContentListViewState, ClipsFavoriteFolderContentListState, a, d> {
    public final c f;
    public final s5e g;
    public final c5e h;
    public final d4e i;
    public final s2f j;
    public final f4z<h3e> k;

    public b(c cVar, s5e s5eVar, c5e c5eVar, e4e e4eVar, s2f s2fVar, f fVar) {
        super(a.c.b, fVar);
        this.f = cVar;
        this.g = s5eVar;
        this.h = c5eVar;
        this.i = e4eVar;
        this.j = s2fVar;
        this.k = new f4z<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0326, code lost:
    
        if (r9 != (-1)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0329, code lost:
    
        r7 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x032d, code lost:
    
        if (r7 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x032f, code lost:
    
        r2 = r7.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0333, code lost:
    
        r6.b(new xsna.h3e.c(r3, new xsna.kwc(r5, r4, r2), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0340, code lost:
    
        return;
     */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState, a aVar) {
        PaginationKey paginationKey;
        tlo0 h;
        ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState2 = clipsFavoriteFolderContentListState;
        a aVar2 = aVar;
        boolean z = aVar2 instanceof a.b;
        d.InterfaceC0593d.a aVar3 = d.InterfaceC0593d.a.b;
        h3e.b bVar = h3e.b.a;
        c cVar = this.f;
        f4z<h3e> f4zVar = this.k;
        if (z) {
            if (cVar instanceof c.a) {
                f4zVar.b(bVar);
                return;
            }
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipsFavoriteFolderContentListState.c g = clipsFavoriteFolderContentListState2.g();
            if (!(g instanceof ClipsFavoriteFolderContentListState.c.b)) {
                if (!(g instanceof ClipsFavoriteFolderContentListState.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(bVar);
                return;
            } else if (((ClipsFavoriteFolderContentListState.c.b) g).a.isEmpty()) {
                T(aVar3);
                return;
            } else {
                T(d.InterfaceC0593d.b.b);
                return;
            }
        }
        if (aVar2 instanceof a.c) {
            d4e d4eVar = this.i;
            a7f0.a.e(this, d4eVar.b(), null, new t9(this, 26), null, null, 13);
            a7f0.a.e(this, d4eVar.c(), null, new t40(this, 22), null, null, 13);
            a7f0.a.e(this, d4eVar.d(), null, new v9(this, 25), null, null, 13);
            a7f0.a.e(this, d4eVar.e(), null, new x2e(this, 0), null, null, 13);
            U();
            return;
        }
        if (aVar2 instanceof a.g) {
            U();
            return;
        }
        Integer num = null;
        if (aVar2 instanceof a.f) {
            if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) || ((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2).f == ClipsFavoriteFolderContentListState.Content.LoadingState.REFRESHING) {
                return;
            }
            T(d.c.e.b);
            W(null);
            return;
        }
        if ((aVar2 instanceof a.h) || (aVar2 instanceof a.i)) {
            if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) {
                ClipsFavoriteFolderContentListState.Content content = (ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2;
                ClipsFavoriteFolderContentListState.Content.a aVar4 = content.e;
                if (aVar4 instanceof ClipsFavoriteFolderContentListState.Content.a.b) {
                    ClipsFavoriteFolderContentListState.Content.LoadingState loadingState = content.f;
                    if (loadingState == ClipsFavoriteFolderContentListState.Content.LoadingState.NONE || loadingState == ClipsFavoriteFolderContentListState.Content.LoadingState.ERROR_NEXT) {
                        T(d.c.C0591c.b);
                        W(((ClipsFavoriteFolderContentListState.Content.a.b) aVar4).a);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = aVar2 instanceof a.e;
        c5e c5eVar = this.h;
        if (z2) {
            a.e eVar = (a.e) aVar2;
            if (eVar instanceof a.e.C0590e) {
                T(d.InterfaceC0593d.C0594d.b);
                return;
            }
            if (eVar instanceof a.e.C0589a) {
                if (cVar instanceof c.a) {
                    f4zVar.b(bVar);
                    return;
                } else {
                    T(aVar3);
                    return;
                }
            }
            if (eVar instanceof a.e.d) {
                ClipsFavoriteFolderContentListState.c g2 = clipsFavoriteFolderContentListState2.g();
                if ((clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) && (g2 instanceof ClipsFavoriteFolderContentListState.c.b)) {
                    Set<String> set = ((ClipsFavoriteFolderContentListState.c.b) g2).a;
                    List<VideoFile> list = ((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2).d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (set.contains(((VideoFile) obj).r1())) {
                            arrayList.add(obj);
                        }
                    }
                    List R = j5g.R(arrayList);
                    if (!(cVar instanceof c.a)) {
                        f4zVar.b(new h3e.h(cVar.q(), cVar.b(), R));
                        return;
                    }
                    c.a aVar5 = (c.a) cVar;
                    this.h.b(aVar5.a, aVar5.d, aVar5.e, R, (r11 & 16) != 0);
                    f4zVar.b(bVar);
                    return;
                }
                return;
            }
            if (eVar instanceof a.e.b) {
                f4zVar.b(new h3e.e(tq.h(tlo0.Companion, epx.f(cVar.b(), FavoriteFolderId.Alias.AllClips.c) ? R.string.clips_favorites_folder_content_list_delete_all_clips_description : R.string.clips_favorites_folder_content_list_delete_clips_description)));
                return;
            }
            if (!(eVar instanceof a.e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipsFavoriteFolderContentListState.c g3 = clipsFavoriteFolderContentListState2.g();
            if ((clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) && (g3 instanceof ClipsFavoriteFolderContentListState.c.b)) {
                Set<String> set2 = ((ClipsFavoriteFolderContentListState.c.b) g3).a;
                ClipsFavoriteFolderContentListState.Content content2 = (ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2;
                List<VideoFile> list2 = content2.d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (set2.contains(((VideoFile) obj2).r1())) {
                        arrayList2.add(obj2);
                    }
                }
                c5eVar.a(cVar.b(), cVar.q(), content2.b, j5g.R(arrayList2));
                T(aVar3);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.InterfaceC0586a) {
            a.InterfaceC0586a interfaceC0586a = (a.InterfaceC0586a) aVar2;
            if (interfaceC0586a instanceof a.InterfaceC0586a.b) {
                if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) {
                    ClipsFavoriteFolderContentListState.Content content3 = (ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2;
                    if (content3.d.isEmpty()) {
                        tlo0.a aVar6 = tlo0.Companion;
                        Object[] objArr = {content3.b};
                        aVar6.getClass();
                        h = tlo0.a.c(R.string.clips_favorites_folder_content_list_delete_empty_folder_description, objArr);
                    } else {
                        h = tq.h(tlo0.Companion, R.string.clips_favorites_folder_content_list_delete_folder_description);
                    }
                    f4zVar.b(new h3e.f(h));
                    return;
                }
                return;
            }
            if (interfaceC0586a instanceof a.InterfaceC0586a.c) {
                FavoriteFolderId b = cVar.b();
                if (b instanceof FavoriteFolderId.Id) {
                    c5eVar.g(cVar.q(), (FavoriteFolderId.Id) b, clipsFavoriteFolderContentListState2.getTitle());
                    f4zVar.b(bVar);
                    return;
                }
                return;
            }
            if (interfaceC0586a instanceof a.InterfaceC0586a.C0587a) {
                f4zVar.b(new h3e.a(cVar.q(), FavoriteFolderId.Alias.AllClips.c, tq.h(tlo0.Companion, R.string.clips_favorites_folders_picker_all_clips), cVar.b(), new tlo0.h(clipsFavoriteFolderContentListState2.getTitle())));
                return;
            }
            if (!(interfaceC0586a instanceof a.InterfaceC0586a.d)) {
                if (!(interfaceC0586a instanceof a.InterfaceC0586a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(h3e.d.a);
                return;
            } else {
                FavoriteFolderId b2 = cVar.b();
                if (b2 instanceof FavoriteFolderId.Id) {
                    f4zVar.b(new h3e.g(cVar.q(), (FavoriteFolderId.Id) b2, clipsFavoriteFolderContentListState2.getTitle()));
                    return;
                }
                return;
            }
        }
        if (!(aVar2 instanceof a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        a.d dVar = (a.d) aVar2;
        if (!(dVar instanceof a.d.C0588a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content)) {
            return;
        }
        ClipsFavoriteFolderContentListState.Content content4 = (ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2;
        List<VideoFile> list3 = content4.d;
        if (!(content4.c instanceof ClipsFavoriteFolderContentListState.c.b)) {
            String str = ((a.d.C0588a) dVar).b;
            List singletonList = Collections.singletonList(new ClipFeedTab.FavoriteFolder(cVar.b()));
            List<VideoFile> list4 = list3;
            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList3.add(this.j.c((VideoFile) it.next()));
            }
            ClipsFavoriteFolderContentListState.Content.a aVar7 = content4.e;
            if (aVar7 instanceof ClipsFavoriteFolderContentListState.Content.a.b) {
                paginationKey = new PaginationKey.Next(((ClipsFavoriteFolderContentListState.Content.a.b) aVar7).a);
            } else {
                if (!(aVar7 instanceof ClipsFavoriteFolderContentListState.Content.a.C0585a)) {
                    throw new NoWhenBranchMatchedException();
                }
                paginationKey = PaginationKey.LoadedFull.b;
            }
            Iterator<T> it2 = list3.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it2.next();
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((VideoFile) next).r1(), str)) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            T(new d.InterfaceC0593d.c(((a.d.C0588a) dVar).b));
        }
    }

    public final void U() {
        T(d.c.f.b);
        if (this.f instanceof c.a) {
            T(d.InterfaceC0593d.C0594d.b);
        }
        W(null);
    }

    public final f4z<h3e> V() {
        return this.k;
    }

    public final void W(String str) {
        a7f0.a.f(this, s5e.c(this.g, this.f.b(), str, 4), new eaa(4, str, (Object) this), new g6(4, str, this), 1);
    }
}
