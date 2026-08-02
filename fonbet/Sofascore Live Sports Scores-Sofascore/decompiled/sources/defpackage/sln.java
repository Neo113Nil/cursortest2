package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbfi;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sln implements Application.ActivityLifecycleCallbacks {
    public final Application b;
    public final WeakReference c;
    public final /* synthetic */ int a = 0;
    public boolean d = false;

    public sln(Application application, zzbfi zzbfiVar) {
        this.c = new WeakReference(zzbfiVar);
        this.b = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks3 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks3 != null) {
                        activityLifecycleCallbacks3.onActivityCreated(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks3 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks3 != null) {
                        activityLifecycleCallbacks3.onActivityDestroyed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks3 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks3 != null) {
                        activityLifecycleCallbacks3.onActivityPaused(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks3 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks3 != null) {
                        activityLifecycleCallbacks3.onActivityResumed(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks3 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks3 != null) {
                        activityLifecycleCallbacks3.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks3 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks3 != null) {
                        activityLifecycleCallbacks3.onActivityStarted(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
        Application application = this.b;
        WeakReference weakReference = this.c;
        switch (i) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception e) {
                    int i2 = zze.zza;
                    zzo.zzg("Error while dispatching lifecycle callback.", e);
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks3 = (Application.ActivityLifecycleCallbacks) weakReference.get();
                    if (activityLifecycleCallbacks3 != null) {
                        activityLifecycleCallbacks3.onActivityStopped(activity);
                    } else if (!this.d) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        this.d = true;
                    }
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    public sln(Application application, zzbcn zzbcnVar) {
        this.c = new WeakReference(zzbcnVar);
        this.b = application;
    }

    public sln(Application application, kso ksoVar) {
        this.c = new WeakReference(ksoVar);
        this.b = application;
    }
}
