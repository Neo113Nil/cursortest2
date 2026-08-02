package ru.ozon.fintech.features.operations.presentation;

import Ae.O0;
import Ae.x0;
import Sc.o;
import android.content.Context;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.operations.presentation.ReceiptFragment;
import ru.ozon.fintech.features.operations.ui.receipt.ReceiptItem;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;

/* loaded from: classes3.dex */
public final class d extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f96084a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f96085b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<FinToolbarState> f96086c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<List<ReceiptItem>> f96087d;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96088a;

        static {
            int[] iArr = new int[ReceiptFragment.a.values().length];
            try {
                iArr[ReceiptFragment.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReceiptFragment.a.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReceiptFragment.a.PROCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f96088a = iArr;
        }
    }

    public d(@NotNull Context context, @NotNull S80.b fintechNavigation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f96084a = context;
        this.f96085b = fintechNavigation;
        this.f96086c = O0.a(FinToolbarState.INSTANCE.getEMPTY());
        this.f96087d = O0.a(null);
    }

    @NotNull
    public final x0<List<ReceiptItem>> d0() {
        return this.f96087d;
    }

    @NotNull
    public final x0<FinToolbarState> e0() {
        return this.f96086c;
    }

    public final void f0(D70.a aVar) {
        int i11;
        S80.b bVar = this.f96085b;
        if (aVar == null) {
            bVar.pop();
            return;
        }
        Context context = this.f96084a;
        String string = context.getString(R.string.fintech_operations_receipt_status_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String d11 = aVar.d();
        int i12 = a.f96088a[aVar.e().ordinal()];
        if (i12 == 1) {
            i11 = R.color.fintech_operations_success_status_color;
        } else if (i12 == 2) {
            i11 = R.color.fintech_operations_error_status_color;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = R.color.fintech_operations_process_status_color;
        }
        ReceiptItem receiptItem = new ReceiptItem("receipt_status_text_key", string, d11, i11);
        String string2 = context.getString(R.string.fintech_operations_receipt_receiver_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int i13 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i14 = 0;
        ReceiptItem receiptItem2 = new ReceiptItem("receiver_bank_key", string2, aVar.f(), i14, i13, defaultConstructorMarker);
        String string3 = context.getString(R.string.fintech_operations_receipt_amount_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ReceiptItem receiptItem3 = new ReceiptItem("amount_key", string3, aVar.a(), i14, i13, defaultConstructorMarker);
        String string4 = context.getString(R.string.fintech_operations_receipt_sender_name_title);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        ReceiptItem receiptItem4 = new ReceiptItem("sender_count_key", string4, aVar.h(), i14, i13, defaultConstructorMarker);
        String string5 = context.getString(R.string.fintech_operations_receipt_sender_phone_title);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        ReceiptItem receiptItem5 = new ReceiptItem("sender_phone_key", string5, aVar.i(), i14, i13, defaultConstructorMarker);
        String string6 = context.getString(R.string.fintech_operations_receipt_sender_bank_title);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        ArrayList m02 = C7714v.m0(receiptItem, receiptItem2, receiptItem3, receiptItem4, receiptItem5, new ReceiptItem("sender_bank_key", string6, aVar.g(), i14, i13, defaultConstructorMarker));
        String c11 = aVar.c();
        if (c11 != null && c11.length() != 0) {
            String string7 = context.getString(R.string.fintech_operations_message_title);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            m02.add(new ReceiptItem("message_key", string7, aVar.c(), 0, 8, null));
        }
        String string8 = context.getString(R.string.fintech_operations_receipt_time_title);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        m02.add(new ReceiptItem("time_key", string8, aVar.j(), 0, 8, null));
        String string9 = context.getString(R.string.fintech_operations_receipt_operation_id_title);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        m02.add(new ReceiptItem("receipt_status_text_key", string9, aVar.b(), 0, 8, null));
        this.f96087d.setValue(m02);
        this.f96086c.setValue(new FinToolbarState(aVar.j(), null, null, null, null, null, null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new e(0, bVar, S80.b.class, "pop", "pop()V", 0), null, null, null, null, 17, 61950, null));
    }
}
