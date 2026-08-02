package com.google.android.gms.internal.measurement;

import defpackage.fsf;
import defpackage.n2;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlz {
    public static final void a(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        n2 n2Var = new n2(13, level, exc, str, objArr, false);
        int i = zzxa.a;
        executor.execute(new zzwz(new fsf(), zzvy.a(), n2Var));
    }
}
