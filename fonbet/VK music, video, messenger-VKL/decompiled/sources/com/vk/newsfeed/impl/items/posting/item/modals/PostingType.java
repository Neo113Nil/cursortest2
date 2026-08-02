package com.vk.newsfeed.impl.items.posting.item.modals;

import xsna.asp;
import xsna.zrp;

/* compiled from: PostingItemModel.kt */
/* loaded from: classes4.dex */
public interface PostingType {

    /* compiled from: PostingItemModel.kt */
    public static final class UserRedesigned implements PostingType {
        public final Onboarding a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PostingItemModel.kt */
        public static final class Onboarding {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Onboarding[] $VALUES;
            public static final Onboarding None;
            public static final Onboarding Post;
            public static final Onboarding Video;

            static {
                Onboarding onboarding = new Onboarding("None", 0);
                None = onboarding;
                Onboarding onboarding2 = new Onboarding("Post", 1);
                Post = onboarding2;
                Onboarding onboarding3 = new Onboarding("Video", 2);
                Video = onboarding3;
                Onboarding[] onboardingArr = {onboarding, onboarding2, onboarding3};
                $VALUES = onboardingArr;
                $ENTRIES = new asp(onboardingArr);
            }

            public Onboarding() {
                throw null;
            }

            public static Onboarding valueOf(String str) {
                return (Onboarding) Enum.valueOf(Onboarding.class, str);
            }

            public static Onboarding[] values() {
                return (Onboarding[]) $VALUES.clone();
            }
        }

        public UserRedesigned() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserRedesigned) && this.a == ((UserRedesigned) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "UserRedesigned(onboarding=" + this.a + ')';
        }

        public UserRedesigned(Onboarding onboarding) {
            this.a = onboarding;
        }

        public /* synthetic */ UserRedesigned(int i) {
            this(Onboarding.None);
        }
    }

    /* compiled from: PostingItemModel.kt */
    public static final class a implements PostingType {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1412849191;
        }

        public final String toString() {
            return "Original";
        }
    }

    /* compiled from: PostingItemModel.kt */
    public static final class b implements PostingType {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 353671398;
        }

        public final String toString() {
            return "Redesigned";
        }
    }
}
