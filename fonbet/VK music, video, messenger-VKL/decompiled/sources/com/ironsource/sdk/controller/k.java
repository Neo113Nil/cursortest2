package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.InterfaceC4322g;
import com.ironsource.InterfaceC4340h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;

/* loaded from: classes13.dex */
public interface k {

    public static final class a implements InterfaceC4322g {
        @Override // com.ironsource.InterfaceC4322g
        public Intent a() {
            return new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        }
    }

    public static final class b implements InterfaceC4340h {
        @Override // com.ironsource.InterfaceC4340h
        public Intent a(Context context) {
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    public static final class c implements InterfaceC4340h {
        @Override // com.ironsource.InterfaceC4340h
        public Intent a(Context context) {
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
