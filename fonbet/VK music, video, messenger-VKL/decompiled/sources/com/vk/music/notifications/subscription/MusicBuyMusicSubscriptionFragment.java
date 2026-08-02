package com.vk.music.notifications.subscription;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.links.MusicSubscriptionScreen;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.notifications.restriction.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.bh6;
import xsna.by20;
import xsna.dt8;
import xsna.epx;
import xsna.k840;
import xsna.msy;
import xsna.nh0;
import xsna.rh6;
import xsna.s750;
import xsna.x2b0;

/* compiled from: MusicBuyMusicSubscriptionFragment.kt */
/* loaded from: classes3.dex */
public final class MusicBuyMusicSubscriptionFragment extends CustomisableBottomSheetFragment<bh6> {
    public static final /* synthetic */ int V = 0;
    public final Object T;
    public final Object U;

    public MusicBuyMusicSubscriptionFragment() {
        nh0 nh0Var = new nh0(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.T = msy.a(lazyThreadSafetyMode, nh0Var);
        this.U = msy.a(lazyThreadSafetyMode, new by20(this, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r7 == null) goto L18;
     */
    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bh6 eo() {
        MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType;
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("Null arguments!");
        }
        String string = arguments.getString("MUSIC_SUBSCRIPTION_TYPE");
        if (string != null) {
            MusicRestrictionPopupDisplayer.SubscriptionPopupType.Companion.getClass();
            MusicRestrictionPopupDisplayer.SubscriptionPopupType[] values = MusicRestrictionPopupDisplayer.SubscriptionPopupType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    subscriptionPopupType = null;
                    break;
                }
                subscriptionPopupType = values[i];
                if (epx.f(subscriptionPopupType.h(), string)) {
                    break;
                }
                i++;
            }
            if (subscriptionPopupType == null) {
                subscriptionPopupType = MusicRestrictionPopupDisplayer.SubscriptionPopupType.DEFAULT;
            }
        }
        subscriptionPopupType = MusicRestrictionPopupDisplayer.SubscriptionPopupType.DEFAULT;
        MusicRestrictionPopupDisplayer.SubscriptionPopupType subscriptionPopupType2 = subscriptionPopupType;
        boolean z = arguments.getBoolean("MUSIC_SUBSCRIPTION_IS_TRIAL", false);
        String string2 = arguments.getString("MUSIC_SUBSCRIPTION_POPUP_SOURCE");
        if (string2 == null) {
            string2 = "";
        }
        String str = string2;
        AppCompatActivity appCompatActivity = (AppCompatActivity) kn();
        s750 s750Var = k840.a.e;
        s750 s750Var2 = s750Var != null ? s750Var : null;
        a aVar = k840.a.d;
        a aVar2 = aVar != null ? aVar : null;
        FragmentActivity kn = kn();
        aVar2.getClass();
        return new dt8(appCompatActivity, str, s750Var2, this, new rh6(aVar2, str, subscriptionPopupType2, kn, 0), z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        x2b0.c((x2b0) this.U.getValue(), null, MobileOfficialAppsCoreNavStat$EventScreen.DIALOG_MODAL, 13);
        super.onShow(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("MUSIC_SUBSCRIPTION_STATUS")) == null || !((Boolean) this.T.getValue()).booleanValue()) {
            return;
        }
        MusicSubscriptionScreen.Companion.getClass();
        uiTrackingScreen.a = MusicSubscriptionScreen.a.a(string);
    }
}
