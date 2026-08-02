package ru.ozon.uni.atoms.data.cell;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u001b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Lru/ozon/uni/atoms/data/cell/CellDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/DsAtomsType;", "common", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "context", "", "<init>", "(Lru/ozon/uni/atoms/data/DsAtomsType;Lru/ozon/uni/atoms/data/cell/CommonCellSettings;Ljava/lang/String;)V", "getCommon", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings;", "getContext", "()Ljava/lang/String;", "Lru/ozon/uni/atoms/data/cell/BadgeIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/BadgeTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/ButtonIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DataTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureBadgeIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureBadgeTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorBadgeIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorBadgeTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureIndicatorTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/IconButtonIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/IconButtonTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/IconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/IndicatorBadgeIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/IndicatorBadgeTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/IndicatorIconTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/IndicatorTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/OrderedListCellDTO;", "Lru/ozon/uni/atoms/data/cell/RadioTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/TitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/ToggleTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/cell/UnorderedListCellDTO;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class CellDTO extends AtomDTO {
    public static final int $stable = 8;
    private final CommonCellSettings common;
    private final String context;

    public /* synthetic */ CellDTO(DsAtomsType dsAtomsType, CommonCellSettings commonCellSettings, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsAtomsType, commonCellSettings, str);
    }

    public CommonCellSettings getCommon() {
        return this.common;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public /* synthetic */ CellDTO(DsAtomsType dsAtomsType, CommonCellSettings commonCellSettings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsAtomsType, commonCellSettings, (i11 & 4) != 0 ? null : str, null);
    }

    private CellDTO(DsAtomsType dsAtomsType, CommonCellSettings commonCellSettings, String str) {
        super(dsAtomsType, str, commonCellSettings != null ? commonCellSettings.getTrackingInfo() : null, commonCellSettings != null ? commonCellSettings.getTestInfo() : null);
        this.common = commonCellSettings;
        this.context = str;
    }
}
