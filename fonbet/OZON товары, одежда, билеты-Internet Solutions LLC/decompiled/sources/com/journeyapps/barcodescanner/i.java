package com.journeyapps.barcodescanner;

import N9.l;
import android.content.Context;
import android.os.Handler;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.c;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private int f60333a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f60334b;

    /* renamed from: c, reason: collision with root package name */
    private OrientationEventListener f60335c;

    /* renamed from: d, reason: collision with root package name */
    private l f60336d;

    final class a extends OrientationEventListener {
        a(Context context) {
            super(context, 3);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i11) {
            int rotation;
            Handler handler;
            i iVar = i.this;
            WindowManager windowManager = iVar.f60334b;
            l lVar = iVar.f60336d;
            if (iVar.f60334b == null || lVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == iVar.f60333a) {
                return;
            }
            iVar.f60333a = rotation;
            final c.C0916c c0916c = (c.C0916c) lVar;
            handler = c.this.f60274c;
            handler.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.f(c.this);
                }
            }, 250L);
        }
    }

    public final void e(Context context, l lVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f60336d = lVar;
        this.f60334b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext);
        this.f60335c = aVar;
        aVar.enable();
        this.f60333a = this.f60334b.getDefaultDisplay().getRotation();
    }

    public final void f() {
        OrientationEventListener orientationEventListener = this.f60335c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f60335c = null;
        this.f60334b = null;
        this.f60336d = null;
    }
}
