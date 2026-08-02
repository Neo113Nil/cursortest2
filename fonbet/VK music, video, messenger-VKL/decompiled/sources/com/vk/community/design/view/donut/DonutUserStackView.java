package com.vk.community.design.view.donut;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import com.vk.community.design.compose.donut.DonutUserStackClipPosition;
import com.vk.community.design.compose.donut.DonutUserStackSize;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ah7;
import xsna.asp;
import xsna.baf0;
import xsna.dhr0;
import xsna.ema;
import xsna.fwu0;
import xsna.izn;
import xsna.izs;
import xsna.kwn;
import xsna.lg90;
import xsna.mm1;
import xsna.ni1;
import xsna.po1;
import xsna.r4o;
import xsna.rg50;
import xsna.rpo0;
import xsna.s3q0;
import xsna.wak0;
import xsna.wh50;
import xsna.yzs;
import xsna.zak0;
import xsna.zrp;
import xsna.zzs;

/* compiled from: DonutUserStackView.kt */
/* loaded from: classes17.dex */
public final class DonutUserStackView extends rpo0 {
    public final wh50 m;
    public final rg50 n;
    public final wh50 o;
    public final wh50 p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutUserStackView.kt */
    public static final class ClipPosition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClipPosition[] $VALUES;
        public static final ClipPosition End;
        public static final ClipPosition Start;

        static {
            ClipPosition clipPosition = new ClipPosition("Start", 0);
            Start = clipPosition;
            ClipPosition clipPosition2 = new ClipPosition("End", 1);
            End = clipPosition2;
            ClipPosition[] clipPositionArr = {clipPosition, clipPosition2};
            $VALUES = clipPositionArr;
            $ENTRIES = new asp(clipPositionArr);
        }

        public ClipPosition() {
            throw null;
        }

        public static zrp<ClipPosition> h() {
            return $ENTRIES;
        }

        public static ClipPosition valueOf(String str) {
            return (ClipPosition) Enum.valueOf(ClipPosition.class, str);
        }

        public static ClipPosition[] values() {
            return (ClipPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutUserStackView.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Large;
        public static final Size Medium;

        static {
            Size size = new Size("Medium", 0);
            Medium = size;
            Size size2 = new Size("Large", 1);
            Large = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static zrp<Size> h() {
            return $ENTRIES;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: DonutUserStackView.kt */
    public static final class a implements kwn<Pair<? extends String, ? extends Boolean>> {
        public final /* synthetic */ baf0 b;

        public a(baf0 baf0Var) {
            this.b = baf0Var;
        }

        @Override // xsna.kwn
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void e(Pair<String, Boolean> pair, zzs<? super lg90, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-670899013);
            if ((i & 6) == 0) {
                i2 = (M.J(pair) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.y(zzsVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-670899013, i2, -1, "com.vk.community.design.view.donut.DonutUserStackView.ThemedContent.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackView.kt:48)");
                }
                String i3 = pair.i();
                baf0 baf0Var = this.b;
                boolean y = M.y(baf0Var);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new po1(baf0Var, 29);
                    M.R(x);
                }
                zzsVar.invoke(fwu0.l(null, i3, (izs) x, null, M, 0, 45), pair.j(), M, Integer.valueOf(((i2 << 3) & 896) | 8));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new ni1(i, 2, this, pair, zzsVar);
            }
        }
    }

    /* compiled from: DonutUserStackView.kt */
    public static final class b implements izn {
        public b() {
        }

        @Override // xsna.izn
        public final void e(yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(803828052);
            if ((i & 6) == 0) {
                i2 = (M.y(yzsVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(this) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(803828052, i2, -1, "com.vk.community.design.view.donut.DonutUserStackView.ThemedContent.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackView.kt:60)");
                }
                yzsVar.invoke(Integer.valueOf(DonutUserStackView.this.getCount()), M, Integer.valueOf((i2 << 3) & 112));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new ema(this, yzsVar, i, 2);
            }
        }
    }

    /* compiled from: DonutUserStackView.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipPosition.values().length];
            try {
                iArr2[ClipPosition.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipPosition.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DonutUserStackView(Context context) {
        super(context, null, 0);
        this.m = k.b(EmptyList.b);
        this.n = i.a(0);
        this.o = k.b(ClipPosition.Start);
        this.p = k.b(Size.Medium);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        DonutUserStackClipPosition donutUserStackClipPosition;
        DonutUserStackSize donutUserStackSize;
        androidx.compose.runtime.a M = aVar.M(-988975332);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-988975332, i2, -1, "com.vk.community.design.view.donut.DonutUserStackView.ThemedContent (DonutUserStackView.kt:37)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = dhr0.t.b(R.drawable.vk_icon_user_24, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
                M.R(x);
            }
            baf0 baf0Var = (baf0) x;
            int i3 = c.$EnumSwitchMapping$1[getPosition().ordinal()];
            if (i3 == 1) {
                donutUserStackClipPosition = DonutUserStackClipPosition.Start;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                donutUserStackClipPosition = DonutUserStackClipPosition.End;
            }
            int i4 = c.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i4 == 1) {
                donutUserStackSize = DonutUserStackSize.Medium;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                donutUserStackSize = DonutUserStackSize.Large;
            }
            boolean y = M.y(baf0Var) | ((i2 & 14) == 4 || M.y(this));
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new mm1(12, this, baf0Var);
                M.R(x2);
            }
            r4o.b(null, donutUserStackSize, donutUserStackClipPosition, null, (izs) x2, M, 0, 9);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ah7(this, i, 2);
        }
    }

    public final List<Pair<String, Boolean>> getAvatarUrlsAndDonStatus() {
        return (List) ((zak0) this.m).getValue();
    }

    public final int getCount() {
        return this.n.getIntValue();
    }

    public final ClipPosition getPosition() {
        return (ClipPosition) ((zak0) this.o).getValue();
    }

    public final Size getSize() {
        return (Size) ((zak0) this.p).getValue();
    }

    public final void setAvatarUrlsAndDonStatus(List<Pair<String, Boolean>> list) {
        ((zak0) this.m).setValue(list);
    }

    public final void setCount(int i) {
        ((wak0) this.n).C(i);
    }

    public final void setPosition(ClipPosition clipPosition) {
        ((zak0) this.o).setValue(clipPosition);
    }

    public final void setSize(Size size) {
        ((zak0) this.p).setValue(size);
    }
}
