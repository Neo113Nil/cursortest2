package com.vk.id.internal.di;

import V.e;
import android.os.Bundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/os/Bundle;", "", "key", "", "getIntOrThrow", "(Landroid/os/Bundle;Ljava/lang/String;)I", "getStringOrThrow", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDDepsProdKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIntOrThrow(Bundle bundle, String str) {
        int i11 = bundle.getInt(str, -1);
        if (i11 != -1) {
            return i11;
        }
        throw new IllegalStateException(e.b(new Object[]{str}, 1, "VKID initialization error. Missing %s parameter in manifest placeholders", "format(...)"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getStringOrThrow(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException(e.b(new Object[]{str}, 1, "VKID initialization error. Missing %s parameter in manifest placeholders", "format(...)"));
    }
}
