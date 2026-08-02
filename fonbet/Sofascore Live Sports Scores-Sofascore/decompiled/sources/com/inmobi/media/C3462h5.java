package com.inmobi.media;

import android.net.Network;
import android.os.SystemClock;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.net.InetAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3462h5 extends hoi implements Function2 {
    public final /* synthetic */ Network a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3462h5(Network network, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = network;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3462h5(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3462h5(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:2|3)|(3:7|(1:9)(1:23)|(6:11|12|13|14|15|16))|24|13|14|15|16|(2:(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r0 = com.inmobi.media.AbstractC3286aa.a;
        com.inmobi.media.AbstractC3286aa.a(new com.inmobi.media.Q2(r2));
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AdConfig.CustomNetworkValidation a;
        String urlDomain;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            try {
                a = C3488i5.a();
            } catch (Exception unused) {
            }
            if (a != null && (urlDomain = a.getUrlDomain()) != null) {
                if (urlDomain.length() <= 0) {
                    urlDomain = null;
                }
                if (urlDomain != null) {
                    z = !Intrinsics.c(InetAddress.getByName(urlDomain).toString(), "");
                    C3488i5.b = z;
                    C3488i5.a = this.a;
                    C3488i5.c = SystemClock.elapsedRealtime();
                    Network network = C3488i5.a;
                    C3488i5.e.set(false);
                    return Unit.a;
                }
            }
            z = false;
            C3488i5.b = z;
            C3488i5.a = this.a;
            C3488i5.c = SystemClock.elapsedRealtime();
            Network network2 = C3488i5.a;
            C3488i5.e.set(false);
            return Unit.a;
        } catch (Throwable th) {
            C3488i5.e.set(false);
            throw th;
        }
    }
}
