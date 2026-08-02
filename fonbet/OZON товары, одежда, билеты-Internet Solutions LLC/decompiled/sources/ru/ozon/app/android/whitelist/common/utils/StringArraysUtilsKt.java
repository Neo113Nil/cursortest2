package ru.ozon.app.android.whitelist.common.utils;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¨\u0006\u0005"}, d2 = {"getStringArrayByName", "", "", "Landroid/content/Context;", "arrayName", "whitelist_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringArraysUtilsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> getStringArrayByName(Context context, String str) {
        try {
            int identifier = context.getResources().getIdentifier(str, "array", context.getPackageName());
            if (identifier != 0) {
                String[] stringArray = context.getResources().getStringArray(identifier);
                Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                return C7705l.f0(stringArray);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
