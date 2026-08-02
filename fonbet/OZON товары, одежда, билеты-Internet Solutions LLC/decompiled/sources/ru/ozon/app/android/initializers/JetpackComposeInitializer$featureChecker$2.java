package ru.ozon.app.android.initializers;

import Ib.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class JetpackComposeInitializer$featureChecker$2 extends C7735q implements Function0<FeatureChecker> {
    JetpackComposeInitializer$featureChecker$2(Object obj) {
        super(0, obj, a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FeatureChecker invoke() {
        return (FeatureChecker) ((a) this.receiver).get();
    }
}
