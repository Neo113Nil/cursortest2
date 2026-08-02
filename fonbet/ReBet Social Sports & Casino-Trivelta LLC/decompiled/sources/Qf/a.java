package Qf;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Qf.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0187a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rf.a.values().length];
            try {
                iArr[Rf.a.LandedOnApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rf.a.AccessedAnyPageOnApp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rf.a.Clicked.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rf.a.PerformedCustomAction.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rf.a.Restart.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Lf.a a(Rf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i10 = C0187a.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 == 1) {
            return Lf.a.LandedOnApp;
        }
        if (i10 == 2) {
            return Lf.a.AccessAnyPageOnApp;
        }
        if (i10 == 3) {
            return Lf.a.Clicked;
        }
        if (i10 == 4) {
            return Lf.a.PerformedCustomAction;
        }
        if (i10 == 5) {
            return Lf.a.Restart;
        }
        throw new NoWhenBranchMatchedException();
    }
}
