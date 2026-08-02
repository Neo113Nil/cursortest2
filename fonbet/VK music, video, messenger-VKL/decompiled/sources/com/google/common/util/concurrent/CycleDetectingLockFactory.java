package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Objects;
import xsna.fxc0;
import xsna.k15;
import xsna.ul00;
import xsna.vl00;

/* loaded from: classes13.dex */
public final class CycleDetectingLockFactory {

    public static final class PotentialDeadlockException extends b {
        private final b conflictingStackTrace;

        @Override // java.lang.Throwable
        public final String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    public class a extends ThreadLocal<ArrayList<c>> {
        @Override // java.lang.ThreadLocal
        public final ArrayList<c> initialValue() {
            k15.h(3, "initialArraySize");
            return new ArrayList<>(3);
        }
    }

    public static class b extends IllegalStateException {
        static {
            ImmutableSet.m(3, CycleDetectingLockFactory.class.getName(), b.class.getName(), c.class.getName());
        }
    }

    public static class c {
    }

    static {
        ul00 ul00Var = new ul00();
        vl00.o oVar = vl00.o.WEAK;
        vl00.o oVar2 = ul00Var.d;
        fxc0.y(oVar2, "Key strength was already set to %s", oVar2 == null);
        oVar.getClass();
        ul00Var.d = oVar;
        if (oVar != vl00.o.STRONG) {
            ul00Var.a = true;
        }
        ul00Var.a();
        new a();
    }
}
