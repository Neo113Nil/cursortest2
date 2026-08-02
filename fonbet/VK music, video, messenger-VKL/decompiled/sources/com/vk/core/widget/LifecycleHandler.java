package com.vk.core.widget;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.b5z;
import xsna.p90;

/* loaded from: classes17.dex */
public class LifecycleHandler extends Fragment implements Application.ActivityLifecycleCallbacks {
    public static int j;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean e;
    public SparseArray<String> f = new SparseArray<>();
    public SparseArray<String> g = new SparseArray<>();
    public ArrayList<PendingPermissionRequest> h = new ArrayList<>();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    public LifecycleHandler() {
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    @NonNull
    public static LifecycleHandler c(@NonNull Activity activity) {
        j++;
        LifecycleHandler lifecycleHandler = (LifecycleHandler) activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
        if (lifecycleHandler != null) {
            lifecycleHandler.d(activity);
        }
        if (lifecycleHandler == null || j == 1) {
            lifecycleHandler = new LifecycleHandler();
            activity.getFragmentManager().beginTransaction().add(lifecycleHandler, "LifecycleHandler").commitAllowingStateLoss();
        }
        lifecycleHandler.d(activity);
        return lifecycleHandler;
    }

    public static void h(@NonNull Activity activity, @NonNull LifecycleHandler lifecycleHandler) {
        int i = j - 1;
        j = i;
        if (i > 0) {
            return;
        }
        j = 0;
        if (p90.e(activity)) {
            return;
        }
        activity.getFragmentManager().beginTransaction().remove(lifecycleHandler).commitAllowingStateLoss();
        lifecycleHandler.d(activity);
    }

    public final void a(b5z b5zVar) {
        if (b5zVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("addLifecycleListener, current count = ");
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        sb.append(copyOnWriteArrayList.size());
        L.A("LifecycleHandler", sb.toString());
        copyOnWriteArrayList.add(b5zVar);
    }

    public final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        if (this.b != null) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).b(this.b);
            }
        }
    }

    public final void d(@NonNull Activity activity) {
        this.b = activity;
        if (this.c) {
            return;
        }
        this.c = true;
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public final void e(b5z b5zVar) {
        this.i.remove(b5zVar);
    }

    public final void f() {
        if (this.e) {
            return;
        }
        this.e = true;
        for (int size = this.h.size() - 1; size >= 0; size--) {
            PendingPermissionRequest remove = this.h.remove(size);
            String str = remove.b;
            String[] strArr = remove.c;
            int i = remove.d;
            if (this.e) {
                this.f.put(i, str);
                requestPermissions(strArr, i);
            } else {
                this.h.add(new PendingPermissionRequest(str, strArr, i));
            }
        }
    }

    public final void g(int i, @NonNull String str, @NonNull Intent intent) {
        this.g.put(i, str);
        startActivityForResult(intent, i);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.b == null) {
            LifecycleHandler lifecycleHandler = (LifecycleHandler) activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
            if (lifecycleHandler != null) {
                lifecycleHandler.d(activity);
            }
            if (lifecycleHandler == this) {
                this.b = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.b == activity) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).c(activity);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = this.g.get(i);
        if (str != null) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).d(str, i, i2, intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b == activity) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).e(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.b == activity) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).getClass();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.b == activity) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).f(activity);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.d = false;
        f();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).g(configuration);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            StringSparseArrayParceler stringSparseArrayParceler = (StringSparseArrayParceler) bundle.getParcelable("LifecycleHandler.permissionRequests");
            this.f = stringSparseArrayParceler != null ? stringSparseArrayParceler.b : new SparseArray<>();
            StringSparseArrayParceler stringSparseArrayParceler2 = (StringSparseArrayParceler) bundle.getParcelable("LifecycleHandler.activityRequests");
            this.g = stringSparseArrayParceler2 != null ? stringSparseArrayParceler2.b : new SparseArray<>();
            ArrayList<PendingPermissionRequest> parcelableArrayList = bundle.getParcelableArrayList("LifecycleHandler.pendingPermissionRequests");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList<>();
            }
            this.h = parcelableArrayList;
        }
    }

    @Override // android.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((b5z) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Activity activity = this.b;
        if (activity != null) {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            b();
            this.b = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.e = false;
        b();
    }

    @Override // android.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((b5z) it.next()).getClass();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Fragment
    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((b5z) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f.get(i) != null) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                ((b5z) it.next()).getClass();
            }
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("LifecycleHandler.permissionRequests", new StringSparseArrayParceler(this.f));
        bundle.putParcelable("LifecycleHandler.activityRequests", new StringSparseArrayParceler(this.g));
        bundle.putParcelableArrayList("LifecycleHandler.pendingPermissionRequests", this.h);
    }

    @Override // android.app.Fragment
    public final boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((b5z) it.next()).getClass();
        }
        return super.shouldShowRequestPermissionRationale(str);
    }

    public static class PendingPermissionRequest implements Parcelable {
        public static final Parcelable.Creator<PendingPermissionRequest> CREATOR = new a();
        public final String b;
        public final String[] c;
        public final int d;

        public class a implements Parcelable.Creator<PendingPermissionRequest> {
            @Override // android.os.Parcelable.Creator
            public final PendingPermissionRequest createFromParcel(Parcel parcel) {
                return new PendingPermissionRequest(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final PendingPermissionRequest[] newArray(int i) {
                return new PendingPermissionRequest[i];
            }
        }

        public PendingPermissionRequest(@NonNull String str, @NonNull String[] strArr, int i) {
            this.b = str;
            this.c = strArr;
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeStringArray(this.c);
            parcel.writeInt(this.d);
        }

        public PendingPermissionRequest(Parcel parcel) {
            this.b = parcel.readString();
            this.c = parcel.createStringArray();
            this.d = parcel.readInt();
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.d = false;
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
