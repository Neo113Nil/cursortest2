package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaac extends RemoteCreator {
    public static final zaac c = new zaac();

    private zaac() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i, int i2) {
        zaac zaacVar = c;
        try {
            zaaa zaaaVar = new zaaa(1, i, i2, null);
            return (View) ObjectWrapper.Z1(((zap) zaacVar.b(context)).Z1(new ObjectWrapper(context), zaaaVar));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException(x5n.n(new StringBuilder(String.valueOf(i).length() + 42 + String.valueOf(i2).length()), i, "Could not get button with size ", i2, " and color "), e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zap ? (zap) queryLocalInterface : new zap(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }
}
