package ru.ozon.app.android.composer.universalscreen.di.module;

import Jb.e;
import Jb.j;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

/* loaded from: classes6.dex */
public final class ComposerFragmentModule_ProvideAtomPoolFactory implements e<RecycledAtomPool> {
    public static RecycledAtomPool provideAtomPool(ComposerFragmentModule composerFragmentModule) {
        RecycledAtomPool provideAtomPool = composerFragmentModule.provideAtomPool();
        j.d(provideAtomPool);
        return provideAtomPool;
    }
}
