package com.vk.superapp.common.js.bridge.api.events;

import com.google.gson.JsonParseException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.a9y;
import xsna.ad6;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowLeaderBoardBox.kt */
/* loaded from: classes6.dex */
public final class ShowLeaderBoardBox$Parameters implements ad6 {

    @pmi0("global")
    private final Global global;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("user_result")
    private final int userResult;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowLeaderBoardBox.kt */
    public static final class Global {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Global[] $VALUES;
        public static final Global ALLUSERS;
        public static final Global ONLYFRIENDS;
        private final int value;

        /* compiled from: ShowLeaderBoardBox.kt */
        public static final class Serializer implements uay<Global>, a9y<Global> {
            @Override // xsna.a9y
            public final Object a(b9y b9yVar, z8y z8yVar) {
                Global global;
                Global[] values = Global.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        global = null;
                        break;
                    }
                    global = values[i];
                    if (epx.f(String.valueOf(global.value), b9yVar.i().k())) {
                        break;
                    }
                    i++;
                }
                if (global != null) {
                    return global;
                }
                throw new JsonParseException(String.valueOf(b9yVar));
            }

            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((Global) obj).value));
            }
        }

        static {
            Global global = new Global("ONLYFRIENDS", 0, 0);
            ONLYFRIENDS = global;
            Global global2 = new Global("ALLUSERS", 1, 1);
            ALLUSERS = global2;
            Global[] globalArr = {global, global2};
            $VALUES = globalArr;
            $ENTRIES = new asp(globalArr);
        }

        public Global(String str, int i, int i2) {
            this.value = i2;
        }

        public static Global valueOf(String str) {
            return (Global) Enum.valueOf(Global.class, str);
        }

        public static Global[] values() {
            return (Global[]) $VALUES.clone();
        }
    }

    public ShowLeaderBoardBox$Parameters(int i, String str, Global global) {
        this.userResult = i;
        this.requestId = str;
        this.global = global;
    }

    public static final ShowLeaderBoardBox$Parameters a(ShowLeaderBoardBox$Parameters showLeaderBoardBox$Parameters) {
        return showLeaderBoardBox$Parameters.requestId == null ? new ShowLeaderBoardBox$Parameters(showLeaderBoardBox$Parameters.userResult, "default_request_id", showLeaderBoardBox$Parameters.global) : showLeaderBoardBox$Parameters;
    }

    public static final void b(ShowLeaderBoardBox$Parameters showLeaderBoardBox$Parameters) {
        if (showLeaderBoardBox$Parameters.userResult < 0) {
            throw new IllegalArgumentException("Value userResult cannot be less than 0");
        }
    }

    public static final void c(ShowLeaderBoardBox$Parameters showLeaderBoardBox$Parameters) {
        if (showLeaderBoardBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowLeaderBoardBox$Parameters)) {
            return false;
        }
        ShowLeaderBoardBox$Parameters showLeaderBoardBox$Parameters = (ShowLeaderBoardBox$Parameters) obj;
        return this.userResult == showLeaderBoardBox$Parameters.userResult && epx.f(this.requestId, showLeaderBoardBox$Parameters.requestId) && this.global == showLeaderBoardBox$Parameters.global;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.userResult) * 31, 31, this.requestId);
        Global global = this.global;
        return a + (global == null ? 0 : global.hashCode());
    }

    public final String toString() {
        return "Parameters(userResult=" + this.userResult + ", requestId=" + this.requestId + ", global=" + this.global + ')';
    }

    public /* synthetic */ ShowLeaderBoardBox$Parameters(int i, String str, Global global, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : global);
    }
}
