package com.plaid.internal;

import android.content.res.Resources;
import com.plaid.internal.N2;
import com.plaid.link.R;
import com.plaid.link.result.LinkErrorCode;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class F3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Resources f39243a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39244a;

        static {
            int[] iArr = new int[H3.values().length];
            try {
                iArr[H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39244a = iArr;
        }
    }

    @Inject
    public F3(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f39243a = resources;
    }

    @NotNull
    public final N2.i a() {
        r8.CREATOR.getClass();
        Intrinsics.checkNotNullParameter("unknown", "workflowId");
        r8 r8Var = new r8("unknown", "error_pane_id", "local_error_pane");
        H3 h32 = H3.INITIALIZATION_ERROR;
        return new N2.i("unknown", r8Var, "", a(h32), LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE.getJson(), CollectionsKt.emptyList(), "", h32);
    }

    public final String a(H3 h32) {
        int i10 = a.f39244a[h32.ordinal()];
        if (i10 == 1) {
            String string = this.f39243a.getString(R.string.plaid_error_no_network_connection_content);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i10 == 2) {
            String string2 = this.f39243a.getString(R.string.plaid_error_session_expired_content);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i10 == 3) {
            String string3 = this.f39243a.getString(R.string.plaid_error_initialization_content);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (i10 == 4) {
            String string4 = this.f39243a.getString(R.string.plaid_error_internal_server_error_try_again_later);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = this.f39243a.getString(R.string.plaid_error_fallback_content);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return string5;
    }
}
