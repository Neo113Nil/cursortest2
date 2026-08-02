package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle;

import B0.C2454a;
import D3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SubListPositioned;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJD\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0015R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b&\u0010\u0015¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SubListPositioned;", "", "id", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "text", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "status", "", "subListIndex", "subListSize", "<init>", "(JLru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;II)V", "copy", "(JLru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;II)Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getStatus", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "I", "getSubListIndex", "getSubListSize", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DescriptionTitleVO implements c, SubListPositioned {
    public static final int $stable = ExpandableTextDTO.$stable;
    private final long id;
    private final BadgeDTO status;
    private final int subListIndex;
    private final int subListSize;

    @NotNull
    private final ExpandableTextDTO text;

    public DescriptionTitleVO(long j11, @NotNull ExpandableTextDTO text, BadgeDTO badgeDTO, int i11, int i12) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.text = text;
        this.status = badgeDTO;
        this.subListIndex = i11;
        this.subListSize = i12;
    }

    public static /* synthetic */ DescriptionTitleVO copy$default(DescriptionTitleVO descriptionTitleVO, long j11, ExpandableTextDTO expandableTextDTO, BadgeDTO badgeDTO, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = descriptionTitleVO.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            expandableTextDTO = descriptionTitleVO.text;
        }
        ExpandableTextDTO expandableTextDTO2 = expandableTextDTO;
        if ((i13 & 4) != 0) {
            badgeDTO = descriptionTitleVO.status;
        }
        BadgeDTO badgeDTO2 = badgeDTO;
        if ((i13 & 8) != 0) {
            i11 = descriptionTitleVO.subListIndex;
        }
        int i14 = i11;
        if ((i13 & 16) != 0) {
            i12 = descriptionTitleVO.subListSize;
        }
        return descriptionTitleVO.copy(j12, expandableTextDTO2, badgeDTO2, i14, i12);
    }

    @NotNull
    public final DescriptionTitleVO copy(long id2, @NotNull ExpandableTextDTO text, BadgeDTO status, int subListIndex, int subListSize) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new DescriptionTitleVO(id2, text, status, subListIndex, subListSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DescriptionTitleVO)) {
            return false;
        }
        DescriptionTitleVO descriptionTitleVO = (DescriptionTitleVO) other;
        return this.id == descriptionTitleVO.id && Intrinsics.d(this.text, descriptionTitleVO.text) && Intrinsics.d(this.status, descriptionTitleVO.status) && this.subListIndex == descriptionTitleVO.subListIndex && this.subListSize == descriptionTitleVO.subListSize;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final BadgeDTO getStatus() {
        return this.status;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SubListPositioned
    public int getSubListIndex() {
        return this.subListIndex;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SubListPositioned
    public int getSubListSize() {
        return this.subListSize;
    }

    @NotNull
    public final ExpandableTextDTO getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.text.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        BadgeDTO badgeDTO = this.status;
        return Integer.hashCode(this.subListSize) + C2454a.a(this.subListIndex, (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ExpandableTextDTO expandableTextDTO = this.text;
        BadgeDTO badgeDTO = this.status;
        int i11 = this.subListIndex;
        int i12 = this.subListSize;
        StringBuilder sb2 = new StringBuilder("DescriptionTitleVO(id=");
        sb2.append(j11);
        sb2.append(", text=");
        sb2.append(expandableTextDTO);
        sb2.append(", status=");
        sb2.append(badgeDTO);
        sb2.append(", subListIndex=");
        sb2.append(i11);
        return h.b(sb2, ", subListSize=", i12, ")");
    }

    public /* synthetic */ DescriptionTitleVO(long j11, ExpandableTextDTO expandableTextDTO, BadgeDTO badgeDTO, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, expandableTextDTO, badgeDTO, (i13 & 8) != 0 ? -1 : i11, (i13 & 16) != 0 ? -1 : i12);
    }
}
