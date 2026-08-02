package ru.ozon.app.android.fresh.feature.b2b.widgets.trustFactors.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO;", "", "groups", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO;", "<init>", "(Ljava/util/List;)V", "getGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GroupDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TrustFactorsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<GroupDTO> groups;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "list", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO$IconTextItemDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "IconTextItemDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class GroupDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<IconTextItemDTO> list;

        @NotNull
        private final TextDTO title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/trustFactors/data/TrustFactorsDTO$GroupDTO$IconTextItemDTO;", "", "leftIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getLeftIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class IconTextItemDTO {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO leftIcon;

            @NotNull
            private final TextDTO title;

            public IconTextItemDTO(@NotNull IconDTO leftIcon, @NotNull TextDTO title) {
                Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
                Intrinsics.checkNotNullParameter(title, "title");
                this.leftIcon = leftIcon;
                this.title = title;
            }

            public static /* synthetic */ IconTextItemDTO copy$default(IconTextItemDTO iconTextItemDTO, IconDTO iconDTO, TextDTO textDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = iconTextItemDTO.leftIcon;
                }
                if ((i11 & 2) != 0) {
                    textDTO = iconTextItemDTO.title;
                }
                return iconTextItemDTO.copy(iconDTO, textDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconDTO getLeftIcon() {
                return this.leftIcon;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            public final IconTextItemDTO copy(@NotNull IconDTO leftIcon, @NotNull TextDTO title) {
                Intrinsics.checkNotNullParameter(leftIcon, "leftIcon");
                Intrinsics.checkNotNullParameter(title, "title");
                return new IconTextItemDTO(leftIcon, title);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IconTextItemDTO)) {
                    return false;
                }
                IconTextItemDTO iconTextItemDTO = (IconTextItemDTO) other;
                return Intrinsics.d(this.leftIcon, iconTextItemDTO.leftIcon) && Intrinsics.d(this.title, iconTextItemDTO.title);
            }

            @NotNull
            public final IconDTO getLeftIcon() {
                return this.leftIcon;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode() + (this.leftIcon.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "IconTextItemDTO(leftIcon=" + this.leftIcon + ", title=" + this.title + ")";
            }
        }

        public GroupDTO(@NotNull TextDTO title, @NotNull List<IconTextItemDTO> list) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(list, "list");
            this.title = title;
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GroupDTO copy$default(GroupDTO groupDTO, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = groupDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = groupDTO.list;
            }
            return groupDTO.copy(textDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final List<IconTextItemDTO> component2() {
            return this.list;
        }

        @NotNull
        public final GroupDTO copy(@NotNull TextDTO title, @NotNull List<IconTextItemDTO> list) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(list, "list");
            return new GroupDTO(title, list);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupDTO)) {
                return false;
            }
            GroupDTO groupDTO = (GroupDTO) other;
            return Intrinsics.d(this.title, groupDTO.title) && Intrinsics.d(this.list, groupDTO.list);
        }

        @NotNull
        public final List<IconTextItemDTO> getList() {
            return this.list;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.list.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "GroupDTO(title=" + this.title + ", list=" + this.list + ")";
        }
    }

    public TrustFactorsDTO(@NotNull List<GroupDTO> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.groups = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrustFactorsDTO copy$default(TrustFactorsDTO trustFactorsDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = trustFactorsDTO.groups;
        }
        return trustFactorsDTO.copy(list);
    }

    @NotNull
    public final List<GroupDTO> component1() {
        return this.groups;
    }

    @NotNull
    public final TrustFactorsDTO copy(@NotNull List<GroupDTO> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new TrustFactorsDTO(groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TrustFactorsDTO) && Intrinsics.d(this.groups, ((TrustFactorsDTO) other).groups);
    }

    @NotNull
    public final List<GroupDTO> getGroups() {
        return this.groups;
    }

    public int hashCode() {
        return this.groups.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("TrustFactorsDTO(groups=", ")", this.groups);
    }
}
