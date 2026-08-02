package com.vk.push.core.utils;

import com.huawei.hms.framework.common.BundleUtil;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import xsna.erm0;
import xsna.izs;
import xsna.zk10;

/* compiled from: StringExtensions.kt */
/* loaded from: classes5.dex */
public final class StringExtensionsKt {
    public static final Regex a = new Regex("(?<=[a-zA-Z])[A-Z]");

    /* compiled from: StringExtensions.kt */
    public static final class a extends Lambda implements izs<zk10, CharSequence> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final CharSequence invoke(zk10 zk10Var) {
            return BundleUtil.UNDERLINE_TAG.concat(zk10Var.getValue());
        }
    }

    public static final String camelToSnakeCase(String str) {
        return a.h(str, a.i);
    }

    public static final String hideSensitive(String str) {
        return str.length() > 8 ? "****".concat(erm0.E0(4, str)) : "****";
    }
}
