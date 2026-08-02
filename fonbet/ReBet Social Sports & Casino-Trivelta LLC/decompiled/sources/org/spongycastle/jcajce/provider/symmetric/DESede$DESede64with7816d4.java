package org.spongycastle.jcajce.provider.symmetric;

import Yi.a;
import bj.c;
import org.spongycastle.crypto.engines.C5961k;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class DESede$DESede64with7816d4 extends BaseMac {
    public DESede$DESede64with7816d4() {
        super(new a(new C5961k(), 64, new c()));
    }
}
