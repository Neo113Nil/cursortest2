package com.vk.clips.sdk.shared.item.common.description;

import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: DescriptionViewState.kt */
/* loaded from: classes17.dex */
public interface DescriptionViewState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DescriptionViewState.kt */
    public static final class ExpansionState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ExpansionState[] $VALUES;
        public static final ExpansionState COLLAPSED;
        public static final ExpansionState EXPANDED;
        public static final ExpansionState STATIC;

        static {
            ExpansionState expansionState = new ExpansionState("STATIC", 0);
            STATIC = expansionState;
            ExpansionState expansionState2 = new ExpansionState("COLLAPSED", 1);
            COLLAPSED = expansionState2;
            ExpansionState expansionState3 = new ExpansionState("EXPANDED", 2);
            EXPANDED = expansionState3;
            ExpansionState[] expansionStateArr = {expansionState, expansionState2, expansionState3};
            $VALUES = expansionStateArr;
            $ENTRIES = new asp(expansionStateArr);
        }

        public ExpansionState() {
            throw null;
        }

        public static ExpansionState valueOf(String str) {
            return (ExpansionState) Enum.valueOf(ExpansionState.class, str);
        }

        public static ExpansionState[] values() {
            return (ExpansionState[]) $VALUES.clone();
        }
    }

    /* compiled from: DescriptionViewState.kt */
    public static final class a implements DescriptionViewState {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2061078320;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: DescriptionViewState.kt */
    public static final class b implements DescriptionViewState {
        public final CharSequence a;
        public final String b;
        public final ExpansionState c;

        public b(CharSequence charSequence, String str, ExpansionState expansionState) {
            this.a = charSequence;
            this.b = str;
            this.c = expansionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Visible(text=" + ((Object) this.a) + ", contentDescription=" + this.b + ", expansionState=" + this.c + ')';
        }
    }
}
