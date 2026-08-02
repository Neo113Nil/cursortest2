package com.plaid.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3613e {

    /* renamed from: com.plaid.internal.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40568a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.primitives.f.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.UNRECOGNIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.primitives.f.ANDROID_SMS_VERIFICATION_API_TYPE_SMS_RETRIEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40568a = iArr;
        }
    }

    @NotNull
    public static final EnumC3612d7 a(@NotNull com.plaid.internal.core.protos.link.workflow.primitives.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i10 = a.f40568a[fVar.ordinal()];
        if (i10 == 1) {
            return EnumC3612d7.NO_SMS_AUTOFILL;
        }
        if (i10 == 2) {
            return EnumC3612d7.NO_SMS_AUTOFILL;
        }
        if (i10 == 3) {
            return EnumC3612d7.SMS_RECEIVER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
