package com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker;

import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import xsna.cpc0;
import xsna.nnc0;

/* compiled from: PickerFragmentFactory.kt */
/* loaded from: classes4.dex */
public final class a {
    public final nnc0 a;
    public final cpc0 b;

    public a(nnc0 nnc0Var, cpc0 cpc0Var) {
        this.a = nnc0Var;
        this.b = cpc0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final FragmentImpl a() {
        return ((Boolean) this.b.L.getValue()).booleanValue() ? new LocalMediaPickerFragment.a(LocalMediaPickerFragment.class, null, null).f() : new LocalMediaPickerFragmentOld.a(LocalMediaPickerFragmentOld.class, null, null).f();
    }
}
