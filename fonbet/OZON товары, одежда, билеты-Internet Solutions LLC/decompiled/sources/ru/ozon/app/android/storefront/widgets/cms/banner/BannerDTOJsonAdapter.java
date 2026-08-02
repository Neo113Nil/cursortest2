package ru.ozon.app.android.storefront.widgets.cms.banner;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselItemDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItemDTO;", "bannerCarouselItemDTOAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BannerDTOJsonAdapter extends JsonAdapter<BannerDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BannerCarouselItemDTO> bannerCarouselItemDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BannerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    public BannerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("width", "height", "item", "isRounded", "disableVerticalMargins");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "width");
        this.bannerCarouselItemDTOAdapter = moshi.f(BannerCarouselItemDTO.class, m11, "item");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isRounded");
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(BannerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BannerDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Integer num = null;
        Integer num2 = null;
        BannerCarouselItemDTO bannerCarouselItemDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("width", "width", reader);
                }
            } else if (v11 == 1) {
                num2 = this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw c.q("height", "height", reader);
                }
            } else if (v11 == 2) {
                bannerCarouselItemDTO = this.bannerCarouselItemDTOAdapter.fromJson(reader);
                if (bannerCarouselItemDTO == null) {
                    throw c.q("item", "item", reader);
                }
            } else if (v11 == 3) {
                bool2 = this.booleanAdapter.fromJson(reader);
                if (bool2 == null) {
                    throw c.q("isRounded", "isRounded", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                bool3 = this.booleanAdapter.fromJson(reader);
                if (bool3 == null) {
                    throw c.q("disableVerticalMargins", "disableVerticalMargins", reader);
                }
                i11 &= -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -25) {
            if (num == null) {
                throw c.j("width", "width", reader);
            }
            int intValue = num.intValue();
            if (num2 == null) {
                throw c.j("height", "height", reader);
            }
            int intValue2 = num2.intValue();
            if (bannerCarouselItemDTO == null) {
                throw c.j("item", "item", reader);
            }
            return new BannerDTO(intValue, intValue2, bannerCarouselItemDTO, bool2.booleanValue(), bool3.booleanValue());
        }
        Constructor<BannerDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            constructor = BannerDTO.class.getDeclaredConstructor(cls2, cls2, BannerCarouselItemDTO.class, cls3, cls3, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<BannerDTO> constructor2 = constructor;
        if (num == null) {
            throw c.j("width", "width", reader);
        }
        if (num2 == null) {
            throw c.j("height", "height", reader);
        }
        if (bannerCarouselItemDTO == null) {
            throw c.j("item", "item", reader);
        }
        BannerDTO newInstance = constructor2.newInstance(num, num2, bannerCarouselItemDTO, bool2, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BannerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("width");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getWidth()));
        writer.w("height");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getHeight()));
        writer.w("item");
        this.bannerCarouselItemDTOAdapter.mo44toJson(writer, (x) value.getItem());
        writer.w("isRounded");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isRounded()));
        writer.w("disableVerticalMargins");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getDisableVerticalMargins()));
        writer.p();
    }
}
