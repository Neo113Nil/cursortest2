package com.vk.dto.newsfeed.discover;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.discover.DiscoverCategoryType;
import xsna.epx;

/* compiled from: DiscoverCategory.kt */
/* loaded from: classes18.dex */
public final class DiscoverCategory implements Serializer.StreamParcelable {
    public static final Serializer.c<DiscoverCategory> CREATOR = new a();
    public final String b;
    public final String c;
    public final DiscoverCategoryType d;
    public final Ref e;

    /* compiled from: DiscoverCategory.kt */
    public static final class Ref extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Ref> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Ref> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Ref a(Serializer serializer) {
                return new Ref(serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ref[i];
            }
        }

        public Ref(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DiscoverCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverCategory a(Serializer serializer) {
            DiscoverCategoryType discoverCategoryType;
            String H = serializer.H();
            String H2 = serializer.H();
            DiscoverCategoryType.a aVar = DiscoverCategoryType.Companion;
            String H3 = serializer.H();
            aVar.getClass();
            DiscoverCategoryType[] values = DiscoverCategoryType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    discoverCategoryType = null;
                    break;
                }
                discoverCategoryType = values[i];
                if (epx.f(discoverCategoryType.h(), H3)) {
                    break;
                }
                i++;
            }
            return new DiscoverCategory(H, H2, discoverCategoryType, (Ref) serializer.G(Ref.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverCategory[i];
        }
    }

    public DiscoverCategory(String str, String str2, DiscoverCategoryType discoverCategoryType, Ref ref) {
        this.b = str;
        this.c = str2;
        this.d = discoverCategoryType;
        this.e = ref;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d.h());
        serializer.i0(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
