package com.vk.im.ui.components.msg_list;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import xsna.f1e0;

/* compiled from: MsgListEvent.kt */
/* loaded from: classes2.dex */
public abstract class b {

    /* compiled from: MsgListEvent.kt */
    public static final class a extends b {
        public final Attach a;

        public a(Attach attach) {
            this.a = attach;
        }
    }

    /* compiled from: MsgListEvent.kt */
    /* renamed from: com.vk.im.ui.components.msg_list.b$b, reason: collision with other inner class name */
    public static final class C1149b extends b {
        public final Dialog a;

        public C1149b(Dialog dialog) {
            this.a = dialog;
        }
    }

    /* compiled from: MsgListEvent.kt */
    public static final class c extends b {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }
    }

    /* compiled from: MsgListEvent.kt */
    public static final class d extends b {
        public final f1e0 a;
        public final ProfilesInfo b;

        public d(ProfilesInfo profilesInfo, f1e0 f1e0Var) {
            this.a = f1e0Var;
            this.b = profilesInfo;
        }
    }

    /* compiled from: MsgListEvent.kt */
    public static final class e extends b {
        public static final e a = new e();
    }

    /* compiled from: MsgListEvent.kt */
    public static final class f extends b {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }
    }
}
