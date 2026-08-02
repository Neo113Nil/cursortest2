package com.zoho.livechat.android.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import io.agora.utils2.internal.CommonUtility;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f44267a;

    /* renamed from: b, reason: collision with root package name */
    public static Uri f44268b = Uri.parse(CommonUtility.PREFIX_URI + f44267a);

    public static class a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static Uri f44269a = b.f44268b.buildUpon().appendPath("ChatConversation").build();

        public static Uri a(String str) {
            return f44269a.buildUpon().appendPath(str).build();
        }
    }

    /* renamed from: com.zoho.livechat.android.provider.b$b, reason: collision with other inner class name */
    public enum EnumC0639b {
        WMS,
        SIQ
    }

    public static class c implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static Uri f44270a = b.f44268b.buildUpon().appendPath("ChatNotification").build();

        public static Uri a(String str) {
            return f44270a.buildUpon().appendPath(str).build();
        }
    }
}
