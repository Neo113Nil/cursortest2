package com.vk.story.impl.domain.interactor.cache;

import android.os.Parcel;
import com.vk.core.files.a;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.StoriesContainer;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.e43;
import xsna.epx;
import xsna.ms9;
import xsna.vhk0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: StoriesCacheManager.kt */
/* loaded from: classes11.dex */
public final class StoriesCacheManager {
    public final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public final File b;
    public final CountDownLatch c;
    public volatile int d;

    /* compiled from: StoriesCacheManager.kt */
    /* loaded from: classes6.dex */
    public static final class Meta implements Serializer.StreamParcelable {
        public static final Serializer.c<Meta> CREATOR = new a();
        public final int b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Meta> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Meta a(Serializer serializer) {
                return new Meta(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Meta[i];
            }
        }

        public Meta() {
            this(0, 1, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Meta) && this.b == ((Meta) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Meta(count="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public Meta(int i) {
            this.b = i;
        }

        public /* synthetic */ Meta(int i, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        public Meta(Serializer serializer) {
            this(serializer.u());
        }
    }

    /* compiled from: StoriesCacheManager.kt */
    /* loaded from: classes6.dex */
    public static final class StoriesCache implements Serializer.StreamParcelable {
        public static final Serializer.c<StoriesCache> CREATOR = new a();
        public final Meta b;
        public final List<StoriesContainer> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<StoriesCache> {
            @Override // com.vk.core.serialize.Serializer.c
            public final StoriesCache a(Serializer serializer) {
                return new StoriesCache(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoriesCache[i];
            }
        }

        public StoriesCache() {
            this(null, null, 3, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
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
            if (!(obj instanceof StoriesCache)) {
                return false;
            }
            StoriesCache storiesCache = (StoriesCache) obj;
            return epx.f(this.b, storiesCache.b) && epx.f(this.c, storiesCache.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoriesCache(meta=");
            sb.append(this.b);
            sb.append(", items=");
            return ms9.a(')', sb, this.c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StoriesCache(Meta meta, List<? extends StoriesContainer> list) {
            this.b = meta;
            this.c = list;
        }

        public StoriesCache(Meta meta, List list, int i, zcl zclVar) {
            this((i & 1) != 0 ? new Meta(0, 1, null) : meta, (i & 2) != 0 ? EmptyList.b : list);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StoriesCache(Serializer serializer) {
            this(r0, r5 == null ? EmptyList.b : r5);
            Meta meta = (Meta) serializer.G(Meta.class.getClassLoader());
            meta = meta == null ? new Meta(0, 1, null) : meta;
            List k = serializer.k(StoriesContainer.class);
        }
    }

    public StoriesCacheManager() {
        Regex regex = a.a;
        this.b = new File(e43.a.getFilesDir(), "stories.dat");
        this.c = new CountDownLatch(1);
    }

    public final void a() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            File file = this.b;
            Regex regex = a.a;
            vhk0.b(file);
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }
}
