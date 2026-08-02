package ru.ozon.android.messenger.framework.presentation.messenger;

import B0.A0;
import android.os.Parcelable;
import androidx.lifecycle.C5418g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class a implements ru.ozon.android.messenger.framework.presentation.common.viewmodel.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f91312a;

    a(b bVar) {
        this.f91312a = bVar;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.viewmodel.b
    public final void a(Parcelable parcelable, String key) {
        C5418g0 c5418g0;
        Intrinsics.checkNotNullParameter(key, "key");
        b bVar = this.f91312a;
        String d02 = b.d0(bVar, key);
        if (d02 == null) {
            Lm0.a.f17149a.w(A0.b("Unable to save chat data with key ", key, ". Chat id is null"), new Object[0]);
        } else {
            c5418g0 = bVar.f91313a;
            c5418g0.g(parcelable, d02);
        }
    }

    public final <T> T b(String key) {
        C5418g0 c5418g0;
        Intrinsics.checkNotNullParameter(key, "key");
        b bVar = this.f91312a;
        String d02 = b.d0(bVar, key);
        if (d02 == null) {
            return null;
        }
        c5418g0 = bVar.f91313a;
        return (T) c5418g0.c(d02);
    }
}
