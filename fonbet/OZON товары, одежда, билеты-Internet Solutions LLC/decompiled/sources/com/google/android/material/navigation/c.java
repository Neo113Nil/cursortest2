package com.google.android.material.navigation;

import C.o0;
import N3.C3660k;
import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;

/* loaded from: classes9.dex */
public final class c extends g {

    /* renamed from: A, reason: collision with root package name */
    private final int f58469A;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    private final Class<?> f58470z;

    public c(@NonNull Context context, @NonNull Class<?> cls, int i11) {
        super(context);
        this.f58470z = cls;
        this.f58469A = i11;
    }

    @Override // androidx.appcompat.view.menu.g
    @NonNull
    protected final i a(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        int size = size() + 1;
        int i14 = this.f58469A;
        if (size > i14) {
            String simpleName = this.f58470z.getSimpleName();
            throw new IllegalArgumentException(o0.c(C3660k.c(i14, "Maximum number of items supported by ", simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
        }
        Q();
        i a11 = super.a(i11, i12, i13, charSequence);
        a11.q(true);
        P();
        return a11;
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @NonNull
    public final SubMenu addSubMenu(int i11, int i12, int i13, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f58470z.getSimpleName().concat(" does not support submenus"));
    }
}
