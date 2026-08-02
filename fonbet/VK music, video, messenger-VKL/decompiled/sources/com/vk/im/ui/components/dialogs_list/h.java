package com.vk.im.ui.components.dialogs_list;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.dialogs_list.i;

/* compiled from: TaskInvalidateEntityViaCache.java */
/* loaded from: classes2.dex */
public final class h implements io.reactivex.rxjava3.functions.b<ProfilesInfo, Throwable> {
    public final /* synthetic */ i b;

    public h(i iVar) {
        this.b = iVar;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public final void accept(ProfilesInfo profilesInfo, Throwable th) throws Throwable {
        ProfilesInfo profilesInfo2 = profilesInfo;
        Throwable th2 = th;
        i iVar = this.b;
        if (th2 != null) {
            iVar.g(th2);
            return;
        }
        i.b bVar = new i.b();
        bVar.a = profilesInfo2;
        iVar.h(bVar);
    }
}
