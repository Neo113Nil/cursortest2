package com.vk.libvideo.live.impl.broadcast_settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bo8;
import xsna.cvk;
import xsna.ej8;
import xsna.fb;
import xsna.fj8;
import xsna.fkq0;
import xsna.gm50;
import xsna.izs;
import xsna.j03;
import xsna.ki8;
import xsna.kj8;
import xsna.km50;
import xsna.lj8;
import xsna.mk50;
import xsna.oj8;
import xsna.pi8;
import xsna.s3q0;
import xsna.ui8;
import xsna.vi8;
import xsna.vk50;
import xsna.x7;
import xsna.xn50;

/* compiled from: BroadcastSettingsFragment.kt */
/* loaded from: classes3.dex */
public final class BroadcastSettingsFragment extends MviImplFragment<pi8, oj8, ki8> {
    public lj8 Q;
    public final a R = new a();
    public final c S = new c();

    /* compiled from: BroadcastSettingsFragment.kt */
    public static final class a implements vi8 {
        public a() {
        }

        @Override // xsna.vi8
        public final void a(BroadcastAuthor broadcastAuthor, BroadcastStream broadcastStream) {
            Intent intent = new Intent();
            intent.putExtra("result_extra_selected_author", broadcastAuthor);
            intent.putExtra("result_extra_selected_stream", broadcastStream);
            BroadcastSettingsFragment broadcastSettingsFragment = BroadcastSettingsFragment.this;
            broadcastSettingsFragment.kn().setResult(-1, intent);
            broadcastSettingsFragment.kn().finish();
        }

        @Override // xsna.vi8
        public final void close() {
            BroadcastSettingsFragment.this.kn().finish();
        }
    }

    /* compiled from: BroadcastSettingsFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ki8, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ki8 ki8Var) {
            BroadcastSettingsFragment broadcastSettingsFragment = (BroadcastSettingsFragment) this.receiver;
            broadcastSettingsFragment.getClass();
            xn50.a.c(broadcastSettingsFragment, ki8Var);
            return s3q0.a;
        }
    }

    /* compiled from: BroadcastSettingsFragment.kt */
    public static final class c implements kj8 {
        public c() {
        }

        @Override // xsna.kj8
        public final void a(Throwable th) {
            cvk.w(j03.g(BroadcastSettingsFragment.this.mo2getContext(), th, R.string.error), false);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        lj8 lj8Var = new lj8(getViewLifecycleOwner(), requireContext(), new b(1, this, BroadcastSettingsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
        this.Q = lj8Var;
        return new mk50.c(lj8Var.b);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        oj8 oj8Var = (oj8) ao50Var;
        lj8 lj8Var = this.Q;
        if (lj8Var == null) {
            lj8Var = null;
        }
        lj8Var.getClass();
        oj8Var.a.a(new com.vk.im.engine.internal.api_commands.messages.a(lj8Var, 8), lj8Var.o);
        gm50.a.b(lj8Var, oj8Var.b, new x7(lj8Var, 13));
        gm50.a.b(lj8Var, oj8Var.c, new fb(lj8Var, 8));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId userId = (UserId) bundle.getParcelable("extra_preselected_author_id");
        if (userId != null) {
            return new pi8(new ej8(new fj8(fkq0.a(userId), bo8.d(bundle, "extra_preselected_stream_id"), null, null, null, null, null, false, false)), new ui8(), this.R, this.S);
        }
        throw new IllegalStateException("No author userId passed");
    }
}
