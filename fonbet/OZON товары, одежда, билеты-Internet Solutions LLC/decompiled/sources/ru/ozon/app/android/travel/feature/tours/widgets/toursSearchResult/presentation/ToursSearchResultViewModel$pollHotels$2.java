package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel$pollHotels$2", f = "ToursSearchResultViewModel.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ToursSearchResultViewModel$pollHotels$2 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ToursSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultViewModel$pollHotels$2(ToursSearchResultViewModel toursSearchResultViewModel, d<? super ToursSearchResultViewModel$pollHotels$2> dVar) {
        super(2, dVar);
        this.this$0 = toursSearchResultViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ToursSearchResultViewModel$pollHotels$2(this.this$0, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0098 A[Catch: all -> 0x001b, CancellationException -> 0x001e, TryCatch #2 {CancellationException -> 0x001e, all -> 0x001b, blocks: (B:6:0x0014, B:9:0x0059, B:11:0x0098, B:12:0x00b8, B:14:0x0031, B:16:0x0037, B:19:0x0043, B:23:0x00be, B:25:0x00c4, B:52:0x00a0, B:56:0x002e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: all -> 0x001b, CancellationException -> 0x001e, TryCatch #2 {CancellationException -> 0x001e, all -> 0x001b, blocks: (B:6:0x0014, B:9:0x0059, B:11:0x0098, B:12:0x00b8, B:14:0x0031, B:16:0x0037, B:19:0x0043, B:23:0x00be, B:25:0x00c4, B:52:0x00a0, B:56:0x002e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be A[Catch: all -> 0x001b, CancellationException -> 0x001e, TryCatch #2 {CancellationException -> 0x001e, all -> 0x001b, blocks: (B:6:0x0014, B:9:0x0059, B:11:0x0098, B:12:0x00b8, B:14:0x0031, B:16:0x0037, B:19:0x0043, B:23:0x00be, B:25:0x00c4, B:52:0x00a0, B:56:0x002e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0 A[Catch: all -> 0x001b, CancellationException -> 0x001e, TryCatch #2 {CancellationException -> 0x001e, all -> 0x001b, blocks: (B:6:0x0014, B:9:0x0059, B:11:0x0098, B:12:0x00b8, B:14:0x0031, B:16:0x0037, B:19:0x0043, B:23:0x00be, B:25:0x00c4, B:52:0x00a0, B:56:0x002e), top: B:2:0x0008 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:12:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel$pollHotels$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ToursSearchResultViewModel$pollHotels$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
