package ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation;

import Ae.E0;
import Ae.w0;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsEventHolder;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolderImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event;", "event", "", "postEvent", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsEventHolder$Event;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/w0;", "events", "LAe/w0;", "getEvents", "()LAe/w0;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccompanyingDocsEventHolderImpl implements AccompanyingDocsEventHolder {

    @NotNull
    private final w0<AccompanyingDocsEventHolder.Event> events = E0.b(0, 0, null, 7);

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsEventHolder
    public Object postEvent(@NotNull AccompanyingDocsEventHolder.Event event, @NotNull d<? super Unit> dVar) {
        Object emit = getEvents().emit(event, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsEventHolder
    @NotNull
    public w0<AccompanyingDocsEventHolder.Event> getEvents() {
        return this.events;
    }
}
