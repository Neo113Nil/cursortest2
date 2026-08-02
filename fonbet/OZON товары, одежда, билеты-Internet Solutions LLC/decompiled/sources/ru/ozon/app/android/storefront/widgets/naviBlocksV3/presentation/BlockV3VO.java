package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation;

import G.g;
import Nh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.data.BlockIconV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3VO;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "titleColor", "subtitleColor", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;", "getIcon", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;", "Ljava/lang/String;", "getTitle", "getSubtitle", "getTitleColor", "getSubtitleColor", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockV3VO {
    private final AtomAction action;
    private final String backgroundColor;

    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final BlockIconV3DTO icon;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String subtitleColor;

    @NotNull
    private final String title;

    @NotNull
    private final String titleColor;
    private final t tokenizedEvent;

    public BlockV3VO(@NotNull BlockIconV3DTO icon, @NotNull String title, @NotNull String subtitle, @NotNull String titleColor, @NotNull String subtitleColor, String str, AtomAction atomAction, t tVar, OnBoardingDTO onBoardingDTO, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(titleColor, "titleColor");
        Intrinsics.checkNotNullParameter(subtitleColor, "subtitleColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.titleColor = titleColor;
        this.subtitleColor = subtitleColor;
        this.backgroundColor = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.onboarding = onBoardingDTO;
        this.cornerRadius = cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockV3VO)) {
            return false;
        }
        BlockV3VO blockV3VO = (BlockV3VO) other;
        return Intrinsics.d(this.icon, blockV3VO.icon) && Intrinsics.d(this.title, blockV3VO.title) && Intrinsics.d(this.subtitle, blockV3VO.subtitle) && Intrinsics.d(this.titleColor, blockV3VO.titleColor) && Intrinsics.d(this.subtitleColor, blockV3VO.subtitleColor) && Intrinsics.d(this.backgroundColor, blockV3VO.backgroundColor) && Intrinsics.d(this.action, blockV3VO.action) && Intrinsics.d(this.tokenizedEvent, blockV3VO.tokenizedEvent) && Intrinsics.d(this.onboarding, blockV3VO.onboarding) && this.cornerRadius == blockV3VO.cornerRadius;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final BlockIconV3DTO getIcon() {
        return this.icon;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTitleColor() {
        return this.titleColor;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.titleColor), 31, this.subtitleColor);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return this.cornerRadius.hashCode() + ((hashCode3 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        BlockIconV3DTO blockIconV3DTO = this.icon;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.titleColor;
        String str4 = this.subtitleColor;
        String str5 = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder sb2 = new StringBuilder("BlockV3VO(icon=");
        sb2.append(blockIconV3DTO);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", subtitle=");
        a.h(sb2, str2, ", titleColor=", str3, ", subtitleColor=");
        a.h(sb2, str4, ", backgroundColor=", str5, ", action=");
        sb2.append(atomAction);
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
