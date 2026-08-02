package io.seon.androidsdk.service;

import android.view.InputDevice;

/* renamed from: io.seon.androidsdk.service.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4955j4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f53399a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f53400b;

    public C4955j4(InputDevice inputDevice) {
        this.f53399a = inputDevice.getName();
        this.f53400b = Integer.valueOf(inputDevice.getVendorId());
    }
}
