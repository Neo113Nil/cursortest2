package com.vk.im.ui.components.dialogs_list;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.user.ImAddChatUserSource;
import com.vkontakte.android.R;
import xsna.a1w;
import xsna.edw;
import xsna.g2v;
import xsna.q1w;
import xsna.w8m;
import xsna.zcl;

/* compiled from: ChooseMode.kt */
/* loaded from: classes2.dex */
public abstract class ChooseMode implements Parcelable {
    public final int b;
    public final DialogsFilter c;
    public final boolean d;
    public final boolean e;

    /* compiled from: ChooseMode.kt */
    public static final class InviteToChat extends ChooseMode {
        public static final Parcelable.Creator<InviteToChat> CREATOR = new a();
        public final ImAddChatUserSource f;

        /* compiled from: ChooseMode.kt */
        public static final class a implements Parcelable.Creator<InviteToChat> {
            @Override // android.os.Parcelable.Creator
            public final InviteToChat createFromParcel(Parcel parcel) {
                return new InviteToChat(parcel.readInt() == 0 ? null : ImAddChatUserSource.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final InviteToChat[] newArray(int i) {
                return new InviteToChat[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InviteToChat() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.vk.im.ui.components.dialogs_list.ChooseMode
        public final boolean a(Dialog dialog) {
            int i = w8m.a;
            if (!dialog.tc() && dialog.uc() && dialog.Gb()) {
                if (dialog.sc()) {
                    g2v.c().getClass();
                    return false;
                }
                ChatSettings Hb = dialog.Hb();
                if (Hb != null && Hb.n) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.vk.im.ui.components.dialogs_list.ChooseMode
        public final boolean b(Dialog dialog) {
            return dialog.vc();
        }

        @Override // com.vk.im.ui.components.dialogs_list.ChooseMode
        public final void d(Context context, Dialog dialog) {
            if (dialog == null) {
                edw edwVar = edw.a;
                edw.d(R.string.vkim_cant_send_forbidden, context, true);
                return;
            }
            if (dialog.tc()) {
                edw edwVar2 = edw.a;
                edw.d(R.string.vkim_cant_invite_to_channel, context, true);
                return;
            }
            if (dialog.Va()) {
                edw edwVar3 = edw.a;
                edw.d(R.string.vkim_cant_invite_group, context, true);
            } else if (dialog.t1()) {
                edw edwVar4 = edw.a;
                edw.d(R.string.vkim_cant_invite_user, context, true);
            } else if (dialog.sc() && BuildInfo.s()) {
                edw edwVar5 = edw.a;
                edw.d(R.string.vkim_cant_send_to_casper_chat, context, true);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            ImAddChatUserSource imAddChatUserSource = this.f;
            if (imAddChatUserSource == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(imAddChatUserSource.name());
            }
        }

        public /* synthetic */ InviteToChat(ImAddChatUserSource imAddChatUserSource, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : imAddChatUserSource);
        }

        public InviteToChat(ImAddChatUserSource imAddChatUserSource) {
            super(true, R.string.vkm_dialogs_header_choose_to_invite, DialogsFilter.CHATS, true, true, null);
            this.f = imAddChatUserSource;
        }
    }

    /* compiled from: ChooseMode.kt */
    public static final class ReturnDialog extends ChooseMode {
        public static final Parcelable.Creator<ReturnDialog> CREATOR = new a();

        /* compiled from: ChooseMode.kt */
        public static final class a implements Parcelable.Creator<ReturnDialog> {
            @Override // android.os.Parcelable.Creator
            public final ReturnDialog createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new ReturnDialog();
            }

            @Override // android.os.Parcelable.Creator
            public final ReturnDialog[] newArray(int i) {
                return new ReturnDialog[i];
            }
        }

        public ReturnDialog() {
            super(true, R.string.vkm_dialogs_header_choose_to_share, DialogsFilter.MAIN, false, false, null);
        }

        @Override // com.vk.im.ui.components.dialogs_list.ChooseMode
        public final boolean a(Dialog dialog) {
            int i = w8m.a;
            a1w a1wVar = q1w.a;
            if (a1wVar == null) {
                a1wVar = null;
            }
            if (!dialog.tc() && dialog.Gb()) {
                if (dialog.sc()) {
                    g2v.c().getClass();
                    return false;
                }
                if (!a1wVar.r().f().contains(dialog.Sb())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.vk.im.ui.components.dialogs_list.ChooseMode
        public final boolean b(Dialog dialog) {
            return true;
        }

        @Override // com.vk.im.ui.components.dialogs_list.ChooseMode
        public final void d(Context context, Dialog dialog) {
            if (dialog == null) {
                edw edwVar = edw.a;
                edw.d(R.string.vkim_cant_send_forbidden, context, true);
                return;
            }
            if (dialog.tc()) {
                edw edwVar2 = edw.a;
                edw.d(R.string.vkim_cant_send_to_channel, context, true);
            } else if (dialog.sc() && BuildInfo.s()) {
                edw edwVar3 = edw.a;
                edw.d(R.string.vkim_cant_send_to_casper_chat, context, true);
            } else {
                edw edwVar4 = edw.a;
                edw.d(R.string.vkim_cant_send_forbidden, context, true);
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public ChooseMode(boolean z, int i, DialogsFilter dialogsFilter, boolean z2, boolean z3, zcl zclVar) {
        this.b = i;
        this.c = dialogsFilter;
        this.d = z2;
        this.e = z3;
    }

    public abstract boolean a(Dialog dialog);

    public abstract boolean b(Dialog dialog);

    public abstract void d(Context context, Dialog dialog);
}
