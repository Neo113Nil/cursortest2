package com.vk.folders.impl.configure;

import android.os.Bundle;
import com.vk.folders.impl.configure.a;
import com.vk.folders.impl.configure.e;
import com.vk.folders.impl.select.FolderPeersSelectFragment;
import com.vk.im.mvicomponent.MviComponentFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.hm50;
import xsna.j5g;

/* compiled from: FolderConfigurationRouter.kt */
/* loaded from: classes18.dex */
public final class f implements hm50<e> {
    public final MviComponentFragment a;

    public f(FolderConfigurationFragment folderConfigurationFragment) {
        this.a = folderConfigurationFragment;
    }

    @Override // xsna.hm50
    public final void a(e eVar) {
        e eVar2 = eVar;
        boolean z = eVar2 instanceof e.a;
        MviComponentFragment mviComponentFragment = this.a;
        if (!z) {
            if (eVar2.equals(e.c.a)) {
                mviComponentFragment.finish();
                return;
            } else {
                if (!eVar2.equals(e.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                mviComponentFragment.finish();
                return;
            }
        }
        FolderPeersSelectFragment.a aVar = new FolderPeersSelectFragment.a(FolderPeersSelectFragment.class, null, null);
        e.a aVar2 = (e.a) eVar2;
        long[] P0 = j5g.P0(aVar2.a);
        Bundle bundle = aVar.j;
        bundle.putLongArray("already_selected", P0);
        bundle.putLongArray("already_unselected", j5g.P0(aVar2.b));
        a aVar3 = aVar2.c;
        if (aVar3 instanceof a.b) {
            bundle.putInt("target_folder_id", ((a.b) aVar3).a);
        }
        aVar.g(100, mviComponentFragment);
    }
}
