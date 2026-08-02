package com.vk.privacyui;

import android.view.View;
import androidx.appcompat.app.d;
import com.vk.dto.user.UserProfile;
import com.vk.privacyui.PrivacyEditFragment;
import java.util.ArrayList;
import xsna.u1u0;

/* compiled from: PrivacyEditFragment.java */
/* loaded from: classes5.dex */
public final class b implements View.OnClickListener {
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ PrivacyEditFragment.e e;
    public final /* synthetic */ d f;
    public final /* synthetic */ PrivacyEditFragment g;

    public b(PrivacyEditFragment privacyEditFragment, boolean[] zArr, boolean[] zArr2, ArrayList arrayList, PrivacyEditFragment.e eVar, d dVar) {
        this.g = privacyEditFragment;
        this.b = zArr;
        this.c = zArr2;
        this.d = arrayList;
        this.e = eVar;
        this.f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i >= zArr.length) {
                break;
            }
            boolean z = zArr[i];
            boolean z2 = this.c[i];
            if (z != z2) {
                ArrayList arrayList3 = this.d;
                if (z2) {
                    if (!arrayList2.contains(arrayList3.get(i))) {
                        arrayList2.add((UserProfile) arrayList3.get(i));
                    }
                } else if (!arrayList.contains(arrayList3.get(i))) {
                    arrayList.add((UserProfile) arrayList3.get(i));
                }
            }
            i++;
        }
        if (arrayList.size() > 0 || arrayList2.size() > 0) {
            PrivacyEditFragment privacyEditFragment = this.g;
            privacyEditFragment.Q0 = true;
            PrivacyEditFragment.e eVar = this.e;
            eVar.c.removeAll(arrayList2);
            eVar.c.addAll(arrayList);
            eVar.notifyDataSetChanged();
            privacyEditFragment.q();
        }
        u1u0.b(this.f);
    }
}
