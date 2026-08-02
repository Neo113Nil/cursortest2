package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* loaded from: classes13.dex */
public final class Me implements K8 {
    @Override // com.ironsource.K8
    public void a(Context context, String str, int i) {
        IronSourceUtils.b(context, str, i);
    }

    @Override // com.ironsource.K8
    public int b(Context context, String str, int i) {
        return IronSourceUtils.a(context, str, i);
    }

    @Override // com.ironsource.K8
    public void a(Context context, String str, long j) {
        IronSourceUtils.b(context, str, j);
    }

    @Override // com.ironsource.K8
    public long b(Context context, String str, long j) {
        return IronSourceUtils.a(context, str, j);
    }
}
