package com.vk.music.fragment.impl;

import android.view.View;
import androidx.annotation.NonNull;
import xsna.i80;
import xsna.s770;

/* compiled from: FragmentDelegateActiveModel.java */
/* loaded from: classes3.dex */
public final class b extends s770 {

    @NonNull
    public final i80[] c;

    @NonNull
    public final a d;

    /* compiled from: FragmentDelegateActiveModel.java */
    public interface a {
        View a(b bVar);
    }

    public b(@NonNull a aVar, @NonNull i80... i80VarArr) {
        this.d = aVar;
        this.c = i80VarArr;
    }
}
