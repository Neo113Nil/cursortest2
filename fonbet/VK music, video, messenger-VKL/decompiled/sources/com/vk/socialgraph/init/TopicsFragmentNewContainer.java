package com.vk.socialgraph.init;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.main.j;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.socialgraph.SocialStatSender;
import com.vk.socialgraph.a;
import com.vk.socialgraph.b;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.dd80;
import xsna.dzq0;
import xsna.gqh0;
import xsna.msy;

/* compiled from: TopicsFragmentNewContainer.kt */
/* loaded from: classes5.dex */
public final class TopicsFragmentNewContainer extends BaseSocialGraphInitFragment {
    public static final /* synthetic */ int Q = 0;
    public final Object O = msy.a(LazyThreadSafetyMode.NONE, new gqh0(this, 8));
    public boolean P;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i, i2, intent);
        this.P = true;
        if (i == 321 && i2 == -1) {
            a aVar = dd80.t;
            if (aVar != null) {
                aVar.d(SocialGraphStrategy.Screen.TOPICS, new SocialGraphOpenParams(SocialGraphOpenParams.OpenAction.AFTER_RESULT_SUCCESS), false);
            }
            j jVar = dd80.u;
            if (jVar != null) {
                jVar.k(SocialStatSender.Screen.TOPICS, SocialStatSender.Status.DEFAULT);
            }
        }
        if (i == 321 && i2 == 0 && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ((dzq0) this.O.getValue()).a(requireContext(), this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.socialgraph.init.BaseSocialGraphInitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.P) {
            ((dzq0) this.O.getValue()).a(requireContext(), this);
            this.P = false;
        }
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        ListBuilder listBuilder = b.a;
        return b.a(SocialGraphStrategy.Screen.RECOM_THEMES, false);
    }
}
