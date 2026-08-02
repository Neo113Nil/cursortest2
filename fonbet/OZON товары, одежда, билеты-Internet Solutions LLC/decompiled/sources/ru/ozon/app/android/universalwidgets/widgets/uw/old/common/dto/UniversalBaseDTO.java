package ru.ozon.app.android.universalwidgets.widgets.uw.old.common.dto;

import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.common.footer.UniversalFooterDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.common.header.UniversalHeaderDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/dto/UniversalBaseDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/header/UniversalHeaderDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/footer/UniversalFooterDTO;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/header/UniversalHeaderDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/footer/UniversalFooterDTO;)V", "getHeader", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/header/UniversalHeaderDTO;", "getFooter", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/footer/UniversalFooterDTO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class UniversalBaseDTO {
    private final UniversalFooterDTO footer;
    private final UniversalHeaderDTO header;

    public UniversalBaseDTO(UniversalHeaderDTO universalHeaderDTO, UniversalFooterDTO universalFooterDTO) {
        this.header = universalHeaderDTO;
        this.footer = universalFooterDTO;
    }

    public UniversalFooterDTO getFooter() {
        return this.footer;
    }

    public UniversalHeaderDTO getHeader() {
        return this.header;
    }
}
