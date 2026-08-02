package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import B90.C2619v;
import Sc.o;
import Tz.C4055a;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#BA\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0001H\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BasePlaceholderWidgetObject;", "blocks", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "json", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getBlocks", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getJson", "setJson", "(Ljava/lang/String;)V", "copyExcludingAnalytics", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Block", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UgcCountersDTO extends BasePlaceholderWidgetObject {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<Block> blocks;
    private String json;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;", "", "<init>", "()V", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Single", "Double", "Image", "Expanding", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Double;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Image;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Block {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Double;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;", "firstBlock", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;", "secondBlock", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getFirstBlock", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;", "getSecondBlock", "getTrackingInfo", "()Ljava/util/Map;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Double extends Block {
            public static final int $stable = 8;

            @NotNull
            private final Single firstBlock;
            private final OnBoardingDTO onboarding;

            @NotNull
            private final Single secondBlock;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Double(@NotNull Single firstBlock, @NotNull Single secondBlock, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO) {
                super(null);
                Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
                Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
                this.firstBlock = firstBlock;
                this.secondBlock = secondBlock;
                this.trackingInfo = map;
                this.onboarding = onBoardingDTO;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Double copy$default(Double r02, Single single, Single single2, Map map, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    single = r02.firstBlock;
                }
                if ((i11 & 2) != 0) {
                    single2 = r02.secondBlock;
                }
                if ((i11 & 4) != 0) {
                    map = r02.trackingInfo;
                }
                if ((i11 & 8) != 0) {
                    onBoardingDTO = r02.onboarding;
                }
                return r02.copy(single, single2, map, onBoardingDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Single getFirstBlock() {
                return this.firstBlock;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Single getSecondBlock() {
                return this.secondBlock;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            /* renamed from: component4, reason: from getter */
            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @NotNull
            public final Double copy(@NotNull Single firstBlock, @NotNull Single secondBlock, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboarding) {
                Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
                Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
                return new Double(firstBlock, secondBlock, trackingInfo, onboarding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Double)) {
                    return false;
                }
                Double r52 = (Double) other;
                return Intrinsics.d(this.firstBlock, r52.firstBlock) && Intrinsics.d(this.secondBlock, r52.secondBlock) && Intrinsics.d(this.trackingInfo, r52.trackingInfo) && Intrinsics.d(this.onboarding, r52.onboarding);
            }

            @NotNull
            public final Single getFirstBlock() {
                return this.firstBlock;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO.Block
            public OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @NotNull
            public final Single getSecondBlock() {
                return this.secondBlock;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = (this.secondBlock.hashCode() + (this.firstBlock.hashCode() * 31)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                return hashCode2 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Double(firstBlock=" + this.firstBlock + ", secondBlock=" + this.secondBlock + ", trackingInfo=" + this.trackingInfo + ", onboarding=" + this.onboarding + ")";
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00018Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u007f\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "alignment", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding$Alignment;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding$Alignment;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getAlignment", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding$Alignment;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Alignment", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Expanding extends Block {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final Alignment alignment;
            private final String backgroundColor;
            private final CornerRadius cornerRadius;
            private final IconDTO icon;
            private final OnBoardingDTO onboarding;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGNMENT_INVALID", "LEFT", "CENTER", "RIGHT", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Alignment {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Alignment[] $VALUES;
                public static final Alignment ALIGNMENT_INVALID = new Alignment("ALIGNMENT_INVALID", 0);
                public static final Alignment LEFT = new Alignment("LEFT", 1);
                public static final Alignment CENTER = new Alignment("CENTER", 2);
                public static final Alignment RIGHT = new Alignment("RIGHT", 3);

                private static final /* synthetic */ Alignment[] $values() {
                    return new Alignment[]{ALIGNMENT_INVALID, LEFT, CENTER, RIGHT};
                }

                static {
                    Alignment[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private Alignment(String str, int i11) {
                }

                public static Alignment valueOf(String str) {
                    return (Alignment) Enum.valueOf(Alignment.class, str);
                }

                public static Alignment[] values() {
                    return (Alignment[]) $VALUES.clone();
                }
            }

            public /* synthetic */ Expanding(IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, String str, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, Alignment alignment, OnBoardingDTO onBoardingDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(iconDTO, textDTO, textDTO2, str, atomActionDTO, map, cornerRadius, alignment, (i11 & 256) != 0 ? null : onBoardingDTO);
            }

            public static /* synthetic */ Expanding copy$default(Expanding expanding, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, String str, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, Alignment alignment, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = expanding.icon;
                }
                if ((i11 & 2) != 0) {
                    textDTO = expanding.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = expanding.subtitle;
                }
                if ((i11 & 8) != 0) {
                    str = expanding.backgroundColor;
                }
                if ((i11 & 16) != 0) {
                    atomActionDTO = expanding.action;
                }
                if ((i11 & 32) != 0) {
                    map = expanding.trackingInfo;
                }
                if ((i11 & 64) != 0) {
                    cornerRadius = expanding.cornerRadius;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    alignment = expanding.alignment;
                }
                if ((i11 & 256) != 0) {
                    onBoardingDTO = expanding.onboarding;
                }
                Alignment alignment2 = alignment;
                OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
                Map map2 = map;
                CornerRadius cornerRadius2 = cornerRadius;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                TextDTO textDTO3 = textDTO2;
                return expanding.copy(iconDTO, textDTO, textDTO3, str, atomActionDTO2, map2, cornerRadius2, alignment2, onBoardingDTO2);
            }

            /* renamed from: component1, reason: from getter */
            public final IconDTO getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component5, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            /* renamed from: component7, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            /* renamed from: component8, reason: from getter */
            public final Alignment getAlignment() {
                return this.alignment;
            }

            /* renamed from: component9, reason: from getter */
            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @NotNull
            public final Expanding copy(IconDTO icon, @NotNull TextDTO title, TextDTO subtitle, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, CornerRadius cornerRadius, Alignment alignment, OnBoardingDTO onboarding) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Expanding(icon, title, subtitle, backgroundColor, action, trackingInfo, cornerRadius, alignment, onboarding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Expanding)) {
                    return false;
                }
                Expanding expanding = (Expanding) other;
                return Intrinsics.d(this.icon, expanding.icon) && Intrinsics.d(this.title, expanding.title) && Intrinsics.d(this.subtitle, expanding.subtitle) && Intrinsics.d(this.backgroundColor, expanding.backgroundColor) && Intrinsics.d(this.action, expanding.action) && Intrinsics.d(this.trackingInfo, expanding.trackingInfo) && this.cornerRadius == expanding.cornerRadius && this.alignment == expanding.alignment && Intrinsics.d(this.onboarding, expanding.onboarding);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Alignment getAlignment() {
                return this.alignment;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO.Block
            public OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                IconDTO iconDTO = this.icon;
                int a11 = Ns.b.a(this.title, (iconDTO == null ? 0 : iconDTO.hashCode()) * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                String str = this.backgroundColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
                Alignment alignment = this.alignment;
                int hashCode6 = (hashCode5 + (alignment == null ? 0 : alignment.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                return hashCode6 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                IconDTO iconDTO = this.icon;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                String str = this.backgroundColor;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                CornerRadius cornerRadius = this.cornerRadius;
                Alignment alignment = this.alignment;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                StringBuilder i11 = Bi.b.i("Expanding(icon=", ", title=", ", subtitle=", iconDTO, textDTO);
                i11.append(textDTO2);
                i11.append(", backgroundColor=");
                i11.append(str);
                i11.append(", action=");
                Sh.b.f(i11, atomActionDTO, ", trackingInfo=", map, ", cornerRadius=");
                i11.append(cornerRadius);
                i11.append(", alignment=");
                i11.append(alignment);
                i11.append(", onboarding=");
                i11.append(onBoardingDTO);
                i11.append(")");
                return i11.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Expanding(IconDTO iconDTO, @NotNull TextDTO title, TextDTO textDTO, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, CornerRadius cornerRadius, Alignment alignment, OnBoardingDTO onBoardingDTO) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.icon = iconDTO;
                this.title = title;
                this.subtitle = textDTO;
                this.backgroundColor = str;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.cornerRadius = cornerRadius;
                this.alignment = alignment;
                this.onboarding = onBoardingDTO;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jm\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Image;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;", "urls", "", "", "label", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getUrls", "()Ljava/util/List;", "getLabel", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends Block {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final CornerRadius cornerRadius;
            private final TextAtom label;
            private final OnBoardingDTO onboarding;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final List<String> urls;
            private final PreloadVideoInfo videoInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull List<String> urls, TextAtom textAtom, AtomActionDTO atomActionDTO, OnBoardingDTO onBoardingDTO, Map<String, TokenizedTrackingInfo> map, PreloadVideoInfo preloadVideoInfo, CornerRadius cornerRadius) {
                super(null);
                Intrinsics.checkNotNullParameter(urls, "urls");
                this.urls = urls;
                this.label = textAtom;
                this.action = atomActionDTO;
                this.onboarding = onBoardingDTO;
                this.trackingInfo = map;
                this.videoInfo = preloadVideoInfo;
                this.cornerRadius = cornerRadius;
            }

            public static /* synthetic */ Image copy$default(Image image, List list, TextAtom textAtom, AtomActionDTO atomActionDTO, OnBoardingDTO onBoardingDTO, Map map, PreloadVideoInfo preloadVideoInfo, CornerRadius cornerRadius, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = image.urls;
                }
                if ((i11 & 2) != 0) {
                    textAtom = image.label;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO = image.action;
                }
                if ((i11 & 8) != 0) {
                    onBoardingDTO = image.onboarding;
                }
                if ((i11 & 16) != 0) {
                    map = image.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    preloadVideoInfo = image.videoInfo;
                }
                if ((i11 & 64) != 0) {
                    cornerRadius = image.cornerRadius;
                }
                PreloadVideoInfo preloadVideoInfo2 = preloadVideoInfo;
                CornerRadius cornerRadius2 = cornerRadius;
                Map map2 = map;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                return image.copy(list, textAtom, atomActionDTO2, onBoardingDTO, map2, preloadVideoInfo2, cornerRadius2);
            }

            @NotNull
            public final List<String> component1() {
                return this.urls;
            }

            /* renamed from: component2, reason: from getter */
            public final TextAtom getLabel() {
                return this.label;
            }

            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component4, reason: from getter */
            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            /* renamed from: component6, reason: from getter */
            public final PreloadVideoInfo getVideoInfo() {
                return this.videoInfo;
            }

            /* renamed from: component7, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final Image copy(@NotNull List<String> urls, TextAtom label, AtomActionDTO action, OnBoardingDTO onboarding, Map<String, TokenizedTrackingInfo> trackingInfo, PreloadVideoInfo videoInfo, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(urls, "urls");
                return new Image(urls, label, action, onboarding, trackingInfo, videoInfo, cornerRadius);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.urls, image.urls) && Intrinsics.d(this.label, image.label) && Intrinsics.d(this.action, image.action) && Intrinsics.d(this.onboarding, image.onboarding) && Intrinsics.d(this.trackingInfo, image.trackingInfo) && Intrinsics.d(this.videoInfo, image.videoInfo) && this.cornerRadius == image.cornerRadius;
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final TextAtom getLabel() {
                return this.label;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO.Block
            public OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final List<String> getUrls() {
                return this.urls;
            }

            public final PreloadVideoInfo getVideoInfo() {
                return this.videoInfo;
            }

            public int hashCode() {
                int hashCode = this.urls.hashCode() * 31;
                TextAtom textAtom = this.label;
                int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                int hashCode4 = (hashCode3 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                int hashCode6 = (hashCode5 + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                return hashCode6 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Image(urls=" + this.urls + ", label=" + this.label + ", action=" + this.action + ", onboarding=" + this.onboarding + ", trackingInfo=" + this.trackingInfo + ", videoInfo=" + this.videoInfo + ", cornerRadius=" + this.cornerRadius + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Js\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Single;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block;", "icon", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getIcon", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Single extends Block {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final String backgroundColor;
            private final CornerRadius cornerRadius;
            private final OverlayIcon icon;
            private final OnBoardingDTO onboarding;

            @NotNull
            private final TextAtom subtitle;
            private final TextAtom title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Single(OverlayIcon overlayIcon, TextAtom textAtom, @NotNull TextAtom subtitle, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO, CornerRadius cornerRadius) {
                super(null);
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.icon = overlayIcon;
                this.title = textAtom;
                this.subtitle = subtitle;
                this.backgroundColor = str;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.onboarding = onBoardingDTO;
                this.cornerRadius = cornerRadius;
            }

            public static /* synthetic */ Single copy$default(Single single, OverlayIcon overlayIcon, TextAtom textAtom, TextAtom textAtom2, String str, AtomActionDTO atomActionDTO, Map map, OnBoardingDTO onBoardingDTO, CornerRadius cornerRadius, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    overlayIcon = single.icon;
                }
                if ((i11 & 2) != 0) {
                    textAtom = single.title;
                }
                if ((i11 & 4) != 0) {
                    textAtom2 = single.subtitle;
                }
                if ((i11 & 8) != 0) {
                    str = single.backgroundColor;
                }
                if ((i11 & 16) != 0) {
                    atomActionDTO = single.action;
                }
                if ((i11 & 32) != 0) {
                    map = single.trackingInfo;
                }
                if ((i11 & 64) != 0) {
                    onBoardingDTO = single.onboarding;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    cornerRadius = single.cornerRadius;
                }
                OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
                CornerRadius cornerRadius2 = cornerRadius;
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                Map map2 = map;
                return single.copy(overlayIcon, textAtom, textAtom2, str, atomActionDTO2, map2, onBoardingDTO2, cornerRadius2);
            }

            /* renamed from: component1, reason: from getter */
            public final OverlayIcon getIcon() {
                return this.icon;
            }

            /* renamed from: component2, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component5, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            /* renamed from: component7, reason: from getter */
            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            /* renamed from: component8, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final Single copy(OverlayIcon icon, TextAtom title, @NotNull TextAtom subtitle, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboarding, CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new Single(icon, title, subtitle, backgroundColor, action, trackingInfo, onboarding, cornerRadius);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Single)) {
                    return false;
                }
                Single single = (Single) other;
                return Intrinsics.d(this.icon, single.icon) && Intrinsics.d(this.title, single.title) && Intrinsics.d(this.subtitle, single.subtitle) && Intrinsics.d(this.backgroundColor, single.backgroundColor) && Intrinsics.d(this.action, single.action) && Intrinsics.d(this.trackingInfo, single.trackingInfo) && Intrinsics.d(this.onboarding, single.onboarding) && this.cornerRadius == single.cornerRadius;
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final OverlayIcon getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO.Block
            public OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @NotNull
            public final TextAtom getSubtitle() {
                return this.subtitle;
            }

            public final TextAtom getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                OverlayIcon overlayIcon = this.icon;
                int hashCode = (overlayIcon == null ? 0 : overlayIcon.hashCode()) * 31;
                TextAtom textAtom = this.title;
                int b11 = C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.subtitle);
                String str = this.backgroundColor;
                int hashCode2 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                int hashCode5 = (hashCode4 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                return hashCode5 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                OverlayIcon overlayIcon = this.icon;
                TextAtom textAtom = this.title;
                TextAtom textAtom2 = this.subtitle;
                String str = this.backgroundColor;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder sb2 = new StringBuilder("Single(icon=");
                sb2.append(overlayIcon);
                sb2.append(", title=");
                sb2.append(textAtom);
                sb2.append(", subtitle=");
                sb2.append(textAtom2);
                sb2.append(", backgroundColor=");
                sb2.append(str);
                sb2.append(", action=");
                Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", onboarding=");
                sb2.append(onBoardingDTO);
                sb2.append(", cornerRadius=");
                sb2.append(cornerRadius);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public /* synthetic */ Block(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract OnBoardingDTO getOnboarding();

        private Block() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UgcCountersDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "singleBlock", type = Block.Single.class), @ProtoOneOfSignature(name = "doubleBlock", type = Block.Double.class), @ProtoOneOfSignature(name = "imageBlock", type = Block.Image.class), @ProtoOneOfSignature(name = "expandingBlock", type = Block.Expanding.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Block> blocks, String str, Map<String, TokenizedTrackingInfo> map, String str2) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.backgroundColor = str;
        this.trackingInfo = map;
        this.json = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UgcCountersDTO copy$default(UgcCountersDTO ugcCountersDTO, List list, String str, Map map, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = ugcCountersDTO.blocks;
        }
        if ((i11 & 2) != 0) {
            str = ugcCountersDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            map = ugcCountersDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            str2 = ugcCountersDTO.json;
        }
        return ugcCountersDTO.copy(list, str, map, str2);
    }

    @NotNull
    public final List<Block> component1() {
        return this.blocks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final UgcCountersDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "singleBlock", type = Block.Single.class), @ProtoOneOfSignature(name = "doubleBlock", type = Block.Double.class), @ProtoOneOfSignature(name = "imageBlock", type = Block.Image.class), @ProtoOneOfSignature(name = "expandingBlock", type = Block.Expanding.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Block> blocks, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, String json) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new UgcCountersDTO(blocks, backgroundColor, trackingInfo, json);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    @NotNull
    public BasePlaceholderWidgetObject copyExcludingAnalytics() {
        Block copy$default;
        List<Block> list = this.blocks;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Block block : list) {
            if (block instanceof Block.Single) {
                copy$default = Block.Single.copy$default((Block.Single) block, null, null, null, null, null, null, null, null, 223, null);
            } else if (block instanceof Block.Double) {
                copy$default = Block.Double.copy$default((Block.Double) block, null, null, null, null, 11, null);
            } else if (block instanceof Block.Image) {
                copy$default = Block.Image.copy$default((Block.Image) block, null, null, null, null, null, null, null, 111, null);
            } else {
                if (!(block instanceof Block.Expanding)) {
                    throw new o();
                }
                copy$default = Block.Expanding.copy$default((Block.Expanding) block, null, null, null, null, null, null, null, null, null, 479, null);
            }
            arrayList.add(copy$default);
        }
        return copy$default(this, arrayList, null, null, null, 10, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UgcCountersDTO)) {
            return false;
        }
        UgcCountersDTO ugcCountersDTO = (UgcCountersDTO) other;
        return Intrinsics.d(this.blocks, ugcCountersDTO.blocks) && Intrinsics.d(this.backgroundColor, ugcCountersDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, ugcCountersDTO.trackingInfo) && Intrinsics.d(this.json, ugcCountersDTO.json);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public String getJson() {
        return this.json;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.json;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BasePlaceholderWidgetObject
    public void setJson(String str) {
        this.json = str;
    }

    @NotNull
    public String toString() {
        List<Block> list = this.blocks;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str2 = this.json;
        StringBuilder a11 = C4055a.a("UgcCountersDTO(blocks=", ", backgroundColor=", str, ", trackingInfo=", list);
        a11.append(map);
        a11.append(", json=");
        a11.append(str2);
        a11.append(")");
        return a11.toString();
    }
}
