package com.appsflyer;

import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.e1d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a(Function2 function2, boolean z, e1d e1dVar) {
        this.a = 4;
        this.b = function2;
        this.d = z;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit d;
        Unit AFKeystoreWrapper;
        Unit AFLogger;
        Unit registerClient;
        int i = this.a;
        Object obj2 = this.c;
        boolean z = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                d = AFLogger.d((LogTag) obj3, (String) obj2, z, (AFLoggerBase) obj);
                return d;
            case 1:
                AFKeystoreWrapper = AFLogger.AFKeystoreWrapper((LogTag) obj3, (String) obj2, z, (AFLoggerBase) obj);
                return AFKeystoreWrapper;
            case 2:
                AFLogger = AFLogger.AFLogger((LogTag) obj3, (String) obj2, z, (AFLoggerBase) obj);
                return AFLogger;
            case 3:
                registerClient = AFLogger.registerClient((LogTag) obj3, (String) obj2, z, (AFLoggerBase) obj);
                return registerClient;
            default:
                Function2 function2 = (Function2) obj3;
                e1d e1dVar = (e1d) obj2;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar.getClass();
                e1dVar.setValue(dVar);
                function2.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) e1dVar.getValue(), z ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.d : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.e);
                return Unit.a;
        }
    }

    public /* synthetic */ a(LogTag logTag, String str, boolean z, int i) {
        this.a = i;
        this.b = logTag;
        this.c = str;
        this.d = z;
    }
}
