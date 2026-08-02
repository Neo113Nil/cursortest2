package com.vk.video.ui.discovery.minimizable.player.orientation;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asp;
import xsna.atv0;
import xsna.b6l;
import xsna.bbw;
import xsna.bdn;
import xsna.hpj;
import xsna.ie00;
import xsna.myc0;
import xsna.qsl;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yok0;
import xsna.yvj;
import xsna.zrp;
import xsna.zvj;
import xsna.zy80;

/* compiled from: OrientationManagerImpl.kt */
/* loaded from: classes7.dex */
public final class OrientationManagerImpl extends OrientationEventListener implements zy80, ComponentCallbacks {
    public static final /* synthetic */ int h = 0;
    public final WeakReference<Activity> b;
    public final hpj c;
    public yok0 d;
    public Integer e;
    public Rotation f;
    public boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrientationManagerImpl.kt */
    public static final class Rotation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Rotation[] $VALUES;
        public static final Rotation Rotation0;
        public static final Rotation Rotation180;
        public static final Rotation Rotation270;
        public static final Rotation Rotation360;
        public static final Rotation Rotation90;
        private final int angle;

        static {
            Rotation rotation = new Rotation("Rotation0", 0, 0);
            Rotation0 = rotation;
            Rotation rotation2 = new Rotation("Rotation90", 1, 90);
            Rotation90 = rotation2;
            Rotation rotation3 = new Rotation("Rotation180", 2, 180);
            Rotation180 = rotation3;
            Rotation rotation4 = new Rotation("Rotation270", 3, atv0.b);
            Rotation270 = rotation4;
            Rotation rotation5 = new Rotation("Rotation360", 4, 360);
            Rotation360 = rotation5;
            Rotation[] rotationArr = {rotation, rotation2, rotation3, rotation4, rotation5};
            $VALUES = rotationArr;
            $ENTRIES = new asp(rotationArr);
        }

        public Rotation(String str, int i, int i2) {
            this.angle = i2;
        }

        public static Rotation valueOf(String str) {
            return (Rotation) Enum.valueOf(Rotation.class, str);
        }

        public static Rotation[] values() {
            return (Rotation[]) $VALUES.clone();
        }

        public final int h() {
            return this.angle;
        }
    }

    /* compiled from: OrientationManagerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rotation.values().length];
            try {
                iArr[Rotation.Rotation0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OrientationManagerImpl.kt */
    @b6l(c = "com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl$onOrientationChanged$1", f = "OrientationManagerImpl.kt", l = {103}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return OrientationManagerImpl.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.label = 1;
                if (qsl.b(1500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            OrientationManagerImpl orientationManagerImpl = OrientationManagerImpl.this;
            int i2 = OrientationManagerImpl.h;
            Activity activity = orientationManagerImpl.b.get();
            if ((activity == null || activity.getRequestedOrientation() != 14) && !orientationManagerImpl.g) {
                OrientationManagerImpl.this.reset();
            }
            return s3q0.a;
        }
    }

    public OrientationManagerImpl(FragmentActivity fragmentActivity) {
        super(fragmentActivity.getApplicationContext());
        WeakReference<Activity> weakReference = new WeakReference<>(fragmentActivity);
        this.b = weakReference;
        bdn bdnVar = bdn.a;
        this.c = zvj.a(ie00.a);
        Activity activity = weakReference.get();
        this.e = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
        this.f = Rotation.Rotation0;
    }

    @Override // xsna.zy80
    public final void a() {
        WeakReference<Activity> weakReference = this.b;
        Activity activity = weakReference.get();
        if (activity == null || activity.getRequestedOrientation() != 14) {
            return;
        }
        Integer num = this.e;
        if (num != null) {
            int intValue = num.intValue();
            Activity activity2 = weakReference.get();
            if (activity2 != null) {
                activity2.setRequestedOrientation(intValue);
            }
        }
        this.e = 2;
    }

    @Override // xsna.zy80
    public final void b(boolean z) {
        this.g = z;
        yok0 yok0Var = this.d;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        Activity activity = this.b.get();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    @Override // xsna.zy80
    public final boolean c() {
        return this.g;
    }

    @Override // xsna.zy80
    public final void d(boolean z) {
        this.g = z;
        yok0 yok0Var = this.d;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        Activity activity = this.b.get();
        if (activity != null) {
            activity.setRequestedOrientation(6);
        }
    }

    @Override // android.view.OrientationEventListener, xsna.zy80
    public final void disable() {
        super.disable();
        Activity activity = this.b.get();
        if (activity != null) {
            activity.unregisterComponentCallbacks(this);
        }
    }

    @Override // xsna.zy80
    public final void e() {
        WeakReference<Activity> weakReference = this.b;
        Activity activity = weakReference.get();
        Integer valueOf = activity != null ? Integer.valueOf(activity.getRequestedOrientation()) : null;
        Integer num = (valueOf == null || valueOf.intValue() != 14) ? valueOf : null;
        if (num == null) {
            num = 2;
        }
        this.e = num;
        Activity activity2 = weakReference.get();
        if (activity2 != null) {
            activity2.setRequestedOrientation(14);
        }
    }

    @Override // android.view.OrientationEventListener, xsna.zy80
    public final void enable() {
        super.enable();
        Activity activity = this.b.get();
        if (activity != null) {
            activity.registerComponentCallbacks(this);
        }
    }

    public final boolean f() {
        Object failure;
        try {
            Activity activity = this.b.get();
            failure = Integer.valueOf(Settings.System.getInt(activity != null ? activity.getContentResolver() : null, "accelerometer_rotation"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Integer num = (Integer) (failure instanceof Result.Failure ? null : failure);
        return num != null && num.intValue() == 1;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        WindowManager windowManager;
        Display defaultDisplay;
        Object failure;
        int i = Build.VERSION.SDK_INT;
        WeakReference<Activity> weakReference = this.b;
        if (i >= 30) {
            Activity activity = weakReference.get();
            if (activity != null) {
                defaultDisplay = activity.getDisplay();
            }
            defaultDisplay = null;
        } else {
            Activity activity2 = weakReference.get();
            if (activity2 != null && (windowManager = activity2.getWindowManager()) != null) {
                defaultDisplay = windowManager.getDefaultDisplay();
            }
            defaultDisplay = null;
        }
        if (defaultDisplay != null) {
            try {
                Activity activity3 = weakReference.get();
                failure = Integer.valueOf(Settings.System.getInt(activity3 != null ? activity3.getContentResolver() : null, "user_rotation"));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Integer num = (Integer) (failure instanceof Result.Failure ? null : failure);
            if ((num != null ? num.intValue() : -1) != defaultDisplay.getRotation() || f()) {
                return;
            }
            reset();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        r1 = com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl.Rotation.Rotation90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (java.lang.Math.abs(r1.h() - r5) > 45) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
    
        r1 = com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl.Rotation.Rotation180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (java.lang.Math.abs(r1.h() - r5) > 45) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        r1 = com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl.Rotation.Rotation270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (java.lang.Math.abs(r1.h() - r5) > 45) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        r1 = com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl.Rotation.Rotation0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        r4.f = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003b, code lost:
    
        if (java.lang.Math.abs(r5 - r0.h()) >= 75) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (java.lang.Math.abs((r5 > com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl.Rotation.Rotation180.h() ? com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl.Rotation.Rotation360.h() - r5 : r5) - r0.h()) >= 75) goto L16;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOrientationChanged(int i) {
        if (i == -1) {
            return;
        }
        Rotation rotation = this.f;
        if (a.$EnumSwitchMapping$0[rotation.ordinal()] == 1) {
        }
        if (this.f != rotation) {
            Activity activity = this.b.get();
            if ((activity == null || activity.getRequestedOrientation() != 14) && !this.g && f() && this.d == null) {
                yok0 h2 = myc0.h(this.c, null, null, new b(null), 3);
                h2.E(new bbw(this, 19));
                this.d = h2;
            }
        }
    }

    @Override // xsna.zy80
    public final void reset() {
        this.g = false;
        yok0 yok0Var = this.d;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        Activity activity = this.b.get();
        if (activity != null) {
            activity.setRequestedOrientation(2);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
