package com.vk.feed.design.view.newsfeed.ads_action_button;

import xsna.asp;
import xsna.bt;
import xsna.cut0;
import xsna.dko;
import xsna.eko;
import xsna.epx;
import xsna.tlo0;
import xsna.x7g;
import xsna.zrp;

/* compiled from: VkFeedActionCellButton.kt */
/* loaded from: classes18.dex */
public interface VkFeedActionCellButton$Content$Middle {

    /* compiled from: VkFeedActionCellButton.kt */
    public static final class Label implements VkFeedActionCellButton$Content$Middle {
        public final tlo0 a;
        public final cut0 b;
        public final dko c;
        public final cut0 d;
        public final TruncateMode e;
        public final tlo0 f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkFeedActionCellButton.kt */
        public static final class TruncateMode {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TruncateMode[] $VALUES;
            public static final TruncateMode INTERACTIVE;
            public static final TruncateMode STATIC;

            static {
                TruncateMode truncateMode = new TruncateMode("INTERACTIVE", 0);
                INTERACTIVE = truncateMode;
                TruncateMode truncateMode2 = new TruncateMode("STATIC", 1);
                STATIC = truncateMode2;
                TruncateMode[] truncateModeArr = {truncateMode, truncateMode2};
                $VALUES = truncateModeArr;
                $ENTRIES = new asp(truncateModeArr);
            }

            public TruncateMode() {
                throw null;
            }

            public static TruncateMode valueOf(String str) {
                return (TruncateMode) Enum.valueOf(TruncateMode.class, str);
            }

            public static TruncateMode[] values() {
                return (TruncateMode[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Label(tlo0.h hVar, x7g x7gVar, eko ekoVar, x7g x7gVar2, TruncateMode truncateMode, int i) {
            this(hVar, x7gVar, (i & 4) != 0 ? null : ekoVar, (i & 8) != 0 ? null : x7gVar2, truncateMode, (tlo0) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Label)) {
                return false;
            }
            Label label = (Label) obj;
            return epx.f(this.a, label.a) && epx.f(this.b, label.b) && epx.f(this.c, label.c) && epx.f(this.d, label.d) && this.e == label.e && epx.f(this.f, label.f);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            cut0 cut0Var = this.b;
            int hashCode2 = (hashCode + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
            dko dkoVar = this.c;
            int hashCode3 = (hashCode2 + (dkoVar == null ? 0 : dkoVar.hashCode())) * 31;
            cut0 cut0Var2 = this.d;
            int hashCode4 = (hashCode3 + (cut0Var2 == null ? 0 : cut0Var2.hashCode())) * 31;
            TruncateMode truncateMode = this.e;
            int hashCode5 = (hashCode4 + (truncateMode == null ? 0 : truncateMode.hashCode())) * 31;
            tlo0 tlo0Var = this.f;
            return hashCode5 + (tlo0Var != null ? tlo0Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Label(text=");
            sb.append(this.a);
            sb.append(", textColor=");
            sb.append(this.b);
            sb.append(", trailingIcon=");
            sb.append(this.c);
            sb.append(", trailingIconColor=");
            sb.append(this.d);
            sb.append(", truncateMode=");
            sb.append(this.e);
            sb.append(", contentDescription=");
            return bt.a(sb, this.f, ')');
        }

        public Label(tlo0 tlo0Var, cut0 cut0Var, dko dkoVar, cut0 cut0Var2, TruncateMode truncateMode, tlo0 tlo0Var2) {
            this.a = tlo0Var;
            this.b = cut0Var;
            this.c = dkoVar;
            this.d = cut0Var2;
            this.e = truncateMode;
            this.f = tlo0Var2;
        }
    }
}
