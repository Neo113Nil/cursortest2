package ru.ozon.app.android.travel.logger;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import sj.a;
import sj.d;
import sj.e;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsj/d;", "invoke", "()Lsj/d;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TravelActionNonFatalLogger$ozonLogger$2 extends AbstractC7737t implements Function0<d> {
    public static final TravelActionNonFatalLogger$ozonLogger$2 INSTANCE = new TravelActionNonFatalLogger$ozonLogger$2();

    TravelActionNonFatalLogger$ozonLogger$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final d invoke() {
        return e.f98817f.q(new a("Travel", "ActionV2NetworkErrors", null));
    }
}
