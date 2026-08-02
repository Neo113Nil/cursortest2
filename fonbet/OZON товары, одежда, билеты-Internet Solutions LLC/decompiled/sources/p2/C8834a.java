package p2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import spay.sdk.domain.model.FraudMonInfo;

@SuppressLint({"LogConditional"})
/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8834a {
    public static String a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ProductContainerDTO.RATIO_DELIMITER + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ProductContainerDTO.RATIO_DELIMITER + stackTraceElement.getLineNumber() + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    public static String c(int i11, Context context) {
        if (i11 == -1) {
            return FraudMonInfo.UNKNOWN;
        }
        try {
            i11 = context.getResources().getResourceEntryName(i11);
            return i11;
        } catch (Exception unused) {
            return Ej.b.a(i11, "?");
        }
    }

    public static String d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return FraudMonInfo.UNKNOWN;
        }
    }
}
