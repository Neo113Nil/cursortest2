package com.vk.core.ui.tracking;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.HashMap;
import xsna.fqa;
import xsna.n0q0;

/* compiled from: BytecodeTransformingTrackingScreenHolder.kt */
/* loaded from: classes.dex */
public abstract class a extends b {
    public final boolean b;
    public final HashMap<String, UiTrackingScreen> c = new HashMap<>();
    public final HashMap<String, UiTrackingScreen> d = new HashMap<>();
    public final HashMap<Integer, UiTrackingScreen> e = new HashMap<>();
    public final HashMap<String, UiTrackingScreen> f = new HashMap<>();

    public a(boolean z) {
        this.b = z;
    }

    @Override // com.vk.core.ui.tracking.b
    public final UiTrackingScreen c(Activity activity) {
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return b.l(activity, canonicalName, this.c);
    }

    @Override // com.vk.core.ui.tracking.b
    public final UiTrackingScreen d(Dialog dialog) {
        String canonicalName = dialog.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return b.l(dialog, canonicalName, this.c);
    }

    @Override // com.vk.core.ui.tracking.b
    public final UiTrackingScreen e(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return b.l(view, canonicalName, this.c);
    }

    @Override // com.vk.core.ui.tracking.b
    public UiTrackingScreen f(Fragment fragment) {
        String canonicalName = fragment.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return b.l(fragment, canonicalName, this.c);
    }

    @Override // com.vk.core.ui.tracking.b
    public final UiTrackingScreen g(n0q0 n0q0Var) {
        String canonicalName = n0q0Var.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return b.l(n0q0Var, canonicalName, this.c);
    }

    @Override // com.vk.core.ui.tracking.b
    public final boolean h(Activity activity) {
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return this.d.get(canonicalName) != null;
    }

    @Override // com.vk.core.ui.tracking.b
    public final boolean i(Dialog dialog) {
        String canonicalName = dialog.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return this.d.get(canonicalName) != null;
    }

    @Override // com.vk.core.ui.tracking.b
    public final boolean j(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return this.d.get(canonicalName) != null;
    }

    @Override // com.vk.core.ui.tracking.b
    public final boolean k(Fragment fragment) {
        String canonicalName = fragment.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        return this.d.get(canonicalName) != null;
    }

    @Override // com.vk.core.ui.tracking.b
    public final int m() {
        return this.c.size();
    }

    public final void n(int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        boolean z = this.b;
        HashMap<Integer, UiTrackingScreen> hashMap = this.e;
        if (!z || hashMap.get(Integer.valueOf(i)) == null) {
            hashMap.put(Integer.valueOf(i), new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen));
            return;
        }
        throw new IllegalStateException(("screen " + mobileOfficialAppsCoreNavStat$EventScreen + " is already exist!").toString());
    }

    public final void o(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str) {
        boolean z = this.b;
        HashMap<String, UiTrackingScreen> hashMap = this.f;
        if (!z || hashMap.get(str) == null) {
            hashMap.put(str, new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen));
            return;
        }
        throw new IllegalStateException(("screen " + mobileOfficialAppsCoreNavStat$EventScreen + " is already exist!").toString());
    }

    public final void p(fqa fqaVar, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        s(mobileOfficialAppsCoreNavStat$EventScreen, fqaVar.f().getName());
    }

    public final void q(Class<?> cls, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        String name = cls.getName();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        HashMap<String, UiTrackingScreen> hashMap = this.d;
        if (mobileOfficialAppsCoreNavStat$EventScreen == mobileOfficialAppsCoreNavStat$EventScreen2) {
            hashMap.put(name, new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen, name, (UiTrackingScreen.Companion.DialogType) null, 12));
        } else {
            hashMap.put(name, new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen));
        }
    }

    public final void s(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str) {
        boolean z = this.b;
        HashMap<String, UiTrackingScreen> hashMap = this.c;
        if (z && hashMap.get(str) != null) {
            throw new IllegalStateException(("screen " + mobileOfficialAppsCoreNavStat$EventScreen + " is already exists!").toString());
        }
        if (mobileOfficialAppsCoreNavStat$EventScreen == MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE) {
            hashMap.put(str, new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen, str, (UiTrackingScreen.Companion.DialogType) null, 12));
        } else {
            hashMap.put(str, new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen));
        }
    }
}
