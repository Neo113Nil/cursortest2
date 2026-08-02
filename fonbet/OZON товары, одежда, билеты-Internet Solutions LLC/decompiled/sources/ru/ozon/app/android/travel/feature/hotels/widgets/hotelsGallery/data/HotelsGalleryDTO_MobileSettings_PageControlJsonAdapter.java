package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO_MobileSettings_PageControlJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl$IndicatorType;", "indicatorTypeAtEnumNullFallbackAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryDTO_MobileSettings_PageControlJsonAdapter extends JsonAdapter<HotelsGalleryDTO.MobileSettings.PageControl> {
    public static final int $stable = 8;
    private volatile Constructor<HotelsGalleryDTO.MobileSettings.PageControl> constructorRef;

    @NotNull
    private final JsonAdapter<HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType> indicatorTypeAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    public HotelsGalleryDTO_MobileSettings_PageControlJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("indicatorType");
        this.indicatorTypeAtEnumNullFallbackAdapter = moshi.f(HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO_MobileSettings_PageControlJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "indicatorType");
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(HotelsGalleryDTO.MobileSettings.PageControl)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsGalleryDTO.MobileSettings.PageControl fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType indicatorType = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                indicatorType = this.indicatorTypeAtEnumNullFallbackAdapter.fromJson(reader);
                if (indicatorType == null) {
                    throw c.q("indicatorType", "indicatorType", reader);
                }
                i11 = -2;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(indicatorType, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType");
            return new HotelsGalleryDTO.MobileSettings.PageControl(indicatorType);
        }
        Constructor<HotelsGalleryDTO.MobileSettings.PageControl> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsGalleryDTO.MobileSettings.PageControl.class.getDeclaredConstructor(HotelsGalleryDTO.MobileSettings.PageControl.IndicatorType.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        HotelsGalleryDTO.MobileSettings.PageControl newInstance = constructor.newInstance(indicatorType, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsGalleryDTO.MobileSettings.PageControl value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("indicatorType");
        this.indicatorTypeAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getIndicatorType());
        writer.p();
    }
}
