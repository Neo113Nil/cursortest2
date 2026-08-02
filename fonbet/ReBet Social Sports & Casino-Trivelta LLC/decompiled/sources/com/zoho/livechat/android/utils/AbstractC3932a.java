package com.zoho.livechat.android.utils;

import com.zoho.livechat.android.listeners.InitListener;

/* renamed from: com.zoho.livechat.android.utils.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3932a {
    public static void a(InitListener initListener, nd.e eVar) {
        if (LiveChatUtil.getScreenName() != null) {
            new pd.j(LiveChatUtil.getVisitorName(), initListener, eVar).run();
        }
    }

    public static void b(InitListener initListener, nd.e eVar) {
        if (LiveChatUtil.getScreenName() != null) {
            LiveChatUtil.submitTaskToExecutorServiceSafely(new pd.j(LiveChatUtil.getVisitorName(), initListener, eVar));
        }
    }
}
