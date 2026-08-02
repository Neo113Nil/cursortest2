package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.sofascore.results.R;
import com.sofascore.results.service.NotificationTextToSpeechService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hgd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Context s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hgd(int i, rq3 rq3Var, Context context) {
        super(2, rq3Var);
        this.r = i;
        this.s = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new hgd(0, rq3Var, this.s);
            case 1:
                return new hgd(1, rq3Var, this.s);
            case 2:
                return new hgd(2, rq3Var, this.s);
            default:
                return new hgd(3, rq3Var, this.s);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Context context = this.s;
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (i) {
            case 0:
                return ((hgd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 1:
                return ((hgd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
            case 2:
                return new hgd(2, rq3Var, context).invokeSuspend(Unit.a);
            default:
                return new hgd(3, rq3Var, context).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Context context = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                context.getClass();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    List<NotificationChannelGroup> notificationChannelGroups = notificationManager.getNotificationChannelGroups();
                    notificationChannelGroups.getClass();
                    Iterator<T> it = notificationChannelGroups.iterator();
                    while (it.hasNext()) {
                        notificationManager.deleteNotificationChannelGroup(((NotificationChannelGroup) it.next()).getId());
                    }
                    List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
                    notificationChannels.getClass();
                    Iterator<T> it2 = notificationChannels.iterator();
                    while (it2.hasNext()) {
                        notificationManager.deleteNotificationChannel(((NotificationChannel) it2.next()).getId());
                    }
                }
                NotificationManager notificationManager2 = (NotificationManager) context.getSystemService(NotificationManager.class);
                List<bsh> list = (List) jgd.c.getValue();
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                for (bsh bshVar : list) {
                    NotificationChannel notificationChannel = new NotificationChannel(bshVar.a, context.getString(bshVar.b), bshVar.c);
                    notificationChannel.enableLights(true);
                    notificationChannel.setLightColor(context.getColor(R.color.primary_default));
                    notificationChannel.enableVibration(true);
                    notificationChannel.setVibrationPattern(new long[]{0, 100, 200, 300});
                    notificationChannel.setLockscreenVisibility(1);
                    int i2 = bshVar.d;
                    String resourceEntryName = context.getResources().getResourceEntryName(i2);
                    Uri parse = Uri.parse("android.resource://" + context.getPackageName() + "/" + context.getResources().getResourceTypeName(i2) + "/" + resourceEntryName);
                    parse.getClass();
                    notificationChannel.setSound(parse, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                    arrayList.add(notificationChannel);
                }
                if (notificationManager2 != null) {
                    notificationManager2.createNotificationChannels(arrayList);
                }
                if (notificationManager2 != null) {
                    List<NotificationChannel> notificationChannels2 = notificationManager2.getNotificationChannels();
                    notificationChannels2.getClass();
                    boolean z = false;
                    for (NotificationChannel notificationChannel2 : notificationChannels2) {
                        String id = notificationChannel2.getId();
                        id.getClass();
                        if (!c.v(id, "channel_", false)) {
                            if (!z) {
                                try {
                                    context.stopService(new Intent(context, (Class<?>) NotificationTextToSpeechService.class));
                                    z = true;
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable unused) {
                                }
                            }
                            notificationManager2.deleteNotificationChannel(notificationChannel2.getId());
                        }
                    }
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                mha.F(context);
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return AdvertisingIdClient.getAdvertisingIdInfo(context);
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                MobileAds.initialize(context);
                return Unit.a;
        }
    }
}
