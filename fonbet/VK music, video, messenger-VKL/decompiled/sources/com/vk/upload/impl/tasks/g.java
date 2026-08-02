package com.vk.upload.impl.tasks;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.l5m;
import xsna.qcq0;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: DevNullUploadEventSender.kt */
/* loaded from: classes6.dex */
public final class g {

    /* compiled from: DevNullUploadEventSender.kt */
    public static final class a {
        public final qcq0 a;
        public final int b;
        public final String c;
        public final int d;
        public final String e;

        public a(qcq0 qcq0Var, int i, String str, int i2, String str2) {
            this.a = qcq0Var;
            this.b = i;
            this.c = str;
            this.d = i2;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BaseParams(session=");
            sb.append(this.a);
            sb.append(", currentAttempt=");
            sb.append(this.b);
            sb.append(", from=");
            sb.append(this.c);
            sb.append(", deserializationCount=");
            sb.append(this.d);
            sb.append(", networkType=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DevNullUploadEventSender.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b CONNECTION_ESTABLISHED;
        public static final b END;
        public static final b ERROR;
        public static final b START;
        private final String value;

        static {
            b bVar = new b("START", 0, "start");
            START = bVar;
            b bVar2 = new b("END", 1, TtmlNode.END);
            END = bVar2;
            b bVar3 = new b("ERROR", 2, "error");
            ERROR = bVar3;
            b bVar4 = new b("CONNECTION_ESTABLISHED", 3, "connection_established");
            CONNECTION_ESTABLISHED = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, String str2) {
            this.value = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public static SchemeStat$TypeDevNullItem a(b bVar, a aVar) {
        String h = DevNullEventKey.VIDEO_UPLOADER.h();
        String h2 = bVar.h();
        qcq0 qcq0Var = aVar.a;
        String str = qcq0Var.d;
        String str2 = qcq0Var.e;
        String valueOf = String.valueOf(qcq0Var.b);
        int i = aVar.b;
        Integer valueOf2 = Integer.valueOf(((Boolean) qcq0Var.c.invoke()).booleanValue() ? 1 : 0);
        return new SchemeStat$TypeDevNullItem(h, qcq0Var.a, null, null, h2, null, null, null, str, null, str2, null, valueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(aVar.d), null, Integer.valueOf(i), aVar.e, valueOf2, aVar.c, 1, 402647788, 0, null);
    }

    public static void b(a aVar, boolean z, float f) {
        SchemeStat$TypeDevNullItem a2 = SchemeStat$TypeDevNullItem.a(a(b.END, aVar), null, null, null, Integer.valueOf(z ? 1 : 0), null, null, null, Integer.valueOf((int) Math.ceil(100 * f * 1000)), null, null, null, null, null, null, null, null, null, null, null, null, -2593, 3);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = a2;
        l5mVar.q();
    }

    public static void c(a aVar, Throwable th, float f) {
        SchemeStat$TypeDevNullItem a2 = a(b.ERROR, aVar);
        String message = th.getMessage();
        String simpleName = th.getClass().getSimpleName();
        Throwable cause = th.getCause();
        String message2 = cause != null ? cause.getMessage() : null;
        Throwable cause2 = th.getCause();
        SchemeStat$TypeDevNullItem a3 = SchemeStat$TypeDevNullItem.a(a2, null, null, null, null, null, null, null, Integer.valueOf((int) Math.ceil(100 * f * 1000)), null, null, message, simpleName, message2, cause2 != null ? cause2.getClass().getSimpleName() : null, null, null, null, null, null, null, -1395201, 3);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = a3;
        l5mVar.q();
    }

    public static void d(a aVar) {
        SchemeStat$TypeDevNullItem a2 = a(b.START, aVar);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = a2;
        l5mVar.q();
    }
}
