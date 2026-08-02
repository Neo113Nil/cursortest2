package com.vk.folders.impl.select;

import com.vk.im.mvicomponent.SingleComponentFragment;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a1w;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.iu90;
import xsna.nzr;
import xsna.oz50;
import xsna.q1w;
import xsna.qas;
import xsna.qcy;
import xsna.ras;
import xsna.rl3;
import xsna.yj50;

/* compiled from: FolderPeersSelectFragment.kt */
/* loaded from: classes18.dex */
public final class FolderPeersSelectFragment extends SingleComponentFragment {
    public static final /* synthetic */ qcy<Object>[] X;
    public final ras U;
    public final ras V;
    public final qas W;

    /* compiled from: FolderPeersSelectFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FolderPeersSelectFragment.class, "alreadySelected", "getAlreadySelected()[J", 0);
        hpf0 hpf0Var = fpf0.a;
        X = new qcy[]{propertyReference1Impl, fp.c(0, FolderPeersSelectFragment.class, "alreadyUnselected", "getAlreadyUnselected()[J", hpf0Var), ep.a(0, FolderPeersSelectFragment.class, "targetFolderId", "getTargetFolderId()Ljava/lang/Integer;", hpf0Var)};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, long[]] */
    public FolderPeersSelectFragment() {
        super(R.layout.vkim_folder_peers_select_fragment_container);
        this.U = new ras("already_selected", (Serializable) new long[0]);
        this.V = new ras("already_unselected", (Serializable) new long[0]);
        this.W = new qas("target_folder_id", (String) null);
    }

    @Override // com.vk.im.mvicomponent.SingleComponentFragment
    public final yj50<?, ?, ?, ?, ?, ?, ?> jo() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        qas qasVar = this.W;
        qcy<Object>[] qcyVarArr = X;
        qcy<Object> qcyVar = qcyVarArr[2];
        Integer num = (Integer) qasVar.b(this);
        ras rasVar = this.U;
        qcy<Object> qcyVar2 = qcyVarArr[0];
        Set<Long> x0 = rl3.x0((long[]) rasVar.a(this));
        ras rasVar2 = this.V;
        qcy<Object> qcyVar3 = qcyVarArr[1];
        return new nzr(a1wVar, this, new iu90(num, x0, rl3.x0((long[]) rasVar2.a(this))));
    }
}
