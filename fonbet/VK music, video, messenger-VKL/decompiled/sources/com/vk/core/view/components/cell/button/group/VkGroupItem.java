package com.vk.core.view.components.cell.button.group;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.ey2;
import xsna.f4m;
import xsna.gpo0;
import xsna.hbh0;
import xsna.sex0;
import xsna.too0;
import xsna.zrp;

/* compiled from: VkGroupItem.kt */
/* loaded from: classes17.dex */
public final class VkGroupItem extends FrameLayout implements too0 {
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final VkCounter e;
    public boolean f;
    public boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkGroupItem.kt */
    public static final class IconType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;
        public static final IconType Chevron;
        public static final IconType Dropdown;
        public static final IconType Icon;

        static {
            IconType iconType = new IconType("Chevron", 0);
            Chevron = iconType;
            IconType iconType2 = new IconType("Dropdown", 1);
            Dropdown = iconType2;
            IconType iconType3 = new IconType("Icon", 2);
            Icon = iconType3;
            IconType[] iconTypeArr = {iconType, iconType2, iconType3};
            $VALUES = iconTypeArr;
            $ENTRIES = new asp(iconTypeArr);
        }

        public IconType() {
            throw null;
        }

        public static zrp<IconType> h() {
            return $ENTRIES;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }

    public VkGroupItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void a(VkGroupItem vkGroupItem, Integer num) {
        ImageView imageView = vkGroupItem.c;
        sex0.j(imageView, num);
        vkGroupItem.setLeftIconColorful(true);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = hbh0.b(20, vkGroupItem.getContext());
        layoutParams.width = hbh0.b(20, vkGroupItem.getContext());
        imageView.setLayoutParams(layoutParams);
    }

    public static void b(VkGroupItem vkGroupItem, Integer num, IconType iconType, int i) {
        if ((i & 4) != 0) {
            iconType = IconType.Icon;
        }
        sex0.j(vkGroupItem.d, num);
        vkGroupItem.setRightIconColorful(true);
        vkGroupItem.setRightIconType(iconType);
    }

    @Override // xsna.too0
    public final void Ng() {
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_accent_themed);
        if (this.g) {
            gpo0.f(this.d, valueOf);
        }
        if (this.f) {
            gpo0.f(this.c, valueOf);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.Button";
    }

    public final boolean getLeftIconColorful() {
        return this.f;
    }

    public final boolean getRightIconColorful() {
        return this.g;
    }

    public final void setCount(Integer num) {
        VkCounter vkCounter = this.e;
        if (num != null) {
            if (vkCounter.getVisibility() == 0) {
                vkCounter.setCounterWithAnimation(num.intValue());
            } else {
                vkCounter.setCounterWithoutAnimation(num.intValue());
            }
        }
        f4m.E(vkCounter, num != null);
    }

    public final void setCounterAppearance(VkCounter.CounterAppearance counterAppearance) {
        this.e.setAppearance(counterAppearance);
    }

    public final void setCounterMode(VkCounter.Mode mode) {
        this.e.setMode(mode);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setLeftIconColorful(boolean z) {
        this.f = z;
        if (z) {
            gpo0.f(this.c, Integer.valueOf(R.attr.vk_ui_icon_accent_themed));
        }
    }

    public final void setLeftIconTint(int i) {
        gpo0.f(this.c, Integer.valueOf(i));
        setLeftIconColorful(false);
    }

    public final void setRightIconColorful(boolean z) {
        this.g = z;
        if (z) {
            gpo0.f(this.d, Integer.valueOf(R.attr.vk_ui_icon_accent_themed));
        }
    }

    public final void setRightIconTint(int i) {
        gpo0.f(this.d, Integer.valueOf(i));
        setRightIconColorful(false);
    }

    public final void setRightIconType(IconType iconType) {
        ImageView imageView = this.d;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        IconType iconType2 = IconType.Icon;
        layoutParams.height = iconType == iconType2 ? hbh0.b(20, getContext()) : hbh0.b(16, getContext());
        layoutParams.width = iconType == iconType2 ? hbh0.b(20, getContext()) : hbh0.b(16, getContext());
        imageView.setLayoutParams(layoutParams);
    }

    public final void setText(CharSequence charSequence) {
        ey2.i(this.b, charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkGroupItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.f = true;
        this.g = true;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_cell_button_group_item_content, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (ImageView) findViewById(R.id.left_icon);
        this.d = (ImageView) findViewById(R.id.right_icon);
        this.e = (VkCounter) findViewById(R.id.counter);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.q, 0, 0);
        int integer = obtainStyledAttributes.getInteger(0, -1);
        Integer valueOf = integer == -1 ? null : Integer.valueOf(integer);
        String string = obtainStyledAttributes.getString(8);
        string = string == null ? "" : string;
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        setLeftIconColorful(obtainStyledAttributes.getBoolean(4, true));
        setRightIconColorful(obtainStyledAttributes.getBoolean(6, true));
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        int integer2 = obtainStyledAttributes.getInteger(7, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(2, 0);
        setText(string);
        setCount(valueOf);
        a(this, Integer.valueOf(resourceId));
        b(this, Integer.valueOf(resourceId2), null, 6);
        setRightIconType((IconType) IconType.h().get(integer2));
        setCounterAppearance((VkCounter.CounterAppearance) VkCounter.CounterAppearance.Appearance.h().get(resourceId3));
        setCounterMode((VkCounter.Mode) VkCounter.Mode.h().get(resourceId4));
        obtainStyledAttributes.recycle();
    }

    public final void setText(int i) {
        TextView textView = this.b;
        textView.setText(i);
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ? 4 : 0);
    }

    public final void setLeftIconTint(ColorStateList colorStateList) {
        this.c.setImageTintList(colorStateList);
        setLeftIconColorful(false);
    }

    public final void setRightIconTint(ColorStateList colorStateList) {
        this.d.setImageTintList(colorStateList);
        setRightIconColorful(false);
    }
}
