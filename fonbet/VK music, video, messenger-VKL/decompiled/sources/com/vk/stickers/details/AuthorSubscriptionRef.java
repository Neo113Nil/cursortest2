package com.vk.stickers.details;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthorSubscriptionRef.kt */
/* loaded from: classes6.dex */
public final class AuthorSubscriptionRef {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthorSubscriptionRef[] $VALUES;
    public static final AuthorSubscriptionRef AUTOTESTS;
    public static final a Companion;
    public static final AuthorSubscriptionRef PACK_DETAILS;
    public static final AuthorSubscriptionRef PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS;
    public static final AuthorSubscriptionRef PACK_RECOMMENDATIONS_AUTHOR_PACKS;

    /* compiled from: AuthorSubscriptionRef.kt */
    public static final class a {

        /* compiled from: AuthorSubscriptionRef.kt */
        /* renamed from: com.vk.stickers.details.AuthorSubscriptionRef$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1793a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AuthorSubscriptionRef.values().length];
                try {
                    iArr[AuthorSubscriptionRef.AUTOTESTS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AuthorSubscriptionRef.PACK_DETAILS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AuthorSubscriptionRef.PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AuthorSubscriptionRef.PACK_RECOMMENDATIONS_AUTHOR_PACKS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    static {
        AuthorSubscriptionRef authorSubscriptionRef = new AuthorSubscriptionRef("AUTOTESTS", 0);
        AUTOTESTS = authorSubscriptionRef;
        AuthorSubscriptionRef authorSubscriptionRef2 = new AuthorSubscriptionRef("PACK_DETAILS", 1);
        PACK_DETAILS = authorSubscriptionRef2;
        AuthorSubscriptionRef authorSubscriptionRef3 = new AuthorSubscriptionRef("PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS", 2);
        PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS = authorSubscriptionRef3;
        AuthorSubscriptionRef authorSubscriptionRef4 = new AuthorSubscriptionRef("PACK_RECOMMENDATIONS_AUTHOR_PACKS", 3);
        PACK_RECOMMENDATIONS_AUTHOR_PACKS = authorSubscriptionRef4;
        AuthorSubscriptionRef[] authorSubscriptionRefArr = {authorSubscriptionRef, authorSubscriptionRef2, authorSubscriptionRef3, authorSubscriptionRef4};
        $VALUES = authorSubscriptionRefArr;
        $ENTRIES = new asp(authorSubscriptionRefArr);
        Companion = new a();
    }

    public AuthorSubscriptionRef() {
        throw null;
    }

    public static AuthorSubscriptionRef valueOf(String str) {
        return (AuthorSubscriptionRef) Enum.valueOf(AuthorSubscriptionRef.class, str);
    }

    public static AuthorSubscriptionRef[] values() {
        return (AuthorSubscriptionRef[]) $VALUES.clone();
    }
}
