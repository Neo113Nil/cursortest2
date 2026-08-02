package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.Internal;

/* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3603z implements Internal.EnumLite {
    HAPTIC_TYPE_UNKNOWN(0),
    HAPTIC_TYPE_BUTTON_NAVIGATION(1),
    HAPTIC_TYPE_BUTTON_INPUT(2),
    HAPTIC_TYPE_BUTTON_ACTION(3),
    HAPTIC_TYPE_EVENT_SUCCESS(4),
    HAPTIC_TYPE_EVENT_ERROR(5),
    UNRECOGNIZED(-1);

    public static final int HAPTIC_TYPE_BUTTON_ACTION_VALUE = 3;
    public static final int HAPTIC_TYPE_BUTTON_INPUT_VALUE = 2;
    public static final int HAPTIC_TYPE_BUTTON_NAVIGATION_VALUE = 1;
    public static final int HAPTIC_TYPE_EVENT_ERROR_VALUE = 5;
    public static final int HAPTIC_TYPE_EVENT_SUCCESS_VALUE = 4;
    public static final int HAPTIC_TYPE_UNKNOWN_VALUE = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40463b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f40465a;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$a */
    public class a implements Internal.EnumLiteMap<EnumC3603z> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final EnumC3603z findValueByNumber(int i10) {
            return EnumC3603z.forNumber(i10);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.z$b */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40466a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EnumC3603z.forNumber(i10) != null;
        }
    }

    EnumC3603z(int i10) {
        this.f40465a = i10;
    }

    public static EnumC3603z forNumber(int i10) {
        if (i10 == 0) {
            return HAPTIC_TYPE_UNKNOWN;
        }
        if (i10 == 1) {
            return HAPTIC_TYPE_BUTTON_NAVIGATION;
        }
        if (i10 == 2) {
            return HAPTIC_TYPE_BUTTON_INPUT;
        }
        if (i10 == 3) {
            return HAPTIC_TYPE_BUTTON_ACTION;
        }
        if (i10 == 4) {
            return HAPTIC_TYPE_EVENT_SUCCESS;
        }
        if (i10 != 5) {
            return null;
        }
        return HAPTIC_TYPE_EVENT_ERROR;
    }

    public static Internal.EnumLiteMap<EnumC3603z> internalGetValueMap() {
        return f40463b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f40466a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f40465a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EnumC3603z valueOf(int i10) {
        return forNumber(i10);
    }
}
