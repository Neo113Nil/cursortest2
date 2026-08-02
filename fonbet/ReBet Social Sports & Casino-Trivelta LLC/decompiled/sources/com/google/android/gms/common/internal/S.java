package com.google.android.gms.common.internal;

import N9.f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;

/* loaded from: classes2.dex */
public final class S extends N9.f {

    /* renamed from: c, reason: collision with root package name */
    public static final S f32670c = new S();

    public S() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) {
        S s10 = f32670c;
        try {
            return (View) N9.d.g(((I) s10.b(context)).c(N9.d.i(context), new zax(1, i10, i11, null)));
        } catch (Exception e10) {
            throw new f.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    @Override // N9.f
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof I ? (I) queryLocalInterface : new I(iBinder);
    }
}
