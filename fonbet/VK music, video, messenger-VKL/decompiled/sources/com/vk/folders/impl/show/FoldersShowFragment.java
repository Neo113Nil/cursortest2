package com.vk.folders.impl.show;

import com.vk.im.mvicomponent.SingleComponentFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a1w;
import xsna.b1h;
import xsna.bpn0;
import xsna.d2s;
import xsna.fpf0;
import xsna.l2s;
import xsna.oz50;
import xsna.q1w;
import xsna.qas;
import xsna.qcy;
import xsna.yj50;

/* compiled from: FoldersShowFragment.kt */
/* loaded from: classes18.dex */
public final class FoldersShowFragment extends SingleComponentFragment {
    public static final /* synthetic */ qcy<Object>[] W;
    public final qas U;
    public final bpn0 V;

    /* compiled from: FoldersShowFragment.kt */
    public static final class a extends oz50 {
        public a(l2s l2sVar) {
            super(FoldersShowFragment.class, null, null);
            if (l2sVar instanceof l2s.b) {
                this.j.putLong("dialog_add_id_key", ((l2s.b) l2sVar).a);
            } else if (!(l2sVar instanceof l2s.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FoldersShowFragment.class, "dialogAddId", "getDialogAddId()Ljava/lang/Long;", 0);
        fpf0.a.getClass();
        W = new qcy[]{propertyReference1Impl};
    }

    public FoldersShowFragment() {
        super(R.layout.vkim_folders_show_fragment_container);
        this.U = new qas("dialog_add_id_key", (String) null);
        this.V = new bpn0(new b1h(this, 15));
    }

    @Override // com.vk.im.mvicomponent.SingleComponentFragment
    public final yj50<?, ?, ?, ?, ?, ?, ?> jo() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return new d2s(this, a1wVar, (l2s) this.V.getValue());
    }
}
