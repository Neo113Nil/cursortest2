package ru.ozon.app.android.fresh.common.widgets.header;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R8\u0010\u000f\u001a&\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\n\b\u0001\u0012\u00060\nj\u0002`\u000b0\u0007j\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/header/HeaderApi;", "", "Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/common/widgets/header/HeaderState;", "toHeaderDTO", "(Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;)Lru/ozon/app/android/fresh/common/widgets/header/HeaderState;", "Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/fresh/common/widgets/header/ViewMapper;", "getViewMapper", "()Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "viewMapper", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HeaderApi {
    @NotNull
    ViewMapper2<? extends InterfaceC6958a, ? extends HeaderState, ? extends c> getViewMapper();

    @NotNull
    HeaderState toHeaderDTO(@NotNull CommonHeaderDTO header);
}
