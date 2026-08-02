package com.vk.community.design.compose.onboarding;

import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock.Item;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.jr;
import xsna.zrp;

/* compiled from: CommunityCreationOnboardingData.kt */
/* loaded from: classes17.dex */
public interface CommunityCreationOnboardingBlock<T extends Item> {

    /* compiled from: CommunityCreationOnboardingData.kt */
    public static abstract class Item {

        /* compiled from: CommunityCreationOnboardingData.kt */
        public static final class Count extends Item {
            public final CountState a;
            public final String b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CommunityCreationOnboardingData.kt */
            public static final class CountState {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ CountState[] $VALUES;
                public static final CountState Default;
                public static final CountState Done;

                static {
                    CountState countState = new CountState("Default", 0);
                    Default = countState;
                    CountState countState2 = new CountState("Done", 1);
                    Done = countState2;
                    CountState[] countStateArr = {countState, countState2};
                    $VALUES = countStateArr;
                    $ENTRIES = new asp(countStateArr);
                }

                public CountState() {
                    throw null;
                }

                public static CountState valueOf(String str) {
                    return (CountState) Enum.valueOf(CountState.class, str);
                }

                public static CountState[] values() {
                    return (CountState[]) $VALUES.clone();
                }
            }

            public Count(CountState countState, String str) {
                this.a = countState;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Count)) {
                    return false;
                }
                Count count = (Count) obj;
                return this.a == count.a && epx.f(this.b, count.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Count(state=");
                sb.append(this.a);
                sb.append(", text=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: CommunityCreationOnboardingData.kt */
        public static final class Progress extends Item {
            public final ProgressState a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CommunityCreationOnboardingData.kt */
            public static final class ProgressState {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ ProgressState[] $VALUES;
                public static final ProgressState Completed;
                public static final ProgressState Default;

                static {
                    ProgressState progressState = new ProgressState("Default", 0);
                    Default = progressState;
                    ProgressState progressState2 = new ProgressState("Completed", 1);
                    Completed = progressState2;
                    ProgressState[] progressStateArr = {progressState, progressState2};
                    $VALUES = progressStateArr;
                    $ENTRIES = new asp(progressStateArr);
                }

                public ProgressState() {
                    throw null;
                }

                public static ProgressState valueOf(String str) {
                    return (ProgressState) Enum.valueOf(ProgressState.class, str);
                }

                public static ProgressState[] values() {
                    return (ProgressState[]) $VALUES.clone();
                }
            }

            public Progress(ProgressState progressState) {
                this.a = progressState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Progress) && this.a == ((Progress) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Progress(state=" + this.a + ')';
            }
        }

        /* compiled from: CommunityCreationOnboardingData.kt */
        public static final class Regularity extends Item {
            public final RegularityState a;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: CommunityCreationOnboardingData.kt */
            public static final class RegularityState {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ RegularityState[] $VALUES;
                public static final RegularityState Default;
                public static final RegularityState Disabled;
                public static final RegularityState Done;
                public static final RegularityState NotCompleted;

                static {
                    RegularityState regularityState = new RegularityState("Done", 0);
                    Done = regularityState;
                    RegularityState regularityState2 = new RegularityState("NotCompleted", 1);
                    NotCompleted = regularityState2;
                    RegularityState regularityState3 = new RegularityState("Default", 2);
                    Default = regularityState3;
                    RegularityState regularityState4 = new RegularityState("Disabled", 3);
                    Disabled = regularityState4;
                    RegularityState[] regularityStateArr = {regularityState, regularityState2, regularityState3, regularityState4};
                    $VALUES = regularityStateArr;
                    $ENTRIES = new asp(regularityStateArr);
                }

                public RegularityState() {
                    throw null;
                }

                public static RegularityState valueOf(String str) {
                    return (RegularityState) Enum.valueOf(RegularityState.class, str);
                }

                public static RegularityState[] values() {
                    return (RegularityState[]) $VALUES.clone();
                }
            }

            public Regularity(RegularityState regularityState) {
                this.a = regularityState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Regularity) && this.a == ((Regularity) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Regularity(state=" + this.a + ')';
            }
        }
    }

    /* compiled from: CommunityCreationOnboardingData.kt */
    public static final class a implements CommunityCreationOnboardingBlock<Item.Count> {
        public final List<T> a;

        public a() {
            throw null;
        }

        public a(List list) {
            this.a = list;
        }

        @Override // com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock
        public final List<T> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("Count(items="), this.a);
        }
    }

    /* compiled from: CommunityCreationOnboardingData.kt */
    public static final class b implements CommunityCreationOnboardingBlock<Item.Progress> {
        public final List<T> a;

        public b() {
            throw null;
        }

        public b(List list) {
            this.a = list;
        }

        @Override // com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock
        public final List<T> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("Progress(items="), this.a);
        }
    }

    /* compiled from: CommunityCreationOnboardingData.kt */
    public static final class c implements CommunityCreationOnboardingBlock<Item.Regularity> {
        public final List<T> a;

        public c() {
            throw null;
        }

        public c(ListBuilder listBuilder) {
            this.a = listBuilder;
        }

        @Override // com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock
        public final List<T> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return jr.a(')', new StringBuilder("Regularity(items="), this.a);
        }
    }

    List<T> a();
}
