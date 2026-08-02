package ru.ozon.app.android.cart.familyGroup.presentation;

import TY.a;
import Tg.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.familyGroup.data.FamilyGroupDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u00015BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;", "rightBlock", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "settings", "LTg/b;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;LTg/b;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;", "getRightBlock", "()Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;", "Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "getSettings", "()Lru/ozon/app/android/cart/familyGroup/data/FamilyGroupDTO$FamilyGroupSettingsDTO;", "LTg/b;", "getAction", "()LTg/b;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "RightBlock", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FamilyGroupVO implements c {
    private final b action;
    private final long id;
    private final RightBlock rightBlock;
    private final FamilyGroupDTO.FamilyGroupSettingsDTO settings;
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/familyGroup/presentation/FamilyGroupVO$RightBlock;", "", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icons", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RightBlock {

        @NotNull
        private final List<IconDTO> icons;
        private final IndicatorDTO indicator;

        public RightBlock(@NotNull List<IconDTO> icons, IndicatorDTO indicatorDTO) {
            Intrinsics.checkNotNullParameter(icons, "icons");
            this.icons = icons;
            this.indicator = indicatorDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RightBlock)) {
                return false;
            }
            RightBlock rightBlock = (RightBlock) other;
            return Intrinsics.d(this.icons, rightBlock.icons) && Intrinsics.d(this.indicator, rightBlock.indicator);
        }

        @NotNull
        public final List<IconDTO> getIcons() {
            return this.icons;
        }

        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        public int hashCode() {
            int hashCode = this.icons.hashCode() * 31;
            IndicatorDTO indicatorDTO = this.indicator;
            return hashCode + (indicatorDTO == null ? 0 : indicatorDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "RightBlock(icons=" + this.icons + ", indicator=" + this.indicator + ")";
        }
    }

    public FamilyGroupVO(long j11, @NotNull TextDTO title, TextDTO textDTO, RightBlock rightBlock, FamilyGroupDTO.FamilyGroupSettingsDTO familyGroupSettingsDTO, b bVar, t tVar, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.rightBlock = rightBlock;
        this.settings = familyGroupSettingsDTO;
        this.action = bVar;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyGroupVO)) {
            return false;
        }
        FamilyGroupVO familyGroupVO = (FamilyGroupVO) other;
        return this.id == familyGroupVO.id && Intrinsics.d(this.title, familyGroupVO.title) && Intrinsics.d(this.subtitle, familyGroupVO.subtitle) && Intrinsics.d(this.rightBlock, familyGroupVO.rightBlock) && Intrinsics.d(this.settings, familyGroupVO.settings) && Intrinsics.d(this.action, familyGroupVO.action) && Intrinsics.d(this.tokenizedEvent, familyGroupVO.tokenizedEvent) && Intrinsics.d(this.testInfo, familyGroupVO.testInfo);
    }

    public final b getAction() {
        return this.action;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final RightBlock getRightBlock() {
        return this.rightBlock;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final FamilyGroupDTO.FamilyGroupSettingsDTO getSettings() {
        return this.settings;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        RightBlock rightBlock = this.rightBlock;
        int hashCode2 = (hashCode + (rightBlock == null ? 0 : rightBlock.hashCode())) * 31;
        FamilyGroupDTO.FamilyGroupSettingsDTO familyGroupSettingsDTO = this.settings;
        int hashCode3 = (hashCode2 + (familyGroupSettingsDTO == null ? 0 : familyGroupSettingsDTO.hashCode())) * 31;
        b bVar = this.action;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode5 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        RightBlock rightBlock = this.rightBlock;
        FamilyGroupDTO.FamilyGroupSettingsDTO familyGroupSettingsDTO = this.settings;
        b bVar = this.action;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        StringBuilder b11 = a.b("FamilyGroupVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", rightBlock=");
        b11.append(rightBlock);
        b11.append(", settings=");
        b11.append(familyGroupSettingsDTO);
        b11.append(", action=");
        b11.append(bVar);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", testInfo=");
        b11.append(testInfo);
        b11.append(")");
        return b11.toString();
    }
}
