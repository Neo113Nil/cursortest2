package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.results.manager.details.ManagerDetailsFragment;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ctb extends s8 {
    public ManagerData r;

    @Override // defpackage.d41
    public final Fragment C(Enum r5) {
        atb atbVar = (atb) r5;
        atbVar.getClass();
        int ordinal = atbVar.ordinal();
        if (ordinal == 0) {
            ManagerData managerData = this.r;
            if (managerData == null) {
                Intrinsics.i("managerData");
                throw null;
            }
            ManagerDetailsFragment managerDetailsFragment = new ManagerDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("MANAGER", managerData);
            managerDetailsFragment.setArguments(bundle);
            return managerDetailsFragment;
        }
        if (ordinal != 1) {
            zzl.b();
            return null;
        }
        ManagerData managerData2 = this.r;
        if (managerData2 == null) {
            Intrinsics.i("managerData");
            throw null;
        }
        ManagerEventsFragment managerEventsFragment = new ManagerEventsFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("MANAGER", managerData2);
        managerEventsFragment.setArguments(bundle2);
        return managerEventsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r3) {
        int i;
        atb atbVar = (atb) r3;
        atbVar.getClass();
        if (btb.a[atbVar.ordinal()] == 2) {
            mqi mqiVar = bii.a;
            ManagerData managerData = this.r;
            if (managerData == null) {
                Intrinsics.i("managerData");
                throw null;
            }
            i = bii.b(managerData.getManager().getSportSlug(), false);
        } else {
            i = atbVar.a;
        }
        String string = y().getString(i);
        string.getClass();
        return string;
    }
}
