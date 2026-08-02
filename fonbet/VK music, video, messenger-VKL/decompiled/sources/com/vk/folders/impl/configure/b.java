package com.vk.folders.impl.configure;

import com.vk.folders.impl.configure.a;
import com.vk.im.engine.models.dialogs.FolderType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConfigurationMode.kt */
/* loaded from: classes18.dex */
public final class b {
    public static final FolderType a(a aVar) {
        if (aVar.equals(a.C1068a.a)) {
            return FolderType.DEFAULT;
        }
        if (aVar instanceof a.b) {
            return ((a.b) aVar).c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
