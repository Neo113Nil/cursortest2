package com.vk.topics.impl.fragments;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cvk;
import xsna.drm0;
import xsna.gi7;
import xsna.h03;
import xsna.hg1;
import xsna.itg0;
import xsna.izs;
import xsna.ph3;
import xsna.ri0;
import xsna.rsg0;
import xsna.s3q0;
import xsna.v8;
import xsna.yfb;

/* compiled from: BoardTopicsFragment.kt */
/* loaded from: classes6.dex */
public final class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ BoardTopicsFragment b;
    public final /* synthetic */ VkInputSelect c;
    public final /* synthetic */ VkInputSelect d;
    public final /* synthetic */ FragmentActivity e;

    /* compiled from: BoardTopicsFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public b(BoardTopicsFragment boardTopicsFragment, VkInputSelect vkInputSelect, VkInputSelect vkInputSelect2, FragmentActivity fragmentActivity) {
        this.b = boardTopicsFragment;
        this.c = vkInputSelect;
        this.d = vkInputSelect2;
        this.e = fragmentActivity;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        BoardTopicsFragment boardTopicsFragment = this.b;
        boardTopicsFragment.K0 = true;
        String valueOf = String.valueOf(this.c.getText());
        String valueOf2 = String.valueOf(this.d.getText());
        if (drm0.N(valueOf) || drm0.N(valueOf2)) {
            cvk.u(R.string.create_topic_empty_toast, false);
        } else {
            itg0.c(hg1.n(rsg0.D0(yfb.x(((gi7) boardTopicsFragment.N0.getValue()).a(boardTopicsFragment.No(), valueOf, valueOf2))), this.e, false, null, 62).subscribe(new v8(new ri0(3, boardTopicsFragment, valueOf), 8), new ph3(a.b, 6)), boardTopicsFragment);
        }
    }
}
