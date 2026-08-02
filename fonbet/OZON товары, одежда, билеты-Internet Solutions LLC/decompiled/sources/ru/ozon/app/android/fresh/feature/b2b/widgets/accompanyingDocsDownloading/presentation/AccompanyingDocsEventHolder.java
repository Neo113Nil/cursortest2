package ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event;", "event", "", "postEvent", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/h;", "getEvents", "()LAe/h;", "events", "Event", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AccompanyingDocsEventHolder {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event;", "", "Refresh", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event$Refresh;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Event {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event$Refresh;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event;", "<init>", "()V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Refresh implements Event {

            @NotNull
            public static final Refresh INSTANCE = new Refresh();

            private Refresh() {
            }
        }
    }

    @NotNull
    InterfaceC2395h<Event> getEvents();

    Object postEvent(@NotNull Event event, @NotNull d<? super Unit> dVar);
}
