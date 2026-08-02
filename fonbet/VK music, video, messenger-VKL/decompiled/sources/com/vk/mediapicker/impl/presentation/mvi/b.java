package com.vk.mediapicker.impl.presentation.mvi;

import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.mediapicker.impl.presentation.mvi.a;
import com.vk.mediapicker.impl.presentation.mvi.f;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.bl50;
import xsna.bwj;
import xsna.c3v;
import xsna.d4;
import xsna.dwj;
import xsna.el50;
import xsna.eu10;
import xsna.fu10;
import xsna.hs00;
import xsna.j4x;
import xsna.j5g;
import xsna.jl50;
import xsna.lj50;
import xsna.ll50;
import xsna.ln50;
import xsna.lt10;
import xsna.msy;
import xsna.on50;
import xsna.rdi;
import xsna.rf4;
import xsna.s3q0;
import xsna.sj50;
import xsna.uf1;
import xsna.uu10;
import xsna.v4w;
import xsna.vu10;
import xsna.wu10;
import xsna.x0s;

/* compiled from: MediaPickerMviActor.kt */
/* loaded from: classes3.dex */
public final class b extends bl50<MediaPickerMviState, com.vk.mediapicker.impl.presentation.mvi.a, on50, bwj, dwj, f> {
    public final lt10 c;
    public final sj50<MediaPickerMviState, on50, ll50<on50, bwj, dwj>, jl50<MediaPickerMviState>, f> d;
    public final Object e;

    /* compiled from: MediaPickerMviActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPickerConfiguration.MediaType.values().length];
            try {
                iArr[MediaPickerConfiguration.MediaType.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerConfiguration.MediaType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaPickerConfiguration.MediaType.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(lt10 lt10Var, sj50<MediaPickerMviState, on50, ll50<on50, bwj, dwj>, jl50<MediaPickerMviState>, f> sj50Var) {
        super(sj50Var);
        this.c = lt10Var;
        this.d = sj50Var;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new d4(20));
    }

    public static final int m(b bVar, MediaPickerConfiguration.MediaType mediaType) {
        bVar.getClass();
        int i = a.$EnumSwitchMapping$0[mediaType.ordinal()];
        if (i == 1) {
            return Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE;
        }
        if (i == 2) {
            return 333;
        }
        if (i == 3) {
            return 111;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<MediaPickerMviState, on50, ll50<on50, bwj, dwj>, jl50<MediaPickerMviState>, f> W() {
        return this.d;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        com.vk.mediapicker.impl.presentation.mvi.a aVar = (com.vk.mediapicker.impl.presentation.mvi.a) lj50Var;
        boolean z = aVar instanceof a.C1266a;
        int i = 0;
        ln50.a.c cVar = ln50.a.c;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            int i2 = ((a.C1266a) aVar).b;
            if (((MediaPickerMviState) sj50Var.getCurrentState()).c == 0) {
                return;
            }
            List<AlbumEntry> list = ((MediaPickerMviState) sj50Var.getCurrentState()).d;
            AlbumEntry albumEntry = (AlbumEntry) j5g.b0(i2, list);
            int i3 = albumEntry != null ? albumEntry.b : ((AlbumEntry) j5g.Y(list)).b;
            rdi.y(this, new rf4(i3, list));
            g(wu10.a);
            el50.a.a(this, vu10.a, cVar, new fu10(this, i3, i));
            return;
        }
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        if (aVar instanceof a.f) {
            int i4 = ((a.f) aVar).b;
            MediaPickerMviState.Medias medias = ((MediaPickerMviState) sj50Var.getCurrentState()).g;
            MediaPickerMviState.Medias.Loaded loaded = medias instanceof MediaPickerMviState.Medias.Loaded ? (MediaPickerMviState.Medias.Loaded) medias : null;
            if (loaded == null) {
                return;
            }
            List<MediaStoreEntry> list2 = loaded.c;
            if (((MediaPickerMviState) sj50Var.getCurrentState()).b instanceof MediaPickerConfiguration.MultiSelectMode.Single) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((MediaStoreEntry) next).getId() == i4) {
                        obj = next;
                        break;
                    }
                }
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj;
                if (mediaStoreEntry == null) {
                    return;
                }
                c(new f.c(Collections.singletonList(mediaStoreEntry)));
                return;
            }
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((MediaStoreEntry) next2).getId() == i4) {
                    obj2 = next2;
                    break;
                }
            }
            MediaStoreEntry mediaStoreEntry2 = (MediaStoreEntry) obj2;
            if (mediaStoreEntry2 == null) {
                return;
            }
            c(new f.e(list2.indexOf(mediaStoreEntry2), mediaStoreEntry2));
            return;
        }
        if (aVar instanceof a.g) {
            int i5 = ((a.g) aVar).b;
            MediaPickerMviState.Medias medias2 = ((MediaPickerMviState) sj50Var.getCurrentState()).g;
            MediaPickerMviState.Medias.Loaded loaded2 = medias2 instanceof MediaPickerMviState.Medias.Loaded ? (MediaPickerMviState.Medias.Loaded) medias2 : null;
            if (loaded2 == null) {
                return;
            }
            List<MediaStoreEntry> list3 = loaded2.c;
            Iterator<T> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((MediaStoreEntry) next3).getId() == i5) {
                    obj3 = next3;
                    break;
                }
            }
            MediaStoreEntry mediaStoreEntry3 = (MediaStoreEntry) obj3;
            if (mediaStoreEntry3 == null) {
                return;
            }
            c(new f.e(list3.indexOf(mediaStoreEntry3), mediaStoreEntry3));
            return;
        }
        boolean z2 = aVar instanceof a.h;
        lt10 lt10Var = this.c;
        if (z2) {
            int i6 = ((a.h) aVar).b;
            MediaPickerMviState.Medias medias3 = ((MediaPickerMviState) sj50Var.getCurrentState()).g;
            MediaPickerMviState.Medias.Loaded loaded3 = medias3 instanceof MediaPickerMviState.Medias.Loaded ? (MediaPickerMviState.Medias.Loaded) medias3 : null;
            if (loaded3 == null) {
                return;
            }
            Iterator<MediaStoreEntry> it4 = ((MediaPickerMviState) sj50Var.getCurrentState()).f.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    i = -1;
                    break;
                } else if (it4.next().getId() == i6) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > -1) {
                rdi.y(this, new x0s(this, i, 1));
                return;
            }
            int d = lt10Var.getConfig().c.d();
            if (d != -1 && ((MediaPickerMviState) sj50Var.getCurrentState()).f.size() >= d) {
                c(new f.h(lt10Var.getConfig().d));
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            Iterator<T> it5 = loaded3.c.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next4 = it5.next();
                if (((MediaStoreEntry) next4).getId() == i6) {
                    obj4 = next4;
                    break;
                }
            }
            MediaStoreEntry mediaStoreEntry4 = (MediaStoreEntry) obj4;
            if (mediaStoreEntry4 == null) {
                return;
            }
            rdi.y(this, new uf1(25, this, mediaStoreEntry4));
            return;
        }
        boolean z3 = aVar instanceof a.k;
        ln50.a.C3276a c3276a = ln50.a.b;
        if (z3) {
            rdi.y(this, new hs00((a.k) aVar, 4));
            if (((MediaPickerMviState) sj50Var.getCurrentState()).c == 0) {
                el50.a.a(this, uu10.a, c3276a, new j4x(this, 8));
                return;
            }
            int i7 = ((MediaPickerMviState) sj50Var.getCurrentState()).c;
            g(wu10.a);
            el50.a.a(this, vu10.a, cVar, new fu10(this, i7, i));
            return;
        }
        if (aVar.equals(a.n.b)) {
            if (((MediaPickerMviState) sj50Var.getCurrentState()).g instanceof MediaPickerMviState.Medias.Loaded) {
                return;
            }
            rdi.y(this, new c3v(1));
            return;
        }
        if (aVar.equals(a.m.b)) {
            c(f.C1267f.a);
            return;
        }
        if (aVar.equals(a.l.b)) {
            c(new f.c(((MediaPickerMviState) sj50Var.getCurrentState()).f));
            return;
        }
        if (aVar.equals(a.b.b)) {
            c(new f.d(lt10Var.getConfig().d));
            return;
        }
        if (aVar.equals(a.d.b)) {
            c(f.b.a);
            return;
        }
        if (aVar.equals(a.i.b)) {
            c(f.a.a);
            return;
        }
        if (aVar.equals(a.c.b)) {
            rdi.y(this, new v4w(this, 6));
            return;
        }
        if (!aVar.equals(a.e.b)) {
            if (!aVar.equals(a.j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c(f.g.a);
            return;
        }
        int i8 = ((MediaPickerMviState) sj50Var.getCurrentState()).c;
        MediaPickerMviState.Medias medias4 = ((MediaPickerMviState) sj50Var.getCurrentState()).g;
        MediaPickerMviState.Medias.Loaded loaded4 = medias4 instanceof MediaPickerMviState.Medias.Loaded ? (MediaPickerMviState.Medias.Loaded) medias4 : null;
        if (loaded4 == null || loaded4.e == MediaPickerMviState.Pagination.NoMoreData) {
            return;
        }
        el50.a.a(this, wu10.a, c3276a, new eu10(this, i8, loaded4, i));
    }
}
