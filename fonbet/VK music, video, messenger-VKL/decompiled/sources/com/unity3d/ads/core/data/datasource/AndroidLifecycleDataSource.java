package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import xsna.f5z;
import xsna.myc0;
import xsna.rsr;
import xsna.ttk0;
import xsna.utk0;
import xsna.vtk0;
import xsna.xh50;
import xsna.zvj;

/* compiled from: AndroidLifecycleDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, l {
    private final xh50<Boolean> _appActive;
    private final ttk0<Boolean> appActive;

    /* compiled from: AndroidLifecycleDataSource.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLifecycleDataSource() {
        utk0 a = vtk0.a(Boolean.TRUE);
        this._appActive = a;
        this.appActive = rsr.f(a);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        myc0.h(zvj.b(), null, null, new AndroidLifecycleDataSource$registerAppLifecycle$1(this, null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return getAppActive().getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public ttk0<Boolean> getAppActive() {
        return this.appActive;
    }

    @Override // androidx.lifecycle.l
    public void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        xh50<Boolean> xh50Var = this._appActive;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean z = true;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            z = getAppActive().getValue().booleanValue();
        }
        xh50Var.setValue(Boolean.valueOf(z));
    }
}
