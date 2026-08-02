package ru.ozon.app.android.debugmenu.deeplink;

import Sc.s;
import Wc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.text.h;
import pZ.f;
import ru.ozon.app.android.video.player.playerpreferences.PlayerPreferences;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LpZ/f;", "<anonymous>", "()LpZ/f;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.debugmenu.deeplink.BlockVideoPlayingDeeplinkHandler$getDestination$1", f = "BlockVideoPlayingDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BlockVideoPlayingDeeplinkHandler$getDestination$1 extends j implements Function1<d<? super f>, Object> {
    final /* synthetic */ GZ.j $route;
    int label;
    final /* synthetic */ BlockVideoPlayingDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockVideoPlayingDeeplinkHandler$getDestination$1(GZ.j jVar, BlockVideoPlayingDeeplinkHandler blockVideoPlayingDeeplinkHandler, d<? super BlockVideoPlayingDeeplinkHandler$getDestination$1> dVar) {
        super(1, dVar);
        this.$route = jVar;
        this.this$0 = blockVideoPlayingDeeplinkHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new BlockVideoPlayingDeeplinkHandler$getDestination$1(this.$route, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Boolean t02;
        PlayerPreferences playerPreferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String queryParameter = this.$route.b().getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (queryParameter == null || (t02 = h.t0(queryParameter)) == null) {
            f.Companion.getClass();
            return f.NONE;
        }
        boolean booleanValue = t02.booleanValue();
        playerPreferences = this.this$0.videoPreferences;
        playerPreferences.changeBlockVideoPlaying(booleanValue);
        return new pZ.h(booleanValue ? "Блокировка воспроизведения включена" : "Блокировка воспроизведения выключена");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super f> dVar) {
        return ((BlockVideoPlayingDeeplinkHandler$getDestination$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
