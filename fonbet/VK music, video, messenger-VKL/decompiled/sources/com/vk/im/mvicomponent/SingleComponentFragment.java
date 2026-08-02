package com.vk.im.mvicomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import xsna.mg8;
import xsna.srm0;
import xsna.yj50;

/* compiled from: SingleComponentFragment.kt */
/* loaded from: classes2.dex */
public abstract class SingleComponentFragment extends MviComponentFragment {
    public final int T;

    public SingleComponentFragment(int i) {
        this.T = i;
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final mg8 eo() {
        return new srm0();
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        return Collections.singletonList(jo());
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final ViewGroup go(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) layoutInflater.inflate(this.T, viewGroup, false);
    }

    public abstract yj50<?, ?, ?, ?, ?, ?, ?> jo();
}
