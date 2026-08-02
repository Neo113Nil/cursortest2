package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.mediarouter.app.MediaRouteButton;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.d;
import com.blaze.blazesdk.features.search.ui.SearchActivity;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.cast.framework.CastContext;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ufl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ufl(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new vgl(((ifl) obj).a));
                break;
            case 1:
                ((Function1) obj2).invoke(new ahl(((sil) obj).a));
                break;
            case 2:
                ((Function1) obj2).invoke(Integer.valueOf(((wci) obj).a));
                break;
            case 3:
                BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler = (BlazeComposeWidgetStoriesStateHandler) obj2;
                BlazeComposeWidgetStoriesStateHandler.updateDataSource$default(blazeComposeWidgetStoriesStateHandler, new BlazeDataSourceType.Ids(a.c(((n5c) obj).a.getSdkId()), null, null, 6, null), false, 2, null);
                blazeComposeWidgetStoriesStateHandler.reloadData(true);
                break;
            case 4:
                ((Function1) obj2).invoke(new e2c((o5c) obj));
                break;
            case 5:
                break;
            case 6:
                ((Function1) obj2).invoke(((acm) obj).a());
                break;
            case 7:
                ((e1d) obj).setValue("");
                prl prlVar = (prl) ((SearchActivity) obj2).b.getValue();
                prlVar.g();
                prlVar.f();
                break;
            case 8:
                break;
            case 9:
                BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
                gzk gzkVar = gzk.a;
                String C = ((w3m) obj2).C();
                blazePlayerType.getClass();
                BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
                Application application$blazesdk_release = blazeSDK.getApplication$blazesdk_release();
                if (application$blazesdk_release != null) {
                    try {
                        Intent intent = new Intent("player_broadcast");
                        intent.putExtra("on_trigger_key_broadcaster_id", C);
                        intent.putExtra("player_type", (Parcelable) blazePlayerType);
                        intent.putExtra("player_broadcast_event_type", (Parcelable) d.PLAYER_EXITED_FULLSCREEN);
                        LocalBroadcastManager.getInstance(application$blazesdk_release).sendBroadcast(intent);
                        gzk.b.add(intent);
                    } catch (Throwable th) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    }
                } else {
                    blazeSDK.getGlobalThrowableCatcher$blazesdk_release().invoke(otl.a, null);
                }
                break;
            case 10:
                m0m m0mVar = (m0m) obj2;
                int i2 = m0m.e;
                m0mVar.getClass();
                Object fromJson = new Gson().fromJson((String) obj, new g7m().f);
                fromJson.getClass();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) fromJson).entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    Pair pair = (str2 == null || str2.equals("null")) ? null : new Pair(str, str2);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                Map o = tub.o(arrayList);
                cim cimVar = m0mVar.c;
                if (cimVar != null) {
                    cimVar.a(o);
                }
                break;
            case 11:
                break;
            case 12:
                Function0 function0 = (Function0) obj;
                if (((ovm) obj2).a.a(erm.PLAYER)) {
                    function0.invoke();
                }
                break;
            case 13:
                ((View) obj2).setAlpha(1.0f);
                ((Function0) obj).invoke();
                break;
            case 14:
                e0n e0nVar = (e0n) obj2;
                BlazeVideosPlayerStyle blazeVideosPlayerStyle = (BlazeVideosPlayerStyle) obj;
                uxm uxmVar = e0nVar.b;
                if (blazeVideosPlayerStyle.getCast().isVisible()) {
                    MediaRouteButton mediaRouteButton = uxmVar.i;
                    mediaRouteButton.getClass();
                    Context context = mediaRouteButton.getContext();
                    context.getClass();
                    try {
                        CastContext.c(context).getClass();
                        CastButtonFactory.a(context, mediaRouteButton);
                    } catch (Exception unused) {
                    }
                    mediaRouteButton.getLayoutParams().width = blazeVideosPlayerStyle.getCast().getWidth().getToPx$blazesdk_release();
                    mediaRouteButton.getLayoutParams().height = blazeVideosPlayerStyle.getCast().getHeight().getToPx$blazesdk_release();
                    mediaRouteButton.setOnClickListener(new b0n(e0nVar, 3));
                    mediaRouteButton.setVisibility(0);
                } else {
                    MediaRouteButton mediaRouteButton2 = uxmVar.i;
                    mediaRouteButton2.getClass();
                    mediaRouteButton2.setVisibility(8);
                }
                break;
            default:
                ((Function1) obj2).invoke(((e0n) obj).b);
                break;
        }
        return Unit.a;
    }
}
