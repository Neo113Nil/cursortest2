package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion;

import java.util.List;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.dt80;
import xsna.epx;
import xsna.km50;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: OpinionStickerState.kt */
/* loaded from: classes6.dex */
public final class OpinionStickerState implements km50 {
    public final String b;
    public final String c;
    public final OpinionPrivacy d;
    public final boolean e;
    public final Throwable f;
    public final dt80 g;
    public final List<OpinionPrivacy> h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpinionStickerState.kt */
    public static final class OpinionPrivacy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OpinionPrivacy[] $VALUES;
        public static final OpinionPrivacy HIDDEN;
        public static final OpinionPrivacy HIDDEN_EXCEPT_AUTHOR;
        public static final OpinionPrivacy PUBLIC;

        static {
            OpinionPrivacy opinionPrivacy = new OpinionPrivacy(Privacy.PUBLIC, 0);
            PUBLIC = opinionPrivacy;
            OpinionPrivacy opinionPrivacy2 = new OpinionPrivacy("HIDDEN", 1);
            HIDDEN = opinionPrivacy2;
            OpinionPrivacy opinionPrivacy3 = new OpinionPrivacy("HIDDEN_EXCEPT_AUTHOR", 2);
            HIDDEN_EXCEPT_AUTHOR = opinionPrivacy3;
            OpinionPrivacy[] opinionPrivacyArr = {opinionPrivacy, opinionPrivacy2, opinionPrivacy3};
            $VALUES = opinionPrivacyArr;
            $ENTRIES = new asp(opinionPrivacyArr);
        }

        public OpinionPrivacy() {
            throw null;
        }

        public static OpinionPrivacy valueOf(String str) {
            return (OpinionPrivacy) Enum.valueOf(OpinionPrivacy.class, str);
        }

        public static OpinionPrivacy[] values() {
            return (OpinionPrivacy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpinionStickerState(String str, String str2, OpinionPrivacy opinionPrivacy, boolean z, Throwable th, dt80 dt80Var, List<? extends OpinionPrivacy> list) {
        this.b = str;
        this.c = str2;
        this.d = opinionPrivacy;
        this.e = z;
        this.f = th;
        this.g = dt80Var;
        this.h = list;
    }

    public static OpinionStickerState a(OpinionStickerState opinionStickerState, String str, OpinionPrivacy opinionPrivacy, boolean z, Throwable th, int i) {
        String str2 = opinionStickerState.b;
        if ((i & 2) != 0) {
            str = opinionStickerState.c;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            opinionPrivacy = opinionStickerState.d;
        }
        OpinionPrivacy opinionPrivacy2 = opinionPrivacy;
        if ((i & 8) != 0) {
            z = opinionStickerState.e;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            th = opinionStickerState.f;
        }
        dt80 dt80Var = opinionStickerState.g;
        List<OpinionPrivacy> list = opinionStickerState.h;
        opinionStickerState.getClass();
        return new OpinionStickerState(str2, str3, opinionPrivacy2, z2, th, dt80Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpinionStickerState)) {
            return false;
        }
        OpinionStickerState opinionStickerState = (OpinionStickerState) obj;
        return epx.f(this.b, opinionStickerState.b) && epx.f(this.c, opinionStickerState.c) && this.d == opinionStickerState.d && this.e == opinionStickerState.e && epx.f(this.f, opinionStickerState.f) && epx.f(this.g, opinionStickerState.g) && epx.f(this.h, opinionStickerState.h);
    }

    public final int hashCode() {
        int b = qoy.b((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
        Throwable th = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((b + (th == null ? 0 : th.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpinionStickerState(title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", privacy=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", error=");
        sb.append(this.f);
        sb.append(", style=");
        sb.append(this.g);
        sb.append(", availablePrivacyTypes=");
        return ms9.a(')', sb, this.h);
    }
}
