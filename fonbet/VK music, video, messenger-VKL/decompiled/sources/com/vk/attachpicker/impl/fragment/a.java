package com.vk.attachpicker.impl.fragment;

import com.vk.attachpicker.impl.fragment.GraffitiFragment;

/* compiled from: GraffitiFragment.java */
/* loaded from: classes15.dex */
public final class a implements Runnable {
    public final /* synthetic */ GraffitiFragment.b b;

    public a(GraffitiFragment.b bVar) {
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GraffitiFragment.b bVar = this.b;
        bVar.e = bVar.d.size() == 0;
        bVar.notifyDataSetChanged();
    }
}
