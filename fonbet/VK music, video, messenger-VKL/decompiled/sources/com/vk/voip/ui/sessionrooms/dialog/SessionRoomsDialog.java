package com.vk.voip.ui.sessionrooms.dialog;

import androidx.fragment.app.FragmentManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.asp;
import xsna.bl70;
import xsna.el70;
import xsna.fl70;
import xsna.jwi0;
import xsna.n1j;
import xsna.r9i0;
import xsna.u2j;
import xsna.yfb;
import xsna.yhi0;
import xsna.zrp;

/* compiled from: SessionRoomsDialog.kt */
/* loaded from: classes7.dex */
public interface SessionRoomsDialog {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionRoomsDialog.kt */
    public static final class DialogKind {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DialogKind[] $VALUES;
        public static final DialogKind ADMIN_ROOMS_CONFIGURE;
        public static final DialogKind CONFIRM_ADMIN_ASSISTANCE;
        public static final DialogKind NOTIFY_LEAVE_ROOM_PROHIBITED;
        public static final DialogKind NOTIFY_ROOMS_CLOSED;
        public static final DialogKind NOTIFY_ROOMS_CLOSED_WITH_RECORD;
        public static final DialogKind NOTIFY_ROOMS_CLOSED_WITH_STREAM;
        public static final DialogKind NOTIFY_ROOMS_NOT_AVAILABLE;
        public static final DialogKind SELECT_ROOM;
        public static final DialogKind SEND_MESSAGE_TO_ROOMS;

        static {
            DialogKind dialogKind = new DialogKind("SELECT_ROOM", 0);
            SELECT_ROOM = dialogKind;
            DialogKind dialogKind2 = new DialogKind("CONFIRM_ADMIN_ASSISTANCE", 1);
            CONFIRM_ADMIN_ASSISTANCE = dialogKind2;
            DialogKind dialogKind3 = new DialogKind("NOTIFY_ROOMS_NOT_AVAILABLE", 2);
            NOTIFY_ROOMS_NOT_AVAILABLE = dialogKind3;
            DialogKind dialogKind4 = new DialogKind("NOTIFY_ROOMS_CLOSED", 3);
            NOTIFY_ROOMS_CLOSED = dialogKind4;
            DialogKind dialogKind5 = new DialogKind("NOTIFY_ROOMS_CLOSED_WITH_RECORD", 4);
            NOTIFY_ROOMS_CLOSED_WITH_RECORD = dialogKind5;
            DialogKind dialogKind6 = new DialogKind("NOTIFY_ROOMS_CLOSED_WITH_STREAM", 5);
            NOTIFY_ROOMS_CLOSED_WITH_STREAM = dialogKind6;
            DialogKind dialogKind7 = new DialogKind("NOTIFY_LEAVE_ROOM_PROHIBITED", 6);
            NOTIFY_LEAVE_ROOM_PROHIBITED = dialogKind7;
            DialogKind dialogKind8 = new DialogKind("ADMIN_ROOMS_CONFIGURE", 7);
            ADMIN_ROOMS_CONFIGURE = dialogKind8;
            DialogKind dialogKind9 = new DialogKind("SEND_MESSAGE_TO_ROOMS", 8);
            SEND_MESSAGE_TO_ROOMS = dialogKind9;
            DialogKind[] dialogKindArr = {dialogKind, dialogKind2, dialogKind3, dialogKind4, dialogKind5, dialogKind6, dialogKind7, dialogKind8, dialogKind9};
            $VALUES = dialogKindArr;
            $ENTRIES = new asp(dialogKindArr);
        }

        public DialogKind() {
            throw null;
        }

        public static DialogKind valueOf(String str) {
            return (DialogKind) Enum.valueOf(DialogKind.class, str);
        }

        public static DialogKind[] values() {
            return (DialogKind[]) $VALUES.clone();
        }
    }

    /* compiled from: SessionRoomsDialog.kt */
    public static final class a {
        public DialogKind a;
        public jwi0 b;

        /* compiled from: SessionRoomsDialog.kt */
        /* renamed from: com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2076a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DialogKind.values().length];
                try {
                    iArr[DialogKind.SELECT_ROOM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DialogKind.CONFIRM_ADMIN_ASSISTANCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DialogKind.NOTIFY_ROOMS_NOT_AVAILABLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DialogKind.NOTIFY_ROOMS_CLOSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DialogKind.NOTIFY_ROOMS_CLOSED_WITH_RECORD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DialogKind.NOTIFY_ROOMS_CLOSED_WITH_STREAM.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DialogKind.NOTIFY_LEAVE_ROOM_PROHIBITED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DialogKind.ADMIN_ROOMS_CONFIGURE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[DialogKind.SEND_MESSAGE_TO_ROOMS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final void a(FragmentManager fragmentManager) {
            el70 el70Var;
            DialogKind dialogKind = this.a;
            SessionRoomsDialog sessionRoomsDialog = null;
            String name = dialogKind != null ? dialogKind.name() : null;
            if (fragmentManager.H(name) != null) {
                return;
            }
            DialogKind dialogKind2 = this.a;
            if (dialogKind2 != null) {
                switch (C2076a.$EnumSwitchMapping$0[dialogKind2.ordinal()]) {
                    case 1:
                        r9i0 r9i0Var = new r9i0();
                        r9i0Var.i1 = this.b;
                        sessionRoomsDialog = r9i0Var;
                        break;
                    case 2:
                        sessionRoomsDialog = new u2j();
                        break;
                    case 3:
                        sessionRoomsDialog = new fl70();
                        break;
                    case 4:
                        NotifyRoomsClosedDialog$Builder$DialogType notifyRoomsClosedDialog$Builder$DialogType = NotifyRoomsClosedDialog$Builder$DialogType.JUST_CLOSED;
                        el70Var = new el70();
                        el70Var.setArguments(yfb.b(new Pair("dialogType", notifyRoomsClosedDialog$Builder$DialogType)));
                        sessionRoomsDialog = el70Var;
                        break;
                    case 5:
                        NotifyRoomsClosedDialog$Builder$DialogType notifyRoomsClosedDialog$Builder$DialogType2 = NotifyRoomsClosedDialog$Builder$DialogType.RECORD;
                        el70Var = new el70();
                        el70Var.setArguments(yfb.b(new Pair("dialogType", notifyRoomsClosedDialog$Builder$DialogType2)));
                        sessionRoomsDialog = el70Var;
                        break;
                    case 6:
                        NotifyRoomsClosedDialog$Builder$DialogType notifyRoomsClosedDialog$Builder$DialogType3 = NotifyRoomsClosedDialog$Builder$DialogType.TRANSLATION;
                        el70Var = new el70();
                        el70Var.setArguments(yfb.b(new Pair("dialogType", notifyRoomsClosedDialog$Builder$DialogType3)));
                        sessionRoomsDialog = el70Var;
                        break;
                    case 7:
                        sessionRoomsDialog = new bl70();
                        break;
                    case 8:
                        sessionRoomsDialog = new n1j();
                        break;
                    case 9:
                        sessionRoomsDialog = new yhi0();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (sessionRoomsDialog != null) {
                sessionRoomsDialog.Td(fragmentManager, name);
            }
        }
    }

    void Td(FragmentManager fragmentManager, String str);
}
