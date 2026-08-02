package com.vk.feed.design.view.newsfeed.ads_mytarget.bls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyCellView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;
import xsna.gp50;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: MyTargetAdSurveyCellView.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdSurveyCellView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final VkImage b;
    public final VkText c;
    public final VkCheckbox d;
    public izs<? super Boolean, s3q0> e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MyTargetAdSurveyCellView.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Radio;
        public static final Type Square;

        static {
            Type type = new Type("Square", 0);
            Square = type;
            Type type2 = new Type("Radio", 1);
            Radio = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: MyTargetAdSurveyCellView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Radio.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MyTargetAdSurveyCellView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void setCheckboxClickable(boolean z) {
        this.d.setClickable(z);
    }

    public final void setChecked(boolean z) {
        VkCheckbox vkCheckbox = this.d;
        if (vkCheckbox.isChecked() != z) {
            vkCheckbox.setChecked(z);
        }
    }

    public final void setIcon(List<Image> list) {
        ImageSize Cb;
        List<Image> list2 = list;
        VkImage vkImage = this.b;
        if (list2 == null || list2.isEmpty()) {
            vkImage.setImageDrawable(null);
            f4m.j(vkImage);
            return;
        }
        Image image = (Image) j5g.a0(list);
        if (image == null || (Cb = image.Cb(iah0.a(24), true, false)) == null) {
            return;
        }
        vkImage.o0(Cb.d.d, null);
        vkImage.setVisibility(0);
    }

    public final void setOnCheckedChangedListener(izs<? super Boolean, s3q0> izsVar) {
        this.e = izsVar;
        VkCheckbox vkCheckbox = this.d;
        if (izsVar == null) {
            vkCheckbox.setOnCheckedChangeListener(new gp50());
        } else {
            vkCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.hp50
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    izs<? super Boolean, s3q0> izsVar2 = MyTargetAdSurveyCellView.this.e;
                    if (izsVar2 != null) {
                        izsVar2.invoke(Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    public final void setTitle(String str) {
        this.c.setText(str);
    }

    public final void setType(Type type) {
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        VkCheckbox vkCheckbox = this.d;
        if (i == 1) {
            vkCheckbox.setType(VkCheckbox.Type.Square);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkCheckbox.setType(VkCheckbox.Type.Radio);
        }
    }

    public MyTargetAdSurveyCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MyTargetAdSurveyCellView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MyTargetAdSurveyCellView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MyTargetAdSurveyCellView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Type type = Type.Square;
        LayoutInflater.from(context).inflate(R.layout.my_target_ad_survey_cell_view, (ViewGroup) this, true);
        VkImage vkImage = (VkImage) findViewById(R.id.survey_cell_left);
        bwt0.d(vkImage, cn70.c(12), (r4 & 2) != 0, (r4 & 4) != 0);
        this.b = vkImage;
        this.c = (VkText) findViewById(R.id.survey_cell_title);
        this.d = (VkCheckbox) findViewById(R.id.survey_cell_right);
    }
}
