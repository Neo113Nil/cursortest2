package com.vk.update.core;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.cnh;
import xsna.fy0;
import xsna.ni0;
import xsna.ss3;
import xsna.zrp;

/* compiled from: InAppUpdateUi.kt */
/* loaded from: classes6.dex */
public interface InAppUpdateUi {

    /* compiled from: InAppUpdateUi.kt */
    public static final class DownloadInfo {
        public final ss3 a;
        public final cnh b;
        public final DialogType c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: InAppUpdateUi.kt */
        public static final class DialogType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DialogType[] $VALUES;
            public static final DialogType INSTALL;
            public static final DialogType UPDATE;

            static {
                DialogType dialogType = new DialogType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_UPDATE, 0);
                UPDATE = dialogType;
                DialogType dialogType2 = new DialogType("INSTALL", 1);
                INSTALL = dialogType2;
                DialogType[] dialogTypeArr = {dialogType, dialogType2};
                $VALUES = dialogTypeArr;
                $ENTRIES = new asp(dialogTypeArr);
            }

            public DialogType() {
                throw null;
            }

            public static DialogType valueOf(String str) {
                return (DialogType) Enum.valueOf(DialogType.class, str);
            }

            public static DialogType[] values() {
                return (DialogType[]) $VALUES.clone();
            }
        }

        public DownloadInfo(ss3 ss3Var, cnh cnhVar, DialogType dialogType) {
            this.a = ss3Var;
            this.b = cnhVar;
            this.c = dialogType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadInfo)) {
                return false;
            }
            DownloadInfo downloadInfo = (DownloadInfo) obj;
            return this.a.equals(downloadInfo.a) && this.b.equals(downloadInfo.b) && this.c == downloadInfo.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "DownloadInfo(onStartDownloadClick=" + this.a + ", onPostponeDownloadClick=" + this.b + ", type=" + this.c + ')';
        }
    }

    void a(Throwable th);

    void b(long j, long j2);

    void c(DownloadInfo downloadInfo);

    void d(fy0 fy0Var);

    int e();

    void f(Throwable th, ni0 ni0Var);
}
