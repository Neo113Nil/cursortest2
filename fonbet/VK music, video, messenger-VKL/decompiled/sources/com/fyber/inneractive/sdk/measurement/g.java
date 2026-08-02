package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {
    public final /* synthetic */ List a;
    public final /* synthetic */ i b;

    public g(List list, i iVar) {
        this.a = list;
        this.b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.b.mReason)));
            }
        }
        return arrayList;
    }
}
