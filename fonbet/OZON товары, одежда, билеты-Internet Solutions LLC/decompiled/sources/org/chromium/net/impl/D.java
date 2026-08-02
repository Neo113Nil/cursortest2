package org.chromium.net.impl;

import Ra.g;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import org.chromium.net.C;

/* loaded from: classes6.dex */
public abstract class D extends org.chromium.net.i {
    @Override // org.chromium.net.i
    /* renamed from: b */
    public final b0 a(String str, C.b bVar, Va.a aVar) {
        return new b0(str, bVar, aVar, this);
    }

    protected abstract org.chromium.net.k c(String str, C.b bVar, Va.a aVar, int i11, boolean z11, g.d dVar, long j11, String str2, ArrayList arrayList, org.chromium.net.A a11, Va.a aVar2, @NonNull String str3);
}
