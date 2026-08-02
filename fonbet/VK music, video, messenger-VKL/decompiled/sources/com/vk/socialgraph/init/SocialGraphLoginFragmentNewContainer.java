package com.vk.socialgraph.init;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.b;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.socialgraph.a;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.dd80;
import xsna.frf0;
import xsna.msy;
import xsna.oqw;
import xsna.qro0;
import xsna.wf40;
import xsna.yq1;

/* compiled from: SocialGraphLoginFragmentNewContainer.kt */
/* loaded from: classes5.dex */
public final class SocialGraphLoginFragmentNewContainer extends BaseSocialGraphInitFragment {
    public static final /* synthetic */ int Q = 0;
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new wf40(this, 28));
    public boolean P;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 321) {
            if (i2 == -2) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            } else if (i2 == -1) {
                a aVar = dd80.t;
                if (aVar != null) {
                    Bundle bundle = Bundle.EMPTY;
                    aVar.c(new SocialGraphOpenParams(SocialGraphOpenParams.OpenAction.CONNECT_BUTTON));
                }
                b bVar = b.a;
                bVar.getClass();
                b.z(bVar, SchemeStatSak$EventScreen.REGISTRATION_IMPORT_CONTACTS, null, null, null, 30);
            } else if (i2 == 0) {
                a aVar2 = dd80.t;
                if (aVar2 != null) {
                    aVar2.d(SocialGraphStrategy.Screen.CONTACTS, new SocialGraphOpenParams(SocialGraphOpenParams.OpenAction.SKIP_BUTTON), false);
                }
                b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                qro0.c(new yq1(18, SchemeStatSak$EventScreen.REGISTRATION_IMPORT_CONTACTS, SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_SKIP));
            }
            this.P = true;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ((oqw) this.O.getValue()).a(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.socialgraph.init.BaseSocialGraphInitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.P) {
            ((oqw) this.O.getValue()).a(this);
            this.P = false;
        }
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        ListBuilder listBuilder = com.vk.socialgraph.b.a;
        return com.vk.socialgraph.b.a(SocialGraphStrategy.Screen.CONTACTS, false);
    }
}
