package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import z.C6900a;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3498e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f37942a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    public static final class a {
        public static C6900a a(Bundle bundle) {
            C6900a c6900a = new C6900a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c6900a.put(str, str2);
                    }
                }
            }
            return c6900a;
        }
    }
}
