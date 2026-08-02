package com.plaid.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class K7 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39327a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39327a = iArr;
        }
    }

    public static final boolean a(@NotNull com.plaid.internal.core.protos.link.workflow.nodes.panes.Z z10) {
        Intrinsics.checkNotNullParameter(z10, "<this>");
        int i10 = a.f39327a[z10.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
