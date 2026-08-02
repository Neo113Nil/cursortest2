package com.vk.im.engine.reporters.performance.events;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Category.kt */
/* loaded from: classes2.dex */
public final class Category {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Category[] $VALUES;
    public static final Category PRODUCT;
    public static final Category TECH;
    private final String value;

    static {
        Category category = new Category("TECH", 0, "tech");
        TECH = category;
        Category category2 = new Category("PRODUCT", 1, "product");
        PRODUCT = category2;
        Category[] categoryArr = {category, category2};
        $VALUES = categoryArr;
        $ENTRIES = new asp(categoryArr);
    }

    public Category(String str, int i, String str2) {
        this.value = str2;
    }

    public static Category valueOf(String str) {
        return (Category) Enum.valueOf(Category.class, str);
    }

    public static Category[] values() {
        return (Category[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
