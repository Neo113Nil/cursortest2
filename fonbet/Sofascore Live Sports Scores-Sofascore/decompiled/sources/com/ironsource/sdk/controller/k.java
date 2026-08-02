package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC4081g;
import com.ironsource.InterfaceC4099h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface k {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements InterfaceC4081g {
        @Override // com.ironsource.InterfaceC4081g
        @NotNull
        public Intent a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements InterfaceC4099h {
        @Override // com.ironsource.InterfaceC4099h
        @NotNull
        public Intent a(@NotNull Context context) {
            context.getClass();
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements InterfaceC4099h {
        @Override // com.ironsource.InterfaceC4099h
        @NotNull
        public Intent a(@NotNull Context context) {
            context.getClass();
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
