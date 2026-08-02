package com.vk.core.sticky_header;

import com.vk.core.sticky_header.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.fgh0;
import xsna.fpf0;
import xsna.rfc;
import xsna.yfh0;

/* compiled from: ScrollRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class b implements fgh0 {
    public final yfh0 b = new yfh0();
    public final yfh0 c = new yfh0();
    public boolean d;

    /* compiled from: ScrollRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OffsetOrientation.values().length];
            try {
                iArr[OffsetOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OffsetOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.fgh0
    public final void a() {
        this.d = false;
    }

    @Override // xsna.fgh0
    public final void b(OffsetOrientation offsetOrientation, com.vk.core.sticky_header.a aVar) {
        yfh0 yfh0Var;
        int i = a.$EnumSwitchMapping$0[offsetOrientation.ordinal()];
        if (i == 1) {
            yfh0Var = this.b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            yfh0Var = this.c;
        }
        int i2 = aVar.a;
        if (aVar instanceof a.b) {
            yfh0Var.a = i2;
        } else if (aVar instanceof a.C0775a) {
            yfh0Var.b = i2;
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            yfh0Var.c = i2;
        }
        this.d = true;
    }

    @Override // xsna.fgh0
    public final int c(OffsetOrientation offsetOrientation, rfc rfcVar) {
        yfh0 yfh0Var;
        if (!this.d) {
            return -1;
        }
        int i = a.$EnumSwitchMapping$0[offsetOrientation.ordinal()];
        if (i == 1) {
            yfh0Var = this.b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            yfh0Var = this.c;
        }
        if (rfcVar.equals(fpf0.a(a.b.class))) {
            return yfh0Var.a;
        }
        if (rfcVar.equals(fpf0.a(a.C0775a.class))) {
            return yfh0Var.b;
        }
        if (rfcVar.equals(fpf0.a(a.c.class))) {
            return yfh0Var.c;
        }
        return -1;
    }
}
