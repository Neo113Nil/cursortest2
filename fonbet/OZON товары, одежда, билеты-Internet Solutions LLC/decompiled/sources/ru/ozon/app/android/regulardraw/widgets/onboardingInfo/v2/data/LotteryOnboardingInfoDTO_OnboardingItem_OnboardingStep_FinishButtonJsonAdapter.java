package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data.LotteryOnboardingInfoDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO_OnboardingItem_OnboardingStep_FinishButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FinishButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FinishButton;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO$OnboardingItem$OnboardingStep$FinishButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "morkovskShadowButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableMorkovskShadowButtonDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LotteryOnboardingInfoDTO_OnboardingItem_OnboardingStep_FinishButtonJsonAdapter extends JsonAdapter<LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FinishButton> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<MorkovskShadowButtonDTO> morkovskShadowButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<MorkovskShadowButtonDTO> nullableMorkovskShadowButtonDTOAdapter;

    @NotNull
    private final n.a options;

    public LotteryOnboardingInfoDTO_OnboardingItem_OnboardingStep_FinishButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("defaultButton", "firstPresentationButton", "firstPresentationCompletedAction");
        M m11 = M.f71699a;
        this.morkovskShadowButtonDTOAdapter = moshi.f(MorkovskShadowButtonDTO.class, m11, "defaultButton");
        this.nullableMorkovskShadowButtonDTOAdapter = moshi.f(MorkovskShadowButtonDTO.class, m11, "firstPresentationButton");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "firstPresentationCompletedAction");
    }

    @NotNull
    public String toString() {
        return b.c(89, "GeneratedJsonAdapter(LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FinishButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FinishButton fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = null;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO2 = null;
        AtomActionDTO atomActionDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                morkovskShadowButtonDTO = this.morkovskShadowButtonDTOAdapter.fromJson(reader);
                if (morkovskShadowButtonDTO == null) {
                    throw c.q("defaultButton", "defaultButton", reader);
                }
            } else if (v11 == 1) {
                morkovskShadowButtonDTO2 = this.nullableMorkovskShadowButtonDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (morkovskShadowButtonDTO != null) {
            return new LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FinishButton(morkovskShadowButtonDTO, morkovskShadowButtonDTO2, atomActionDTO);
        }
        throw c.j("defaultButton", "defaultButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LotteryOnboardingInfoDTO.OnboardingItem.OnboardingStep.FinishButton value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("defaultButton");
        this.morkovskShadowButtonDTOAdapter.mo44toJson(writer, (x) value.getDefaultButton());
        writer.w("firstPresentationButton");
        this.nullableMorkovskShadowButtonDTOAdapter.mo44toJson(writer, (x) value.getFirstPresentationButton());
        writer.w("firstPresentationCompletedAction");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getFirstPresentationCompletedAction());
        writer.p();
    }
}
