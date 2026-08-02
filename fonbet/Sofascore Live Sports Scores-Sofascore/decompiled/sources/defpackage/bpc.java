package defpackage;

import android.os.Bundle;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bpc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaOrganisationActivity b;

    public /* synthetic */ bpc(MmaOrganisationActivity mmaOrganisationActivity, int i) {
        this.a = i;
        this.b = mmaOrganisationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MmaOrganisationActivity mmaOrganisationActivity = this.b;
        switch (i) {
            case 0:
                int i2 = MmaOrganisationActivity.T;
                Bundle extras = mmaOrganisationActivity.getIntent().getExtras();
                break;
            case 1:
                int i3 = MmaOrganisationActivity.T;
                break;
            case 2:
                int i4 = MmaOrganisationActivity.T;
                mmaOrganisationActivity.N();
                break;
            default:
                int i5 = MmaOrganisationActivity.T;
                ((cqc) mmaOrganisationActivity.P.getValue()).F();
                break;
        }
        return Unit.a;
    }
}
