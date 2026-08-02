package com.vk.movika.tools.controls.seekbar;

import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.qcy;
import xsna.qfk0;
import xsna.t5u0;
import xsna.wq70;

/* loaded from: classes3.dex */
public final class x extends wq70 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(DefaultSeekBarView defaultSeekBarView) {
        super(r0);
        Boolean bool = Boolean.FALSE;
        this.c = defaultSeekBarView;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy qcyVar, Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) obj3;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue && !booleanValue) {
                    DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                    defaultSeekBarView.l();
                }
                if (defaultSeekBarView.l) {
                    defaultSeekBarView.h(null);
                    defaultSeekBarView.m();
                    return;
                }
                return;
            default:
                qfk0 qfk0Var = (qfk0) obj3;
                int i2 = qfk0.a.$EnumSwitchMapping$0[((t5u0) obj2).ordinal()];
                if (i2 == 1) {
                    qfk0Var.h.setVisibility(0);
                    qfk0Var.g.setVisibility(8);
                    qfk0Var.e.setVisibility(8);
                    return;
                } else if (i2 == 2) {
                    qfk0Var.h.setVisibility(8);
                    qfk0Var.g.setVisibility(0);
                    qfk0Var.e.setVisibility(8);
                    return;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qfk0Var.h.setVisibility(8);
                    qfk0Var.g.setVisibility(8);
                    qfk0Var.e.setVisibility(0);
                    return;
                }
        }
    }

    @Override // xsna.wq70
    public boolean beforeChange(qcy qcyVar, Object obj, Object obj2) {
        switch (this.b) {
            case 1:
                return !epx.f(obj, obj2);
            default:
                return super.beforeChange(qcyVar, obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t5u0 t5u0Var, qfk0 qfk0Var) {
        super(t5u0Var);
        this.c = qfk0Var;
    }
}
