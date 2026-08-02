package ru.ozon.app.android.advertising;

import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke", "()Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FirebaseAdvertisingService$firebaseAppInstanceId$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ FirebaseAdvertisingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FirebaseAdvertisingService$firebaseAppInstanceId$2(FirebaseAdvertisingService firebaseAdvertisingService) {
        super(0);
        this.this$0 = firebaseAdvertisingService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        FirebaseAnalytics firebaseAnalytics;
        firebaseAnalytics = this.this$0.firebaseAnalytics;
        return (String) Tasks.await(firebaseAnalytics.a(), 30000L, TimeUnit.MILLISECONDS);
    }
}
