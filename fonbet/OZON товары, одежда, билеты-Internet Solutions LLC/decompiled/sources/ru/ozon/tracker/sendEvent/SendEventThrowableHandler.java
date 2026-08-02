package ru.ozon.tracker.sendEvent;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.DbEvent;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/tracker/sendEvent/SendEventThrowableHandler;", "", "", "throwable", "", "Lru/ozon/tracker/db/entities/DbEvent;", "batch", "", "handleThrowable", "(Ljava/lang/Throwable;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SendEventThrowableHandler {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static Object handleThrowable$default(SendEventThrowableHandler sendEventThrowableHandler, Throwable th2, List list, d dVar, int i11, Object obj) throws Throwable {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleThrowable");
            }
            if ((i11 & 2) != 0) {
                list = K.f71697a;
            }
            return sendEventThrowableHandler.handleThrowable(th2, list, dVar);
        }
    }

    Object handleThrowable(@NotNull Throwable th2, @NotNull List<DbEvent> list, @NotNull d<? super Unit> dVar) throws Throwable;
}
