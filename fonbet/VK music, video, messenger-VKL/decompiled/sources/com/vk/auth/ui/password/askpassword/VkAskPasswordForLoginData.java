package com.vk.auth.ui.password.askpassword;

import com.vk.auth.ui.password.askpassword.VkAskPasswordData;

/* compiled from: VkAskPasswordData.kt */
/* loaded from: classes15.dex */
public abstract class VkAskPasswordForLoginData extends VkAskPasswordData {
    public final String b;
    public final String c;
    public final boolean d;
    public final VkAskPasswordData.User e;

    public VkAskPasswordForLoginData(String str, String str2, boolean z, VkAskPasswordData.User user) {
        super(null);
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = user;
    }
}
