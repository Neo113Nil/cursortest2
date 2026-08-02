package com.vk.clips.design.view.sidecontrols;

import kotlin.NoWhenBranchMatchedException;
import xsna.ceq;
import xsna.deq;
import xsna.eeq;
import xsna.ggd;
import xsna.tkj0;

/* compiled from: ExternalCustomControlViewAdapters.kt */
/* loaded from: classes16.dex */
public final class c {
    public static final ggd a(tkj0 tkj0Var) {
        if (tkj0Var instanceof tkj0.a) {
            return new ceq((tkj0.a) tkj0Var);
        }
        if (tkj0Var instanceof tkj0.b) {
            return new deq((tkj0.b) tkj0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final eeq b(tkj0 tkj0Var) {
        if (tkj0Var instanceof tkj0.a) {
            throw null;
        }
        if (tkj0Var instanceof tkj0.b) {
            return new eeq((tkj0.b) tkj0Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
