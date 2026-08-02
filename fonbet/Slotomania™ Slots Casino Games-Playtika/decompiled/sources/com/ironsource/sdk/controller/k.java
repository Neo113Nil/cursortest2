package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC2426g;
import com.ironsource.InterfaceC2444h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface k {

    public static final class a implements InterfaceC2426g {
        @Override // com.ironsource.InterfaceC2426g
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public static final class b implements InterfaceC2444h {
        @Override // com.ironsource.InterfaceC2444h
        public Intent a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    public static final class c implements InterfaceC2444h {
        @Override // com.ironsource.InterfaceC2444h
        public Intent a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
