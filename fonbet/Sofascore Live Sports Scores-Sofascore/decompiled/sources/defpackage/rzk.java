package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.internal.zzdt;
import com.sofascore.model.WearMessagingAction;
import com.sofascore.results.service.WatchService;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rzk extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ WatchService s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzk(WatchService watchService, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = watchService;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new rzk(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rzk) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        WatchService watchService = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                qa6 qa6Var = watchService.p;
                if (qa6Var == null) {
                    Intrinsics.i("dbRepository");
                    throw null;
                }
                this.r = 1;
                obj = qa6Var.l(this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            PutDataMapRequest b = PutDataMapRequest.b("/v2-message");
            HashMap hashMap = b.b.a;
            hashMap.put("mcc", Integer.valueOf(ke0.c));
            hashMap.put(PglCryptUtils.KEY_MESSAGE, vga.a.c(WearMessagingAction.INSTANCE.serializer(), new WearMessagingAction.EventData((List) obj)));
            hashMap.put("time", Long.valueOf(new Date().getTime()));
            PutDataRequest a = b.a();
            a.d = 0L;
            Api api = Wearable.a;
            new zzdt(watchService, GoogleApi.Settings.c).i(a);
            watchService.l = false;
        } catch (IOException e) {
            ugj.a.getClass();
            e.toString();
        }
        return Unit.a;
    }
}
