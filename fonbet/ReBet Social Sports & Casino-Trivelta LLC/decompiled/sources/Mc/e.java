package Mc;

import android.animation.Animator;
import com.swmansion.rnscreens.Z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements Animator.AnimatorListener {

    /* renamed from: e, reason: collision with root package name */
    public static final b f7615e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Z f7616a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7617b;

    /* renamed from: c, reason: collision with root package name */
    public final a f7618c;

    /* renamed from: d, reason: collision with root package name */
    public c f7619d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f7620a = new a("ENTER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f7621b = new a("EXIT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f7622c;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f7622c = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f7620a, f7621b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final c f7623a = new c("INITIALIZED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f7624b = new c("START_DISPATCHED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f7625c = new c("END_DISPATCHED", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f7626d;

        static {
            c[] a10 = a();
            $VALUES = a10;
            f7626d = EnumEntriesKt.enumEntries(a10);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f7623a, f7624b, f7625c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f7623a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f7624b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f7625c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.f7620a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.f7621b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public e(Z wrapper, i iVar, a animationType) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.f7616a = wrapper;
        this.f7617b = iVar;
        this.f7618c = animationType;
        this.f7619d = c.f7623a;
    }

    public final void a() {
        c cVar;
        int i10 = d.$EnumSwitchMapping$0[this.f7619d.ordinal()];
        if (i10 == 1) {
            cVar = c.f7624b;
        } else if (i10 == 2) {
            cVar = c.f7625c;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = c.f7625c;
        }
        this.f7619d = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f7619d == c.f7624b) {
            a();
            animation.removeListener(this);
            int i10 = d.$EnumSwitchMapping$1[this.f7618c.ordinal()];
            if (i10 == 1) {
                i iVar = this.f7617b;
                if (iVar != null) {
                    iVar.a();
                }
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i iVar2 = this.f7617b;
                if (iVar2 != null) {
                    iVar2.b();
                }
            }
            boolean z10 = this.f7618c == a.f7621b;
            i iVar3 = this.f7617b;
            if (iVar3 != null) {
                iVar3.e(1.0f, z10, z10);
            }
            this.f7616a.b().k();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f7619d == c.f7623a) {
            a();
            int i10 = d.$EnumSwitchMapping$1[this.f7618c.ordinal()];
            if (i10 == 1) {
                i iVar = this.f7617b;
                if (iVar != null) {
                    iVar.c();
                }
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i iVar2 = this.f7617b;
                if (iVar2 != null) {
                    iVar2.d();
                }
            }
            boolean z10 = this.f7618c == a.f7621b;
            i iVar3 = this.f7617b;
            if (iVar3 != null) {
                iVar3.e(0.0f, z10, z10);
            }
        }
    }
}
