package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;
import xsna.bxm0;
import xsna.djr;
import xsna.gzl;
import xsna.hgq0;
import xsna.i8i;
import xsna.top0;
import xsna.uir;
import xsna.v2z;
import xsna.vhr;
import xsna.vir;
import xsna.x8i;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(x8i x8iVar) {
        return new FirebaseMessaging((vhr) x8iVar.a(vhr.class), (vir) x8iVar.a(vir.class), x8iVar.e(hgq0.class), x8iVar.e(HeartBeatInfo.class), (uir) x8iVar.a(uir.class), (top0) x8iVar.a(top0.class), (bxm0) x8iVar.a(bxm0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<i8i<?>> getComponents() {
        i8i.a a = i8i.a(FirebaseMessaging.class);
        a.a = LIBRARY_NAME;
        a.a(gzl.b(vhr.class));
        a.a(new gzl(0, 0, vir.class));
        a.a(gzl.a(hgq0.class));
        a.a(gzl.a(HeartBeatInfo.class));
        a.a(new gzl(0, 0, top0.class));
        a.a(gzl.b(uir.class));
        a.a(gzl.b(bxm0.class));
        a.f = new djr();
        a.c(1);
        return Arrays.asList(a.b(), v2z.a(LIBRARY_NAME, "23.4.1"));
    }
}
