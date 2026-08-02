package com.vk.core.view.components.cell.rich;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.left.VkCellLeft;
import com.vk.core.view.components.cell.rich.middle.VkRichCellMiddle;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.e3m;
import xsna.f4m;
import xsna.pgv0;
import xsna.too0;
import xsna.zrp;

/* compiled from: VkRichCell.kt */
/* loaded from: classes17.dex */
public class VkRichCell extends FrameLayout implements too0 {
    public VkCell.Left.b b;
    public VkCell.Right.d c;
    public pgv0 d;
    public final GapLinearLayout e;
    public final VkCellLeft f;
    public final VkCellRight g;
    public final VkRichCellMiddle h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRichCell.kt */
    public static final class Region {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;
        public static final Region LeftExtra;
        public static final Region LeftMain;
        public static final Region MiddleSubtitle;
        public static final Region RightAction;
        public static final Region RightExtra;
        public static final Region RightExtraAction;

        static {
            Region region = new Region("LeftMain", 0);
            LeftMain = region;
            Region region2 = new Region("LeftExtra", 1);
            LeftExtra = region2;
            Region region3 = new Region("MiddleSubtitle", 2);
            MiddleSubtitle = region3;
            Region region4 = new Region("RightAction", 3);
            RightAction = region4;
            Region region5 = new Region("RightExtra", 4);
            RightExtra = region5;
            Region region6 = new Region("RightExtraAction", 5);
            RightExtraAction = region6;
            Region[] regionArr = {region, region2, region3, region4, region5, region6};
            $VALUES = regionArr;
            $ENTRIES = new asp(regionArr);
        }

        public Region() {
            throw null;
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }
    }

    /* compiled from: VkRichCell.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[Region.LeftMain.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Region.LeftExtra.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Region.MiddleSubtitle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Region.RightAction.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Region.RightExtra.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Region.RightExtraAction.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkRichCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext());
        GapLinearLayout gapLinearLayout = this.e;
        gapLinearLayout.setGap(a2);
        int a3 = e3m.a(R.dimen.vk_ui_spacing_size_s, getContext());
        f4m.B(a3, a3, gapLinearLayout);
        int a4 = e3m.a(R.dimen.vk_ui_base_padding_horizontal, getContext());
        f4m.l(a4, a4, gapLinearLayout);
    }

    @Override // android.view.View
    public final VkCell.Left.b getLeft() {
        return this.b;
    }

    public final pgv0 getMiddle() {
        return this.d;
    }

    @Override // android.view.View
    public final VkCell.Right.d getRight() {
        return this.c;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setLeft(VkCell.Left.b bVar) {
        this.b = bVar;
        this.f.a(bVar);
    }

    public final void setLeftMainAvatarController(VkCell.e eVar) {
        this.f.setLeftMainAvatarController(eVar);
    }

    public final void setLeftMainPictureController(VkCell.e eVar) {
        this.f.setLeftMainPictureController(eVar);
    }

    public final void setLeftMainViewController(VkCell.e eVar) {
        this.f.setLeftMainViewController(eVar);
    }

    public final void setMiddle(pgv0 pgv0Var) {
        this.d = pgv0Var;
        this.h.a(pgv0Var);
    }

    public final void setRight(VkCell.Right.d dVar) {
        this.c = dVar;
        this.g.a(dVar);
    }

    public final void setRightExtraActionPictureController(VkCell.e eVar) {
        this.g.setRightExtraActionPictureController(eVar);
    }

    public final void setRightExtraViewController(VkCell.e eVar) {
        this.g.setRightExtraViewController(eVar);
    }

    public /* synthetic */ VkRichCell(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public VkRichCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_richcell, (ViewGroup) this, true);
        this.e = (GapLinearLayout) findViewById(R.id.root);
        this.f = (VkCellLeft) findViewById(R.id.left_view);
        this.g = (VkCellRight) findViewById(R.id.right_view);
        this.h = (VkRichCellMiddle) findViewById(R.id.middle_view);
        Ng();
    }
}
