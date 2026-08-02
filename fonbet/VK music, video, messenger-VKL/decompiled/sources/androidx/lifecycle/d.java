package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.NoWhenBranchMatchedException;
import xsna.f5z;
import xsna.nhl;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
/* loaded from: classes.dex */
public final class d implements l {
    public final nhl b;
    public final l c;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(nhl nhlVar, l lVar) {
        this.b = nhlVar;
        this.c = lVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        nhl nhlVar = this.b;
        switch (i) {
            case 1:
                nhlVar.onCreate(f5zVar);
                break;
            case 2:
                nhlVar.onStart(f5zVar);
                break;
            case 3:
                nhlVar.onResume(f5zVar);
                break;
            case 4:
                nhlVar.onPause(f5zVar);
                break;
            case 5:
                nhlVar.onStop(f5zVar);
                break;
            case 6:
                nhlVar.onDestroy(f5zVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        l lVar = this.c;
        if (lVar != null) {
            lVar.onStateChanged(f5zVar, event);
        }
    }
}
