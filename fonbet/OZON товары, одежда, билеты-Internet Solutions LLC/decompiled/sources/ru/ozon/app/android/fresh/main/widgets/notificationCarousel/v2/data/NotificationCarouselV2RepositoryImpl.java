package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2Repository;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2RepositoryImpl;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2Repository;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncRepository", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;", "mapper", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "requestAsyncUpdate", "(Ll20/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationCarouselV2RepositoryImpl implements NotificationCarouselV2Repository {

    @NotNull
    private final ComposerAsyncWidgetRepository asyncRepository;

    @NotNull
    private final NotificationCarouselV2Mapper mapper;

    public NotificationCarouselV2RepositoryImpl(@NotNull ComposerAsyncWidgetRepository asyncRepository, @NotNull NotificationCarouselV2Mapper mapper) {
        Intrinsics.checkNotNullParameter(asyncRepository, "asyncRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.asyncRepository = asyncRepository;
        this.mapper = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2Repository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestAsyncUpdate(@NotNull d dVar, @NotNull kotlin.coroutines.d<? super NotificationCarouselV2VO> dVar2) {
        NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1 notificationCarouselV2RepositoryImpl$requestAsyncUpdate$1;
        int i11;
        NotificationCarouselV2RepositoryImpl notificationCarouselV2RepositoryImpl;
        if (dVar2 instanceof NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1) {
            notificationCarouselV2RepositoryImpl$requestAsyncUpdate$1 = (NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1) dVar2;
            int i12 = notificationCarouselV2RepositoryImpl$requestAsyncUpdate$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                notificationCarouselV2RepositoryImpl$requestAsyncUpdate$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1 notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12 = notificationCarouselV2RepositoryImpl$requestAsyncUpdate$1;
                Object obj = notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    String a11 = dVar.c().a();
                    if (a11 == null) {
                        return null;
                    }
                    ComposerAsyncWidgetRepository composerAsyncWidgetRepository = this.asyncRepository;
                    notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12.L$0 = this;
                    notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12.L$1 = dVar;
                    notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12.label = 1;
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, a11, NotificationCarouselV2DTO.class, null, notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12, 4, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                    notificationCarouselV2RepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (d) notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12.L$1;
                    notificationCarouselV2RepositoryImpl = (NotificationCarouselV2RepositoryImpl) notificationCarouselV2RepositoryImpl$requestAsyncUpdate$12.L$0;
                    s.b(obj);
                }
                return C7714v.M(notificationCarouselV2RepositoryImpl.mapper.invoke((NotificationCarouselV2DTO) ((ComposerAsyncWidgetResponse) obj).getState(), dVar));
            }
        }
        notificationCarouselV2RepositoryImpl$requestAsyncUpdate$1 = new NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1(this, dVar2);
        NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1 notificationCarouselV2RepositoryImpl$requestAsyncUpdate$122 = notificationCarouselV2RepositoryImpl$requestAsyncUpdate$1;
        Object obj2 = notificationCarouselV2RepositoryImpl$requestAsyncUpdate$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = notificationCarouselV2RepositoryImpl$requestAsyncUpdate$122.label;
        if (i11 != 0) {
        }
        return C7714v.M(notificationCarouselV2RepositoryImpl.mapper.invoke((NotificationCarouselV2DTO) ((ComposerAsyncWidgetResponse) obj2).getState(), dVar));
    }
}
