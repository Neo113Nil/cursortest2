package com.vk.superapp.vkpay.checkout.feature.pin;

import android.content.Context;
import androidx.annotation.Keep;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.superapp.vkpay.checkout.feature.verification.keyboard.keys.CheckoutPinKeyboardFactory;
import xsna.sf6;
import xsna.tdy;

/* compiled from: CheckoutPinNoBiometricKeyboardFactory.kt */
@Keep
/* loaded from: classes6.dex */
public final class CheckoutPinNoBiometricKeyboardFactory extends CheckoutPinKeyboardFactory {
    public CheckoutPinNoBiometricKeyboardFactory(tdy tdyVar) {
        super(tdyVar);
    }

    @Override // com.vk.superapp.vkpay.checkout.feature.verification.keyboard.keys.CheckoutPinKeyboardFactory, com.vk.pin.views.keyboard.a
    public sf6<? super PinKeyboardView.a> createKeyboardKey(Context context, int i) {
        return getDelegate().createKeyboardKey(context, i);
    }
}
