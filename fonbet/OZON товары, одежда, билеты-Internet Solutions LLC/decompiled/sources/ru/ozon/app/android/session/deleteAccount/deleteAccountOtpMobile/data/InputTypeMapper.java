package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/InputTypeMapper;", "", "<init>", "()V", "map", "", "inputType", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InputTypeMapper {
    public final Integer map(String inputType) {
        if (Intrinsics.d(inputType, "digit")) {
            return 2;
        }
        return Intrinsics.d(inputType, "text") ? 1 : null;
    }
}
