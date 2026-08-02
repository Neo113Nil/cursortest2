package ru.ozon.app.android.composer.widgets.v2.onboarding.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "imageTitleSubtitleCellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "iconButtonDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO$Options;", "nullableOptionsAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnBoardingDTOJsonAdapter extends JsonAdapter<OnBoardingDTO> {
    public static final int $stable = 8;
    private volatile Constructor<OnBoardingDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconButtonDTO> iconButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageTitleSubtitleCellDTO> imageTitleSubtitleCellDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO.Options> nullableOptionsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public OnBoardingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("banner", "closeButton", "trackingInfo", "testInfo", "options", "onboardingKey");
        M m11 = M.f71699a;
        this.imageTitleSubtitleCellDTOAdapter = moshi.f(ImageTitleSubtitleCellDTO.class, m11, "banner");
        this.iconButtonDTOAdapter = moshi.f(IconButtonDTO.class, m11, "closeButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.nullableOptionsAdapter = moshi.f(OnBoardingDTO.Options.class, m11, "options");
        this.nullableStringAdapter = moshi.f(String.class, m11, "onboardingKey");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(OnBoardingDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OnBoardingDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO = null;
        IconButtonDTO iconButtonDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TestInfo testInfo = null;
        OnBoardingDTO.Options options = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageTitleSubtitleCellDTO = this.imageTitleSubtitleCellDTOAdapter.fromJson(reader);
                    if (imageTitleSubtitleCellDTO == null) {
                        throw c.q("banner", "banner", reader);
                    }
                    break;
                case 1:
                    iconButtonDTO = this.iconButtonDTOAdapter.fromJson(reader);
                    if (iconButtonDTO == null) {
                        throw c.q("closeButton", "closeButton", reader);
                    }
                    break;
                case 2:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 3:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    break;
                case 4:
                    options = this.nullableOptionsAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 = -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -33) {
            String str2 = str;
            OnBoardingDTO.Options options2 = options;
            TestInfo testInfo2 = testInfo;
            Map<String, TokenizedTrackingInfo> map2 = map;
            IconButtonDTO iconButtonDTO2 = iconButtonDTO;
            ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO2 = imageTitleSubtitleCellDTO;
            if (imageTitleSubtitleCellDTO2 == null) {
                throw c.j("banner", "banner", reader);
            }
            if (iconButtonDTO2 != null) {
                return new OnBoardingDTO(imageTitleSubtitleCellDTO2, iconButtonDTO2, map2, testInfo2, options2, str2);
            }
            throw c.j("closeButton", "closeButton", reader);
        }
        String str3 = str;
        OnBoardingDTO.Options options3 = options;
        TestInfo testInfo3 = testInfo;
        Map<String, TokenizedTrackingInfo> map3 = map;
        IconButtonDTO iconButtonDTO3 = iconButtonDTO;
        ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO3 = imageTitleSubtitleCellDTO;
        Constructor<OnBoardingDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OnBoardingDTO.class.getDeclaredConstructor(ImageTitleSubtitleCellDTO.class, IconButtonDTO.class, Map.class, TestInfo.class, OnBoardingDTO.Options.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (imageTitleSubtitleCellDTO3 == null) {
            throw c.j("banner", "banner", reader);
        }
        if (iconButtonDTO3 == null) {
            throw c.j("closeButton", "closeButton", reader);
        }
        OnBoardingDTO newInstance = constructor.newInstance(imageTitleSubtitleCellDTO3, iconButtonDTO3, map3, testInfo3, options3, str3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OnBoardingDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("banner");
        this.imageTitleSubtitleCellDTOAdapter.mo44toJson(writer, (x) value.getBanner());
        writer.w("closeButton");
        this.iconButtonDTOAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("options");
        this.nullableOptionsAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.w("onboardingKey");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOnboardingKey());
        writer.p();
    }
}
