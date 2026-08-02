package com.vk.folders.impl.configure;

import android.content.Intent;
import com.vk.folders.impl.configure.a;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.mvicomponent.SingleComponentFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a1w;
import xsna.b25;
import xsna.bpn0;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.m2g;
import xsna.n15;
import xsna.oz50;
import xsna.q1w;
import xsna.qas;
import xsna.qcy;
import xsna.rl3;
import xsna.w8i;
import xsna.yj50;

/* compiled from: FolderConfigurationFragment.kt */
/* loaded from: classes18.dex */
public final class FolderConfigurationFragment extends SingleComponentFragment implements w8i {
    public static final /* synthetic */ qcy<Object>[] b0;
    public final bpn0 U;
    public final qas V;
    public final qas W;
    public final qas X;
    public final io.reactivex.rxjava3.subjects.f<Boolean> Y;
    public final io.reactivex.rxjava3.subjects.f Z;
    public c a0;

    /* compiled from: FolderConfigurationFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(FolderConfigurationFragment.class, null, null);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FolderConfigurationFragment.class, "configurationFolderId", "getConfigurationFolderId()Ljava/lang/Integer;", 0);
        hpf0 hpf0Var = fpf0.a;
        b0 = new qcy[]{propertyReference1Impl, fp.c(0, FolderConfigurationFragment.class, "configurationFolderName", "getConfigurationFolderName()Ljava/lang/String;", hpf0Var), ep.a(0, FolderConfigurationFragment.class, "configurationFolderType", "getConfigurationFolderType()Ljava/lang/String;", hpf0Var)};
    }

    public FolderConfigurationFragment() {
        super(R.layout.vkim_folder_configuration_fragment_container);
        this.U = new bpn0(new m2g(this, 19));
        this.V = new qas("configuration_data_id", (String) null);
        this.W = new qas("configuration_data_name", (String) null);
        this.X = new qas("configuration_data_type", (String) null);
        io.reactivex.rxjava3.subjects.f<Boolean> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.Y = fVar;
        this.Z = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    @Override // com.vk.im.mvicomponent.SingleComponentFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yj50<?, ?, ?, ?, ?, ?, ?> jo() {
        com.vk.folders.impl.configure.a aVar;
        com.vk.folders.impl.configure.a bVar;
        a1w a1wVar;
        qas qasVar = this.W;
        qcy<Object>[] qcyVarArr = b0;
        qcy<Object> qcyVar = qcyVarArr[1];
        String str = (String) qasVar.b(this);
        if (str == null) {
            aVar = a.C1068a.a;
        } else {
            qas qasVar2 = this.V;
            qcy<Object> qcyVar2 = qcyVarArr[0];
            Integer num = (Integer) qasVar2.b(this);
            if (num != null) {
                int intValue = num.intValue();
                FolderType.b bVar2 = FolderType.Companion;
                qas qasVar3 = this.X;
                qcy<Object> qcyVar3 = qcyVarArr[2];
                String str2 = (String) qasVar3.b(this);
                bVar2.getClass();
                bVar = new a.b(intValue, str, FolderType.b.a(str2));
                a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                c cVar = new c(this, bVar, a1wVar, (b25) this.U.getValue(), this.Z);
                this.a0 = cVar;
                return cVar;
            }
            aVar = a.C1068a.a;
        }
        bVar = aVar;
        a1wVar = q1w.a;
        if (a1wVar == null) {
        }
        c cVar2 = new c(this, bVar, a1wVar, (b25) this.U.getValue(), this.Z);
        this.a0 = cVar2;
        return cVar2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent == null || i != 100) {
            return;
        }
        c cVar = this.a0;
        if (cVar == null) {
            cVar = null;
        }
        List<Long> t0 = rl3.t0(intent.getExtras().getLongArray("included_peers"));
        List<Long> t02 = rl3.t0(intent.getExtras().getLongArray("excluded_peers"));
        d feature = cVar.getFeature();
        feature.q(new n15(t0, t02, feature, 4));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.Y.onNext(Boolean.valueOf(z));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.Y.onNext(Boolean.TRUE);
    }
}
