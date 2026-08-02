package com.vk.dto.discover.carousel.apps;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonActionTypeDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.discover.carousel.Carousel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AppCarousel.kt */
/* loaded from: classes18.dex */
public final class AppCarousel extends Carousel<AppCarouselItem> {
    public static final Serializer.c<AppCarousel> CREATOR = new b();
    public List<AppCarouselItem> o;
    public final LinkedHashSet p;
    public final LinkedHashSet q;
    public String r;

    /* compiled from: AppCarousel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverCarouselButtonActionTypeDto.values().length];
            try {
                iArr[DiscoverCarouselButtonActionTypeDto.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverCarouselButtonActionTypeDto.OPEN_VKAPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscoverCarouselButtonActionTypeDto.OPEN_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AppCarousel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AppCarousel a(Serializer serializer) {
            return new AppCarousel(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppCarousel[i];
        }
    }

    public AppCarousel(LinkButton linkButton, String str, String str2, String str3, int i, String str4, List<AppCarouselItem> list) {
        super(linkButton, str, str2, str3, i, str4);
        this.o = EmptyList.b;
        this.p = new LinkedHashSet();
        this.q = new LinkedHashSet();
        this.o = list;
    }

    @Override // com.vk.dto.discover.carousel.Carousel, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.o);
    }

    @Override // com.vk.dto.discover.carousel.Carousel
    public final List<AppCarouselItem> getItems() {
        return this.o;
    }

    @Override // com.vk.dto.discover.carousel.Carousel, xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List<com.vk.dto.discover.carousel.apps.AppCarouselItem>] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public AppCarousel(JSONObject jSONObject, int i, String str) {
        super(jSONObject, i, str);
        ?? r9;
        this.o = EmptyList.b;
        this.p = new LinkedHashSet();
        this.q = new LinkedHashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("objects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                optJSONArray.getJSONObject(i2).put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, optJSONArray2 != null ? optJSONArray2.get(i2) : null);
            }
        }
        if (optJSONArray != null) {
            r9 = new ArrayList(optJSONArray.length());
            int length2 = optJSONArray.length();
            for (int i3 = 0; i3 < length2; i3++) {
                r9.add(new AppCarouselItem(optJSONArray.getJSONObject(i3)));
            }
        } else {
            r9 = EmptyList.b;
        }
        this.o = r9;
        this.e = jSONObject.optBoolean("is_async");
    }

    public AppCarousel(Serializer serializer) {
        super(serializer);
        List list = EmptyList.b;
        this.o = list;
        this.p = new LinkedHashSet();
        this.q = new LinkedHashSet();
        List k = serializer.k(AppCarouselItem.class);
        this.o = k != null ? k : list;
    }
}
