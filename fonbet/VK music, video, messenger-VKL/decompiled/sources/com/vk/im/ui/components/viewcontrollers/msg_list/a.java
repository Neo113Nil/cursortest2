package com.vk.im.ui.components.viewcontrollers.msg_list;

import com.vk.im.engine.models.messages.MsgFromUser;
import xsna.gep;
import xsna.hep;
import xsna.ucp;
import xsna.udp;

/* compiled from: EmojiSizeHelper.kt */
/* loaded from: classes2.dex */
public final class a {
    public static boolean a(MsgFromUser msgFromUser) {
        ucp ucpVar = ucp.a;
        if (msgFromUser.j7() || msgFromUser.g8() || msgFromUser.dc() || msgFromUser.V2() != null) {
            return false;
        }
        return b(msgFromUser.F);
    }

    public static boolean b(String str) {
        ucp ucpVar = ucp.a;
        udp d = ucp.d();
        d.getClass();
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            if (i >= str.length()) {
                break;
            }
            while (i < str.length() && str.charAt(i) == 65039) {
                i++;
                if (i == str.length()) {
                    break loop0;
                }
            }
            hep hepVar = d.a;
            gep a = hepVar != null ? hepVar.a(i, str.length(), str) : null;
            if (a == null) {
                i2 = 0;
                break;
            }
            i += a.a();
            i2++;
        }
        return 1 <= i2 && i2 < 4;
    }
}
