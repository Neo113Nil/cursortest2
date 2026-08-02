package defpackage;

import android.app.Application;
import android.content.Context;
import android.widget.ImageView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerButtonStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.results.service.InfoWorker;
import com.sofascore.results.service.NewlyAddedEventsWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fa0 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ia0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa0(ia0 ia0Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = ia0Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ia0 ia0Var = this.s;
        switch (i) {
            case 0:
                return new fa0(ia0Var, rq3Var, 0);
            case 1:
                return new fa0(ia0Var, rq3Var, 1);
            default:
                return new fa0(ia0Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((fa0) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((fa0) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((fa0) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ia0 ia0Var = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                y65 y65Var = ia0Var.f;
                if (y65Var == null) {
                    Intrinsics.i("appDatabaseProvider");
                    throw null;
                }
                ((AppDatabase) y65Var.get()).getOpenHelper().getWritableDatabase();
                y65 y65Var2 = ia0Var.g;
                if (y65Var2 != null) {
                    y65Var2.get();
                    return Unit.a;
                }
                Intrinsics.i("sofaOkHttpClient");
                throw null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                ia0 ia0Var2 = ia0.q;
                if (!Intrinsics.c(ia0Var.e().getDataSharingOptOut(), Boolean.TRUE) && !y05.a(ia0Var)) {
                    BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
                    BlazeSDK.init$default(blazeSDK, "46b41c604534441088e585803c7c8c96", null, null, null, null, null, new ba0(), new aa0(), new w90(ia0Var, 1), null, 574, null);
                    BlazeStoryPlayerStyle base = BlazeStoryPlayerStyle.INSTANCE.base();
                    BlazeStoryPlayerButtonStyle mute = base.getButtons().getMute();
                    mute.setWidth(new BlazeDp(48));
                    mute.setHeight(new BlazeDp(48));
                    mute.setVisible(true);
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
                    mute.setScaleType(scaleType);
                    base.getButtons().getShare().setVisible(false);
                    BlazeStoryPlayerButtonStyle exit = base.getButtons().getExit();
                    exit.setWidth(new BlazeDp(48));
                    exit.setHeight(new BlazeDp(48));
                    exit.setVisible(true);
                    exit.setScaleType(scaleType);
                    base.getFirstTimeSlide().setShow(false);
                    blazeSDK.setDefaultStoryPlayerStyle(base);
                }
                return Unit.a;
            default:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ktd A = mha.A(new ktd(InfoWorker.class));
                mha.y(A);
                Context applicationContext = ia0Var.getApplicationContext();
                applicationContext.getClass();
                xbl d = xbl.d(applicationContext);
                d.getClass();
                String concat = "InfoWorker-".concat("");
                nf6 nf6Var = nf6.a;
                d.b(concat, nf6Var, (ltd) A.a());
                ktd A2 = mha.A(new ktd(NewlyAddedEventsWorker.class));
                mha.y(A2);
                Context applicationContext2 = ia0Var.getApplicationContext();
                applicationContext2.getClass();
                xbl d2 = xbl.d(applicationContext2);
                d2.getClass();
                d2.b("NewlyAddedEventsWorker-".concat(""), nf6Var, (ltd) A2.a());
                return Unit.a;
        }
    }
}
