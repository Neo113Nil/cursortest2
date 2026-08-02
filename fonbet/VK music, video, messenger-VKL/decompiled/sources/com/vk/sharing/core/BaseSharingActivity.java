package com.vk.sharing.core;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.PushAwareActivity;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.sharing.core.a;
import com.vk.sharing.core.cancellation.TargetSharingTask;
import com.vk.sharing.core.view.l;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import xsna.bbj0;
import xsna.bcj0;
import xsna.c5g;
import xsna.cvk;
import xsna.dcj0;
import xsna.ecj0;
import xsna.fcj0;
import xsna.hdm;
import xsna.i0q0;
import xsna.j6i;
import xsna.l4o0;
import xsna.m7m;
import xsna.pq9;
import xsna.qfq;

/* loaded from: classes5.dex */
public abstract class BaseSharingActivity extends PushAwareActivity implements a.InterfaceC1778a, l.a, l4o0.b {

    @Nullable
    public SharingComponent A;

    @Nullable
    public dcj0 B;

    @Nullable
    public fcj0 C;

    @Nullable
    public bbj0 D;

    @Nullable
    public hdm E;
    public final boolean F;
    public ecj0 v;

    @Nullable
    public com.vk.sharing.core.view.f w;

    @Nullable
    public pq9 x;

    @Nullable
    public a y;
    public boolean z = false;

    public BaseSharingActivity() {
        ImFeatures imFeatures = ImFeatures.GRID_SHARING_CREATE_CHAT;
        imFeatures.getClass();
        this.F = com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void B2() {
        this.y.B2();
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public boolean C3() {
        return false;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void D2() {
        this.y.D2();
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public boolean D3() {
        return true;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void E2(boolean z) {
        this.y.E2(z);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public boolean E3() {
        return false;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void F2() {
        this.y.F2();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void H2(int i) {
        this.y.H2(i);
    }

    @Override // com.vk.sharing.core.view.l.a
    public final boolean I2() {
        return this.y.I2();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void M2() {
        this.y.M2();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void O2(boolean z) {
        this.y.O2(z);
    }

    @Override // xsna.l4o0.b
    public final void P(@NonNull ArrayList<Target> arrayList) {
        this.y.P(arrayList);
    }

    public final void T1() {
        try {
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("VK link", U1()));
            this.v.a(AppShareType.COPY_LINK);
            cvk.w(getString(R.string.sharing_toast_link_copied), false);
        } catch (Exception unused) {
        }
    }

    public String U1() {
        return getIntent().getStringExtra("android.intent.extra.TEXT");
    }

    @NonNull
    public dcj0 V1() {
        if (this.B == null) {
            this.B = W1().c();
        }
        return this.B;
    }

    @NonNull
    public final SharingComponent W1() {
        if (this.A == null) {
            this.A = (SharingComponent) j6i.b(m7m.f(this), SharingComponent.class);
        }
        return this.A;
    }

    @Override // xsna.l4o0.b
    public final void Z(@NonNull ArrayList<Target> arrayList) {
        this.y.Z(arrayList);
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void b() {
        this.y.b();
    }

    @Override // xsna.l4o0.b
    public final void b1() {
        this.y.getClass();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void c() {
        this.y.c();
    }

    @Override // xsna.l4o0.b
    public final void c0() {
        this.y.c0();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void e(@NonNull Target target, int i) {
        this.y.e(target, i);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void f3(@NonNull a aVar) {
        this.y = aVar;
        com.vk.sharing.core.view.f fVar = this.w;
        if (fVar != null) {
            fVar.setDelegatePresenter(aVar);
        }
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void g2() {
        this.y.g2();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void h2() {
        this.y.h2();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void i2() {
        this.y.i2();
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    @Nullable
    public AttachmentInfo i3() {
        return null;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void k2(@NonNull qfq qfqVar) {
        this.y.k2(qfqVar);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public int l3() {
        return -1;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void m2(boolean z) {
        this.y.m2(z);
    }

    @Override // xsna.l4o0.b
    public final void n1(@NonNull ArrayList<Target> arrayList) {
        this.y.n1(arrayList);
    }

    @Override // xsna.l4o0.b
    public final void o0() {
        this.y.o0();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 21804 && intent != null) {
            Peer peer = (Peer) intent.getParcelableExtra("dialog_id");
            long j = peer != null ? peer.b : 0L;
            if (j == 0) {
                return;
            }
            X1(new UserId(j), !this.F);
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.v = new ecj0();
        } else {
            this.v = new ecj0(bundle);
        }
        this.z = getIntent().getBooleanExtra("hide_keyboard_on_done", false);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        pq9 pq9Var = this.x;
        if (pq9Var != null) {
            Collection<TargetSharingTask> values = pq9Var.c.values();
            ArrayList arrayList = new ArrayList(c5g.u(values, 10));
            for (TargetSharingTask targetSharingTask : values) {
                targetSharingTask.getClass();
                i0q0.g(targetSharingTask);
                arrayList.add(targetSharingTask);
            }
            bundle.putParcelableArray("cancellation_tasks_storage", (TargetSharingTask[]) arrayList.toArray(new TargetSharingTask[0]));
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        pq9 pq9Var;
        super.onStop();
        if (isChangingConfigurations() || (pq9Var = this.x) == null) {
            return;
        }
        pq9Var.a();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void p2(@NonNull String str) {
        this.y.p2(str);
    }

    @Override // com.vk.sharing.core.view.l.a
    public final boolean q2() {
        return this.y.q2();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void s2() {
        this.y.s2();
    }

    @Override // com.vk.sharing.core.view.l.a
    @Nullable
    public final pq9 t2() {
        return this.x;
    }

    @Override // xsna.l4o0.b
    public final void v(@NonNull ArrayList<Target> arrayList, boolean z) {
        this.y.v(arrayList, z);
    }

    @Override // com.vk.sharing.core.view.l.a
    public final boolean w2() {
        return this.y.w2();
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void x2(boolean z) {
        this.y.x2(z);
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public boolean y3() {
        return true;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void z2() {
        this.y.z2();
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void A3() {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void a3() {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void g3() {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void m3() {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void q3() {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void r3() {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void u3() {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void Z2(@Nullable String str) {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void z3(@NonNull bcj0 bcj0Var) {
    }

    public void X1(UserId userId, boolean z) {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void c3(@NonNull String str, @NonNull List<Target> list) {
    }

    @Override // com.vk.sharing.core.a.InterfaceC1778a
    public void v3(@NonNull String str, @NonNull WallRepostSettings wallRepostSettings) {
    }
}
