package com.vk.pin.views.keyboard;

import android.content.Context;
import com.vk.pin.views.keyboard.PinKeyboardView;
import xsna.sf6;

/* compiled from: KeyboardKeyFactory.kt */
/* loaded from: classes3.dex */
public interface a {
    sf6<? super PinKeyboardView.a> createKeyboardKey(Context context, int i);

    int getActualSize(int i, int i2);

    int getKeysCount();

    int getMaxSize(int i, int i2);

    int getMinSize(int i, int i2);
}
