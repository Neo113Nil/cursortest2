package com.vk.core.compose.component.semantics;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import kotlin.NoWhenBranchMatchedException;
import xsna.egi0;
import xsna.izs;
import xsna.q630;

/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes17.dex */
public final class b {

    /* compiled from: SemanticsConfiguration.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SemanticsConfiguration.Mode.values().length];
            try {
                iArr[SemanticsConfiguration.Mode.Merge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SemanticsConfiguration.Mode.ClearAndSet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SemanticsConfiguration.Mode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SemanticsConfiguration.Priority.values().length];
            try {
                iArr2[SemanticsConfiguration.Priority.High.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SemanticsConfiguration.Priority.Low.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static com.vk.core.compose.component.semantics.a a(SemanticsConfiguration.Mode mode, izs izsVar, int i) {
        if ((i & 1) != 0) {
            mode = SemanticsConfiguration.Mode.None;
        }
        return new com.vk.core.compose.component.semantics.a(izsVar, mode, SemanticsConfiguration.Priority.High);
    }

    public static final q630 b(q630 q630Var, SemanticsConfiguration semanticsConfiguration) {
        q630 b;
        if (semanticsConfiguration == null) {
            return q630Var;
        }
        int i = a.$EnumSwitchMapping$0[semanticsConfiguration.u().ordinal()];
        q630.a aVar = q630.a.a;
        if (i == 1) {
            b = egi0.b(aVar, true, semanticsConfiguration);
        } else if (i == 2) {
            b = egi0.a(aVar, semanticsConfiguration);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            b = egi0.b(aVar, false, semanticsConfiguration);
        }
        int i2 = a.$EnumSwitchMapping$1[semanticsConfiguration.getPriority().ordinal()];
        if (i2 == 1) {
            return b.g(q630Var);
        }
        if (i2 == 2) {
            return q630Var.g(b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
