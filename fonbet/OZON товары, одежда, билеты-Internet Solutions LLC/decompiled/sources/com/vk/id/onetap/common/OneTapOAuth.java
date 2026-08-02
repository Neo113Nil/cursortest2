package com.vk.id.onetap.common;

import Sc.o;
import Xc.a;
import Xc.b;
import com.vk.id.OAuth;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007j\u0002\b\u0004j\u0002\b\u0005¨\u0006\t"}, d2 = {"Lcom/vk/id/onetap/common/OneTapOAuth;", "", "<init>", "(Ljava/lang/String;I)V", "MAIL", DiscountCodeResponse.RESULT_OK, "toOAuth", "Lcom/vk/id/OAuth;", "Companion", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OneTapOAuth {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OneTapOAuth[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final OneTapOAuth MAIL = new OneTapOAuth("MAIL", 0);
    public static final OneTapOAuth OK = new OneTapOAuth(DiscountCodeResponse.RESULT_OK, 1);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/onetap/common/OneTapOAuth$Companion;", "", "<init>", "()V", "fromOAuth", "Lcom/vk/id/onetap/common/OneTapOAuth;", "oAuth", "Lcom/vk/id/OAuth;", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OAuth.values().length];
                try {
                    iArr[OAuth.VK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OAuth.MAIL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OAuth.OK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OneTapOAuth fromOAuth(@NotNull OAuth oAuth) {
            Intrinsics.checkNotNullParameter(oAuth, "oAuth");
            int i11 = WhenMappings.$EnumSwitchMapping$0[oAuth.ordinal()];
            if (i11 == 1) {
                return null;
            }
            if (i11 == 2) {
                return OneTapOAuth.MAIL;
            }
            if (i11 == 3) {
                return OneTapOAuth.OK;
            }
            throw new o();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneTapOAuth.values().length];
            try {
                iArr[OneTapOAuth.MAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneTapOAuth.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OneTapOAuth[] $values() {
        return new OneTapOAuth[]{MAIL, OK};
    }

    static {
        OneTapOAuth[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
    }

    private OneTapOAuth(String str, int i11) {
    }

    public static OneTapOAuth valueOf(String str) {
        return (OneTapOAuth) Enum.valueOf(OneTapOAuth.class, str);
    }

    public static OneTapOAuth[] values() {
        return (OneTapOAuth[]) $VALUES.clone();
    }

    @NotNull
    public final OAuth toOAuth() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return OAuth.MAIL;
        }
        if (i11 == 2) {
            return OAuth.OK;
        }
        throw new o();
    }
}
