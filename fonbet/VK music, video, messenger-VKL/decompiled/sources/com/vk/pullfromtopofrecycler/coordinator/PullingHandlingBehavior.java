package com.vk.pullfromtopofrecycler.coordinator;

import android.content.res.Resources;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ese;
import xsna.fse;
import xsna.hfr;
import xsna.jxt0;
import xsna.rli0;
import xsna.zrp;

/* compiled from: PullingHandlingBehavior.kt */
/* loaded from: classes5.dex */
public final class PullingHandlingBehavior extends AppBarLayout.Behavior {
    public final ExpandableAppBarLayout q;
    public int r;
    public boolean s;
    public a t = a.EXPANDING;
    public boolean u = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PullingHandlingBehavior.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a COLLAPSING;
        public static final a EXPANDING;

        static {
            a aVar = new a("EXPANDING", 0);
            EXPANDING = aVar;
            a aVar2 = new a("COLLAPSING", 1);
            COLLAPSING = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: PullingHandlingBehavior.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.EXPANDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.COLLAPSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PullingHandlingBehavior(ExpandableAppBarLayout expandableAppBarLayout) {
        this.q = expandableAppBarLayout;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super.u(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        if (this.u) {
            int i6 = b.$EnumSwitchMapping$0[this.t.ordinal()];
            ExpandableAppBarLayout expandableAppBarLayout = this.q;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (appBarLayout.getBottom() <= 0) {
                    expandableAppBarLayout.getClass();
                    hfr.a aVar = new hfr.a(rli0.j(new jxt0(expandableAppBarLayout), ese.d));
                    while (aVar.hasNext()) {
                        PullFromTopLinearLayout pullFromTopLinearLayout = (PullFromTopLinearLayout) aVar.next();
                        if (pullFromTopLinearLayout.c == PullFromTopMode.DEFAULT) {
                            pullFromTopLinearLayout.setVisibility(8);
                        }
                    }
                    this.t = a.EXPANDING;
                    return;
                }
                return;
            }
            if (i4 >= 0 || this.s) {
                return;
            }
            int i7 = this.r + (-i4);
            this.r = i7;
            if (i7 > ((int) (72 * Resources.getSystem().getDisplayMetrics().density))) {
                this.s = true;
                this.t = a.COLLAPSING;
                expandableAppBarLayout.performHapticFeedback(0, 2);
                hfr.a aVar2 = new hfr.a(rli0.j(new jxt0(expandableAppBarLayout), fse.f));
                while (aVar2.hasNext()) {
                    PullFromTopLinearLayout pullFromTopLinearLayout2 = (PullFromTopLinearLayout) aVar2.next();
                    if (pullFromTopLinearLayout2.c == PullFromTopMode.DEFAULT) {
                        pullFromTopLinearLayout2.a();
                    }
                }
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        super.B(coordinatorLayout, appBarLayout, view, i);
        if (this.u) {
            this.r = 0;
            this.s = false;
        }
    }
}
