package ru.ozon.app.android.common.taglist.taglistv3.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.taglist.TagListViewType;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B\u008b\u0001\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0016HÆ\u0003J¢\u0001\u00109\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\fHÖ\u0001J\t\u0010>\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u0007\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u0012\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006@"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "", "tags", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "view", "Lru/ozon/app/android/common/taglist/TagListViewType;", "isSticky", "", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingIndex", "", "bottomPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "topPadding", "stickyBehavior", "Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO$StickyBehavior;", "isBottomRounded", "leftPadding", "rightPadding", "backgroundColor", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/common/taglist/TagListViewType;Ljava/lang/Boolean;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO$StickyBehavior;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;)V", "getTags", "()Ljava/util/List;", "getView", "()Lru/ozon/app/android/common/taglist/TagListViewType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardingIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottomPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getTopPadding", "getStickyBehavior", "()Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO$StickyBehavior;", "getLeftPadding", "getRightPadding", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/List;Lru/ozon/app/android/common/taglist/TagListViewType;Ljava/lang/Boolean;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO$StickyBehavior;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;)Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO;", "equals", "other", "hashCode", "toString", "StickyBehavior", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TagListV3DTO {
    private final String backgroundColor;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding bottomPadding;
    private final Boolean isBottomRounded;
    private final Boolean isSticky;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final OnBoardingDTO onboarding;
    private final Integer onboardingIndex;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding rightPadding;
    private final StickyBehavior stickyBehavior;

    @NotNull
    private final List<AtomDTO> tags;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding topPadding;
    private final TagListViewType view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3DTO$StickyBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "DEFAULT", "HIDE_ON_SCROLL", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StickyBehavior {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StickyBehavior[] $VALUES;
        public static final StickyBehavior UNSPECIFIED = new StickyBehavior("UNSPECIFIED", 0);
        public static final StickyBehavior DEFAULT = new StickyBehavior("DEFAULT", 1);
        public static final StickyBehavior HIDE_ON_SCROLL = new StickyBehavior("HIDE_ON_SCROLL", 2);

        private static final /* synthetic */ StickyBehavior[] $values() {
            return new StickyBehavior[]{UNSPECIFIED, DEFAULT, HIDE_ON_SCROLL};
        }

        static {
            StickyBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StickyBehavior(String str, int i11) {
        }

        public static StickyBehavior valueOf(String str) {
            return (StickyBehavior) Enum.valueOf(StickyBehavior.class, str);
        }

        public static StickyBehavior[] values() {
            return (StickyBehavior[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TagListV3DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tag", type = TagV3Atom.TagAtom.class), @ProtoOneOfSignature(name = "smallLinkTag", type = TagV3Atom.SmallLinkTagAtom.class), @ProtoOneOfSignature(name = "linkTag", type = TagV3Atom.LinkTagAtom.class), @ProtoOneOfSignature(name = "crossTag", type = TagV3Atom.CrossTagAtom.class), @ProtoOneOfSignature(name = "crossColorTag", type = TagV3Atom.CrossColorTagAtom.class), @ProtoOneOfSignature(name = "buttonTag", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> tags, TagListViewType tagListViewType, Boolean bool, OnBoardingDTO onBoardingDTO, Integer num, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, StickyBehavior stickyBehavior, Boolean bool2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, String str) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.tags = tags;
        this.view = tagListViewType;
        this.isSticky = bool;
        this.onboarding = onBoardingDTO;
        this.onboardingIndex = num;
        this.bottomPadding = layoutPadding;
        this.topPadding = layoutPadding2;
        this.stickyBehavior = stickyBehavior;
        this.isBottomRounded = bool2;
        this.leftPadding = layoutPadding3;
        this.rightPadding = layoutPadding4;
        this.backgroundColor = str;
    }

    public static /* synthetic */ TagListV3DTO copy$default(TagListV3DTO tagListV3DTO, List list, TagListViewType tagListViewType, Boolean bool, OnBoardingDTO onBoardingDTO, Integer num, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, StickyBehavior stickyBehavior, Boolean bool2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tagListV3DTO.tags;
        }
        if ((i11 & 2) != 0) {
            tagListViewType = tagListV3DTO.view;
        }
        if ((i11 & 4) != 0) {
            bool = tagListV3DTO.isSticky;
        }
        if ((i11 & 8) != 0) {
            onBoardingDTO = tagListV3DTO.onboarding;
        }
        if ((i11 & 16) != 0) {
            num = tagListV3DTO.onboardingIndex;
        }
        if ((i11 & 32) != 0) {
            layoutPadding = tagListV3DTO.bottomPadding;
        }
        if ((i11 & 64) != 0) {
            layoutPadding2 = tagListV3DTO.topPadding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            stickyBehavior = tagListV3DTO.stickyBehavior;
        }
        if ((i11 & 256) != 0) {
            bool2 = tagListV3DTO.isBottomRounded;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            layoutPadding3 = tagListV3DTO.leftPadding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            layoutPadding4 = tagListV3DTO.rightPadding;
        }
        if ((i11 & 2048) != 0) {
            str = tagListV3DTO.backgroundColor;
        }
        CommonCellSettings.LayoutPadding layoutPadding5 = layoutPadding4;
        String str2 = str;
        Boolean bool3 = bool2;
        CommonCellSettings.LayoutPadding layoutPadding6 = layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding7 = layoutPadding2;
        StickyBehavior stickyBehavior2 = stickyBehavior;
        Integer num2 = num;
        CommonCellSettings.LayoutPadding layoutPadding8 = layoutPadding;
        return tagListV3DTO.copy(list, tagListViewType, bool, onBoardingDTO, num2, layoutPadding8, layoutPadding7, stickyBehavior2, bool3, layoutPadding6, layoutPadding5, str2);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.tags;
    }

    /* renamed from: component10, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component11, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final TagListViewType getView() {
        return this.view;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component4, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getOnboardingIndex() {
        return this.onboardingIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component8, reason: from getter */
    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsBottomRounded() {
        return this.isBottomRounded;
    }

    @NotNull
    public final TagListV3DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "tag", type = TagV3Atom.TagAtom.class), @ProtoOneOfSignature(name = "smallLinkTag", type = TagV3Atom.SmallLinkTagAtom.class), @ProtoOneOfSignature(name = "linkTag", type = TagV3Atom.LinkTagAtom.class), @ProtoOneOfSignature(name = "crossTag", type = TagV3Atom.CrossTagAtom.class), @ProtoOneOfSignature(name = "crossColorTag", type = TagV3Atom.CrossColorTagAtom.class), @ProtoOneOfSignature(name = "buttonTag", type = TagButtonDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> tags, TagListViewType view, Boolean isSticky, OnBoardingDTO onboarding, Integer onboardingIndex, CommonCellSettings.LayoutPadding bottomPadding, CommonCellSettings.LayoutPadding topPadding, StickyBehavior stickyBehavior, Boolean isBottomRounded, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, String backgroundColor) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new TagListV3DTO(tags, view, isSticky, onboarding, onboardingIndex, bottomPadding, topPadding, stickyBehavior, isBottomRounded, leftPadding, rightPadding, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagListV3DTO)) {
            return false;
        }
        TagListV3DTO tagListV3DTO = (TagListV3DTO) other;
        return Intrinsics.d(this.tags, tagListV3DTO.tags) && this.view == tagListV3DTO.view && Intrinsics.d(this.isSticky, tagListV3DTO.isSticky) && Intrinsics.d(this.onboarding, tagListV3DTO.onboarding) && Intrinsics.d(this.onboardingIndex, tagListV3DTO.onboardingIndex) && this.bottomPadding == tagListV3DTO.bottomPadding && this.topPadding == tagListV3DTO.topPadding && this.stickyBehavior == tagListV3DTO.stickyBehavior && Intrinsics.d(this.isBottomRounded, tagListV3DTO.isBottomRounded) && this.leftPadding == tagListV3DTO.leftPadding && this.rightPadding == tagListV3DTO.rightPadding && Intrinsics.d(this.backgroundColor, tagListV3DTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final Integer getOnboardingIndex() {
        return this.onboardingIndex;
    }

    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    @NotNull
    public final List<AtomDTO> getTags() {
        return this.tags;
    }

    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    public final TagListViewType getView() {
        return this.view;
    }

    public int hashCode() {
        int hashCode = this.tags.hashCode() * 31;
        TagListViewType tagListViewType = this.view;
        int hashCode2 = (hashCode + (tagListViewType == null ? 0 : tagListViewType.hashCode())) * 31;
        Boolean bool = this.isSticky;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode4 = (hashCode3 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Integer num = this.onboardingIndex;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.bottomPadding;
        int hashCode6 = (hashCode5 + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.topPadding;
        int hashCode7 = (hashCode6 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        StickyBehavior stickyBehavior = this.stickyBehavior;
        int hashCode8 = (hashCode7 + (stickyBehavior == null ? 0 : stickyBehavior.hashCode())) * 31;
        Boolean bool2 = this.isBottomRounded;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftPadding;
        int hashCode10 = (hashCode9 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightPadding;
        int hashCode11 = (hashCode10 + (layoutPadding4 == null ? 0 : layoutPadding4.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode11 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isBottomRounded() {
        return this.isBottomRounded;
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        return "TagListV3DTO(tags=" + this.tags + ", view=" + this.view + ", isSticky=" + this.isSticky + ", onboarding=" + this.onboarding + ", onboardingIndex=" + this.onboardingIndex + ", bottomPadding=" + this.bottomPadding + ", topPadding=" + this.topPadding + ", stickyBehavior=" + this.stickyBehavior + ", isBottomRounded=" + this.isBottomRounded + ", leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", backgroundColor=" + this.backgroundColor + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TagListV3DTO(java.util.List r15, ru.ozon.app.android.common.taglist.TagListViewType r16, java.lang.Boolean r17, ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO r18, java.lang.Integer r19, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r20, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r21, ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3DTO.StickyBehavior r22, java.lang.Boolean r23, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r24, ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r27 & 2
            if (r0 == 0) goto L8
            ru.ozon.app.android.common.taglist.TagListViewType r0 = ru.ozon.app.android.common.taglist.TagListViewType.VIEW_TYPE_SCROLL
            r3 = r0
            goto La
        L8:
            r3 = r16
        La:
            r0 = r27 & 32
            r1 = 0
            if (r0 == 0) goto L11
            r7 = r1
            goto L13
        L11:
            r7 = r20
        L13:
            r0 = r27 & 64
            if (r0 == 0) goto L2b
            r8 = r1
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r1 = r14
            goto L3f
        L2b:
            r8 = r21
            r1 = r14
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
        L3f:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3DTO.<init>(java.util.List, ru.ozon.app.android.common.taglist.TagListViewType, java.lang.Boolean, ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO, java.lang.Integer, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3DTO$StickyBehavior, java.lang.Boolean, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, ru.ozon.uni.atoms.data.cell.CommonCellSettings$LayoutPadding, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
