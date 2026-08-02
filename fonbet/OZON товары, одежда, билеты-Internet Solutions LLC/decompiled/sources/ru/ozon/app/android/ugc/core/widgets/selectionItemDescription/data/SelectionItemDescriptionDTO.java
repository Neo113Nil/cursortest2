package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0004\u001f !\"BK\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003JS\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO;", "", "items", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "linkClickTrackingInfo", "scrollPosition", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;)V", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getLinkClickTrackingInfo", "getScrollPosition", "()Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "SocialHeaderDTO", "SelectionItemDescriptionTitleDTO", "ScrollPosition", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionItemDescriptionDTO {

    @Deprecated
    @NotNull
    public static final String EXPANDABLE_TEXT = "EXPANDABLE_TEXT";

    @Deprecated
    @NotNull
    public static final String PLAIN_TEXT = "PLAIN_TEXT";

    @Deprecated
    @NotNull
    public static final String SOCIAL_HEADER = "SOCIAL_HEADER";

    @Deprecated
    @NotNull
    public static final String SPACER = "SPACER";

    @Deprecated
    @NotNull
    public static final String TITLE = "TITLE";

    @Deprecated
    @NotNull
    public static final String TYPE = "type";

    @NotNull
    private final List<Object> items;
    private final Map<String, TokenizedTrackingInfo> linkClickTrackingInfo;

    @NotNull
    private final ScrollPosition scrollPosition;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$Companion;", "", "<init>", "()V", "TYPE", "", SelectionItemDescriptionDTO.SOCIAL_HEADER, SelectionItemDescriptionDTO.TITLE, SelectionItemDescriptionDTO.PLAIN_TEXT, "EXPANDABLE_TEXT", "SPACER", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "TOP", "BOTTOM", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScrollPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ScrollPosition[] $VALUES;
        public static final ScrollPosition NONE = new ScrollPosition("NONE", 0);
        public static final ScrollPosition TOP = new ScrollPosition("TOP", 1);
        public static final ScrollPosition BOTTOM = new ScrollPosition("BOTTOM", 2);

        private static final /* synthetic */ ScrollPosition[] $values() {
            return new ScrollPosition[]{NONE, TOP, BOTTOM};
        }

        static {
            ScrollPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ScrollPosition(String str, int i11) {
        }

        public static ScrollPosition valueOf(String str) {
            return (ScrollPosition) Enum.valueOf(ScrollPosition.class, str);
        }

        public static ScrollPosition[] values() {
            return (ScrollPosition[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$SelectionItemDescriptionTitleDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "status", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "getStatus", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectionItemDescriptionTitleDTO {
        public static final int $stable = ExpandableTextDTO.$stable;
        private final BadgeDTO status;

        @NotNull
        private final ExpandableTextDTO text;

        public SelectionItemDescriptionTitleDTO(@NotNull ExpandableTextDTO text, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.status = badgeDTO;
        }

        public static /* synthetic */ SelectionItemDescriptionTitleDTO copy$default(SelectionItemDescriptionTitleDTO selectionItemDescriptionTitleDTO, ExpandableTextDTO expandableTextDTO, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                expandableTextDTO = selectionItemDescriptionTitleDTO.text;
            }
            if ((i11 & 2) != 0) {
                badgeDTO = selectionItemDescriptionTitleDTO.status;
            }
            return selectionItemDescriptionTitleDTO.copy(expandableTextDTO, badgeDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ExpandableTextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final BadgeDTO getStatus() {
            return this.status;
        }

        @NotNull
        public final SelectionItemDescriptionTitleDTO copy(@NotNull ExpandableTextDTO text, BadgeDTO status) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new SelectionItemDescriptionTitleDTO(text, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionItemDescriptionTitleDTO)) {
                return false;
            }
            SelectionItemDescriptionTitleDTO selectionItemDescriptionTitleDTO = (SelectionItemDescriptionTitleDTO) other;
            return Intrinsics.d(this.text, selectionItemDescriptionTitleDTO.text) && Intrinsics.d(this.status, selectionItemDescriptionTitleDTO.status);
        }

        public final BadgeDTO getStatus() {
            return this.status;
        }

        @NotNull
        public final ExpandableTextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            BadgeDTO badgeDTO = this.status;
            return hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "SelectionItemDescriptionTitleDTO(text=" + this.text + ", status=" + this.status + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$SocialHeaderDTO;", "", "subscribe", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subscribed", "isSubscribed", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "getSubscribe", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribed", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SocialHeaderDTO {
        public static final int $stable = CellDTO.$stable;
        private final boolean isSubscribed;

        @NotNull
        private final CellDTO subscribe;

        @NotNull
        private final CellDTO subscribed;

        public SocialHeaderDTO(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean z11) {
            Intrinsics.checkNotNullParameter(subscribe, "subscribe");
            Intrinsics.checkNotNullParameter(subscribed, "subscribed");
            this.subscribe = subscribe;
            this.subscribed = subscribed;
            this.isSubscribed = z11;
        }

        public static /* synthetic */ SocialHeaderDTO copy$default(SocialHeaderDTO socialHeaderDTO, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = socialHeaderDTO.subscribe;
            }
            if ((i11 & 2) != 0) {
                cellDTO2 = socialHeaderDTO.subscribed;
            }
            if ((i11 & 4) != 0) {
                z11 = socialHeaderDTO.isSubscribed;
            }
            return socialHeaderDTO.copy(cellDTO, cellDTO2, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getSubscribe() {
            return this.subscribe;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getSubscribed() {
            return this.subscribed;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSubscribed() {
            return this.isSubscribed;
        }

        @NotNull
        public final SocialHeaderDTO copy(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean isSubscribed) {
            Intrinsics.checkNotNullParameter(subscribe, "subscribe");
            Intrinsics.checkNotNullParameter(subscribed, "subscribed");
            return new SocialHeaderDTO(subscribe, subscribed, isSubscribed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SocialHeaderDTO)) {
                return false;
            }
            SocialHeaderDTO socialHeaderDTO = (SocialHeaderDTO) other;
            return Intrinsics.d(this.subscribe, socialHeaderDTO.subscribe) && Intrinsics.d(this.subscribed, socialHeaderDTO.subscribed) && this.isSubscribed == socialHeaderDTO.isSubscribed;
        }

        @NotNull
        public final CellDTO getSubscribe() {
            return this.subscribe;
        }

        @NotNull
        public final CellDTO getSubscribed() {
            return this.subscribed;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSubscribed) + Bi.b.c(this.subscribed, this.subscribe.hashCode() * 31, 31);
        }

        public final boolean isSubscribed() {
            return this.isSubscribed;
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.subscribe;
            CellDTO cellDTO2 = this.subscribed;
            boolean z11 = this.isSubscribed;
            StringBuilder sb2 = new StringBuilder("SocialHeaderDTO(subscribe=");
            sb2.append(cellDTO);
            sb2.append(", subscribed=");
            sb2.append(cellDTO2);
            sb2.append(", isSubscribed=");
            return Pk0.a.a(")", sb2, z11);
        }
    }

    public SelectionItemDescriptionDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "socialHeader", name = "SOCIAL_HEADER", type = SocialHeaderDTO.class), @ProtoOneOfSignature(fieldName = "title", name = "TITLE", type = SelectionItemDescriptionTitleDTO.class), @ProtoOneOfSignature(fieldName = "plainText", name = "PLAIN_TEXT", type = PlainTextDTO.class), @ProtoOneOfSignature(fieldName = "expandableText", name = "EXPANDABLE_TEXT", type = ExpandableTextDTO.class), @ProtoOneOfSignature(fieldName = "spacer", name = "SPACER", type = SeparatorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, @NotNull ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        this.items = items;
        this.trackingInfo = map;
        this.linkClickTrackingInfo = map2;
        this.scrollPosition = scrollPosition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionItemDescriptionDTO copy$default(SelectionItemDescriptionDTO selectionItemDescriptionDTO, List list, Map map, Map map2, ScrollPosition scrollPosition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = selectionItemDescriptionDTO.items;
        }
        if ((i11 & 2) != 0) {
            map = selectionItemDescriptionDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            map2 = selectionItemDescriptionDTO.linkClickTrackingInfo;
        }
        if ((i11 & 8) != 0) {
            scrollPosition = selectionItemDescriptionDTO.scrollPosition;
        }
        return selectionItemDescriptionDTO.copy(list, map, map2, scrollPosition);
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.linkClickTrackingInfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    @NotNull
    public final SelectionItemDescriptionDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "socialHeader", name = "SOCIAL_HEADER", type = SocialHeaderDTO.class), @ProtoOneOfSignature(fieldName = "title", name = "TITLE", type = SelectionItemDescriptionTitleDTO.class), @ProtoOneOfSignature(fieldName = "plainText", name = "PLAIN_TEXT", type = PlainTextDTO.class), @ProtoOneOfSignature(fieldName = "expandableText", name = "EXPANDABLE_TEXT", type = ExpandableTextDTO.class), @ProtoOneOfSignature(fieldName = "spacer", name = "SPACER", type = SeparatorDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> linkClickTrackingInfo, @NotNull ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        return new SelectionItemDescriptionDTO(items, trackingInfo, linkClickTrackingInfo, scrollPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionItemDescriptionDTO)) {
            return false;
        }
        SelectionItemDescriptionDTO selectionItemDescriptionDTO = (SelectionItemDescriptionDTO) other;
        return Intrinsics.d(this.items, selectionItemDescriptionDTO.items) && Intrinsics.d(this.trackingInfo, selectionItemDescriptionDTO.trackingInfo) && Intrinsics.d(this.linkClickTrackingInfo, selectionItemDescriptionDTO.linkClickTrackingInfo) && this.scrollPosition == selectionItemDescriptionDTO.scrollPosition;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getLinkClickTrackingInfo() {
        return this.linkClickTrackingInfo;
    }

    @NotNull
    public final ScrollPosition getScrollPosition() {
        return this.scrollPosition;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.linkClickTrackingInfo;
        return this.scrollPosition.hashCode() + ((hashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "SelectionItemDescriptionDTO(items=" + this.items + ", trackingInfo=" + this.trackingInfo + ", linkClickTrackingInfo=" + this.linkClickTrackingInfo + ", scrollPosition=" + this.scrollPosition + ")";
    }
}
