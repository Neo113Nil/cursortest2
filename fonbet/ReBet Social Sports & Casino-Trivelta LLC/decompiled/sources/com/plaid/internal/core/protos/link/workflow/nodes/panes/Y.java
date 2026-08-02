package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum Y implements Internal.EnumLite {
    USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN(0),
    USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS(1),
    USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST(2),
    UNRECOGNIZED(-1);

    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST_VALUE = 2;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS_VALUE = 1;
    public static final int USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40373b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40375a;

    public class a implements Internal.EnumLiteMap<Y> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Y findValueByNumber(int i10) {
            return Y.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40376a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return Y.forNumber(i10) != null;
        }
    }

    Y(int i10) {
        this.f40375a = i10;
    }

    public static Y forNumber(int i10) {
        if (i10 == 0) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_UNKNOWN;
        }
        if (i10 == 1) {
            return USER_INPUT_PROMPT_DISPLAY_MODE_SINGLE_PROMPTS;
        }
        if (i10 != 2) {
            return null;
        }
        return USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST;
    }

    public static Internal.EnumLiteMap<Y> internalGetValueMap() {
        return f40373b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40376a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40375a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Y valueOf(int i10) {
        return forNumber(i10);
    }
}
