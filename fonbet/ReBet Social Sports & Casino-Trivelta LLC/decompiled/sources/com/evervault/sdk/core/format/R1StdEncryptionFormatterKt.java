package com.evervault.sdk.core.format;

import com.evervault.sdk.core.DataType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"paddingRemoved", "", "getPaddingRemoved", "(Ljava/lang/String;)Ljava/lang/String;", "prefix", "Lcom/evervault/sdk/core/DataType;", "getPrefix", "(Lcom/evervault/sdk/core/DataType;)Ljava/lang/String;", "evervault-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class R1StdEncryptionFormatterKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPaddingRemoved(String str) {
        int length = str.length() - 1;
        while (length > 0 && str.charAt(length) == '=') {
            length--;
        }
        String substring = str.substring(0, length + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrefix(DataType dataType) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[dataType.ordinal()];
        if (i10 == 1) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ":" + dataType.getHeader();
    }
}
