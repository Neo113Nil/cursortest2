package com.appsflyer;

import com.google.firebase.installations.c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57358b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f57357a = i11;
        this.f57358b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57357a) {
            case 0:
                AFLogger.values((Function1) this.f57358b);
                break;
            default:
                ((c) this.f57358b).e();
                break;
        }
    }
}
