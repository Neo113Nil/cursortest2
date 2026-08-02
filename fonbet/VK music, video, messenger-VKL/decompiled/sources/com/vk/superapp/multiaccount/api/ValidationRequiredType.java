package com.vk.superapp.multiaccount.api;

import org.json.JSONObject;
import xsna.asp;
import xsna.axx;
import xsna.bxx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ValidationRequiredType.kt */
/* loaded from: classes6.dex */
public abstract class ValidationRequiredType implements bxx {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ValidationRequiredType[] $VALUES;
    public static final a Companion;
    public static final ValidationRequiredType FULL_AUTH;
    public static final String TYPE_FULL_AUTH = "FULL_AUTH";

    /* compiled from: ValidationRequiredType.kt */
    public static final class a {
    }

    /* compiled from: ValidationRequiredType.kt */
    public static final class b extends ValidationRequiredType {
        public b() {
            super(ValidationRequiredType.TYPE_FULL_AUTH, 0);
        }

        @Override // xsna.bxx
        public final JSONObject e5() {
            return new axx(ValidationRequiredType.TYPE_FULL_AUTH);
        }
    }

    static {
        b bVar = new b();
        FULL_AUTH = bVar;
        ValidationRequiredType[] validationRequiredTypeArr = {bVar};
        $VALUES = validationRequiredTypeArr;
        $ENTRIES = new asp(validationRequiredTypeArr);
        Companion = new a();
    }

    public ValidationRequiredType() {
        throw null;
    }

    public static ValidationRequiredType valueOf(String str) {
        return (ValidationRequiredType) Enum.valueOf(ValidationRequiredType.class, str);
    }

    public static ValidationRequiredType[] values() {
        return (ValidationRequiredType[]) $VALUES.clone();
    }
}
