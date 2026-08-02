package com.vk.messagetemplates.impl.common;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Template.kt */
/* loaded from: classes3.dex */
public final class Template {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Template[] $VALUES;
    public static final Template ADMIN_NAME;
    public static final Template ADMIN_SURNAME;
    public static final Template COMMUNITY;
    public static final Template GOODBYE;
    public static final Template GREETING;
    public static final Template USER_NAME;
    public static final Template USER_SURNAME;
    private final String format;
    private final int resId;

    static {
        Template template = new Template("USER_NAME", 0, "{user name}", R.string.user_name_template);
        USER_NAME = template;
        Template template2 = new Template("USER_SURNAME", 1, "{user surname}", R.string.user_surname_template);
        USER_SURNAME = template2;
        Template template3 = new Template("ADMIN_NAME", 2, "{admin name}", R.string.admin_name_template);
        ADMIN_NAME = template3;
        Template template4 = new Template("ADMIN_SURNAME", 3, "{admin surname}", R.string.admin_surname_template);
        ADMIN_SURNAME = template4;
        Template template5 = new Template("COMMUNITY", 4, "{community}", R.string.community_name_template);
        COMMUNITY = template5;
        Template template6 = new Template("GREETING", 5, "{greeting}", R.string.greeting_template);
        GREETING = template6;
        Template template7 = new Template("GOODBYE", 6, "{goodbye}", R.string.goodbye_template);
        GOODBYE = template7;
        Template[] templateArr = {template, template2, template3, template4, template5, template6, template7};
        $VALUES = templateArr;
        $ENTRIES = new asp(templateArr);
    }

    public Template(String str, int i, String str2, int i2) {
        this.format = str2;
        this.resId = i2;
    }

    public static zrp<Template> h() {
        return $ENTRIES;
    }

    public static Template valueOf(String str) {
        return (Template) Enum.valueOf(Template.class, str);
    }

    public static Template[] values() {
        return (Template[]) $VALUES.clone();
    }

    public final String getFormat() {
        return this.format;
    }

    public final int i() {
        return this.resId;
    }
}
