package com.vk.sharing.im_engine_impl;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.themes.ThemableActivity;
import com.vk.dto.common.Peer;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.sharing.api.di.SharingScopedComponent;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.core.SharingActivity;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.bc6;
import xsna.c5g;
import xsna.ccj0;
import xsna.dcj0;
import xsna.fpf0;
import xsna.g2v;
import xsna.l7m;
import xsna.m7m;
import xsna.msy;
import xsna.o0w;
import xsna.pq9;
import xsna.qah0;
import xsna.qbc0;
import xsna.v8k0;
import xsna.xa4;
import xsna.xq;

/* compiled from: SharingImEngineActivity.kt */
/* loaded from: classes5.dex */
public final class SharingImEngineActivity extends SharingActivity {
    public static final /* synthetic */ int q0 = 0;
    public final Object o0;
    public final Object p0;

    public SharingImEngineActivity() {
        qah0 qah0Var = new qah0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o0 = msy.a(lazyThreadSafetyMode, qah0Var);
        this.p0 = msy.a(lazyThreadSafetyMode, new qbc0(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void B3(Target target, pq9 pq9Var) {
        ((ccj0) this.o0.getValue()).a(target, pq9Var);
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void P2(long j) {
        g2v.c().b().d(j, this);
    }

    @Override // com.vk.sharing.core.BaseSharingActivity
    public final dcj0 V1() {
        l7m a = m7m.a(this);
        Peer peer = this.Z;
        if (peer == null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        return ((SharingScopedComponent) xq.f((ImFeatureScopeProviderComponent) a.a(fpf0.a(ImFeatureScopeProviderComponent.class)), peer, a).a(fpf0.a(SharingScopedComponent.class))).c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public final void n3() {
        EmptyList emptyList;
        bc6 L = xa4.L(this);
        o0w b = g2v.c().b();
        ThemableActivity themableActivity = this.i;
        String string = themableActivity.getString(R.string.sharing_create_chat_title);
        String string2 = themableActivity.getString(R.string.sharing_create_chat_confirm);
        EmptyList emptyList2 = EmptyList.b;
        if (this.F) {
            HashSet hashSet = this.v.d;
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((Target) next).k) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((Target) it2.next()).c.b));
            }
            emptyList = arrayList2;
        } else {
            emptyList = emptyList2;
        }
        b.c(L, 21804, string, string2, emptyList2, emptyList, "share_to_new_chat");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.sharing.core.SharingActivity, com.vk.sharing.core.BaseSharingActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((v8k0) this.p0.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.sharing.core.SharingActivity, com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        v8k0 v8k0Var = (v8k0) this.p0.getValue();
        c cVar = v8k0Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        v8k0Var.c = null;
        super.onDestroy();
    }
}
