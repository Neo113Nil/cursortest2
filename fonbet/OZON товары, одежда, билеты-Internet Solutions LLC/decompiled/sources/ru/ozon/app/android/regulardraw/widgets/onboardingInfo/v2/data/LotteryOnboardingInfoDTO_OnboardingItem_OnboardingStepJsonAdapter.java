package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data;

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
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data.LotteryOnboardingInfoDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO_OnboardingItem_OnboardingStepJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$StepType;", "stepTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$CloseButton;", "closeButtonAdapter", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FooterContentWrapper;", "nullableFooterContentWrapperAdapter", "", "booleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryOnboardingInfoDTO_OnboardingItem_OnboardingStepJsonAdapter extends JsonAdapter<LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.CloseButton> closeButtonAdapter;
    private volatile Constructor<LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep> constructorRef;

    @NotNull
    private final JsonAdapter<LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FooterContentWrapper> nullableFooterContentWrapperAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType> stepTypeAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public LotteryOnboardingInfoDTO_OnboardingItem_OnboardingStepJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("stepType", "image", "closeButton", "footerContent", "isSkipable", "trackingInfo");
        M m11 = M.f71699a;
        this.stepTypeAdapter = moshi.f(LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType.class, m11, "stepType");
        this.stringAdapter = moshi.f(String.class, m11, "image");
        this.closeButtonAdapter = moshi.f(LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.CloseButton.class, m11, "closeButton");
        this.nullableFooterContentWrapperAdapter = moshi.f(LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FooterContentWrapper.class, m11, "footerContent");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSkipable");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(76, "GeneratedJsonAdapter(LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        String str = null;
        Boolean bool2 = bool;
        LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType = null;
        LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FooterContentWrapper footerContentWrapper = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.CloseButton closeButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    stepType = this.stepTypeAdapter.fromJson(reader);
                    if (stepType == null) {
                        throw c.q("stepType", "stepType", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 2:
                    closeButton = this.closeButtonAdapter.fromJson(reader);
                    if (closeButton == null) {
                        throw c.q("closeButton", "closeButton", reader);
                    }
                    break;
                case 3:
                    footerContentWrapper = this.nullableFooterContentWrapperAdapter.fromJson(reader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSkipable", "isSkipable", reader);
                    }
                    i11 = -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            if (stepType == null) {
                throw c.j("stepType", "stepType", reader);
            }
            if (str == null) {
                throw c.j("image", "image", reader);
            }
            if (closeButton != null) {
                return new LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep(stepType, str, closeButton, footerContentWrapper, bool2.booleanValue(), map);
            }
            throw c.j("closeButton", "closeButton", reader);
        }
        Constructor<LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.class.getDeclaredConstructor(LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType.class, String.class, LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.CloseButton.class, LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FooterContentWrapper.class, Boolean.TYPE, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (stepType == null) {
            throw c.j("stepType", "stepType", reader);
        }
        if (str == null) {
            throw c.j("image", "image", reader);
        }
        if (closeButton == null) {
            throw c.j("closeButton", "closeButton", reader);
        }
        LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.StepType stepType2 = stepType;
        LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep newInstance = constructor.newInstance(stepType2, str, closeButton, footerContentWrapper, bool2, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("stepType");
        this.stepTypeAdapter.mo44toJson(writer, (x) value.getStepType());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("closeButton");
        this.closeButtonAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("footerContent");
        this.nullableFooterContentWrapperAdapter.mo44toJson(writer, (x) value.getFooterContent());
        writer.w("isSkipable");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSkipable()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
