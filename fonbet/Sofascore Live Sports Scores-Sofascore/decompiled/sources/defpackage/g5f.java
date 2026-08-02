package defpackage;

import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g5f extends y4f {
    @Override // defpackage.y4f, androidx.recyclerview.widget.l
    /* renamed from: r */
    public final void onBindViewHolder(c5f c5fVar, int i) {
        int hashCode;
        c5fVar.getClass();
        super.onBindViewHolder(c5fVar, i);
        Preference q = q(i);
        PreferenceGroup preferenceGroup = q != null ? q.H : null;
        String str = q != null ? q.k : null;
        if (str != null && ((hashCode = str.hashCode()) == -721492434 ? str.equals("sound_category") : hashCode == 1525677497 ? str.equals("odds_category") : hashCode == 1785520909 && str.equals("application_category"))) {
            View view = c5fVar.itemView;
            view.getClass();
            sea.v(view, true, false, 0, Intrinsics.c(q.k, "application_category") ? 8 : 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
            return;
        }
        boolean z = false;
        if (preferenceGroup != null) {
            int size = preferenceGroup.O.size();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Preference A = preferenceGroup.A(i4);
                A.getClass();
                if (A.v) {
                    i2++;
                    if (Intrinsics.c(q, A)) {
                        i3 = i2;
                    }
                }
            }
            if (i2 == i3) {
                z = true;
            }
        }
        boolean z2 = z;
        View view2 = c5fVar.itemView;
        view2.getClass();
        sea.v(view2, false, z2, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }
}
