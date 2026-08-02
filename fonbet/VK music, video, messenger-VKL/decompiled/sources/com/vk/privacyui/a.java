package com.vk.privacyui;

import android.content.DialogInterface;

/* compiled from: PrivacyEditFragment.java */
/* loaded from: classes5.dex */
public final class a implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ boolean[] a;

    public a(boolean[] zArr) {
        this.a = zArr;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.a[i] = z;
    }
}
