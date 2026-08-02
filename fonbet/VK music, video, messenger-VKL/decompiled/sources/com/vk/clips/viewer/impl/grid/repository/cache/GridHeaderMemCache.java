package com.vk.clips.viewer.impl.grid.repository.cache;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.shortvideo.ClipGridParams;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.c63;
import xsna.epx;
import xsna.h60;
import xsna.ms9;
import xsna.mwu;
import xsna.o25;
import xsna.pfu;
import xsna.qb6;
import xsna.wfu;
import xsna.wmi0;
import xsna.zcl;

/* compiled from: GridHeaderMemCache.kt */
/* loaded from: classes17.dex */
public final class GridHeaderMemCache implements pfu {
    public Pair<String, HeaderCache.OwnerCache> b;
    public final b c;

    /* compiled from: GridHeaderMemCache.kt */
    public static abstract class HeaderCache<T> extends mwu {

        /* compiled from: GridHeaderMemCache.kt */
        public static final class OwnerCache extends HeaderCache<wfu.a.b> implements Serializer.StreamParcelable {
            public static final Serializer.c<OwnerCache> CREATOR = new a();
            public final List<ClipGridParams.Data.Profile> b;
            public final List<ClipVideoFile> c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<OwnerCache> {
                @Override // com.vk.core.serialize.Serializer.c
                public final OwnerCache a(Serializer serializer) {
                    ArrayList k = serializer.k(ClipGridParams.Data.Profile.class);
                    if (k == null) {
                        k = new ArrayList();
                    }
                    return new OwnerCache(k, serializer.k(ClipVideoFile.class));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OwnerCache[i];
                }
            }

            public OwnerCache(List<ClipGridParams.Data.Profile> list, List<ClipVideoFile> list2) {
                super(null);
                this.b = list;
                this.c = list2;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.W(this.b);
                serializer.W(this.c);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OwnerCache)) {
                    return false;
                }
                OwnerCache ownerCache = (OwnerCache) obj;
                return epx.f(this.b, ownerCache.b) && epx.f(this.c, ownerCache.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                List<ClipVideoFile> list = this.c;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OwnerCache(profiles=");
                sb.append(this.b);
                sb.append(", likedClips=");
                return ms9.a(')', sb, this.c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Serializer.StreamParcelable.a.a(this, parcel);
            }
        }

        public HeaderCache(zcl zclVar) {
        }
    }

    /* compiled from: GridHeaderMemCache.kt */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void w() {
            GridHeaderMemCache.this.c.dispose();
        }
    }

    public GridHeaderMemCache() {
        b bVar = new b();
        this.c = bVar;
        String valueOf = String.valueOf(o25.a().o().a.b);
        c subscribe = wmi0.a.h(valueOf).subscribe(new h60(new qb6(13, this, valueOf), 27));
        if (subscribe != null) {
            bVar.b(subscribe);
        }
        c63 c63Var = c63.a;
        c63.a(new a());
    }

    @Override // xsna.pfu
    public final synchronized void a(String str, HeaderCache.OwnerCache ownerCache) {
        this.b = new Pair<>(str, ownerCache);
        wmi0.a.a(str, ownerCache);
    }

    @Override // xsna.pfu
    public final synchronized mwu c(String str) {
        HeaderCache.OwnerCache ownerCache;
        HeaderCache.OwnerCache j;
        try {
            Pair<String, HeaderCache.OwnerCache> pair = this.b;
            ownerCache = null;
            if (pair != null && (j = pair.j()) != null) {
                Pair<String, HeaderCache.OwnerCache> pair2 = this.b;
                if (str.equals(pair2 != null ? pair2.i() : null)) {
                    ownerCache = j;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return ownerCache;
    }
}
