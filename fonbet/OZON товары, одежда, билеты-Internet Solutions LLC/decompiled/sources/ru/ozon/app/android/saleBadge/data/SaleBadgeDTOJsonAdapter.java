package ru.ozon.app.android.saleBadge.data;

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
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.saleBadge.data.SaleBadgeDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/saleBadge/data/SaleBadgeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Timer;", "nullableTimerAdapter", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BadgeSize;", "badgeSizeAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "nullableCommonAtomIconDTOAdapter", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Background;", "backgroundAdapter", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$BackgroundOverlay;", "nullableBackgroundOverlayAdapter", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$Common;", "nullableCommonAdapter", "Lru/ozon/app/android/saleBadge/data/SaleBadgeDTO$AnimationFrames;", "nullableAnimationFramesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaleBadgeDTOJsonAdapter extends JsonAdapter<SaleBadgeDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<SaleBadgeDTO.Background> backgroundAdapter;

    @NotNull
    private final JsonAdapter<SaleBadgeDTO.BadgeSize> badgeSizeAdapter;
    private volatile Constructor<SaleBadgeDTO> constructorRef;

    @NotNull
    private final JsonAdapter<SaleBadgeDTO.AnimationFrames> nullableAnimationFramesAdapter;

    @NotNull
    private final JsonAdapter<SaleBadgeDTO.BackgroundOverlay> nullableBackgroundOverlayAdapter;

    @NotNull
    private final JsonAdapter<SaleBadgeDTO.Common> nullableCommonAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> nullableCommonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<SaleBadgeDTO.Timer> nullableTimerAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SaleBadgeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "textColor", DynamicElementDTO.TIMER, "size", "leftIcon", "rightIcon", "background", "backgroundOverlay", "common", "animationFrames");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "text");
        this.nullableTimerAdapter = moshi.f(SaleBadgeDTO.Timer.class, m11, DynamicElementDTO.TIMER);
        this.badgeSizeAdapter = moshi.f(SaleBadgeDTO.BadgeSize.class, m11, "size");
        this.nullableCommonAtomIconDTOAdapter = moshi.f(CommonAtomIconDTO.class, m11, "leftIcon");
        this.backgroundAdapter = moshi.f(SaleBadgeDTO.Background.class, m11, "background");
        this.nullableBackgroundOverlayAdapter = moshi.f(SaleBadgeDTO.BackgroundOverlay.class, m11, "backgroundOverlay");
        this.nullableCommonAdapter = moshi.f(SaleBadgeDTO.Common.class, m11, "common");
        this.nullableAnimationFramesAdapter = moshi.f(SaleBadgeDTO.AnimationFrames.class, m11, "animationFrames");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(SaleBadgeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SaleBadgeDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        SaleBadgeDTO.Timer timer = null;
        SaleBadgeDTO.BadgeSize badgeSize = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        CommonAtomIconDTO commonAtomIconDTO2 = null;
        SaleBadgeDTO.Background background = null;
        SaleBadgeDTO.BackgroundOverlay backgroundOverlay = null;
        SaleBadgeDTO.Common common = null;
        SaleBadgeDTO.AnimationFrames animationFrames = null;
        while (reader.hasNext()) {
            String str3 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("text", "text", reader);
                    }
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("textColor", "textColor", reader);
                    }
                    break;
                case 2:
                    timer = this.nullableTimerAdapter.fromJson(reader);
                    break;
                case 3:
                    badgeSize = this.badgeSizeAdapter.fromJson(reader);
                    if (badgeSize == null) {
                        throw c.q("size", "size", reader);
                    }
                    str = str3;
                    i12 = -9;
                    continue;
                case 4:
                    commonAtomIconDTO = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    commonAtomIconDTO2 = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    background = this.backgroundAdapter.fromJson(reader);
                    if (background == null) {
                        throw c.q("background", "background", reader);
                    }
                    break;
                case 7:
                    backgroundOverlay = this.nullableBackgroundOverlayAdapter.fromJson(reader);
                    break;
                case 8:
                    common = this.nullableCommonAdapter.fromJson(reader);
                    break;
                case 9:
                    animationFrames = this.nullableAnimationFramesAdapter.fromJson(reader);
                    break;
            }
            str = str3;
        }
        String str4 = str;
        reader.endObject();
        if (i12 == -9) {
            if (str4 == null) {
                throw c.j("text", "text", reader);
            }
            if (str2 == null) {
                throw c.j("textColor", "textColor", reader);
            }
            Intrinsics.g(badgeSize, "null cannot be cast to non-null type ru.ozon.app.android.saleBadge.data.SaleBadgeDTO.BadgeSize");
            if (background == null) {
                throw c.j("background", "background", reader);
            }
            SaleBadgeDTO.Common common2 = common;
            SaleBadgeDTO.BackgroundOverlay backgroundOverlay2 = backgroundOverlay;
            SaleBadgeDTO.Background background2 = background;
            CommonAtomIconDTO commonAtomIconDTO3 = commonAtomIconDTO2;
            CommonAtomIconDTO commonAtomIconDTO4 = commonAtomIconDTO;
            return new SaleBadgeDTO(str4, str2, timer, badgeSize, commonAtomIconDTO4, commonAtomIconDTO3, background2, backgroundOverlay2, common2, animationFrames);
        }
        Constructor<SaleBadgeDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = SaleBadgeDTO.class.getDeclaredConstructor(String.class, String.class, SaleBadgeDTO.Timer.class, SaleBadgeDTO.BadgeSize.class, CommonAtomIconDTO.class, CommonAtomIconDTO.class, SaleBadgeDTO.Background.class, SaleBadgeDTO.BackgroundOverlay.class, SaleBadgeDTO.Common.class, SaleBadgeDTO.AnimationFrames.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<SaleBadgeDTO> constructor2 = constructor;
        if (str4 == null) {
            throw c.j("text", "text", reader);
        }
        if (str2 == null) {
            throw c.j("textColor", "textColor", reader);
        }
        if (background == null) {
            throw c.j("background", "background", reader);
        }
        SaleBadgeDTO newInstance = constructor2.newInstance(str4, str2, timer, badgeSize, commonAtomIconDTO, commonAtomIconDTO2, background, backgroundOverlay, common, animationFrames, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SaleBadgeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.stringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("textColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("size");
        this.badgeSizeAdapter.mo44toJson(writer, (x) value.getSize());
        writer.w("leftIcon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value.getLeftIcon());
        writer.w("rightIcon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value.getRightIcon());
        writer.w("background");
        this.backgroundAdapter.mo44toJson(writer, (x) value.getBackground());
        writer.w("backgroundOverlay");
        this.nullableBackgroundOverlayAdapter.mo44toJson(writer, (x) value.getBackgroundOverlay());
        writer.w("common");
        this.nullableCommonAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("animationFrames");
        this.nullableAnimationFramesAdapter.mo44toJson(writer, (x) value.getAnimationFrames());
        writer.p();
    }
}
