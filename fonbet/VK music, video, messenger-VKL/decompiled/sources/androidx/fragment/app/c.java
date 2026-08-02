package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.b;
import kotlin.jvm.internal.Lambda;
import xsna.at6;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes12.dex */
public final class c extends Lambda implements gzs<s3q0> {
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ b.g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b.g gVar, ViewGroup viewGroup) {
        super(0);
        this.this$0 = gVar;
        this.$container = viewGroup;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        b.g gVar = this.this$0;
        gVar.f.d(gVar.q, new at6(1, gVar, this.$container));
        return s3q0.a;
    }
}
