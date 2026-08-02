package com.vk.im.ui.formatters.spans.dialogitem;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.dhr0;
import xsna.zrp;

/* compiled from: MsgBodySpan.kt */
/* loaded from: classes2.dex */
public final class MsgBodySpan extends CharacterStyle {
    public final Type a;
    public int b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgBodySpan.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ATTACH_TEXT;
        public static final Type COMPOSING_TEXT;
        public static final Type DRAFT_LABEL;
        public static final Type MEMBER_NAME;
        public static final Type SECONDARY_TEXT;
        private final int defaultAttr;
        private final int vkMeAttr;

        static {
            Type type = new Type("MEMBER_NAME", 0, R.attr.vk_ui_text_primary, R.attr.vk_ui_text_tertiary);
            MEMBER_NAME = type;
            Type type2 = new Type("DRAFT_LABEL", 1, R.attr.vk_ui_text_negative, R.attr.vk_ui_text_negative);
            DRAFT_LABEL = type2;
            Type type3 = new Type("SECONDARY_TEXT", 2, R.attr.vk_ui_text_subhead, R.attr.vk_ui_text_accent);
            SECONDARY_TEXT = type3;
            Type type4 = new Type("ATTACH_TEXT", 3, R.attr.vk_ui_text_subhead, R.attr.vk_ui_text_accent);
            ATTACH_TEXT = type4;
            Type type5 = new Type("COMPOSING_TEXT", 4, R.attr.vk_ui_text_subhead, R.attr.vk_ui_text_accent_themed);
            COMPOSING_TEXT = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, int i2, int i3) {
            this.vkMeAttr = i2;
            this.defaultAttr = i3;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final int h() {
            return this.defaultAttr;
        }

        public final int i() {
            return this.vkMeAttr;
        }
    }

    public MsgBodySpan(Type type) {
        this.a = type;
        this.b = dhr0.u.c(BuildInfo.t() ? type.i() : type.h());
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
    }
}
