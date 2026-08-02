package com.vk.voip.ui.sessionrooms.dialog.model;

import defpackage.q0;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.wk90;
import xsna.zrp;

/* compiled from: SessionRoomParticipantModel.kt */
/* loaded from: classes7.dex */
public final class SessionRoomParticipantModel {
    public final ParticipantId a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Status f;
    public final wk90 g;
    public final boolean h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionRoomParticipantModel.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status InCall;
        public static final Status InRoom;
        public static final Status Missing;
        public static final Status NotConnected;

        static {
            Status status = new Status("Missing", 0);
            Missing = status;
            Status status2 = new Status("InCall", 1);
            InCall = status2;
            Status status3 = new Status("NotConnected", 2);
            NotConnected = status3;
            Status status4 = new Status("InRoom", 3);
            InRoom = status4;
            Status[] statusArr = {status, status2, status3, status4};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public SessionRoomParticipantModel(ParticipantId participantId, boolean z, boolean z2, boolean z3, boolean z4, Status status, wk90 wk90Var, boolean z5) {
        this.a = participantId;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = status;
        this.g = wk90Var;
        this.h = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionRoomParticipantModel)) {
            return false;
        }
        SessionRoomParticipantModel sessionRoomParticipantModel = (SessionRoomParticipantModel) obj;
        return epx.f(this.a, sessionRoomParticipantModel.a) && this.b == sessionRoomParticipantModel.b && this.c == sessionRoomParticipantModel.c && this.d == sessionRoomParticipantModel.d && this.e == sessionRoomParticipantModel.e && this.f == sessionRoomParticipantModel.f && epx.f(this.g, sessionRoomParticipantModel.g) && this.h == sessionRoomParticipantModel.h;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31;
        wk90 wk90Var = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (wk90Var == null ? 0 : wk90Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionRoomParticipantModel(id=");
        sb.append(this.a);
        sb.append(", isHandRaised=");
        sb.append(this.b);
        sb.append(", isAssistanceRequested=");
        sb.append(this.c);
        sb.append(", isAdmin=");
        sb.append(this.d);
        sb.append(", isCreator=");
        sb.append(this.e);
        sb.append(", status=");
        sb.append(this.f);
        sb.append(", preview=");
        sb.append(this.g);
        sb.append(", canMoveToOtherRoom=");
        return q0.a(sb, this.h, ')');
    }
}
