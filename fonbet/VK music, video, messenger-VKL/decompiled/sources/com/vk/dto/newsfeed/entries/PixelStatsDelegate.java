package com.vk.dto.newsfeed.entries;

import android.os.Parcel;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.newsfeed.entries.PixelStatsDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import kotlin.collections.EmptyList;
import xsna.dqa0;
import xsna.vsq;

/* compiled from: PixelStatsDelegate.kt */
/* loaded from: classes18.dex */
public final class PixelStatsDelegate implements dqa0, Serializer.StreamParcelable {
    public static final Serializer.c<PixelStatsDelegate> CREATOR = new a();
    public final HashMap b = new HashMap();
    public PixelStats c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PixelStatsDelegate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PixelStatsDelegate a(Serializer serializer) {
            PixelStatsDelegate pixelStatsDelegate = new PixelStatsDelegate();
            int u = serializer.u();
            for (int i = 0; i < u; i++) {
                String H = serializer.H();
                ArrayList j = serializer.j(PixelStats.CREATOR);
                if (j == null) {
                    j = new ArrayList();
                }
                pixelStatsDelegate.b.put(H, j);
            }
            pixelStatsDelegate.c = (PixelStats) serializer.G(PixelStats.class.getClassLoader());
            return pixelStatsDelegate;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixelStatsDelegate[i];
        }
    }

    @Override // xsna.dqa0
    public final void F7(PixelStats pixelStats) {
        String i;
        AdsItemBlockAdStatPixelDto.TypeDto typeDto = pixelStats.c;
        if (typeDto == null || (i = typeDto.i()) == null) {
            return;
        }
        final vsq vsqVar = new vsq(21);
        ((List) this.b.computeIfAbsent(i, new Function() { // from class: xsna.gqa0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Serializer.c<PixelStatsDelegate> cVar = PixelStatsDelegate.CREATOR;
                return (List) vsq.this.invoke(obj);
            }
        })).add(pixelStats);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        HashMap hashMap = this.b;
        serializer.S(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            serializer.j0((String) entry.getKey());
            serializer.o0((List) entry.getValue());
        }
        serializer.i0(this.c);
    }

    @Override // xsna.dqa0
    public final int b6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        List list = (List) this.b.get(typeDto.i());
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.dqa0
    public final List<PixelStats> u6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        List<PixelStats> list = (List) this.b.get(typeDto.i());
        return list == null ? EmptyList.b : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
