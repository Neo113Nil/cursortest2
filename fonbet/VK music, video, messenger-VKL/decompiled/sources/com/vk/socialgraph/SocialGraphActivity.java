package com.vk.socialgraph;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.main.j;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.c;
import com.vk.socialgraph.SocialGraphOpenParams;
import com.vk.socialgraph.SocialGraphStrategy;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import xsna.bpn0;
import xsna.dd80;
import xsna.dhr0;
import xsna.fnj;
import xsna.frf0;
import xsna.hb40;
import xsna.iah0;
import xsna.irc0;
import xsna.j550;
import xsna.s3q0;

/* compiled from: SocialGraphActivity.kt */
/* loaded from: classes5.dex */
public final class SocialGraphActivity extends FragmentActivity {
    public static final /* synthetic */ int i = 0;
    public a g;
    public final bpn0 f = new bpn0(new irc0(this, 9));
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment G = supportFragmentManager.G(R.id.vk_fragment_container);
        c cVar = G instanceof c ? (c) G : null;
        ArrayList<SchemeStatSak$RegistrationFieldItem> c = com.vk.registration.funnels.a.c(cVar != null ? cVar.aa() : null);
        SchemeStatSak$EventScreen b = frf0.b(G);
        int K = supportFragmentManager.K();
        super.onBackPressed();
        s3q0 s3q0Var = s3q0.a;
        frf0.g(b, K > 0 ? frf0.b(supportFragmentManager.G(R.id.vk_fragment_container)) : frf0.a.Ab(), c, null, 8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        HashSet hashSet = iah0.a;
        if (!fnj.d(this)) {
            setRequestedOrientation(1);
        }
        Pattern pattern = a.d;
        a.e += "onCreate(" + ((Number) this.f.getValue()).intValue() + ");";
        Intent intent = getIntent();
        boolean z = (intent == null || (extras = intent.getExtras()) == null) ? true : extras.getBoolean("needAvatar", true);
        ArrayList arrayList = new ArrayList(b.a);
        if (!z) {
            arrayList.remove(SocialGraphStrategy.Screen.AVATAR);
        }
        SocialGraphStrategy.Screen screen = SocialGraphStrategy.Screen.TOPICS;
        if (!arrayList.contains(screen)) {
            arrayList.add(screen);
        }
        this.h.b(com.vk.toggle.b.A.u(new j550(this, arrayList), null));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        hb40 hb40Var = new hb40(this, 20);
        a aVar = new a(supportFragmentManager, arrayList, hb40Var);
        this.g = aVar;
        j jVar = new j();
        dd80.t = aVar;
        dd80.u = jVar;
        setTheme(dhr0.C().c);
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        frameLayout.setId(R.id.vk_fragment_container);
        setContentView(frameLayout, layoutParams);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.c(this, bundle);
        if (bundle == null) {
            SocialGraphOpenParams socialGraphOpenParams = new SocialGraphOpenParams(SocialGraphOpenParams.OpenAction.CREATE);
            if (arrayList.isEmpty()) {
                hb40Var.invoke(socialGraphOpenParams);
            } else {
                if (aVar.e((SocialGraphStrategy.Screen) arrayList.get(0), socialGraphOpenParams, true)) {
                    return;
                }
                aVar.d((SocialGraphStrategy.Screen) arrayList.get(0), socialGraphOpenParams, true);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Pattern pattern = a.d;
        a.e += "onDestroy(" + ((Number) this.f.getValue()).intValue() + ");";
        dd80.t = null;
        dd80.u = null;
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.h();
        this.h.dispose();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.g != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.e(frf0.b(supportFragmentManager.G(R.id.vk_fragment_container)), null, 6);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        bundle.putParcelable("registration_screens", frf0.a);
        bundle.putString("registration_sid", frf0.c);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        if (!isFinishing() && this.g != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.m(frf0.b(supportFragmentManager.G(R.id.vk_fragment_container)), false);
            frf0.j(SchemeStatSak$TypeRegistrationItem.EventType.SCREEN_BLUR, null, null, null, null, 248);
            RegistrationElementsTracker.b.clear();
        }
        super.onStop();
    }
}
