package com.logrocket.core;

import android.app.Activity;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f6411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f6412c;

    public /* synthetic */ c(d dVar, Activity activity, int i5) {
        this.f6410a = i5;
        this.f6411b = dVar;
        this.f6412c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6410a) {
            case 0:
                d dVar = this.f6411b;
                ba.d dVar2 = dVar.f6414b;
                WeakHashMap weakHashMap = dVar.f6415c;
                Activity activity = this.f6412c;
                if (!weakHashMap.containsKey(activity)) {
                    dVar2.o("onActivityDestroyed: (unknown activity) ".concat(d.a(activity)));
                    break;
                } else {
                    weakHashMap.remove(activity);
                    dVar2.o("onActivityDestroyed: ".concat(d.a(activity)));
                    dVar.b(activity, 7);
                    break;
                }
            case 1:
                d dVar3 = this.f6411b;
                ba.d dVar4 = dVar3.f6414b;
                WeakHashMap weakHashMap2 = dVar3.f6415c;
                Activity activity2 = this.f6412c;
                if (!weakHashMap2.containsKey(activity2)) {
                    dVar4.o("onActivityPaused: (unknown activity) ".concat(d.a(activity2)));
                    break;
                } else {
                    dVar4.o("onActivityPaused: ".concat(d.a(activity2)));
                    dVar3.b(activity2, 4);
                    break;
                }
            case 2:
                d dVar5 = this.f6411b;
                ba.d dVar6 = dVar5.f6414b;
                WeakHashMap weakHashMap3 = dVar5.f6415c;
                Activity activity3 = this.f6412c;
                if (!weakHashMap3.containsKey(activity3)) {
                    dVar6.o("onActivityStopped: (unknown activity) ".concat(d.a(activity3)));
                    break;
                } else {
                    dVar6.o("onActivityStopped: ".concat(d.a(activity3)));
                    dVar5.b(activity3, 5);
                    break;
                }
            case 3:
                d dVar7 = this.f6411b;
                WeakHashMap weakHashMap4 = dVar7.f6415c;
                Boolean bool = Boolean.TRUE;
                Activity activity4 = this.f6412c;
                weakHashMap4.put(activity4, bool);
                dVar7.f6414b.o("onActivityStarted: ".concat(d.a(activity4)));
                dVar7.b(activity4, 2);
                break;
            case 4:
                d dVar8 = this.f6411b;
                ba.d dVar9 = dVar8.f6414b;
                Activity activity5 = this.f6412c;
                dVar9.o("onActivityCreated: ".concat(d.a(activity5)));
                dVar8.f6417e = "";
                dVar8.b(activity5, 1);
                break;
            case 5:
                d dVar10 = this.f6411b;
                ba.d dVar11 = dVar10.f6414b;
                WeakHashMap weakHashMap5 = dVar10.f6415c;
                Activity activity6 = this.f6412c;
                if (!weakHashMap5.containsKey(activity6)) {
                    dVar11.o("onActivityResumed: (unknown activity) ".concat(d.a(activity6)));
                    break;
                } else {
                    dVar11.o("onActivityResumed: ".concat(d.a(activity6)));
                    dVar10.b(activity6, 3);
                    break;
                }
            default:
                d dVar12 = this.f6411b;
                ba.d dVar13 = dVar12.f6414b;
                WeakHashMap weakHashMap6 = dVar12.f6415c;
                Activity activity7 = this.f6412c;
                if (!weakHashMap6.containsKey(activity7)) {
                    dVar13.o("onActivitySaveInstanceState: (unknown activity) ".concat(d.a(activity7)));
                    break;
                } else {
                    dVar13.o("onActivitySaveInstanceState: ".concat(d.a(activity7)));
                    dVar12.b(activity7, 6);
                    break;
                }
        }
    }
}
