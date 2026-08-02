package org.chromium.base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes10.dex */
public @interface FileType {
    public static final int DIRECTORIES = 2;
    public static final int FILES = 1;
    public static final int INCLUDE_DOT_DOT = 4;
    public static final int NAMES_ONLY = 8;
    public static final int SHOW_SYM_LINKS = 16;
}
