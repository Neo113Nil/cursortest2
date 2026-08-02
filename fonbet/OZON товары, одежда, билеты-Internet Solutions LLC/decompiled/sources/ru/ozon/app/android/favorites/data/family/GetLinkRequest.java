package ru.ozon.app.android.favorites.data.family;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/favorites/data/family/GetLinkRequest;", "", "linkType", "Lru/ozon/app/android/favorites/data/family/GetLinkRequest$LinkType;", "link", "", "<init>", "(Lru/ozon/app/android/favorites/data/family/GetLinkRequest$LinkType;Ljava/lang/String;)V", "getLinkType", "()Lru/ozon/app/android/favorites/data/family/GetLinkRequest$LinkType;", "getLink", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LinkType", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetLinkRequest {
    private final String link;

    @NotNull
    private final LinkType linkType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/favorites/data/family/GetLinkRequest$LinkType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "INVITE", "FAMILY_JOIN_WITH_PDP", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LinkType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LinkType[] $VALUES;
        public static final LinkType UNDEFINED = new LinkType("UNDEFINED", 0);
        public static final LinkType INVITE = new LinkType("INVITE", 1);
        public static final LinkType FAMILY_JOIN_WITH_PDP = new LinkType("FAMILY_JOIN_WITH_PDP", 2);

        private static final /* synthetic */ LinkType[] $values() {
            return new LinkType[]{UNDEFINED, INVITE, FAMILY_JOIN_WITH_PDP};
        }

        static {
            LinkType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LinkType(String str, int i11) {
        }

        public static LinkType valueOf(String str) {
            return (LinkType) Enum.valueOf(LinkType.class, str);
        }

        public static LinkType[] values() {
            return (LinkType[]) $VALUES.clone();
        }
    }

    public GetLinkRequest(@NotNull LinkType linkType, String str) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        this.linkType = linkType;
        this.link = str;
    }

    public static /* synthetic */ GetLinkRequest copy$default(GetLinkRequest getLinkRequest, LinkType linkType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkType = getLinkRequest.linkType;
        }
        if ((i11 & 2) != 0) {
            str = getLinkRequest.link;
        }
        return getLinkRequest.copy(linkType, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LinkType getLinkType() {
        return this.linkType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final GetLinkRequest copy(@NotNull LinkType linkType, String link) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        return new GetLinkRequest(linkType, link);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetLinkRequest)) {
            return false;
        }
        GetLinkRequest getLinkRequest = (GetLinkRequest) other;
        return this.linkType == getLinkRequest.linkType && Intrinsics.d(this.link, getLinkRequest.link);
    }

    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final LinkType getLinkType() {
        return this.linkType;
    }

    public int hashCode() {
        int hashCode = this.linkType.hashCode() * 31;
        String str = this.link;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "GetLinkRequest(linkType=" + this.linkType + ", link=" + this.link + ")";
    }
}
