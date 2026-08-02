package com.vk.photogallery;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.permission.PermissionHelper;
import com.vk.photogallery.LocalGalleryProvider;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.functions.e;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.l1;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import io.reactivex.rxjava3.internal.operators.observable.o2;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.amp;
import xsna.arf;
import xsna.asu0;
import xsna.ayo;
import xsna.bpn0;
import xsna.c40;
import xsna.c5g;
import xsna.cw;
import xsna.cws;
import xsna.drm0;
import xsna.e43;
import xsna.ew;
import xsna.f0z;
import xsna.f5t;
import xsna.fwz;
import xsna.h020;
import xsna.hz10;
import xsna.iz10;
import xsna.izs;
import xsna.j3z;
import xsna.j5g;
import xsna.l2k;
import xsna.ljs;
import xsna.lrk;
import xsna.md90;
import xsna.ndm;
import xsna.on00;
import xsna.ouz;
import xsna.ozh;
import xsna.q40;
import xsna.q4t;
import xsna.q9;
import xsna.quz;
import xsna.qz;
import xsna.rz;
import xsna.s3q0;
import xsna.sj4;
import xsna.sop;
import xsna.tcu;
import xsna.u5;
import xsna.v34;
import xsna.vuz;
import xsna.wc1;
import xsna.x34;
import xsna.yuz;
import xsna.yz10;
import xsna.zcl;
import xsna.zj0;
import xsna.zxo;

/* compiled from: LocalGalleryProvider.kt */
@Keep
/* loaded from: classes4.dex */
public class LocalGalleryProvider implements f5t {
    private final d<List<a>> albums;
    private io.reactivex.rxjava3.disposables.c contentChangeDisposable;
    private final ContentResolver contentResolver;
    private final Context context;
    private final a emptyAlbum;
    private izs<? super q4t, Boolean> entryFilter;
    private boolean isLoading;
    private final int mediaType;

    /* compiled from: LocalGalleryProvider.kt */
    public static final class a extends wc1 {
        public final List<q4t> c;
        public final int d;

        public a(int i, int i2, String str, List list) {
            super(str, i);
            this.c = list;
            this.d = i2;
        }
    }

    /* compiled from: LocalGalleryProvider.kt */
    public static final class b extends ContentObserver {
        public final /* synthetic */ int b;
        public final /* synthetic */ r<List<AlbumEntry>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, r<List<AlbumEntry>> rVar, Handler handler) {
            super(handler);
            this.b = i;
            this.c = rVar;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            LocalGalleryProvider localGalleryProvider = LocalGalleryProvider.this;
            io.reactivex.rxjava3.disposables.c cVar = localGalleryProvider.contentChangeDisposable;
            if (cVar != null) {
                cVar.dispose();
            }
            bpn0 bpn0Var = iz10.a;
            yz10 a = iz10.a(localGalleryProvider.context);
            o2 t0 = new o0(a.b(localGalleryProvider.getMediaType(), localGalleryProvider.getDefaultAlbumName(localGalleryProvider.context)), new q40(new ndm(a, localGalleryProvider, this.b), 22)).t0(1L);
            r<List<AlbumEntry>> rVar = this.c;
            localGalleryProvider.contentChangeDisposable = t0.subscribe(new ljs(new f0z(rVar, 2), 5), new j3z(new ozh(rVar, 27), 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalGalleryProvider() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(q4t q4tVar) {
        return true;
    }

    private final List<Uri> getContentObserverUri(int i) {
        return i != 111 ? i != 222 ? i != 333 ? h020.c : h020.b : h020.a : h020.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadAlbums$lambda$8(izs izsVar, Object obj) {
        return (List) izsVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc1 loadDefaultAlbum$lambda$5(LocalGalleryProvider localGalleryProvider, List list) {
        wc1 wc1Var = (wc1) j5g.a0(list);
        return wc1Var == null ? localGalleryProvider.emptyAlbum : wc1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc1 loadDefaultAlbum$lambda$6(izs izsVar, Object obj) {
        return (wc1) izsVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final md90 loadEntries$lambda$10(izs izsVar, Object obj) {
        return (md90) izsVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final md90 loadEntries$lambda$9(LocalGalleryProvider localGalleryProvider, int i, a aVar, List list) {
        return new md90(localGalleryProvider.toGalleryItems(list), list.size() + i, aVar.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeLocalGalleryContentChangePaginated$lambda$13(final LocalGalleryProvider localGalleryProvider, int i, r rVar) {
        final b bVar = localGalleryProvider.new b(i, rVar, new Handler(Looper.getMainLooper()));
        rVar.a(new e() { // from class: xsna.suz
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                LocalGalleryProvider.observeLocalGalleryContentChangePaginated$lambda$13$lambda$11(LocalGalleryProvider.this, bVar);
            }
        });
        Iterator<T> it = localGalleryProvider.getContentObserverUri(localGalleryProvider.mediaType).iterator();
        while (it.hasNext()) {
            localGalleryProvider.contentResolver.registerContentObserver((Uri) it.next(), true, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeLocalGalleryContentChangePaginated$lambda$13$lambda$11(LocalGalleryProvider localGalleryProvider, b bVar) {
        io.reactivex.rxjava3.disposables.c cVar = localGalleryProvider.contentChangeDisposable;
        if (cVar != null) {
            cVar.dispose();
        }
        localGalleryProvider.contentResolver.unregisterContentObserver(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeLocalGalleryContentChangePaginated$lambda$15(izs izsVar, Object obj) {
        return (List) izsVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 observeLocalGalleryContentChangePaginated$lambda$16(LocalGalleryProvider localGalleryProvider, List list) {
        localGalleryProvider.albums.onNext(list);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map observeLocalGalleryContentChangePaginated$lambda$19(LocalGalleryProvider localGalleryProvider, List list) {
        List list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : list2) {
            linkedHashMap.put(obj, localGalleryProvider.toPaginatedEntries((a) obj));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map observeLocalGalleryContentChangePaginated$lambda$20(izs izsVar, Object obj) {
        return (Map) izsVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 prefetch$lambda$1(LocalGalleryProvider localGalleryProvider, List list) {
        localGalleryProvider.albums.onNext(list);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 prefetch$lambda$3(Throwable th) {
        com.vk.metrics.eventtracking.b.a.q(th);
        return s3q0.a;
    }

    private final q<List<a>> reloadFromMediaStore() {
        bpn0 bpn0Var = iz10.a;
        yz10 a2 = iz10.a(this.context);
        ArrayList arrayList = a2.b.a;
        t T = arrayList != null ? q.T(toLocalAlbums(arrayList)) : g0.b;
        j1 U = a2.b(this.mediaType, getDefaultAlbumName(this.context)).U(new q9(new arf(this, 25), 19));
        T.getClass();
        q q = q.q(T, U);
        qz qzVar = new qz(new l2k(this, 24), 26);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        q.getClass();
        a0 a0Var = new a0(new c0(q, qzVar, kVar), new rz(this, 2));
        asu0.a.getClass();
        return a0Var.a0(asu0.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List reloadFromMediaStore$lambda$22(izs izsVar, Object obj) {
        return (List) izsVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 reloadFromMediaStore$lambda$23(LocalGalleryProvider localGalleryProvider, io.reactivex.rxjava3.disposables.c cVar) {
        localGalleryProvider.isLoading = true;
        return s3q0.a;
    }

    private final List<ouz> toGalleryItems(List<? extends MediaStoreEntry> list) {
        ouz vuzVar;
        List<? extends MediaStoreEntry> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (MediaStoreEntry mediaStoreEntry : list2) {
            if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
                vuzVar = new fwz(mediaStoreEntry);
            } else {
                String uri = mediaStoreEntry.f().toString();
                vuzVar = drm0.i0(JwtParser.SEPARATOR_CHAR, uri, uri).equalsIgnoreCase("gif") ? new vuz(mediaStoreEntry) : new yuz(mediaStoreEntry);
            }
            arrayList.add(vuzVar);
        }
        izs<? super q4t, Boolean> izsVar = this.entryFilter;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (izsVar.invoke(next).booleanValue()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<a> toLocalAlbums(List<AlbumEntry> list) {
        List<AlbumEntry> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (AlbumEntry albumEntry : list2) {
            List<ouz> galleryItems = toGalleryItems(albumEntry.d);
            String str = albumEntry.c;
            int i = albumEntry.b;
            int size = galleryItems.size();
            int i2 = albumEntry.f;
            if (size < i2) {
                size = i2;
            }
            arrayList.add(new a(i, size, str, galleryItems));
        }
        return arrayList;
    }

    private final md90 toPaginatedEntries(a aVar) {
        List<q4t> list = aVar.c;
        return new md90(list, list.size(), aVar.d);
    }

    @Override // xsna.f5t
    public String getDefaultAlbumName(Context context) {
        return context.getString(R.string.photo_gallery_all);
    }

    public final izs<q4t, Boolean> getEntryFilter() {
        return this.entryFilter;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    @Override // xsna.f5t
    public q<List<wc1>> loadAlbums() {
        if (!this.isLoading && !this.albums.Q0()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            prefetch(context);
        }
        return this.albums.U(new zj0(new quz(0), 15));
    }

    @Override // xsna.f5t
    public q<wc1> loadDefaultAlbum() {
        return loadAlbums().U(new x34(new sop(this, 22), 16));
    }

    @Override // xsna.f5t
    public q<md90> loadEntries(wc1 wc1Var, final int i, int i2) {
        final a aVar = wc1Var instanceof a ? (a) wc1Var : null;
        if (aVar == null) {
            return l1.b;
        }
        int i3 = i + i2;
        int i4 = aVar.d;
        if (i3 >= i4) {
            i2 = i4 - i;
        }
        int i5 = i2;
        bpn0 bpn0Var = iz10.a;
        return hz10.a(iz10.a(this.context), this.mediaType, wc1Var.b, i, i5, 16).U(new u5(new izs() { // from class: xsna.ruz
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                md90 loadEntries$lambda$9;
                loadEntries$lambda$9 = LocalGalleryProvider.loadEntries$lambda$9(LocalGalleryProvider.this, i, aVar, (List) obj);
                return loadEntries$lambda$9;
            }
        }, 19)).r0(asu0.a.c());
    }

    public final q<Map<a, md90>> observeLocalGalleryContentChangePaginated(final int i) {
        j1 U = new y(new io.reactivex.rxjava3.internal.operators.observable.q(new s() { // from class: xsna.puz
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                LocalGalleryProvider.observeLocalGalleryContentChangePaginated$lambda$13(LocalGalleryProvider.this, i, rVar);
            }
        }), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new sj4(new cws(this, 17), 17));
        c40 c40Var = new c40(new zxo(this, 23), 26);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(c40Var, lVar, kVar, kVar).U(new v34(new ayo(this, 16), 10));
    }

    @SuppressLint({"CheckResult"})
    public void prefetch(Context context) {
        PermissionHelper.a.getClass();
        if (PermissionHelper.q(context)) {
            reloadFromMediaStore().subscribe(new cw(new lrk(this, 27), 26), new ew(new amp(10), 28));
        }
    }

    public final void setEntryFilter(izs<? super q4t, Boolean> izsVar) {
        this.entryFilter = izsVar;
    }

    public LocalGalleryProvider(int i, izs<? super q4t, Boolean> izsVar) {
        this.mediaType = i;
        this.entryFilter = izsVar;
        Context context = e43.a;
        context = context == null ? null : context;
        this.context = context;
        this.albums = d.N0();
        this.emptyAlbum = new a(0, 0, "…", EmptyList.b);
        this.contentResolver = context.getContentResolver();
    }

    public /* synthetic */ LocalGalleryProvider(int i, izs izsVar, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 111 : i, (i2 & 2) != 0 ? new tcu(7) : izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List loadAlbums$lambda$7(List list) {
        return list;
    }

    @Override // xsna.f5t
    public void onAlbumSelected(wc1 wc1Var) {
    }
}
