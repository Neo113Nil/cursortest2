package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation;

import B90.C2616s;
import C.o0;
import De.C2859b;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ns.b;
import T7.P;
import Ul.C4070a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.progress.ProgressBar;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u001c\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "state", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "AsyncState", "State", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MilesForBuyersVO implements c {
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$AsyncState;", "", "asyncData", "", "getAsyncData", "()Ljava/lang/String;", "asyncParams", "", "getAsyncParams", "()Ljava/util/Map;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AsyncState {
        String getAsyncData();

        Map<String, Object> getAsyncParams();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\f\r\u000eR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "", "clickAction", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "getViewTrackingInfo", "()Ljava/util/Map;", "BannerState", "ProgressState", "CardState", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$BannerState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$CardState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u0010\u0016R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b0\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$BannerState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$AsyncState;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "actionButton", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "backgroundImage", "rightImage", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "asyncData", "", "asyncParams", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getRightImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getViewTrackingInfo", "()Ljava/util/Map;", "Ljava/lang/String;", "getAsyncData", "getAsyncParams", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BannerState implements State, AsyncState {

            @NotNull
            private final ButtonV3DTO actionButton;
            private final String asyncData;
            private final Map<String, Object> asyncParams;
            private final ImageDTO backgroundImage;
            private final AtomAction clickAction;

            @NotNull
            private final ImageDTO rightImage;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

            public BannerState(@NotNull TextDTO title, @NotNull ButtonV3DTO actionButton, ImageDTO imageDTO, @NotNull ImageDTO rightImage, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, String str, Map<String, ? extends Object> map2) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(actionButton, "actionButton");
                Intrinsics.checkNotNullParameter(rightImage, "rightImage");
                this.title = title;
                this.actionButton = actionButton;
                this.backgroundImage = imageDTO;
                this.rightImage = rightImage;
                this.clickAction = atomAction;
                this.viewTrackingInfo = map;
                this.asyncData = str;
                this.asyncParams = map2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerState)) {
                    return false;
                }
                BannerState bannerState = (BannerState) other;
                return Intrinsics.d(this.title, bannerState.title) && Intrinsics.d(this.actionButton, bannerState.actionButton) && Intrinsics.d(this.backgroundImage, bannerState.backgroundImage) && Intrinsics.d(this.rightImage, bannerState.rightImage) && Intrinsics.d(this.clickAction, bannerState.clickAction) && Intrinsics.d(this.viewTrackingInfo, bannerState.viewTrackingInfo) && Intrinsics.d(this.asyncData, bannerState.asyncData) && Intrinsics.d(this.asyncParams, bannerState.asyncParams);
            }

            @NotNull
            public final ButtonV3DTO getActionButton() {
                return this.actionButton;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.AsyncState
            public String getAsyncData() {
                return this.asyncData;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.AsyncState
            public Map<String, Object> getAsyncParams() {
                return this.asyncParams;
            }

            public final ImageDTO getBackgroundImage() {
                return this.backgroundImage;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.State
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @NotNull
            public final ImageDTO getRightImage() {
                return this.rightImage;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.State
            public Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            public int hashCode() {
                int c11 = C2859b.c(this.actionButton, this.title.hashCode() * 31, 31);
                ImageDTO imageDTO = this.backgroundImage;
                int b11 = a.b(this.rightImage, (c11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
                AtomAction atomAction = this.clickAction;
                int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                String str = this.asyncData;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                Map<String, Object> map2 = this.asyncParams;
                return hashCode3 + (map2 != null ? map2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                ButtonV3DTO buttonV3DTO = this.actionButton;
                ImageDTO imageDTO = this.backgroundImage;
                ImageDTO imageDTO2 = this.rightImage;
                AtomAction atomAction = this.clickAction;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                String str = this.asyncData;
                Map<String, Object> map2 = this.asyncParams;
                StringBuilder sb2 = new StringBuilder("BannerState(title=");
                sb2.append(textDTO);
                sb2.append(", actionButton=");
                sb2.append(buttonV3DTO);
                sb2.append(", backgroundImage=");
                sb2.append(imageDTO);
                sb2.append(", rightImage=");
                sb2.append(imageDTO2);
                sb2.append(", clickAction=");
                sb2.append(atomAction);
                sb2.append(", viewTrackingInfo=");
                sb2.append(map);
                sb2.append(", asyncData=");
                return C4070a.a(sb2, str, ", asyncParams=", map2, ")");
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b7\u0010\u001aR(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b8\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$CardState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$AsyncState;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "actionButton", "", "backgroundColor", "borderColor", "", "withAnimation", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "asyncData", "", "asyncParams", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Z", "getWithAnimation", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getViewTrackingInfo", "()Ljava/util/Map;", "getAsyncData", "getAsyncParams", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CardState implements State, AsyncState {

            @NotNull
            private final ButtonV3DTO actionButton;
            private final String asyncData;
            private final Map<String, Object> asyncParams;

            @NotNull
            private final String backgroundColor;
            private final String borderColor;
            private final AtomAction clickAction;

            @NotNull
            private final ImageDTO image;

            @NotNull
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;
            private final boolean withAnimation;

            public CardState(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull ButtonV3DTO actionButton, @NotNull String backgroundColor, String str, boolean z11, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, String str2, Map<String, ? extends Object> map2) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(actionButton, "actionButton");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.image = image;
                this.title = title;
                this.subtitle = subtitle;
                this.actionButton = actionButton;
                this.backgroundColor = backgroundColor;
                this.borderColor = str;
                this.withAnimation = z11;
                this.clickAction = atomAction;
                this.viewTrackingInfo = map;
                this.asyncData = str2;
                this.asyncParams = map2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CardState)) {
                    return false;
                }
                CardState cardState = (CardState) other;
                return Intrinsics.d(this.image, cardState.image) && Intrinsics.d(this.title, cardState.title) && Intrinsics.d(this.subtitle, cardState.subtitle) && Intrinsics.d(this.actionButton, cardState.actionButton) && Intrinsics.d(this.backgroundColor, cardState.backgroundColor) && Intrinsics.d(this.borderColor, cardState.borderColor) && this.withAnimation == cardState.withAnimation && Intrinsics.d(this.clickAction, cardState.clickAction) && Intrinsics.d(this.viewTrackingInfo, cardState.viewTrackingInfo) && Intrinsics.d(this.asyncData, cardState.asyncData) && Intrinsics.d(this.asyncParams, cardState.asyncParams);
            }

            @NotNull
            public final ButtonV3DTO getActionButton() {
                return this.actionButton;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.AsyncState
            public String getAsyncData() {
                return this.asyncData;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.AsyncState
            public Map<String, Object> getAsyncParams() {
                return this.asyncParams;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.State
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.State
            public Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            public final boolean getWithAnimation() {
                return this.withAnimation;
            }

            public int hashCode() {
                int a11 = g.a(C2859b.c(this.actionButton, b.a(this.subtitle, b.a(this.title, this.image.hashCode() * 31, 31), 31), 31), 31, this.backgroundColor);
                String str = this.borderColor;
                int a12 = C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.withAnimation);
                AtomAction atomAction = this.clickAction;
                int hashCode = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                String str2 = this.asyncData;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Map<String, Object> map2 = this.asyncParams;
                return hashCode3 + (map2 != null ? map2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                ImageDTO imageDTO = this.image;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                ButtonV3DTO buttonV3DTO = this.actionButton;
                String str = this.backgroundColor;
                String str2 = this.borderColor;
                boolean z11 = this.withAnimation;
                AtomAction atomAction = this.clickAction;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                String str3 = this.asyncData;
                Map<String, Object> map2 = this.asyncParams;
                StringBuilder d11 = C2616s.d("CardState(image=", imageDTO, ", title=", textDTO, ", subtitle=");
                d11.append(textDTO2);
                d11.append(", actionButton=");
                d11.append(buttonV3DTO);
                d11.append(", backgroundColor=");
                a.h(d11, str, ", borderColor=", str2, ", withAnimation=");
                d11.append(z11);
                d11.append(", clickAction=");
                d11.append(atomAction);
                d11.append(", viewTrackingInfo=");
                d11.append(map);
                d11.append(", asyncData=");
                d11.append(str3);
                d11.append(", asyncParams=");
                return P.f(d11, map2, ")");
            }
        }

        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u00015Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "subtitleBadge", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;", "progress", "progressBarDescription", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "rightImage", "", "borderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubtitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;", "getProgress", "()Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;", "getProgressBarDescription", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getRightImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getViewTrackingInfo", "()Ljava/util/Map;", "Progress", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProgressState implements State {
            private final String borderColor;
            private final AtomAction clickAction;

            @NotNull
            private final Progress progress;
            private final TextDTO progressBarDescription;

            @NotNull
            private final ImageDTO rightImage;

            @NotNull
            private final TextDTO subtitle;
            private final BadgeDTO subtitleBadge;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/presentation/MilesForBuyersVO$State$ProgressState$Progress;", "", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "progressBar", "", "backgroundColor", "darkBackgroundColor", "<init>", "(Lru/ozon/app/android/atoms/data/progress/ProgressBar;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "getProgressBar", "()Lru/ozon/app/android/atoms/data/progress/ProgressBar;", "Ljava/lang/String;", "getBackgroundColor", "getDarkBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Progress {
                private final String backgroundColor;
                private final String darkBackgroundColor;

                @NotNull
                private final ProgressBar progressBar;

                public Progress(@NotNull ProgressBar progressBar, String str, String str2) {
                    Intrinsics.checkNotNullParameter(progressBar, "progressBar");
                    this.progressBar = progressBar;
                    this.backgroundColor = str;
                    this.darkBackgroundColor = str2;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Progress)) {
                        return false;
                    }
                    Progress progress = (Progress) other;
                    return Intrinsics.d(this.progressBar, progress.progressBar) && Intrinsics.d(this.backgroundColor, progress.backgroundColor) && Intrinsics.d(this.darkBackgroundColor, progress.darkBackgroundColor);
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final String getDarkBackgroundColor() {
                    return this.darkBackgroundColor;
                }

                @NotNull
                public final ProgressBar getProgressBar() {
                    return this.progressBar;
                }

                public int hashCode() {
                    int hashCode = this.progressBar.hashCode() * 31;
                    String str = this.backgroundColor;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.darkBackgroundColor;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    ProgressBar progressBar = this.progressBar;
                    String str = this.backgroundColor;
                    String str2 = this.darkBackgroundColor;
                    StringBuilder sb2 = new StringBuilder("Progress(progressBar=");
                    sb2.append(progressBar);
                    sb2.append(", backgroundColor=");
                    sb2.append(str);
                    sb2.append(", darkBackgroundColor=");
                    return o0.c(sb2, str2, ")");
                }
            }

            public ProgressState(@NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badgeDTO, @NotNull Progress progress, TextDTO textDTO, @NotNull ImageDTO rightImage, String str, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(progress, "progress");
                Intrinsics.checkNotNullParameter(rightImage, "rightImage");
                this.title = title;
                this.subtitle = subtitle;
                this.subtitleBadge = badgeDTO;
                this.progress = progress;
                this.progressBarDescription = textDTO;
                this.rightImage = rightImage;
                this.borderColor = str;
                this.clickAction = atomAction;
                this.viewTrackingInfo = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProgressState)) {
                    return false;
                }
                ProgressState progressState = (ProgressState) other;
                return Intrinsics.d(this.title, progressState.title) && Intrinsics.d(this.subtitle, progressState.subtitle) && Intrinsics.d(this.subtitleBadge, progressState.subtitleBadge) && Intrinsics.d(this.progress, progressState.progress) && Intrinsics.d(this.progressBarDescription, progressState.progressBarDescription) && Intrinsics.d(this.rightImage, progressState.rightImage) && Intrinsics.d(this.borderColor, progressState.borderColor) && Intrinsics.d(this.clickAction, progressState.clickAction) && Intrinsics.d(this.viewTrackingInfo, progressState.viewTrackingInfo);
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.State
            public AtomAction getClickAction() {
                return this.clickAction;
            }

            @NotNull
            public final Progress getProgress() {
                return this.progress;
            }

            public final TextDTO getProgressBarDescription() {
                return this.progressBarDescription;
            }

            @NotNull
            public final ImageDTO getRightImage() {
                return this.rightImage;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            public final BadgeDTO getSubtitleBadge() {
                return this.subtitleBadge;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.presentation.MilesForBuyersVO.State
            public Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            public int hashCode() {
                int a11 = b.a(this.subtitle, this.title.hashCode() * 31, 31);
                BadgeDTO badgeDTO = this.subtitleBadge;
                int hashCode = (this.progress.hashCode() + ((a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31)) * 31;
                TextDTO textDTO = this.progressBarDescription;
                int b11 = a.b(this.rightImage, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
                String str = this.borderColor;
                int hashCode2 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction = this.clickAction;
                int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                BadgeDTO badgeDTO = this.subtitleBadge;
                Progress progress = this.progress;
                TextDTO textDTO3 = this.progressBarDescription;
                ImageDTO imageDTO = this.rightImage;
                String str = this.borderColor;
                AtomAction atomAction = this.clickAction;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                StringBuilder g10 = D3.g.g("ProgressState(title=", textDTO, ", subtitle=", textDTO2, ", subtitleBadge=");
                g10.append(badgeDTO);
                g10.append(", progress=");
                g10.append(progress);
                g10.append(", progressBarDescription=");
                g10.append(textDTO3);
                g10.append(", rightImage=");
                g10.append(imageDTO);
                g10.append(", borderColor=");
                b.d(str, ", clickAction=", ", viewTrackingInfo=", g10, atomAction);
                return P.f(g10, map, ")");
            }
        }

        AtomAction getClickAction();

        Map<String, TokenizedTrackingInfo> getViewTrackingInfo();
    }

    public MilesForBuyersVO(long j11, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
    }

    public static /* synthetic */ MilesForBuyersVO copy$default(MilesForBuyersVO milesForBuyersVO, long j11, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = milesForBuyersVO.id;
        }
        if ((i11 & 2) != 0) {
            state = milesForBuyersVO.state;
        }
        return milesForBuyersVO.copy(j11, state);
    }

    @NotNull
    public final MilesForBuyersVO copy(long id2, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new MilesForBuyersVO(id2, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MilesForBuyersVO)) {
            return false;
        }
        MilesForBuyersVO milesForBuyersVO = (MilesForBuyersVO) other;
        return this.id == milesForBuyersVO.id && Intrinsics.d(this.state, milesForBuyersVO.state);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.state.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "MilesForBuyersVO(id=" + this.id + ", state=" + this.state + ")";
    }
}
