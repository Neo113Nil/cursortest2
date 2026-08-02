package ru.ozon.app.android.fresh.main.widgets.header.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.fresh.common.widgets.header.CommonHeaderDTO;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderApi;
import ru.ozon.app.android.fresh.common.widgets.header.HeaderState;
import ru.ozon.app.android.fresh.main.widgets.header.data.HeaderDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B3\u0012*\u0010\t\u001a&\u0012\n\b\u0001\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u00070\u0002j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR>\u0010\t\u001a&\u0012\n\b\u0001\u0012\u00060\u0003j\u0002`\u0004\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\n\b\u0001\u0012\u00060\u0006j\u0002`\u00070\u0002j\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/header/di/HeaderApiImpl;", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/common/widgets/header/HeaderState;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/fresh/main/widgets/header/di/ViewMapper;", "viewMapper", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;)V", "Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "toHeaderDTO", "(Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;)Lru/ozon/app/android/fresh/common/widgets/header/HeaderState;", "Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "getViewMapper", "()Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderApiImpl implements HeaderApi {

    @NotNull
    private final ViewMapper2<? extends InterfaceC6958a, ? extends HeaderState, ? extends c> viewMapper;

    public HeaderApiImpl(@NotNull ViewMapper2<? extends InterfaceC6958a, ? extends HeaderState, ? extends c> viewMapper) {
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        this.viewMapper = viewMapper;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.header.HeaderApi
    @NotNull
    public ViewMapper2<? extends InterfaceC6958a, ? extends HeaderState, ? extends c> getViewMapper() {
        return this.viewMapper;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.header.HeaderApi
    @NotNull
    public HeaderState toHeaderDTO(@NotNull CommonHeaderDTO header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new HeaderDTO(header.getTitle(), header.getSubtitle(), header.getBadge(), header.getBackgroundColor(), header.getAction(), header.getTrackingInfo(), header.getTopCornerRadius(), new HeaderDTO.MarginsDTO(header.getMargins().getLeftMargin(), header.getMargins().getTopMargin(), header.getMargins().getRightMargin(), header.getMargins().getBottomMargin()), header.getWidgetScrollKey());
    }
}
