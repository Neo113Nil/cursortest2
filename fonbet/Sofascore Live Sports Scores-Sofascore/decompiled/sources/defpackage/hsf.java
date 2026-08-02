package defpackage;

import android.os.Bundle;
import com.sofascore.results.referee.RefereeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hsf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RefereeActivity b;

    public /* synthetic */ hsf(RefereeActivity refereeActivity, int i) {
        this.a = i;
        this.b = refereeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        RefereeActivity refereeActivity = this.b;
        switch (i) {
            case 0:
                int i2 = RefereeActivity.R;
                Bundle extras = refereeActivity.getIntent().getExtras();
                break;
            case 1:
                int i3 = RefereeActivity.R;
                break;
            case 2:
                int i4 = RefereeActivity.R;
                refereeActivity.N();
                break;
            default:
                int i5 = RefereeActivity.R;
                ((ftf) refereeActivity.O.getValue()).F();
                break;
        }
        return Unit.a;
    }
}
