package defpackage;

import android.os.Bundle;
import com.android.billingclient.api.ProductDetails;
import com.sofascore.results.profile.view.WeeklyStreakRestoreModal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p5l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyStreakRestoreModal b;

    public /* synthetic */ p5l(WeeklyStreakRestoreModal weeklyStreakRestoreModal, int i) {
        this.a = i;
        this.b = weeklyStreakRestoreModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r4l r4lVar;
        int i = this.a;
        WeeklyStreakRestoreModal weeklyStreakRestoreModal = this.b;
        switch (i) {
            case 0:
                Bundle arguments = weeklyStreakRestoreModal.getArguments();
                return Integer.valueOf(arguments != null ? arguments.getInt("STREAK_COUNT") : 0);
            case 1:
                Bundle arguments2 = weeklyStreakRestoreModal.getArguments();
                return Long.valueOf(arguments2 != null ? arguments2.getLong("LEAGUE_END_TIMESTAMP") : 0L);
            default:
                ProductDetails productDetails = WeeklyStreakRestoreModal.A;
                if (productDetails != null && (r4lVar = WeeklyStreakRestoreModal.B) != null) {
                    r4lVar.invoke(productDetails);
                }
                weeklyStreakRestoreModal.j();
                return Unit.a;
        }
    }
}
