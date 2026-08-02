package com.vk.superapp.vkpay.checkout.feature.verification.keyboard.keys;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.pin.views.keyboard.PinKeyboardView;
import com.vk.pin.views.keyboard.b;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vkontakte.android.R;
import xsna.bbv0;
import xsna.c57;
import xsna.fla0;
import xsna.gz80;
import xsna.iah0;
import xsna.krv0;
import xsna.sf6;
import xsna.tdy;

/* compiled from: CheckoutPinKeyboardFactory.kt */
@Keep
/* loaded from: classes6.dex */
public class CheckoutPinKeyboardFactory implements com.vk.pin.views.keyboard.a {
    private final b delegate;
    private final tdy keyParams;
    private final int keysCount = 12;

    /* compiled from: CheckoutPinKeyboardFactory.kt */
    public static final class a extends AppCompatImageView {
        public final /* synthetic */ CheckoutPinKeyboardFactory b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, CheckoutPinKeyboardFactory checkoutPinKeyboardFactory) {
            super(context);
            this.b = checkoutPinKeyboardFactory;
        }

        @Override // android.widget.ImageView, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int keyboardKeySize = this.b.getKeyboardKeySize(i, i2);
            setMeasuredDimension(keyboardKeySize, keyboardKeySize);
        }
    }

    public CheckoutPinKeyboardFactory(tdy tdyVar) {
        this.keyParams = tdyVar;
        this.delegate = new b(tdyVar);
    }

    private final fla0 createBiometricKey(Context context) {
        a aVar = new a(context, this);
        aVar.setImageDrawable(krv0.f(R.drawable.vk_icon_touch_id_outline_28, R.attr.vk_legacy_icon_secondary, context));
        aVar.setScaleType(ImageView.ScaleType.CENTER);
        return new fla0(aVar);
    }

    private final sf6<? super PinKeyboardView.a> createFingerprintKey(Context context, int i) {
        if (!isFingerprintAvailable(context)) {
            return this.delegate.createKeyboardKey(context, i);
        }
        fla0 createBiometricKey = createBiometricKey(context);
        customizeKeyView(createBiometricKey, i);
        return createBiometricKey;
    }

    private final boolean isFingerprintAvailable(Context context) {
        if (gz80.a(23)) {
            bbv0.g.getClass();
            VkPayCheckoutConfig vkPayCheckoutConfig = bbv0.a.f().b;
            if (vkPayCheckoutConfig == null) {
                throw new IllegalStateException("Config must not be null");
            }
            UserId userId = vkPayCheckoutConfig.c.getUserId();
            boolean contains = Preference.g(context).contains("VK_PAY_CHECKOUT_VKPAY_TOKEN/" + userId.b);
            boolean z = c57.c(context).a(255) == 0;
            if (contains && z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.pin.views.keyboard.a
    public sf6<? super PinKeyboardView.a> createKeyboardKey(Context context, int i) {
        return ((i >= 0 && i < 9) || i == 10 || i == 11) ? this.delegate.createKeyboardKey(context, i) : createFingerprintKey(context, i);
    }

    public void customizeKeyView(sf6<? extends PinKeyboardView.a> sf6Var, int i) {
        View view = sf6Var.a;
        view.setLayoutParams(getKeyLayoutParams(this.keyParams));
        int i2 = this.keyParams.a;
        if (i2 != 0) {
            view.setBackgroundResource(i2);
        }
    }

    @Override // com.vk.pin.views.keyboard.a
    public int getActualSize(int i, int i2) {
        int minSize = getMinSize(i, i2);
        return Math.min(Math.max(Math.max(i, i2), minSize), getMaxSize(i, i2));
    }

    public final b getDelegate() {
        return this.delegate;
    }

    public ViewGroup.LayoutParams getKeyLayoutParams(tdy tdyVar) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(tdyVar.b, tdyVar.c, tdyVar.d, tdyVar.e);
        layoutParams.weight = 1.0f;
        return layoutParams;
    }

    public int getKeyboardKeySize(int i, int i2) {
        return getActualSize(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // com.vk.pin.views.keyboard.a
    public int getKeysCount() {
        return this.keysCount;
    }

    @Override // com.vk.pin.views.keyboard.a
    public int getMaxSize(int i, int i2) {
        return iah0.a(76);
    }

    @Override // com.vk.pin.views.keyboard.a
    public int getMinSize(int i, int i2) {
        return iah0.a(24);
    }
}
