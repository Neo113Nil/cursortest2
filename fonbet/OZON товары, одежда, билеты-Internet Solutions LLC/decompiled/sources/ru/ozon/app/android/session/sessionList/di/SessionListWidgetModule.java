package ru.ozon.app.android.session.sessionList.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.session.sessionList.data.SessionListConfig;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionTitleViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.CurrentSessionViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListAnnotationViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListHeaderViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListLogoutButtonViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListTitleViewMapper;
import ru.ozon.app.android.session.sessionList.mapper.SessionListViewMapper;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/sessionList/di/SessionListWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/session/sessionList/data/SessionListConfig;", "currentSessionTitleViewMapper", "Lru/ozon/app/android/session/sessionList/mapper/CurrentSessionTitleViewMapper;", "logoutButtonViewMapper", "Lru/ozon/app/android/session/sessionList/mapper/SessionListLogoutButtonViewMapper;", "annotationViewMapper", "Lru/ozon/app/android/session/sessionList/mapper/SessionListAnnotationViewMapper;", "currentSessionViewMapper", "Lru/ozon/app/android/session/sessionList/mapper/CurrentSessionViewMapper;", "listTitleViewMapper", "Lru/ozon/app/android/session/sessionList/mapper/SessionListTitleViewMapper;", "headerViewMapper", "Lru/ozon/app/android/session/sessionList/mapper/SessionListHeaderViewMapper;", "listViewMapper", "Lru/ozon/app/android/session/sessionList/mapper/SessionListViewMapper;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SessionListWidgetModule {

    @NotNull
    public static final SessionListWidgetModule INSTANCE = new SessionListWidgetModule();

    private SessionListWidgetModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull SessionListConfig config, @NotNull CurrentSessionTitleViewMapper currentSessionTitleViewMapper, @NotNull SessionListLogoutButtonViewMapper logoutButtonViewMapper, @NotNull SessionListAnnotationViewMapper annotationViewMapper, @NotNull CurrentSessionViewMapper currentSessionViewMapper, @NotNull SessionListTitleViewMapper listTitleViewMapper, @NotNull SessionListHeaderViewMapper headerViewMapper, @NotNull SessionListViewMapper listViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(currentSessionTitleViewMapper, "currentSessionTitleViewMapper");
        Intrinsics.checkNotNullParameter(logoutButtonViewMapper, "logoutButtonViewMapper");
        Intrinsics.checkNotNullParameter(annotationViewMapper, "annotationViewMapper");
        Intrinsics.checkNotNullParameter(currentSessionViewMapper, "currentSessionViewMapper");
        Intrinsics.checkNotNullParameter(listTitleViewMapper, "listTitleViewMapper");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(listViewMapper, "listViewMapper");
        return new Widget2("csma", "sessionList", config, new ViewMapper2[]{annotationViewMapper, headerViewMapper, currentSessionTitleViewMapper, currentSessionViewMapper, listTitleViewMapper, listViewMapper, logoutButtonViewMapper});
    }
}
