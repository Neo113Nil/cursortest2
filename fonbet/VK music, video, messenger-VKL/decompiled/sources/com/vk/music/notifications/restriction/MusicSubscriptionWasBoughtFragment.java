package com.vk.music.notifications.restriction;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.superapp.api.dto.auth.validatephonecheck.AuthValidatePhoneCheckResponse;
import xsna.o950;
import xsna.q55;
import xsna.r55;

/* compiled from: MusicSubscriptionWasBoughtFragment.kt */
/* loaded from: classes3.dex */
public final class MusicSubscriptionWasBoughtFragment extends CustomisableBottomSheetFragment<o950> {
    public static final /* synthetic */ int T = 0;

    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment
    public final o950 eo() {
        AuthValidatePhoneCheckResponse authValidatePhoneCheckResponse;
        Bundle arguments = getArguments();
        if (arguments == null || (authValidatePhoneCheckResponse = (AuthValidatePhoneCheckResponse) arguments.getParcelable("AUTH_CHECK_RESPONSE_ARG")) == null) {
            throw new IllegalStateException("Null auth check!");
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) kn();
        r55 r55Var = r55.a;
        q55 q55Var = q55.a;
        return new o950(appCompatActivity, authValidatePhoneCheckResponse);
    }
}
