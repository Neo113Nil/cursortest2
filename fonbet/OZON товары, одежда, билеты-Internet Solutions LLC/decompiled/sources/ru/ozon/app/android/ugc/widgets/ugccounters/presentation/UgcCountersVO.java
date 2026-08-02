package ru.ozon.app.android.ugc.widgets.ugccounters.presentation;

import An.C2439a;
import Bi.a;
import D3.g;
import Ns.b;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.OverlayIcon;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002&'B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b%\u0010\u0011¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetPlaceholderViewObject;", "", "id", "", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Item;", "items", "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "json", "<init>", "(JLjava/util/List;Ljava/lang/String;LWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getJson", "Block", "Item", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UgcCountersVO implements c, WidgetPlaceholderViewObject {

    @NotNull
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final List<Item> items;

    @NotNull
    private final String json;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "", "<init>", "()V", "", "getId", "()J", "id", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Single", "Double", "Images", "Expanding", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Double;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Expanding;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Block {

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Double;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "", "id", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "firstBlock", "secondBlock", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(JLru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "getFirstBlock", "()Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "getSecondBlock", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Double extends Block {

            @NotNull
            private final Single firstBlock;
            private final long id;
            private final OnBoardingDTO onboarding;

            @NotNull
            private final Single secondBlock;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Double(long j11, @NotNull Single firstBlock, @NotNull Single secondBlock, t tVar, OnBoardingDTO onBoardingDTO) {
                super(null);
                Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
                Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
                this.id = j11;
                this.firstBlock = firstBlock;
                this.secondBlock = secondBlock;
                this.tokenizedEvent = tVar;
                this.onboarding = onBoardingDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Double)) {
                    return false;
                }
                Double r82 = (Double) other;
                return this.id == r82.id && Intrinsics.d(this.firstBlock, r82.firstBlock) && Intrinsics.d(this.secondBlock, r82.secondBlock) && Intrinsics.d(this.tokenizedEvent, r82.tokenizedEvent) && Intrinsics.d(this.onboarding, r82.onboarding);
            }

            @NotNull
            public final Single getFirstBlock() {
                return this.firstBlock;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public long getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @NotNull
            public final Single getSecondBlock() {
                return this.secondBlock;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = (this.secondBlock.hashCode() + ((this.firstBlock.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                return hashCode2 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Double(id=" + this.id + ", firstBlock=" + this.firstBlock + ", secondBlock=" + this.secondBlock + ", tokenizedEvent=" + this.tokenizedEvent + ", onboarding=" + this.onboarding + ")";
            }
        }

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010\u001a¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Expanding;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "", "alignment", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "I", "getAlignment", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Expanding extends Block {
            private final AtomAction action;
            private final int alignment;
            private final String backgroundColor;

            @NotNull
            private final CornerRadius cornerRadius;
            private final IconDTO icon;
            private final long id;
            private final OnBoardingDTO onboarding;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final t tokenizedEvent;

            public /* synthetic */ Expanding(long j11, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, String str, AtomAction atomAction, t tVar, OnBoardingDTO onBoardingDTO, CornerRadius cornerRadius, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(j11, iconDTO, textDTO, textDTO2, str, atomAction, tVar, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : onBoardingDTO, cornerRadius, i11);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Expanding)) {
                    return false;
                }
                Expanding expanding = (Expanding) other;
                return this.id == expanding.id && Intrinsics.d(this.icon, expanding.icon) && Intrinsics.d(this.title, expanding.title) && Intrinsics.d(this.subtitle, expanding.subtitle) && Intrinsics.d(this.backgroundColor, expanding.backgroundColor) && Intrinsics.d(this.action, expanding.action) && Intrinsics.d(this.tokenizedEvent, expanding.tokenizedEvent) && Intrinsics.d(this.onboarding, expanding.onboarding) && this.cornerRadius == expanding.cornerRadius && this.alignment == expanding.alignment;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final int getAlignment() {
                return this.alignment;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public long getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
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

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                IconDTO iconDTO = this.icon;
                int a11 = b.a(this.title, (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                String str = this.backgroundColor;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                AtomAction atomAction = this.action;
                int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                return Integer.hashCode(this.alignment) + Tl.b.b(this.cornerRadius, (hashCode5 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31, 31);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                IconDTO iconDTO = this.icon;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                String str = this.backgroundColor;
                AtomAction atomAction = this.action;
                t tVar = this.tokenizedEvent;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                CornerRadius cornerRadius = this.cornerRadius;
                int i11 = this.alignment;
                StringBuilder b11 = D40.c.b("Expanding(id=", j11, ", icon=", iconDTO);
                g.i(", title=", ", subtitle=", b11, textDTO, textDTO2);
                C2439a.c(", backgroundColor=", str, ", action=", b11, atomAction);
                b11.append(", tokenizedEvent=");
                b11.append(tVar);
                b11.append(", onboarding=");
                b11.append(onBoardingDTO);
                b11.append(", cornerRadius=");
                b11.append(cornerRadius);
                b11.append(", alignment=");
                b11.append(i11);
                b11.append(")");
                return b11.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Expanding(long j11, IconDTO iconDTO, @NotNull TextDTO title, TextDTO textDTO, String str, AtomAction atomAction, t tVar, OnBoardingDTO onBoardingDTO, @NotNull CornerRadius cornerRadius, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
                this.id = j11;
                this.icon = iconDTO;
                this.title = title;
                this.subtitle = textDTO;
                this.backgroundColor = str;
                this.action = atomAction;
                this.tokenizedEvent = tVar;
                this.onboarding = onBoardingDTO;
                this.cornerRadius = cornerRadius;
                this.alignment = i11;
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u00013BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "", "id", "", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images$Image;", "images", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "videoInfo", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Image", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Images extends Block {
            private final AtomAction action;

            @NotNull
            private final CornerRadius cornerRadius;
            private final long id;

            @NotNull
            private final List<Image> images;
            private final OnBoardingDTO onboarding;
            private final t tokenizedEvent;
            private final PreloadVideoInfo videoInfo;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Images$Image;", "", "", ImagesContract.URL, "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Image {
                private final TextDTO label;

                @NotNull
                private final String url;

                public Image(@NotNull String url, TextDTO textDTO) {
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.url = url;
                    this.label = textDTO;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.label, image.label);
                }

                public final TextDTO getLabel() {
                    return this.label;
                }

                @NotNull
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    int hashCode = this.url.hashCode() * 31;
                    TextDTO textDTO = this.label;
                    return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
                }

                @NotNull
                public String toString() {
                    return "Image(url=" + this.url + ", label=" + this.label + ")";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Images(long j11, @NotNull List<Image> images, AtomAction atomAction, t tVar, OnBoardingDTO onBoardingDTO, PreloadVideoInfo preloadVideoInfo, @NotNull CornerRadius cornerRadius) {
                super(null);
                Intrinsics.checkNotNullParameter(images, "images");
                Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
                this.id = j11;
                this.images = images;
                this.action = atomAction;
                this.tokenizedEvent = tVar;
                this.onboarding = onBoardingDTO;
                this.videoInfo = preloadVideoInfo;
                this.cornerRadius = cornerRadius;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Images)) {
                    return false;
                }
                Images images = (Images) other;
                return this.id == images.id && Intrinsics.d(this.images, images.images) && Intrinsics.d(this.action, images.action) && Intrinsics.d(this.tokenizedEvent, images.tokenizedEvent) && Intrinsics.d(this.onboarding, images.onboarding) && Intrinsics.d(this.videoInfo, images.videoInfo) && this.cornerRadius == images.cornerRadius;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public long getId() {
                return this.id;
            }

            @NotNull
            public final List<Image> getImages() {
                return this.images;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public final PreloadVideoInfo getVideoInfo() {
                return this.videoInfo;
            }

            public int hashCode() {
                int b11 = G.g.b(Long.hashCode(this.id) * 31, 31, this.images);
                AtomAction atomAction = this.action;
                int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                int hashCode3 = (hashCode2 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                return this.cornerRadius.hashCode() + ((hashCode3 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                List<Image> list = this.images;
                AtomAction atomAction = this.action;
                t tVar = this.tokenizedEvent;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                PreloadVideoInfo preloadVideoInfo = this.videoInfo;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder b11 = Lh.b.b(j11, "Images(id=", ", images=", list);
                Fj.c.e(tVar, ", action=", ", tokenizedEvent=", b11, atomAction);
                b11.append(", onboarding=");
                b11.append(onBoardingDTO);
                b11.append(", videoInfo=");
                b11.append(preloadVideoInfo);
                b11.append(", cornerRadius=");
                b11.append(cornerRadius);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block$Single;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(JLru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;", "getIcon", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/OverlayIcon;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Single extends Block {
            private final AtomAction action;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final CornerRadius cornerRadius;
            private final OverlayIcon icon;
            private final long id;
            private final OnBoardingDTO onboarding;

            @NotNull
            private final TextDTO subtitle;
            private final TextDTO title;
            private final t tokenizedEvent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Single(long j11, OverlayIcon overlayIcon, TextDTO textDTO, @NotNull TextDTO subtitle, @NotNull String backgroundColor, AtomAction atomAction, t tVar, OnBoardingDTO onBoardingDTO, @NotNull CornerRadius cornerRadius) {
                super(null);
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
                this.id = j11;
                this.icon = overlayIcon;
                this.title = textDTO;
                this.subtitle = subtitle;
                this.backgroundColor = backgroundColor;
                this.action = atomAction;
                this.tokenizedEvent = tVar;
                this.onboarding = onBoardingDTO;
                this.cornerRadius = cornerRadius;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Single)) {
                    return false;
                }
                Single single = (Single) other;
                return this.id == single.id && Intrinsics.d(this.icon, single.icon) && Intrinsics.d(this.title, single.title) && Intrinsics.d(this.subtitle, single.subtitle) && Intrinsics.d(this.backgroundColor, single.backgroundColor) && Intrinsics.d(this.action, single.action) && Intrinsics.d(this.tokenizedEvent, single.tokenizedEvent) && Intrinsics.d(this.onboarding, single.onboarding) && this.cornerRadius == single.cornerRadius;
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final OverlayIcon getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public long getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            @NotNull
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO.Block
            public t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                OverlayIcon overlayIcon = this.icon;
                int hashCode2 = (hashCode + (overlayIcon == null ? 0 : overlayIcon.hashCode())) * 31;
                TextDTO textDTO = this.title;
                int a11 = G.g.a(b.a(this.subtitle, (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31), 31, this.backgroundColor);
                AtomAction atomAction = this.action;
                int hashCode3 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                return this.cornerRadius.hashCode() + ((hashCode4 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                OverlayIcon overlayIcon = this.icon;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                String str = this.backgroundColor;
                AtomAction atomAction = this.action;
                t tVar = this.tokenizedEvent;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                CornerRadius cornerRadius = this.cornerRadius;
                StringBuilder sb2 = new StringBuilder("Single(id=");
                sb2.append(j11);
                sb2.append(", icon=");
                sb2.append(overlayIcon);
                g.i(", title=", ", subtitle=", sb2, textDTO, textDTO2);
                C2439a.c(", backgroundColor=", str, ", action=", sb2, atomAction);
                sb2.append(", tokenizedEvent=");
                sb2.append(tVar);
                sb2.append(", onboarding=");
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

        public abstract long getId();

        public abstract OnBoardingDTO getOnboarding();

        public abstract t getTokenizedEvent();

        private Block() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Item;", "", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "block", "", "widgetBackgroundColor", "<init>", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "getBlock", "()Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO$Block;", "Ljava/lang/String;", "getWidgetBackgroundColor", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {

        @NotNull
        private final Block block;

        @NotNull
        private final String widgetBackgroundColor;

        public Item(@NotNull Block block, @NotNull String widgetBackgroundColor) {
            Intrinsics.checkNotNullParameter(block, "block");
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            this.block = block;
            this.widgetBackgroundColor = widgetBackgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.block, item.block) && Intrinsics.d(this.widgetBackgroundColor, item.widgetBackgroundColor);
        }

        @NotNull
        public final Block getBlock() {
            return this.block;
        }

        @NotNull
        public final String getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        public int hashCode() {
            return this.widgetBackgroundColor.hashCode() + (this.block.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Item(block=" + this.block + ", widgetBackgroundColor=" + this.widgetBackgroundColor + ")";
        }
    }

    public UgcCountersVO(long j11, @NotNull List<Item> items, @NotNull String backgroundColor, t tVar, @NotNull String json) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.items = items;
        this.backgroundColor = backgroundColor;
        this.tokenizedEvent = tVar;
        this.json = json;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UgcCountersVO)) {
            return false;
        }
        UgcCountersVO ugcCountersVO = (UgcCountersVO) other;
        return this.id == ugcCountersVO.id && Intrinsics.d(this.items, ugcCountersVO.items) && Intrinsics.d(this.backgroundColor, ugcCountersVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, ugcCountersVO.tokenizedEvent) && Intrinsics.d(this.json, ugcCountersVO.json);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject
    @NotNull
    public String getJson() {
        return this.json;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = G.g.a(G.g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.backgroundColor);
        t tVar = this.tokenizedEvent;
        return this.json.hashCode() + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Item> list = this.items;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        String str2 = this.json;
        StringBuilder b11 = Lh.b.b(j11, "UgcCountersVO(id=", ", items=", list);
        a.f(b11, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        return C6594f.a(", json=", str2, ")", b11);
    }
}
