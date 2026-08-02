package ru.ozon.app.android.initializers.user;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.logger.BxLogger;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class UserStateActionInitializer$init$2 extends C7719a implements Function2<String, d<? super Unit>, Object> {
    UserStateActionInitializer$init$2(Object obj) {
        super(2, obj, BxLogger.class, "setUserId", "setUserId(Ljava/lang/String;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        Object init$setUserId;
        init$setUserId = UserStateActionInitializer.init$setUserId((BxLogger) this.receiver, str, dVar);
        return init$setUserId;
    }
}
