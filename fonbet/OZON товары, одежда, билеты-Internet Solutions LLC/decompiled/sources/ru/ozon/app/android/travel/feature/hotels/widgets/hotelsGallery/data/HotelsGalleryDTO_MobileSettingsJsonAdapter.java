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
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO_MobileSettingsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/data/HotelsGalleryDTO$MobileSettings$PageControl;", "pageControlAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryDTO_MobileSettingsJsonAdapter extends JsonAdapter<HotelsGalleryDTO.MobileSettings> {
    public static final int $stable = 8;
    private volatile Constructor<HotelsGalleryDTO.MobileSettings> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    @NotNull
    private final JsonAdapter<HotelsGalleryDTO.MobileSettings.PageControl> pageControlAdapter;

    public HotelsGalleryDTO_MobileSettingsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "islandRadius", "islandTopPadding", "islandBackgroundColor", "aspectRatio", "pageControl", "badge", "hotelsGalleryFeedAction");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.cornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "islandRadius");
        this.paddingsAdapter = moshi.f(Paddings.class, m11, "islandTopPadding");
        this.pageControlAdapter = moshi.f(HotelsGalleryDTO.MobileSettings.PageControl.class, m11, "pageControl");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "hotelsGalleryFeedAction");
    }

    @NotNull
    public String toString() {
        return b.c(53, "GeneratedJsonAdapter(HotelsGalleryDTO.MobileSettings)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsGalleryDTO.MobileSettings fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        CornerRadius cornerRadius = null;
        Paddings paddings = null;
        String str2 = null;
        String str3 = null;
        HotelsGalleryDTO.MobileSettings.PageControl pageControl = null;
        BadgeDTO badgeDTO = null;
        AtomActionDTO atomActionDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("islandRadius", "islandRadius", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    paddings = this.paddingsAdapter.fromJson(reader);
                    if (paddings == null) {
                        throw c.q("islandTopPadding", "islandTopPadding", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    pageControl = this.pageControlAdapter.fromJson(reader);
                    if (pageControl == null) {
                        throw c.q("pageControl", "pageControl", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -39) {
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(pageControl, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.data.HotelsGalleryDTO.MobileSettings.PageControl");
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            BadgeDTO badgeDTO2 = badgeDTO;
            HotelsGalleryDTO.MobileSettings.PageControl pageControl2 = pageControl;
            String str4 = str3;
            return new HotelsGalleryDTO.MobileSettings(str, cornerRadius, paddings, str2, str4, pageControl2, badgeDTO2, atomActionDTO2);
        }
        String str5 = str;
        Constructor<HotelsGalleryDTO.MobileSettings> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HotelsGalleryDTO.MobileSettings.class.getDeclaredConstructor(String.class, CornerRadius.class, Paddings.class, String.class, String.class, HotelsGalleryDTO.MobileSettings.PageControl.class, BadgeDTO.class, AtomActionDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        HotelsGalleryDTO.MobileSettings newInstance = constructor.newInstance(str5, cornerRadius, paddings, str2, str3, pageControl, badgeDTO, atomActionDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsGalleryDTO.MobileSettings value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("islandRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value.getIslandRadius());
        writer.w("islandTopPadding");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getIslandTopPadding());
        writer.w("islandBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIslandBackgroundColor());
        writer.w("aspectRatio");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getAspectRatio());
        writer.w("pageControl");
        this.pageControlAdapter.mo44toJson(writer, (x) value.getPageControl());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("hotelsGalleryFeedAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getHotelsGalleryFeedAction());
        writer.p();
    }
}
