package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import yads.mc3;
import yads.qc2;
import yads.r30;

/* loaded from: classes14.dex */
public final class h implements qc2 {
    @Override // yads.qc2
    public final Object a(Uri uri, r30 r30Var) {
        return Long.valueOf(mc3.f(new BufferedReader(new InputStreamReader(r30Var)).readLine()));
    }
}
